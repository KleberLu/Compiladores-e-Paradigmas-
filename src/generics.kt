// Exemplo de Programação Genérica
// Uma classe genérica que pode armazenar qualquer tipo de valor
class National<T>(private val valor: T) {
    fun mostrarValor() {
        println("O valor é: $valor")
    }
}

fun main() {
    // ---- Suporte a Programação Genérica ----
    val nationalDeInteiro = Caixa(10)  // Caixa de inteiros
    val nationalDeTexto = Caixa("Olá, Kotlin!")  // Caixa de strings
    nationalDeInteiro.mostrarValor()  // Saída: O valor é: 10
    nationalDeTexto.mostrarValor()  // Saída: O valor é: Olá, Kotlin!
}
