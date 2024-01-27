/*
 * This file is generated by jOOQ.
 */
package com.drinkit.security.generated.jooq.tables


import com.drinkit.security.generated.jooq.Public
import com.drinkit.security.generated.jooq.indexes.USER_COMPLETED_IDX
import com.drinkit.security.generated.jooq.indexes.USER_EMAIL_IDX
import com.drinkit.security.generated.jooq.indexes.USER_ENABLED_IDX
import com.drinkit.security.generated.jooq.keys.ROLE__FK_USER
import com.drinkit.security.generated.jooq.keys.USER_PKEY
import com.drinkit.security.generated.jooq.tables.Role.RolePath
import com.drinkit.security.generated.jooq.tables.records.UserRecord

import java.time.LocalDate
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
import org.jooq.UniqueKey
import org.jooq.impl.DSL
import org.jooq.impl.Internal
import org.jooq.impl.SQLDataType
import org.jooq.impl.TableImpl


/**
 * This class is generated by jOOQ.
 */
@Suppress("UNCHECKED_CAST")
open class User(
    alias: Name,
    path: Table<out Record>?,
    childPath: ForeignKey<out Record, UserRecord>?,
    parentPath: InverseForeignKey<out Record, UserRecord>?,
    aliased: Table<UserRecord>?,
    parameters: Array<Field<*>?>?,
    where: Condition?
): TableImpl<UserRecord>(
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
         * The reference instance of <code>public.user</code>
         */
        val USER: User = User()
    }

    /**
     * The class holding records for this type
     */
    override fun getRecordType(): Class<UserRecord> = UserRecord::class.java

    /**
     * The column <code>public.user.id</code>.
     */
    val ID: TableField<UserRecord, String?> = createField(DSL.name("id"), SQLDataType.VARCHAR(24).nullable(false), this, "")

    /**
     * The column <code>public.user.firstname</code>.
     */
    val FIRSTNAME: TableField<UserRecord, String?> = createField(DSL.name("firstname"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.user.lastname</code>.
     */
    val LASTNAME: TableField<UserRecord, String?> = createField(DSL.name("lastname"), SQLDataType.VARCHAR(100), this, "")

    /**
     * The column <code>public.user.birthdate</code>.
     */
    val BIRTHDATE: TableField<UserRecord, LocalDate?> = createField(DSL.name("birthdate"), SQLDataType.LOCALDATE, this, "")

    /**
     * The column <code>public.user.email</code>.
     */
    val EMAIL: TableField<UserRecord, String?> = createField(DSL.name("email"), SQLDataType.VARCHAR(255).nullable(false), this, "")

    /**
     * The column <code>public.user.password</code>.
     */
    val PASSWORD: TableField<UserRecord, String?> = createField(DSL.name("password"), SQLDataType.VARCHAR(100).nullable(false), this, "")

    /**
     * The column <code>public.user.lastconnection</code>.
     */
    val LASTCONNECTION: TableField<UserRecord, LocalDateTime?> = createField(DSL.name("lastconnection"), SQLDataType.LOCALDATETIME(6), this, "")

    /**
     * The column <code>public.user.completed</code>.
     */
    val COMPLETED: TableField<UserRecord, Boolean?> = createField(DSL.name("completed"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>public.user.enabled</code>.
     */
    val ENABLED: TableField<UserRecord, Boolean?> = createField(DSL.name("enabled"), SQLDataType.BOOLEAN.nullable(false), this, "")

    /**
     * The column <code>public.user.modified</code>.
     */
    val MODIFIED: TableField<UserRecord, LocalDateTime?> = createField(DSL.name("modified"), SQLDataType.LOCALDATETIME(6).nullable(false), this, "")

    private constructor(alias: Name, aliased: Table<UserRecord>?): this(alias, null, null, null, aliased, null, null)
    private constructor(alias: Name, aliased: Table<UserRecord>?, parameters: Array<Field<*>?>?): this(alias, null, null, null, aliased, parameters, null)
    private constructor(alias: Name, aliased: Table<UserRecord>?, where: Condition?): this(alias, null, null, null, aliased, null, where)

    /**
     * Create an aliased <code>public.user</code> table reference
     */
    constructor(alias: String): this(DSL.name(alias))

    /**
     * Create an aliased <code>public.user</code> table reference
     */
    constructor(alias: Name): this(alias, null)

    /**
     * Create a <code>public.user</code> table reference
     */
    constructor(): this(DSL.name("user"), null)

    constructor(path: Table<out Record>, childPath: ForeignKey<out Record, UserRecord>?, parentPath: InverseForeignKey<out Record, UserRecord>?): this(Internal.createPathAlias(path, childPath, parentPath), path, childPath, parentPath, USER, null, null)

    /**
     * A subtype implementing {@link Path} for simplified path-based joins.
     */
    open class UserPath : User, Path<UserRecord> {
        constructor(path: Table<out Record>, childPath: ForeignKey<out Record, UserRecord>?, parentPath: InverseForeignKey<out Record, UserRecord>?): super(path, childPath, parentPath)
        private constructor(alias: Name, aliased: Table<UserRecord>): super(alias, aliased)
        override fun `as`(alias: String): UserPath = UserPath(DSL.name(alias), this)
        override fun `as`(alias: Name): UserPath = UserPath(alias, this)
        override fun `as`(alias: Table<*>): UserPath = UserPath(alias.qualifiedName, this)
    }
    override fun getSchema(): Schema? = if (aliased()) null else Public.PUBLIC
    override fun getIndexes(): List<Index> = listOf(USER_COMPLETED_IDX, USER_EMAIL_IDX, USER_ENABLED_IDX)
    override fun getPrimaryKey(): UniqueKey<UserRecord> = USER_PKEY

    private lateinit var _role: RolePath

    /**
     * Get the implicit to-many join path to the <code>public.role</code> table
     */
    fun role(): RolePath {
        if (!this::_role.isInitialized)
            _role = RolePath(this, null, ROLE__FK_USER.inverseKey)

        return _role;
    }

    val role: RolePath
        get(): RolePath = role()
    override fun `as`(alias: String): User = User(DSL.name(alias), this)
    override fun `as`(alias: Name): User = User(alias, this)
    override fun `as`(alias: Table<*>): User = User(alias.qualifiedName, this)

    /**
     * Rename this table
     */
    override fun rename(name: String): User = User(DSL.name(name), null)

    /**
     * Rename this table
     */
    override fun rename(name: Name): User = User(name, null)

    /**
     * Rename this table
     */
    override fun rename(name: Table<*>): User = User(name.qualifiedName, null)

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Condition?): User = User(qualifiedName, if (aliased()) this else null, condition)

    /**
     * Create an inline derived table from this table
     */
    override fun where(conditions: Collection<Condition>): User = where(DSL.and(conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(vararg conditions: Condition?): User = where(DSL.and(*conditions))

    /**
     * Create an inline derived table from this table
     */
    override fun where(condition: Field<Boolean?>?): User = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(condition: SQL): User = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String): User = where(DSL.condition(condition))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg binds: Any?): User = where(DSL.condition(condition, *binds))

    /**
     * Create an inline derived table from this table
     */
    @PlainSQL override fun where(@Stringly.SQL condition: String, vararg parts: QueryPart): User = where(DSL.condition(condition, *parts))

    /**
     * Create an inline derived table from this table
     */
    override fun whereExists(select: Select<*>): User = where(DSL.exists(select))

    /**
     * Create an inline derived table from this table
     */
    override fun whereNotExists(select: Select<*>): User = where(DSL.notExists(select))
}
