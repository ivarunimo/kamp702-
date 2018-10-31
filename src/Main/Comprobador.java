/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Brando
 */
public class Comprobador extends JFrame implements ActionListener {
     private JButton name,pass;
     private JLabel txt1,txt2,txt3;
    public Comprobador(){
        super("Login");
        setLayout(null);
        txt1 = new JLabel("Ingrese Cuenta");
        txt3 = new JLabel("Ingrese Usuario");
        txt2 = new JLabel("Ingrese Contraseña");
        txt1.setBounds(210,70,180,40);
        add(txt1);
            }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
