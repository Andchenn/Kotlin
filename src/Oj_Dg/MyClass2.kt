package Oj_Dg

open class MyClass2
{
	open fun text()
	{
	
	}
}
fun process(obj:MyClass2)
{
	obj.text()
}

fun main(args: Array<String>)
{
	var n=20
	process(object:MyClass2()
	{
		override fun text()
		{
			if (n==20)
			{
				println("success")
				n=30//可以修改n的至
			}else
			{
				println("failed")
			}
			
		}
	})
}