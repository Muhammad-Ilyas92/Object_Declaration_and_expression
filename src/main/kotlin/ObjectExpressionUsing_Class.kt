// hm clsas ka use kr k anonymous object k through
//person1 class ko hm object m override kr rhe


fun main()
{
    var obj2 = object : Person1("Ilyas") {

        override fun fullName() {
            super.fullName()  //agr y nh lkhogay to Full name: Ilyas nh ayega
            println("Anonymous: $name")
        }
    }

    obj2.fullName()
}

open class Person1 (val name:String){
    open fun fullName() = println("Ful name : $name")
}