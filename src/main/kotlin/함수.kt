import java.util.Objects

fun main(){

    //1
    fun f1(){
        println("hi")
    }

    f1()

    //2
    fun f2(gift:String){
        println(gift)
    }

    f2("사탕")

    //3
    fun f3():String {
        return "사과"
    }

    var gift1=f3()
    println(gift1)

    //4
    fun f4(gift:String):String {
       println(gift)
        return "사과"
    }

    var gift2=f4("과자")
    println(gift2)


//  조상 객체
    fun f5(): Any{
        return "사과"
    }

    println(f5())

    fun f6(): Any{
        return arrayOf(1,2,3)
    }

    var arr1=f6() as Array<Int>
    println(arr1[0])
    for (i in arr1) {
        println(i)
    }


    //리턴 타입이 뒤에
fun test(x:Int, y:Int): Int{
    return x+y
}

var result1=test(10,20)
println(result1)

//리턴값이 없으면 뒤에 리턴값 적지 않기
fun test1(x:Int, y:Int) {
    println("test1 " + "${x+y}")
}

test1(1,2)

//  입력값은 없고 반환값만 있음
fun test2(): Double{
    return 3.14525
}

val PI = test2()
println("${PI}")



    fun ho(x:Int):Int{
        var a= 0
        for (i in 0..x){
                a+=i
        }
        return a
    }

    var hoho=ho(3)
    println(hoho)
}