// Uncompleted !!!

fun main() {
    println("Format is 12:00 PM")
    print("Input your time: ")
    val input = readLine()
    convertTime(input.toString())
}

private fun convertTime(value: String) {
    val beforeLast = value.substringBeforeLast(":")
    val afterLast = value.substringAfterLast(":")
    println("$beforeLast:$afterLast")
}