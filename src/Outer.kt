class Outer
{
	private val bar:Int=1
	//嵌套类
	class Nested
	{
		fun foo()=2
	}
}

fun main(args: Array<String>)
{
	val demo=Outer.Nested().foo()
	println(demo)
}