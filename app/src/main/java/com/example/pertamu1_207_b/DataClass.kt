package com.example.text
//data class
data class DataClass(
    val id: Int,
    var email: String
)

fun main(){
    val data = DataClass(1, "indra@gmail.com")
    println(data)

    var data2 = DataClass(2,"makan@gmail.com")
    println(data ==  data2) //false

    val data3 = data.copy()
    println(data3)

  val data4 = data.copy(email = "sahar@gmail.com")
    println(data4)

}