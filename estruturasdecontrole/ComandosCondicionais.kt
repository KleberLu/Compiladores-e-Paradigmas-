fun main() {
    val number = 10

    // Exemplo de estrutura condicional If-Else
    // Se a condição 'number > 0' for verdadeira, imprime que o número é positivo.
    // Caso contrário, imprime que o número é negativo ou zero.
    if (number > 0) {
        println("$number é positivo")
    } else {
        println("$number é negativo ou zero")
    }

    // If-Else como expressão
    // Aqui, 'if' é usado como uma expressão que retorna um valor.
    // Se 'number % 2 == 0' for verdadeiro, a string "par" é atribuída a 'result',
    // caso contrário, a string "ímpar" é atribuída.
    val result = if (number % 2 == 0) "par" else "ímpar"
    println("O número $number é $result")

    // When (equivalente ao switch em outras linguagens como Java ou C)
    // O valor da variável 'dayOfWeek' é comparado com cada caso.
    // Dependendo do valor, a variável 'dayName' recebe o nome correspondente ao dia da semana.
    // O bloco 'else' age como um caso padrão, se nenhuma das opções anteriores for atendida.
    val dayOfWeek = 3
    val dayName = when (dayOfWeek) {
        1 -> "Domingo"
        2 -> "Segunda-feira"
        3 -> "Terça-feira"
        4 -> "Quarta-feira"
        5 -> "Quinta-feira"
        6 -> "Sexta-feira"
        7 -> "Sábado"
        else -> "Dia inválido" // Valor padrão caso 'dayOfWeek' não corresponda a nenhum dos casos acima
    }
    println("Dia da semana: $dayName")
}