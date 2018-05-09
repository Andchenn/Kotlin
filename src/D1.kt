open class D1
{
}

class D2:D1()
{
}
open class C1
{
	open fun D1.foo()
	{
		println("D1.foo in C")
	}
	
	open fun D2.foo()
	{
		println("D2.foo in C")
	}
	
	fun caller(d1: D1)
	{
		//调用扩展函数
		d1.foo()
	}
}


class C2:C1()
{
	override fun D1.foo()
	{
		println("D1.foo in C1")
	}
	
	override fun D2.foo()
	{
		println("D2.foo in C1")
	}
}

fun main(args: Array<String>)
{
	C1().caller(D1())
	//调度接收器虚拟解析
	C2().caller(D1())
	//扩展接收器静态解析
	C1().caller(D2())
}