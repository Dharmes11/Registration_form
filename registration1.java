import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Gui extends JFrame 
{
    static Container c;
    JLabel title, nm, m_no, dob, gen, address;
    JTextField txtnm, txtm_no, txt_dob;
    JRadioButton male, female;
    JCheckBox cb1;
    JButton print;
    JTextArea addarea, txtarea;
    Font font,font1;
    ButtonGroup btngrp;

    public Gui() 
    {
        setTitle("Registration Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1100, 900);
        setLocation(100, 50);

        c = getContentPane();
        c.setLayout(null);
    }

    void components() 
    {
        title = new JLabel("User Registration Form");
        nm = new JLabel("Name : ");
        txtnm = new JTextField();
        m_no = new JLabel("Mobile No : ");
        txtm_no = new JTextField();
        dob = new JLabel("Date Of Birth : ");  
        txt_dob = new JTextField();  
        gen = new JLabel("Gender : ");
        male = new JRadioButton("Male");
        female = new JRadioButton( "Female");
        address = new JLabel("Address : ");
        addarea = new JTextArea();
        cb1 = new JCheckBox("I Accept All Terms And Condition");
        print = new JButton("Print Information");
        btngrp =new ButtonGroup();
        txtarea = new JTextArea();
    }

    void fontsize() 
    {
        font = new Font("arial", Font.BOLD, 30);
        font1 = new Font("arial", Font.BOLD, 40);
    }

    void createlayout() 
    {
        title.setBounds(200,10,450,50);
        title.setForeground(Color.RED);
        nm.setBounds(100,80,180,50);
        txtnm.setBounds(320,80,280,50);
        m_no.setBounds(100,160,180,50);
        txtm_no.setBounds(320,160,280,50);
        dob.setBounds(100,230,250,50);
        txt_dob.setBounds(320,235,280,50);
        gen.setBounds(100,330,250,50);
        male.setBounds(320,310,250,50);
        female.setBounds(320,370,250,50);
        address.setBounds(100,450,280,50);
        addarea.setBounds(320,460,300,190);
        cb1.setBounds(100,680,700,50);
        print.setBounds(200,750,350,50);
        txtarea.setBounds(700,80,350,250);
    }

    void addcomponent() 
    {        
        c.add(title);
        title.setFont(font1);
        c.add(nm);
        nm.setFont(font);
        c.add(txtnm);
        txtnm.setFont(font);
        c.add(m_no);
        m_no.setFont(font);
        c.add(txtm_no);
        txtm_no.setFont(font);
        c.add(dob);
        dob.setFont(font);
        c.add(txt_dob);
        txt_dob.setFont(font);
        c.add(gen);
        gen.setFont(font);
        c.add(male);
        male.setFont(font);
        c.add(female);
        female.setFont(font);
        c.add(address);
        address.setFont(font);
        c.add(addarea);
        addarea.setFont(font);
        c.add(cb1);
        cb1.setFont(font);
        c.add(print);
        print.setFont(font);
        btngrp.add(male);
        btngrp.add(female);
        c.add(txtarea);
        txtarea.setFont(font);

        
        print.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent e)
            {
                if (cb1.isSelected()== true)
                {
                    JOptionPane.showMessageDialog(c, "Registration successful!");
                    String name = txtnm.getText();
                    String mobileNo = txtm_no.getText();
                    String dob = txt_dob.getText();
                    String gender = male.isSelected() ? "Male" : female.isSelected() ? "Female" : "";
                    String address = addarea.getText();
                    txtarea.setText("Name: " + name + "\n" + "Mobile No: " + mobileNo + "\n" +"Date Of Birth: " + dob + "\n" +"Gender: " + gender + "\n" +"Address: " + address);
                }   
                else
                {
                    JOptionPane.showMessageDialog(c, "Please Select CheckBox!!!");
                }
            }
        });
    }
}
public class registration1
{
    public static void main(String[] args) 
    {
        Gui g = new Gui();
        g.components();
        g.fontsize();
        g.createlayout();
        g.addcomponent();
        g.setVisible(true);
        g.setResizable(false);
    }
}