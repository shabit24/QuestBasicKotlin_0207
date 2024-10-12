package com.example.text

fun nullSafety(){
    var neverNull: String = "This can't be null"

    var nullable: String? = "You can keep a null here"

    nullable = null

    if(neverNull == null){
        println("InferreNonNull is null")
    }else{
        println("InterferredNonNull is not null")
    }

    println(neverNull.length)
    println(nullable?.length)

    fun strLength(notNull: String): Int {
        return notNull.length
    }
    println(strLength(neverNull))
}
fun main(){
    nullSafety()
}