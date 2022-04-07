package com.myapp.kotlinbasics

//SYNTAX
//fun functionname(parameter1, parameter2, ...):ReturnType{
//    Block of statements
//    return result
//}

//fun add(num1:Int, num2:Int):Int{
//    val sum = num1 + num2
//    return sum
//}
//INLINE FUNCTIONS
fun add(num1:Int, num2:Int)=num1+num2

fun binexp(num1:Int, num2: Int):Int{
    if (num2==0)return 1
    var temp = binexp(num1,num2/2)
    if (num2%2==0) return temp*temp
    return temp*temp*num1
}

fun evenORodd(num: Int){
    var result = if (num%2==0) "EVEN" else "ODD"
    println(result)
}

fun printmessage(count:Int=2){
    for(i in 1..count) println("hello $i")
}

fun main(){
//    println(add(1,5))
//    var c = add(12,45)
//    println(c)
//    var power = binexp(5,3)
//    println("5 to the power 3 is $power")
//    evenORodd(25)
    printmessage()
    printmessage(5)
}