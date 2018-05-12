package Oj_Dg

import kotlin.properties.Delegates

class User
{
	//Tom是name属性的初始值
	//vetoable阻止属性赋值
	var name: String by Delegates.vetoable("Tom")
	{
		//响应器函数的3个样式
		prop, old, new ->
		//输入旧的属性值和新的属性值
		println("旧值：$old  新值：$new")
		var result = true
		if (new == "Mary")
		{
			result = false
			println("name属性值不能Mary")
		}
		//返回true或者false，表示允许或者否决属性的赋值
		result
	}
}

fun main(args: Array<String>)
{
	val user = User()
	user.name = "Bill"
	println(user.name)
	//属性值被截拦，仍然保留原来的值（Bills）
	user.name = "Mary"
	println(user.name)
}