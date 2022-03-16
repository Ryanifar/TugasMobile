class barang (nama:String, harga:Int, jumlah:Int, diskon:Double){
    private var nama: String = nama
    private var harga: Int = harga
    private var jumlah:Int = jumlah
    private var diskon: Double = diskon
    fun tampil() {
        println("Nama        : "+nama)
        println("Harga       : "+harga)
        println("Jumlah      : "+jumlah)
        println("Diskon      : "+diskon)
    }
    fun hitungTotal():Double {
        return harga * jumlah * diskon
    }
}
fun main() {
    val cetak = barang("Red Bull Energy Drink", 20000, 1, 0.7)
    cetak.tampil()
    println("\nTotal harga : ${cetak.hitungTotal()}")
}