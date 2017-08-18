package com.data.inheritance

/**
 * Created by CodingHome on 18/08/2017.
 */
class Son : People , FunInterface{

    var age = 0

    init {
        println("Son is already initiated")
    }

    constructor(_name: String, _age: Int) : super(_name) {
        this.age = _age
    }

    constructor(_name: String) : super(_name)

    override fun speek() = println("i am son , my name is $name ")

    fun playGames() = println("i like play games")

    override fun doExercises() {
    }
}
