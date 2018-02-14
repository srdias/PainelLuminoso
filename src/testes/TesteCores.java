package testes;

import java.awt.Color;
import painelluminoso.ControladorPixels;

public class TesteCores extends ControladorPixels {

    @Override
    public void desenhar() {

        Color[] minhaCor = new Color[11];

        minhaCor[1] = new Color(255, 255, 255);
        minhaCor[2] = new Color(179, 235, 255);
        minhaCor[3] = new Color(153, 228, 255);
        minhaCor[4] = new Color(102, 214, 255);
        minhaCor[5] = new Color(51, 201, 255);
        minhaCor[6] = new Color(0, 187, 255);
        minhaCor[7] = new Color(0, 150, 204);
        minhaCor[8] = new Color(0, 112, 153);
        minhaCor[9] = new Color(0, 75, 102);
        minhaCor[10] = new Color(0, 37, 51);

        int a = 35;
        for (int i = 1; i < 11; i++) {
            setColor(a, 20, minhaCor[i]);
            a = a - 1;
        }
        
        for (int i = 10; i >= 1; i--) {
            setColor(a, 21, minhaCor[i]);
            a = a - 1;
        }

        this.drawPixels();

    }

    @Override
    public void threadInicio() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void threadDesenhar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
