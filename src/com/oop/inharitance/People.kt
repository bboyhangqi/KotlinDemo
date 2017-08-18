package com.data.inheritance

/**
 * Created by CodingHome on 18/08/2017.
 */

open class People {

    open var name = ""

    init {
        println("People is already initiated")
    }

    constructor(_name: String) {
        this.name = _name
    }


    open fun speek() = println("I am a people")

}
