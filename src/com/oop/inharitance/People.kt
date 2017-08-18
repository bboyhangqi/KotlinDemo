package com.data.inheritance

/**
 * Created by CodingHome on 18/08/2017.
 */

open class People(open var name: String, open var age: Int) {

    constructor() : this("Human", 10000)

    open fun speek() = println("my name is ${name} , i am $age years old")

}
