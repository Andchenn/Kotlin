import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties

class Person2(val value: String, val num: Int)
{
	fun process()
	{
	}
}

//获取Person2的类引用
var c = Person2::class

fun main(args: Array<String>)
{
	
	//获取Person2的所有成员列表(属性和函数)
	println("成员数:" + c.members.size)
	//枚举person2类中的成员
	for (member in c.members)
	{
		//输出每个成员的名字和返回类型
		print(member.name+" "+member.returnType)
		println()
	}
	
	//获取Person2类中所有属性的个数
	println("属性个数:"+c.memberProperties.size)
	//枚举Person2所有的属性
	for (property in c.memberProperties)
	{
		print(property.name+" "+property.returnType)
		println()
	}
	
	//获取Person2类中所有函数的个数
	println("函数个数:"+c.memberFunctions.size)
	//枚举person2类中所有函数的个数
	for (function in c.memberFunctions)
	{
		//输出当前函数的名字和返回类型
		println(function.name+" "+function.returnType)
	}
}