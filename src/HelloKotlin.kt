fun main() {

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

    //fun main() {
    //    // 1, 2, 3 전부 동일한 코드
    //    // 1
    //    fun sum(a: Int, b: Int): Int {
    //        var sum = a + b
    //        return sum
    //    }
    //
    //    // 2
    //    fun sum2(a: Int, b: Int): Int = a + b
    //
    //    // 3
    //    fun sum3(a: Int, b: Int) = a + b
    //}

//    // 반환타입이 없는 경우 Unit
//    fun printSum(a: Int, b: Int): Unit {
//        println("sum of $a and $b is ${a + b}")
//    }

//    fun add(name: String, email: String = "email address") {
//        // name과 email을 회원 목록에 저장
//        // email의 기본값은 "email address". 즉, email로 넘어오는 값이 없으면 자동으로 "default" 입력
//    }

//    println(highFunc({x, y -> x + y}, 10, 20)) // 람다식 함수를 인자로 넘김

//    val res1 = sum(3, 2) // 일반 인자
//    val res2 = mul(sum(3,3), 3) // 인자에 함수를 사용
//
//    println("res1: $res1, res2: $res2")

//    // 아래 두개 동일 코드
//    var max: Int
//    if (a > b)
//        max = a
//    else
//        max = b
//
//    // -->
//    val max = if (a > b) a else b

//    val a = 12
//    val b = 7
//
//    // 블록과 함께 사용
//    val max = if(a > b) {
//        println("a 선택")
//        a // 마지막 식인 a가 반환되어 max에 할당
//    }
//    else {
//        println("b 선택")
//        b // 마지막 식인 b가 반환되어 max에 할당
//    }
//
//    println(max)

    val score = 100
    if (score in 80..100) {
        println("합격")
    } else {
        println("불합격")
   }


}

//fun highFunc(sum: (Int, Int) -> Int, a: Int, b: Int): Int = sum(a, b) // sum 매개변수는 함수
//fun sum(a: Int, b: Int): Int = a + b
//fun mul(a: Int, b: Int): Int = a * b