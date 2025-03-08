/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectogit;

/**
 * La clase Calculadora proporciona métodos para realizar operaciones 
 * matemáticas como suma, resta, multiplicación y división.
 * 
 * <p>
 * Esta clase permite realizar cálculos de manera sencilla 
 * y segura 
 * </p>
 * 
 * @author ivan
 * @version 1.0
 * @since 2025-03-07
 */
public class Calculadora {
    
    private String nombre; // Nombre de la calculadora

    /**
     * Constructor de la clase Calculadora.
     * <p>
     * Inicializa una nueva instancia de la calculadora con un nombre específico.
     * </p>
     *
     * @param nombre Nombre descriptivo para la calculadora.
     */
    public Calculadora(String nombre) {
        this.nombre = nombre;
    }
    
     /**
     * Realiza la suma de dos números y devuelve el resultado obtenido.
     *
     * @param a Primer número a sumar.
     * @param b Segundo número a sumar.
     * @return El resultado de la suma de a y b.
     */
    public int sumar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza la resta de dos números y devuelve el resultado obtenido.
     *
     * @param a Número del cual se resta.
     * @param b Número que se resta a a.
     * @return El resultado de la resta de a menos b.
     */
    public int restar(int a, int b) {
        return a - b;
    }

    /**
     * Realiza la multiplicación de dos números y devuelve el resultado obtenido.
     *
     * @param a Primer número a multiplicar.
     * @param b Segundo número a multiplicar.
     * @return El resultado de la multiplicación de a por b.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Realiza la división de dos números y devuelve el resultado obtenido.
     * <p>
     * Si el divisor es cero, lanza una excepción {@code ArithmeticException}.
     * </p>
     *
     * @param a El dividendo.
     * @param b El divisor (no puede ser 0).
     * @return El resultado de dividir a entre b.
     * @throws ArithmeticException Si el divisor es 0.
     */
    public double dividir(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("No se puede dividir por cero");
        }
        return (double) a / b;
    }
    
    /**
    * Calcula la potencia de un número elevado a un exponente.
    * <p>
    * Este método utiliza internamente el método {@link #multiplicar(int, int)}
    * para calcular la potencia mediante multiplicaciones sucesivas.
    * </p>
    *
    * @param base El número base.
    * @param exponente El exponente al que se eleva la base (debe ser mayor o igual a 0).
    * @return El resultado de base elevado a exponente.
    * @throws IllegalArgumentException Si el exponente es negativo.
    */
   public int calcularPotencia(int base, int exponente) {
       if (exponente < 0) {
           throw new IllegalArgumentException("El exponente no puede ser negativo");
       }

       int resultado = 1;
       for (int i = 0; i < exponente; i++) {
           resultado = multiplicar(resultado, base); // Llamada al método ya existente
       }
       return resultado;
    }
   
   
    /**
    * Calcula el promedio de un conjunto de números enteros.
    * 
    * <p>
    * Este método recibe un arreglo de enteros y devuelve el promedio de esos números.
    * Si el arreglo está vacío, lanza una excepción {@link IllegalArgumentException}.
    * </p>
    *
    * @param numeros Un arreglo de enteros del cual se calculará el promedio.
    * @return El promedio de los números proporcionados.
    * @throws IllegalArgumentException Si el arreglo está vacío.
    */
    public double calcularPromedio(int[] numeros) {
        if (numeros == null || numeros.length == 0) {
            throw new IllegalArgumentException("El arreglo de números no puede estar vacío.");
        }

        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }

        return (double) suma / numeros.length;
    }


}
