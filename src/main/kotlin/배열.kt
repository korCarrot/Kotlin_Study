fun main() {

//    var arr=Array(3)  <-타입을 정해주어야 함
    var intArr = IntArray(3)
    println(intArr)

    println("${intArr[0]},${intArr[1]},${intArr[2]}")
    intArr[0]=1
    intArr[1]=2
    intArr[2]=3
    println("${intArr[0]},${intArr[1]},${intArr[2]}")

//    println(intArr[0] + intArr[1] + intArr[2])

//    println(${intArr[0]})
//    println(intArr[0] + intArr[1] + intArr[2])

    //배열 선언과 할당을 한 번에
//    var intArr2=IntArray(3){4,5,6}
    var intArr2= arrayOf(3,4,5)
    println("${intArr2[0]},${intArr2[1]},${intArr2[2]}")

    for (v in intArr2) {
        print(v)
        print(v is Int)
    }

    // 배열 요소 타입 정한 후 배열 선언과 할당을 한 번에
    var intArr3= intArrayOf(6,7,8)

    for (v in intArr3) {
        println(v)
        print(v is Int)
    }

    for (i in 1..10 step 2) {
        print(i)
    }

    var strArr= arrayOf("1", "2")
    println(strArr[0])

//    배열 요소 타입 정한 후 선언과 할당을 한 번에
    var strArr1= arrayOf("가나", "다라", "마바")
    for(v in strArr1){
        println(v)
    }


    }