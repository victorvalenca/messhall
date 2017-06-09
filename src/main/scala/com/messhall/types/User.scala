package com.messhall.types

/**
 * User represents a user in the message board
*/
class User (uid: Long, uname: String, createTime: Long = System.currentTimeMillis/1000L){
    val userID: Long = uid // User's ID
    val username: String = uname // Username
    val createdAt: Long = createTime // UNIX timestamp for creation date

    /**
     * This is just a skeleton structure, and will have more properties as the project evolves
    */

}
