

import picture.tool.*;
import picture.tool.computer;
import picture.tool.Main1;
import javax.sound.sampled.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.Border;
import java.net.*;
import java.util.*;
import java.io.*;
import java.io.File;
import java.io.IOException;
 class frame1 extends JFrame  

{
ImageIcon play1,play2;
  JPanel p1=new JPanel(); //first page panel and label
JLabel l=new JLabel();

JButton c1=new JButton("Enjoy_playing_with_your_BestFriend_or_Family");
JButton c2=new JButton("3P"); //Button for select  the color and number of player
JButton c3=new JButton("4P");
JLabel b1=new JLabel("START_GAME");

JPanel gp1=new JPanel();
  JPanel gp2=new JPanel();// computer  wale frame ka panel

JLabel l1=new JLabel();
JLabel l2=new JLabel();   //label for the start and exit button of first page

//--------------------------------frame1--------------------------------
 public frame1(String title) 
{
  super(title);
backgroundsound();
ImageIcon img1=new ImageIcon("picture/snake2.jpg"); // logo of the game 
Image logo=img1.getImage();
setIconImage(logo);
UIManager.put("JFrame.activeTitleBackground",Color.red);
l.setIcon(new ImageIcon("picture/firstpage1.jpeg"));  

p1.add(l);
add(p1);
 l1.setBounds(437,375,300,80);
l1.setIcon(new ImageIcon("picture/l1.png"));//  start buttton of the firstpage----------
l1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
l.add(l1);
add(l);
validate();
l2.setBounds(439,479,300,80);

l2.setIcon(new ImageIcon("picture/l3.png"));
l.add(l2);
l2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
add(l);

l1.addMouseListener(new MouseAdapter()
  {
 
  public void mouseClicked(MouseEvent e)
{ { 
music();
 frame2();}}
  
});
l2.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e)
  {

music();
    System.exit(0);
  
  }  
});//new MouseAdaptor()
setSize(1113,831);
setDefaultLookAndFeelDecorated(true);
getRootPane().putClientProperty("JRootPane.titleBarBackground",Color.red);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
setResizable(false);
setBackground(new Color(128,128,0));
setLocationRelativeTo(null);}//this method display the text at the center



//------------------------------frame2--------------------------------------


public void frame2()
{
  JFrame f2=new JFrame("Snake & Ladder");

JPanel f2p=new JPanel();
JLabel f2l=new JLabel();
f2l.setIcon(new ImageIcon("picture/frame2_b.jpeg"));   //frame2's background

f2p.add(f2l);
f2.add(f2p);
ImageIcon img2=new ImageIcon("picture/snake2.jpg"); // logo of the game 
Image logo1=img2.getImage();
f2.setIconImage(logo1);
JLabel f22=new JLabel();
JLabel f23=new JLabel();
//ButtonGroup bg=new ButtonGroup()
f22.setBounds(255,300,290,180);
f22.setIcon(new ImageIcon("picture/computer.jpg"));
f22.addMouseListener(new MouseAdapter()
  //frame2()
{
  public void mouseClicked(MouseEvent e)
{music();
if(e.getSource()==f22)
{   frame3( );}}
  
});
f22.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

f2l.add(f22);
f2.add(f2l);
f23.setBounds(650,300,280,180);
f23.setIcon(new ImageIcon("picture/friend.jpg"));
f23.addMouseListener(new MouseAdapter() {
  public void mouseClicked(MouseEvent e)
{

  friends();
}});

f23.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
f2l.add(f23);
f2.add(f2l);

f2.setVisible(true);
f2.setSize(1113,831);
f2.setBackground(Color.GREEN);
f2.setLocationRelativeTo(null);
f2.setDefaultCloseOperation(EXIT_ON_CLOSE);

f2.setResizable(false);
}
//------------------------music class------------------------------------

public void music()
{
try{                            
String filepath="E:\\button3.wav";
AudioInputStream aui=AudioSystem.getAudioInputStream(new File(filepath).getAbsoluteFile());
try{
Clip clip=AudioSystem.getClip();
clip.open(aui);
clip.start();
//clip.loop(5);
}
catch(Exception em)
{}}catch(IOException|UnsupportedAudioFileException ex){}

}
//----------------------background music-------------------------
public void backgroundsound()
{
try{                            
String filepath="E:\\snakegame\\codefile\\picture\\backsound.wav";
AudioInputStream aui=AudioSystem.getAudioInputStream(new File(filepath).getAbsoluteFile());
try{
Clip clip=AudioSystem.getClip();
clip.open(aui);
clip.start();
clip.loop(-1);
}
catch(Exception em)
{}}catch(IOException|UnsupportedAudioFileException ex){}

}

//--------------------frame3 consist playing with computer--------------------------------

void frame3(){
computer c1=new computer();


}

//-------------------------------- frame4 consistplaying with friend---------------
public void friends()
{music();
  JFrame f4=new JFrame("Choose and Enter Name");
  JPanel playerpanel=new JPanel();
JLabel player2p=new JLabel();
JLabel lc=new JLabel();
player2p.setBounds(70,150,300,400);
JLabel player3p=new JLabel();
JPanel player4p=new JPanel();


 f4. setVisible(true);

 lc.setIcon(new ImageIcon("picture/one.jpg"));//number of player selection page background picture
playerpanel.add(lc);
 f4.add(playerpanel);
  f4.setSize(400,600);
  f4.setBackground(Color.GREEN);
  f4.setLocationRelativeTo(null);
  //f4.setDefaultCloseOperation(EXIT_ON_CLOSE);
f4.setResizable(false);
  JButton c1=new JButton("Enjoy_playing_with_your_BestFriend_or_Family");
  
  c1.addActionListener(new ActionListener() {
    //@Override
    public void actionPerformed(ActionEvent e){
music();

 JLabel i1= new JLabel(); 
 JLabel i2= new JLabel(); 
//play1= new ImageIcon("images/p1.gif");        
i1.setBounds(100,155,200,200);
i1.setIcon(new ImageIcon("images/p1.gif"));

lc.add(i1);
f4.add(lc);
//---------------------textfield----------------------------------
      JTextField user_name1a=new JTextField("player1",23);
      user_name1a.setBounds(168,165,130,40); 
      lc.add(user_name1a);
     f4.add(lc);
         
      
i2.setBounds(120,200,54,60);
i2.setIcon(new ImageIcon("images/p1.gif"));

      lc.add(i2);
      f4.add(lc);    
      JTextField user_name2a=new JTextField("player2",23);
      user_name2a.setBounds(168,220,130,40); 
      lc.add(user_name2a);
     
      f4.add(lc);
    }});
    lc.add(c1);
  f4.add(lc);
    b1.setBounds(120,435,195,150);
    b1.setIcon(new ImageIcon("picture/frame2_start1.png"));//start button of select player page
b1.addMouseListener(new MouseAdapter()
  
{
  public void mouseClicked(MouseEvent e)
{music();
if(e.getSource()==b1)
{   frame5();}}
  
});
b1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

//.add(f22);


    lc.add(b1);
    f4.add(lc);
c1.setBounds(20,400,350,60);
    //c1.setBounds(60,350,70,60);
c1.setBackground(Color.PINK);
JButton c2=new JButton("3P");

//-------------------remainging-----------------------
/*c2.addActionListener(new ActionListener() {
  //@Override
  public void actionPerformed(ActionEvent e){
music();
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
  {music();
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
    }*/
    //f4.add(lc);
  //}});
//c3.setBounds(270,400,75,60);
//c3.setBackground(Color.PINK);
//f4.add(lc);
lc.add(c1);
  f4.add(lc);
  //lc.add(c2);
 // f4.add(lc);
  //lc.add(c3);
  //f4.add(lc);

}

public void frame5(){

Main1 m1=new Main1();

}
 






public static void main(String[] args)
{
frame1 f1= new frame1("snake and ladder");
}}




