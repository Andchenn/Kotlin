import sun.applet.Main
fun main(args: Array<String>)
{
	//使用arrayof函数定义可以储存任意值的数组
	val arr1= arrayOf(1,2,3,'a')
	println(arr1[3])
	arr1[2]='b'
	println(arr1[2])

	//使用arrayofnulls函数定义数据
	var arr2= arrayOfNulls<Int>(10)
	println("arr2的长度："+arr2.size)
	
	//使用array类的构造器函数定义数据，其中第二个参数是指初始化每个数据元素的值
	//每个数组元素的值就是当前数组索引的乘积
	//lambda -> 匿名函数
	var arr3=Array(10,{i->(i*i).toString()})
	println(arr3[3])
	
	//使用intarrayof函数定义数组
	var arr4:IntArray= intArrayOf(20,30,40,50,60)
	println("arr4[2]="+arr4[2])
}