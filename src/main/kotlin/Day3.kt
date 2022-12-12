import java.io.File

class Day3 {
    private fun readInput(fileName: String) = File("src/main/kotlin/input", "$fileName.txt").readLines()

    fun convertRuckSackToNumbers(rucksack: String): Pair<MutableList<Int>, MutableList<Int>> {
        var convertedList = mutableListOf<Int>()
        var convertedList2 = mutableListOf<Int>()

        val size = rucksack.length
        var firstWord = rucksack.subSequence(0, size / 2)
        var secondWord = rucksack.subSequence(size / 2, size)

        for (char in firstWord) {
            if (char == 'a') {
                convertedList.add(1)
            } else if (char == 'b') {
                convertedList.add(2)
            } else if (char == 'c') {
                convertedList.add(3)
            } else if (char == 'd') {
                convertedList.add(4)
            } else if (char == 'e') {
                convertedList.add(5)
            } else if (char == 'f') {
                convertedList.add(6)
            } else if (char == 'g') {
                convertedList.add(7)
            } else if (char == 'h') {
                convertedList.add(8)
            } else if (char == 'i') {
                convertedList.add(9)
            } else if (char == 'j') {
                convertedList.add(10)
            } else if (char == 'k') {
                convertedList.add(11)
            } else if (char == 'l') {
                convertedList.add(12)
            } else if (char == 'm') {
                convertedList.add(13)
            } else if (char == 'n') {
                convertedList.add(14)
            } else if (char == 'o') {
                convertedList.add(15)
            } else if (char == 'p') {
                convertedList.add(16)
            } else if (char == 'q') {
                convertedList.add(17)
            } else if (char == 'r') {
                convertedList.add(18)
            } else if (char == 's') {
                convertedList.add(19)
            } else if (char == 't') {
                convertedList.add(20)
            } else if (char == 'u') {
                convertedList.add(21)
            } else if (char == 'v') {
                convertedList.add(22)
            } else if (char == 'w') {
                convertedList.add(23)
            } else if (char == 'x') {
                convertedList.add(24)
            } else if (char == 'y') {
                convertedList.add(25)
            } else if (char == 'z') {
                convertedList.add(26)
            } else if (char == 'A') {
                convertedList.add(27)
            } else if (char == 'B') {
                convertedList.add(28)
            } else if (char == 'C') {
                convertedList.add(29)
            } else if (char == 'D') {
                convertedList.add(30)
            } else if (char == 'E') {
                convertedList.add(31)
            } else if (char == 'F') {
                convertedList.add(32)
            } else if (char == 'G') {
                convertedList.add(33)
            } else if (char == 'H') {
                convertedList.add(34)
            } else if (char == 'I') {
                convertedList.add(35)
            } else if (char == 'J') {
                convertedList.add(36)
            } else if (char == 'K') {
                convertedList.add(37)
            } else if (char == 'L') {
                convertedList.add(38)
            } else if (char == 'M') {
                convertedList.add(39)
            } else if (char == 'N') {
                convertedList.add(40)
            } else if (char == 'O') {
                convertedList.add(41)
            } else if (char == 'P') {
                convertedList.add(42)
            } else if (char == 'Q') {
                convertedList.add(43)
            } else if (char == 'R') {
                convertedList.add(44)
            } else if (char == 'S') {
                convertedList.add(45)
            } else if (char == 'T') {
                convertedList.add(46)
            } else if (char == 'U') {
                convertedList.add(47)
            } else if (char == 'V') {
                convertedList.add(48)
            } else if (char == 'W') {
                convertedList.add(49)
            } else if (char == 'X') {
                convertedList.add(50)
            } else if (char == 'Y') {
                convertedList.add(51)
            } else if (char == 'Z') {
                convertedList.add(52)
            }
        }

        for (char in secondWord) {
            if (char == 'a') {
                convertedList2.add(1)
            } else if (char == 'b') {
                convertedList2.add(2)
            } else if (char == 'c') {
                convertedList2.add(3)
            } else if (char == 'd') {
                convertedList2.add(4)
            } else if (char == 'e') {
                convertedList2.add(5)
            } else if (char == 'f') {
                convertedList2.add(6)
            } else if (char == 'g') {
                convertedList2.add(7)
            } else if (char == 'h') {
                convertedList2.add(8)
            } else if (char == 'i') {
                convertedList2.add(9)
            } else if (char == 'j') {
                convertedList2.add(10)
            } else if (char == 'k') {
                convertedList2.add(11)
            } else if (char == 'l') {
                convertedList2.add(12)
            } else if (char == 'm') {
                convertedList2.add(13)
            } else if (char == 'n') {
                convertedList2.add(14)
            } else if (char == 'o') {
                convertedList2.add(15)
            } else if (char == 'p') {
                convertedList2.add(16)
            } else if (char == 'q') {
                convertedList2.add(17)
            } else if (char == 'r') {
                convertedList2.add(18)
            } else if (char == 's') {
                convertedList2.add(19)
            } else if (char == 't') {
                convertedList2.add(20)
            } else if (char == 'u') {
                convertedList2.add(21)
            } else if (char == 'v') {
                convertedList2.add(22)
            } else if (char == 'w') {
                convertedList2.add(23)
            } else if (char == 'x') {
                convertedList2.add(24)
            } else if (char == 'y') {
                convertedList2.add(25)
            } else if (char == 'z') {
                convertedList2.add(26)
            } else if (char == 'A') {
                convertedList2.add(27)
            } else if (char == 'B') {
                convertedList2.add(28)
            } else if (char == 'C') {
                convertedList2.add(29)
            } else if (char == 'D') {
                convertedList2.add(30)
            } else if (char == 'E') {
                convertedList2.add(31)
            } else if (char == 'F') {
                convertedList2.add(32)
            } else if (char == 'G') {
                convertedList2.add(33)
            } else if (char == 'H') {
                convertedList2.add(34)
            } else if (char == 'I') {
                convertedList2.add(35)
            } else if (char == 'J') {
                convertedList2.add(36)
            } else if (char == 'K') {
                convertedList2.add(37)
            } else if (char == 'L') {
                convertedList2.add(38)
            } else if (char == 'M') {
                convertedList2.add(39)
            } else if (char == 'N') {
                convertedList2.add(40)
            } else if (char == 'O') {
                convertedList2.add(41)
            } else if (char == 'P') {
                convertedList2.add(42)
            } else if (char == 'Q') {
                convertedList2.add(43)
            } else if (char == 'R') {
                convertedList2.add(44)
            } else if (char == 'S') {
                convertedList2.add(45)
            } else if (char == 'T') {
                convertedList2.add(46)
            } else if (char == 'U') {
                convertedList2.add(47)
            } else if (char == 'V') {
                convertedList2.add(48)
            } else if (char == 'W') {
                convertedList2.add(49)
            } else if (char == 'X') {
                convertedList2.add(50)
            } else if (char == 'Y') {
                convertedList2.add(51)
            } else if (char == 'Z') {
                convertedList2.add(52)
            }
        }
        println("firstHalf: $convertedList, secondHalf: $convertedList2")
        return convertedList to convertedList2
    }

    fun part1(fileName: String): Int {
        val rucksacks = readInput(fileName)
        val result = mutableListOf<Int>()

        //AAAABBBB 0-3, 4-7 0 -> (length of string/2-1), length of string/2 - length of string -1

        rucksacks.forEach { word ->
            println(word)
            val convertPair = convertRuckSackToNumbers(word)
            val map = mutableMapOf<Int, Int>()
            for (num in convertPair.first) {
                if (num in map) {
                    map[num] = +1
                } else {
                    map[num] = 1
                }
            }
            for (num in convertPair.second) {
                if (num in map) {
                    println("common letter: $num")
                    result.add(num)
                    break
                }
            }
        }
        return result.sum()
    }

    private fun readInputPart2(fileName: String) =
        File("src/main/kotlin/input", "$fileName.txt").readText().split("\n").chunked(3)

    fun convertChunkToSetsOfNumbers(chunk: List<String>): MutableList<MutableSet<Int>> {
        var wordSets = mutableListOf<MutableSet<Int>>()
        for (word in chunk) {
            var set = mutableSetOf<Int>()
            for (char in word) {
                if (char == 'a') {
                    set.add(1)
                } else if (char == 'b') {
                    set.add(2)
                } else if (char == 'c') {
                    set.add(3)
                } else if (char == 'd') {
                    set.add(4)
                } else if (char == 'e') {
                    set.add(5)
                } else if (char == 'f') {
                    set.add(6)
                } else if (char == 'g') {
                    set.add(7)
                } else if (char == 'h') {
                    set.add(8)
                } else if (char == 'i') {
                    set.add(9)
                } else if (char == 'j') {
                    set.add(10)
                } else if (char == 'k') {
                    set.add(11)
                } else if (char == 'l') {
                    set.add(12)
                } else if (char == 'm') {
                    set.add(13)
                } else if (char == 'n') {
                    set.add(14)
                } else if (char == 'o') {
                    set.add(15)
                } else if (char == 'p') {
                    set.add(16)
                } else if (char == 'q') {
                    set.add(17)
                } else if (char == 'r') {
                    set.add(18)
                } else if (char == 's') {
                    set.add(19)
                } else if (char == 't') {
                    set.add(20)
                } else if (char == 'u') {
                    set.add(21)
                } else if (char == 'v') {
                    set.add(22)
                } else if (char == 'w') {
                    set.add(23)
                } else if (char == 'x') {
                    set.add(24)
                } else if (char == 'y') {
                    set.add(25)
                } else if (char == 'z') {
                    set.add(26)
                } else if (char == 'A') {
                    set.add(27)
                } else if (char == 'B') {
                    set.add(28)
                } else if (char == 'C') {
                    set.add(29)
                } else if (char == 'D') {
                    set.add(30)
                } else if (char == 'E') {
                    set.add(31)
                } else if (char == 'F') {
                    set.add(32)
                } else if (char == 'G') {
                    set.add(33)
                } else if (char == 'H') {
                    set.add(34)
                } else if (char == 'I') {
                    set.add(35)
                } else if (char == 'J') {
                    set.add(36)
                } else if (char == 'K') {
                    set.add(37)
                } else if (char == 'L') {
                    set.add(38)
                } else if (char == 'M') {
                    set.add(39)
                } else if (char == 'N') {
                    set.add(40)
                } else if (char == 'O') {
                    set.add(41)
                } else if (char == 'P') {
                    set.add(42)
                } else if (char == 'Q') {
                    set.add(43)
                } else if (char == 'R') {
                    set.add(44)
                } else if (char == 'S') {
                    set.add(45)
                } else if (char == 'T') {
                    set.add(46)
                } else if (char == 'U') {
                    set.add(47)
                } else if (char == 'V') {
                    set.add(48)
                } else if (char == 'W') {
                    set.add(49)
                } else if (char == 'X') {
                    set.add(50)
                } else if (char == 'Y') {
                    set.add(51)
                } else if (char == 'Z') {
                    set.add(52)
                }
            }
            wordSets.add(set)
        }
        println("wordSets $wordSets")
        return wordSets
    }

    fun part2(fileName: String): Int {
        val chunks = readInputPart2(fileName)

        var result = mutableListOf<Int>()
        chunks.forEach { chunk ->
            var wordSets = convertChunkToSetsOfNumbers(chunk)
            result.add(findOverlap(wordSets))
        }
        return result.sum()
    }

    fun findOverlap(wordSets: MutableList<MutableSet<Int>>) : Int {
        var tempMap = mutableMapOf<Int,Int>()
        for (set in wordSets) {
            for (num in set) {
                if (num in tempMap) {
                    tempMap[num] = tempMap[num]!! + 1
                    if (tempMap[num] == 3) {
                        return num
                    }
                } else {
                    tempMap[num] = 1
                }
            }
        }
        return 0
    }
}