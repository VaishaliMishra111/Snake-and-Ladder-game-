import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
//import javax.swing.*;
import javax.swing.border.Border;
import java.net.*;
import java.util.*;
import javax.swing.*;
import java.io.*;

class Main implements ActionListener
{JFrame f;
JTabbedPane tabPane;
JPanel mainPanel,introPanel,gamePanel,playerPassPanel,diePanel;
JPanel gameCenter,gameEast,gameWest,gameNorth,gameSouth;

Icon p1,p2,header,up,down;
Icon icon[][]=new Icon[10][10];                                            //this declaration of the game image;
Icon winnerIcon[][]=new Icon[10][10];                                     //this is the declare of thewinner image
Icon dieIcon;
JButton introB[]=new JButton[5];
JButton b[][]=new JButton[10][10];
JButton start,restart;
JButton JBplayer,JBcomputer;

JLabel die;                                                                //label for the die   

Random randomNo;                                //for the random number 

int imageFlag;
 int i,j,num;
int prevlp1,prevJp1;
int path;
int p1value,p2value;
int player,computer ;                                                  //for the die


int gameover;
int cimageFlag=0;
int cnoFlag=0;
String str;
int n[][]={{0,1,2,3,4,5,6,7,8,9},
{10,11,12,13,14,15,16,17,18,19},
{20,21,22,23,24,25,26,27,28,29},
{30,31,32,33,34,35,36,37,38,39},
{40,41,42,43,44,45,46,47,48,49},
{50,51,52,53,54,55,56,57,58,59},
{60,61,62,63,64,65,66,67,68,69},
{70,71,72,73,74,75,76,77,78,79},
{80,81,82,83,84,85,86,87,88,89},
{90,91,92,93,94,95,96,97,98,99}};

int game[][]={
{100,99,98,97,96,95,94,93,92,91},
{81,82,83,84,85,86,87,88,89,90},
{80,79,78,77,76,75,74,73,72,71},
{61,62,63,64,65,66,67,68,69,70},
{60,59,58,57,56,55,54,53,52,51},
{41,42,43,44,45,46,47,48,49,50},
{40,39,38,37,36,35,34,33,32,31},
{21,22,23,24,25,26,27,28,29,30},
{20,19,18,17,16,15,14,13,12,11},
{1,2,3,4,5,6,7,8,9,10}};

int winner[][]={
{1,2,3,4,5,6,7,8,9,10},
{11,12,13,14,15,16,17,18,19,20},
{21,22,23,24,25,26,27,28,29,30},
{31,32,33,34,35,36,37,38,39,40},
{41,42,43,44,45,46,47,48,49,50}, 
{51,52,53,54,55,56,57,58,59,60},
{61,62,63,64,65,66,67,68,69,70},
{71,72,73,74,75,76,77,78,79,80},
{81,82,83,84,85,86,87,88,89,90},
{91,92,93,94,95,96,97,98,99,100}};


public Main()
{
f=new JFrame("Snake and Ladder");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//f.setLocationRelativeTo(null);
f.setVisible(true);
mainPanel=new JPanel();
tabPane=new JTabbedPane(JTabbedPane.LEFT);

f.setLayout(new BorderLayout());
for(int i=0;i<introB.length;i++)
{
introB[i]=new JButton(Integer.toString(i));
}
randomNo=new Random();
JBplayer =new JButton("player1");
JBcomputer =new JButton("player2");

JBplayer.setEnabled(false);
JBcomputer.setEnabled(false);

JBplayer.addActionListener(this);
JBcomputer.addActionListener(this);

die=new JLabel();

f.add(tabPane,BorderLayout.CENTER);
f.setResizable(false);
f.setSize(1113,831);
}


public void actionPerformed(ActionEvent e)
{}
/*public void actionPerformed(ActionEvent e)
{}*/
public static void main(String[] args){
   Main m= new Main();
}

}
