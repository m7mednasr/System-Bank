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
import java.awt.event.*;
import javax.swing.*;
import java.io.IOException;
import javax.swing.ImageIcon;
import javax.management.remote.JMXConnectorFactory;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Date;


public class Login extends JFrame 
{
    public Login ( )
    {
        setTitle ("QNSB");
        setSize(1300, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible (true);
        setLayout(null);
        
        JLabel x = new JLabel ("QNSB");
        add(x);
        x.setBounds (50,150,150,50);
        x.setForeground(Color.WHITE);
        x.setFont(new Font ("Times", Font.BOLD, 35));
        
        
        JPanel z = new JPanel();
        add (z);
        z.setBounds (50, 225, 100, 3);
        z.setBackground(new Color(255,255,255));
        
        JLabel s1 = new JLabel ("This is a national bank managing system which");
        add(s1);
        s1.setBounds (50, 253, 430, 40);
        s1.setForeground (Color.WHITE);
        s1.setFont (new Font ("Times", Font.BOLD, 16));
        
        JLabel s2 = new JLabel ("was developed by some Egyptian Programmer");
        add(s2);
        s2.setBounds (50, 293, 430, 40);
        s2.setForeground (Color.WHITE);
        s2.setFont(new Font ("Times", Font.BOLD, 16));
        
        JLabel s3 = new JLabel ("For Logging in as an Admin click ");
        add(s3);
        s3.setBounds (50, 333, 430, 40);
        s3.setForeground(Color.WHITE);
        s3.setFont (new Font ("Times", Font.BOLD, 16));
        
        JLabel s4 = new JLabel ("For Logging in as a costomer click ");
        add(s4);
        s4.setBounds (50, 373, 430, 40);
        s4.setForeground(Color.WHITE);
        s4.setFont (new Font ("Times", Font.BOLD, 16));
        
        JLabel s5 = new JLabel ("For Registration click ");
        add(s5);
        s5.setBounds (50, 413, 430, 40);
        s5.setForeground(Color.WHITE);
        s5.setFont (new Font ("Times", Font.BOLD, 16));
        
        JLabel adbutton = new JLabel ("Here");
        add (adbutton);
        adbutton.setBounds(305, 342, 50, 25);
        adbutton.setForeground(Color.RED);
        adbutton.setFont(new Font ("Times", Font.BOLD, 16));
        
        JLabel cusbutton = new JLabel("Here");
        add(cusbutton);
        cusbutton.setBounds(320, 382, 50, 25);
        cusbutton.setForeground(Color.RED);
        cusbutton.setFont(new Font ("Times", Font.BOLD, 16));
        
        JLabel regbutton = new JLabel("Here");
        add(regbutton);
        regbutton.setBounds(220, 422, 50, 25);
        regbutton.setForeground (Color.RED);
        regbutton.setFont(new Font ("Times", Font.BOLD, 16));
        
        JLabel face = new JLabel ("GMAIL");
        add(face);
        face.setBounds(275, 700, 200, 25);
        face.setFont(new Font ("Times", Font.PLAIN, 14));
        face.setForeground (Color.red);
        
        JLabel fb = new JLabel("You can contact us on");
        add(fb);
        fb.setFont (new Font ("Times", Font.PLAIN, 14));
        fb.setForeground(Color.white);
        fb.setBounds(130, 700, 200, 25);
        
        JPanel line= new JPanel();
        add(line);
        line.setBounds (130, 725, 190, 1);
        line.setBackground(Color.WHITE);
        
        JPanel line1= new JPanel();
        add(line1);
        line1.setBounds (130, 700, 190, 1);
        line1.setBackground(Color.WHITE);
        
        ImageIcon img = new ImageIcon("Mountain-background.png");
        JLabel back = new JLabel(img);
        add (back);
        back.setBounds (0,0, 500, 800);
        back.add(x); back.add(z); 
        back.add(s1);
        back.add(s2);
        back.add(s3);
        back.add(s4);
        back.add(s5);
        back.add(adbutton);
        back.add(cusbutton);
        back.add (regbutton);
        back.add(fb);
        back.setLayout(null);
        //left part Customization
        
        JPanel login = new JPanel();
        add(login);
        login.setLayout (null);
        login.setBounds (500, 0, 800, 800);
        login.setBackground(new Color (255,255,255));
        
        JPanel border1 = new JPanel ();
        add(border1);
        border1.setBounds(0, 0, 1, 755);
        border1.setVisible(true);
        border1.setBackground(new Color(0,0,0));
        login.add(border1);
        
        //username & password as an admin
        JLabel user = new JLabel ("Username");
        add (user);
        user.setForeground(new Color(99,109,154));
        login.add(user);
        user.setBounds (110, 310, 200, 50);
        user.setFont(new Font ("Times", Font.ROMAN_BASELINE, 18));
        
        JTextField usern = new JTextField("");
        add(usern);
        login.add(usern);
        usern.setBounds(210, 310, 150, 50);
        
        JLabel pass = new JLabel ("Password");
        add(pass);
        login.add(pass);
        pass.setForeground(new Color (99,109,154));
        pass.setFont(new Font ("Times", Font.ROMAN_BASELINE, 18));
        pass.setBounds (110, 410, 200, 50);
        
        JPasswordField passw = new JPasswordField();
        add(passw);
        login.add(passw);
        passw.setBounds(210, 410, 150, 50);
        
        JButton confirm1 = new JButton ("Confirm");
        add (confirm1);
        login.add(confirm1);
        confirm1.setBounds (450, 365, 140, 50);
        confirm1.setBackground (new Color(99, 109, 154));
        confirm1.setForeground (Color.BLACK);
        confirm1.setFont(new Font ("Times", Font.BOLD, 20));
        //confirm1.setBorder(new RoundedBorder(10));
        
        JLabel title = new JLabel("L  o  g  i  n");
        add(title);
        login.add(title);
        title.setForeground(new Color(99, 109,154));
        title.setFont (new Font("Times", Font.BOLD, 36));
        title.setBounds( 300, 205, 200, 50);
        
        JPanel z0 = new JPanel ();
        add(z0);
        login.add(z0);
        z0.setBounds (90, 230, 150, 2);
        z0.setBackground(Color.BLACK);
        
        JPanel z1 = new JPanel ();
        add(z1);
        login.add(z1);
        z1.setBounds (90, 236, 150, 2);
        z1.setBackground(Color.BLACK);

        JPanel z2 = new JPanel ();
        add(z2);
        login.add(z2);
        z2.setBounds (530, 230, 150, 2);
        z2.setBackground(Color.BLACK);
        
        JPanel z3 = new JPanel ();
        add(z3);
        login.add(z3);
        z3.setBounds (530, 236, 150, 2);
        z3.setBackground(Color.BLACK);
        
        JPanel z4 = new JPanel ();
        add(z4);
        login.add(z4);
        z4.setBounds (90, 510, 590, 2);
        z4.setBackground(Color.BLACK);
        
        JPanel z5 = new JPanel ();
        add(z5);
        login.add(z5);
        z5.setBounds (90, 516, 590, 2);
        z5.setBackground(Color.BLACK);
        
        //login as customer
        //username & password as a customer
        JLabel username = new JLabel ("Username");
        add (username);
        username.setForeground(new Color(99,109,154));
        login.add(username);
        username.setBounds (110, 310, 200, 50);
        username.setFont(new Font ("Times", Font.ROMAN_BASELINE, 18));
        
        JTextField usernam = new JTextField("");
        add(usernam);
        login.add(usernam);
        usernam.setBounds(210, 310, 150, 50);
        
        JLabel password = new JLabel ("Password");
        add(password);
        login.add(password);
        password.setForeground(new Color (99,109,154));
        password.setFont(new Font ("Times", Font.ROMAN_BASELINE, 18));
        password.setBounds (110, 410, 200, 50);
        
        JPasswordField passwor = new JPasswordField();
        add(passwor);
        login.add(passwor);
        passwor.setBounds(210, 410, 150, 50);
        
        JButton confirm2 = new JButton ("Confirm");
        add (confirm2);
        login.add(confirm2);
        confirm2.setBounds (450, 405, 140, 50);
        confirm2.setBackground (new Color(99, 109, 154));
        confirm2.setForeground (Color.BLACK);
        confirm2.setFont(new Font ("Times", Font.BOLD, 20));
        
        JLabel id = new JLabel ("ID");
        add(id);
        login.add(id);
        id.setFont(new Font ("Times", Font.ROMAN_BASELINE, 18));
        id.setForeground(new Color(99,109,154));
        id.setBounds (450, 320, 20, 30);
        
        JTextField Id = new JTextField("");
        add(Id);
        login.add(Id);
        Id.setBounds(480, 310, 150, 50);
        
        
        //Registration
        JLabel title1 = new JLabel("R E G I S T E R");
        add(title1);
        login.add(title1);
        title1.setForeground(new Color(99, 109,154));
        title1.setFont (new Font("Times", Font.BOLD, 36));
        title1.setBounds( 260, 200, 300, 50);
        
        JPanel z6 = new JPanel ();
        add(z6);
        login.add(z6);
        z6.setBounds (90, 225, 150, 2);
        z6.setBackground(Color.BLACK);
        
        JPanel z7 = new JPanel ();
        add(z7);
        login.add(z7);
        z7.setBounds (90, 231, 150, 2);
        z7.setBackground(Color.BLACK);

        JPanel z8 = new JPanel ();
        add(z8);
        login.add(z8);
        z8.setBounds (530, 225, 150, 2);
        z8.setBackground(Color.BLACK);
        
        JPanel z9 = new JPanel ();
        add(z9);
        login.add(z9);
        z9.setBounds (530, 231, 150, 2);
        z9.setBackground(Color.BLACK);
        
        JPanel z10 = new JPanel ();
        add(z10);
        login.add(z10);
        z10.setBounds (90, 520, 590, 2);
        z10.setBackground(Color.BLACK);
        
        JPanel z11 = new JPanel ();
        add(z11);
        login.add(z11);
        z11.setBounds (90, 526, 590, 2);
        z11.setBackground(Color.BLACK);
        
        JLabel fname = new JLabel ("F.Name");
        add(fname);
        login.add(fname);
        fname.setForeground(new Color(99,109,154));
        fname.setFont(new Font ("Times", Font.BOLD, 18));
        fname.setBounds (90, 275, 100, 30);
        
        JTextField fname1 = new JTextField("");
        add(fname1);
        login.add(fname1);
        fname1.setForeground(new Color (99,109,154));
        fname1.setFont(new Font ("Times", Font.BOLD, 18));
        fname1.setBounds (200, 275, 120, 30);
        
        JLabel lname = new JLabel("L.Name");
        add(lname);
        login.add(lname);
        lname.setForeground(new Color(99,109,154));
        lname.setFont(new Font ("Times", Font.BOLD, 18));
        lname.setBounds (450, 275, 100, 30);
        
        JTextField lname1 = new JTextField("");
        add(lname1);
        login.add(lname1);
        lname1.setBounds ( 550, 275, 130, 30);
        
        JLabel ssn = new JLabel("SSN");
        add(ssn);
        login.add(ssn);
        ssn.setForeground(new Color(99,109,154));
        ssn.setFont(new Font("Times", Font.BOLD, 18));
        ssn.setBounds(90, 330, 100, 30);
        
        JTextField ssn1 = new JTextField("");
        add(ssn1);
        login.add(ssn1);
        ssn1.setBounds(200, 330, 120, 30);
        
        JLabel email= new JLabel("G-Mail");
        add(email);
        login.add(email);
        email.setForeground(new Color(99,109,154));
        email.setFont(new Font ("Times", Font.BOLD, 18));
        email.setBounds(450, 330, 100, 30);
        
        JTextField mail = new JTextField("");
        add(mail);
        login.add(mail);
        mail.setBounds(550,330,130,30);
        
        JLabel use = new JLabel ("Username");
        add(use);
        login.add(use);
        use.setForeground(new Color (99,109,154));
        use.setFont (new Font ("Times", Font.BOLD, 18));
        use.setBounds(90, 385, 100, 30);
        
        JTextField use1 = new JTextField("");
        add(use1);
        login.add(use1);
        use1.setBounds(200, 385, 120, 30);
        
        JLabel pas = new JLabel ("Password");
        add(pas);
        login.add(pas);
        pas.setForeground(new Color(99,109,154));
        pas.setFont (new Font ("Times", Font.BOLD, 18));
        pas.setBounds (450, 385, 100, 30);
        
        JPasswordField pas1 = new JPasswordField("");
        add(pas1);
        login.add(pas1);
        pas1.setBounds (550,385,130,30);
        
        JButton confirm3 = new JButton ("Confirm");
        add(confirm3);
        login.add(confirm3);
        confirm3.setBackground(new Color(99,109,154));
        confirm3.setForeground(Color.BLACK);
        confirm3.setFont(new Font ("Times", Font.BOLD, 20));
        confirm3.setBounds (350, 440, 140, 50);
        
        ///visibility
        username.setVisible (false);
        usernam.setVisible(false);
        password.setVisible(false);
        passwor.setVisible(false);
        confirm2.setVisible(false);
        id.setVisible (false);
        Id.setVisible (false);
        
        title.setVisible(false);
        z0.setVisible(false);
        z1.setVisible(false);
        z2.setVisible(false);
        z3.setVisible(false);
        z4.setVisible(false);
        z5.setVisible(false);
        
        user.setVisible (false);
        usern.setVisible(false);
        pass.setVisible(false);
        passw.setVisible(false);
        passw.setVisible(false);
        confirm1.setVisible(false);
        
        z6.setVisible(false);
        z7.setVisible(false);
        z8.setVisible(false);
        z9.setVisible(false);
        z10.setVisible(false);
        z11.setVisible(false);
        title1.setVisible(false);
        
        fname.setVisible(false);
        fname1.setVisible (false);
        lname.setVisible(false);
        lname1.setVisible(false);
        ssn.setVisible(false);
        ssn1.setVisible(false);
        email.setVisible(false);
        mail.setVisible(false);
        use.setVisible (false);
        use1.setVisible (false);
        pas.setVisible(false);
        pas1.setVisible (false);
        confirm3.setVisible(false);
        
        
        adbutton.addMouseListener(new MouseAdapter () 
        {
            
            int y = 1;
            public void mouseClicked ( MouseEvent e )
            {
                
                if ( y %2 != 0 )
                {
                    z6.setVisible(false);
                    z7.setVisible(false);
                    z8.setVisible(false);
                    z9.setVisible(false);
                    z10.setVisible(false);
                    z11.setVisible(false);
                    title1.setVisible(false);

                    fname.setVisible(false);
                    fname1.setVisible (false);
                    lname.setVisible(false);
                    lname1.setVisible(false);
                    ssn.setVisible(false);
                    ssn1.setVisible(false);
                    email.setVisible(false);
                    mail.setVisible(false);
                    use.setVisible (false);
                    use1.setVisible (false);
                    pas.setVisible(false);
                    pas1.setVisible (false);
                    confirm3.setVisible(false);

                    username.setVisible (false);
                    usernam.setVisible(false);
                    password.setVisible(false);
                    passwor.setVisible(false);
                    confirm2.setVisible(false);
                    id.setVisible (false);
                    Id.setVisible (false);

                    title.setVisible(true);
                    z0.setVisible(true);
                    z1.setVisible(true);
                    z2.setVisible(true);
                    z3.setVisible(true);
                    z4.setVisible(true);
                    z5.setVisible(true);

                    user.setVisible (true);
                    usern.setVisible(true);
                    pass.setVisible(true);
                    passw.setVisible(true);
                    passw.setVisible(true);
                    confirm1.setVisible(true);
                    
                    y++;
                }
                else 
                {
                    z6.setVisible(false);
                    z7.setVisible(false);
                    z8.setVisible(false);
                    z9.setVisible(false);
                    z10.setVisible(false);
                    z11.setVisible(false);
                    title1.setVisible(false);

                    fname.setVisible(false);
                    fname1.setVisible (false);
                    lname.setVisible(false);
                    lname1.setVisible(false);
                    ssn.setVisible(false);
                    ssn1.setVisible(false);
                    email.setVisible(false);
                    mail.setVisible(false);
                    use.setVisible (false);
                    use1.setVisible (false);
                    pas.setVisible(false);
                    pas1.setVisible (false);
                    confirm3.setVisible(false);

                    username.setVisible (false);
                    usernam.setVisible(false);
                    password.setVisible(false);
                    passwor.setVisible(false);
                    confirm2.setVisible(false);
                    id.setVisible (false);
                    Id.setVisible (false);

                    title.setVisible(false);
                    z0.setVisible(false);
                    z1.setVisible(false);
                    z2.setVisible(false);
                    z3.setVisible(false);
                    z4.setVisible(false);
                    z5.setVisible(false);

                    user.setVisible (false);
                    usern.setVisible(false);
                    pass.setVisible(false);
                    passw.setVisible(false);
                    passw.setVisible(false);
                    confirm1.setVisible(false);
                    
                    y++;
                    
                }
            }
        });
        
        cusbutton.addMouseListener(new MouseAdapter () 
        {
            int y = 1;
            public void mouseClicked (MouseEvent e )
            {
                if ( y % 2 != 0 )
                {
                    title.setText("L o g i n - C U S");
                    title.setBounds(250, 205, 280, 50);
                    user.setVisible (false);
                    usern.setVisible(false);
                    pass.setVisible(false);
                    passw.setVisible(false);
                    passw.setVisible(false);
                    confirm1.setVisible(false);

                    z6.setVisible(false);
                    z7.setVisible(false);
                    z8.setVisible(false);
                    z9.setVisible(false);
                    z10.setVisible(false);
                    z11.setVisible(false);
                    title1.setVisible(false);

                    fname.setVisible(false);
                    fname1.setVisible (false);
                    lname.setVisible(false);
                    lname1.setVisible(false);
                    ssn.setVisible(false);
                    ssn1.setVisible(false);
                    email.setVisible(false);
                    mail.setVisible(false);
                    use.setVisible (false);
                    use1.setVisible (false);
                    pas.setVisible(false);
                    pas1.setVisible (false);
                    confirm3.setVisible(false);

                    username.setVisible (true);
                    usernam.setVisible(true);
                    password.setVisible(true);
                    passwor.setVisible(true);
                    confirm2.setVisible(true);
                    id.setVisible (true);
                    Id.setVisible (true);

                    title.setVisible(true);
                    z0.setVisible(true);
                    z1.setVisible(true);
                    z2.setVisible(true);
                    z3.setVisible(true);
                    z4.setVisible(true);
                    z5.setVisible(true);
                    
                    y++;
                }
                
                else 
                {
                    z6.setVisible(false);
                    z7.setVisible(false);
                    z8.setVisible(false);
                    z9.setVisible(false);
                    z10.setVisible(false);
                    z11.setVisible(false);
                    title1.setVisible(false);

                    fname.setVisible(false);
                    fname1.setVisible (false);
                    lname.setVisible(false);
                    lname1.setVisible(false);
                    ssn.setVisible(false);
                    ssn1.setVisible(false);
                    email.setVisible(false);
                    mail.setVisible(false);
                    use.setVisible (false);
                    use1.setVisible (false);
                    pas.setVisible(false);
                    pas1.setVisible (false);
                    confirm3.setVisible(false);

                    username.setVisible (false);
                    usernam.setVisible(false);
                    password.setVisible(false);
                    passwor.setVisible(false);
                    confirm2.setVisible(false);
                    id.setVisible (false);
                    Id.setVisible (false);

                    title.setVisible(false);
                    z0.setVisible(false);
                    z1.setVisible(false);
                    z2.setVisible(false);
                    z3.setVisible(false);
                    z4.setVisible(false);
                    z5.setVisible(false);

                    user.setVisible (false);
                    usern.setVisible(false);
                    pass.setVisible(false);
                    passw.setVisible(false);
                    passw.setVisible(false);
                    confirm1.setVisible(false);
                    
                    y++;
                }
                
                
            }
        });
        
        regbutton.addMouseListener(new MouseAdapter () 
        {
            int y = 1;
            boolean flag = false;
            public void mouseClicked (MouseEvent e )
            {
                if ( y % 2 != 0 )
                {
                    if ( flag == false )
                    {
                        JOptionPane.showMessageDialog(null, "You must fill all fields");
                        JOptionPane.showMessageDialog(null, "You mustn't doublicate your first name");
                        JOptionPane.showMessageDialog(null, "Your SSN must only be 14 numbers & it must be only numbers");
                        JOptionPane.showMessageDialog(null, "Your Gmail must have '@gmail.com' at the end & it must be more than 10 characters");
                        JOptionPane.showMessageDialog(null, "Your password must include lower & uppercase letters, numbers & sympols");
                        JOptionPane.showMessageDialog(null, "If you don't follow the rules you will get an error");
                        
                        
                        username.setVisible (false);
                        usernam.setVisible(false);
                        password.setVisible(false);
                        passwor.setVisible(false);
                        confirm2.setVisible(false);
                        id.setVisible (false);
                        Id.setVisible (false);

                        title.setVisible(false);
                        z0.setVisible(false);
                        z1.setVisible(false);
                        z2.setVisible(false);
                        z3.setVisible(false);
                        z4.setVisible(false);
                        z5.setVisible(false);

                        user.setVisible (false);
                        usern.setVisible(false);
                        pass.setVisible(false);
                        passw.setVisible(false);
                        passw.setVisible(false);
                        confirm1.setVisible(false);

                        z6.setVisible(true);
                        z7.setVisible(true);
                        z8.setVisible(true);
                        z9.setVisible(true);
                        z10.setVisible(true);
                        z11.setVisible(true);
                        title1.setVisible(true);

                        fname.setVisible(true);
                        fname1.setVisible (true);
                        lname.setVisible(true);
                        lname1.setVisible(true);
                        ssn.setVisible(true);
                        ssn1.setVisible(true);
                        email.setVisible(true);
                        mail.setVisible(true);
                        use.setVisible (true);
                        use1.setVisible (true);
                        pas.setVisible(true);
                        pas1.setVisible (true);
                        confirm3.setVisible(true);

                        flag = true;
                        y++;                        
                    }
                    else 
                    {
                        username.setVisible (false);
                        usernam.setVisible(false);
                        password.setVisible(false);
                        passwor.setVisible(false);
                        confirm2.setVisible(false);
                        id.setVisible (false);
                        Id.setVisible (false);

                        title.setVisible(false);
                        z0.setVisible(false);
                        z1.setVisible(false);
                        z2.setVisible(false);
                        z3.setVisible(false);
                        z4.setVisible(false);
                        z5.setVisible(false);

                        user.setVisible (false);
                        usern.setVisible(false);
                        pass.setVisible(false);
                        passw.setVisible(false);
                        passw.setVisible(false);
                        confirm1.setVisible(false);

                        z6.setVisible(true);
                        z7.setVisible(true);
                        z8.setVisible(true);
                        z9.setVisible(true);
                        z10.setVisible(true);
                        z11.setVisible(true);
                        title1.setVisible(true);

                        fname.setVisible(true);
                        fname1.setVisible (true);
                        lname.setVisible(true);
                        lname1.setVisible(true);
                        ssn.setVisible(true);
                        ssn1.setVisible(true);
                        email.setVisible(true);
                        mail.setVisible(true);
                        use.setVisible (true);
                        use1.setVisible (true);
                        pas.setVisible(true);
                        pas1.setVisible (true);
                        confirm3.setVisible(true);

                        y++;
                    }

                }
                
                else 
                {
                    z6.setVisible(false);
                    z7.setVisible(false);
                    z8.setVisible(false);
                    z9.setVisible(false);
                    z10.setVisible(false);
                    z11.setVisible(false);
                    title1.setVisible(false);

                    fname.setVisible(false);
                    fname1.setVisible (false);
                    lname.setVisible(false);
                    lname1.setVisible(false);
                    ssn.setVisible(false);
                    ssn1.setVisible(false);
                    email.setVisible(false);
                    mail.setVisible(false);
                    use.setVisible (false);
                    use1.setVisible (false);
                    pas.setVisible(false);
                    pas1.setVisible (false);
                    confirm3.setVisible(false);

                    username.setVisible (false);
                    usernam.setVisible(false);
                    password.setVisible(false);
                    passwor.setVisible(false);
                    confirm2.setVisible(false);
                    id.setVisible (false);
                    Id.setVisible (false);

                    title.setVisible(false);
                    z0.setVisible(false);
                    z1.setVisible(false);
                    z2.setVisible(false);
                    z3.setVisible(false);
                    z4.setVisible(false);
                    z5.setVisible(false);

                    user.setVisible (false);
                    usern.setVisible(false);
                    pass.setVisible(false);
                    passw.setVisible(false);
                    passw.setVisible(false);
                    confirm1.setVisible(false);
                    
                    y++;
                }
                
                
            }
        });
        
        face.addMouseListener(new MouseAdapter () 
        {
            public void mouseClicked (MouseEvent e )
            {
                try 
                {
                  String URL = "https://mahmoudgamal199932.wixsite.com/mysite";
                  java.awt.Desktop.getDesktop().browse(java.net.URI.create(URL));
                }
                catch (IOException s) 
                {
                    JOptionPane.showMessageDialog(null, s.getMessage());
                } 
            }
        });
        
        
        confirm1.addMouseListener(new MouseAdapter () 
        {
            int counter1 = 0;
            public void mouseClicked ( MouseEvent e )
            {
                String x = usern.getText();
                String y = passw.getText();
                
                String i = x.toLowerCase(); 
                String u = y.toLowerCase();
                if (counter1  < 5)
                {
                    if ( i.equals("admin") )
                    {
                        if ( u.equals("admin") )
                        {
                            JOptionPane.showMessageDialog(null, "You have successfully logged in\nWelcome :D");

                            setVisible(false);
                            Admiin obj = new Admiin();
                            obj.setVisible(true);
                        }

                        else 
                        {
                            counter1 ++;
                            JOptionPane.showMessageDialog(null, "It seems that you have entered wrongly\nYou have " + counter1 + " Times left \n" + "Try again :D");
                        }
                    }
                    else 
                    {
                        counter1++;
                        JOptionPane.showMessageDialog(null, "It seems that you have enter user or password wrongly\nYou have " + counter1 + " Times left \n" + "Try again :D");
                    }
                }
                
                else
                {
                    JOptionPane.showMessageDialog(null, "Sorry you have exceeded the limits");
                    setVisible(false);
                    
                    JOptionPane.showMessageDialog(null, "You have to restart the computer to be able to use the programe again :) ");
                }
            }
            
        });
        
        confirm2.addMouseListener (new MouseAdapter() 
        {
            public void mouseClicked (MouseEvent e)
            {
                String x = usernam.getText();
                String y = passwor.getText();
                String i = Id.getText();
                
                x.toLowerCase(); y.toLowerCase(); i.toLowerCase();
                
                if ( x.equals("") || y.equals("") || i.equals("") )
                {
                    JOptionPane.showMessageDialog(null, "You have missed to enter something \nTry again");
                }
                
                else 
                {
                    int ilength = 0;
                    ilength = i.length();

                    if ( ilength != 5 )
                        JOptionPane.showMessageDialog(null, "The ID is not 5 charatcters");
                    else 
                    {
                        int counter = 0;
                        for ( int u = 0; u < 5; u++ )
                        {
                            if ( i.charAt(u) >= 48 && i.charAt(u) <= 57 ) 
                                counter++;
                            else 
                                continue;
                        }

                        if ( counter != 5 )
                        {
                            JOptionPane.showMessageDialog(null, "Your entered ID includes charcters\n Try to make it numbers only");
                        }
                        else 
                        {
                            JOptionPane.showMessageDialog(null, "You have successfully Loged in\nWelcome :D");
                            setVisible (false);
                            Customer obj = new Customer();
                            obj.setVisible (true);    
                        }
                    }
                }
            }
        });
        
        confirm3.addMouseListener(new MouseAdapter()
        {
            public void mouseClicked (MouseEvent e)
            {
                String first = fname1.getText();
                String last = lname1.getText();
                String social = ssn1.getText();
                String gmail = mail.getText();
                String nick = use1.getText();
                String passcode = pas1.getText();
                
                
                
                if ( first.equals("") || last.equals("") || social.equals("") || gmail.equals("") || nick.equals("") || passcode.equals("") )
                {
                    JOptionPane.showMessageDialog(null, "You Have Missed something\nTry again" );
                    fname1.setText("");
                    lname1.setText("");
                    mail.setText("");
                    ssn1.setText("");
                    use1.setText("");
                    pas1.setText("");
                }
                
                else 
                {
                    int length = social.length();
                    char [] arr = new char[14];
                
                    int counter = 0;
                    
                    for ( int i = 0; i < 14; i++ )
                    {
                        arr[i] = social.charAt(i);
                        if ( (int) arr[i] >= 48 && (int)arr[i] <= 57 )
                            counter++;
                        else 
                            continue;
                    }
                
                    if (first.equals(last))
                    {
                        JOptionPane.showMessageDialog(null, "You have doubled your first name");
                            fname1.setText("");
                            lname1.setText("");
                            mail.setText("");
                            ssn1.setText("");
                            use1.setText("");
                            pas1.setText("");
                    }
                    
                    else
                    {
                        if (length != 14)
                        {
                            JOptionPane.showMessageDialog(null, "Your SSN is Not valid\nTry Again");
                            fname1.setText("");
                            lname1.setText("");
                            mail.setText("");
                            ssn1.setText("");
                            use1.setText("");
                            pas1.setText("");
                        }
                        else 
                        {
                            if ( counter == 14 )
                            {
                                String g = gmail.substring(gmail.length()-10, gmail.length());
                                String com = "@gmail.com";

                                if ( g.equals(com) )
                                {
                                    int numbers = 0, lower = 0, upper = 0, sympols = 0;
                                    int passlength = passcode.length();
                                    for ( int q = 0; q < passlength; q++ )
                                    {
                                        if ( passcode.charAt(q) >= 48 && passcode.charAt(q) <= 57 )
                                        {
                                            numbers++;
                                            continue;
                                        }
                                        if ( passcode.charAt(q) >= 97 && passcode.charAt(q) <= 122 )
                                        {
                                            lower++;
                                            continue;
                                        }
                                        if ( passcode.charAt(q) >= 65 && passcode.charAt(q) <= 90 )
                                        {
                                            upper++;
                                            continue;
                                        }
                                        if (passcode.charAt(q) >= 32 && passcode.charAt(q) <= 47 )
                                        {
                                            sympols++;
                                        }
                                    }

                                    if ( numbers > 0 && lower > 0 && upper > 0 && sympols > 0 )
                                    {


                                        JOptionPane.showMessageDialog(null, "You have already made an account just Login as an customer");

                                        title.setText("L o g i n - C U S");
                                        title.setBounds(250, 205, 280, 50);
                                        user.setVisible (false);
                                        usern.setVisible(false);
                                        pass.setVisible(false);
                                        passw.setVisible(false);
                                        passw.setVisible(false);
                                        confirm1.setVisible(false);

                                        z6.setVisible(false);
                                        z7.setVisible(false);
                                        z8.setVisible(false);
                                        z9.setVisible(false);
                                        z10.setVisible(false);
                                        z11.setVisible(false);
                                        title1.setVisible(false);

                                        fname.setVisible(false);
                                        fname1.setVisible (false);
                                        lname.setVisible(false);
                                        lname1.setVisible(false);
                                        ssn.setVisible(false);
                                        ssn1.setVisible(false); 
                                        email.setVisible(false);
                                        mail.setVisible(false);
                                        use.setVisible (false);
                                        use1.setVisible (false);
                                        pas.setVisible(false);
                                        pas1.setVisible (false);
                                        confirm3.setVisible(false);

                                        username.setVisible (true);
                                        usernam.setVisible(true);
                                        password.setVisible(true);
                                        passwor.setVisible(true);
                                        confirm2.setVisible(true);
                                        id.setVisible (true);
                                        Id.setVisible (true);

                                        title.setVisible(true);
                                        z0.setVisible(true);
                                        z1.setVisible(true);
                                        z2.setVisible(true);
                                        z3.setVisible(true);
                                        z4.setVisible(true);
                                        z5.setVisible(true); 
                                    }

                                    else 
                                    {
                                        JOptionPane.showMessageDialog(null, "Your password must include lower and upper case letters, number & sympols");
                                        fname1.setText("");
                                        lname1.setText("");
                                        mail.setText("");
                                        ssn1.setText("");
                                        use1.setText("");
                                        pas1.setText("");
                                    }

                                }
                                else 
                                {
                                    JOptionPane.showMessageDialog(null,"You Missed '@gmail.com' at you gmail\nTry Again");
                                    fname1.setText("");
                                    lname1.setText("");
                                    mail.setText("");
                                    ssn1.setText("");
                                    use1.setText("");
                                    pas1.setText("");
                                }

                            }

                            else 
                            {
                                JOptionPane.showMessageDialog(null, "You have Entered Wrong SSN\nTry again");
                                fname1.setText("");
                                lname1.setText("");
                                mail.setText("");
                                ssn1.setText("");
                                use1.setText("");
                                pas1.setText("");
                            }
                        }
                        
                    }
                }
            }
        });
    }
}
