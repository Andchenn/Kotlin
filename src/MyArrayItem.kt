data class MyArrayItem(var key:Int,var value:String,var comment:String)
//MyArrayItem函数返回了一个集合对象
fun valueArray():Collection<MyArrayItem>
{
	return arrayListOf(MyArrayItem(20,"A","comment1"),MyArrayItem(21,"B","comment2"),MyArrayItem(22,"C","comment3"))
}

fun main(args: Array<String>)
{
	for ((key,value,comment)in valueArray())
	{
		println("key=$key,value=$value,comment=$comment")
	}
}