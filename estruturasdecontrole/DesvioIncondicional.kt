fun main() {
    // A label 'loop@' é associada ao loop externo 'for (i in 1..5)'.
    // Isso permite que possamos usar 'break@loop' para sair deste loop específico.
    loop@ for (i in 1..5) {
        for (j in 1..5) {
            // Quando i for igual a 3 e j for igual a 3, o loop externo será interrompido
            if (i == 3 && j == 3) {
                println("Saindo do loop quando i = $i e j = $j")
                // 'break@loop' encerra o loop externo, marcado com o label 'loop'
                break@loop
            }
            // Exibe os valores de i e j a cada iteração
            println("i = $i, j = $j")
        }
    }
}