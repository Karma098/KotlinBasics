package com.myapp.kotlinbasics

//INHERITENCE
open class Parent{
    init {
        println("Parent constructor is called")
    }
    val name : String = ""

    fun myMethod(){
        println("I m in Parent")
    }
}

class Child : Parent() {
    init {
        println("Child constructor is called")
    }
    val name2 : String = ""

    fun myMethod2(){
        println("I m in child")
    }
}

fun main(){
    var obj = Child()
    obj.myMethod()
    obj.myMethod2()
}