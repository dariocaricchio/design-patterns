class Car:
    def __init__(self, engine):
        self.engine = Engine(engine)

    def drive(self):
        self.engine.start()
        print("The car is driving")
        self.engine.stop()


class Engine:
    def __init__(self, name) -> None:
        self.name = name

    def start(self):
        print(f"The engine named {self.name} is starting")

    def stop(self):
        print(f"The engine name {self.name} is stopping")


def main():
    car = Car("Bob")
    car.drive()


if __name__ == "__main__":
    main()
