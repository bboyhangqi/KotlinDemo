package com.oop.inharitance

fun main(args: Array<String>) {

}

abstract class A {


    abstract var name:String

    open fun speak(){

    }

    fun sleep(){

    }

    abstract fun eat()
}

class B: A() {
    override var name: String = "ZhaoHangQi"


    override fun eat() {
    }


    override fun speak() {
        super.speak()
    }

}