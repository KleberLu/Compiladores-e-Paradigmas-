// Função que simula uma tarefa demorada
fun tarefaDemorada(nome: String) {
    println("$nome: Tarefa iniciada")
    // Simulando um trabalho que demora 2 segundos
    Thread.sleep(2000)
    println("$nome: Tarefa finalizada")
}

fun main() {
    // ---- Exemplo de Programação Concorrente com Threads ----

    // Criando duas threads para executar tarefas simultaneamente
    val thread1 = Thread {
        tarefaDemorada("Thread 1")
    }

    val thread2 = Thread {
        tarefaDemorada("Thread 2")
    }

    // Iniciando as threads
    thread1.start()
    thread2.start()

    // Aguardando a conclusão das threads
    thread1.join()  // Espera a Thread 1 terminar
    thread2.join()  // Espera a Thread 2 terminar

    println("Todas as tarefas foram concluídas.")
}
