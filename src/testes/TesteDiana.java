/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import java.awt.Color;
import painelluminoso.ControladorPixels;

/**
 *
 * @author Adriano
 */
public class TesteDiana extends ControladorPixels {
    
    public int letraA(int x, Color cor){
        for(int i=4;i<12;i++){
           setColor(x, i, cor);
        }
        
        setColor(x+1, 3, cor);
        setColor(x+2, 2, cor);
        setColor(x+3, 2, cor);
        setColor(x+4, 3, cor);
        
        for(int i=4;i<12;i++){
           setColor(x+5, i, cor);
        }
        
        setColor(x+1, 7, cor);
        setColor(x+2, 7, cor);
        setColor(x+3, 7, cor);
        setColor(x+4, 7, cor);
        
        return 6;
        
    }
    
    public int letraD(int x, Color cor){
         for(int i=2;i<12;i++){
           setColor(x, i, cor);
        }
        
        // barriga
        setColor(x+1, 2, cor);
        setColor(x+2, 2, cor);
        setColor(x+3, 2, cor);
        setColor(x+1, 11, cor);
        setColor(x+2, 11, cor);
        setColor(x+3, 11, cor);
        setColor(x+4, 3, cor);
        setColor(x+5, 4,cor);
        setColor(x+4, 10, cor);
        setColor(x+5, 9, cor);
        setColor(x+5, 9, cor);
        setColor(x+6, 8, cor);
        setColor(x+6, 7, cor);
        setColor(x+6, 6, cor);
        setColor(x+6, 5, cor);
        
        return 7;
    }
    
    public int letraI(int x, Color cor){
        for(int i=4;i<12;i++){
           setColor(x, i, cor);
        }
        // pingo
        setColor(x, 2, cor);
        
        return 1;
    }
    
    public int letraN(int x, Color cor){
        for(int i=2;i<12;i++){
           setColor(x, i, cor);
        }
        
        for(int i=2;i<12;i++){
           setColor(x+5, i, cor);
        }
        
        int nx = x+1;
        int ny = 3;
        
        for(int i=0;i<4;i++){
           setColor(nx+i, ny+i, cor);
        }
        return 6;
    }
    
    public int numero0(int x, int y, Color cor){
        int limite = y;
        for(int i=y+2; i<limite+8; i++){
           setColor(x, i, cor);
        }
        
        for(int i=y+2; i<limite+8; i++){
           setColor(x+6, i, cor);
        }
        
        setColor(x+1, y+1, cor);
        setColor(x+2, y, cor);
        setColor(x+3, y, cor);
        setColor(x+4, y, cor);
        setColor(x+5, y+1, cor);
        setColor(x+5, y+8, cor);
        setColor(x+1, y+8, cor);
        setColor(x+2, y+9, cor);
        setColor(x+3, y+9, cor);
        setColor(x+4, y+9, cor);
        
        return 7;
    }
    
    public int numero1(int x, int y, Color cor){
        int limite = y;
        for(int i=y; i<limite+9; i++){
           setColor(x+2, i, cor);
        }
        setColor(x+1, y+1, cor);
        setColor(x, y+2, cor);
        
        setColor(x+2, y+9, cor);
        setColor(x+1, y+9, cor);
        setColor(x, y+9, cor);
        setColor(x+3, y+9, cor);
        setColor(x+4, y+9, cor);
        return 5;
    }
    
    @Override
    public void desenhar() {
        
        int posicao = 2;   
        
        posicao = posicao + 1 + letraD(posicao, Color.RED);
        
        posicao = posicao + 1 + letraI(posicao, Color.YELLOW);

        posicao = posicao + 1 + letraA(posicao, Color.PINK);
        
        posicao = posicao + 1 + letraN(posicao, Color.GREEN);
        
        posicao = posicao + 1 + letraA(posicao, Color.ORANGE);
        
        posicao = 2;
        
        posicao = posicao + 1 + numero0(posicao, 18, Color.red);
        posicao = posicao + 1 + numero1(posicao, 18, Color.yellow);
        
        posicao = 2;
        
        posicao = posicao + 1 + numero1(posicao, 30, Color.yellow);
        posicao = posicao + 1 + numero0(posicao, 30, Color.red);
        posicao = posicao + 1 + numero1(posicao, 30, Color.yellow);
        
        
        //-- Diagonal
//        for(int i=20;i<50;i++){
//            setColor(i, i, Color.YELLOW);
//        }
//
//        //-- Linha
//        for(int i=1;i<this.getQtdeQuadroColunas() -1;i++){
//            setColor(i,1, Color.DARK_GRAY);
//        }

        drawPixels();
    }

}
