var lambda = {basicSalary: Int, bonus: Int -> (basicSalary * bonus) / 100}


fun employee(lmd: (Int, Int) -> Int){
    var result: Int = lmd(40000, 10)
    println("Employee got 10% bonus that is $result dollars")
}

fun main(args: Array<String>){
//    employee(lambda)

    var result = 0
    println("result before $result")
    var lambda = {basicSalary:Int, bonus: Int -> result = (basicSalary * bonus) / 100}
    lambda(20000, 10)
    println("The value of result has changes form 0 to $result")
}
