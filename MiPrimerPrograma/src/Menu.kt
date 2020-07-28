import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    var stringListM: List<String> = listOf<String>()
    var stringListofListd: List<List<String>> = listOf<List<String>>()
    do {
        println(makeRepice())
        var opcion = leerOpciones()
        when (opcion) {
            1 -> stringListofListd = opcionUno(stringListM,stringListofListd)
            2 -> opcionDos(stringListofListd)
            3 -> println("Salir")
            else -> println("Opcion Incorrecta")
        }
    } while (!opcion.equals(3))
}

fun makeRepice(): String {
    return """Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir""".trimIndent()
}

fun leerOpciones(): Int {
    var response: String? = readLine()
    if (response.isNullOrEmpty()) response = "0"
    return response.toInt()
}

fun agregarArray(index: Int, insumos: List<String>): String {
    println(insumos.get(index))
    return insumos.get(index)
}
fun opcionUno( stringListMParam : List<String>, stringListofListdParam: List<List<String>>) : List<List<String>>{
    val insumos: List<String> = listOf<String>("Agua", "Leche", "Carnes", "Verduras", "Frutas",
            "Cereal", "Huevos", "Aceite")
    var stringListM = stringListMParam
    var stringListofListd = stringListofListdParam
    if (!stringListM.isEmpty()) stringListM = listOf<String>()
    println("Hacer Receta\n Seleciona Ingredientes")
    ingrediente@ do {
        insumos.forEachIndexed { index, s -> println("${index.inc()}.- $s") }
        println("${insumos.size.inc()}.- Salir")
        val optionIng = leerOpciones()
        when (optionIng) {
            1 -> stringListM = stringListM.plus(agregarArray(optionIng.dec(), insumos))
            2 -> stringListM = stringListM.plus(agregarArray(optionIng.dec(), insumos))
            3 -> stringListM = stringListM.plus(agregarArray(optionIng.dec(), insumos))
            4 -> stringListM = stringListM.plus(agregarArray(optionIng.dec(), insumos))
            5 -> stringListM = stringListM.plus(agregarArray(optionIng.dec(), insumos))
            6 -> stringListM = stringListM.plus(agregarArray(optionIng.dec(), insumos))
            7 -> stringListM = stringListM.plus(agregarArray(optionIng.dec(), insumos))
            8 -> stringListM = stringListM.plus(agregarArray(optionIng.dec(), insumos))
            9 -> {
                println("Salir")
                if (stringListM.isEmpty()) {
                    println("No has agregado un ingrediente")
                    continue@ingrediente
                }
                stringListofListd = stringListofListd.plusElement(stringListM)
            }
            else -> println("Opción incorrecta")
        }
    } while (!optionIng.equals(9))
    return stringListofListd
}

fun opcionDos(stringListofListd : List<List<String>>){
    if (stringListofListd.isEmpty()) println("No hay recetas") else {
        stringListofListd.forEachIndexed { index, list ->
            println("Receta ${index.inc()}")
            list.forEach {
                println("\tIngrediente $it")
            }
        }
    }

}