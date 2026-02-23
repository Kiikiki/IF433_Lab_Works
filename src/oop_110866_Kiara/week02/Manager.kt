package oop_110866_Kiara.week02

import oop_110866_Kiara.week04.Employee

class Manager(name: String, baseSalary: Int): Employee(name, baseSalary) {
    override fun work() {
        println("$name is leading a division report!")
    }

    override fun calculateBonus(): Int {
        return super.calculateBonus() + 500000
    }
}