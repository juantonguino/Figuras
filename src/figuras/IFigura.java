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
public interface IFigura {
    public void calcular();
    public void calcularVolumen();
    public void pintar();
    public void cambiarTexto(String texto);
}
