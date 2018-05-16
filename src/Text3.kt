import kotlin.Int

class MyText(private var a: kotlin.Int, private var b: kotlin.Int)
{
	//重载比较操作符对应的函数
	operator fun compareTo(c: MyText): Int
	{
		val m = this.a + this.b
		val n = c.a + c.b
		println(m - n)
		return m - n
	}
	
	//重载等于和不等于操作符对应的函数
	override operator fun equals(other: Any?): Boolean
	{
		if (other is MyText)
		{
			val m = this.a + this.b
			val n = other.a + this.b
			return m == n
		}
		return false
	}
}

fun main(args: Array<String>)
{
	val c1 = MyText(20, 30)
	val c2 = MyText(40, 5)
	val c3 = MyText(35, 15)
	println(c1 > c2)
	println(c1 == c3)
}