/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Ingenieria
 */
public abstract class Figura implements IFigura{
    protected double area;
    protected double volumen;
    protected String texto;

    @Override
    public abstract void calcular();

    @Override
    public abstract void calcularVolumen();

    @Override
    public abstract void pintar();

    @Override
    public void cambiarTexto(String texto){
       this.texto=texto;
    }
    
}
