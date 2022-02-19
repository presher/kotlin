data class Employee(var company: String = "Infosys"){
    //Relection
    var name = "Jason"
    open fun calculate(basicSalary: Int, bonus: Int): Int{
        return basicSalary + bonus
    }
}