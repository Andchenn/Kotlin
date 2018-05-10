class Runoob<out A>(val a: A)
{
	fun foo(): A
	{
		return a
	}
}

fun main(args: Array<String>)
{
	val strCo: Runoob<String> = Runoob("a")
	var anyCo: Runoob<Any> = Runoob<Any>("b")
	anyCo = strCo
	println(anyCo.foo())
}