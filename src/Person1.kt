import java.util.ArrayList

class Person1(name: String)
{
	private var mName:String=name
	fun getName(): String
	{
		return mName
	}
}

class Persons
{
	//persons为可变参数，可以传入任何多个persons 对象
	fun addPersons(vararg persons: Person1): List<Person1>
	{
		val result=ArrayList<Person1>()
		//可变参数在函数内部和处理集合的方式一样
		for (person1 in persons)
		{
			result.add(person1)
		}
		return result
	}
}

fun main(args: Array<String>)
{
	var persons=Persons().addPersons(Person1("Tom"),Person1("Mike"),Person1("John"))
	for (person in persons)
	{
		println(person.getName())
	}
}
