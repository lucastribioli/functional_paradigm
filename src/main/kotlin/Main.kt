fun main(args: Array<String>) {
//    testaTipoFuncaoReferencia()
//    testaTipoFuncaoClasse()
//    testaTipoFuncaoLambda()
//    testaTipoFuncaoAnonimo()
}




fun testaTipoFuncaoReferencia(){
    val teste = ::funcaoTeste
    print(teste("a", "b"))
}

fun testaTipoFuncaoClasse(){
    val teste = Funcao()
    print(teste(1, 2))
}


fun testaTipoFuncaoLambda(){
    val teste: (Int, Int) -> Int = {a, b ->
        println("Deu bom $a $b")
        a+b
    }
    print(teste(1, 2))
}

fun testaTipoFuncaoAnonimo(){
    val teste: () -> Int = fun(): Int {
        println("Deu certo")
        return 1
    }
    print(teste())
}
fun funcaoTeste(a: String, b: String): String{
    println("Deu bom")
    return a + b
}

class Funcao: (Int, Int) -> Unit{
    override fun invoke(p1: Int, p2: Int) {
        println("Deu certo $p1 e $p2")
    }

}