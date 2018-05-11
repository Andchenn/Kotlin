package Oj_Dg

open class MyClass(name: String)
{
	open var name=name
	open fun verify()
	{
		println("verify")
	}
}
interface MyInterface
{
	fun closeData()
	{
		println("closeData")
	}
}
fun process(obj:MyClass)
{
	obj.verify()
	//判断obj是否是MyInterface的实例，如果是，则调用closeData方法
	if (obj is MyInterface)
	{
		obj.closeData()
	}
}

fun main(args: Array<String>)
{
	//process是一个对象，该对象是MyClass匿名子类的实例，并在对象中重写verify函数
	//对象不仅继承了MyClass类，还实现了MyInterface的接口
	process(object:MyClass("Bill"),MyInterface
	{
		override fun verify()
		{
			//执行输出object verify
			println("object verify")
		}
	})
}