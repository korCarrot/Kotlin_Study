fun main(){
//
//    //1)
//    if(true){
//        println("hi")
//    }
//
//    //2)
//    if(true){
//        println("hi")
//    }else{
//        println("hi#")
//    }

        //3)
    if(false){
        println("1")
    }else if(false){
        println("2")
    }else{
        println("3")
    }


//    in
    println(1 in 1..10)
    println(0 in 1..10)

//    반복(i자리에 다른게 들어가도 가능)
    for (i in 1..10){
    print(i)
    }

var result=1
    while (result<100)
    {result+=result}
    println("while " + "${result}")

    for (index in 0..1000) {
        if(index>999){
            println("for" + "${index}")
        }
    }


    for (i in 1..100){
        println(i)
    }

    var test=1
    while (test<100) {
        println(test)
        test+=1
        if(test==99){ break}
    }




}