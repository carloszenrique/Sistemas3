/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author Carlos Enrique
 */
public class Tarea extends TipoOrganizacion
{
    String codigot;
    String nombre;

    public Tarea(String codigot, String nombre, String codigo, String descripcion)
    {
        super(codigo, descripcion);
        this.codigot = codigot;
        this.nombre = nombre;
    }

    public String getCodigot()
    {
        return codigot;
    }

    public void setCodigot(String codigot)
    {
        this.codigot = codigot;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }
    
    

}
