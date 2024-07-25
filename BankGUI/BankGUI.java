
/**
 *
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.ArrayList;
//making class 
public class BankGUI 
{   
    //declearing all J components
    JLabel j1 ;
    JButton jb1 , jb2 ;
    JFrame jf , jf1 , jf2 ,jf3, jf4, jf5 ;

    //components for debit card
    JLabel j2,j3,j4,j5,j6,j7,j8;
    JTextField t1 , t2 , t3 , t4 , t5 , t6 , t7 ;
    JButton jb3 , jb4 , jb5 , jb6 , jb7 ;

    //components for creditcard
    JLabel j9 , j10 , j11 , j12 , j13 , j14 , j15 ,j16, j17, j18;
    JTextField t9 , t10 , t11 , t12 , t13 , t14 , t15 , t16 , t17 , t18;
    JButton jb8 , jb9 , jb10 , jb11 , jb12 ,jb22;
    JComboBox jcb1 , jcb2 , jcb3 ;

    //componets for withdraw
    JLabel j19, j20, j21 , j22 , j23 ;
    JTextField t19, t20, t21 , t22 ;
    JButton jb13 , jb14 , jb15 ;
    JComboBox jcb4 , jcb5, jcb6 ;

    //componets for creditlimit
    JLabel j24, j25, j26 , j27 , j28 ;
    JTextField t25, t26 , t27 ,t28 ;
    JButton jb16, jb17 , jb18 ;

    //compoents for cancel credit card
    JLabel j29 , j30;
    JTextField t30;
    JButton jb19 , jb20, jb21;

    //ArrayList
    ArrayList<BankCard> arrayBankCard = new ArrayList<BankCard>();
    //making constructor
    public BankGUI()
    {
        jf=new JFrame("BankGUI");
        jf.setSize(803,557);//jframe's object 

        JPanel mainpanel = new JPanel(); //Jpanel's object 
        mainpanel.setBounds(0,0,803,557);
        Color color = new Color(0,55,72);
        mainpanel.setBackground(color);
        mainpanel.setLayout(null);

        JPanel panel1 = new JPanel();
        panel1.setBounds(8,8,787,511);
        Color color1 = new Color(0,110,140);
        panel1.setBackground(color1);
        panel1.setLayout(null);

        JPanel panel2 = new JPanel();
        panel2.setBounds(10,10,767,490);
        Color color2 = new Color(0,141,177);
        panel2.setBackground(color2);
        panel2.setLayout(null);

        JPanel panel3 = new JPanel();
        panel3.setBounds(13,15,743,460);
        panel3.setBackground(Color.white);
        panel3.setLayout(null);

        JPanel panel4 = new JPanel();
        panel4.setBounds(189,55,402,62);
        Color color4 = new Color(0,52,72);
        panel4.setBackground(color4);
        panel4.setLayout(null);

        JPanel panel5 = new JPanel();
        panel5.setBounds(5,5,393,53);
        panel5.setBackground(Color.white);

        j1 = new JLabel("WELCOME TO OUR BANK");
        j1.setBounds(231,67,317,37);
        j1.setFont(new Font("Serif", Font.BOLD,30));

        jb1= new JButton("Debit Card");
        jb1.setBounds(195,263,402,52);
        Color color5 = new Color(0,110,140);
        jb1.setForeground(color5);
        jb1.setFont(new Font("Serif", Font.BOLD,23));
        jb1.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    DebitCard();
                    jf.dispose();
                }
            });

        jb2= new JButton("Credit Card");
        jb2.setBounds(195,325,402,52);
        Color color6 = new Color(0,110,140);
        jb2.setForeground(color6);
        jb2.setFont(new Font("Serif", Font.BOLD,23));
        //using action listiner to perform task
        jb2.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    CreditCard();
                    jf.dispose();
                }
            });

        jf.add(mainpanel);
        mainpanel.add(panel1);
        panel1.add(panel2);
        panel2.add(panel3);
        panel3.add(panel4);
        panel4.add(panel5);
        panel5.add(j1);
        panel3.add(jb1);
        panel3.add(jb2);

        jf.setResizable(false);
        jf.setVisible(true);

    }
    //making main method to run the program
    public void main(String[] args)
    {
        new BankGUI();
    }
    //making method to open GUI
    public void DebitCard()
    {
        jf1=new JFrame("Debit Card");
        jf1.setSize(803,557);
        
        
        JPanel mainpanel1 = new JPanel(); //Jpanel's object 
        mainpanel1.setBounds(0,0,803,557);
        Color color = new Color(0,55,72);
        mainpanel1.setBackground(color);
        mainpanel1.setLayout(null);

        JPanel panel6 = new JPanel();
        panel6.setBounds(8,8,787,511);
        Color color1 = new Color(0,110,140);
        panel6.setBackground(color1);
        panel6.setLayout(null);

        JPanel panel7 = new JPanel();
        panel7.setBounds(10,10,767,490);
        Color color2 = new Color(0,141,177);
        panel7.setBackground(color2);
        panel7.setLayout(null);

        JPanel panel8 = new JPanel();
        panel8.setBounds(13,15,743,460);
        panel8.setBackground(Color.white);
        panel8.setLayout(null);

        j8=new JLabel("DEBIT CARD");
        j8.setBounds(327,7,160,35);
        Color color7 = new Color(0,0,0);
        j8.setForeground(color7);
        j8.setFont(new Font("Serif", Font.BOLD,23));

        j2=new JLabel("Card ID : ");
        j2.setBounds(31,81,72,22);
        Color color9 = new Color(0,110,140);
        j2.setForeground(color9);
        j2.setFont(new Font("Serif", Font.BOLD,15));

        t2=new JTextField();
        t2.setBounds(171,76,180,32);

        j3=new JLabel("Client Name :");
        j3.setBounds(400,76,104,22);
        Color color10 = new Color(0,110,140);
        j3.setForeground(color10);
        j3.setFont(new Font("Serif", Font.BOLD,15));

        t3=new JTextField();
        t3.setBounds(529,71,180,32);

        j4=new JLabel("Issuer Bank :");
        j4.setBounds(31,143,104,28);
        Color color11 = new Color(0,110,140);
        j4.setForeground(color11);
        j4.setFont(new Font("Serif", Font.BOLD,15));

        t4=new JTextField();
        t4.setBounds(171,143,180,32);

        j5=new JLabel("Bank Account :");
        j5.setBounds(400,149,120,22);
        Color color12 = new Color(0,110,140);
        j5.setForeground(color12);
        j5.setFont(new Font("Serif", Font.BOLD,15));

        t5=new JTextField();
        t5.setBounds(529,139,180,32);

        j6=new JLabel("Balane Amount :");
        j6.setBounds(31,215,134,22);
        Color color13 = new Color(0,110,140);
        j6.setForeground(color13);
        j6.setFont(new Font("Serif", Font.BOLD,15));

        t6=new JTextField();
        t6.setBounds(171,210,180,32);

        j7=new JLabel("Pin Number :");
        j7.setBounds(400,210,110,22);
        Color color14 = new Color(0,110,140);
        j7.setForeground(color14);
        j7.setFont(new Font("Serif", Font.BOLD,15));

        t7=new JTextField();
        t7.setBounds(529,205,180,32);

        jb3= new JButton("Add Debit Card");
        jb3.setBounds(41,307,316,32);

        jb3.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    //check if a user kept any text field empty
                    try{
                        if(t2.getText().isEmpty() || t3.getText().isEmpty() ||  t4.getText().isEmpty() || t5.getText().isEmpty() || t6.getText().isEmpty() || t7.getText().isEmpty()){
                            JOptionPane.showMessageDialog(jf1, "You can't keep field empty. ", "Error", JOptionPane. ERROR_MESSAGE);
                        }
                        else if(Integer.parseInt (t2. getText ())<=0 || Integer .parseInt (t6.getText ())<=0 ||  Integer .parseInt (t7.getText ())<=0)
                        {
                            JOptionPane.showMessageDialog(jf1, "Please input postive value.", "Error", JOptionPane. ERROR_MESSAGE);
                        }
                        else
                        {
                            int cardid=Integer.parseInt(t2.getText());
                            boolean cardID_repetion= false;//using flag upcasting concept
                            for(BankCard card : arrayBankCard){
                                if(card.getCardId()== cardid){
                                    cardID_repetion =true;
                                    break;

                                }
                            }
                            if(cardID_repetion){
                                JOptionPane.showMessageDialog(jf1, "The card information you provided already exists in our system. Please enter a new card with appropriate details.","Error", JOptionPane. INFORMATION_MESSAGE);
                                t2.setText("");
                                t3.setText("");
                                t4.setText("");
                                t5.setText("");
                                t6.setText("");
                                t7.setText("");
                            }
                            else
                            {
                                int cardID = Integer.parseInt (t2. getText ());
                                String clientName = t3.getText () ;
                                String issuerBank = t4.getText() ;
                                String bankAccount = t5. getText ();
                                int balanceAmount = Integer .parseInt (t6.getText ()) ;
                                int pinNumber = Integer .parseInt (t7.getText ());
                                DebitCard objDebitCard = new DebitCard(balanceAmount,cardID, issuerBank,bankAccount, clientName,pinNumber);
                                arrayBankCard.add(objDebitCard);
                                JOptionPane.showMessageDialog(jf1, "Information has been stored.", "SUCCESSFUL", JOptionPane. INFORMATION_MESSAGE);
                            }
                        }
                    }
                    //using try and catch for exceptional handling

                    catch(NumberFormatException fe){
                        JOptionPane.showMessageDialog(jf1, "Please enter appropriate value","Error", JOptionPane. INFORMATION_MESSAGE);
                        t2.setText("");
                        t3.setText("");
                        t4.setText("");
                        t5.setText("");
                        t6.setText("");
                        t7.setText("");

                    }
                 
                }

            });
        jb4= new JButton("Display");
        jb4.setBounds(400,307,309,32);
        jb4.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    for(BankCard card : arrayBankCard)
                    {
                        if (card instanceof DebitCard)
                        {
                            DebitCard debitobj = (DebitCard) card;//typecasting(up)
                            debitobj.display();
                        }
                    }
                }
            });

        jb5= new JButton("Home");
        jb5.setBounds(79,395,120,32);
        jb5.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    new BankGUI();
                    jf1.dispose();
                }
            });

        jb6= new JButton("Withdrawal");
        jb6.setBounds(295,394,151,32);
        jb6.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    WithDraw();
                    jf1.dispose();
                }
            });

        jb7= new JButton("Clear");
        jb7.setBounds(555,394,150,32);
        jb7.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    t2.setText("");
                    t3.setText("");
                    t4.setText("");
                    t5.setText("");
                    t6.setText("");
                    t7.setText("");
                }
            });

        panel8.add(j8);
        panel8.add(j2);
        panel8.add(t2);
        panel8.add(j3);
        panel8.add(t3);
        panel8.add(j4);
        panel8.add(t4);
        panel8.add(j5);
        panel8.add(t5);
        panel8.add(j6);
        panel8.add(t6);
        panel8.add(j7);
        panel8.add(t7);
        panel8.add(jb3);
        panel8.add(jb4);
        panel8.add(jb5);
        panel8.add(jb6);
        panel8.add(jb7);

        jf1.add(mainpanel1);
        mainpanel1.add(panel6);
        panel6.add(panel7);
        panel7.add(panel8);

        jf1.setResizable(false);
        jf1.setVisible(true);
        
    }
    //making method to open GUI 
    public void CreditCard(){
        jf2=new JFrame();
        JPanel mainpanel2 = new JPanel(); //Jpanel's object 
        mainpanel2.setBounds(0,0,803,557);
        Color color = new Color(0,55,72);
        mainpanel2.setBackground(color);
        mainpanel2.setLayout(null);

        JPanel panel8 = new JPanel();
        panel8.setBounds(8,8,787,511);
        Color color1 = new Color(0,110,140);
        panel8.setBackground(color1);
        panel8.setLayout(null);

        JPanel panel9 = new JPanel();
        panel9.setBounds(10,10,767,490);
        Color color2 = new Color(0,141,177);
        panel9.setBackground(color2);
        panel9.setLayout(null);

        JPanel panel10 = new JPanel();
        panel10.setBounds(13,15,743,460);
        panel10.setBackground(Color.white);
        panel10.setLayout(null);

        j15=new JLabel("CREDIT CARD");
        j15.setBounds(313,28,179,35);
        Color color8 = new Color(0,0,0);
        j15.setForeground(color8);
        j15.setFont(new Font("Serif", Font.BOLD,23));

        j9=new JLabel("Card ID : ");
        j9.setBounds(41,83,72,22);
        Color color15 = new Color(0,110,140);
        j9.setForeground(color15);
        j9.setFont(new Font("Serif", Font.BOLD,15));

        t9=new JTextField();
        t9.setBounds(181,83,180,32);

        j10=new JLabel("Client Name :");
        j10.setBounds(403,88,104,22);
        Color color16 = new Color(0,110,140);
        j10.setForeground(color16);
        j10.setFont(new Font("Serif", Font.BOLD,15));

        t10=new JTextField();
        t10.setBounds(523,83,180,32);

        j11=new JLabel("Issuer Bank :");
        j11.setBounds(41,142,104,28);
        Color color17 = new Color(0,110,140);
        j11.setForeground(color17);
        j11.setFont(new Font("Serif", Font.BOLD,15));

        t11=new JTextField();
        t11.setBounds(181,143,180,32);

        j12=new JLabel("Bank Account :");
        j12.setBounds(403,143,120,22);
        Color color18 = new Color(0,110,140);
        j12.setForeground(color18);
        j12.setFont(new Font("Serif", Font.BOLD,15));

        t12=new JTextField();
        t12.setBounds(523,138,180,32);

        j13=new JLabel("Balane Amount :");
        j13.setBounds(35,207,134,22);
        Color color19 = new Color(0,110,140);
        j13.setForeground(color19);
        j13.setFont(new Font("Serif", Font.BOLD,15));

        t13=new JTextField();
        t13.setBounds(181,203,180,32);

        j14=new JLabel("CVC Number :");
        j14.setBounds(403,208,110,22);
        Color color20 = new Color(0,110,140);
        j14.setForeground(color20);
        j14.setFont(new Font("Serif", Font.BOLD,15));

        t14=new JTextField();
        t14.setBounds(523,203,180,32);

        j16=new JLabel("Interest Rate :");
        j16.setBounds(204,266,130,29);
        Color color21 = new Color(0,110,140);
        j16.setForeground(color21);
        j16.setFont(new Font("Serif", Font.BOLD,15));

        t15=new JTextField();
        t15.setBounds(306,263,180,32);

        j18=new JLabel("Expiry Date :");
        j18.setBounds(205,324,103,22);
        Color color23 = new Color(0,110,140);
        j18.setForeground(color23);
        j18.setFont(new Font("Serif", Font.BOLD,15));

        String day[]={"1","2","3","4","5","6","7","8","9","10","11","12","13",
                "14","15","16","17","18","19","20","21","22","23","24","25","26",
                "27","28","29","30"};
        jcb1= new JComboBox(day);
        jcb1.setBounds(308,321,66,32);

        String month[]={"January", "February", "March", "April", "May", 
                "June", "July" , "August", "September", "October",
                "November", "December"};
        jcb2= new JComboBox(month);
        jcb2.setBounds(382,319,86,32);

        String year[]={"2023","2024","2025","2026","2027","2028"};
        jcb3=new JComboBox(year);
        jcb3.setBounds(476,319,77,32);

        jb8= new JButton("Add Credit Card");
        jb8.setBounds(45,370,316,32);
        jb8.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    boolean check = true;

                    if(t9.getText().isEmpty() || t10.getText().isEmpty() || t11.getText().isEmpty() || t12.getText().isEmpty() 
                    || t13.getText().isEmpty() || t14.getText().isEmpty() ||t15.getText().isEmpty()){
                        JOptionPane.showMessageDialog(jf2, "You can't keep filed empty.", "Error", JOptionPane. ERROR_MESSAGE);
                        check=false;
                    }
                    else if(Integer.parseInt (t9. getText ())<=0 || Integer .parseInt (t13.getText ())<=0 || Integer .parseInt (t14.getText ())<=0 )
                    {
                     JOptionPane.showMessageDialog(jf2, "Please enter positive number.", "Error", JOptionPane. ERROR_MESSAGE);
                    }
                    
                    if(check)
                    {
                        try{
                            int cardID = Integer.parseInt (t9. getText ());
                            String clientName = t10.getText () ;
                            String issuerBank = t11.getText() ;
                            String bankAccount = t12. getText ();
                            int balanceAmount = Integer .parseInt (t13.getText ()) ;
                            int cvcNumber = Integer .parseInt (t14.getText ());
                            double interestRate=Double.parseDouble (t15.getText ()) ;
                            String day = (String) jcb1.getSelectedItem();
                            String month = (String) jcb2.getSelectedItem() ;
                            String year = (String) jcb3.getSelectedItem() ;
                            String expirationDate = day + "/" + month + "/" + year;
                            boolean cardExist = false;
                            //using downcasting concept
                            for (BankCard card : arrayBankCard)
                            {
                                int cardExistID= card.getCardId();
                                if (card instanceof CreditCard)
                                {
                                    cardExist=true;

                                    JOptionPane.showMessageDialog(jf2, "The card you have entered is already in the system. Please provide a different one. ", "ERROR", JOptionPane. ERROR_MESSAGE);
                                    break;
                                }
                            }
                            if (!cardExist){
                                CreditCard objCreditCard = new CreditCard(balanceAmount, cardID, issuerBank, bankAccount, cvcNumber, clientName,  interestRate,  expirationDate);
                                arrayBankCard.add(objCreditCard);
                                JOptionPane.showMessageDialog(jf2, "Information has been stored.", "Successful", JOptionPane. INFORMATION_MESSAGE);
                            }
                        }
                        //using try and catch for exception handling
                        catch(NumberFormatException fe)
                        {
                            JOptionPane.showMessageDialog(jf2, "Please Input appropratie value.","Error", JOptionPane. INFORMATION_MESSAGE);
                            t9.setText("");
                            t10.setText("");
                            t11.setText("");
                            t12.setText("");
                            t13.setText("");
                            t14.setText("");
                            t15.setText("");
                        }
                    }
                }

            });
        jb9= new JButton("Cancel Credit Card");
        jb9.setBounds(413,370,300,32);
        jb9.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    cancelCredit();
                    jf2.dispose();
                }
            });

        jb10= new JButton("Home");
        jb10.setBounds(61,421,120,32);
        jb10.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    new BankGUI();
                    jf2.dispose();
                }
            });

        jb11= new JButton("Set Credit Limit");
        jb11.setBounds(224,421,150,32);
        jb11.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    CreditLimit();
                    jf2.dispose();
                }
            });

        jb12= new JButton("Clear");
        jb12.setBounds(567,421,120,32);
        jb12.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    t9.setText("");
                    t10.setText("");
                    t11.setText("");
                    t12.setText("");
                    t13.setText("");
                    t14.setText("");
                    t15.setText("");
                }
            });

        jb22= new JButton("Display");
        jb22.setBounds(403,421,120,32);
        jb22.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    for(BankCard card : arrayBankCard)
                    {
                        if (card instanceof CreditCard)
                        {
                            CreditCard creditobj = (CreditCard) card;
                            creditobj.display();
                        }
                    }
                }
            }
        );

        panel10.add(j15);
        panel10.add(j9);
        panel10.add(t9);
        panel10.add(j10);
        panel10.add(t10);
        panel10.add(j11);
        panel10.add(t11);
        panel10.add(j12);
        panel10.add(t12);
        panel10.add(j13);
        panel10.add(t13);
        panel10.add(j14);
        panel10.add(t14);
        panel10.add(j16);
        panel10.add(t15);
        panel10.add(j18);
        panel10.add(jb8);
        panel10.add(jb9);
        panel10.add(jb10);
        panel10.add(jb11);
        panel10.add(jb12);
        panel10.add(jb22);
        panel10.add(jcb1);
        panel10.add(jcb2);
        panel10.add(jcb3);

        jf2.add(mainpanel2);
        mainpanel2.add(panel8);
        panel8.add(panel9);
        panel9.add(panel10);

        jf2.setResizable(false);
        jf2.setVisible(true);
        jf2.setSize(803,557);

    }
    //making new method to open GUI
    public void WithDraw()
    {
        jf3=new JFrame();
        JPanel mainpanel3 = new JPanel(); //Jpanel's object 
        mainpanel3.setBounds(0,0,803,557);
        Color color = new Color(0,55,72);
        mainpanel3.setBackground(color);
        mainpanel3.setLayout(null);

        JPanel panel11 = new JPanel();
        panel11.setBounds(8,8,787,511);
        Color color1 = new Color(0,110,140);
        panel11.setBackground(color1);
        panel11.setLayout(null);

        JPanel panel12 = new JPanel();
        panel12.setBounds(10,10,767,490);
        Color color2 = new Color(0,141,177);
        panel12.setBackground(color2);
        panel12.setLayout(null);

        JPanel panel13 = new JPanel();
        panel13.setBounds(13,15,743,460);
        panel13.setBackground(Color.white);
        panel13.setLayout(null);

        j19 = new JLabel(" WITHDRAWAL ");
        j19.setBounds(250,47,345,36);
        j19.setFont(new Font("Serif", Font.BOLD,30));

        j20=new JLabel("Card ID : ");
        j20.setBounds(79,125,68,22);
        Color color9 = new Color(0,110,140);
        j20.setForeground(color9);
        j20.setFont(new Font("Serif", Font.BOLD,15));

        t20=new JTextField();
        t20.setBounds(162,120,180,32);

        j21=new JLabel("Pin Number : ");
        j21.setBounds(413,122,101,22);
        j21.setForeground(color9);
        j21.setFont(new Font("Serif", Font.BOLD,15));

        t21=new JTextField();
        t21.setBounds(526,122,180,32);

        j22=new JLabel("Amount : ");
        j22.setBounds(280,188,79,22);
        j22.setForeground(color9);
        j22.setFont(new Font("Serif", Font.BOLD,15));

        t22=new JTextField();
        t22.setBounds(374,183,180,32);

        j23=new JLabel("Withdrawal Date: ");
        j23.setBounds(181,297,142,22);
        j23.setForeground(color9);
        j23.setFont(new Font("Serif", Font.BOLD,15));

        String day[]={"1","2","3","4","5","6","7","8","9","10","11","12","13",
                "14","15","16","17","18","19","20","21","22","23","24","25","26",
                "27","28","29","30"};
        jcb4= new JComboBox(day);
        jcb4.setBounds(333,292,65,32);

        String month[]={"January", "February", "March", "April", "May", 
                "June", "July" , "August", "September", "October",
                "November", "December"};
        jcb5= new JComboBox(month);
        jcb5.setBounds(408,292,81,32);

        String year[]={"2023","2024","2025","2026","2027","2028"};
        jcb6=new JComboBox(year);
        jcb6.setBounds(499,291,81,32);

        jb13= new JButton("Go Back");
        jb13.setBounds(41,380,198,32);
        jb13.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    DebitCard();
                    jf3.dispose();
                }
            });

        jb14= new JButton("Withdraw Amount");
        jb14.setBounds(289,380,198,32);
        jb14.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                if(t20.getText().isEmpty() || t21.getText().isEmpty() || t22.getText().isEmpty()){
                        JOptionPane.showMessageDialog(jf3, "You can't keep filed empty.", "Error", JOptionPane. ERROR_MESSAGE);
                    }
                if (Integer.parseInt(t20.getText()) <=0 || Integer.parseInt(t21.getText()) <=0 || Integer.parseInt(t22.getText()) <=0)
                {
                    JOptionPane.showMessageDialog(jf3, "Please enter positive number.","Error", JOptionPane. ERROR_MESSAGE);
                }
                    try{
                    int card_Id= Integer.parseInt(t20.getText());
                    int pinNumber = Integer.parseInt(t21.getText());
                    int withdrawalAmount = Integer.parseInt(t22.getText());
                    String year= (String) jcb4.getSelectedItem();
                    String month =(String) jcb5.getSelectedItem();
                    String day = (String) jcb6.getSelectedItem();
                    String dateOfWithdrawal = year +"/"+month+"/"+day;
                    boolean check=false;
                    for (BankCard card : arrayBankCard){
                        if (card instanceof DebitCard){ 
                            if(card.getCardId()==card_Id)
                            {
                                DebitCard debit =(DebitCard) card;
                                 check=false;
                                if(pinNumber==debit.getPinNumber()){
                                     debit.withdraw(withdrawalAmount,dateOfWithdrawal,pinNumber);
                                    JOptionPane.showMessageDialog(jf3, "Amount has been withdrawn.","Success", JOptionPane. INFORMATION_MESSAGE);
                                     break;
                                }
                                else{
                                    JOptionPane.showMessageDialog(jf3, "Wrong pin. ","Error", JOptionPane. ERROR_MESSAGE);
                                }
                            }
                        }
                    }
                    if (!check){
                        JOptionPane.showMessageDialog(jf3, "CardID doesn't match .","Error", JOptionPane. ERROR_MESSAGE);
                    } 
                }
                catch(NumberFormatException fe){
                     JOptionPane.showMessageDialog(jf3, "Input appropriate value.","Error", JOptionPane. ERROR_MESSAGE);
                    
                }
            }
            });

        jb15= new JButton("Clear");
        jb15.setBounds(537,380,198,32);
        jb15.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    t20.setText("");
                    t21.setText("");
                    t22.setText("");
                }
            });

        jf3.add(mainpanel3);
        mainpanel3.add(panel11);
        panel11.add(panel12);
        panel12.add(panel13);

        panel13.add(j19);
        panel13.add(j20);
        panel13.add(t20);
        panel13.add(j21);
        panel13.add(t21);
        panel13.add(j22);
        panel13.add(t22);
        panel13.add(j23);
        panel13.add(jcb4);
        panel13.add(jcb5);
        panel13.add(jcb6);
        panel13.add(jb13);
        panel13.add(jb14);
        panel13.add(jb15);

        jf3.setResizable(false);
        jf3.setVisible(true);
        jf3.setSize(803,557);

    }

    public void CreditLimit(){
        jf4=new JFrame();
        JPanel mainpanel4 = new JPanel(); //Jpanel's object 
        mainpanel4.setBounds(0,0,803,557);
        Color color = new Color(0,55,72);
        mainpanel4.setBackground(color);
        mainpanel4.setLayout(null);

        JPanel panel14 = new JPanel();
        panel14.setBounds(8,8,787,511);
        Color color1 = new Color(0,110,140);
        panel14.setBackground(color1);
        panel14.setLayout(null);

        JPanel panel15 = new JPanel();
        panel15.setBounds(10,10,767,490);
        Color color2 = new Color(0,141,177);
        panel15.setBackground(color2);
        panel15.setLayout(null);

        JPanel panel16 = new JPanel();
        panel16.setBounds(13,15,743,460);
        panel16.setBackground(Color.white);
        panel16.setLayout(null);

        j24 = new JLabel("SET CREDIT LIMIT");
        j24.setBounds(285,33,233,36);
        j24.setFont(new Font("Serif", Font.BOLD,20));

        j25=new JLabel("Card ID : ");
        j25.setBounds(91,132,78,29);
        Color color9 = new Color(0,110,140);
        j25.setForeground(color9);
        j25.setFont(new Font("Serif", Font.BOLD,15));

        t25=new JTextField();
        t25.setBounds(178,132,180,32);

        j26=new JLabel("Credit Limit : ");
        j26.setBounds(426,138,101,19);
        j26.setForeground(color9);
        j26.setFont(new Font("Serif", Font.BOLD,15));

        t26=new JTextField();
        t26.setBounds(539,133,180,32);

        j27=new JLabel("Grace Period : ");
        j27.setBounds(54,210,109,22);
        j27.setForeground(color9);
        j27.setFont(new Font("Serif", Font.BOLD,15));

        t27=new JTextField();
        t27.setBounds(178,207,180,32);

        j28=new JLabel("Interest Rate : ");
        j28.setBounds(413,214,114,19);
        j28.setForeground(color9);
        j28.setFont(new Font("Serif", Font.BOLD,15));

        t28=new JTextField();
        t28.setBounds(539,213,180,32);

        jb16= new JButton("Set Credit Limit");
        jb16.setBounds(323,289,170,32);
        jb16.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e){
                    boolean valid=true;
                    if (t25.getText().isEmpty() || t26.getText().isEmpty() || t27.getText().isEmpty()){
                        JOptionPane.showMessageDialog(jf4,"Required filed must  be filled","Empty Filed", JOptionPane.ERROR_MESSAGE);
                    }
                    else if( Integer.parseInt(t25.getText())<=0 || Integer.parseInt(t26.getText()) <=0 || Integer.parseInt(t27.getText()) <=0)
                    {
                        JOptionPane.showMessageDialog(jf4,"Please enter positive value.","Error",JOptionPane.ERROR_MESSAGE);
                    }
                    if(valid)
                    {
                        try{
                            int card_ID = Integer.parseInt(t25.getText());
                            int creditLimit=Integer.parseInt(t26.getText());
                            int gracePeriod = Integer.parseInt(t27.getText());
                            boolean cards=false;
                            for (BankCard card : arrayBankCard){
                                if (card instanceof CreditCard){ 
                                    int card_Id= card.getCardId();
                                    if(card_ID == card_ID){
                                        cards=true;
                                        CreditCard credit = (CreditCard) card;
                                        credit.setCreditLimit(creditLimit,gracePeriod);
                                        JOptionPane.showMessageDialog(jf4,"Credit Limit has been set.","Set Credit Card",JOptionPane.INFORMATION_MESSAGE);
                                        break;
                                    }
                                }
                            }
                            if(!cards){
                                JOptionPane.showMessageDialog(jf4,"Credit Limit has not been set.","Error",JOptionPane.ERROR_MESSAGE);
                            }
                        }
                        catch(NumberFormatException fe){
                            t25.setText("");
                            t26.setText("");
                            t27.setText("");
                            JOptionPane.showMessageDialog(jf4,"Invalid input","Please enter numeric value.",JOptionPane.ERROR_MESSAGE);
                        }
                        catch(NullPointerException fe){
                            t25.setText("");
                            t26.setText("");
                            t27.setText("");
                            JOptionPane.showMessageDialog(jf4,"Invalid input","Null",JOptionPane.ERROR_MESSAGE);
                        }
                    }
                }
                });  

        jb17= new JButton("Go Back");
        jb17.setBounds(187,384,173,32);

        jb17.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    CreditCard();
                    jf4.dispose();
                }
            });

        jb18= new JButton("Clear");
        jb18.setBounds(426,384,173,32);
        jb18.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    t25.setText("");
                    t26.setText("");
                    t27.setText("");
                    t28.setText("");
                }
            });

        jf4.add(mainpanel4);
        mainpanel4.add(panel14);
        panel14.add(panel15);
        panel15.add(panel16);
        panel16.add(j24);
        panel16.add(j25);
        panel16.add(t25);
        panel16.add(j26);
        panel16.add(t26);
        panel16.add(j27);
        panel16.add(t27);
        panel16.add(j28);
        panel16.add(t28);
        panel16.add(jb16);
        panel16.add(jb17);
        panel16.add(jb18);

        jf4.setResizable(false);
        jf4.setVisible(true);
        jf4.setSize(803,557);
    }

    public void cancelCredit()
    {
        jf5=new JFrame();
        JPanel mainpanel5 = new JPanel(); //Jpanel's object 
        mainpanel5.setBounds(0,0,803,557);
        Color color = new Color(0,55,72);
        mainpanel5.setBackground(color);
        mainpanel5.setLayout(null);

        JPanel panel17 = new JPanel();
        panel17.setBounds(8,8,787,511);
        Color color1 = new Color(0,110,140);
        panel17.setBackground(color1);
        panel17.setLayout(null);

        JPanel panel18 = new JPanel();
        panel18.setBounds(10,10,767,490);
        Color color2 = new Color(0,141,177);
        panel18.setBackground(color2);
        panel18.setLayout(null);

        JPanel panel19 = new JPanel();
        panel19.setBounds(13,15,743,460);
        panel19.setBackground(Color.white);
        panel19.setLayout(null);

        j29 = new JLabel("CANCEL CREDIT CARD");
        j29.setBounds(285,33,233,36);
        j29.setFont(new Font("Serif", Font.BOLD,20));

        j30=new JLabel("Card ID : ");
        j30.setBounds(233,184,78,29);
        Color color9 = new Color(0,110,140);
        j30.setForeground(color9);
        j30.setFont(new Font("Serif", Font.BOLD,15));

        t30=new JTextField();
        t30.setBounds(327,181,205,32);

        jb19= new JButton("Cancel Credit");
        jb19.setBounds(327,269,173,32);
        jb19.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                if(t30.getText().isEmpty())
                {
                    JOptionPane.showMessageDialog(jf5,"Text field is empty.","Error",JOptionPane.ERROR_MESSAGE);
                }
                else if(Integer.parseInt(t30.getText()) <= 0)
                {
                    JOptionPane.showMessageDialog(jf5,"Enter positive number.","Error",JOptionPane.ERROR_MESSAGE);
                }
                    try{
                    int card_ID=Integer.parseInt(t30.getText());
                    for (BankCard cancel : arrayBankCard)
                    {
                        if (cancel instanceof CreditCard)
                        { 
                            int card_Id = cancel.getCardId();
                            if (card_ID == card_Id)
                            {
                                CreditCard credit = (CreditCard) cancel;
                                credit.cancelCreditCard();
                            }
                        }
                    }
                }
                catch(NumberFormatException fe){
                    t30.setText("");
                    JOptionPane.showMessageDialog(jf5,"Invalid input","Please enter numeric value",JOptionPane.ERROR_MESSAGE);
                }
                catch(NullPointerException fe){
                    t30.setText("");
                    JOptionPane.showMessageDialog(jf5,"Invalid input","Please enter numeric value",JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        );

        jb20= new JButton("Go Back");
        jb20.setBounds(82,372,173,32);

        jb20.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    CreditCard();
                    jf5.dispose();
                }
            });

        jb21= new JButton("Clear");
        jb21.setBounds(530,367,173,32);
        jb21.addActionListener(new ActionListener()
            {
                public void actionPerformed(ActionEvent e)
                {
                    t30.setText("");
                }
            });

        jf5.add(mainpanel5);
        mainpanel5.add(panel17);
        panel17.add(panel18);
        panel18.add(panel19);
        panel19.add(j29);
        panel19.add(j30);
        panel19.add(t30);
        panel19.add(jb19);
        panel19.add(jb20);
        panel19.add(jb21);

        jf5.setResizable(false);
        jf5.setVisible(true);
        jf5.setSize(803,557);
    }
}