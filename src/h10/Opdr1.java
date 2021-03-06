package h10;

import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Opdr1 extends Applet{
    Button knop1;
    TextField textvak;
    int hoogstegetal;
    int invoer;
    String tekst;

    public void init(){
        knop1 = new Button("enter");
        InvoerListener listener = new InvoerListener();
        knop1.addActionListener(listener);
        add(knop1);

        textvak = new TextField("",5);
        textvak.addActionListener(listener);
        add(textvak);

        hoogstegetal = Integer.MIN_VALUE;

        tekst = "";
    }

    public void paint(Graphics g) {

        g.drawString("Het hoogste getal is: " + hoogstegetal,50,50);
    }

    class InvoerListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
           String invoerGebruiker = textvak.getText();
           invoer = Integer.parseInt(invoerGebruiker);
           if (invoer > hoogstegetal){
               hoogstegetal = invoer;
           }
           repaint();

        }

    }
}

