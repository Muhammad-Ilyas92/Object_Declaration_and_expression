//object declaration m hm n object ko name diya tha
//object expression m hm object ko anonymous banayengay
//anonymous ka mtlab jiska koi object nh h


fun main ()   //EXAMPLE 1
{
    var testObj = object {    //yahan object k expression hein jiska koi name nh h, behind kotlin iski class or object bana dega
        var x:Int = 10
        fun testFun()
        {
            println("The vale of X: $x")
        }
    }

    println(testObj.testFun())
    println(testObj.x)
}

