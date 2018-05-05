//主构造器
class Person(firstName: String)
{
//	第一种方法：
//	init
//	{
//		println(firstName)
//	}

//  第二种方法
	var name=firstName
	init
	{
		println(name)
	}
}

fun main(args: Array<String>)
{
	Person("小红")
}