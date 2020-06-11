/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectogui.inyeccion_dependencias;

/**
 *
 * @author flor
 */
public class ReproductorMultimedia {
    public void play(IMedia medio){
        medio.beginplay();
    }
    
    public void stop(IMedia medio){
        medio.stopplay();
    }
}
