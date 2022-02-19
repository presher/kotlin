fun main(args: Array<String>){
    var set1 = setOf<Int>(1,2,3,4,5)//immutable set
    //mutable set methods
    var set2 = hashSetOf<Int>(1,2,3,4,5)
    var set3 = mutableSetOf<Int>(1,2,3,4,5)

    //set1.add() not possible because immutable
    set2.add(6)// add elements to the set
    set2.remove(3)// remove elements from the set


    for (e in set2)
        println(e)
}