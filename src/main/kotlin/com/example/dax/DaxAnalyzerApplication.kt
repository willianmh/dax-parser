package com.example.dax

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MyDaxAnalyzerApplication

fun main(args: Array<String>) {
    runApplication<MyDaxAnalyzerApplication>(*args)
}