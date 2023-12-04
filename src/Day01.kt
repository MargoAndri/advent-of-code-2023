
fun main() {
    fun part1(input: List<String>): Int {
        fun calculation(string: String): Int {
            val firstDigit = string.first {it.isDigit()}
            val lastDigit = string.last {it.isDigit()}
            return "$firstDigit$lastDigit".toInt()
        }

        return input.sumOf { calculation(it) }
    }

    val input = readInput("Day01")
    part1(input).println()
    //part2(input).println()
}