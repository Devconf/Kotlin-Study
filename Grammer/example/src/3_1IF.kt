fun main() {
    //if..else 사용
    val job = "Software Developer"

    if (job == "Software Developer") {
        println("개발자")
    } else {
        println("개발자아님")
    }

    //코틀린의 if..else는 표현식이다
    val age: Int = 10

    val str = if (age == 10) {
        "성인"
    } else {
        "아이"
    }

    //코틀린은 삼항연산자가 없다. if..else가 표현식이므로 불필요하다.
    val a = 1
    val b = 2
    val c = if (b > a) b else a

    //코틀린은 특별히 엘비스 연산자가 존재한다. 
    // not-null ?: null  연산자의 왼쪽을 수행한 결과가 null이 아닐 경우 결과를 반환하고, null일 경우 연산자의 오른쪽을 반환한다.
    val str1: String? = "1234"
    val nullStr: String? = null

    var len: Int = str1?.length ?: -1
    println("str.length: $len")

    len = nullStr?.length ?: -1
    println("nullStr.length: $len")

    //엘비스 연산자 예제 not-null 일경우
    foo(Node("철수"))

    //엘비스 연산자 예제 null 일 경우
    foo(Node())
}

class Node(private val name: String? = null) {
    fun getName(): String? = name
}


fun foo(node: Node) {
    val name = node.getName() ?: throw IllegalArgumentException("name expected")
    println("내 이름은 $name 입니다.")
}