import kotlin.reflect.full.valueParameters

fun main(args: Array<String>){
    var obj = Employee::class//:: class literal
    println(obj.isAbstract)
    println(obj.isData)

    var obj1 = Employee::calculate
    println(obj1.visibility)
    println(obj1.valueParameters)

    var obj3 = Employee::name
    println(obj3.get(Employee()))
}