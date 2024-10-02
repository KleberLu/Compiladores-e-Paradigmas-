fun main() {
    val a = 10
    val b = 20
    val c = 5

    // Exemplo de precedência de operadores
    // Em expressões como esta, os operadores são avaliados em uma ordem definida pela sua precedência.
    // A precedência dos operadores em Kotlin segue a ordem: operadores aritméticos > relacionais > lógicos.
    // Primeiro, a expressão 'a + b' (10 + 20) é avaliada, depois a expressão 'b - c' (20 - 5).
    // Em seguida, as comparações relacionais são feitas (>), e por último o operador lógico (&&).
    val result = a + b > c && b - c > a
    println("Resultado da expressão com precedência: $result") // true, pois (30 > 5) && (15 > 10)

    // Exemplo de associatividade
    // A associatividade define a direção de avaliação quando temos operadores de mesma precedência.
    // No caso de operadores aritméticos como + e -, a associatividade é da esquerda para a direita.
    // Portanto, 'a + b - c' é avaliado como '(a + b) - c', ou seja, 10 + 20 - 5 = 25.
    val result2 = a + b - c
    println("Resultado da expressão com associatividade: $result2") // 25
}