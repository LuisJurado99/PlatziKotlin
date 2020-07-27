import kotlin.collections.ArrayList

fun main(args: Array<String>) {
    val menu = """Selecciona la opción deseada
    1. Hacer una receta
    2. Ver mis recetas
    3. Salir""".trimIndent()
    val insumos: List<String> = listOf<String>(
        "Agua",
        "Leche",
        "Carnes",
        "Verduras",
        "Frutas",
        "Cereal",
        "Huevos",
        "Aceite"
    )
    var stringListM: List<String> = listOf<String>()
    var stringListofListd: List<List<String>> = listOf<List<String>>()
    hola@ do {
        println(menu)
        var response: String? = readLine()
        if (response.isNullOrEmpty()) response = "0"
        val option: Int = response.toInt()
        println(option)
        when (option) {
            1 -> {
                if (!stringListM.isEmpty()) {
                    stringListM = listOf<String>()
                }
                println("Hacer Receta\n Seleciona Ingredientes y cantidad")
                ingrediente@ do {
                    insumos.forEachIndexed { index, s ->
                        println("${index.inc()}.- $s")
                    }

                    println("${insumos.size.inc()}.- Salir")
                    var responseIng: String? = readLine()
                    if (responseIng.isNullOrEmpty()) responseIng = "10"
                    val optionIng: Int = responseIng.toInt()
                    when (optionIng) {
                        1 -> {
                            println(insumos.get(optionIng.dec()))
                            stringListM = stringListM.plus(insumos.get(optionIng.dec()))
                        }

                        2 -> {
                            println(insumos.get(optionIng.dec()))
                            stringListM = stringListM.plus(insumos.get(optionIng.dec()))
                        }

                        3 -> {
                            println(insumos.get(optionIng.dec()))
                            stringListM = stringListM.plus(insumos.get(optionIng.dec()))
                        }

                        4 -> {
                            println(insumos.get(optionIng.dec()))
                            stringListM = stringListM.plus(insumos.get(optionIng.dec()))
                        }

                        5 -> {
                            println(insumos.get(optionIng.dec()))
                            stringListM = stringListM.plus(insumos.get(optionIng.dec()))
                        }

                        6 -> {
                            println(insumos.get(optionIng.dec()))
                            stringListM = stringListM.plus(insumos.get(optionIng.dec()))
                        }

                        7 -> {
                            println(insumos.get(optionIng.dec()))
                            stringListM = stringListM.plus(insumos.get(optionIng.dec()))
                        }

                        8 -> {
                            println(insumos.get(optionIng.dec()))
                            stringListM = stringListM.plus(insumos.get(optionIng.dec()))
                        }

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
            }
            2 -> {
                stringListofListd.forEachIndexed { index, list ->
                    println("Receta ${index.inc()}")
                    list.forEach {
                        println("\tIngrediente $it")
                    }
                }

            }
            else -> continue@hola

        }

    } while (!option.equals(3))


}
