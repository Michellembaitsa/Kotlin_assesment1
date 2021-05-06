fun main(){
introduction("Zippy",23)
    machine(4)
    machine(7)
    machine(16)
    multiply(5)
    multiply(4)
    divide(200)
    divide(70)
    modulus(50)
    modulus(33)
   println(arr(arrayOf("Beth","Angel","Aria","Lisa","Nancy")))
}
fun introduction(name:String,age:Int){ //question1
    println("My name is${name} and I am ${age} years old")

}
fun machine(age:Int){ //question2
    if (age <6){
        println("Here is a glass of milk for you.")
    } else if (age>6 && age <15){
        println("Here is a bottle of fanta orange for you.")
    }else {
        println("Here is a bottle of cocacola for you.")
    }
fun name(names: Array<String>): Int { //question3
        var total= 0
        for (character in names) {
            if (character.length > 4) {
                total++
            }
        }
        return total
    }
}
fun multiply(i:Int){  //question4
 println(i*10)
}
fun divide(j:Int){
print(j/10)
}
fun modulus(k:Int){
print(k%2)
}

fun comparison(m:Int,n:Int):Boolean{
if (m<n){
    return true
}
    return false
}
}
fun arr(names:Array<String>):Array<String>{
    return names

}
class Human(name: String,age: Int,weight:Float){
    fun eat(foodWeight: Int) {
        Println(“I am eating { foodWeight } kgs of food ”)
    }
}
fun game(){

}




