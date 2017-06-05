package com.messhall.types

/**
 * Message represents a thread reply or original post. 
*/
class Message (tid: Int, aid: Int, tb: String, ts: Long, rid: Int = None){
    val threadId: Int = tid
    val authorId: Int = aid
    val threadBody: String = tb
    val timestamp: Long = ts
    val replyId = rid

}