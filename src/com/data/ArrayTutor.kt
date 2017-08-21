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
        println("element in arrayIntByListOf : " + element)
    }

    var arrayIntSpecific = 0..5 step 2

    for (element in arrayIntSpecific) {
        println("element in arrayIntSpecific : " + element)
    }

    for (element in arrayIntSpecific) {
        if (element and element in arrayIntByListOf) println("element in arrayIntSpecific : " + element)
    }


    var arrayList = ArrayList<String>()
    arrayList.add("a")
    arrayList.add("b")
    arrayList.add("c")
    arrayList.add("d")

    var arrayList2 = listOf<String>("a", "b", "c", "d")


    println("if arrayList equals to arrayList2 ${arrayList.equals(arrayList2)}")
    println("if a in arrayList ${"a" in arrayList}")
    println("if arrayList contain b ${arrayList.contains("b")}")

    var arrayList3 = arrayListOf("a", "b", "c")
    arrayList3[0] = "a"


    var array4 = mutableListOf<String>()
    array4.add(0,"v")
    array4.add(1,"n")
    for (element in array4){
        println("element in array4 $element")
    }
    //difference between listOf nad  arrayListOf
    //the Array made from listOf is immutable so arrayList2[0] = "v" is invalid , arrayList3 is ok
    //fi you want to get mutable Array , please use

}