class QACommunity(url: String)
{
	//主构造的实现部分
	init
	{
		println(url)
	}
	
	//第二构造器(通过this直接调用了主构造器)
	constructor(value: Int) : this("geekori.com")
	{
		println(value)
	}
	//第二构造器(通过this直接调用了主构造器)
	constructor(description: String, url: String) : this("[$url]")
	{
		println("$description:$url")
	}
	//第二构造器(通过this调用了第二构造器，并间接调用主构造器)
	constructor():this(20)
	{
		println("<helps://geekori.com>")
	}
}

fun main(args: Array<String>)
{
	
	QACommunity("https://geekori.com")
	QACommunity(100)
	QACommunity("IT问答区","https://geekori.com")
	QACommunity()
	
}
