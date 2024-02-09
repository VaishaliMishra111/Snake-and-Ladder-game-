import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
//import javax.swing.*;
import javax.swing.border.Border;
import java.net.*;
import java.util.*;
import javax.swing.*;


class Tabbeed extends JFrame
{JLabel b1=new JLabel("START_GAME");
public Tabbeed()
{
setLocationRelativeTo(null);
setSize(1113,831);
    setLayout(null);
   setVisible(true);
setLocationRelativeTo(null);
setDefaultCloseOperation(EXIT_ON_CLOSE);
    // f4.setDefaultCloseOperation(EXIT_ON_CLOSE);
friends();
}

public void friends()
{
  JFrame f4=new JFrame("select color");
JLabel lc=new JLabel();
  JPanel playerpanel=new JPanel();
JPanel player2p=new JPanel();
player2p.setBounds(80,300,300,400);
JLabel player3p=new JLabel();
JPanel player4p=new JPanel();
JTabbedPane tp=new JTabbedPane();
tp.setBounds(340,300,300,300);
tp.setOpaque(true);

 f4. setVisible(true);

 lc.setIcon(new ImageIcon("one.jpg"));//number of player selection page background picture
playerpanel.add(lc);
 f4.add(playerpanel);
  



 JTextField user_name1a=new JTextField("player1",23);
      user_name1a.setBounds(168,165,130,80); 
      
      //f4.add(lc);
      JTextField user_name2a=new JTextField("player2",23);
      user_name2a.setBounds(168,260,130,80); 
      player2p.add(user_name1a);
tp.add(player2p);
      //lc.add(player2p);
      //f4.add(lc);
       //f4.add(playerpanel);
      player2p.add(user_name2a);
      lc.add(player2p);
      f4.add(lc);

  JButton c1=new JButton("2p");
  
  c1.addActionListener(new ActionListener() {
    //@Override
    public void actionPerformed(ActionEvent e){
if(e.getSource()==c1){
tp.setSelectedIndex(0);}
else
{

dispose();}
     
    }});
    lc.add(c1);
  f4.add(lc);
    b1.setBounds(120,435,195,150);
    b1.setIcon(new ImageIcon("frame2_start1.png"));
    lc.add(b1);
    f4.add(lc);

    c1.setBounds(60,400,70,60);
c1.setBackground(Color.PINK);
JButton c2=new JButton("3P");
c2.addActionListener(new ActionListener() {
  //@Override
  public void actionPerformed(ActionEvent e){
//c1.dispose();
if(e.getSource()==c2){
    JTextField user_name1b=new JTextField("player1",23);
    user_name1b.setBounds(168,165,130,40); 
    lc.add(user_name1b);
    f4.add(lc);
    JTextField user_name2b=new JTextField("player2",23);
    user_name2b.setBounds(168,220,130,40); 
    lc.add(user_name2b);
    JTextField user_name3b=new JTextField("player3",23);
    user_name3b.setBounds(168,270,130,40); 
    lc.add(user_name3b);}
    else{dispose();}
    //f4.add(lc);
  }});
c2.setBounds(170,400,75,60);
c2.setBackground(Color.PINK);
//JButton c3=new JButton(new ActionListener() {
  JButton c3=new JButton("p4");
  c3.addActionListener(new ActionListener() {
     //@Override
  public void actionPerformed(ActionEvent e)
  {
    if(e.getSource()==c3){
      JTextField user_name1c=new JTextField("player1",23);
    user_name1c.setBounds(168,165,130,40); 
    lc.add(user_name1c);
    f4.add(lc);
    JTextField user_name2c=new JTextField("player2",23);
    user_name2c.setBounds(168,220,130,40); 
    lc.add(user_name2c);
    JTextField user_name3c=new JTextField("player3",23);
    user_name3c.setBounds(168,270,130,40); 
    lc.add(user_name3c);
    JTextField user_name4c=new JTextField("player4",23);
    user_name4c.setBounds(168,320,130,40); 
    lc.add(user_name4c);}
    else
    {dispose();
      //System.exit(0);
    }
    //f4.add(lc);
  }});
c3.setBounds(270,400,75,60);
c3.setBackground(Color.PINK);
f4.add(lc);
lc.add(c1);
  f4.add(lc);
  lc.add(c2);
  f4.add(lc);
  lc.add(c3);
  f4.add(lc);

f4.setSize(400,600);
  f4.setBackground(Color.GREEN);
  f4.setLocationRelativeTo(null);
  f4.setDefaultCloseOperation(EXIT_ON_CLOSE);


}



public static void main(String[] args){
    Tabbeed t= new Tabbeed();
}

}
