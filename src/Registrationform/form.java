package Registrationform;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form extends JFrame implements ActionListener {
    JLabel label1,label2,label3,label4,label5;
    JTextField t1,t2;
    JTextArea ta1;
    JRadioButton male,female;
    JComboBox day,month,year;
    JCheckBox terms;
    JButton submit;
    JLabel mssg;
    JTextArea screen;
    form(){
          setTitle("Registration Form");
          setSize(800,500);
          setLocationRelativeTo(null);
          setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
          Container c=getContentPane();
          c.setLayout(null);
          c.setBackground(Color.CYAN);

          label1=new JLabel("Name:");
          label1.setBounds(20,50,100,20);
          c.add(label1);

          t1=new JTextField();
          t1.setBounds(120,50,200,20);
          c.add(t1);

          label2=new JLabel("Mobile:");
          label2.setBounds(20,100,100,20);
          c.add(label2);

          t2=new JTextField();
          t2.setBounds(120,100,200,20);
          c.add(t2);

          label3=new JLabel("Gender:");
          label3.setBounds(20,150,100,20);
          c.add(label3);

          male=new JRadioButton("male");
          female=new JRadioButton("female");
          male.setBounds(120,150,80,20);
          female.setBounds(220,150,80,20);
          c.add(male);
          c.add(female);
          ButtonGroup gender=new ButtonGroup();
          gender.add(male);
          gender.add(female);

          label4=new JLabel("Date Of Birth:");
          label4.setBounds(20,200,80,20);
          c.add(label4);

          String days[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
          String months[]={"January","February","March","April","May","June","July","August","September","October","November","December"};
          String years[]={"1995","1996", "1997", "1998", "1999", "2000", "2001","2002","2003", "2004", "2005", "2006", "2007", "2008","2009","2010", "2011", "2012", "2013", "2014", "2015","2016","2017", "2018", "2019", "2020", "2021", "2022"};
          day=new JComboBox<>(days);
          month=new JComboBox<>(months);
          year=new JComboBox<>(years);
          day.setBounds(120,200,50,20);
          month.setBounds(180,200,90,20);
          year.setBounds(280,200,60,20);
          c.add(day);
          c.add(month);
          c.add(year);

          label5=new JLabel("Address:");
          label5.setBounds(20,250,100,20);
          c.add(label5);

          ta1=new JTextArea();
          ta1.setBounds(120,250,250,30);
          c.add(ta1);

          terms=new JCheckBox("Please Accept The terms & condition");
          terms.setBounds(50,300,250,20);
          c.add(terms);

          submit=new JButton("Submit");
          submit.setBounds(150,350,80,20);
          submit.addActionListener(this);
          c.add(submit);

          screen=new JTextArea();
          screen.setBounds(400,50,300,300);
          c.add(screen);

          mssg=new JLabel();
          c.add(mssg);
          mssg.setFont(new Font("Serif",Font.ITALIC+Font.BOLD,23));
          mssg.setBounds(120,400,500,50);
          setVisible(true);
        }

    @Override
    public void actionPerformed(ActionEvent e) {
       if (!terms.isSelected()){mssg.setText("Please Accept The terms and condition!!");
       screen.setText(" ");
       mssg.setForeground(new Color(255, 0, 0));
       }

        else if ((terms.isSelected())&&(!t1.getText().isEmpty())&&(!t2.getText().isEmpty())&&(!ta1.getText().isEmpty())){
            mssg.setText("Registration is succeed");
            mssg.setForeground(Color.GREEN);
            String name=t1.getText();
            String mobile=t2.getText();
            String gender="male";
            if (female.isSelected()){
                gender="female";
            }
            String dob=day.getSelectedItem()+" "+month.getSelectedItem()+" "+year.getSelectedItem();
            String address=ta1.getText();
            screen.setText("    Name:               "+name+"\n"+"    Number:         "+mobile+"\n"+"    Gender:           "+gender+"\n"+"    Date of Birth:      "+dob+"\n"+"    Address:          "+address);
             mssg.setText("Registration is succeed");
             mssg.setForeground(Color.GREEN);
        }
        else if (t1.getText().isEmpty()){
                mssg.setText("Name is Missing");
            mssg.setForeground(Color.RED);
            }
        else if (t2.getText().isEmpty()){
                mssg.setText("Number is Missing");
                mssg.setForeground(Color.RED);
            }
        else if (ta1.getText().isEmpty()){
                mssg.setText("Address can not  be Empty");
                mssg.setForeground(Color.RED);
            }




    }
     public  void name(){
        mssg.setText("Fill the name");
        setFont(new Font("verdana",Font.ITALIC,13));
     }
}
