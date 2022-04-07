package com.myapp.kotlinbasics

/*Polymorphism
Poly means Many & Morph means Form
In computer science , it is defined as - method name is same but it will behave differently based on the object
 */
/*INHERITANCE & POLYMORPHISM
*IS-A relationship (Circle is a Shape)
* So wherever Shape is required , we can any of subclasses i.e. we can easily pass Circle, Square or Triangle.Because
they all inherit from shape.
 */

//We can pass Circle,Square,Triangle, where Shape is required BUT
//we cannot pass Shape Object where Circle is required.Because all shapes are not circle.

open class Shapes{
    open fun area():Double{
        return 0.0
    }

    override fun toString(): String {
        return "I am shape"
    }
}

class Circles(val radius:Double):Shapes(){
    override fun area():Double{
        return Math.PI*radius*radius
    }
}

fun main(){
    val circle = Circles(4.0)
    println(circle.toString())            //Compiler first find method in Circle class if not found,then it will find in its respective
                                          //superclasses i.e., then Shapes class --> then Any class
}