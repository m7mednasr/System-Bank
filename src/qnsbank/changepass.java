/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qnsbank;

/**
 *
 * @author mahmo
 */

import java.awt.*;
import java.awt.Graphics;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.management.remote.JMXConnectorFactory;
import javax.swing.JOptionPane;

public class changepass extends JFrame
{
    public changepass ( )
    {
        setTitle ("Change Password");
        setSize(500, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible (true);
        setLayout(null);
        
        ImageIcon x = new ImageIcon ("keyboard.jpg");
        
        JLabel picture = new JLabel (x);
        add(picture);
        picture.setBounds(0,0,500, 200);
        
        JLabel backbutton = new JLabel (">>");
        add(backbutton);
        picture.add(backbutton);
        backbutton .setFont (new Font("Times", Font.BOLD, 18));
        backbutton.setForeground(new Color (99,109,154));
        backbutton.setBounds(0,0,30, 50);
        
        JPanel back = new JPanel ();
        back.setLayout(null);
        add(back);
        back.setBackground(Color.white);
        back.setBounds(0, 200,500,500);
        
        JLabel newpass = new JLabel ("New Password");
        add(newpass);
        back.add(newpass);
        newpass.setForeground(new Color(99,109,154));
        newpass.setFont(new Font ("Times", Font.BOLD, 18));
        newpass.setBounds(40, 80,200, 30);
        
        JPasswordField newpassword = new JPasswordField("");
        add(newpassword);
        back.add(newpassword);
        newpassword.setBounds( 220, 80, 200, 30);
        
        JLabel confirm = new JLabel ("ReWrite Pass");
        add(confirm);
        back.add(confirm);
        confirm.setForeground(new Color(99,109,154));
        confirm.setFont(new Font ("Times", Font.BOLD, 18) );
        confirm.setBounds(40, 150, 200, 30);
        
        JPasswordField confirm1 = new JPasswordField("");
        add(confirm1);
        back.add(confirm1);
        confirm1.setBounds(220, 150, 200, 30);
        
        JButton done = new JButton ("Done");
        add(done);
        back.add(done);
        done.setBackground(new Color(99,109,154));
        done.setForeground(Color.WHITE);
        done.setFont(new Font ("Times", Font.BOLD, 18));
        done.setBounds(140, 260, 200, 50);
        
        done.addMouseListener ( new MouseAdapter ()
        {
            public void mouseClicked(MouseEvent e)
            {
                String x = newpassword.getText();
                String y = confirm1.getText();
                
                
                if ( x.equals("") || y.equals("") )
                {
                    JOptionPane.showMessageDialog(null, "You Have missed something \nTry again :D");
                }
                else 
                {
                    if (x.equals(y))
                    {
                        
                        JOptionPane.showMessageDialog(null, "You have changed password successfully\nWell Done");
                    }
                    else 
                    {
                        JOptionPane.showMessageDialog(null, "Your rewrote password is wrong\nCheck it & try again");
                    }
                }
            }
        });
        
        backbutton.addMouseListener (new MouseAdapter()
        {
            public void mouseClicked (MouseEvent e)
            {
                setVisible (false);
                new Customer();
            }
        }
        );
        
    }
    
}