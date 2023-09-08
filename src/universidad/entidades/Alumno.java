/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidad.entidades;

import java.time.LocalDate;

/**
 *
 * @author Manuel
 */
public class Alumno {

    private int idAlumno; 
    private String apellido, nombre;
    private LocalDate fechaNac;
    boolean activo;

    //constructor vacio
    public Alumno() {
    }
    
    //Consctructor completo
    public Alumno(int idAlumno, String apellido, String nombre, LocalDate fechaNac) {
        this.idAlumno = idAlumno;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
    }
    
    //Constructor sin idAlumno
    public Alumno(String apellido, String nombre, LocalDate fechaNac, boolean activo) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.activo = activo;
    }
    
    //getter and setter
    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
}
