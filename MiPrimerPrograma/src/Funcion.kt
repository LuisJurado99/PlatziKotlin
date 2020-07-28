fun averageNumber(arrayNumbers : IntArray): Int{
    return arrayNumbers.sum()/arrayNumbers.size
}
fun evaluate(character: Char='=', number : Int=2) :String{
    return "${number} es Character ${character}"
}
fun main(args: Array<String>) {
 val numbers= intArrayOf(6,6,23,9,2,3,2)
    numbers.forEach { print("$it,") }
    println("\nEl promedio de los números es: ${averageNumber(numbers)} y con Kotlin es ${numbers.average()}")
    println(evaluate(number = 6,character = 'x'))
    println({d:Int,c:Int -> d+c}(4,3))
    var saludo = {println("Hola Mundo Lamba")}
    saludo()

}