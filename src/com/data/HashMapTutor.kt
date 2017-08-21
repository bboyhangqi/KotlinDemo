package com.data

fun main(args: Array<String>) {
    var map1: Map<String, String> = mapOf(Pair("a","aa"),Pair("b","bb"))

    for (key in map1.keys){
        println("element in map1 : ${map1.get(key)}")
    }

    var map2 = hashMapOf(Pair("a","aa"), Pair("b","bb"))
    map2.put("c","cc")
    for (key in map2.keys){
        println("element in map2 : ${map2.get(key)}")
    }

    // use keyword in to map means is it the key in the map , not value in the map
    println("if cc in map2 ${"b" in map2}")
    println("if cc in map2 ${"cc" in map2}")

}