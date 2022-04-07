package com.myapp.kotlinbasics

open class Mobile(val type:String){
    open val name:String = ""
    open val size : Int = 5
    fun makeCall() = println("Calling from mobile")
    fun powerOff() = println("Shutting Down")
    open fun display() = println("Simple Mobile Display")
}

class OnePlus(typeParam:String): Mobile(typeParam){
    override val name:String = "OnePlus"
    override val size:Int = 6
    override fun display() {
        super.display()
        println("OnePlus display")
    }

    override fun toString(): String {
        return "OnePlus(name='$name', size=$size)"
    }


}

fun main(){
    var oneplus = OnePlus("Smartphone")
    oneplus.display()
    var generalMobile = Mobile("General")
    generalMobile.display()
    println(oneplus.toString())
}