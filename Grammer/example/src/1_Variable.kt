var x = 5 //toplevel 변수

fun main() {
    x += 1
    println(x)

    //타입 명시
    val a: Int = 1

    //타입 생략
    val b = 1

    //지연 할당
    val c: Int
    c = 3

    val d: Int
    d = 123

    //val(value) read-only
//    val e: String = "Hello"
//    e = "World"

    //var(variable) read-write
//    var f = 123
//    f = "Hi"

}