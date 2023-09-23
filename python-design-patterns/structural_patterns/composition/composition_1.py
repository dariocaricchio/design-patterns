class Salary:
    def __init__(self,pay):
        self.pay=pay

    def get_total(self):
       return (self.pay*12)

class Employee:
    def __init__(self,pay,bonus):
        self.pay=pay
        self.bonus=bonus
        self.obj_salary=Salary(self.pay)

    def annual_salary(self):
        return "Total: "  +  str(self.obj_salary.get_total()+self.bonus)


def main():
    obj_emp=Employee(100,10)
    print (obj_emp.annual_salary())


if __name__ == "__main__":
    main()
