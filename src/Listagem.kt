class Listagem() {

    companion object {
        fun retornaLista(lista: String) : List<String>{
            println("====== String para Lista =====")
            return lista.split(",").map { it.toUpperCase().trim() }
        }

        fun retornaString(lista: List<String>): String{
            return lista.joinToString(":", "<<", ">>", 2, "acabou")
        }
    }

}