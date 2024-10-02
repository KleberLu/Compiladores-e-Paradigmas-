fun main() {
    val a = 10
    val b = 20

    // Curto-circuito em operação AND
    // No operador AND (&&), se a primeira condição for falsa, a segunda não será avaliada,
    // pois o resultado já será falso. No entanto, aqui (a > 5) é verdadeiro,
    // então a segunda condição (b < 10) é avaliada.
    val result1 = (a > 5) && (b < 10)
    println("Resultado AND curto-circuito: $result1") // A segunda condição é falsa, então o resultado é false

    // Curto-circuito em operação OR
    // No operador OR (||), se a primeira condição for verdadeira, a segunda não será avaliada,
    // pois o resultado já será verdadeiro. No entanto, aqui (a > 15) é falso,
    // então a segunda condição (b > 15) é avaliada.
    val result2 = (a > 15) || (b > 15)
    println("Resultado OR curto-circuito: $result2") // A segunda condição é verdadeira, então o resultado é true
}