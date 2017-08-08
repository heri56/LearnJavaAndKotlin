package kelasjava

object GetClassKotlin{
    @JvmStatic
    fun main(args: Array<String>) {
        val getnamakelas = GetClassKotlin::class.java
        val getkelasaja = GetClassKotlin::class.java.simpleName

        val getpackage = GetClassKotlin::class.java.`package`
        val getpackageaja = GetClassKotlin::class.java.`package`.name

        println("Nama Kelas = " +getnamakelas.toString())
        println("Nama Kelas  Aja = " +getkelasaja.toString())
        println("Nama Package = " +getpackage.toString())
        println("Nama Package Aja = " +getpackageaja.toString())
    }
}
