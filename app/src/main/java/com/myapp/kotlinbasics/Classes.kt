package com.myapp.kotlinbasics

/*How to model a problem in OOPs
we identify the following:
Noun-->> Class -->> Employee
Adjective -->>Attributes-->> name,age,salary
verb-->> Methods -->> getsalary(), increament()
 */

class Car(val name: String, val type : String, var kmRan: Double){
    fun driveCar(){//methods
        println("$name Car is driving")
    }

    fun applyBreaks(){
        println("Applied breaks")
    }
}

class person(var name:String , var age:Int){
    fun canVote(){
        if(age>=18) println("$name may vote") else println("$name  cant vote")
    }
}

fun main(){
//    val mustang = Car("mustang","petrol",100.05)
//    val beetle = Car("Beetle","diesel",200.65)
//
//    println(mustang.name)
//    println(mustang.type)
//
//    println(beetle.name)
//    println(beetle.type)
//
//    mustang.driveCar()
//    beetle.driveCar()
    var a = person("Ajay", 25)
    var b = person("Kiran",16)
    a.canVote()
    b.canVote()
}