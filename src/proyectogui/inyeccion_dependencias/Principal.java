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
public class Principal {
    public static void main(String[] args){
//        IMedia im = null;
//        im = new MP3();
//        im = new MP4();
        
        MP3 mp3 = new MP3();
        
        ReproductorMultimedia rep = new ReproductorMultimedia();
        rep.play(mp3);
    }
}
