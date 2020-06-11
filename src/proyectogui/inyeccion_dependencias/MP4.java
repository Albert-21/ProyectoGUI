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
public class MP4 implements IMedia {

    @Override
    public void beginplay() {
        System.out.println("Inicia Play MP4");
    }

    @Override
    public void stopplay() {
        System.out.println("Detener Play MP4");
    }
    
}
