package com.myapp.kotlinbasics

import java.util.*

fun main(){
    var reader = Scanner(System.`in`)
    println("Enter number 1: ")
    var a = reader.nextInt()
    println("Enter number 2: ")
    var b = reader.nextInt()
    println(a+b)
    println("Enter your name: ")
    var c = readLine()
    print("${c?.toUpperCase()} is my name")
}