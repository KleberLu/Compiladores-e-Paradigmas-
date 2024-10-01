// Exemplo de Suporte a Programação Funcional com Lambda
// Uma função que recebe outra função como parâmetro
fun operarComNumero(numero: Int, operacao: (Int) -> Int): Int {
    return operacao(numero) // Executa a função passada como argumento
}

fun main() {
    // ---- Suporte a Programação Funcional ----
    val numeroOperado = operarComNumero(10) { it + 5 }  // Soma 5 ao número
    println("Resultado da operação: $numeroOperado")  // Saída: Resultado da operação: 15
}
