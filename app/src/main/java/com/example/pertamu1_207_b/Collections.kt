fun contohList() {
    println("=== List ===")

    // list read only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    // list mutable
    val shape: MutableList<String> = mutableListOf("Circle", "Square", "Triangle")
    println(shape)

    shape.add("Circle")
    println(shape)

    shape.remove("Triangle")
    println(shape)

    println(shape.first())
    println(shape.last())
    println(shape.count())

    shape.removeAt(1)  // Use removeAt to remove by index
    println(shape)

    shape[0] = "Oval"
    println(shape)

    // list read only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}
fun main(){
    contohList()
}
