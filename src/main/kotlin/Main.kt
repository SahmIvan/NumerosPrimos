import kotlin.system.exitProcess

fun main() {
    println("Ingrese un número entero:")
    val numero = readLine()?.toIntOrNull()

    if (numero != null) {
        var esPrimo = true
        while(esPrimo == true){





            for (i in 2 until numero) {
                if (numero % i == 0) {
                    esPrimo = false
                    break
                }
            }


        if (esPrimo) {
            println("$numero es un número primo.")
        } else {
            println("$numero no es un número primo.")
        }
            esPrimo = false

    }

    }
        else {
        println("Entrada inválida. Por favor, ingrese un número entero válido.")
    }
}