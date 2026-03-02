package oop_110866_Kiara.week05

class Admin(name: String): Employee(name){
    override fun work() {
        println("[$name] is playing FNAF, trying to keep freddy at bay")
    }

    fun doAdminWork() {
        println("[$name] is doing service to the animatronics")
    }
}