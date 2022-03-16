import java.text.DecimalFormat

fun hitungJarak (x1: Int, x2: Int, y1: Int, y2: Int):String{
    val df = DecimalFormat("#.##")
    var h1=x1-x2
    var p1=Math.pow(h1.toDouble(),2.0)
    var h2=y1-y2
    var p2=Math.pow(h2.toDouble(),2.0)
    var hasill=Math.sqrt(p1 + p2)
    var hsl=(df.format(hasill))
    return hsl
}
fun main() {
    println("Hasil hitung dari jarak titik pertama (2,3) dan (8,7) adalah = ${hitungJarak(2, 8, 3, 7)}")
    println("Hasil hitung dari jarak titik kedua (5,3) dan (-8,-4) adalah = ${hitungJarak(5, -8, 3, -4)}")
}