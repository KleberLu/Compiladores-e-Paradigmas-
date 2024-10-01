fun main() {
    // Os operadores Aritméticos
    val a = 10
    val b = 20
    println("Soma: ${a + b}")
    println("Subtração: ${b - a}")
    println("Multiplicação: ${a * b}")
    println("Divisão: ${b / a}")
    println("Módulo: ${b % a}")

    // Os operadores Relacionais
    println("a é maior que b? ${a > b}")
    println("a é menor que b? ${a < b}")
    println("a é igual a b? ${a == b}")
    println("a é diferente de b? ${a != b}")

    // Os operadores Lógicos
    val c = true
    val d = false
    println("c AND d: ${c && d}")
    println("c OR d: ${c || d}")
    println("NOT c: ${!c}")
}