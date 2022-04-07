package com.myapp.kotlinbasics

import java.util.*

class Calculator{
    lateinit var message:String        //to be initialise later
                                        //lateinit can be used only-->> var, String not for val , float Int, Boolean
    fun add(a: Int, b:Int):Int{
        return a+b
    }

    fun multiply(a:Int, b:Int):Int{
        return a*b
    }
}

//getters and setters
class Pers(nameparam:String, ageParam:Int){
    var name:String = nameparam
        get() {
            return field.uppercase(Locale.getDefault())
        }
    var age:Int = ageParam
    set(value) {
        if (value>0){
            field=value
        }
        else{
            println("Age cannot be negative")
        }
    }
    var email:String = ""
    get() = field
    set(value) {
        field = value
    }
}

fun main(){
    var obj = Calculator()
    println(obj.add(5,8))

    var p1 = Pers("hritik",21)
    println(p1.name)
    p1.age = 18
    var p2 = Pers("vissi",20)
    println(p2.age)
}