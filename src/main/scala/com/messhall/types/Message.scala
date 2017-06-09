package com.messhall.types

/**
 * Message represents a thread reply or original post. 
*/
class Message (tid: Long, aid: Long, tb: String, ts: Long = System.currentTimeMillis/1000L, rid: Long = 0){
    val threadId: Long = tid // The thread the message belongs to
    val authorId: Long = aid // The author of the message
    val threadBody: String = tb // Self-explanatory
    val timestamp: Long = ts // UNIX timestamp
    val replyId: Long = rid // If the message is replying to another in a thread, this will have an ID, otherwise it's just None

}
