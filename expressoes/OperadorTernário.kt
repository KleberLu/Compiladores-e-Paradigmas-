fun main() {
    val a = 10
    val b = 20

    // Exemplo de substituição do operador ternário usando a expressão 'if' em Kotlin.
    // Em Kotlin, não existe o operador ternário como em outras linguagens (ex: (condição ? então : senão)).
    // No entanto, o mesmo comportamento pode ser implementado com a expressão 'if'.
    // A expressão 'if' retorna o valor de 'a' se a condição (a > b) for verdadeira,
    // caso contrário, retorna 'b'.
    val max = if (a > b) a else b

    // Imprime o maior valor entre 'a' e 'b'
    println("Maior valor entre a e b é: $max")
}