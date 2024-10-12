package com.example.text
//this is lambda function

fun uppercaseStrinig(string:String): String{
    return string.uppercase()
}

fun main(){
    uppercaseStrinig("hello")
    println({string: String -> string.uppercase()}("hello"))
}