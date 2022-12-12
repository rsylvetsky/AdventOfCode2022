import java.io.File

class Day4 {

    fun test(input: Pair<List<Int>, List<Int>>) : Boolean {
        val first = input.first
        val second = input.second
        if (first.last() >= second.first() && first.last() <= second.last()) {
            return true
        } else if (second.first() <= first.last() && second.last() <= first.last()) {
            return true
        } else {
            return false
        }
    }

    private fun readInput(fileName: String) = File("src/main/kotlin/input", "$fileName.txt").readLines()

    //convert "2-5" --> [2,5], map doesn't modify, when it returns unit it's actually changing the object
    fun convertInput(range: String): List<Int> {
        return  range.split("-").map { it.toInt() }
    }

    fun part1(input: String) : Int{
        var input = readInput(input)
        var count = 0

        //split up the input so [2-4,6-8] --> ] [[2-4],[6-8]]
        val clean = input.map{ it.split(",")}


        val updateWithInts = clean.map {
            convertInput(it.first()) to convertInput(it.last())
        }

        //[([2, 4], [6, 8]), ([2, 3], [4, 5])

        updateWithInts.forEach {
            val first = it.first
            val second = it.second

            if (first.first() >= second.first() && first.last() <= second.last()) {
                count++
            } else if (second.first() >= first.first() && second.last() <= first.last()) {
                count++
            }

        }
        return count
    }

    fun part2(input: String) : Int {
        var input = readInput(input)
        var count = 0

        //split up the input so [2-4,6-8] --> ] [[2-4],[6-8]]
        val clean = input.map{ it.split(",")}


        val updateWithInts = clean.map {
            convertInput(it.first()) to convertInput(it.last())
        }

        //[([2, 4], [6, 8]), ([2, 3], [4, 5])

        updateWithInts.forEach {
            val first = it.first
            val second = it.second

            // 41-42, 40-40

//            if (first.last() >= second.first() && first.last() <= second.last()) {
//                count++
//            } else if (second.first() <= first.last() && second.last() <= first.last()) {
//                count++
//            }
            if (first.first() >= second.first() && first.first() <= second.last()) {
                count++
            } else if (second.first() >= first.first() && second.first() <= first.last()){
                count++
            }
        }
        return count
    }


}

