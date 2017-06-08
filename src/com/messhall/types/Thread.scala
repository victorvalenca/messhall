package com.messhall.types

/**
 * Thread represents a thread with the original post ID
 */
class Thread (tid: Long, ts: Long = System.currentTimeMillis/1000L, oid: Long){
    val threadId: Long = tid
    val timestamp: Long = ts
    val opId: Long = oid
}