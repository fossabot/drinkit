package com.drinkit.domain.cellar

import com.drinkit.domain.user.User
import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.stereotype.Service

@Service
class DeleteCellar(
    private val cellarWriteRepository: CellarWriteRepository,
    private val cellarReadRepository: CellarReadRepository,
) {
    private val logger = KotlinLogging.logger { }
    operator fun invoke(cellarId: CellarId, connectedUser: User) {
        val cellar = cellarReadRepository.findById(cellarId) ?: throw IllegalStateException("Cellar not found")

        if (connectedUser.isCellarOwner(cellar) || connectedUser.isAdmin) {
            logger.info { "Removing cellar $cellarId, author: ${connectedUser.id}" }
            cellarWriteRepository.delete(cellarId)
        } else {
            throw IllegalStateException("Not authorized to delete cellar $cellarId")
        }
    }

    private fun User.isCellarOwner(cellar: Cellar): Boolean = id == cellar.owner
}