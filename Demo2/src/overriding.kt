open class Employee{
    var compnay: String = "Infosys"
    var bounus: Int = 2000
    fun salary(){
        println("All the employee's have received a bomus")
    }

    class SystemEngineer: Employee{
        var basicSalary: Int = 36000
        var salary: Int = basicSalary + bounus
        override fun salary(){
            println("The salary of System Engineer is $salary")
        }
    }

    class SeniorSystemEngineer: Employee{
        var basicSalary: Int = 5000
        var salary: Int = basicSalary + bounus
        override fun salary(){
            println("The salary of Senior System Engineer is $salary")
        }
    }
}

fun main(args: Array<String>){
    val obj = Employee()
    obj.salary()
    val obj1 = SystemEngineer()
    obj1.salary()
    val obj2 = SeniorSystemEngineer()
    obj2.salary()
}