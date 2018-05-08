open class Parent1(v1: Int, v2: Int)
{
	var mv1: Int = v1
	var mv2: Int = v2
	
	fun add(): Int
	{
		return mv1 + mv2
	}
	
	open fun printResult()
	{
		println("$mv1+$mv2=${add()}")
	}
	
}

class Child1(v1: Int, v2: Int) : Parent1(v1, v2)
{
	fun sub(): Int
	{
		return mv1 - mv2
	}
	
	override fun printResult()
	{
		println("$mv1-$mv2=${sub()}")
	}
	
}

fun main(args: Array<String>)
{
	var parent1=Parent1(1,2)
	var child1=Child1(1,2)
	
	println(parent1.printResult())
	println(child1.printResult())
}