package com.mtsahakis.coroutines

import kotlinx.coroutines.*
import java.util.concurrent.ExecutorService
import java.util.concurrent.Executors
import kotlin.concurrent.thread

fun main() {
//    coroutinesPrint()
//    threadPrint()

//    runBlocking {
//        val result = doTask()
//        println("Thread: ${Thread.currentThread()} result: $result")
//    }
//    println("Thread: ${Thread.currentThread()} Done")

//    runBlocking {
//        singleThreadDispatcher()
//    }
//    println("Done")

    printWithDispatchers()
}

fun coroutinesPrint() = runBlocking {
    // create 100_000 coroutines and print "."
    val start = System.currentTimeMillis()
    repeat(100_000) {
        launch {
            print(".")

            if (it == 99_999) {
                val execution = System.currentTimeMillis() - start
                println()
                println("execution: $execution")
                println("Thread: ${Thread.currentThread()}")
            }
        }
    }
}

fun threadPrint() = runBlocking {
    // create 100_000 coroutines and print "."
    val start = System.currentTimeMillis()
    repeat(100_000) {
        thread {
            print(".")

            if (it == 99_999) {
                val execution = System.currentTimeMillis() - start
                println()
                println("execution: $execution")
                println("Thread: ${Thread.currentThread()}")
            }
        }
    }
}

// simulate some compute sensitive task
suspend fun task1(): Int {
    delay(2000)
    return 10
}

// simulate some compute sensitive task
suspend fun task2(): Int {
    delay(2000)
    return 10
}

suspend fun doTask() = coroutineScope {
    val result1 = async { task1() }
    val result2 = async { task2() }
    result1.await() + result2.await()
}

var counter = 0

suspend fun singleThreadDispatcher() {
    val ec: ExecutorService = Executors.newSingleThreadExecutor()
    val dispatcher: ExecutorCoroutineDispatcher = ec.asCoroutineDispatcher()
    val scope = CoroutineScope(dispatcher)
    val jobs = mutableListOf<Job>()

    repeat(1000) {
        jobs += scope.launch {
            println("counter is $counter")
            counter += 1
        }
    }
    jobs.joinAll()
    println("jobs are done")
}

fun printWithDispatchers() = runBlocking {
    val scope = CoroutineScope(Dispatchers.Default)
    val result = scope.launch {
        // 2. do some cpu bound operations, runs on Default thread pool
        println("${Thread.currentThread().name} doing CPU work...")

        // 3. shifts to IO thread pool
        withContext(Dispatchers.IO) {
            // 4. do some io operations like file read, network calls  etc
            println("${Thread.currentThread().name} doing IO work...")
        }

        // 5. shifts back to Default thread pool
        println("${Thread.currentThread().name} back to doing CPU work...")
    }

    result.join()
}

