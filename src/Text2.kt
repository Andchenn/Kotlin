import kotlin.Int
//用该类封装一个String变量
class MyString
{
	var value: String = "hello"
	override fun toString(): String
	{
		return value
	}
}
//通过扩展为MyString添加timeAssign函数
operator fun MyString.timesAssign(n: Int)
{
	val v = this.value
	for (i in 1 until n)
	{
		this.value+=v
	}
}

fun main(args: Array<String>)
{
	val c=MyString()
	c.value="<https://geekori.com>"
	c*= 3
	println(c)
}