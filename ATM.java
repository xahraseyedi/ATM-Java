//https://www.youtube.com/watch?v=dfhmTyRTCSQ
//از این ویدیو کمک گرفتم


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.Field;

public class ATM implements ActionListener {
    static String pass;
    static String passorg = "1383";
    ///////////
    JFrame frame = new JFrame("ATM");
    JPanel panel = new JPanel(); //پنل ورود
    JButton vorood = new JButton("ورود"); //دکمه ورود
    JPanel langPanel = new JPanel();//پنل انتخاب زبان
    JButton farsi = new JButton("فارسی");
    JButton eng = new JButton("English");
    JPanel passPanel = new JPanel();//پنل وارد کردن رمز
    JButton enter = new JButton("ثبت");
    JTextField passfield = new JTextField();
    JPanel panel2 = new JPanel(); //پنل انتخاب عملیات
    JButton taghirramz = new JButton("تغییر رمز");
    JButton bardasht = new JButton("برداشت وجه");
    JButton mojoodi = new JButton("اعلام موجودی");
    JButton enteghal = new JButton("کارت به کارت");
    JPanel amaliatPanel = new JPanel(); //پنل نتیجه
    ///////
    JPanel taghirramzPanel = new JPanel(); //پنل صفحه تغییر رمز
    JButton taeedButton = new JButton("تایید");
    JButton bazgasht1Button = new JButton("بازگشت");
    JPanel mojoodiPanel = new JPanel();  //پنل اعلام موجودی
    JButton taeed4Button = new JButton("تایید");
    JButton bazgasht4Button = new JButton("بازگشت");
    JPanel bardashtPanel = new JPanel(); //پنل برداشت وجه
    JButton button1 = new JButton("500000");
    JButton button2 = new JButton("1500000");
    JButton button3 = new JButton("مبالغ دیگر");
    JButton button4 = new JButton("1000000");
    JButton button5 = new JButton("2000000");
    JButton bazgashtButton = new JButton("بازگشت");
    JPanel mablaghPanel = new JPanel(); //قیمت دلخواه
    JButton taeed2Button = new JButton("تایید");
    JButton bazgasht2Button = new JButton("بازگشت");
    JPanel enteghalPanel = new JPanel(); //پنل کارت به کارت
    JButton taeed3Button = new JButton("تایید");
    JButton bazgasht3Button = new JButton("بازگشت");



    ATM()
    {
        Dimension framesize = new Dimension(1024,1024);
        frame.setSize(framesize);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        ////////////////////////////////////////////////////////////////////////////////////
        panel.setBackground(Color.gray);
        panel.setBounds(0,0,1024,1024);
        panel.setLayout(null);
        vorood.setBounds(462,400,100,50);
        frame.add(panel);
        panel.add(vorood);
        langPanel.setBackground(Color.gray);
        langPanel.setBounds(0,0,1024,1024);
        langPanel.setLayout(null);
        farsi.setBounds(874,400,100,50);
        eng.setBounds(50,400,100,50);
        langPanel.add(farsi);
        langPanel.add(eng);
        vorood.addActionListener(this);
        //صفحه رمز//////////////////////////////////////////
        passPanel.setBackground(Color.gray);
        passPanel.setBounds(0,0,1024,1024);
        passPanel.setLayout(null);
        JLabel passlbl = new JLabel("رمز خود را وارد کنید:");
        passlbl.setBounds(460,290,400,100);
        passfield.setBounds(412,360,200,50);
        enter.setBounds(487,450,50,50);
        passPanel.add(passlbl);
        passPanel.add(passfield);
        passPanel.add(enter);
        farsi.addActionListener(this);
        //صفحه اصلی//////////////////////////////////////////////////////
        panel2.setBackground(Color.gray);
        panel2.setBounds(0,0,1024,1024);
        panel2.setLayout(null);
        taghirramz.setBounds(874,208,150,50);
        bardasht.setBounds(0,208,150,50);
        mojoodi.setBounds(874,566,150,50);
        enteghal.setBounds(0,566,150,50);
        panel2.add(taghirramz);
        panel2.add(bardasht);
        panel2.add(mojoodi);
        panel2.add(enteghal);
        enter.addActionListener(this);
        ////////////////////////////////////
        amaliatPanel.setBackground(Color.gray);
        amaliatPanel.setBounds(0,0,1024,1024);
        amaliatPanel.setLayout(null);
        JLabel amaliatlbl = new JLabel("عملیات شما با موفقیت انجام شد!");
        amaliatlbl.setBounds(450,370,600,100);
        amaliatPanel.add(amaliatlbl);
        ////////////////////////////////////
        //تغییر رمز//////////////////////////////////////////////
        taghirramzPanel.setBackground(Color.gray);
        taghirramzPanel.setBounds(0,0,1024,1024);
        taghirramzPanel.setLayout(null);
        JLabel taghirramzlbl = new JLabel("رمز جدید را وارد کنید:");
        taghirramzlbl.setBounds(462,290,400,100);
        JTextField taghirramzField = new JTextField();
        taghirramzField.setBounds(416,360,200,50);
        taeedButton.setBounds(924,600,100,50);
        bazgasht1Button.setBounds(0,600,100,50);
        taghirramzPanel.add(taghirramzlbl);
        taghirramzPanel.add(taghirramzField);
        taghirramzPanel.add(taeedButton);
        taghirramzPanel.add(bazgasht1Button);
        taghirramz.addActionListener(this);
        taeedButton.addActionListener(this);
        bazgasht1Button.addActionListener(this);
        //اعلام موجودی////////////////////////////////////////////////
        mojoodiPanel.setBounds(0,0,1024,1024);
        mojoodiPanel.setBackground(Color.gray);
        mojoodiPanel.setLayout(null);
        JLabel mojoodilbl = new JLabel("موجودی حساب شما: 1,232,345 ریال");
        mojoodilbl.setBounds(420,370,600,100);
        taeed4Button.setBounds(924,600,100,50);
        bazgasht4Button.setBounds(0,600,100,50);
        mojoodiPanel.add(mojoodilbl);
        mojoodiPanel.add(taeed4Button);
        mojoodiPanel.add(bazgasht4Button);
        mojoodi.addActionListener(this);
        taeed4Button.addActionListener(this);
        bazgasht4Button.addActionListener(this);
        //برداشت وجه//////////////////////////////////////////
        bardashtPanel.setBounds(0,0,1024,1024);
        bardashtPanel.setBackground(Color.gray);
        bardashtPanel.setLayout(null);
        button1.setBounds(924,169,100,50);
        button2.setBounds(924,437,100,50);
        button3.setBounds(924,705,100,50);
        button4.setBounds(0,169,100,50);
        button5.setBounds(0,437,100,50);
        bazgashtButton.setBounds(0,705,100,50);
        bardashtPanel.add(button1);
        bardashtPanel.add(button2);
        bardashtPanel.add(button3);
        bardashtPanel.add(button4);
        bardashtPanel.add(button5);
        bardashtPanel.add(bazgashtButton);
        bardasht.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        bazgashtButton.addActionListener(this);
       /////////////////////
        mablaghPanel.setBounds(0,0,1024,1024);
        mablaghPanel.setBackground(Color.gray);
        mablaghPanel.setLayout(null);
        JLabel mablaghlbl = new JLabel("مبلغ مورد نظر خود را وارد کنید:");
        mablaghlbl.setBounds(442,290,500,100);
        JTextField mablaghField = new JTextField();
        mablaghField.setBounds(416,360,200,50);
        taeed2Button.setBounds(924,600,100,50);
        bazgasht2Button.setBounds(0,600,100,50);
        mablaghPanel.add(mablaghlbl);
        mablaghPanel.add(mablaghField);
        mablaghPanel.add(taeed2Button);
        mablaghPanel.add(bazgasht2Button);
        button3.addActionListener(this);
        taeed2Button.addActionListener(this);
        bazgasht2Button.addActionListener(this);
        //کارت به کارت//////////////////////////////////////////////
        enteghalPanel.setBackground(Color.gray);
        enteghalPanel.setLayout(null);
        enteghalPanel.setBounds(0,0,1024,1024);
        JTextField Field1 = new JTextField();
        Field1.setBounds(416,200,200,50);
        JLabel lbl1 = new JLabel("مبلغ مورد نظر را وارد کنید:");
        lbl1.setBounds(450,130,200,50);
        JTextField Field2 = new JTextField();
        Field2.setBounds(416,360,200,50);
        JLabel lbl2 = new JLabel("شماره کارت مقصد را وارد کنید:");
        lbl2.setBounds(440,290,200,50);
        taeed3Button.setBounds(924,600,100,50);
        bazgasht3Button.setBounds(0,600,100,50);
        enteghalPanel.add(Field1);
        enteghalPanel.add(Field2);
        enteghalPanel.add(lbl1);
        enteghalPanel.add(lbl2);
        enteghalPanel.add(taeed3Button);
        enteghalPanel.add(bazgasht3Button);
        enteghal.addActionListener(this);
        taeed3Button.addActionListener(this);
        bazgasht3Button.addActionListener(this);
    }

    public static void main(String[] args) {

       ATM atm = new ATM();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==vorood)
        {
            frame.remove(panel);
            frame.add(langPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==farsi)
        {
            frame.remove(langPanel);
            frame.add(passPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==enter)
        {    pass = passfield.getText();
            if(pass.equals(passorg))
            {
                frame.remove(passPanel);
                frame.add(panel2);
                frame.revalidate();
                frame.repaint();
            }
        }
        if(e.getSource()==taghirramz)
        {
            frame.remove(panel2);
            frame.add(taghirramzPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==taeedButton)
        {
            frame.remove(taghirramzPanel);
            frame.add(amaliatPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==bazgasht1Button)
        {
            frame.remove(taghirramzPanel);
            frame.add(panel2);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==mojoodi)
        {
            frame.remove(panel2);
            frame.add(mojoodiPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==taeed4Button)
        {
            frame.remove(mojoodiPanel);
            frame.add(amaliatPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==bazgasht4Button)
        {
            frame.remove(mojoodiPanel);
            frame.add(panel2);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==bardasht)
        {
            frame.remove(panel2);
            frame.add(bardashtPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==button1)
        {
            frame.remove(bardashtPanel);
            frame.add(amaliatPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==button2)
        {
            frame.remove(bardashtPanel);
            frame.add(amaliatPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==button4)
        {
            frame.remove(bardashtPanel);
            frame.add(amaliatPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==button5)
        {
            frame.remove(bardashtPanel);
            frame.add(amaliatPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==bazgashtButton)
        {
            frame.remove(bardashtPanel);
            frame.add(panel2);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==button3)
        {
            frame.remove(bardashtPanel);
            frame.add(mablaghPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==taeed2Button)
        {
            frame.remove(mablaghPanel);
            frame.add(amaliatPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==bazgasht2Button)
        {
            frame.remove(mablaghPanel);
            frame.add(bardashtPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==enteghal)
        {
            frame.remove(panel2);
            frame.add(enteghalPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==taeed3Button)
        {
            frame.remove(enteghalPanel);
            frame.add(amaliatPanel);
            frame.revalidate();
            frame.repaint();
        }
        if(e.getSource()==bazgasht3Button)
        {
            frame.remove(enteghalPanel);
            frame.add(panel2);
            frame.revalidate();
            frame.repaint();
        }
    }
}