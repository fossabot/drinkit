/*
 * This file is generated by jOOQ.
 */
package com.drinkit.generated.jooq.indexes


import com.drinkit.generated.jooq.tables.Cellar

import org.jooq.Index
import org.jooq.impl.DSL
import org.jooq.impl.Internal



// -------------------------------------------------------------------------
// INDEX definitions
// -------------------------------------------------------------------------

val CELLAR_OWNER_ID_IDX: Index = Internal.createIndex(DSL.name("cellar_owner_id_idx"), Cellar.CELLAR, arrayOf(Cellar.CELLAR.OWNER_ID), false)
