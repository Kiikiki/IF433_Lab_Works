package oop_110866_Kiara.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Sending email to $emailAddress")
    }

    fun processUser(user: UserProfile) {
        if(user.email != null) {
            sendEmail(user.email)
        }
        else {
            println("User ${user.name} does not have an email")
        }
    }
}