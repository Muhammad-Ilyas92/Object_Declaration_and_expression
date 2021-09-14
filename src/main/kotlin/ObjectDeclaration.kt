//is m directly object bana skte hien OBJECT ka keyword lkh k
//is m hamien class declare nh krni parti hm direct object banatay hein
//object aik he usse type ka banega
//same type k multiple object nh bana skte
//apko multiple object banaay hein to class define kr do
// agr aik he object banana h to object keyword ko use kr lengay
//is m aik he object ban skta h to no need of constructor
//Init block use krt skte hien

fun main ()
{
    println(A.num)
    B.test()
}
//hm n yahan 2 object banaye or usay main function m print krwaya
// this is OBJECT DECLARATION
object A{
    val num: Int = 10
}

object B {
    fun test ()
    {
        println("i am object B")
    }
}