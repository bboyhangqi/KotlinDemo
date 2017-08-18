package com.data

/**
 * Created by CodingHome on 18/08/2017.
 */
fun main(args: Array<String>) {
    var a1: String = "123"
    var a2: String? = "123"
    var a3 = a1
    //a3 = a2  this is invaild , because a2 maybe assign to null
    var a4: String? = a2


    var b: Int? = a1 as? Int // assign null to b , because a1 is not the Int type
    println("b: $b")


    // ?: means if a2 is null , it will assign the str after ?: to another var
    var b2:String = a2 ?: "234"
    println("b2: $b2")

    a2 = null
    b2 = a2 ?: "234"
    println("b2: $b2")
}