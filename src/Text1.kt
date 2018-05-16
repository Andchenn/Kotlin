import kotlin.Int
//重载一维数组的[i]操作符
operator fun Array<Any>.get(i:Int):Int
{
	//如果数组元素类型是Int，直接返回
	if (this[i] is Int)
	{
		return this[i] as Int
	}
	//如果数组元素类型是String，强行转换为Int，并返回
	else if (this[i] is String)
	{
		try
		{
			return this[i].toString().toInt()
		}
		catch (e:Exception)
		{
		}
	}
	return 0
}
//重载二维数组的[i,j]操作符
operator fun Array<Array<Any>>.get(i:Int,j:Int):Int
{
	if (this[i][j] is Int)
	{
		return this[i][j] as Int
	}else if (this[i][j] is String)
	{
		try
		{
			return this[i][j].toString().toInt()
		}catch (e:Exception)
		{
		
		}
	}
	return 0
}

fun main(args: Array<String>)
{
	//创建一维数组
	val arr1:Array<Any> = arrayOf("5","4","c")
	val arr2:Array<Any> = arrayOf("x","5","z")
	//创建二维数组
	val arr:Array<Array<Any>> = arrayOf(arr1,arr2)
	//输出执行一维数组和二维数组的值
	println("arr1[1] = ${arr1[1]}  arr1[2] = ${arr1[2]}  arr[1,0] = ${arr[1,0]}  arr[0,0] = ${arr[0,0]}")
}