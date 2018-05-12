package Oj_Dg

import kotlin.properties.Delegates
import kotlin.reflect.KProperty

class Datagate
{
	//用于保存属性值的成员变量
	var name:String=""
	//调用委托属性的getter函数，会调用委托类getValue函数
	operator fun getValue(thisRef:Any?,property:KProperty<*>):String
	{
		//获取thisRef指定的类名
		val className=thisRef.toString().substringBefore('@')
		println("$className.get已经被调用")
		return name
	}
	
	//调用委托属性的setter函数，会调用委托类的setValue函数
	operator fun setValue(thisRef: Any?,property: KProperty<*>,value: String)
	{
		//获取thisRef指定的类名
		val className=thisRef.toString().substringBefore('@')
		println("$className.set已经被调用")
		name=value
	}
}
class MyClass3
{
	//将name属性委托给Datagate
	var name:String by Datagate()
}
class MyClass4
{
	//将name属性委托给Datagate
	var name:String by Datagate()
}

fun main(args: Array<String>)
{
	val c3=MyClass3()
	val c4=MyClass4()
	c3.name="Tom"
	c4.name="Mike"
	println(c3.name)
	println(c4.name)
}