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
public class Insumo extends TipoInsumo
{
    String codigoins;
    String estatus;
    Integer stock;
    Integer cantidad;

    public Insumo(String codigoins, String estatus, Integer stock, Integer cantidad, String codtipoins, String descripcionins, Integer cantidadins)
    {
        super(codtipoins, descripcionins, cantidadins);
        this.codigoins = codigoins;
        this.estatus = estatus;
        this.stock = stock;
        this.cantidad = cantidad;
    }

    public String getCodigoins()
    {
        return codigoins;
    }

    public void setCodigoins(String codigoins) 
    {
        this.codigoins = codigoins;
    }

    public String getEstatus()
    {
        return estatus;
    }

    public void setEstatus(String estatus) 
    {
        this.estatus = estatus;
    }

    public Integer getStock()
    {
        return stock;
    }

    public void setStock(Integer stock)
    {
        this.stock = stock;
    }

    public Integer getCantidad()
    {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) 
    {
        this.cantidad = cantidad;
    }
    
    
    
}