package com.myapp.kotlinbasics

//Arrays
//var arr = arrayOf("one","two","three")
fun main(){
    var arr= arrayOf("One","Two","Three")
    var arr1= arrayOf(1,2,3)
    var arr2= arrayOf<Int>(9,8,7)
    println(arr[2])
//    for (i in arr) print("$i ")
//    for ((i,e) in arr.withIndex()) println("Element at arr[$i] is $e")
//    println(arr1.get(2))
//    println(arr.set(1,"hello"))
    val size=arr.size-1
    
    for(i in 0..size){
        print(arr[i]+" ")
        print(arr1[i].toString() + " ")
    }
}