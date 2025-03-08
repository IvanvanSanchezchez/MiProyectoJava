/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projectogit;

/**
 *
 * @author ivan
 */
public class Login {

    // Simulando credenciales almacenadas (puedes reemplazarlo con una base de datos)
    private static final String USUARIO_CORRECTO = "admin";
    private static final String CONTRASENA_CORRECTA = "1234";

    // Método para autenticar al usuario
    public boolean autenticar(String usuario, String contraseña) {
        return USUARIO_CORRECTO.equals(usuario) && CONTRASENA_CORRECTA.equals(contraseña);
    }

    public static void main(String[] args) {
        Login login = new Login();

        // Pruebas de autenticación
        System.out.println(login.autenticar("admin", "1234")); // true
        System.out.println(login.autenticar("usuario", "clave")); // false
    }
}
