//单件模式
class Singleton private constructor()
{
	var value: Singleton? = null
	
	private object Holder
	{
		val INSTANCE = Singleton()
	}
	//companion object 相当于 java的static
	companion object Factory
	{
		fun getInstance(): Singleton
		{
			return Holder.INSTANCE
		}
	}
}

fun main(args: Array<String>)
{
	//定义这两个对象输出来的都一样，符合单件模式
	val obj1 = Singleton.getInstance()
	val obj2 = Singleton.getInstance()
	println(obj1)
	println(obj2)
}