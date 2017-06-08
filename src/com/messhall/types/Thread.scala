package com.messhall.types

/**
 * Thread represents a thread with the original post ID
 */
class Thread (tid: Long, ts: Long = System.currentTimeMillis/1000L, oid: Long){
    val threadId: Long = tid // The ID for the thread
    val timestamp: Long = ts // UNIX timestamp
    val opId: Long = oid // The ID for the first post (This also links to the author's message)
}