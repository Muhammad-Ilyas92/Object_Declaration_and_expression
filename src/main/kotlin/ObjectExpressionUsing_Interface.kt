//Anonymouse object hm n object ki madad s bnaya

fun main ()
{
  var obj = object : Cloneable  //here how we make anonymous object
  {
      override fun clone() {
        println("I am Clone")
      }
  }
    obj.clone()
}
interface Cloneable {
    fun clone()
    {

    }
}