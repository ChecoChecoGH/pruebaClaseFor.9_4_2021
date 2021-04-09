fun main(args: Array<String>) {
    /*
    val lista = mutableListOf("Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete")
    lista.forEach{
        var aux = 0
        it.forEach{
            aux++
        }
        if(aux%2 == 0){
            println(it)
        }
    }

    //Segundo ejercicio

    val lista = mutableListOf("Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete")
    for (i in 0..lista.count()){
        if(i%2 == 0){
            println(lista[i])
        }
    }


    //Tercer ejercicio --> imprimir todos los que tengan una a
    val lista = mutableListOf("Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete")
    var encontrado = false
    var i = 0
    var TAM = 0
    lista.forEach{
        i = 0
        encontrado = false
        TAM = it.length
        do{
            if(it[i].toUpperCase() == 'A') {
                encontrado = true
                println(it)
            }
            i++
        }while (!encontrado && i < TAM)


    }
*/

    //Cuarto ejercicio mostrar elementos con la letra o y no esten ni en la primera ni en la última posicion

    val lista = mutableListOf("Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete")
    var palabra = ""
    var j = 0
    var encontrado = false
    val TAM = lista.count()-1
    var TAMPALABRA = 0

    for(i in 1..TAM){
        palabra = lista[i]
        TAMPALABRA = palabra.length
        j = 0
        encontrado = false
        do{
            if(palabra[j].toUpperCase() == 'O'){
                encontrado=true
                println(palabra)
            }
            j++
        }while (!encontrado && j < TAMPALABRA)
    }

}