class Person4
{
	var name: String = "Bill"
}

fun main(args: Array<String>)
{
	val person4=Person4()
	//获取属性的对象
	val name=Person4::name
	//读取属性值
	println(name.get(person4))
	//设置属性值
	name.set(person4,"Mike")
	println(name.get(person4))
	
//	无法使用getField方法获取name字段值,因为根本就没生成name字段,只有getName和setName方法
//	val field=Person4::class.java.getField("name")
//	field.set(person4,"John")
//	println(field.get(person4))
	
	//利用Java反射获取getName方法
	val getName=Person4::class.java.getMethod("getName")
	//利用java反射获取setName方法,注意,getMethod方法的第2个参数是可变的
	//需要传递setName参数类型的class
	//这里不能指定kotlin中的String ,而要指定java.lang.String
	val setName=Person4::class.java.getMethod("setName",java.lang.String().javaClass)
	//动态设置name属性的值
	setName.invoke(person4,"John")
	//动态获取name属性的值
	println(getName.invoke(person4))
	
}