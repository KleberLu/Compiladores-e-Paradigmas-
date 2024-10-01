// Linguagem e Processo de Compilação (Origem e Evolução, Domínios, Compilação e Interpretação)

// Exemplo simples de compilação em Kotlin
fun helloWorld(): Unit {
    println("Hello, Kotlin!")
}

// Tipos de Dados Primitivos

// Exemplo com tipos primitivos
fun primitiveTypes() {
    val intExample: Int = 10
    val doubleExample: Double = 10.5
    val charExample: Char = 'A'
    val booleanExample: Boolean = true

    println("Int: $intExample, Double: $doubleExample, Char: $charExample, Boolean: $booleanExample")
}

// Tipos Compostos Homogêneos (Vetores e Matrizes)

// Exemplo de vetor
fun arrayExample() {
    val numbers: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("Vetor: ${numbers.joinToString()}")
}

// Exemplo de matriz
fun matrixExample() {
    val matrix: Array<Array<Int>> = arrayOf(
        arrayOf(1, 2, 3),
        arrayOf(4, 5, 6),
        arrayOf(7, 8, 9)
    )
    println("Matriz: ")
    for (row in matrix) {
        println(row.joinToString())
    }
}

// Tipos Compostos Heterogêneos (Tuplas e Registros)

// Exemplo de tupla
fun tupleExample() {
    val tuple = Pair("Kotlin", 2024)
    println("Tupla: ${tuple.first}, ${tuple.second}")
}

// Exemplo de registro (data class)
data class Person(val name: String, val age: Int)

fun recordExample() {
    val person = Person("Alice", 25)
    println("Registro: ${person.name}, ${person.age}")
}

// Função principal que executa todos os exemplos
fun main() {
    // Exemplo de compilação
    helloWorld()

    // Tipos primitivos
    primitiveTypes()

    // Tipos compostos homogêneos
    arrayExample()
    matrixExample()

    // Tipos compostos heterogêneos
    tupleExample()
    recordExample()
}
