class Employee3<out T>(val age: T){
    fun get(): T{
        return age
    }
}
class Employee4<in T>(val age: String){
    fun get(): String{
        return age.toString()
    }
}

class Sample{
    fun add(a:Int,b:Int,sum:(Int,Int)->Int){
        var res = sum(a,b)
        println("Result is $res")
    }
}

fun main(args: Array<String>){
//val ref: Employee3<String> = Employee3(("Senior most in the CO"))
//    val ref2: Employee3<Any> = ref
//    println(ref.age)
//
//    val ref3: Employee4<Any> = Employee4(("Senior most in the CO"))
//    val ref4: Employee4<String> = ref3
//    println(ref3.age)




        var sample = Sample()
        sample.add(6,8,{a,b ->a+b})

}