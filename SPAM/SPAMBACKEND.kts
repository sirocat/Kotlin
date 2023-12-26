package com.survivalcoding.kotlinbasic

import kotlin.random.Random

//    const val num = 20
for main(){
//    print("Hello World")
//    println("Hello World")
//    var i : Int = 10
//    var name : String = "응우옌"
//    var point : Double = 3.3

//    i =20 재대입 가능
//    num = 30 재대입 불가
//    var i = 10
//    var l = 20L
//
//    var name = "10"
//    i = name.toInt()
//    l = i.toLong()
//    i = l.toInt()

//    var name = "hello"
////    print(name.uppercase())
////    print(name.lowercase())
//    print("제 이름은 ${name}입니다.")
//    var i = 10
//    var j = 20
//    print(kotlin.math.max(i,j))
//    val randomnumber = Random.nextInt(0,100)
//    print(randomnumber)
//    val reader = Scanner(System.'in')
//    reader.nextInt()
//    reader.next()
//    if (i>10) {
//        print("10보다 크다")
//    }
//    else if (i<10) {
//        print("10보다 작다")
//    }
//    else {
//        print("")
//    }
//    val result = if(i>10) true else false
//    val items = mutableListOf(1,2,3,4,5)
//    for(i in 0..(items.size-1)){
//        print(items[i])
//    }
//    items.add(5)
//    items.remove(3)
    val items = listOf(1,2,3)

    try{
        val item = items[4]
    }catch (e:Exception){
        print(e.message)
    }
}