//fun main() {
//    var str1: String = "Hello"
//    var str2 = "World"
//    var str3 = "Hello"
//
//    println("str1 === str2: ${str1 === str2}")
//    println("str1 === str3: ${str1 === str3}")
//}

//fun main() {
//    var a = 1
//    val str1 = "a = $a" // String 자료형의 s1을 선언하고 초기화. 변수 a가 사용됨
//    val str2 = "a = ${a + 2}" // 문자열에 표현식 사용
//
//    println("str1: \"$str1\", str2: \"$str2\"")
//}

fun main() {
    var a: Int = "100".toInt()
    var b: Double = "100.123".toDouble()

    print("a: ${a}, b: ${b}")
}