/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tankattack.clases;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author cesar
 */
public class Base {
    
    /* Objeto contenedor */
    Tablero tablero;
    
    int x; // Posicion en x
    int y; // Posicion en y
    int w = 50;
    int h = 50;
    
    Image baseImg;
    
    public Base(Tablero t, int x, int y, String color){
        
        tablero = t;
        this.x = x;
        this.y = y;
        
        baseImg = new ImageIcon(this
            .getClass()
            .getResource("/tankattack/imagenes/muro/"+color+".png")).getImage();
        
    }
    
    public void paint(Graphics2D g2){
        
        g2.drawImage(baseImg, x, y, w, h, null);
    
    }
    
    public void eventos(MouseEvent me){
        
    }
    
    public void eventos(KeyEvent ke){
    
    }
    
    public void actualizar(){
    
    }
    
}

    
