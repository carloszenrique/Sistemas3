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
public class Almacen 
{
    String codalmacen;
    String descinsumo;

    public Almacen(String codalmacen, String descinsumo) 
    {
        this.codalmacen = codalmacen;
        this.descinsumo = descinsumo;
    }

    public String getCodalmacen() 
    {
        return codalmacen;
    }

    public void setCodalmacen(String codalmacen)
    {
        this.codalmacen = codalmacen;
    }

    public String getDescinsumo() 
    {
        return descinsumo;
    }

    public void setDescinsumo(String descinsumo) 
    {
        this.descinsumo = descinsumo;
    }
    
    
}
