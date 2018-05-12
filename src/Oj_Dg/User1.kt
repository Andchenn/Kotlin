package Oj_Dg

class User1(map: Map<String, Any>)
{
	//将map用作name的属性委托
	val name: String by map
	//将map用作age的属性委托
	val age: Int by map
}

fun main(args: Array<String>)
{
	var map = mapOf(
			"name" to "John",
			"age" to 25
	)
	//将map中的key-value直接映射到User类的属性上
	val user1 = User1(map)
	println(user1.name)
	println(user1.age)
}