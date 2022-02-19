fun mailId(str: String): Unit{
    println("Email id is $str")
}

fun designation(str: String): Unit{
    println("Designation is ${str}")
}

fun employee(str: String, myFunc: (String) -> Unit){
    println("Employee name is Steve and his ")
    myFunc(str)
}

fun manager(basicSalary: Int): Int{
    var bonus: Int = (basicSalary *10)/100
    var salary: Int = basicSalary + bonus
    return salary;
}

fun employee1(): (Int) -> Int{
    println("Employee name is Steve and his salary is ")
    return ::manager
}

fun main(args: Array<String>){
//employee("Steve@infosys.com", ::mailId)
//    employee("Manager", ::designation)

    var result = employee1()
    var result1 = result(50000)
    println("$result1")
}