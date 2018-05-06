interface MyInterface
{
	fun process()
	fun getName(): String = "Tom"
}

//MyClass 类实现了 MyInterface 接口，必须重写MyInterface中的两个方法
class MyClass : MyInterface
{
	override fun process()
	{
		println("process")
	}
	
	override fun getName(): String = "Bill"
}

fun main(args: Array<String>)
{
	println(MyClass().getName())
	MyClass().process()
}