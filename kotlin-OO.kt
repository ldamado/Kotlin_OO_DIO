// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel {BASICO, INTERMEDIARIO, AVANCADO}

data class Estudantes (val nome: String) {
    override fun toString(): String {
        return "\nAlunos da escola: $nome"
    }
}

data class Usuario (val nome: String, val telefone: Int) {
    override fun toString(): String {
        return "Nome: $nome \nTelefone: $telefone"
    }
}

data class ConteudoEducacional(val nome: String, val duracao: Int, val preco: Double) {
    override fun toString(): String {
        return "\n$nome (duração de $duracao horas) \nPreço: R$$preco,0"
    }
}

data class Formacao(val nome: String, val conteudos: ArrayList<ConteudoEducacional>, val nivel: Nivel, val duracao: Int, val preco: Double) {
            override fun toString(): String {
            return "Nível: $nivel \nNome da formação: $nome \nDuração: $duracao horas \nValor total: $preco,0 \nConteúdos: $conteudos"
        }

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos += usuario
    }
}

fun main() {

    val estudantes = Estudantes("João, Marcos, Luiza")

    val joao = Usuario("João", 9111111)
    val marcos = Usuario("Marcos", 9222222)
    val luiza = Usuario("Luiza", 9333333)

    val kotlinConteudo = arrayListOf<ConteudoEducacional> (
        ConteudoEducacional("Fundamentos da linguagem Kotlin", 120, 50.00),
        ConteudoEducacional("Kotlin Orientado a Objetos", 120, 100.00),
        ConteudoEducacional("Kotlin no mercado de trabalho", 120, 120.00)
    )

    val pythonConteudo = arrayListOf<ConteudoEducacional> (
        ConteudoEducacional("Fundamentos da linguagem Python", 120, 50.00),
        ConteudoEducacional("Python Orientado a Objetos", 240, 120.00),
        ConteudoEducacional("Python para desenvolvimento web", 180, 150.00)
    )

    val javaConteudo = arrayListOf<ConteudoEducacional> (
        ConteudoEducacional("Fundamentos da linguagem Java", 120, 50.00),
        ConteudoEducacional("Java Orientado a Objetos", 240, 150.00),
        ConteudoEducacional("Java para Back-end", 180, 200.00)
    )

    val formacaoKotlin = Formacao("Kotlin", kotlinConteudo, Nivel.BASICO, 360, 270.00)
    formacaoKotlin.matricular(joao)

    val formacaoPython = Formacao("Python", pythonConteudo, Nivel.INTERMEDIARIO, 540, 320.00)
    formacaoPython.matricular(marcos)

    val formacaoJava = Formacao("Java", javaConteudo, Nivel.AVANCADO, 540, 400.00)
    formacaoJava.matricular(luiza)
    
    println(estudantes)
    println("\n")

    println(formacaoKotlin.inscritos.toString().replace("[", "").replace("]", ""))
    println(formacaoKotlin.toString().replace(",", "").replace("[", "").replace("]", ""))
    println("\n")
    
    println(formacaoPython.inscritos.toString().replace("[", "").replace("]", ""))
    println(formacaoPython.toString().replace(",", "").replace("[", "").replace("]", ""))
    println("\n")
    
    println(formacaoJava.inscritos.toString().replace("[", "").replace("]", ""))
    println(formacaoJava.toString().replace(",", "").replace("[", "").replace("]", ""))
}
