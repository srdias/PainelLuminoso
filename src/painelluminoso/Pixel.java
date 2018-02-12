/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painelluminoso;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author Adriano
 */
public class Pixel {
    
    private int indiceX;
    private int indiceY;
    
    private int x;
    private int y;
    private int w;
    private int h;
    
    private Color corFundo;
    
    public Pixel(int indiceX, int indiceY, int x, int y, int w, int h) {
        this.indiceX = indiceX;
        this.indiceY = indiceY;
        this.x = x;
        this.y = y;
        this.w = w;
        this.h = h;
        corFundo = Color.WHITE;
    }
    
    public int getX() {
        return x;
    }
    
    public void setX(int x) {
        this.x = x;
    }
    
    public int getY() {
        return y;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public int getW() {
        return w;
    }
    
    public void setW(int w) {
        this.w = w;
    }
    
    public int getH() {
        return h;
    }
    
    public void setH(int h) {
        this.h = h;
    }
    
    public int getIndiceX() {
        return indiceX;
    }
    
    public void setIndiceX(int indiceX) {
        this.indiceX = indiceX;
    }
    
    public int getIndiceY() {
        return indiceY;
    }
    
    public void setIndiceY(int indiceY) {
        this.indiceY = indiceY;
    }
    
    void draw(Graphics g) {
        
        
        g.setColor(Color.GRAY);
        
        g.drawRect(this.getX(),
                this.getY(),
                this.getW(),
                this.getH());
        
        
        g.setColor(corFundo);
        g.fillRect(this.getX()+1,
                this.getY()+1,
                this.getW()-1,
                this.getH()-1);
    }
    
    public Color getCorFundo() {
        return corFundo;
    }
    
    public void setCorFundo(Color corFundo) {
        this.corFundo = corFundo;
    }
    
}
