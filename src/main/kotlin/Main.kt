
fun calculate(value1: Double, value2: Double, operator: Char): Double {
    return when (operator) {
        '+' -> value1 + value2
        '-' -> value1 - value2
        '*' -> value1 * value2
        '/' -> value1 / value2
        '%' -> value1 % value2
        else -> throw IllegalArgumentException("Недоступный оператор")
    }
}

fun main() {
    val value1 = 20.0
    val value2 = 8.0
    val operator = '/'
    val result = calculate(value1, value2, operator)
    println("Ответ: $result")

    val names = arrayOf<String>("борис,алексей,хазар,тимур,илья,ярик,рамис")
    val my_name = "бахтияр"

    for (each in names){
        if (each.contains(my_name)){
            println(my_name)
        }else{
            println(my_name)
        }
    }



}