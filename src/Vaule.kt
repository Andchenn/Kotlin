fun decimalDigVaule(c: Char): Int
{
	if (c !in '0'..'9')
	{
		throw IllegalArgumentException("Out of range")
	}
	return c.toInt() - '0'.toInt()
}

fun main(args: Array<String>)
{
	println(decimalDigVaule('8'))
	
}