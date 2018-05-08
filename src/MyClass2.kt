class MyClass2
{
	companion object
	{
	
	}
}

fun MyClass2.Companion.test()
{
	println("这是伴随对象成员函数")
}

fun main(args: Array<String>)
{
	MyClass2.test()
}

