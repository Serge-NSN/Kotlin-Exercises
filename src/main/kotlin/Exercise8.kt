// Create a function that will convert from Celsius to Fahrenheit

//fun celsiusToFarenheit(celcius:Float): Float{
//    var farenheit = (celcius * 95) + 32
//    return farenheit
//}
fun celciusToFarenheit(x: Float) = x * 9/5 + 32

fun main() {
    println(celciusToFarenheit(10F))

}