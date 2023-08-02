fun findSmallestNumberIn(list: ArrayList<Int>): Int {
    var smallestElement = list[0]
    var smallestElementIndex = 0
    for (i in 0..< list.size) {
        if (list[i] < smallestElement) {
            smallestElement = list[i]
            smallestElementIndex = i
        }
    }
    return smallestElementIndex
}

fun selectionSort(list: ArrayList<Int>): ArrayList<Int> {
    val sortedArray = ArrayList<Int>()
    for (i in 0..< list.size) {
        val smallestElement = findSmallestNumberIn(list)
        sortedArray.add(list.removeAt(smallestElement))
    }
    return sortedArray
}

fun main() {
    val sampleList = arrayListOf(4, 5, 3, 6, 2, 10)

    println("Sorted Array: ${selectionSort(sampleList)}")
}