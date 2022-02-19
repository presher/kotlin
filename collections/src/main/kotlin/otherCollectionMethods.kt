fun main(args: Array<String>){
    //filter method
    var names = listOf<String>("jason", "vida", "sam", "ben", "sariah")
    var filteredList = names.filter { it.length > 4 }
    println(filteredList)

    //grouping methods
    val list = names.groupBy ( keySelector = {it.first()}, valueTransform = {it.uppercase()} )
    println(list)

    val list1 = names.groupByTo(LinkedHashMap(), keySelector = {it.first()}, valueTransform = {it.uppercase()})
    list1['j']?.add("nancy")
    println(list1)

    val list2 = names.groupingBy { it.first() }.eachCount()
    println(list2)

    //apply method
    data class Beverages(var name1: String, var name2: String, var name3: String)
        var obj = Beverages("coffee", "tea", "juice")
        println(obj)
        obj.apply{ this.name2 = "green tea"}
        println(obj)

    //with method
    with(obj){
        name1 = "cold coffee"
        name2 = "ginger tea"
    }
    print("with method $obj")

    //all method
    var number = listOf<Int>(1,2,3,4,5,6)
    var list3 = number.all { it > 5 }
    println("\nall method $list3")

    //any method
    var list4 = number.any{it >= 5}
    println("\nany method $list4")

    //count method
    var list5 = number.count { it > 5 }
    println("\ncount method $list5")
}