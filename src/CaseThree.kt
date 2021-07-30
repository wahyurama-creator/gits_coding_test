fun main() {
    println("Format is 12:00 PM")
    print("Input your time: ")
    val input = readLine()
    println(convertTime(input.toString()))
}

private fun convertTime(input: String) : String{
    var before = input.substringBeforeLast(":").toInt()
    val after = input.substringAfterLast(":").dropLast(3)
    val value = input.substringAfterLast(" ")

    if (value.contains("p", true) && before < 12) {
        before += 12
    } else if (value.contains("a", true) && before == 12) {
        before -= 12
    }

    return "$before:$after"
}