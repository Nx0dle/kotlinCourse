@file:Suppress("UNUSED_EXPRESSION")

import javax.xml.stream.events.Characters
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


fun wordCounter() {
    val str = readln()

    var count = 0
    for (i in str) {
        if (Character.isWhitespace(i))
            count++
    }

    println(count+1) // 4
}

fun luckyNums() {
    val nums = readln()
    val list = mutableListOf<Char>()
    var sum1 = 0
    var sum2 = 0
    for (i in nums.indices) {
        list.add(nums[i])
    }
    for (i in 0..2) {
        sum1 += list[i].digitToInt()
    }
    for (i in 3..5) {
        sum2 += list[i].digitToInt()
    }
    if (sum1 == sum2) println("Lucky")
    else println("Default")
}

fun linkDataCheck() {
    val link = readln()
    var dataEX = link
    val pass = dataEX.substringAfter("pass=").substringBefore("&")
    dataEX = link.split("?").drop(1).joinToString().replace("=&", " : not found&").replace("=" ," : ")
    val password = "password : $pass"
    val dataF = dataEX.split("&").toMutableList()
    for (i in dataF.indices) {
        println(dataF[i])
    }
    if (link.contains("pass"))
        println(password)
}

fun simpleCalc(){
    val (var1, op, var2) = readln().split(" ")

    val a = var1.toInt()
    val b = var2.toInt()

    when (op) {
        "+" -> println(a + b)
        "-" -> println(a - b)
        "*" -> println(a * b)
        else -> println("Unknown operator")
    }
}

fun simpleCalcRev() {
    val (var1, var2, var3) = readln().split(" ")

    val a = var1.toInt()
    val b = var2.toInt()
    val c = var3.toInt()

    println(when (c) {
        a + b -> "$c equals $a plus $b"
        a - b -> "$c equals $a minus $b"
        a * b -> "$c equals $a times $b"
        else -> "We do not know how to calculate $c"
    })
}

@SuppressWarnings("MagicNumber")
fun main() {
    when (readln().toInt()) {
        in 0 until 1 -> println("no army")
        in 1..4 -> println("few")
        in 5..9 -> println("several")
        in 10..19 -> println("pack")
        in 20..49 -> println("lots")
        in 50..99 -> println("horde")
        in 100..249 -> println("throng")
        in 250..499 -> println("swarm")
        in 500..999 -> println("zounds")
        in 1000..12901920 -> println("legion")
    }
}