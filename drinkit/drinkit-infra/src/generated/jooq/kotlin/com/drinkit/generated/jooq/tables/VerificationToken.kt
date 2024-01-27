/*
 * This file is generated by jOOQ.
 */
package com.drinkit.generated.jooq.tables


import com.drinkit.generated.jooq.Public
import com.drinkit.generated.jooq.indexes.VERIFICATION_TOKEN_USER_ID_IDX
import com.drinkit.generated.jooq.indexes.VERIFICATION_TOKEN_USER_ID_TOKEN_EXPIRY_DATE_IDX
import com.drinkit.generated.jooq.keys.VERIFICATION_TOKEN__FK_USER
import com.drinkit.generated.jooq.tables.User.UserPath
import com.drinkit.generated.jooq.tables.records.VerificationTokenRecord

import java.time.LocalDateTime

import kotlin.collections.Collection
import kotlin.collections.List

import org.jooq.Condition
import org.jooq.Field
import org.jooq.ForeignKey
import org.jooq.Index
import org.jooq.InverseForeignKey
import org.jooq.Name
import org.jooq.Path
import org.jooq.PlainSQL
import org.jooq.QueryPart
import org.jooq.Record
import org.jooq.SQL
import org.jooq.Schema
import org.jooq.Select
import org.jooq.Stringly
import org.jooq.Table
import org.jooq.TableField
import org.jooq.TableOptions
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class VerificationToken(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, VerificationTokenRecord>?,
    parentPath: InverseForeignKey<out Record, VerificationTokenRecord>?,
    aliased: Table<VerificationTokenRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<VerificationTokenRecord>(
    alias,
    Public.PUBLIC,
    path,
    childPath,
    parentPath,
    aliased,
    parameters,
    DSL.comment(""),
    TableOptions.table(),
    where,
) {
    companion object {

        /**
         * The reference instance of <code>public.verification_token</code>
         */
        val VERIFICATION_TOKEN: VerificationToken = VerificationToken()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<VerificationTokenRecord> = VerificationTokenRecord::class.java

    /**
     * The column <code>public.verification_token.user_id</code>.
     */
    val USER_ID: TableField<VerificationTokenRecord, String?> = createField(DSL.name("user_id"), SQLDataType.VARCHAR(24).nullable(false), this, "")

    /**
     * The column <code>public.verification_token.token</code>.
     */
    val TOKEN: TableField<VerificationTokenRecord, String?> = createField(DSL.name("token"), SQLDataType.VARCHAR(100).nullable(false), this, "")

    /**
     * The column <code>public.verification_token.expiry_date</code>.
     */
    val EXPIRY_DATE: TableField<VerificationTokenRecord, LocalDateTime?> = createField(DSL.name("expiry_date"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<VerificationTokenRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<VerificationTokenRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<VerificationTokenRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.verification_token</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.verification_token</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.verification_token</code> table reference
     */
    constructor(): this(DSL.name("verification_token"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, VerificationTokenRecord>?, parentPath: InverseForeignKey<out Record, VerificationTokenRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, VERIFICATION_TOKEN, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class VerificationTokenPath : VerificationToken, Path<VerificationTokenRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, VerificationTokenRecord>?, parentPath: InverseForeignKey<out Record, VerificationTokenRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<VerificationTokenRecord>): super(alias, aliased)
        override fun `as`(alias: String): VerificationTokenPath = VerificationTokenPath(DSL.name(alias), this)
        override fun `as`(alias: Name): VerificationTokenPath = VerificationTokenPath(alias, this)
        override fun `as`(alias: Table<*>): VerificationTokenPath = VerificationTokenPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIndexes(): List<Index> = listOf(VERIFICATION_TOKEN_USER_ID_IDX, VERIFICATION_TOKEN_USER_ID_TOKEN_EXPIRY_DATE_IDX)
    override fun getReferences(): List<ForeignKey<VerificationTokenRecord, *>> = listOf(VERIFICATION_TOKEN__FK_USER)

    private lateinit var _user: UserPath

    /**
     * Get the implicit join path to the <code>public.user</code> table.
     */
    fun user(): UserPath {
        if (!this::_user.isInitialized)
            _user = UserPath(this, VERIFICATION_TOKEN__FK_USER, null)

        return _user;
    }

    val user: UserPath
        get(): UserPath = user()
    override fun `as`(alias: String): VerificationToken = VerificationToken(DSL.name(alias), this)
    override fun `as`(alias: Name): VerificationToken = VerificationToken(alias, this)
    override fun `as`(alias: Table<*>): VerificationToken = VerificationToken(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): VerificationToken = VerificationToken(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): VerificationToken = VerificationToken(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): VerificationToken = VerificationToken(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): VerificationToken = VerificationToken(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): VerificationToken = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): VerificationToken = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): VerificationToken = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): VerificationToken = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): VerificationToken = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): VerificationToken = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): VerificationToken = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): VerificationToken = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): VerificationToken = where(DSL.notExists(select))
}
