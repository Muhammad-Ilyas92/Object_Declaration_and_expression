// Is m aik class ka aik he object ban paye
//us k multiple objects na ban payen
//classes ko restrict krte hien k us ka aik he object ban paye
//EXAMPLE : how many Liking or sharing on social media

fun main() {


    SharingWidgets.incrementtwitterlike()
    SharingWidgets.incrementtwitterlike()
    SharingWidgets.incrementfblike()
    SharingWidgets.incrementfblike()
    SharingWidgets.incrementfblike()

    SharingWidgets.display()
}

object SharingWidgets {
    private var twitterlikes = 0
    private  var fblikes = 0

    fun incrementtwitterlike() = twitterlikes++
    fun incrementfblike() = fblikes++

    fun display() = println("Faceboook:  ${SharingWidgets.fblikes}  Twitter:  ${SharingWidgets.twitterlikes}")
}