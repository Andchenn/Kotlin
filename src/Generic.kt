class Box<T>(t: T)
{
	var value = t
}

fun main(args: Array<String>)
{
	val box1: Box<String> = Box("Tom")
	val box2: Box<Int> = Box(20)
	println(box1.value)
	println(box2.value)
}