// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

data class ConteudoEducacional(private var nome: String, val duracao: Int = 60) {
    // Fornecer métodos getters e setters, se necessário.
}

class Formacao(val nome: String) {
    private val conteudos = mutableListOf<ConteudoEducacional>()

    fun adicionarConteudo(conteudo: ConteudoEducacional) {
        conteudos.add(conteudo)
    }
}


class Formacao(val nome: String) {
    private val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}


class Usuario(val nome: String, val email: String) {
    // Outros campos e métodos, se necessário.
}


fun main() {
    val conteudo1 = ConteudoEducacional("Introdução à Programação", 90)
    val conteudo2 = ConteudoEducacional("Banco de Dados", 120)
    val usuario1 = Usuario("João", "joao@email.com")
    val formacao1 = Formacao("Desenvolvedor Full Stack")

    formacao1.adicionarConteudo(conteudo1)
    formacao1.adicionarConteudo(conteudo2)
    formacao1.matricular(usuario1)

    println("Formação: ${formacao1.nome}")
    println("Conteúdos:")
    for (conteudo in formacao1.conteudos) {
        println("- ${conteudo.nome} (${conteudo.duracao} minutos)")
    }
    println("Inscritos: ${formacao1.inscritos.joinToString { it.nome }}")
}


