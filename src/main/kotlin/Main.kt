//1.Create a class called Human with these attributes: name, age, weight. It has the following functions:
//eat(foodWeight: Int) :Prints “I am eating {foodWeight} kgs of food” and increments the human’s weight by the weight of the food eaten (3 points)
//speak(speech: String) :Prints the string passed to it (2 points)
//birthday( ) :Increments the human’s age by 1 (2 points)
//Create an instance of this human class and invoke all its functions
//2. Create a data class User with these fields: firstName, lastName, email, phoneNumber, password. Create an instance of User and print out any 2 attributes (3 points)


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


//weight should be a double because of the mordern scale.
class Human(var name:String,var age:Int,var weight:Int){
    fun eat(foodWeight:Int){
        println("I am eating $foodWeight kgs of food")
        weight = weight + foodWeight
//        also weight +=foodweight
   }
    fun speak(speech:String){
    name  = speech
    }
    fun birthday(){
        age = age + 1
    }
}

data class User(var fistName:String,var lastName:String,var email:String,var phoneNumber:String,var password:String)
