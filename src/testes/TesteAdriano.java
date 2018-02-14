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
public class TesteAdriano extends ControladorPixels {

    int coluna;
    int linha;

    int direcao;

    @Override
    public void desenhar() {
        setColor(10, 10, Color.RED);
        setColor(11, 10, Color.RED);
        setColor(12, 10, Color.RED);
        setColor(10, 11, Color.BLUE);
        setColor(11, 11, Color.BLUE);
        setColor(12, 11, Color.BLUE);

        setColor(0, 30, Color.ORANGE);
        setColor(1, 30, Color.ORANGE);
        setColor(2, 30, Color.ORANGE);
        setColor(3, 30, Color.ORANGE);
        setColor(4, 30, Color.ORANGE);

        //-- Diagonal
        for (int i = 20; i < 50; i++) {
            setColor(i, i, Color.YELLOW);
        }

        //-- Linha
        for (int i = 1; i < this.getQtdeQuadroColunas() - 1; i++) {
            setColor(i, 1, Color.DARK_GRAY);
        }

        drawPixels();
    }

    @Override
    public void threadInicio() {
        coluna = 0;
        linha = 0;
        direcao = 1;
    }

    @Override
    public void threadDesenhar() {

        setColor(coluna, linha, Color.red);
        
        if (direcao == 1) {
            
            coluna++;
            if (coluna == this.getQtdeQuadroColunas()) {
                direcao=2;
                linha+=2;
                coluna--;
            }
            
        }else{
            
            coluna--;
            if (coluna == -1) {
                direcao=1;
                linha+=2;
                coluna++;
            }
            
        }

        
    }

}
