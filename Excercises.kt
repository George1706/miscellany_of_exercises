package com.example.miscellany_of_exercises.ui.theme
import kotlin.math.PI

fun main() {
    // Iniciar el programa
    showMainMenu()
}

// Show the menú principal
private fun showMainMenu() {
    var option: Int

    while (true) {
        println("===== MENÚ PRINCIPAL =====")
        println("1. Operadores")
        println("2. Condicionales")
        println("3. Ciclos")
        println("99. Salir")
        println("===========================")
        print("Ingrese una opción: ")
        option = readLine()?.toIntOrNull() ?: 0

        when (option) {
            1 -> operatorsMenu()
            2 -> conditionalsMenu()
            3 -> cyclesMenu()
            99 -> {
                println("Saliendo del programa...")
                return
            }
            else -> println("Opción inválida. Intente nuevamente.")
        }
    }
}

//Show Operators submenu
private fun operatorsMenu() {
    var option: Int

    while (true) {
        println("===== SUBMENÚ DE OPERADORES =====")
        println("1. Calcular el área de un triángulo")
        println("2. Ingresar dos números y sumarlos")
        println("3. Ingresar un número y visualizar el número elevado al cuadrado")
        println("4. Convertir euros a dólares")
        println("5. Calcular área y perímetro de un cuadrado")
        println("6. Calcular área y volumen de un cilindro")
        println("7. Calcular la longitud y el área del círculo inscrito")
        println("8. Calcular el promedio de tres números")
        println("99. Volver al menú principal")
        println("=================================")
        print("Ingrese una opción: ")
        option = readLine()?.toIntOrNull() ?: 0

        when (option) {
            1 -> calculateTriangleArea()
            2 -> addNumbers()
            3 -> squareNumber()
            4 -> convertEurosToDollars()
            5 -> calculateSquareAreaAndPerimeter()
            6 -> calculateCylinderAreaAndVolume()
            7 -> calculateCircumferenceLength()
            8 -> inputNumbers()
            99 -> return
            else -> println("Opción inválida. Intente nuevamente.")
        }
    }
}





/*-------------------------------------------------------------------------------------------*/
//1
private fun calculateTriangleArea(){
    println("Ingrese la longitud de la base del triángulo:")
    val base= readLine()?.toInt()
    println("Ingrese la longitud de la altura del triángulo:")
    val altura= readLine()?.toInt()
    val areaTriangulo = (base!! * altura!!)/2
    println("El área del triángulo es: $areaTriangulo")
}


//1

//2
private fun addNumbers() {
    println("Ingrese el primer número:")
    val num1 = readLine()?.toInt()

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toInt()

    val result = num1!! + num2!!
    println("$num1 + $num2 = $result")
}
//2

//3
private fun squareNumber() {
    println("Ingresa el número qeu quieres elevar al cuadrado : ")
    val number = readLine()?.toInt()
    val square = number!! * number
    println("$number elevado a la 2 es = $square")
}

//3

//4
private fun convertEurosToDollars() {
    println("Ingrese la cantidad de euros que desea convertir a dólares: ")
    val euros = readLine()?.toDouble()
    val exchangeRate = 1.11
    val dollars = euros!! * exchangeRate
    println("$euros euros son equivalentes a $dollars dólares")
}

//4

//5
private fun calculateSquareAreaAndPerimeter() {
    println("Ingrese la longitud del lado del cuadrado: ")
    val side = readLine()?.toDouble()
    val area = side!! * side
    val perimeter = 4 * side
    println("El área del cuadrado es = $area cm² y su perímetro es = $perimeter cm")
}

//5

//6
private fun calculateCylinderAreaAndVolume() {
    println("Ingrese el radio del cilindro: ")
    val r = readLine()?.toDouble()
    println("Ahora, ingrese la altura del cilindro: ")
    val h = readLine()?.toDouble()
    val cylinderArea = 2 * PI * r!! * (r + h!!)
    val cylinderVolume = PI * r * r * h
    println("El área del cilindro es: $cylinderArea y su volumen es: $cylinderVolume")
}

//6

//7
private fun calculateCircumferenceLength() {
    println("Ingrese el radio de la circunferencia: ")
    val radius = readLine()?.toDouble()
    val circumferenceLength = 2 * PI * radius!!
    val areaOfInscribedCircle = PI * radius * radius
    println("La longitud de la circunferencia es: $circumferenceLength y el área del circulo inscrito es: $areaOfInscribedCircle")
}

//7

//8
private fun inputNumbers() {
    println("Ingrese el primer número: ")
    val num1 = readLine()?.toDouble()
    println("Ingrese el segundo número: ")
    val num2 = readLine()?.toDouble()
    println("Ingrese el tercer número: ")
    val num3 = readLine()?.toDouble()
    val average = (num1!! + num2!! + num3!!) / 3
    println("El promedio de los 3 números que ingresaste es: $average")
}

//8
/*-------------------------------------------------------------------------------------------*/

/*-------------------------------------------------------------------------------------------*/

// Show Conditionals submenu
private fun conditionalsMenu() {
    var option: Int

    while (true) {
        println("===== SUBMENÚ DE CONDICIONALES =====")
        println("1. Determinar si un número es positivo o negativo")
        println("2. Comparar dos números y mostrar el mayor y menor")
        println("3. Encontrar el menor y el mayor de tres números")
        println("4. Según la condición sumar o restar dos números ")
        println("5. Calcular el cociente entre dos números")
        println("6. Según la condición sumar o multiplicar dos números ")
        println("7. Determinar si un año es bisiesto")
        println("99. Volver al menú principal")
        println("=====================================")
        print("Ingrese una opción: ")
        option = readLine()?.toIntOrNull() ?: 0

        when (option) {
            1 -> positiveNegativeNumber()
            2 -> findGreaterSmallerNumber()
            3 -> threePositiveNumbers()
            4 -> numberAB()
            5 -> divideNumbersAB()
            6 -> sumNumbersABOrMultiply()
            7 -> leapYear()
            99 -> return
            else -> println("Opción inválida. Intente nuevamente.")
        }
    }
}
//1
private fun positiveNegativeNumber() {
    println("Ingrese un número: ")
    val number = readLine()?.toDouble()

    if (number!! > 0) {
        println("$number es positivo")
    } else if (number < 0) {
        println("$number es negativo")
    } else{
        println("El número ingresado es cero")
    }
}

//2
private fun findGreaterSmallerNumber() {
    println("Ingrese el primer número:")
    val number1 = readLine()?.toDouble()
    println("Ingrese el segundo número:")
    val number2 = readLine()?.toDouble()

    if (number1!! > number2!!) {
        println("$number1 es mayor que $number2")
    } else if (number1 < number2) {
        println("$number2 es mayor que $number1")
    } else {
        println("Los números ingresados son iguales.")
    }
}
//2

//3
private fun threePositiveNumbers() {
    println("Recuerda que los números que debes ingresar deben ser positivos y también enteros.")
    println("Ingrese el primer número entero y positivo: ")
    val num1 = readLine()?.toIntOrNull()
    println("Ingrese el segundo número entero y positivo: ")
    val num2 = readLine()?.toIntOrNull()
    println("Ingrese el tercer número entero y positivo: ")
    val num3 = readLine()?.toIntOrNull()

    if (num1 != null && num2 != null && num3 != null) {
        val minNumber = minOf(num1, num2, num3)
        val maxNumber = maxOf(num1, num2, num3)
        println("El número mayor es: $maxNumber")
        println("El número menor es: $minNumber")
    } else {
        println("Los números deben ser enteros.")
    }
}
//3

//4
private fun numberAB() {
    println("Ingrese el número A: ")
    val A = readLine()?.toDouble()
    println("Ingrese el número B: ")
    val B = readLine()?.toDouble()

    if (A != null && B != null) {
        val result = if (A < B) {
            A + B
        } else {
            A - B
        }
        println("Tu resultado es: $result")
    }
}
//4

//5
private fun divideNumbersAB() {
    println("Ingrese el número A: ")
    val numA = readLine()?.toDouble()
    println("Ingrese el número B: ")
    val numB = readLine()?.toDouble()

    if (numB != 0.0) {
        val quotient = numA!! / numB!!
        println("El cociente entre $numA y $numB es = $quotient")
    } else {
        println("No se puede realizar la división, el divisor B no puede ser igual a cero. Por favor, inténtelo nuevamente.")
    }
}

//5

//6
private fun sumNumbersABOrMultiply() {
    println("Ingrese el número A: ")
    val numA = readLine()?.toDouble()
    println("Ingrese el número B: ")
    val numB = readLine()?.toDouble()

    if (numA == null || numB == null) {
        println("Por favor ingrese dos números válidos .")
        return
    }

    if (numA < 0 || numB < 0) {
        val sum = numA + numB
        println("El total de la suma es: $sum")
    } else {
        val multiplication = numA * numB
        println("El total de la multiplicación es: $multiplication")
    }
}
//6

//7
private fun leapYear() {
    println("Ingrese un año:")
    val year = readLine()?.toIntOrNull() ?: return

    val isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)

    if (isLeapYear) {
        println("$year es un año bisiesto.")
    } else {
        println("$year no es un año bisiesto.")
    }
}
//7

/*------------------------------------------------------------------------------------------------------*/

//Show Cycles submenu
private fun cyclesMenu() {
    var option: Int

    while (true) {
        println("===== SUBMENÚ DE CICLOS =====")
        println("1. Imprimir múltiplos de 3 entre 1 y 100")
        println("2. Imprimir números impares entre 0 y 100")
        println("3. Imprimir números pares entre 1 y 100")
        println("4. Imprimir cuadrados de los números del 1 al 30")
        println("5. Sumar cuadrados de los cien primeros números naturales")
        println("6. Generar y mostrar números entre dos valores")
        println("7. Sumar todos los números que se digitan por teclado mientras no sea cero")
        println("99. Volver al menú principal")
        println("=============================")
        print("Ingrese una opción: ")
        option = readLine()?.toIntOrNull() ?: 0

        when (option) {
            1 -> printMultiplesOfThree()
            2 -> printOddNumbers()
            3 -> printEvenNumbers()
            4 -> printSquaresUpTo30()
            5 -> sumSquaresOfFirstHundredNumbers()
            6 -> generateAndShowNumbersInRange()
            7 -> sumNumbersUntilZero()
            99 -> return
            else -> println("Opción inválida. Intente nuevamente.")
        }
    }
}
//1
private fun printMultiplesOfThree() {
    println("Los múltiplos de 3 entre 1 y 100 son:")
    for (i in 1..100) {
        if (i % 3 == 0) {
            print("$i ")
        }
    }
}
//1

//2
private fun printOddNumbers() {
    println("Los números impares entre 0 y 100 son: ")
    for (i in 1..100 step 2) {
        print("$i ")
    }
}
//2

//3
private fun printEvenNumbers() {
    println("Los números pares entre 1 y 100 son: ")
    for (i in 2..100 step 2) {
        print("$i ")
    }
}
//3

//4
private fun printSquaresUpTo30() {
    println("Los cuadrados de los números del 1 al 30 son: ")
    for (i in 1..30) {
        val square = i * i
        print("$square ")
    }
}
//4

//5
private fun sumSquaresOfFirstHundredNumbers() {
    var sum = 0
    for (i in 1..100) {
        sum += i * i
    }
    println("La suma de los cuadrados de los cien primeros números naturales es: $sum")
}
//5

//6
private fun generateAndShowNumbersInRange() {
    println("Ingrese el primer número:")
    val num1 = readLine()?.toIntOrNull() ?: return

    println("Ingrese el segundo número:")
    val num2 = readLine()?.toIntOrNull() ?: return

    println("Los números entre $num1 y $num2 en secuencia ascendente:")
    for (i in num1..num2) {
        print("$i ")
    }
}
//6

//7
private fun sumNumbersUntilZero() {
    var sum = 0
    var num: Int

    do {
        println("Ingrese un número (0 para terminar): ")
        num = readLine()?.toIntOrNull() ?: 0
        sum += num
    } while (num != 0)

    println("La suma de los números ingresados es: $sum")
}
//7