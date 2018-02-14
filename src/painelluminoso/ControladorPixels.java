/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package painelluminoso;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class ControladorPixels implements Runnable {

    private ArrayList<Pixel> listaPixel;
    private Graphics graphics;

    private int qtdeQuadroLinhas;
    private int qtdeQuadroColunas;

    private boolean executar = false;
    private int tempoSeep;
    boolean lento = false;

    public void iniciarControle(JanelaPainel janela) {
        listaPixel = new ArrayList<>();
        this.setGraphics(janela.getGraphics());
        this.gerarPixels(janela.getContentPane());
        this.drawPixels();
    }

    public ArrayList<Pixel> getListaPixel() {
        return listaPixel;
    }

    public void setListaPixel(ArrayList<Pixel> listaPixel) {
        this.listaPixel = listaPixel;
    }

    public void addPixel(Pixel pixel) {
        listaPixel.add(pixel);
    }

    public final void gerarPixels(Container contentPane) {
        int tamQuadros = 10;
        int startX = 15;
        int startY = 40;
        int x;
        int y = startY;
        int indiceX = 0;
        int indiceY = 0;

        int width = contentPane.getWidth();
        int height = contentPane.getHeight() - 20;

        if (listaPixel.size() < 1) {
            while (y + tamQuadros < height) {
                x = startX;
                indiceX = 0;
                while (x + tamQuadros < width) {
                    this.addPixel(new Pixel(indiceX, indiceY, x, y, tamQuadros, tamQuadros));
                    x += tamQuadros + 0;
                    indiceX++;
                }
                y += tamQuadros + 0;
                indiceY++;
            }
            this.setQtdeQuadroColunas(indiceX);
            this.setQtdeQuadroLinhas(indiceY);
        }
    }

    public final void drawPixels() {
        for (Pixel pixel : listaPixel) {
            pixel.draw(graphics);
        }
    }

    public void setColor(int x, int y, Color cor) {
        for (Pixel pixel : listaPixel) {
            if (pixel.getIndiceX() == x && pixel.getIndiceY() == y) {
                pixel.setCorFundo(cor);
                if (isExecutar()) {
                    pixel.draw(graphics);
                } else {
                    if (lento) {
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(ControladorPixels.class.getName()).log(Level.SEVERE, null, ex);
                        }
                    }
                }
                break;
            }
        }
    }

    public Graphics getGraphics() {
        return graphics;
    }

    public final void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }

    public abstract void desenhar();

    public int getQtdeQuadroLinhas() {
        return qtdeQuadroLinhas;
    }

    public void setQtdeQuadroLinhas(int qtdeQuadroLinhas) {
        this.qtdeQuadroLinhas = qtdeQuadroLinhas;
    }

    public int getQtdeQuadroColunas() {
        return qtdeQuadroColunas;
    }

    public void setQtdeQuadroColunas(int qtdeQuadroColunas) {
        this.qtdeQuadroColunas = qtdeQuadroColunas;
    }

    public abstract void threadInicio();

    public abstract void threadDesenhar();

    @Override
    public void run() {

        this.setExecutar(true);

        this.desenhar();

        this.threadInicio();

        while (isExecutar()) {

            this.threadDesenhar();

            try {
                Thread.sleep(this.tempoSeep);
            } catch (InterruptedException ex) {
                Logger.getLogger(ControladorPixels.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }

    public void startThread(int tempoSeep) {
        this.tempoSeep = tempoSeep;
        Thread thread = new Thread(this);
        thread.start();
    }

    public boolean isExecutar() {
        return executar;
    }

    public void setExecutar(boolean executar) {
        this.executar = executar;
    }

}
