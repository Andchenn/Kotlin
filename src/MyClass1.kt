class MyClass1
{
	//需要声明为public,或不加i修饰符（默认是public），否则扩展属性无法访问该变量
	var mValue: Int = 0
	//内部属性
	var str: String = ""
		get() = field
		set(value)
		{
			field = value
		}
}
// 扩展属性，需要实现setter部分
var MyClass1.value: Int
	get() = mValue
	set(value)
	{
		mValue = value
	}

fun main(args: Array<String>)
{
	var myClass1 = MyClass1()
	myClass1.str = "hello"
	//设置扩展属性的值
	myClass1.value = 100
	println(myClass1.str)
	//输出扩展属性的值
	println(myClass1.value)
}