fun main(args: Array<String>) {
   people("maria","sarai","caleb", "isak")
    cities("harare","mumbai","dodoma","jakarta")
    number()
    jina("Tek","Wargak","Giel")
    println( jina("Tek","Wargak","Giel"))



}
//    Create a function that takes in 4 strings and creates an array out of them then
//            prints out the array
fun people(name1: String,name2: String,name3: String,name4: String){
    val friends = arrayOf(name1, name2, name3, name4,)
    println(friends.contentToString() )
}


//Create a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case.

fun cities( city1:String, city2:String, city3:String, city4:String,){
    var cities = arrayOf(city1,city2,city3,city4)
    cities.sort()
    println(cities.sort())
     println(cities.map { it.capitalize()   })
}

//Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements
//(ii) prints out the index of 158
//(iii) prints out the elements in ascending order
fun number(){
    var numbers= arrayOf(32,17,4,213,78,43,90,31,3,73,11,158,62)
    var sum = numbers[1]+numbers[5]
    println(sum)
    println(numbers.indexOf(158))
    println("Sorted ascending: ${numbers.sorted()}")


}
//Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun jina(nme1:String,nme2:String,nme3:String ):String{
    var jina= arrayOf(nme1,nme2,nme3)
    return jina.contentToString()

}







