package com.example.app_ezwash.Models

class User (username : String,email:String , age: Int) {
    var username:String=""
    var email: String =""
    var age: Int=0
    init{
        this.username  =username
        this.email=email
        this.age=age
    }
}