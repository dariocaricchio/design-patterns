private case class SalaryComp(pay: Int) {
    def getTotal(): Int = this.pay*12
}

private case class EmployeeComp(pay: Int, bonus: Int) {
    private val objSalary = SalaryComp(this.pay)
    def annualSalary(): String = s"Total:\t${this.objSalary.getTotal() + this.bonus}"
}

object Composition{
    def main(args: Array[String]): Unit = {
        val objEmp = EmployeeComp(100, 10)
        println(objEmp.annualSalary())
    }
}
