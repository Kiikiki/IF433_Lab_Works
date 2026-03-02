package oop_110866_Kiara.week05

fun main() {
    val lecturer1 = Lecturer("Mr. Micheal", "0123456")
    val lecturer2 = Admin("Mr. Afton")

    // val e = Employee("Test")
    // won't work because it is an abstract class
    // abstract class cannot be made directly

    val employeeList: List<Employee> = listOf(lecturer1, lecturer2)

    println("================= Employee Activity =================")
    for(employee in employeeList) {
        employee.work()

        when(employee) {
            is Lecturer -> {
                println("=> detected as a Lecturer! (NIDN: ${employee.nidn})")
                employee.teaching()
            }
            is Admin -> {
                println("=> detected as a Admin!")
                employee.doAdminWork()
            }
        }
        println("-----------------------------------------------------")
    }
}