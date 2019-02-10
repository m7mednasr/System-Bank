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
import javax.swing.JOptionPane;

public class Customer extends JFrame
{
    public Customer ( )
    {
        setTitle ("QNSB");
        setSize(1300, 800);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible (true);
        setLayout(null);
        
        JPanel left = new JPanel ();
        add(left);
        left.setBounds (0,0, 300, 800);
        left.setLayout(null);
        left.setBackground(new Color (99,109,154));
        
        JButton withdrow = new JButton("WITHDROW");
        add(withdrow);
        left.add(withdrow);
        withdrow.setBackground(Color.WHITE);
        withdrow.setForeground(new Color(99,109,154));
        withdrow.setBounds (0,250,300,50);
        withdrow.setFont(new Font ("Times", Font.BOLD, 18));
        
        JButton deposite = new JButton("DEPOSITE");
        add(deposite);
        left.add(deposite);
        deposite.setBackground(Color.WHITE);
        deposite.setForeground(new Color(99,109,154));
        deposite.setBounds (0,365,300,50);
        deposite.setFont(new Font ("Times", Font.BOLD, 18));
        
        JButton info = new JButton("ACC-INFO");
        add(info);
        left.add(info);
        info.setBackground(Color.WHITE);
        info.setForeground(new Color(99,109,154));
        info.setBounds (0,475,300,50);
        info.setFont(new Font ("Times", Font.BOLD, 18));
        
        JLabel changepass = new JLabel ("Change Password");
        add(changepass);
        left.add(changepass);
        changepass.setFont(new Font ("Times", Font.BOLD, 16));
        changepass.setForeground(Color.WHITE);
        changepass.setBounds(75,650 , 200, 30);
        
        JButton back = new JButton("<<");
        add(back);
        left.add(back);
        back.setBackground(Color.WHITE);    
        back.setForeground(new Color(99,109,154));
        back.setFont(new Font ("Times", Font.BOLD, 18));
        back.setBounds(0,40,60,30);
        
        JPanel right = new JPanel ();
        add(right);
        right.setLayout(null);
        right.setBounds (300, 0, 1000, 800);
        right.setBackground(Color.WHITE);
        
        JPanel titl = new JPanel();
        add(titl);
        right.add(titl);
        titl.setLayout(null);
        titl.setBackground(new Color(99 , 109 , 154));
        titl.setBounds(335, 0, 300, 50);
        
        JLabel z = new JLabel("USERNAME");
        add(z);
        titl.add(z);
        z.setFont(new Font ("Times", Font.BOLD, 25));
        z.setForeground(Color.WHITE);
        z.setBounds(80, 0, 150, 50);
        
        //withdrow
        JLabel with = new JLabel ("W  I  T  H  D  R  O  W");
        right.add(with);
        with.setForeground(new Color(99,109,154));
        with.setFont(new Font ("Times", Font.BOLD, 36));
        with.setBounds(310, 205, 500, 50);
        
        JLabel enter = new JLabel ("Enter Value");
        add(enter);
        right.add(enter);
        enter.setFont (new Font ("Times", Font.BOLD, 25));
        enter.setForeground(new Color (99,109,154));
        enter.setBounds (230, 300, 150, 50);
        
        JTextField enter1 = new JTextField("");
        right.add(enter1);
        enter1.setFont (new Font ("Times", Font.BOLD, 18));
        enter1.setBounds (430, 300, 300, 50);
        
        JButton apply = new JButton ("CONFIRM");
        add(apply);
        right.add(apply);
        apply.setBackground(new Color(99,109,154));
        apply.setForeground(Color.WHITE);
        apply.setFont (new Font ("Times", Font.BOLD, 18));
        apply.setBounds (430, 400, 150, 50);
        
        //deposite
        JLabel dep = new JLabel ("D  E  P  O  S  I  T  E");
        add(dep);
        right.add(dep);
        dep.setForeground(new Color(99,109,154));
        dep.setFont(new Font ("Times", Font.BOLD, 36));
        dep.setBounds(310, 205, 500, 50);
        
        JLabel enterword = new JLabel ("Enter Value");
        add(enterword);
        right.add(enterword);
        enterword.setFont (new Font ("Times", Font.BOLD, 25));
        enterword.setForeground(new Color (99,109,154));
        enterword.setBounds (230, 300, 150, 50);
        
        JTextField enterfield = new JTextField("");
        add(enterfield);
        right.add(enterfield);
        enterfield.setFont (new Font ("Times", Font.BOLD, 18));
        enterfield.setBounds (430, 300, 300, 50);
        
        JButton apply1 = new JButton ("CONFIRM");
        add(apply1);
        right.add(apply1);
        apply1.setBackground(new Color(99,109,154));
        apply1.setForeground(Color.WHITE);
        apply1.setFont (new Font ("Times", Font.BOLD, 18));
        apply1.setBounds (430, 400, 150, 50);
        
        
        JPanel z0 = new JPanel ();
        add(z0);
        right.add(z0);
        z0.setBounds (130, 230, 150, 2);
        z0.setBackground(Color.BLACK);
        
        JPanel z1 = new JPanel ();
        add(z1);
        right.add(z1);
        z1.setBounds (130, 236, 150, 2);
        z1.setBackground(Color.BLACK);

        JPanel z2 = new JPanel ();
        add(z2);
        right.add(z2);
        z2.setBounds (690, 230, 150, 2);
        z2.setBackground(Color.BLACK);
        
        JPanel z3 = new JPanel ();
        add(z3);
        right.add(z3);
        z3.setBounds (690, 236, 150, 2);
        z3.setBackground(Color.BLACK);
        
        JPanel z4 = new JPanel ();
        add(z4);
        right.add(z4);
        z4.setBounds (130, 510, 720, 2);
        z4.setBackground(Color.BLACK);
        
        JPanel z5 = new JPanel ();
        add(z5);
        right.add(z5);
        z5.setBounds (130, 516, 720, 2);
        z5.setBackground(Color.BLACK);
        
        //acc info
        JLabel accinfo = new JLabel ("A  C  C  -  I  N  F  O");
        add(accinfo);
        right.add(accinfo);
        accinfo.setForeground(new Color(99,109,154));
        accinfo.setFont(new Font ("Times", Font.BOLD, 36));
        accinfo.setBounds(310, 205, 500, 50);
        
        JLabel fname = new JLabel ("F.Name");
        add(fname);
        right.add(fname);
        fname.setForeground(new Color(99,109,154));
        fname.setFont(new Font ("Times", Font.BOLD, 18));
        fname.setBounds (200, 275, 100, 30);
        
        JLabel fname1 = new JLabel("5");
        add(fname1);
        right.add(fname1);
        fname1.setForeground(new Color (99,109,154));
        fname1.setFont(new Font ("Times", Font.BOLD, 18));
        fname1.setBounds (330, 275, 120, 30);
        
        JLabel lname = new JLabel("L.Name");
        add(lname);
        right.add(lname);
        lname.setForeground(new Color(99,109,154));
        lname.setFont(new Font ("Times", Font.BOLD, 18));
        lname.setBounds (560, 275, 100, 30);
        
        JLabel lname1 = new JLabel("5");
        add(lname1);
        right.add(lname1);
        lname1.setForeground (new Color(99,109,154));
        lname1.setFont (new Font ("Times", Font.BOLD, 18));
        lname1.setBounds ( 680, 275, 130, 30);
        
        JLabel ssn = new JLabel("SSN");
        add(ssn);
        right.add(ssn);
        ssn.setForeground(new Color(99,109,154));
        ssn.setFont(new Font("Times", Font.BOLD, 18));
        ssn.setBounds(200, 330, 100, 30);
        
        JLabel ssn1 = new JLabel("5");
        add(ssn1);
        right.add(ssn1);
        ssn1.setForeground(new Color (99,109,154));
        ssn1.setFont (new Font ("Times", Font.BOLD, 18));
        ssn1.setBounds(330, 330, 120, 30);
        
        JLabel email= new JLabel("E-Mail");
        add(email);
        right.add(email);
        email.setForeground(new Color(99,109,154));
        email.setFont(new Font ("Times", Font.BOLD, 18));
        email.setBounds(560, 330, 100, 30);
        
        JLabel mail = new JLabel("5");
        add(mail);
        right.add(mail);
        mail.setForeground(new Color(99,109,154));
        mail.setFont (new Font ("Times", Font.BOLD, 18));
        mail.setBounds(680,330,130,30);
        
        JLabel use = new JLabel ("Username");
        add(use);
        right.add(use);
        use.setForeground(new Color (99,109,154));
        use.setFont (new Font ("Times", Font.BOLD, 18));
        use.setBounds(200, 385, 100, 30);
        
        JLabel use1 = new JLabel("5");
        add(use1);
        right.add(use1);
        use1.setForeground(new Color(99,109,154));
        use1.setFont (new Font ("Times", Font.BOLD, 18));
        use1.setBounds(330, 385, 120, 30);
        
        
        z0.setVisible(false);
        z1.setVisible(false);
        z2.setVisible(false);
        z3.setVisible(false);
        z4.setVisible(false);
        z5.setVisible(false);
        
        with.setVisible (false);
        enter.setVisible(false);
        enter1.setVisible (false);
        apply.setVisible (false);
        
        dep.setVisible (false);
        enterword.setVisible (false);
        enterfield.setVisible (false);
        apply1.setVisible (false);
        
        accinfo.setVisible (false);
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
        
        withdrow.addMouseListener (new MouseAdapter() 
        {
            int y = 1;
            @Override
            public void mouseClicked ( MouseEvent e )
            {
                if ( y % 2 != 0 )
                {
                    z0.setVisible(true);
                    z1.setVisible(true);
                    z2.setVisible(true);
                    z3.setVisible(true);
                    z4.setVisible(true);
                    z5.setVisible(true);

                    with.setVisible (true);
                    enter.setVisible(true);
                    enter1.setVisible (true);
                    apply.setVisible (true);
                    
                    dep.setVisible (false);
                    enterword.setVisible (false);
                    enterfield.setVisible (false);
                    apply1.setVisible (false);

                    accinfo.setVisible (false);
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
                    
                    y++;

                }
                else 
                {
                    z0.setVisible(false);
                    z1.setVisible(false);
                    z2.setVisible(false);
                    z3.setVisible(false);
                    z4.setVisible(false);
                    z5.setVisible(false);

                    with.setVisible (false);
                    enter.setVisible(false);
                    enter1.setVisible (false);
                    apply.setVisible (false);

                    dep.setVisible (false);
                    enterword.setVisible (false);
                    enterfield.setVisible (false);
                    apply1.setVisible (false);
                    
                    accinfo.setVisible (false);
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
                    
                    y++;
        
                }
                
                
            }
        });
        
        deposite.addMouseListener (new MouseAdapter() 
        {
            int y = 1;
            @Override
            public void mouseClicked ( MouseEvent e )
            {
                if ( y % 2 != 0 )
                {
                    z0.setVisible(true);
                    z1.setVisible(true);
                    z2.setVisible(true);
                    z3.setVisible(true);
                    z4.setVisible(true);
                    z5.setVisible(true);

                    with.setVisible (false);
                    enter.setVisible(false);
                    enter1.setVisible (false);
                    apply.setVisible (false);

                    dep.setVisible (true);
                    enterword.setVisible (true);
                    enterfield.setVisible (true);
                    apply1.setVisible (true);
                    
                    accinfo.setVisible (false);
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
                    
                    y++;
                }
                
                else 
                {
                    z0.setVisible(false);
                    z1.setVisible(false);
                    z2.setVisible(false);
                    z3.setVisible(false);
                    z4.setVisible(false);
                    z5.setVisible(false);

                    with.setVisible (false);
                    enter.setVisible(false);
                    enter1.setVisible (false);
                    apply.setVisible (false);

                    dep.setVisible (false);
                    enterword.setVisible (false);
                    enterfield.setVisible (false);
                    apply1.setVisible (false);
                    
                    accinfo.setVisible (false);
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
                    
                    y++;
                } 
            }
        });
        
        info.addMouseListener (new MouseAdapter() 
        {
            int y = 1;
            @Override
            public void mouseClicked ( MouseEvent e )
            {
                if ( y % 2 != 0 )
                {
                    z0.setVisible(true);
                    z1.setVisible(true);
                    z2.setVisible(true);
                    z3.setVisible(true);
                    z4.setVisible(true);
                    z5.setVisible(true);

                    with.setVisible (false);
                    enter.setVisible(false);
                    enter1.setVisible (false);
                    apply.setVisible (false);

                    dep.setVisible (false);
                    enterword.setVisible (false);
                    enterfield.setVisible (false);
                    apply1.setVisible (false);
                    
                    accinfo.setVisible (true);
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
                    y++;
                }
                else 
                {
                    z0.setVisible(false);
                    z1.setVisible(false);
                    z2.setVisible(false);
                    z3.setVisible(false);
                    z4.setVisible(false);
                    z5.setVisible(false);

                    with.setVisible (false);
                    enter.setVisible(false);
                    enter1.setVisible (false);
                    apply.setVisible (false);

                    dep.setVisible (false);
                    enterword.setVisible (false);
                    enterfield.setVisible (false);
                    apply1.setVisible (false);
                    
                    accinfo.setVisible (false);
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
                    
                    y++;
                } 
                
            }
        });
        
        
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
        
        changepass.addMouseListener ( new MouseAdapter()
        {
            public void mouseClicked (MouseEvent e)
            {
                setVisible (false);
                new changepass();
            }
        });
    }
}
