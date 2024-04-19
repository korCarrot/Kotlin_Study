fun main() {
    var a=5
    var b=6

    var bigger=if (a > b) {
        println("hi")
        a
    } else {
        println("hi")
        b
    }
    println(bigger)

   var bigger2= if(a>b) a else b
    println(bigger2)

//    한 줄만 가능
//    var bigger3= if(a>b) a print("hi") else b
//    println(bigger3)

//    var bigger4= a>b? a:b
//    println(bigger4)


}