fun main() {
    // Operadores Aritméticos
    // Declaração de duas variáveis inteiras
    val a = 10
    val b = 20

    // Soma de a e b
    println("Soma: ${a + b}")

    // Subtração de b por a
    println("Subtração: ${b - a}")

    // Multiplicação de a e b
    println("Multiplicação: ${a * b}")

    // Divisão de b por a (resultado será um número inteiro, pois ambas as variáveis são inteiras)
    println("Divisão: ${b / a}")

    // Módulo (resto da divisão de b por a)
    println("Módulo: ${b % a}")

    // Operadores Relacionais
    // Verifica se a é maior que b (retorna um valor booleano)
    println("a é maior que b? ${a > b}")

    // Verifica se a é menor que b (retorna um valor booleano)
    println("a é menor que b? ${a < b}")

    // Verifica se a é igual a b (retorna verdadeiro se os dois valores forem iguais)
    println("a é igual a b? ${a == b}")

    // Verifica se a é diferente de b (retorna verdadeiro se os dois valores forem diferentes)
    println("a é diferente de b? ${a != b}")

    // Operadores Lógicos
    // Declaração de duas variáveis booleanas
    val c = true
    val d = false

    // Operação lógica AND (retorna verdadeiro se ambas as expressões forem verdadeiras)
    println("c AND d: ${c && d}")

    // Operação lógica OR (retorna verdadeiro se uma das expressões for verdadeira)
    println("c OR d: ${c || d}")

    // Operação lógica NOT (inverte o valor booleano de c)
    println("NOT c: ${!c}")
}