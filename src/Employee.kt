class Employee {
    var firstName: String? = null
    var lastName: String? = null

    constructor(firstName: String?, lastName: String?) {
        this.firstName = firstName
        this.lastName = lastName
    }

    constructor()

    override fun toString(): String {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}'
    }
}

fun main() {
    var employee = Employee()

    println("First Name: " + employee.firstName)

    employee.firstName = "John"

    println("First Name: " + employee.firstName)

    var employee2 = Employee("Manoj","Mulinti")

    println(employee2.toString())
}
