/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sysodonto.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class FundoBg extends JPanel{
    private BufferedImage img = null;    
    private int x = 0;  
    private int y = 0;  
    public FundoBg(String urlImg) throws IOException    {  
        this.img =  ImageIO.read(new File(urlImg));  
    }  
    @Override  
    public void paintComponent(Graphics g) {  
        super.paintComponent(g);        
        Graphics gr = (Graphics2D)g.create();  
        gr.drawImage(img, x, y,this.getWidth(),this.getHeight(),this);  
        gr.dispose();     
    }  
}
