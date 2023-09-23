class Node:
    def __init__(self, value):
        self.value = value
        self.children = []

    def add(self, child):
        self.children.append(child)

    def remove(self, child):
        self.children.remove(child)

    def operation(self):
        return self.value

def sum_of_paths(tree):
    if not tree.children:
        return tree.operation()
    return tree.operation() + sum(sum_of_paths(child) for child in tree.children)


def main():
    root = Node(10)
    root.add(Node(20))
    subtree = Node(30)
    subtree.add(Node(10))
    root.add(subtree)

    print(sum_of_paths(root))


if __name__ == "__main__":
    main()
