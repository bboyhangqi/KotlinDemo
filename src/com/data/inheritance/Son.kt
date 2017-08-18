package com.data.inheritance

/**
 * Created by CodingHome on 18/08/2017.
 */
class Son(_name: String, _age: Int) : People(_name, _age) , FunInterface{
    override fun doExercises() = println("i am bboy , i like hiphop dance")

    constructor() : this("Son" , 20)

    override fun speek() = println("My name is $name , i am $age years old")

    fun playGames() = println("i like play games")

    override var name: String = "ZhaoMingMing"

}