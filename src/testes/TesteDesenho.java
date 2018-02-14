
package testes;

import java.awt.Color;
import painelluminoso.ControladorPixels;

public class TesteDesenho extends ControladorPixels {
    
    @Override
    public void desenhar() {
        Color minhaCor = new Color(0, 102, 102);
        Color minhaCor2 = new Color(26, 255, 255);
        Color minhaCor3 = new Color(0, 179, 179);
        Color minhaCor4 = new Color(77, 38, 0);
        Color minhaCor5 = new Color(26, 13, 0);
        Color minhaCor6 = new Color(102, 51, 0);
        
       
        
        linhaLado(5, 10, 5, minhaCor);
        
        linhaBaixo(5, 10, 5, minhaCor);
        
        linhaDiagonalCima(5, 15, minhaCor, 8); //proporcional de 5 em inicio da diagonal e limite dela
        linhaDiagonalCima(9, 19, minhaCor, 4);//proporcional de 5 em inicio da diagonal e limite dela
        linhaDiagonalCima(9, 19, minhaCor2, 5);//proporcional de 5 em inicio da diagonal e limite dela
        linhaDiagonalCima(8, 18, minhaCor2, 5);//proporcional de 5 em inicio da diagonal e limite dela
        
        linhaDiagonalCima(6, 16, minhaCor2, 8);//proporcional de 5 em inicio da diagonal e limite dela
        linhaDiagonalCima(6, 16, minhaCor2, 7);//proporcional de 5 em inicio da diagonal e limite dela
        
        
        linhaDiagonalCima(6, 18, minhaCor3, 5);//proporcional de 5 em inicio da diagonal e limite dela
        linhaDiagonalCima(6, 17, minhaCor3, 6);//proporcional de 5 em inicio da diagonal e limite dela
        linhaDiagonalCima(7, 18, minhaCor3, 5);//proporcional de 5 em inicio da diagonal e limite dela
        
        
        linhaDiagonalBaixo(22, 11, minhaCor, 11);
        linhaDiagonalBaixo(24, 13, minhaCor, 13);
        //--------------------------------------- cor de dentro
        linhaDiagonalBaixo(23, 12, minhaCor2, 12);
        linhaDiagonalBaixo(23, 12, minhaCor3, 13);
        linhaDiagonalBaixo(23, 12, minhaCor3, 11);
        //-------------------------------------------------------
        linhaLado(12, 14, 24, minhaCor);
        linhaBaixo(22, 24, 12, minhaCor);
        
        linhaLado(22, 24, 12, minhaCor);
        linhaBaixo(12, 14, 24, minhaCor);
        
        linhaDiagonalCima(21, 28, minhaCor4, 18);
        linhaDiagonalCima(20, 27, minhaCor4, 18);
        linhaDiagonalCima(20, 27, minhaCor4, 19);
        linhaDiagonalCima(19, 26, minhaCor5, 19);
        linhaDiagonalCima(19, 26, minhaCor6, 20);
        
        linhaDiagonalBaixo(28, 24, minhaCor, 24);
        linhaDiagonalBaixo(28, 25, minhaCor, 25);
        linhaDiagonalBaixo(29, 25, minhaCor, 25);
        
        drawPixels();
    }
    
    public void linhaLado(int inicioLinha, int limiteLinha, int y, Color cor){
        for (int i = inicioLinha; i < limiteLinha; i++){
            setColor(i, y, cor);
        }
    }
    
    public void linhaBaixo(int inicioBaixo, int limiteBaixo, int x, Color cor){
        for (int i = inicioBaixo; i < limiteBaixo; i++){
            setColor(x, i, cor);
        }    
    }
    
    public void linhaDiagonalCima(int inicioDiagonalC, int limiteDiagonalC, Color cor, int y){
        for (int i = inicioDiagonalC; i < limiteDiagonalC; i++){
            y++;
            setColor(i, y, cor);
        }  
    }
    
    public void linhaDiagonalBaixo(int inicioDiagonalB, int limiteDiagonalB, Color cor, int y){
        for (int i = inicioDiagonalB; i > limiteDiagonalB; i--){
            y++;
            setColor(i, y, cor);
        }  
    }
}
    
    


