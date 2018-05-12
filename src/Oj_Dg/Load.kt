package Oj_Dg
//懒惰装载
val lazyValue:String by lazy {
	//该属性初始化函数的执行部分，只有第一次访问该属性时才会调用
	println("Computed!")
	"hello"
}

fun main(args: Array<String>)
{
	println(lazyValue)
	println(lazyValue)
}