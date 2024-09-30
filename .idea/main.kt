fun main() {
    println("Iniciando a execução...")

    exemplo1()
    exemplo2()
    exemplo3()
    exemplo4()
    exemplo5()
    exemplo6()
    exemplo7()fun main() {
        println("Iniciando a execução...")

        exemplo1()
        exemplo2()
        exemplo3()
        exemplo4()
        exemplo5()
        exemplo6()
        exemplo7()

        println("Execução concluída.")
    }

    fun exemplo1() {
        println("Rodando exemplo 1...")
        fun greet(name: String): String {
            return "Hello, $name!"
        }
        println(greet("John"))
    }

    fun exemplo2() {
        println("Rodando exemplo 2...")
        fun greet(name: String = "Guest"): String {
            return "Hello, $name!"
        }
        println(greet())
        println(greet("Alice"))
    }

    fun exemplo3() {
        println("Rodando exemplo 3...")
        fun printNames(vararg names: String) {
            for (name in names) {
                println(name)
            }
        }
        printNames("Alice", "Bob", "Charlie")
    }

    fun exemplo4() {
        println("Rodando exemplo 4...")
        fun modifyList(list: MutableList<Int>) {
            list.add(42)
        }
        val numbers = mutableListOf(1, 2, 3)
        modifyList(numbers)
        println(numbers)
    }

    fun exemplo5() {
        println("Rodando exemplo 5...")
        fun add(a: Int, b: Int) = a + b
        val operation: (Int, Int) -> Int = ::add
        println(operation(3, 4))
    }

    fun exemplo6() {
        println("Rodando exemplo 6...")
        fun greet(): String {
            return "Hello!"
        }
        fun greet(name: String): String {
            return "Hello, $name!"
        }
        println(greet())
        println(greet("John"))
    }

    fun exemplo7() {
        println("Rodando exemplo 7...")
        val sum = { a: Int, b: Int -> a + b }
        println(sum(3, 4))
    }

    println("Execução concluída.")
}

fun exemplo1() {
    println("Rodando exemplo 1...")
    fun greet(name: String): String {
        return "Hello, $name!"
    }
    println(greet("John"))
}

fun exemplo2() {
    println("Rodando exemplo 2...")
    fun greet(name: String = "Guest"): String {
        return "Hello, $name!"
    }
    println(greet())
    println(greet("Alice"))
}

fun exemplo3() {
    println("Rodando exemplo 3...")
    fun printNames(vararg names: String) {
        for (name in names) {
            println(name)
        }
    }
    printNames("Alice", "Bob", "Charlie")
}

fun exemplo4() {
    println("Rodando exemplo 4...")
    fun modifyList(list: MutableList<Int>) {
        list.add(42)
    }
    val numbers = mutableListOf(1, 2, 3)
    modifyList(numbers)
    println(numbers)
}

fun exemplo5() {
    println("Rodando exemplo 5...")
    fun add(a: Int, b: Int) = a + b
    val operation: (Int, Int) -> Int = ::add
    println(operation(3, 4))
}

fun exemplo6() {
    println("Rodando exemplo 6...")
    fun greet(): String {
        return "Hello!"
    }
    fun greet(name: String): String {
        return "Hello, $name!"
    }
    println(greet())
    println(greet("John"))
}

fun exemplo7() {
    println("Rodando exemplo 7...")
    val sum = { a: Int, b: Int -> a + b }
    println(sum(3, 4)
}