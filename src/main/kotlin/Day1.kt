import java.io.File

class Day1 {

    private fun readInput(fileName: String) = File("src/main/kotlin/input", "$fileName.txt").readText()


    fun part1(fileName: String): Double {
        var input = readInput(fileName).split("\n\n").map { it.split("\n").toMutableList() }.toMutableList()

        var convertedInput = input.map {
            it.map {
                it.toDouble()
            }
        }

        var sums = convertedInput.map { it.sum() }

        return sums.max()
    }

    fun part2(fileName: String): Double {

        var input = readInput(fileName).split("\n\n").map { it.split("\n").toMutableList() }.toMutableList()

        var convertedInput = input.map {
            it.map {
                it.toDouble()
            }
        }

        var sums = convertedInput.map { it.sum() }.sortedDescending()

        return sums.take(3).sum()

    }

}