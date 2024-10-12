package com.example.text

class Motor()
        class Contact(val id:  Int, var email: String)
fun main(){
    val contact = Contact(1, "mary@gmail.com")
    //print the value of property email
    println(contact.email)

        // update the value of the property email
    contact.email = "jane@gmail.com"

        // prints the new value of the property email
    println(contact.email)
}