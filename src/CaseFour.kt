fun main() {
    print("Input your text: ")
    val input = readLine()
    println(textReversed(input.toString()))
}

private fun textReversed(value: String) : String {
    var temp: String = ""
    for (i in value.length - 1 downTo 0) {
        temp += value[i]
    }
    return temp
}
