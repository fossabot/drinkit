/*
 * This file is generated by jOOQ.
 */
package com.drinkit.generated.jooq.keys


import com.drinkit.generated.jooq.tables.Cellar
import com.drinkit.generated.jooq.tables.Role
import com.drinkit.generated.jooq.tables.User
import com.drinkit.generated.jooq.tables.records.CellarRecord
import com.drinkit.generated.jooq.tables.records.RoleRecord
import com.drinkit.generated.jooq.tables.records.UserRecord

import org.jooq.ForeignKey
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val CELLAR_PKEY: UniqueKey<CellarRecord> = Internal.createUniqueKey(Cellar.CELLAR, DSL.name("cellar_pkey"), arrayOf(Cellar.CELLAR.ID), true)
val USER_PKEY: UniqueKey<UserRecord> = Internal.createUniqueKey(User.USER, DSL.name("user_pkey"), arrayOf(User.USER.ID), true)

// -------------------------------------------------------------------------
// FOREIGN KEY definitions
// -------------------------------------------------------------------------

val ROLE__FK_USER: ForeignKey<RoleRecord, UserRecord> = Internal.createForeignKey(Role.ROLE, DSL.name("fk_user"), arrayOf(Role.ROLE.USER_ID), com.drinkit.generated.jooq.keys.USER_PKEY, arrayOf(User.USER.ID), true)