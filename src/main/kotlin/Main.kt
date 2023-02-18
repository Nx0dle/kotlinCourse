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
    return ("${list.maxOrNull()} ${list.indexOf(list.max())+1}")
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

fun main() {

}

