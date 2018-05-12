package Oj_Dg

interface Base
{
	fun print()
}

class BaseImpl(val x: Int) : Base
{
	override fun print()
	{
		print(x)
	}
}

class Derived(b: Base) : Base by b
//{
//	//Derived本身的方法
//	fun getName(): String
//	{
//		return "Tom"
//	}
//}

fun main(args: Array<String>)
{
	val b = BaseImpl(10)
	Derived(b).print() //打印结果为10
}