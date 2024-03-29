package section07.kotlincode07

import java.math.BigDecimal

fun main(args: Array<String>) {

    val mixedList: List<Any> = listOf("string", 1, BigDecimal(22.5))
    val bigDecimalOnly = getElementsOfType<BigDecimal>(mixedList)

    for (item in bigDecimalOnly) {
        println(item)
    }

}

inline fun <reified T> getElementsOfType(list: List<Any>): List<T> {
    var newList: MutableList<T> = mutableListOf()
    for (element in list) {
        if (element is T) {
            newList.add(element)
        }
    }
    return newList
}