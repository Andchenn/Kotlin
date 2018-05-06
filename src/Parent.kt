open class Parent
{
	open val name:String="Bill"
	get()
	{
		println("获取Parent.name属性值")
		return field
	}
}

open class Child:Parent()
{
	//重写父类
	override var name:String="Mike"
	get()
	{
		println("获取Child.name属性值")
		return field
	}
	set(value)
	{
		field=value
		println("Child.name被写入")
	}
}

fun main(args: Array<String>)
{
	val child=Child()
	child.name="Tom"
	println(child.name)
}