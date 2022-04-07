package com.myapp.kotlinbasics

class AutoMobile(val name:String, val tyres:Int, val maxSeating:Int, val engineType:String){
    init {
        println("$name is created")
    }
//    var airBags = hashAirBags
    init {
        println("2nd initialiser block")
    }
    constructor(namPara:String, enginePara:String):this(namPara,4,5,enginePara)
    fun drive(){}
    fun applyBreaks(){}
}

class Empty{}

class Person(nameParam:String, ageParam:Int){
    val name:String = "$nameParam - clan"
    var age:Int = ageParam
    var canVote:Boolean = ageParam>=18
}

fun main(){
    var car = AutoMobile("Car","petrol")
    var car2 = AutoMobile("Car2", "Diesel")

    var person = Person("A",21)
    println(person.canVote)
    println(person.name)
    var person2 = Person("B",17)
    println(person2.name)
    println(person2.canVote)
}