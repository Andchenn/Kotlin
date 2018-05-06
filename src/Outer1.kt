class Outer1
{
	private val bar:Int=1
	inner class Inner
	{
		fun foo()=bar
	}
}

fun main(args: Array<String>)
{
	val demo=Outer1().Inner().foo()
	println(demo)
}