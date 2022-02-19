fun main(args: Array<String>){
    var map1 = mapOf<Int,String>(101 to "jason", 102 to "vida", 103 to "sam") //immutable map method must use "to" keyword to map key to value
    // mutable map methods
    var map2 = HashMap<Int,String>()
    var map3 = hashMapOf<Int,String>(101 to "jason", 102 to "vida", 103 to "sam")
    var map4 = mutableMapOf<Int,String>(101 to "jason", 102 to "vida", 103 to "sam")
        //insert values into a map
        //map1.put[]//not possible for immutable
    map3.put(104, "ben")
    map3.remove(101)
    println("${map3.keys}")
    println("${map3.values}")

        //insert values into HashMap
    map2.put(102, "sariah")
    map2.put(103, "nancy")

    for (e in map2)
        print(e)
}