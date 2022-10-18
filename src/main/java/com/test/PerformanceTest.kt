package com.test

import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.launch

fun main() = runBlocking { // this: CoroutineScope
    launch { 
      
        val start = System.nanoTime()
		for (i in 1..1_000_000) {
		}
		println("elapsd time :" + (System.nanoTime() - start) /  1_000 / 1_000 + " ms")
    }
    println("Programme End") 
}