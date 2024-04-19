fun main() {

//    Kotlin에는 Java와 유사한 switch문이 없습니다. 대신 Kotlin은 when 표현식을 사용

    //    문법
//    when(파라미터){
//    비교값1->{}
//    비교값2->{}
//    else -> {}
//    }

    var test=1
    when(test){
        1 -> println("hi")
        2 -> println("hoho")
    }


//   in 숫자..숫자 를 하면 자동으로 벙뮈가 생성됨

    var score : Int=70

    when(score){
        in 90..100 ->{
            println("A")
        }

        in 80..89 ->{
            println("B")
        }

        in 70..79 ->{
            println("C")
        }

        in 60..69 ->{
            println("D")
        }

    }

    var menu:String="간짜장"
    when(menu){
        "짜장", "간짜장" -> { println("1000원") }
        "짬뽛", "백짬뽕" -> {println("2000원")}

        else -> {
            println("3000원")
        }
    }


}