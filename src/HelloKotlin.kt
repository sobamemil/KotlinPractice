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

//fun main() {
//    var a: Int = "100".toInt()
//    var b: Double = "100.123".toDouble()
//
//    print("a: ${a}, b: ${b}")
//}

fun main() {
    // 1, 2, 3 전부 동일한 코드
    // 1
    fun sum(a: Int, b: Int): Int {
        var sum = a + b
        return sum
    }

    // 2
    fun sum2(a: Int, b: Int): Int = a + b

    // 3
    fun sum3(a: Int, b: Int) = a + b
}
