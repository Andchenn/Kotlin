enum class Direction private constructor(val d:Int)
{
	//通过Direction的构造器传入枚举对应的值
	NORTH(1),SOUTH(2),EAST(3),WEST(4);
	
	override fun toString(): String
	{
		//返回当前枚举值对应的数字
		return d.toString()
	}
}

fun main(args: Array<String>)
{
	//实例化
	var direction1:Direction=Direction.NORTH
	var direction2=Direction.EAST
	
	println(direction1)
	println(direction2)
	println("**************")
	
	if (direction1==direction2)
	{
		println("枚举类型值相等！")
	}
	else
	{
		println("枚举类型值不相等！")
	}
}