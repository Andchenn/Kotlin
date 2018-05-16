//重载String 的++操作符
operator fun String.inc(): String
{
	//字符串首位相连
	return this + this
}

fun main(args: Array<String>)
{
	var str1="x"
	var str2="y"
	println(str1++)
	println(str1)
	println(++str2)
}