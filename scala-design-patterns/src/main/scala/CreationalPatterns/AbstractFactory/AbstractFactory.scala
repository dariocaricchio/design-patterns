abstract class AbstractFactory {
  def createProductA(): ProductA
  def createProductB(): ProductB
}

class ConcreteFactory1 extends AbstractFactory {
  def createProductA(): ProductA = new ProductA1()
  def createProductB(): ProductB = new ProductB1()
}

class ConcreteFactory2 extends AbstractFactory {
  def createProductA(): ProductA = new ProductA2()
  def createProductB(): ProductB = new ProductB2()
}

trait ProductA {
  def doSomething(): Unit
}

class ProductA1 extends ProductA {
  def doSomething(): Unit = {
    println("I am ProductA1")
  }
}

class ProductA2 extends ProductA {
  def doSomething(): Unit = {
    println("I am ProductA2")
  }
}

trait ProductB {
  def doSomething(): Unit
}

class ProductB1 extends ProductB {
  def doSomething(): Unit = {
    println("I am ProductB1")
  }
}

class ProductB2 extends ProductB {
  def doSomething(): Unit = {
    println("I am ProductB2")
  }
}

object AbstractFactoryPattern {
  def main(args: Array[String]): Unit = {
    val factory1 = new ConcreteFactory1()
    val productA1 = factory1.createProductA()
    val productB1 = factory1.createProductB()

    productA1.doSomething()
    productB1.doSomething()

    val factory2 = new ConcreteFactory2()
    val productA2 = factory2.createProductA()
    val productB2 = factory2.createProductB()

    productA2.doSomething()
    productB2.doSomething()
  }
}