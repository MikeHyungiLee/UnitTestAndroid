package com.hyungilee.unittestandroid

import org.junit.Assert
import org.junit.Test

class KotlinTest {

    @Test
    fun test2(){
        Assert.assertEquals(4, 2+2)
    }

    @Test
    fun testGetterSetter(){

        val person = Person("john")
        person.age = 20
        Assert.assertEquals(20, person.age)
        Assert.assertEquals("john", person.name)

        // nickname을 set한 뒤에,
        person.nickname = "Banana"
        // 대문자가 포함된 문자열이 소문자로 되었는지 확인한다.
        Assert.assertEquals("banana", person.nickname)
    }

    @Test
    fun testUser(){
        val user = User()
        user.nickname = "death Note"
        Assert.assertEquals("DEATH NOTE", user.nickname)
    }

    @Test
    fun testUserLazy(){
        val user = User()
        println("not init")
        Assert.assertNotNull(user.httpText)
    }

    @Test
    fun testUserNameObservable(){
        val user = User()
        user.name = "john"
        user.name = "james"
    }

    @Test
    fun testAnimalByMap(){
        // Animal 객체를 생성할때 맵 객체를 넘긴다.
        val animal = Animal(mutableMapOf("name" to "cat", "age" to 20))

        //name 속성이 map객체에 정상적으로 위임되었는지 확인
        Assert.assertEquals("cat", animal.name)
        //age 속성이 map객체에 정상적으로 위임되었는지 확인
        Assert.assertEquals(20, animal.age)

        //프로퍼티의 값을 변경한다.
        animal.age = 21
        animal.name = "dog"

        //map 의 값들이 바뀌었는지 확인
        Assert.assertEquals("dog", animal.map["name"])
        Assert.assertEquals(21, animal.map["age"])
    }

    @Test
    fun testFruit(){
        // 객체의 속성 값을 같도록 Fruit 객체 2개를 생성
        val fruit1 = Fruit("바나나", "바나나 길어")
        val fruit2 = Fruit("바나나", "바나나 길어")

        // 각각 프린트한다. toString()메소드가 호출된다.
        println(fruit1)
        println(fruit2)

        // 두 객체가 같은지 비교한다. equals() 호출됨.
        Assert.assertEquals(fruit1, fruit2)

        // 두 객체의 해시코드가 같은지 비교한다.
        Assert.assertEquals(fruit1.hashCode(), fruit2.hashCode())
    }
}