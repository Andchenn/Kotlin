import kotlin.Int

class Person3(val value: String, val num: Int)
{
	fun process()
	{
		println("value:$value,num:$num")
	}
}

fun main(args: Array<String>)
{
	//获取process函数对象
	val p=Person3::process
	//调用invoke函数执行Process函数
	p.invoke(Person3("abc",20))
	//利用java的反射机制指定process方法的名字
	val method=Person3::class.java.getMethod("process")
	//动态调用process函数
	method.invoke(Person3("pill",30))
}