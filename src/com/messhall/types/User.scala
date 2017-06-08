package com.messhall.types

/**
 * User represents a user in the message board
*/
class User (uid: Long, uname: String, createTime: Long = System.currentTimeMillis/1000L){
    val userID: Long = uid
    val username: String = uname
    val createdAt: Long = createTime

}