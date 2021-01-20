package com.example.stackandqueue.models

import java.util.*

class MyQueue() {

    /** Initialize your data structure here. */
    var ints: Stack<Int> = Stack<Int>()

    /** Push element x to the back of queue. */
    fun push(x: Int) {
        ints.add(x)
    }

    /** Removes the element from in front of queue and returns that element. */
    fun pop(): Int {
        var x: Int = ints.firstElement()
        ints.remove(ints.firstElement())
        return x
    }

    /** Get the front element. */
    fun peek(): Int {
        return ints.firstElement()
    }

    /** Returns whether the queue is empty. */
    fun empty(): Boolean {
        return ints.isEmpty()
    }
    fun ToString(): String {
        var result: String = ""
        ints.forEach{x -> result += ("$x ") }
        return result
    }
}

/**
 * Your com.example.stackandqueue.models.MyQueue object will be instantiated and called as such:
 * var obj = com.example.stackandqueue.models.MyQueue()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.peek()
 * var param_4 = obj.empty()
 */