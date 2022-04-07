package com.myapp.kotlinbasics

import java.lang.Math.PI

open class Shape{
    open fun area():Double{
        return 0.0
    }
}

class Circle(val radius:Double):Shape(){
    override fun area():Double{
        return PI * radius * radius
    }
}

class Square(val side:Double):Shape(){
    override fun area():Double{
        return side*side
    }
}

class triangle(val base:Double, val height:Double):Shape(){
    override fun area():Double{
        return 0.5*base*height
    }
}

fun calculateArea(shapes:Array<Shape>){
    for(shape in shapes){
        println(shape.area())
    }
}

fun main(){
//    val circle:Circle = Circle(4.0)
//    val square:Square = Square(4.0)
    val circle:Shape = Circle(4.0)
    val square:Shape = Square(4.0)
//Polymorphism
//Parent can hold a reference to its child
//parent can call methods of child classes(which are common)

//    println(circle.area())
//    println(square.area())

    val shapes = arrayOf(Circle(3.0), Circle(4.0),Square(4.0),triangle(3.0,4.0))
    calculateArea(shapes)
}