import javax.print.attribute.standard.OrientationRequested
import javax.print.attribute.standard.PrinterInfo
import getName as f
import getClass as my

fun getName():String
{
	return "hello"
}

fun getClass():String
{
	return "world!"
}
fun main(args: Array<String>)
{
//  第一种：不导入包的方法
//	print(getName())
//	print(",")
//	print(getClass())

//  第二种导入包的写法
	print(f())
	print(" n")
	print(my())
	
}