package com.mtsahakis.test.performance

import com.mtsahakis.performance.PrimitiveLoop
import com.mtsahakis.performance.averageOnIntArray
import com.mtsahakis.performance.averageOnIntList
import org.junit.Test

class PrimitiveTest {

    @Test
    fun testCounts() {
        var now = System.currentTimeMillis()
        PrimitiveLoop.primitiveCount()
        val primitiveCountTimeElapsed = System.currentTimeMillis() - now
        println("Primitive Count Time Elapsed: $primitiveCountTimeElapsed")

        now = System.currentTimeMillis()
        PrimitiveLoop.objectCount()
        val objectCountTimeElapsed = System.currentTimeMillis() - now
        println("Object Count Time Elapsed: $objectCountTimeElapsed")
        println("Diff Time Elapsed: ${objectCountTimeElapsed - primitiveCountTimeElapsed}")
    }

    @Test
    fun testAverage() {
        var now = System.currentTimeMillis()
        averageOnIntArray()
        val averageOnIntArrayTimeElapsed = System.currentTimeMillis() - now
        println("Primitive Int Array Average Time Elapsed: $averageOnIntArrayTimeElapsed")

        now = System.currentTimeMillis()
        averageOnIntList()
        val averageOnIntListTimeElapsed = System.currentTimeMillis() - now
        println("Object Int List Average Time Elapsed: $averageOnIntListTimeElapsed")
        println("Diff Time Elapsed: ${averageOnIntListTimeElapsed - averageOnIntArrayTimeElapsed}")
    }


}