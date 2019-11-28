package com.mtsahakis.linkedlist

import com.mtsahakis.udemy.oo.isEven

class Node(val data: Int) {
    var next: Node? = null
}

class LinkedList {

    val length: Int
        get() = sizeWithRecursion(head)

    var head: Node? = null

    fun add(node: Node) {
        node.next = head
        head = node
    }

    fun print() {
        var current = head
        while (current != null) {
            print("${current.data}")
            current = current.next?.also {
                print(", ")
            }
        }
        println()
    }

    fun getLastNode(index: Int): Node? {
        var fast = head
        var slow = head

        var count = 1
        while (fast != null) {
            fast = fast.next
            count++

            if (count > index) {
                slow = slow?.next
            }
        }

        return slow
    }

    fun getMiddleNode(): Node? {
        var fast = head
        var slow = head

        var count = 0
        while (fast != null) {
            fast = fast.next
            count++

            if (count.isEven()) {
                slow = slow?.next
            }
        }

        return slow
    }

    private fun sizeWithIteration(): Int {
        if (head == null) {
            return 0
        }

        var size = 0
        var current = head
        while (current != null) {
            size++
            current = current.next
        }
        return size
    }

    private fun sizeWithRecursion(current: Node?): Int {
        if (current == null) {
            return 0
        }
        return 1 + sizeWithRecursion(current.next)
    }
}

fun main() {
    val myList = LinkedList()
    myList.add(Node(5))
    myList.add(Node(4))
    myList.add(Node(8))
    myList.add(Node(3))
    myList.print()
    println(myList.length)
}