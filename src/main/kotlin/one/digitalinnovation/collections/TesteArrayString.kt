package one.digitalinnovation.collections

fun main() {
    val nomes = Array(size = 3) {""}
    nomes[0] = "Maria"
    nomes[1] = "zazá"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    println("===========")

    nomes.sort()

    nomes.forEach { println(it) }

    val nomes2 = arrayOf("Maria", "zazá", "Pedro")

    println("===========")

    nomes2.sort()

    nomes2.forEach { println(it) }
}