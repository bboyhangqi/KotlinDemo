package com.data

/**
 * Created by CodingHome on 21/08/2017.
 */
fun main(args: Array<String>) {
    var arrayInt = Array<Int>(5) { 1 }
    println("Array[4] = " + arrayInt.get(4)) // print 1

    for (element in arrayInt) {
        println("element : " + element)
    }

    var arrayIntByListOf = listOf<Int>(1, 2, 3, 4)

    for (element in arrayIntByListOf) {
        println("element in arrayIntByListOf : "+element)
    }

    var arrayIntSpecific = 0..5 step 2

    for (element in arrayIntSpecific){
       println("element in arrayIntSpecific : "+element)
    }

    for (element in arrayIntSpecific){
        if(element and element in  arrayIntByListOf) println("element in arrayIntSpecific : "+element)
    }


}