package com.messhall.types

/**
 * Thread represents a thread with the original post ID
 */
class Thread (tid: Int, ts: Int, oid: Int){
    val threadId: Int = tid
    val timestamp: Int = ts
    val opId: Int = oid
}