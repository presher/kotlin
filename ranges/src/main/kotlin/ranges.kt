

fun main(args: Array<String>){
//    for (a in 1..5){
//        println(a)// prints ranges form 1 to 5
//    }

//    for(a in 'A' .. 'D'){
//        println(a)// prints ranges form A to D
//    }

//    for(b in 'A'.rangeTo('E'))
//        println(b)// prints range from A to E

//    for(c in 5 downTo 1)
//        println(c)// prints values from 5 to 1

//    if(11 in 1..10)// checks if value is in the specified range
//        println("Yes 5 is in the range 1 to 10")
//    else
//        println("Not in the range 1 to 10")

    for(e in 1..10 step 2)//each iteration will advance two steps then print
        println(e)
    /* output
      1
      3
      5
      7
      9
    */
}