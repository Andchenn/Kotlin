fun main(args: Array<String>)
{
	//when 用法
	val x = 1
	val m = when (x)
	{
		1, 2 ->
		{
			println("hello world!")
			println("x==1")
			20
			println("已符合条件")
		}
		3 ->
		{
			println("a===2")
		}
		else ->
		{
			println("2不在1-2之间")
		}
	}
	println(m)
	println("\n**********************")
	//in 关键此
	val a = 25
	when (a)
	{
		in 1..10 -> println("满足条件")
		in 11..20 -> println("不满足条件")
		!in 20..60 -> println("hello world!")
		else ->
		{
			println("出错！")
		}
	}
	println("\n**********************")
	//枚举方法
	val arr = intArrayOf(2, 4, 6, 8, 10)
	for ((index, value) in arr.withIndex())
	{
		println("arr[$index]=$value")
	}
	println("\n**********************")
//  do...while
//	return。默认从最直接包围它的函数或者匿名函数返回。
//	break。终止最直接包围它的循环。
//	continue。继续下一次最直接包围它的循环。
	var i = 0
	while (i++ < 10)
	{
		println(i)
	}
	println("\n************************")
	do
	{
		if (i == 6)
		{
			continue
			
		}
		println(i)
		if (i == 5)
		{
			break
		}
	} while (--i > 0)
}