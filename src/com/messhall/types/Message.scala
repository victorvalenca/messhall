package com.messhall.types

/**
 * Message represents a thread reply or original post. 
*/
class Message (tid: Long, aid: Long, tb: String, ts: Long = System.currentTimeMillis/1000L, rid: Long = None){
    val threadId: Long = tid
    val authorId: Long = aid
    val threadBody: String = tb
    val timestamp: Long = ts
    val replyId = rid

}