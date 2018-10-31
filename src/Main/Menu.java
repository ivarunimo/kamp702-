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

/**
 *
 * @author Brando
 */
public class Menu extends JFrame implements ActionListener {
    private JButton Login;
    public Menu(){
        super("Menu");
        setLayout(null);
        Login = new JButton("Login");
        Login.setBounds(900,100,150,40);
        Login.addActionListener(this);
        add(Login);
        
}
    
    public static void main(String[] Args){
        Menu menu = new Menu();
        menu.setVisible(true);
        menu.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menu.setSize(1200,700);
        menu.setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==Login){
            this.setVisible(false);
            Comprobador comp = new Comprobador();
            comp.setSize(600,400);
            comp.setLocationRelativeTo(null);
            comp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            comp.setVisible(true);
        }
    }
    
}
