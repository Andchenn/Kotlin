package Oj_Dg


class User2(var map: MutableMap<String, Any>)
{
	//name中的值和map的值是同步的
	var name: String by map
	//age中的值和map的值是同步的
	var age: Int by map
}

fun main(args: Array<String>)
{
	var mutableMap = mutableMapOf(
			"name" to "Tom",
			"age" to 20
	)
	
	val user2 = User2(mutableMap)
	println(user2.name)
	println(user2.age)
	//修改name的属性值，mutableMap中相应的属性值也会变化
	user2.name = "Mary"
	println(mutableMap)
	//修改mutableMap中相应的属性值，user的age也跟着变化
	mutableMap.put("age", 26)
	println(user2.age)
}