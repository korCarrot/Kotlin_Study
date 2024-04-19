fun main() {

//    컬렉션(List, Set, Map)
    var li1=listOf(5,3,4)
    println(li1)

    var li2=listOf("짜장","짬뽕","볶음밥")
    println(li2)
    println(li2[0])
//    li2[0]="짜장"
//    값 변경할 수 있다. (mutable)
    var li3=mutableListOf("짜장","짬뽕","볶음밥", 1)
    li3[0]="짜"
    println(li3)

    var li4=mutableListOf<String>("짜장","짬뽕","볶음밥")
    li4[0]="짜"
    println(li4)

}