// Exemplar de Tratamento de Eventos
// Classe para simular um formulário
class Formulario {
    // Função para simular o envio do formulário com um callback de evento
    fun enviarFormulario(callback: () -> Unit) {
        println("Formulário enviado!")
        callback()  // Executa a função passada como evento
    }
}

fun main() {
    // ---- Tratamento de Eventos ----
    val formulario = Formulario()
    formulario.enviarFormulario {
        println("Evento de envio de formulário processado!")  // Executado quando o formulário é "enviado"
    }
}
