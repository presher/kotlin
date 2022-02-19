import kotlin.jvm.internal.Ref
import kotlin.reflect.jvm.internal.impl.resolve.constants.IntValue

class Employee1(age: Int){
    var age = age
    init{
        this.age = age
        println(age)
    }
}

class Employee2<T>(age1: T){
    var age1: T = age1
    init{
        this.age1 = age1
        println(age1)
    }
}

fun main(args: Array<String>){
    var age : Employee1 = Employee1(65)
    try {
        //var senior: Employee1 = Employee1("")//will not accept any data type other that Int
    }catch (e: TypeCastException){
        println(e)
    }


    var age1: Employee2<Int> = Employee2<Int>(65)
    var senior1: Employee2<String> = Employee2<String>("Is a senior associate")

}