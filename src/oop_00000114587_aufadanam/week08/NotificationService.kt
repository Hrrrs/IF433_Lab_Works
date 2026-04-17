package oop_00000114587_aufadanam.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Sending email: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        // sendEmail(user.email //INI AKAN ERROR :Type mismatch

        if (user.email != null) {
            // SUCCESS via smart cast: compiler tahu 'user.email' pasti tidak null di blok ini
            sendEmail(user.email)
        } else {
            println("User ${user.name} does not have an email")
        }
    }
}