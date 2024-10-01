// Classe para representar um número
class Numero(val valor: Int) {
    // Método para calcular o quadrado do número
    fun quadrado(): Int {
        return valor * valor
    }
}

fun main() {
    // ---- Outros Paradigmas (Programação Orientada a Objetos e Funcional) ----

    // Criando uma lista de objetos Numero
    val listaDeNumeros = listOf(Numero(1), Numero(2), Numero(3), Numero(4), Numero(5))

    // Usando map para calcular o quadrado de cada número
    val quadrados = listaDeNumeros.map { it.quadrado() }  // Mapeia cada objeto Numero para seu quadrado

    // Usando filter para pegar os quadrados pares
    val quadradosPares = quadrados.filter { it % 2 == 0 }  // Filtrando quadrados pares

    // Usando reduce para somar todos os quadrados
    val somaDosQuadrados = quadrados.reduce { acumulador, proximo -> acumulador + proximo }  // Soma todos os quadrados

    // Saída dos resultados
    println("Quadrados: $quadrados")  // Saída: Quadrados: [1, 4, 9, 16, 25]
    println("Quadrados pares: $quadradosPares")  // Saída: Quadrados pares: [4, 16]
    println("Soma dos quadrados: $somaDosQuadrados")  // Saída: Soma dos quadrados: 55
}
