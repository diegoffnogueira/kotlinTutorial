fun main(args: Array<String>) {
    println("Bem vindo ao ByteBank")
//    val numeroDaConta = 1
//    val titular = "Alex"
//    val saldo = 100.0

//    val numeroDaConta: Int = 1
//    var titular: String = "Alex"
//    val saldo: Double = 100.0
//    titular = "Alex Felipe"

//    val conta = Conta()
//    conta.numeroDaConta = 1
//    conta.titular = "Diego"
//    conta.saldo = 100.0
//
//    println(conta)
//    println(conta.numeroDaConta)

    val produtoVazio = Produto()
    val tv = Produto("TV")
    val camiseta = Produto("Camiseta", "cor preta")
    val refrigerante = Produto(
            "Refrigerante",
            "Guarana",
            100
    )
    val chocolate = Produto(nome = "Chocolate", quantidade = 100)

    println(chocolate)

    mostraSomaTexto(2, 3)
    mostraSomaTexto(5, 8, "Resultado: ")

    println("${chocolate.nome} tem ${chocolate.nome.length} letras")


    val exec = Cliente.exe()
    println(exec)

    val maiusculo = Cliente.uppercase("texto")
    println(maiusculo)

    val bola = Cliente.Texto.bola()
    println(bola)

    println(Cliente.Dobro.num(5))


    println(Listagem.retornaLista("um, dois, tres, quatro"))

    val lista = Listagem.retornaLista("um, dois, tres, quatro")

    println(Listagem.retornaString(lista))

    println("101w".toIntOrNull())


}

fun mostraSomaTexto(n1: Int, n2:Int, msg: String = "Total da soma: "){
    val mensagemCompleta = msg + (n1 + n2)
    println(mensagemCompleta)
}