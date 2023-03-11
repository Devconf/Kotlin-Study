/*
예외처리

- 코틀린의 모든 예외 클래스는 최상위 예외 클래스인 Throwable을 상속한다.

Throwable
    - Error : 시스템에 비정상적인 상황이 발생. 예측이 어렵고 기본적으로 복구가 불가능함
        - Unchecked error : ex) OutOfMemoryError, StackOverFlowError,etc
    - Exception : 시스템에서 포착 가능하여(try-catch)복구 가능. 예외처리 강제제
        - RuntimeException
            - Unchecked exception
        -
            - Checked exception : try-catch로 처리하거나 throw로 전파해야함

            #코틀린은 Checked exception을 강제하지 않기 때문에 컴파일 오류가 발생하지 않는다.
 */

fun main() {
    //컴파일 오류 발생하지 않음
    Thread.sleep(1)

    //try-catch 사용가능
    try {
        Thread.sleep(1)
    } catch (e: Exception) {
        println("에러 발생!")
    }

    //try 또는 catch 가 수행되었을때 마지막으로 수행할 코드를 finalㅣy에 작성할수 있다.
    try {
        throw Exception()
    } catch (e: Exception) {
        println("에러 발생!")
    } finally {
        println("finally 실행!")
    }

    //코틀린에서 try-catch는 표현식
    val a = try {
        "1234".toInt()
    } catch (e: Exception) {
        println("예외 발생!")
    }

    println(a)

    //throw Exception("예외 발생!")

    //코틀린에서 Nothing 타입을 반환하게되면 그 이후에 나오는 코드는 실행되지않음
    failFast("예외발생")

    println("이 메시지는 출력될까?")

}

fun failFast(message: String): Nothing { //코드가 정상적으로 수행하는것이 보장이 안될경우 Nothing 타입 반환
    throw IllegalArgumentException(message)
}
