from abc import ABC, abstractmethod


class AbstractFactory(ABC):
    @abstractmethod
    def create_product_a(self):
        pass

    @abstractmethod
    def create_product_b(self):
        pass


class ConcreteFactory1(AbstractFactory):
    def create_product_a(self):
        return ProductA1()

    def create_product_b(self):
        return ProductB1()


class ConcreteFactory2(AbstractFactory):
    def create_product_a(self):
        return ProductA2()

    def create_product_b(self):
        return ProductB2()


class ProductA(ABC):
    @abstractmethod
    def do_something(self):
        pass


class ProductA1(ProductA):
    def do_something(self):
        print("I am ProductA1")


class ProductA2(ProductA):
    def do_something(self):
        print("I am ProductA2")


class ProductB(ABC):
    @abstractmethod
    def do_something(self):
        pass


class ProductB1(ProductB):
    def do_something(self):
        print("I am ProductB1")


class ProductB2(ProductB):
    def do_something(self):
        print("I am ProductB2")


def main():
    factory = ConcreteFactory1()
    product_a = factory.create_product_a()
    product_b = factory.create_product_b()

    product_a.do_something()
    product_b.do_something()

    factory = ConcreteFactory2()
    product_a = factory.create_product_a()
    product_b = factory.create_product_b()

    product_a.do_something()
    product_b.do_something()


if __name__ == "__main__":
    main()
