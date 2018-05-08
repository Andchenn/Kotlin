class D
{
	fun bar()
	{
		println("D bar")
	}
}
class C
{
	fun baz()
	{
		println("C baz")
	}
	
	fun D.foo()
	{
		//调用D类的bar方法
		bar()
		//调用C类的baz方法
		baz()
	}
	
	fun caller(d:D)
	{
		//调用扩展方法
		d.foo()
	}
}

fun main(args: Array<String>)
{
	C().caller(D())
}