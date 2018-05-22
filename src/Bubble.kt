fun bubbleSort(array: IntArray)
{
	if (array.isEmpty())//非法检查
	{
		return
	}
	val size = array.size
	for (i in 0 until size - 1)
	{
		for (j in 1 until size-i)
		{
			if (array[j-1]>array[j])
			{
				val temp=array[j-1]
				array[j-1]=array[j]
				array[j]=temp
			}
		}
	}
}

fun main(args: Array<String>)
{
	val sort= intArrayOf(1,0,5,8,6,4,7)
	bubbleSort(sort)
	println("数字从打到小排序得：")
	sort.forEach {
		print("$it"+"\t")
	}
	
}