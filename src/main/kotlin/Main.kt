
fun main(){
    val mother = Human("Julie",36,75)
    mother.eat(5)
    println(mother.weight)
    mother.speak("I am Jullie ")
    mother.birthday()

    val user1 = User("Tonny","Blaire","blairet001@gmail.com","0716617687","hhduiujfd#GH@")
    val user2 = User("Richard","Maina","richiemwa001@gmail.com","0724967799","uddjfHJ5@!JJn")
    println(user1.fistName)
    println(user2.email)
    println(user1.phoneNumber)
    println(user2.lastName)
    println(user1.password)
}



class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight = weight + foodWeight
    }
    fun speak(speech:String){
    name  = speech
    }
    fun birthday(){
        age = age + 1
    }
}

data class User(var fistName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String)
