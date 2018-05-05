// 非局部返回
fun foo()
{
	//从传入run的lambda表达式非局限返回
	run loop@{
		listOf(1, 2, 3, 4, 5).forEach {
			if (it == 3)
			{
				return@loop
			}
			
			print(it)
			
		}
	}
	// 用嵌套循环完成
	println(" done with nested loop")
}

//局部返回
fun foo1()
{
	// 局部返回到该 lambda 表达式的调用者，即 forEach 循环
	listOf(1, 2, 3, 4, 5).forEach l@{
		if (it == 3)
		{
			return@l
		}
		print(it)
	}
	// 用隐形的方法
	println(" done with implicit label")
}

fun main(args: Array<String>)
{
	foo()
	foo1()
}