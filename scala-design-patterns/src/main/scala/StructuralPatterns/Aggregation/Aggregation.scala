private case class SalaryAggr(pay: Int) {
    def getTotal(): Int = this.pay*12
}

private case class EmployeeAggr(pay: SalaryAggr, bonus: Int) {
    def annualSalary(): String = s"Total:\t${this.pay.getTotal() + this.bonus}"
}

object Aggregation {
    def main(args: Array[String]): Unit = {
        val objSal = SalaryAggr(100)
        val objEmp = EmployeeAggr(objSal, 10)
        println(objEmp.annualSalary())
    }
}