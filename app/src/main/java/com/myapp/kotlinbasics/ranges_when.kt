package com.myapp.kotlinbasics

fun main() {
    val num = 5
    val result = num in 1..5  //1,2,3,4,5
    val res = num in 1 until 5   //1,2,3,4   5 is not included
    println(result)
    println(res)
    val animal = "Dog"
//    when(animal){
//        "Horse" -> println("Animal is horse")
//        "cat" -> println("Animal is cat")
//        "Dog" -> println("Animal is dog")
//        "lion" -> println("Animal is lion")
//        else -> println("No animal found")
//    }
    val show = when(animal){
        "Horse" -> "Animal is Horse"
        "Lion" -> "Animal is Lion"
        "Cat" -> "Animal is Cat"
        "Dog" -> "Animal is Dog"
        else -> "No Animal found"
    }
    println(show)
    val number = 15
    val give = when(number){
        11 -> "Eleven"
        12 -> "Twelve"
        in 13..19 -> "Teen"
        else -> "NO NUMBER"
    }
    println(give)
}