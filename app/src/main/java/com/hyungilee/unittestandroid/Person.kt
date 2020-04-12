package com.hyungilee.unittestandroid

class Person(val name: String) {
    //나이
    var age: Int = 0

    //이름
//    val name: String
    //생성자에서 이름을 받는다.
//    constructor(name: String){
//        this.name = name
//    }

    var nickname: String = ""
        set(value) {
            // field는 Setter의 대상이 되는 field를 의미
            field = value.toLowerCase()
        }

    var address: String = ""
        set(value) {
            field = value.toUpperCase()
        }
}
