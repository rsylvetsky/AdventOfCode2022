import java.io.File

class Day2 {

    private fun readInput(fileName: String): List<String> {
        var file = File("src/main/kotlin/input", "$fileName.txt").readLines()
        return file
    }

    fun part1(fileName: String): Int {
        var convertedInput = readInput(fileName).map { it.split(" ") }

        convertedInput.forEach { round -> round.forEach { it.trim() } }

        val rps = RPSgame()

        return rps.returnTotalScore(convertedInput)
    }

    class RPSgamePart2() {
        var totalScore = 0


        fun playGame(round: List<String>): Int {
            var roundScore = 0

            //X = Lose, Y =Draw, Z = Win
            if (round.last() == "X") {
                roundScore += 0
            } else if (round.last() == "Y") {
                roundScore += 3
            } else if (round.last() == "Z") {
                roundScore += 6
            }


            //X = Lose 1, Y =Draw 2, Z = Win 3
            //A = Rock, B= Paper, C= Scissors
            if (round.first() == "A" && round.last() == "Y") {
                //X is needed to draw, X is one point
                roundScore += 1
            }
            if (round.first() == "B" && round.last() == "X") {
                //X rock is needed to lose, X is 1 point
                roundScore += 1
            }
            if (round.first() == "A" && round.last() == "Z") {
                //Y paper is needed to win, Y is 2 point
                roundScore += 2
            }
            if (round.first() == "C" && round.last() == "X") {
                //Y paper is needed to lose, Y is 2 point
                roundScore += 2
            }
            if (round.first() == "B" && round.last() == "Z") {
                //Z scissors is needed to win, Z is 3 points
                roundScore += 3
            }
            if (round.first() == "C" && round.last() == "Y") {
                //Z is needed to draw, Z is 3 point
                roundScore += 3
            }
            if (round.first() == "A" && round.last() == "X") {
                //Z scissors is needed to lose, Z is 3 point
                roundScore += 3
            }
            if (round.first() == "B" && round.last() == "Y") {
                //Y is needed to draw, Y is 2 points
                roundScore += 2
            }
            if (round.first() == "C" && round.last() == "Z") {
                roundScore += 1
                //X rock is needed to win, X is 1 points
            }

            return roundScore
        }

        fun returnTotalScore(rounds: List<List<String>>): Int {
            rounds.forEach {
                totalScore += playGame(it)
            }
            return totalScore
        }
    }

    class RPSgame() {
        var totalScore = 0


        fun playGame(round: List<String>): Int {
            var roundScore = 0

            //your score for choosing your shape
            if (round.last() == "X") {
                roundScore += 1
            } else if (round.last() == "Y") {
                roundScore += 2
            } else if (round.last() == "Z") {
                roundScore = +3
            }


            //your score for if you won/lost
            if (round.first() == "A" && round.last() == "Y") {
                roundScore += 6
            }
            if (round.first() == "B" && round.last() == "X") {
                roundScore += 0
            }
            if (round.first() == "A" && round.last() == "Z") {
                roundScore += 0
            }
            if (round.first() == "C" && round.last() == "X") {
                roundScore += 6
            }
            if (round.first() == "B" && round.last() == "Z") {
                roundScore += 6
            }
            if (round.first() == "C" && round.last() == "Y") {
                roundScore += 0
            }
            if (round.first() == "A" && round.last() == "X") {
                roundScore += 3
            }
            if (round.first() == "B" && round.last() == "Y") {
                roundScore += 3
            }
            if (round.first() == "C" && round.last() == "Z") {
                roundScore += 3
            }

            return roundScore
        }

        fun returnTotalScore(rounds: List<List<String>>): Int {
            rounds.forEach {
                totalScore += playGame(it)
            }
            return totalScore
        }
    }



    fun part2(fileName: String): Int {



        var convertedInput = readInput(fileName).map { it.split(" ") }

        convertedInput.forEach { round -> round.forEach { it.trim() } }

        val rps = RPSgamePart2()

        return rps.returnTotalScore(convertedInput)
    }
}