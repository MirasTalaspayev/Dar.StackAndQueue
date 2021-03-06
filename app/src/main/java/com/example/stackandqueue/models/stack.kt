package com.example.stackandqueue.models

import java.util.*

class MyStack() {

    /** Initialize your data structure here. */
    var ints: Queue<Int> = LinkedList<Int>()

    /** Push element x onto stack. */
    fun push(x: Int) {
        ints.add(x)

    }

    /** Removes the element on top of the stack and returns that element. */
    fun pop(): Int {
        var x: Int = ints.last()
        ints.remove(ints.last())
        return x
    }

    /** Get the top element. */
    fun top(): Int {
        return ints.last()
    }

    /** Returns whether the stack is empty. */
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
 * Your com.example.stackandqueue.models.MyStack object will be instantiated and called as such:
 * var obj = com.example.stackandqueue.models.MyStack()
 * obj.push(x)
 * var param_2 = obj.pop()
 * var param_3 = obj.top()
 * var param_4 = obj.empty()
 */