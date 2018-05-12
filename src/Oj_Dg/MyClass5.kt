package Oj_Dg

import kotlin.reflect.KProperty
//delegate是委托泛型函数，可以适应任何Kotlin类型，该函数的返回值类型是泛型委托
//函数体只有一行代码，就是传入初始化函数的泛型委托类的实例Delegate(initializer)
fun <T> delegate(initializer: () -> T): Delegate<T> = Delegate(initializer)
class MyClass5
{
	//name委托给了delegate函数，并指定了初始化函数
	var name: String by delegate {
		//这里面的代码是委托类的初始化函数（通过主构造器传入）
		println("MyClass5.name初始化函数调用")
		//初始化函数返回的字符串
		"<MyClass5>"
	}
}

class MyClass6
{
	//name委托给了detegate函数，并指定了初始化函数
	var name: String by delegate {
		println("MyClass5.name初始化函数调用")
		//初始化函数返回的字符串
		"<MyClass6>"
	}
}
//泛型委托类
class Delegate<T>(initializer: () -> T)
{
	var name: String = ""
	//调用初始化，返回相应的类名
	var className = initializer()
	
	operator fun getValue(thisRef: Any?, property: KProperty<*>): String
	{
		println("$className.get已被调用")
		return name
	}
	
	operator fun setValue(thisRef: Any?, property: KProperty<*>, value: String)
	{
		println("$className.set已被调用")
	}
}

fun main(args: Array<String>)
{
	var c5 = MyClass5()
	var c6 = MyClass6()
	c5.name = "Army"
	c6.name = "Tom"
	println(c5.name)
	println(c6.name)
}