package com.myapp.kotlinbasics

import kotlin.math.pow

//fun addition(a:Int, b:Int):Int{
//    return a+b
//}

fun addition(a:Double, b:Double):Double{
    return a+b
}

fun power(a:Double, b:Double):Double = a.pow(b)

fun main(){
//    println(addition(2,5))
//    println(addition(2.5,5.2))
    //named arguments
//    println(addition(b=12, a=4))
    //storing fxn in variables
    var fn = ::addition
    println(fn(1.0,2.0))
    fn=::power
    println(fn(2.0,3.0))
}