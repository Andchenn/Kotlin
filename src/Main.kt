var flag1: Boolean = true
var flag2: Boolean = false

fun main(args: Array<String>)
{
	flag1 = false
	if (flag1 && !flag2)
	{
		println("flag1&&!flag2")
	}
	if (!flag1 || flag2)
	{
		println("!flag1||flag2")
	}
}