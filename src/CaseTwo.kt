fun main() {
    print("Input your email: ")
    val input = readLine()
    emailValidation(input.toString())
}

private fun emailValidation(email: String) {
    val afterLast = email.substringAfterLast("@")
    val beforeLast = email.substringBeforeLast("@")
    if (!email.contains("@", true)) {
        println("Email must contain '@'")
    } else if (!afterLast.contains(".")) {
        println("Email must contain . after @")
    } else if (beforeLast.length >= 20) {
        println("Email must be less than 20 characters before @")
    } else if (!afterLast.contains(".co.id", true) || !afterLast.contains(".id", true)) {
        println("Email only contain .co.id or .id")
    } else {
        println("Email success")
    }
}
