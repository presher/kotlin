fun main(args: Array<String>){
    //Lists methods
    var list1 = listOf<String>("ram", "rohan", "jason")
    var list2 = mutableListOf<String>("ram", "rohan", "jason")
    var list3 = arrayListOf<String>("ram", "rohan", "jason")
    var list4 = ArrayList<String>(2)

    //list1.add //not possible to add to an immutable list
    //to add elements to a list the add method
    list2.add("vida")//adds to end of the list
    list2[1] = "sariah" // adds to the index position of 1
    list2.remove("ram") //element to remove for the list

    //add elemnts to an ArrayList that has been initialized
    list4.add("sam")
    list4.add("ben")

    //lists are iterable with a for loop
    for (e in list4)
        println(e)
}