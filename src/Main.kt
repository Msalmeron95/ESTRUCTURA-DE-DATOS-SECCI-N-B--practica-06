import java.io.File

fun leerArchivo(ruta: String): String
{
    val archivo = File(ruta)
    return archivo.readText()
}

fun escribirEnArchivos(ruta: String, content: String)
{
    val archivo = File(ruta)
    archivo.writeText(content)  // Writing the provided content to the file
}

fun main(args: Array<String>) {
    // Correct file path
    val ruta = "C:/Users/Briya/Desktop/UNIVO/Kotlin/Practica 6/src/archivo.txt"

    /* Ejemplo 1 de lectura */
    val contenidoLeido = leerArchivo(ruta)
    println(contenidoLeido)

    /* Ejemplo 2 de escritura */
    val contenidoEscribir = "Escriba lo que quiera en su archivo."
    
    escribirEnArchivos(ruta, contenidoEscribir)
    println("Archivo creado exitosamente")
}