fun main() {
    print("Input your text to check palindrome: ")
    val input = readLine()
    isPalindrome(input.toString())
}

private fun isPalindrome(value: String) {
    var temp: String = ""
    for (i in value.length - 1 downTo 0) {
        temp += value[i]
    }
    if (temp == value) {
        println("isPalindrome")
    } else {
        println("notPalindrome")
    }
}