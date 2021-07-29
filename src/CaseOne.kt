fun main(args: Array<String>) {
    print("Input constraint number: ")
    val input = readLine()
    helloWorld(Integer.valueOf(input))
}

private fun helloWorld(value: Int) {
    for (i in 1..value) {
        if (i % 3 == 0) {
            println("Hello")
        } else if (i % 5 == 0) {
            println("World")
        } else if (i % 3 == 0 && i % 5 == 0) {
            println("Hello World")
        } else {
            println(i)
        }
    }
}
