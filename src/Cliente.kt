class Cliente {

    companion object {
        fun exe(): String {
            return "alguma coisa aqui"
        }

        fun uppercase(s: String): String = s.toUpperCase()
    }

    object Texto {
        fun bola(): String = "Bola"
    }

    object Dobro{
        fun num(n: Int): Int = n * 2
    }

}