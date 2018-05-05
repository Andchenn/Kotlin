import java.beans.Customizer

class Customer
{
	//只读属性
	val name: String
		get() = "Bill"
	
	//读写属性
	var value: Int = 0
	//从field中读取属性值
		set(value)
		{
			println("value属性被设置")
			field = value
		}
}

fun main(args: Array<String>)
{
	var c=Customer()
	c.value=30
	println(c.name)
	println(c.value)
	
}