import java.io.File
import kotlin.math.sin

class Day6 {

    private fun readInput(fileName: String) = File("src/main/kotlin/input", "$fileName.txt").readText()

    //mjqjpqmgbljsphdztnvjfqwrcgsmlb
    //1. Start and End are at 0
    //2. Add string[end] to map [m:1]
    //3. # of Values is less than 4, end ++
    //4. Add string[end] to map [m:1, j:1]
    //5. # of Values is less than 4, end ++
    //6. Add string[end] to map [m:1, j:1, q:1]
    //7. # of Values is less than 4, end ++
    //8. Add string[end] to map [m:1, j:2, q:1]
    //9. # of values is > 4 but theres only 3 keys
    //10. Subtract from start's value, if 0, delete it from the map [j:2, q:1], Start ++ & End ++
    //11. Add string[end] to map [j:2, q:1, p:1]
    //12. # of values is > 4 but theres only 3 keys
    //13. Subtract from start's value, if 0, delete it from the map [j:1, q:1, p:1], Start ++ & End ++
    //14.  Add string[end] to map [j:1, q:1, p:1] etc
    fun part1(fileName: String) : Int {
        val string = readInput(fileName)
        var map = HashMap<Char, Int>()
        var start = 0
        var end = 0

        for (i in end until string.length) {
            var singleLetter = string[end]
            println("letter: $singleLetter")
            if (singleLetter in map) {
                map[singleLetter] = map[singleLetter]!! + 1
            } else {
                map[singleLetter] = 1
            }
            println("Map: $map")
            if (map.values.sum() == 4) {
                if (map.keys.count() == 4) {
                    return end+1
                } else {
                    map[string[start]] = map[string[start]]!! - 1
                    if (map[string[start]] == 0) {
                        map.remove(string[start])
                    }
                    start++
                }
            }
            end ++
        }
        return 0
    }

    fun part2(fileName: String) : Int {
        val string = readInput(fileName)
        var map = HashMap<Char, Int>()
        var start = 0
        var end = 0

        for (i in end until string.length) {
            var singleLetter = string[end]
            println("letter: $singleLetter")
            if (singleLetter in map) {
                map[singleLetter] = map[singleLetter]!! + 1
            } else {
                map[singleLetter] = 1
            }
            println("Map: $map")
            if (map.values.sum() == 14) {
                if (map.keys.count() == 14) {
                    return end+1
                } else {
                    map[string[start]] = map[string[start]]!! - 1
                    if (map[string[start]] == 0) {
                        map.remove(string[start])
                    }
                    start++
                }
            }
            end ++
        }
        return 0
    }
}