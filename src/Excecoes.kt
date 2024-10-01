// Exemplar de Tratamento de Exceções
fun subtrair(a: Int, b: Int): Int {
    return try {
        // Tenta realizar a subtração
        if (a < b) {
            throw IllegalArgumentException("Não é possível subtrair um número maior de um menor.")
        }
        a - b
    } catch (e: IllegalArgumentException) {
        // Captura a exceção se a subtração não for válida
        println("Erro: ${e.message}")  // Mensagem do erro
        0  // Retorna 0 caso ocorra a exceção
    }
}

fun main() {
    // ---- Tratamento de Exceções ----
    val resultadoSubtracao1 = subtrair(10, 5)  // Saída: 5
    println("Resultado da subtração: $resultadoSubtracao1")

    val resultadoSubtracao2 = subtrair(5, 10)  // Saída: Erro: Não é possível subtrair um número maior de um menor.
    println("Resultado da subtração: $resultadoSubtracao2")
}
