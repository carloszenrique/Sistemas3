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
class TipoInsumo 
{
    String codtipoins;
    String descripcionins;
    Integer cantidadins;

    public TipoInsumo(String codtipoins, String descripcionins, Integer cantidadins)
    {
        this.codtipoins = codtipoins;
        this.descripcionins = descripcionins;
        this.cantidadins = cantidadins;
    }

    public String getCodtipoins() 
    {
        return codtipoins;
    }

    public void setCodtipoins(String codtipoins)
    {
        this.codtipoins = codtipoins;
    }

    public String getDescripcionins() 
    {
        return descripcionins;
    }

    public void setDescripcionins(String descripcionins) 
    {
        this.descripcionins = descripcionins;
    }

    public void setCantidadins(Integer cantidadins) 
    {
        this.cantidadins = cantidadins;
    }
    
    
}
