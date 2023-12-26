package com.survivalcoding.kotlinbasic

import kotlin.random.Random
import kotlin.time.TimedValue

    const val num = 20 // <- 톰레벨 상수
for main(){
    print("Hello World")
    println("Hello World")
    var i : Int = 10
    var name : String = "응우옌"
    var point : Double = 3.3

    i =20 //재대입 가능
    num = 30 //재대입 불가
    var i = 10
    var l = 20L

    var name = "10"
    i = name.toInt()
    l = i.toLong()
    i = l.toInt()

    var name = "hello"
   print(name.uppercase())
    print(name.lowercase())
    print("제 이름은 ${name}입니다.")
    var i = 10
    var j = 20
    print(kotlin.math.max(i,j))
    val randomnumber = Random.nextInt(0,100)
    print(randomnumber)
    val reader = Scanner(System.'in')
    reader.nextInt()
    reader.next()
    if (i>10) {
        print("10보다 크다")
    }
    else if (i<10) {
        print("10보다 작다")
    }
    else {
        print("")
    }
    val result = if(i>10) true else false
    val items = mutableListOf(1,2,3,4,5)
    for(i in 0..(items.size-1)){
        print(items[i])
    }
    items.add(5)
    items.remove(3)
    val items = listOf(1,2,3)

    try{
        val item = items[4]
    }catch (e:Exception){
        print(e.message)
    }
}
//array
fun main(){
    val items = arrayOf(1,2,3)
    items[0] = 10

    try{
        val item = items[4]
    }catch(e:Exception){
        print(e.message)
    }
    //null safety
    val name : String? = null
    name = "응우옌"
    name = null
    var name2 : String =""

    if(name != null){
        name2 = name
    }

    name?. let{
        name2 = name
    }
    //함수
    print(sum(a = 10,b=20))
}


fun sum(a : Int, b: Int,c : Int = 0) = a+b+c


//클래스,getter,setter
fun main(){
    val john = person("John",20)
    val john2 = person("John",20)

    print(John == John2)
    print(john.name)
    print(john.age)
    print(John.hobby)
}

data class Person(//alt + enter -> put paramters로 정렬 가능
        val name: String, // val -> 수정불가
        var age: Int, // var -> 수정가능
){
    var hobby = "축구"
        private set
        get() = "취미" : $field
    init{
        print("init")
    }
    fun some(){
        hobby = "농구"
    }
}

//extends,interface,타입체크is,강제타입변환as
fun main(){
    val dog  = Dog()
    val cat = Cat()

    cat as Dog
    if(dog is Dog)
        println("강아지")
}

interface Drawable{
    fun draw()
}

abstract class Animal{
    open fun move(){
        print("이동")
    }
}

class Dog : Animal(),Drawable(){
    override fun move() {
        println("쿵")
    }

    override fun draw() {

    }
}
class Cat : Animal(),Drawable(){
    override fun move() {
        println("상큼")
    }

    override fun draw() {

    }
}

fun main{
    val box = Box(10)
    val box2 = Box("ddd")

    print(box.value)
}

class Box<T>(var value : T)


//콜백함수
fun main{

    myFunc(10) {
        println("함수 호출")
    }
}
suspend fun myFunc(a : Int ,callBack: ()-> Unit={}){
    println("함수시작")
    callBack()
    println("함수끗")
}

    suspend >> 정지함수 main을 suspend로 만들려면 코루틴 스코프 사용

