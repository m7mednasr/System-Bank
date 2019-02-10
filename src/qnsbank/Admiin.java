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
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.management.remote.JMXConnectorFactory;

public class Admiin extends JFrame 
{
    public Admiin ( )
    {
        setTitle ("QNSB");
        setSize(1300, 800);
        setVisible (true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        
        JPanel left = new JPanel ();
        add(left);
        left.setBounds (0,0, 300, 800);
        left.setLayout(null);
        left.setBackground(new Color (99,109,154));
        
        JButton back = new JButton("<<");
        add(back);
        left.add(back);
        back.setBackground(Color.WHITE);    
        back.setForeground(new Color(99,109,154));
        back.setFont(new Font ("Times", Font.BOLD, 18));
        back.setBounds(0,40,60,30);
        
        JButton manage = new JButton("Manage-Accounts");
        add(manage);
        left.add(manage);
        manage.setBackground(Color.WHITE);
        manage.setForeground(new Color(99,109,154));
        manage.setBounds (0,250,300,80);
        manage.setFont(new Font ("Times", Font.BOLD, 22));
        
        JButton balance = new JButton("Balance");
        add(balance);
        left.add(balance);
        balance.setBackground(Color.WHITE);
        balance.setForeground(new Color(99,109,154));
        balance.setBounds (0,475,300,80);
        balance.setFont(new Font ("Times", Font.BOLD, 22));
        
        JPanel right = new JPanel ();
        add(right);
        right.setLayout(null);
        right.setBounds (300, 0, 1000, 800);
        right.setBackground(Color.WHITE);

        JLabel manageac = new JLabel();
        add(manageac);
        right.add(manageac);
        
        JPanel titl = new JPanel ();
        add(titl);
        right.add(titl);
        titl.setLayout(null);
        titl.setBackground(new Color(99,109,154));
        titl.setBounds(0, 20, 1000, 75);
        
        JLabel title = new JLabel ("Manage Accounts");
        add(title);
        titl.add(title);
        title.setFont(new Font ("Times", Font.BOLD, 25));
        title.setForeground(Color.WHITE);
        title.setBounds(400, 0, 300, 75);
        
        JPanel Line1 = new JPanel();
        add(Line1);
        titl.add(Line1);
        Line1.setBackground(Color.WHITE);
        Line1.setBounds(400,15, 211, 1);
        
        JPanel Line = new JPanel();
        add(Line);
        titl.add(Line);
        Line.setBackground(Color.WHITE);
        Line.setBounds(400,61, 211, 1);
        
        JLabel id = new JLabel ("ID");
        add(id);
        right.add(id);
        id.setFont(new Font ("Times", Font.BOLD, 16));
        id.setForeground(new Color(99,109,154));
        id.setBounds(50,130 , 30,20);
        
        JTextField search = new JTextField("");
        add(search);
        right.add (search);
        search.setFont (new Font ("Times", Font.BOLD, 16));
        search.setForeground(new Color(99, 109, 154));
        search.setBounds(75, 125, 800, 30);
        
        ImageIcon searchicon = new ImageIcon("Search-Icon.png");
        JLabel icon = new JLabel ( searchicon );
        add(icon);
        right.add(icon);
        icon.setVisible(true);
        icon.setBounds(900, 125, 30,33);
        
        JLabel creat = new JLabel ("Creation Date");
        add(creat);
        right.add(creat);
        creat.setFont (new Font ("Times", Font.BOLD, 18));
        creat.setForeground(new Color(99,109,154));
        creat.setBounds(100, 200, 150, 30);
        
        JTextField create = new JTextField("");
        add(create);
        right.add(create);
        create.setFont (new Font ("Times", Font.BOLD, 18));
        create.setForeground(new Color(99,109,154));
        create.setBounds(260, 200, 150, 30);
        create.setEditable(false);
        
        JLabel username = new JLabel ("Username");
        add(username);
        right.add(username);
        username.setFont(new Font ("Times", Font.BOLD, 18));
        username.setForeground(new Color(99,109,154));
        username.setBounds(540, 200, 150, 30);
        
        JTextField usern = new JTextField("");
        add(usern);
        right.add(usern);
        usern.setFont (new Font ("Times", Font.BOLD, 18));
        usern.setForeground(new Color(99,109,154));
        usern.setBounds(680, 200, 150, 30);
        usern.setEditable(false);
        
        JLabel withdate = new JLabel ("Withdraw Date");
        add(withdate);
        right.add(withdate);
        withdate.setFont(new Font ("Times", Font.BOLD, 18));
        withdate.setForeground(new Color(99,109,154));
        withdate.setBounds(100,275, 200, 30);
        
        JLabel withvalue = new JLabel ("Withdraw Value");
        add(withvalue);
        right.add(withvalue);
        withvalue.setFont(new Font ("Times", Font.BOLD, 18));
        withvalue.setForeground(new Color(99,109,154));
        withvalue.setBounds(300,275, 200, 30);
        
        JList withdraw = new JList();
        add(withdraw);
        right.add(withdraw);
        withdraw.setVisible(true);
        withdraw.setFont(new Font ("Times", Font.BOLD, 14));
        withdraw.setForeground(Color.BLACK);
        withdraw.setBounds(100, 320, 330, 400);
        withdraw.setBackground(Color.GRAY);
        
        JLabel depodate = new JLabel ("Deposit Date");
        add(depodate);
        right.add(depodate);
        depodate.setFont(new Font ("Times", Font.BOLD, 18));
        depodate.setForeground(new Color(99,109,154));
        depodate.setBounds(500,275, 200, 30);
        
        JLabel depovalue = new JLabel ("Deposit Value");
        add(depovalue);
        right.add(depovalue);
        depovalue.setFont(new Font ("Times", Font.BOLD, 18));
        depovalue.setForeground(new Color(99,109,154));
        depovalue.setBounds(700,275, 200, 30);
        
        JList deposite = new JList();
        add(deposite);
        right.add(deposite);
        deposite.setVisible(true);
        deposite.setFont(new Font ("Times", Font.BOLD, 14));
        deposite.setForeground(Color.BLACK);
        deposite.setBounds(500, 320, 330, 400);
        deposite.setBackground(Color.GRAY);
        
        //manage account
        JLabel fname = new JLabel ("F.Name");
        add(fname);
        right.add(fname);
        fname.setForeground(new Color(99,109,154));
        fname.setFont(new Font ("Times", Font.BOLD, 18));
        fname.setBounds (200, 275, 100, 30);
        
        JTextField fname1 = new JTextField("5");
        add(fname1);
        right.add(fname1);
        fname1.setForeground(new Color (99,109,154));
        fname1.setFont(new Font ("Times", Font.BOLD, 18));
        fname1.setBounds (330, 275, 120, 30);
        fname1.setEditable(false);
        
        JLabel lname = new JLabel("L.Name");
        add(lname);
        right.add(lname);
        lname.setForeground(new Color(99,109,154));
        lname.setFont(new Font ("Times", Font.BOLD, 18));
        lname.setBounds (560, 275, 100, 30);
        
        JTextField lname1 = new JTextField("5");
        add(lname1);
        right.add(lname1);
        lname1.setForeground (new Color(99,109,154));
        lname1.setFont (new Font ("Times", Font.BOLD, 18));
        lname1.setBounds ( 680, 275, 130, 30);
        lname1.setEditable(false);
        
        JLabel ssn = new JLabel("SSN");
        add(ssn);
        right.add(ssn);
        ssn.setForeground(new Color(99,109,154));
        ssn.setFont(new Font("Times", Font.BOLD, 18));
        ssn.setBounds(200, 330, 100, 30);
        
        JTextField ssn1 = new JTextField("5");
        add(ssn1);
        right.add(ssn1);
        ssn1.setForeground(new Color (99,109,154));
        ssn1.setFont (new Font ("Times", Font.BOLD, 18));
        ssn1.setBounds(330, 330, 120, 30);
        ssn1.setEditable(false);
        
        JLabel email= new JLabel("E-Mail");
        add(email);
        right.add(email);
        email.setForeground(new Color(99,109,154));
        email.setFont(new Font ("Times", Font.BOLD, 18));
        email.setBounds(560, 330, 100, 30);
        
        JTextField mail = new JTextField("5");
        add(mail);
        right.add(mail);
        mail.setForeground(new Color(99,109,154));
        mail.setFont (new Font ("Times", Font.BOLD, 18));
        mail.setBounds(680,330,130,30);
        mail.setEditable(false);
        
        JLabel use = new JLabel ("Username");
        add(use);
        right.add(use);
        use.setForeground(new Color (99,109,154));
        use.setFont (new Font ("Times", Font.BOLD, 18));
        use.setBounds(200, 385, 100, 30);
        
        JTextField use1 = new JTextField("5");
        add(use1);
        right.add(use1);
        use1.setForeground(new Color(99,109,154));
        use1.setFont (new Font ("Times", Font.BOLD, 18));
        use1.setBounds(330, 385, 120, 30);
        use1.setEditable(false);
        
        JButton update = new JButton ("UP-DATE");
        add(update);
        right.add(update);
        update.setBackground(new Color (99,109,154));
        update.setForeground(Color.WHITE);
        update.setFont(new Font ("Times", Font.BOLD, 18));
        update.setBounds(270, 600, 150, 50);
        
        JButton save = new JButton ("SAVE");
        add(save);
        right.add(save);
        save.setBackground(new Color (99,109,154));
        save.setForeground(Color.WHITE);
        save.setFont(new Font ("Times", Font.BOLD, 18));
        save.setBounds(580, 600, 150, 50);
        
        //Visibililty
        creat.setVisible(false);
        create.setVisible(false);
        username.setVisible(false);
        usern.setVisible(false);
        withdate.setVisible(false);
        withvalue.setVisible(false);
        withdraw.setVisible(false);
        depodate.setVisible(false);
        depovalue.setVisible(false);
        deposite.setVisible(false);
        
        fname.setVisible (false);
        fname1.setVisible (false);
        lname.setVisible (false);
        lname1.setVisible (false);
        email.setVisible (false);
        mail.setVisible (false);
        ssn.setVisible (false);
        ssn1.setVisible (false);
        use.setVisible (false);
        use1.setVisible (false);
        save.setVisible(false);
        update.setVisible(false);

        back.addMouseListener (new MouseAdapter() 
        {
            @Override
            public void mouseClicked ( MouseEvent e )
            {
                JOptionPane.showMessageDialog (null, "Do you really want to logout !","Logout!", JOptionPane.ERROR_MESSAGE);
                
                setVisible(false);
                Login obj = new Login();
                obj.setVisible (true);
            }
        });
        
        balance.addMouseListener (new MouseAdapter() 
        {
            int y = 1;
            @Override
            public void mouseClicked ( MouseEvent e )
            {
                if ( y % 2 != 0 )
                {
                    creat.setVisible(true);
                    create.setVisible(true);
                    username.setVisible(true);
                    usern.setVisible(true);
                    withdate.setVisible(true);
                    withvalue.setVisible(true);
                    withdraw.setVisible(true);
                    depodate.setVisible(true);
                    depovalue.setVisible(true);
                    deposite.setVisible(true);
                    
                    fname.setVisible (false);
                    fname1.setVisible (false);
                    lname.setVisible (false);
                    lname1.setVisible (false);
                    email.setVisible (false);
                    mail.setVisible (false);
                    ssn.setVisible (false);
                    ssn1.setVisible (false);
                    use.setVisible (false);
                    use1.setVisible (false);
                    save.setVisible(false);
                    update.setVisible(false);
                    
                    y++;
                }
                
                else 
                {
                    creat.setVisible(false);
                    create.setVisible(false);
                    username.setVisible(false);
                    usern.setVisible(false);
                    withdate.setVisible(false);
                    withvalue.setVisible(false);
                    withdraw.setVisible(false);
                    depodate.setVisible(false);
                    depovalue.setVisible(false);
                    deposite.setVisible(false);
                    
                    fname.setVisible (false);
                    fname1.setVisible (false);
                    lname.setVisible (false);
                    lname1.setVisible (false);
                    email.setVisible (false);
                    mail.setVisible (false);
                    ssn.setVisible (false);
                    ssn1.setVisible (false);
                    use.setVisible (false);
                    use1.setVisible (false);
                    save.setVisible(false);
                    update.setVisible(false);
                    
                    y++;
                }
            }
        });
        
        manage.addMouseListener ( new MouseAdapter()   
        {
            int y = 1;
            public void mouseClicked(MouseEvent e)
            {
                if ( y % 2 != 0 )
                {
                    fname.setVisible (true);
                    fname1.setVisible (true);
                    lname.setVisible (true);
                    lname1.setVisible (true);
                    email.setVisible (true);
                    mail.setVisible (true);
                    ssn.setVisible (true);
                    ssn1.setVisible (true);
                    use.setVisible (true);
                    use1.setVisible (true);
                    save.setVisible(true);
                    update.setVisible(true);
                    
                    creat.setVisible(false);
                    create.setVisible(false);
                    username.setVisible(false);
                    usern.setVisible(false);
                    withdate.setVisible(false);
                    withvalue.setVisible(false);
                    withdraw.setVisible(false);
                    depodate.setVisible(false);
                    depovalue.setVisible(false);
                    deposite.setVisible(false);
                    
                    y++;
                }
                
                else 
                {
                    creat.setVisible(false);
                    create.setVisible(false);
                    username.setVisible(false);
                    usern.setVisible(false);
                    withdate.setVisible(false);
                    withvalue.setVisible(false);
                    withdraw.setVisible(false);
                    depodate.setVisible(false);
                    depovalue.setVisible(false);
                    deposite.setVisible(false);
                    
                    fname.setVisible (false);
                    fname1.setVisible (false);
                    lname.setVisible (false);
                    lname1.setVisible (false);
                    email.setVisible (false);
                    mail.setVisible (false);
                    ssn.setVisible (false);
                    ssn1.setVisible (false);
                    use.setVisible (false);
                    use1.setVisible (false);
                    save.setVisible(false);
                    update.setVisible(false);
                    
                    y++;
                }
            }
        });
        
    }
}
