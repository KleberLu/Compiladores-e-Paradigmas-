// Exemplo de Programação Genérica
// Uma classe genérica que pode armazenar qualquer tipo de valor
class Caixa<T>(private val valor: T) {
    fun mostrarValor() {
        println("O valor é: $valor")
    }
}

// Exemplo de Suporte a Programação Funcional com Lambda
// Uma função que recebe outra função como parâmetro
fun processarNumero(numero: Int, operacao: (Int) -> Int): Int {
    return operacao(numero) // Executa a função passada como argumento
}

// Exemplo de Tratamento de Exceções
fun dividir(a: Int, b: Int): Int {
    return try {
        // Tenta realizar a divisão
        a / b
    } catch (e: ArithmeticException) {
        // Captura a exceção de divisão por zero
        println("Erro: divisão por zero")
        0  // Retorna 0 caso ocorra a exceção
    }
}

// Exemplo de Tratamento de Eventos
// Um simples listener para simular o clique de um botão
class Botao {
    // Função de simulação de clique com um callback de evento
    fun setOnClickListener(callback: () -> Unit) {
        println("Botão clicado!")
        callback()  // Executa a função passada como evento
    }
}

fun main() {
    // ---- Suporte a Programação Genérica ----
    val caixaDeInteiro = Caixa(10)  // Caixa de inteiros
    val caixaDeTexto = Caixa("Olá, Kotlin!")  // Caixa de strings
    caixaDeInteiro.mostrarValor()  // Saída: O valor é: 10
    caixaDeTexto.mostrarValor()  // Saída: O valor é: Olá, Kotlin!

    // ---- Suporte a Programação Funcional ----
    val numeroProcessado = processarNumero(5) { it * 2 }
    println("Número processado: $numeroProcessado")  // Saída: Número processado: 10

    // ---- Tratamento de Exceções ----
    val resultadoDivisao1 = dividir(10, 2)  // Saída: 5
    println("Resultado da divisão: $resultadoDivisao1")
    val resultadoDivisao2 = dividir(10, 0)  // Saída: Erro: divisão por zero, 0
    println("Resultado da divisão: $resultadoDivisao2")

    // ---- Tratamento de Eventos ----
    val botao = Botao()
    botao.setOnClickListener {
        println("Evento de clique processado!")  // Executado quando o botão é "clicado"
    }

    // ---- Outros Paradigmas (Programação Funcional) ----
    // Trabalhando com uma lista de números e funções de alto nível como map e filter
    val listaDeNumeros = listOf(1, 2, 3, 4, 5)
    val numerosPares = listaDeNumeros.filter { it % 2 == 0 }  // Filtrando números pares
    println("Números pares: $numerosPares")  // Saída: Números pares: [2, 4]
}
