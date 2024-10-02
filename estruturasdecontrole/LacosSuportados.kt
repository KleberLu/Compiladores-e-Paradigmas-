fun main() {
    // For loop com intervalo
    // Este loop itera de 1 a 5 (incluindo 5) usando o intervalo '1..5'.
    for (i in 1..5) {
        println("For loop: i = $i") // Imprime o valor de 'i' a cada iteração
    }

    // For loop com array
    // Aqui, estamos criando um array de strings que contém nomes de linguagens de programação.
    val array = arrayOf("Kotlin", "Java", "Python")
    // Este loop itera sobre cada elemento do array, atribuindo o valor atual à variável 'language'.
    for (language in array) {
        println("Linguagem: $language") // Imprime cada linguagem do array
    }

    // While loop
    // Neste exemplo, 'x' é inicializado com 5.
    var x = 5
    // O loop continua enquanto 'x' for maior que 0.
    while (x > 0) {
        println("While loop: x = $x") // Imprime o valor de 'x' a cada iteração
        x-- // Decrementa 'x' em 1 a cada iteração
    }

    // Do-while loop
    // Aqui, 'y' é inicializado com 0.
    var y = 0
    // Este loop executa o bloco de código pelo menos uma vez,
    // pois a condição é verificada apenas após a execução do bloco.
    do {
        println("Do-while loop: y = $y") // Imprime o valor de 'y'
        y++ // Incrementa 'y' em 1 a cada iteração
    } while (y < 3) // O loop continua enquanto 'y' for menor que 3
}