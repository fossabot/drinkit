/*
 * This file is generated by jOOQ.
 */
package com.drinkit.generated.jooq.keys


import com.drinkit.generated.jooq.tables.Cellar
import com.drinkit.generated.jooq.tables.User
import com.drinkit.generated.jooq.tables.records.CellarRecord
import com.drinkit.generated.jooq.tables.records.UserRecord

import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// UNIQUE and PRIMARY KEY definitions
// -------------------------------------------------------------------------

val CELLAR_PKEY: UniqueKey<CellarRecord> = Internal.createUniqueKey(Cellar.CELLAR, DSL.name("cellar_pkey"), arrayOf(Cellar.CELLAR.ID), true)
val USER_PKEY: UniqueKey<UserRecord> = Internal.createUniqueKey(User.USER, DSL.name("user_pkey"), arrayOf(User.USER.ID), true)
