package basilisk.models

import org.jetbrains.exposed.sql.Table
import java.util.*

data class User(val uuid: UUID, val name: String, val userName: String, val password: String)

object Users : Table() {
    val id = uuid("id").autoGenerate().entityId()
    val name = varchar("name", 128)
    val userName = varchar("user_name", 64)
    val password = varchar("password", 255)

    override val primaryKey = PrimaryKey(id)
}