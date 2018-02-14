package testes;

import java.awt.Color;
import painelluminoso.ControladorPixels;

public class TesteLinhas extends ControladorPixels {

    @Override
    public void desenhar() {
        int controle = 1;
        Color minhaCor = new Color(0, 0, 0);

        for (int linha = 0; linha < this.getQtdeQuadroLinhas(); linha = linha + 2) {

            for (int coluna = 0; coluna < this.getQtdeQuadroColunas(); coluna++) {
                setColor(coluna, linha, minhaCor);
            }
            if (controle == 1) {
                setColor(this.getQtdeQuadroColunas() - 1, linha + 1, Color.BLACK);
                controle = 2;
            } else {
                setColor(0, linha + 1, Color.BLACK);
                controle = 1;
            }

        }
        /**
         * int b = 0; for(int i=0;i<this.getQtdeQuadroLinhas();i++){ b += 2;
         *
         * for(int a=0;a<this.getQtdeQuadroColunas();a++){ setColor(a, b,
         * Color.BLACK); } } int b = 0; for (int
         * c=0;c<this.getQtdeQuadroLinhas();c++){ for(int
         * a=0;a<this.getQtdeQuadroColunas();a++){ setColor(a, b, Color.BLACK);
         * } b+=1; setColor(0, b, Color.BLACK);
         *
         * for(int a=0;a<this.getQtdeQuadroColunas();a++){ setColor(a, b+2,
         * Color.BLACK); }
         *
         * setColor(90, b+3, Color.BLACK); }*
         */
        this.drawPixels();

    }

    /*public void linha(int b) {
        for (int a = 0; a < this.getQtdeQuadroColunas(); a++) {
            setColor(a, b, Color.BLACK);
        }
    }

    public void pingoEsquerdo(int b) {
        for (int a = 0; a < this.getQtdeQuadroLinhas(); a++) {
            setColor(0, b, Color.BLACK);
        }
    }*/
}
