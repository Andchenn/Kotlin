package Date_sealed

data class User(var name: String, var age: Int)

fun main(args: Array<String>)
{
	val user1 = User("Tom", 18)
	val user2 = User("Tom", 18)
	println(user1 == user2)
	println(user1)
	println(user2)
	
}