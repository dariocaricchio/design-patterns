class Component:
    def __init__(self):
        self.children = []

    def add(self, child):
        self.children.append(child)

    def remove(self, child):
        self.children.remove(child)

    def operation(self):
        pass


class Leaf(Component):
    def __init__(self, value):
        super().__init__()
        self.value = value

    def operation(self):
        return self.value


class Composite(Component):
    def __init__(self):
        super().__init__()

    def operation(self):
        return sum([child.operation() for child in self.children])


def main():
    root = Composite()
    root.add(Leaf(10))
    root.add(Leaf(20))

    child = Composite()
    child.add(Leaf(30))
    child.add(Leaf(40))

    root.add(child)

    print(root.operation())


if __name__ == "__main__":
    main()
