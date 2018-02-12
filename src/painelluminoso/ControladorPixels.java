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

public abstract class ControladorPixels {

    private ArrayList<Pixel> listaPixel;
    private Graphics graphics;
    
    private int qtdeQuadroLinhas;
    private int qtdeQuadroColunas;

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
                    x += tamQuadros + 2;
                    indiceX++;
                }
                y += tamQuadros + 2;
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

}
