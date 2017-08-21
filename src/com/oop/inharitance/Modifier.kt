package com.oop.inharitance

fun main(args: Array<String>) {

    var child = Child()
    child.c
    child.d
    //child.b cannot get it
    //child.a cannot get it
}


open class Father {
    private var a = 1
    protected var b = 2
    internal var c = 3
    var d = 4


}

class Child: Father() {

    fun test(){
        //println(a) cannot get it
        println(b)
        println(c)
        println(d)
    }

}