package com.myapp.kotlinbasics

fun main() {
//    var score =5
//    score=10
//    val message="Hello Kotlin"
//    println(score)
//    print(message)
    /*DATA TYPES
    INTEGER(Byte,Short,Int,Long)
    FLOATING POINT(Float,Double)
    BOOLEAN(True,False)
    CHARACTER(Char,String)
     */
    /*var score:Int=12
    var temp : Double=89.4
    var isRainig: Boolean= false
    var message : String = "hello"
    var character : Char= 'A'*/

//    var i = 13
//    var j = 2

//    println(i + j)
//    println(i - j)
//    println(i * j)
//    println(i / j)         //integer division
//    println(i.toFloat() / j)   //typecasting
//    println(i % j)

    //RELATIONAL OPERATOR
//    println(i > j)
//    println(i < j)
//    println(i >= j)         //integer division
//    println(i <= j)   //typecasting
//    println(i != j)   //typecasting


    //LOGICAL OPERATORS
    //&& AND
    //|| OR
    // ! NOT
    val above70 = false
    val knowsprogramming = false
    val callforinterview = above70 && knowsprogramming
    println(callforinterview)

    //SHORT CIRCUITING
    var i = 10
    var j = 11
    var result = i == 10 || j++ == 11

    println(i)
    println(j)

    var result1 = i == 11 || j++ == 11
    println(i)
    println(j)
}