class QACommunity1
{
	fun printQACommity1(uri: String, scheme: String = "https")
	{
		println("$scheme://$uri")
	}
}

fun main(args: Array<String>)
{
	
	QACommunity1().printQACommity1("geekori.com")
}