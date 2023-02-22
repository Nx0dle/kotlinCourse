import kotlin.math.abs

fun maxInLines(): String {
    var max = Int.MIN_VALUE
    var pos = 0
    var i = 1
    repeat(readln().toInt()) {
        val next = readln().toInt()
        if (max < next) {
            max = next
            pos = i
        }
        i++
    }
    return ("$max $pos")
}
fun maxInLines2(): String {
    val list = mutableListOf<Int>()
    repeat(readln().toInt()) {
        list.add(readln().toInt())
    }
    return ("${list.maxOrNull()} ${list.indexOf(list.maxOrNull())+1}")
}

fun sumInLines(): Int {
    var sum = 0
    do {
        val n = readln().toInt()
        sum += n
    } while (n != 0)
    return sum
}

fun daneOsobowe() {
    val (name, surname, age) = readln().split(" ")
    println("${name[0]}. $surname, $age years old")
}

fun charEqualCaseInsensitive() {
        val letter = readln()
        val letter2 = readln()

        println(letter.equals(letter2,true))
}

fun wielomian() {
    val a = readln().toInt()
    val b = readln().toInt()
    val c = readln().toInt()
    val d = readln().toInt()
    for (x in 0..1000) {
        if (a * x * x * x + b * x * x + c * x + d == 0) println(x)
    }
}

fun minFromN() {
    val n = readln().toInt()
    val list = mutableListOf<Int>()
    for (i in 1..n) {
        val a = readln().toInt()
        list.add(a)
    }
    println(list.minOrNull())
}

fun highestTax() {
    val n = readln().toInt()
    val comp = mutableListOf<Int>()
    val tax = mutableListOf<Int>()
    val result = mutableListOf<Int>()
    for (i in 0 until n) {
        comp.add(readln().toInt())
    }
    for (i in comp) {
        tax.add(readln().toInt())
    }
    for (i in comp.indices) {
        result.add(comp[i] * tax [i])
    }
    println(result.indexOf(result.maxOrNull())+1)
}


fun ticTacToe() {
    val s = readln()
    val checks = listOf(0, 4, 8, 2, 4, 6, 0, 1, 2, 3, 4, 5, 6, 7, 8, 0, 3, 6, 1, 4, 7, 2, 5, 8).chunked(3)
    var checkX = 0
    var checkO = 0
    val countX = s.count { it == 'X' }
    val countO = s.count { it == 'O' }
    val countFree = s.count { it == '_' || it == ' ' }
    val countMoves = countX + countO

    for (triplePos in checks) {
        var str = ""
        for (j in triplePos) str += s[j]
        when (str) {
            "XXX" -> checkX++
            "OOO" -> checkO++
        }
    }

    println("---------\n" +
            "| ${s[0]} ${s[1]} ${s[2]} |\n" +
            "| ${s[3]} ${s[4]} ${s[5]} |\n" +
            "| ${s[6]} ${s[7]} ${s[8]} |\n" +
            "---------")
    println(when {
        abs(countX - countO) > 1 -> "Impossible"
        checkX > 0 && checkO > 0 -> "Impossible"
        checkX == 0 && checkO == 0 && countFree > 0 -> "Game not finished"
        checkX == 0 && checkO == 0 && countFree == 0 -> "Draw"
        checkX == 1 && checkO == 0 -> "X wins"
        checkX == 0 && checkO == 1 -> "O wins"
        else -> ""
    })
}

fun main() {
    ticTacToe()
}


