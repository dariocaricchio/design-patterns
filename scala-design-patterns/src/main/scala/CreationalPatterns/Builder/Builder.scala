abstract class Builder[T] {
  def setAge(age: Int): Builder[T]
  def setName(name: String): Builder[T]
  def build(): T
}

case class Person (val age: Int = 0, val name: String = "")

class PersonBuilder extends Builder[Person] {
  private var age: Int = 0
  private var name: String = ""

  def setAge(age: Int): Builder[Person] = {
    this.age = age
    this
  }

  def setName(name: String): Builder[Person] = {
    this.name = name
    this
  }

  def build(): Person = {
    new Person(age, name)
  }
}

object BuilderPattern {
  def main(args: Array[String]): Unit = {
    val builder = new PersonBuilder()
    builder.setAge(30)
    builder.setName("John Doe")
    val person = builder.build()

    println(person)
  }
}
