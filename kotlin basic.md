kotlin basic
--
코틀린의 코루틴에 대해 더 알아보기

1~2강
--

    fun main() = runBlocking{//쓰레드 블로킹{
        val job = GlobalScope.launch{
          delay(1000L) //<suspend 일시중단 함수
          println("world")
    }
    launch{ //structed concurrency를 사용하면 GlobalScope없이 가능
        delay(1000L) //<suspend 일시중단 함수
        myWorld()
    }
    suspend fun myWorld() {
      println("Hello")
      job.join()
      }

    }

    //코루틴이 쓰레드보다 좋다는 코드
    fun main() = runBlocking{
        repeat(100_100){
            lauth{
                delay(1000L)
                print(".")
            }
        }
    }

    fun main() = runBlocking{
        repeat(100_100){
            println("I'm sleeping $i...")
            delay(500L)
        }
        delay(1300L)
    }

    fun main() = runBlocking{
        lauth{
            repeat(5){ i->
                println("Coroutine A , $i")
            }
        }
        lauth{
            repeat(5){ i->
                println("Coroutine B , $i")
            }
        }
        println("Coroutin Outer")
    }


    통합
    Coroutin builder
        lauth
        runBlocking
    Scope
        CoroutineScope
        GlobalScope
    Suspend function
        suspend
        delay()
        join()
    Suspend concurrency
