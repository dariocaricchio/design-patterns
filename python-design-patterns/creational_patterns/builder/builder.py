from abc import ABC, abstractmethod


class Builder(ABC):
    @abstractmethod
    def set_age(self, age: int) -> None:
        pass

    @abstractmethod
    def set_name(self, name: str) -> None:
        pass

    @abstractmethod
    def build(self) -> None:
        pass


class PersonBuilder(Builder):
    def __init__(self):
        self.age = 0
        self.name = ""

    def set_age(self, age: int) -> None:
        self.age = age

    def set_name(self, name: str) -> None:
        self.name = name

    def build(self) -> None:
        return Person(self.age, self.name)


class Person:
    def __init__(self, age: int, name: str) -> None:
        self.age = age
        self.name = name

    def __str__(self) -> str:
        return f"Person(name={self.name}, age={self.age})"


def main():
    builder = PersonBuilder()
    builder.set_age(30)
    builder.set_name("John Doe")
    person = builder.build()

    print(person)


if __name__ == "__main__":
    main()
