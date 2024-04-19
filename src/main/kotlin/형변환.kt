fun main(){

    //형 변환
    // 코틀린에서는 to변수()를 통해 형변환 가능

//    var num:Int=123
//    var num=123

//    1)숫자를 문자로 형변환
    var num:Int=123
    var str1:String=num.toString()
    println(str1)

    //타입 체크하는 연산자
    println(str1 is String)
    println(str1 !is String)

    //    2)문자를 숫자로 형변환
    var num1:Int=str1.toInt()
    println(num1)
    println(num1 is Int)

    var str2:String="75"
    println(str2.toInt()+1)

//    Exception in thread "main" java.lang.NumberFormatException: For input string: "호호"
//    var str3:String="호호"
//    println(str3.toInt())

    try {
        var str3: String = "호호"
        println(str3.toInt())

    } catch (e: Exception) {
        println("안됨")
    }


}