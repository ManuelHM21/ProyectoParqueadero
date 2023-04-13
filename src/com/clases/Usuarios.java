package com.clases;

public class Usuarios {
    private static String nombre;
    private static String correo;
    private static String usuario;
    private static String contraseña;
    private static String roll;

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public static String getNombre() {
        return nombre;
    }

    public static void setNombre(String nombre) {
        Usuarios.nombre = nombre;
    }

    public static String getCorreo() {
        return correo;
    }

    public static void setCorreo(String correo) {
        Usuarios.correo = correo;
    }
    
    
}
