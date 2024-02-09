//package snakegame.codefile.tool;

package picture.tool;
import javax.swing.*;
import javax.swing.Timer;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.net.*;
import java.io.*;

public class computer implements ActionListener
{
 JFrame f;
 JTabbedPane tabPane;
 JPanel mainPanel,introPanel,gamePanel,playerPassPanel,diePanel; 
 JPanel gameCenter,gameEast,gameWest,gameNorth,gameSouth;
 

 Icon p1,p2,header;
 Icon up,down;

 Icon icon[][]= new Icon[10][10];
 Icon winericon[][]= new Icon[10][10];

 Icon dieIcon;


 JButton introB[]= new JButton[5];
 JButton b[][]=new JButton[10][10];

 JButton start,restart;
 JButton JBplayer,JBcomputer;  

JLabel die;


 
 Random randomNo;


 int imageFlag;
 int i,j,num;
 int prevIp1,prevJp1;

 int path;
 int p1value,p2value;

 int player,computer;

 int gameover;
 int cimageFlag=0;
 int cnoFlag=0;


 String str;




  int n[][]={	{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9},
		{10,11,12,13,14,15,16,17,18,19},
		{20,21,22,23,24,25,26,27,28,29},
		{30,31,32,33,34,35,36,37,38,39},
		{40,41,42,43,44,45,46,47,48,49},
		{50,51,52,53,54,55,56,57,58,59},
		{60,61,62,63,64,65,66,67,68,69},
		{70,71,72,73,74,75,76,77,78,79},
		{80,81,82,83,84,85,86,87,88,89},
		{90,91,92,93,94,95,96,97,98,99},
		
	  };

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
		{ 1, 2, 3, 4, 5, 6, 7, 8, 9,10},
	      };
	

 int winer[][]={
		{ 1, 2, 3, 4, 5, 6, 7, 8, 9,10},
		{11,12,13,14,15,16,17,18,19,20},
		{21,22,23,24,25,26,27,28,29,30},
		{31,32,33,34,35,36,37,38,39,40},
		{41,42,43,44,45,46,47,48,49,50},
		{51,52,53,54,55,56,57,58,59,60},
		{61,62,63,64,65,66,67,68,69,70},
		{71,72,73,74,75,76,77,78,79,80},
		{81,82,83,84,85,86,87,88,89,90},
		{91,92,93,94,95,96,97,98,99,100},
	      };

public computer()
 {

 f= new JFrame("----------------------SNAKE and LADDER-----------------------");
 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 
 mainPanel= new JPanel();
 tabPane =new JTabbedPane(JTabbedPane.TOP);


 f.setLayout(new BorderLayout());
/*
 for(int i=0;i<introB.length;i++)
 	{
	 introB[i]= new JButton(Integer.toString(i));
	}*/

 randomNo= new Random();

 JBplayer= new JButton("player1");
 JBcomputer= new JButton("player2");

 JBplayer.setEnabled(true);
 JBcomputer.setEnabled(false);

 
 JBplayer.addActionListener(this);
JBplayer.doClick();
 JBcomputer.addActionListener(this); 
 
 die = new JLabel();

game();
//introduction();
  
  
   f.add(tabPane,BorderLayout.CENTER);
 f.setResizable(false);
//f.setSize(1113,831);
f.getContentPane().setBackground(Color.GREEN);
  f.setSize(725,770);
// f.pack();
  f.setVisible(true);

 f.setLocationRelativeTo(null); 

}





void game()
{
 JLabel gameheader= new JLabel();
 JLabel logo = new JLabel(); 
 JLabel l1= new JLabel(); 
 JLabel l2= new JLabel(); 
 
 restart= new JButton("Restart");
 restart.setEnabled(false);
 restart.addActionListener(this);
 
 start= new JButton("Start");
 start.addActionListener(this);
 
 gamePanel= new JPanel();
 

 gameCenter=new JPanel();
mainPanel.add(gameCenter,"Center");
//gameCenter.setPreferredSize(new Dimension(1113,831));
 gameWest= new JPanel();
 gameNorth=new JPanel();
 gameSouth= new JPanel();

  gameCenter.setLayout(new GridLayout(10,10));
//gameCenter.setBounds(200,300,650,590);
gameCenter.setPreferredSize(new Dimension(1113,831));
  gameEast= new JPanel(new GridLayout(2,1));

  gameWest.setLayout(new FlowLayout());
 gameNorth=new JPanel(new FlowLayout());
 gameSouth= new JPanel(new FlowLayout());

 gamePanel.setLayout(new BorderLayout());
 
 p1= new ImageIcon("picture/p1.gif");        
 p2= new ImageIcon("picture/p2.gif");       
 up= new ImageIcon("images/up.gif");
 down= new ImageIcon("images/down.gif");
 
 l1.setIcon(p1);
 l2.setIcon(p2);
 
 header=new ImageIcon("picture/header.jpg");        
 gameheader.setIcon(header);
  
  for(int i=0;i<10;i++)
	for(int j=0;j<10;j++)
	{
			b[i][j]= new JButton();
      // b[i][j].setPreferredSize(new Dimension(65,59));
        	//b[i][j].addActionListener(this);        
			path=game[i][j];
			str=Integer.toString(path);
			icon[i][j]=new ImageIcon("imageonline/"+str+".jpg");
	        b[i][j].setIcon(icon[i][j]);
                // b[i][j].setPreferredSize(new Dimension(65,59));
	}



for(int i=0;i<10;i++)
	for(int j=0;j<10;j++)
	{
			path=winer[i][j];
			str=Integer.toString(path);
			winericon[i][j]=new ImageIcon("picture/winer/"+str+".jpg");
           // b[i][j].setIcon(winericon[i][j]);
              
	}


   
 str=Integer.toString(1);
 dieIcon= new ImageIcon("picture/Game dies/"+str+".jpg");
 die.setIcon(dieIcon);
	 
  
 gameSouth.add(l1); 
 gameSouth.add(JBplayer);
 gameSouth.add(die);
 gameSouth.add(JBcomputer); 
 gameSouth.add(l2); 

 gameNorth.add(start);
 gameNorth.add(gameheader);
 gameNorth.add(restart);
  
  for(int i=0;i<10;i++)
	{
	for(int j=0;j<10;j++)
	{//gameCenter.setBounds(200,300,650,590);//---------------------------
//b[i][j].setPreferredSize(new Dimension(65,59));
//b[i][j].setMaximumSize(new Dimension(650,590));
		gameCenter.add(b[i][j]);



              //System.out.print("["+i+"]["+j+"],");
                
	}
		//System.out.println();
	}


  
 gamePanel.add(gameCenter,BorderLayout.CENTER);
gameCenter.setPreferredSize(new Dimension(1113,831));
 gamePanel.add(gameWest,BorderLayout.WEST);
 gamePanel.add(gameNorth,BorderLayout.NORTH);
 gamePanel.add(gameSouth,BorderLayout.SOUTH);

  tabPane.addTab("",gamePanel);
  
}



void chance()
{
 int n=randomNo.nextInt(3);   //-----------------generate the integer and return the number //between 0-2---------
 int i=0;

 //System.out.println("Chacne is :"+n) ;
 if(n==0)
	chance();
 
 if(n==1)
	{
	player=1;	
	computer=0;
	}
  else if(n==2)
	{
	 player=0;
 	 computer=1;
	}

 
    

  if(n==1)
	{
	JBcomputer.setEnabled(false);
	JBplayer.setEnabled(true);
    
	}
 else if(n==2)
	{
	JBcomputer.setEnabled(true);
	JBplayer.setEnabled(false);
    
 	}

 
  
}
/*public class ButtonExample implements Runnable {
    public static void main(String[] args) {
        SwingUtilities.invokeLater( new ButtonExample());
    }

    public void run() {
        computer();
    }

}


*/

public void actionPerformed(ActionEvent e)
{
 
 int n=0;
try{
 if(e.getSource()==JBplayer)
	{
 
  //System.out.println("JB Player");
		do{
		n =playerPassNumber();    //------------playerpass class will return value from 0-6 in n----
		}while(n==0);

		//System.out.println("UR playerPass value is :"+n);	        
		p1value=p1value+n;
         
		 if(p1value>=100)
		 {
			p1value=100;
		 }
		 
		playerimageTraval(p1value);		
		JBcomputer.setEnabled(true);
		//JBcomputer.setEnabled(true);
		JBplayer.setEnabled(false);
		setBothImage();
 	}
  else if(e.getSource()==JBcomputer)
	{//JBcomputer.doClick();
   //performAutoClick();
/*int delay = 2000; // Delay in milliseconds (2 seconds)
        Timer timer = new Timer(delay, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JBcomputer.doClick();
            }
        });
        timer.setRepeats(true); // Only trigger the click once
        timer.start();
    }
SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new computer();
            }
        });
*/
try{
Timer timer = new Timer(2000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JBcomputer.doClick();  // Programmatically click the button
            }
        });
        timer.setRepeats(false);  // Only perform the click once
        timer.start();}catch(Exception ew){}
	//System.out.println("JB Computer");
		
//public void someEventOccurred() {
        // Perform automatic button click here
    
              do{
		n =playerPassNumber();
		}while(n==0);
	
		//System.out.println("Computer Pass Value is "+n);	
		p2value=p2value+n;
		if(p2value>=100)
		{
		 p2value=100;
		}
		computerimageTraval(p2value);
		JBcomputer.setEnabled(false);
		JBplayer.setEnabled(true);
	
		setBothImage();	
	}
  else if(e.getSource()==restart)
	{
  	 p1value=0;
	 p2value=0;
	
	cnoFlag=0;
	cimageFlag=0;

	 chance();
	 rePrint();
	}
  else if(e.getSource()==start)
	{
		gameover=0;
		p1value=0;
		p2value=0;
		cnoFlag=0;
	cimageFlag=0;
		rePrint();
	  start.setEnabled(false);
	  restart.setEnabled(true);
	  chance();
	}
	else
	{
	imageChange(e);	
	}
}catch(Exception ee)
	{
		//System.out.println("Error in BUTTON:"+ee);
	}
}



int playerPassNumber()
{
 int i=	randomNo.nextInt(7);     //---------------generate the value from 0-6------

         str=Integer.toString(i);
	 dieIcon= new ImageIcon("picture/Game dies/"+str+".jpg");
	 die.setIcon(dieIcon);
	
     return i;
 
}





void winerdraw()
{
int i=0;
		 start.setEnabled(true);
		 restart.setEnabled(false);
		 JBplayer.setEnabled(false);
		// JBcomputer.setEnabled(true);
		 JBcomputer.setEnabled(false);
		 
for(int k=0;k<10;k++)
	for(int l=0;l<10;l++)
	{
		gameover=1;
         b[k][l].setIcon(winericon[k][l]);             
	}
	
		     
}


void rePrint()
{
try{

for( i=0;i<10;i++)
	{
	for(j=0;j<10;j++)
	  {
		    // b[i][j].setIcon(null);
b[i][j].setPreferredSize(new Dimension(65,59));
			 b[i][j].setIcon(icon[i][j]);  //------------- it will reprint the game board----
	  }
	}
	
   }catch(Exception e)
	{
	//System.out.println("error in repaint"+e);
	}

}




void playerimageTraval(int n)
{
int i=j=0;
int imageFlag=0;
int noFlag=0;

if(gameover==0)
{
try{
	rePrint();	
	  for(i=0;i<10;i++)
	       {
		 for(j=0;j<10;j++)
			{
			 if(n==game[i][j])
			    {
                noFlag=1;
				break;
			    }
			}
 		if(noFlag==1)
			break;
	       }

   if(noFlag==1)
		{
		if(imageFlag==0)
		{
		 Thread.sleep(200);
		 b[i][j].setIcon(p1);
		 imageFlag=1;
		 prevIp1=i;
		 prevJp1=j;
	        }
        else
		{
	 	path=game[prevIp1][prevJp1];
		str=Integer.toString(path);
 		Thread.sleep(200);
		icon[prevIp1][prevJp1]=new ImageIcon("imageonline/"+str+".jpg");
		Thread.sleep(200);
	        b[prevIp1][prevJp1].setIcon(icon[prevIp1][prevJp1]);
		b[i][j].setIcon(p1);
		prevIp1=i;
		prevJp1=j;
	        }

	/*****************checks for Ladder**********************/
		if(n==4)
			{
			n=25;
			playerimageTraval(n);
			p1value=n;
			}
		else if(n==13)
			{
			n=46;
			playerimageTraval(n);
			p1value=n;
			}
		else if(n==33)
			{
			n=49;
			playerimageTraval(n);
			p1value=n;
			}
		else if(n==42)
			{
			n=63;
			playerimageTraval(n);
			p1value=n;
			}
		else if(n==50)
			{
			n=69;
			playerimageTraval(n);
			p1value=n;
			}
                else if(n==74)
			{
			n=92;
			playerimageTraval(n);
			p1value=n;
			}

                else if(n==62)
			{
			n=81;
			playerimageTraval(n);
			p1value=n;
			}



		/*****************Checks for Snakes***************************/
		if(n==27)
			{
		         n=5;
			 playerimageTraval(n);
			 p1value=n;			
			}
		else if(n==40)
			{
		         n=3;
			 playerimageTraval(n);
			 p1value=n;			
			}
		else if(n==43)
			{
		         n=18;
			 playerimageTraval(n);
			 p1value=n;			
			}
		else if(n==54)
			{
		         n=31;
			 playerimageTraval(n);
			 p1value=n;			
			}
		else if(n==66)
			{
		         n=45;
			 playerimageTraval(n);
			 p1value=n;			
			}
                else if(n==76)
			{
		         n=58;
			 playerimageTraval(n);
			 p1value=n;			
			}

               else if(n==89)
			{
		         n=53;
			 playerimageTraval(n);
			 p1value=n;			
			}

               else if(n==99)
			{
		         n=41;
			 playerimageTraval(n);
			 p1value=n;			
			}


		}	
		
	if(n>=100)
	{   
		//System.out.println("Congr u r win");
		winerdraw();
		
	}
}
catch(Exception e)
{
 
}
}

}

void setBothImage()
{
int i=0;
int j=0;
int noFlag=0;

if(gameover==0)
{
for(i=0;i<10;i++)
	       {
		 for(j=0;j<10;j++)
			{
			 if(p1value==game[i][j])
			    {
                                noFlag=1;
				break;
			    }
			}
 		if(noFlag==1)
			break;
	       }

if(noFlag==1)
{
b[i][j].setIcon(p1);  
}

noFlag=0;

for(i=0;i<10;i++)
	       {
		 for(j=0;j<10;j++)
			{
			 if(p2value==game[i][j])
			    {
                                noFlag=1;
				break;
			    }
			}
 		if(noFlag==1)
			break;
	       }

if(noFlag==1)
{
b[i][j].setIcon(p2);
}
}
}


void computerimageTraval(int n)
{
int i=j=0;
int imageFlag=0;
int noFlag=0;

try{
	rePrint();	
	  for(i=0;i<10;i++)
      {
		 for(j=0;j<10;j++)
			{
			 if(n==game[i][j])
			    {
                noFlag=1;
				break;
			    }
			}
 		if(noFlag==1)
			break;
	       }

	   if(noFlag==1)
		{
		if(imageFlag==0)
		{
		 Thread.sleep(200);
		 b[i][j].setIcon(p2);
		 imageFlag=1;
		 prevIp1=i;
		 prevJp1=j;
	        }
        else
		{
	 	path=game[prevIp1][prevJp1];
		str=Integer.toString(path);
 		Thread.sleep(200);
		icon[prevIp1][prevJp1]=new ImageIcon("imageonline/"+str+".jpg");
		Thread.sleep(200);
	        b[prevIp1][prevJp1].setIcon(icon[prevIp1][prevJp1]);
		b[i][j].setIcon(p1);
		prevIp1=i;
		prevJp1=j;
	        }
           

              /*****************checks for ladder**********************/

		if(n==4)
			{
			n=25;
			computerimageTraval(n);
			p2value=n;
			}
		else if(n==13)
			{
			n=46;
			computerimageTraval(n);
			p2value=n;
			}
		else if(n==33)
			{
			n=49;
			computerimageTraval(n);
			p2value=n;
			}
		else if(n==42)
			{
			n=63;
			computerimageTraval(n);
			p2value=n;
			}
		else if(n==50)
			{
			n=69;
			computerimageTraval(n);
			p2value=n;
			}
                 else if(n==74)
			{
			n=92;
			computerimageTraval(n);
			p2value=n;
			}
               else if(n==62)
			{
			n=81;
			computerimageTraval(n);
			p2value=n;
			}


		/*****************Checks for Snakes***************************/
		if(n==27)
			{
		         n=5;
			 computerimageTraval(n);
			 p2value=n;			
			}
		else if(n==40)
			{
		         n=3;
			 computerimageTraval(n);
			 p2value=n;			
			}
		else if(n==43)
			{
		         n=18;
			 computerimageTraval(n);
			 p2value=n;			
			}
		else if(n==54)
			{
		         n=31;
			 computerimageTraval(n);
			 p2value=n;			
			}
		else if(n==66)
			{
		         n=45;
			 computerimageTraval(n);
			 p2value=n;			
			}
               else if(n==76)
			{
		         n=58;
			 computerimageTraval(n);
			 p2value=n;			
			}

               else if(n==89)
			{
		         n=53;
			 computerimageTraval(n);
			 p2value=n;			
			}
               else if(n==99)
			{
		         n=41;
			 computerimageTraval(n);
			 p2value=n;			
			}


		}	
		

	if(n>=100)
	{   
		//System.out.println("Congr u r win");
		gameover=1;	
		winerdraw();
	}
		


}
catch(Exception e)
{
 
}


}

void imageChange(ActionEvent e)
{
int i=j=0;
int flag=0;

try{
 for( i=0;i<10;i++)
    {
	for( j=0;j<10;j++)
	{
	 if(e.getSource()==b[i][j])
		{
			//System.out.println("Button Found");
			//System.out.println("b["+i+"]["+j+"]");
			flag=1;
			break;
		}
	//System.out.println(j);
	 }

	 if(flag==1)
		break;
     }


	if(imageFlag==0)
	{ 
		 Thread.sleep(500);
		 b[i][j].setIcon(p1);
		 imageFlag=1;
		prevIp1=i;
		prevJp1=j;
		}
    else
	{
		path=game[prevIp1][prevJp1];
		str=Integer.toString(path);
		Thread.sleep(500);
		icon[prevIp1][prevJp1]=new ImageIcon("imageonline/"+str+".jpg");
			 Thread.sleep(500);
	        b[prevIp1][prevJp1].setIcon(icon[prevIp1][prevJp1]);
		b[i][j].setIcon(p1);
		prevIp1=i;
		prevJp1=j; 
      }
    }
catch(Exception ee)
	{
		ee.printStackTrace();
	}
}}























/*

public static void main(String[] args)
{
computer c=new computer();
}}
*/

/*
JFrame f3= new JFrame("Play with computer");
 
JPanel comP=new JPanel();
JLabel comL=new JLabel();
comL.setIcon(new ImageIcon("picture/computer_back.jpg"));
comP.add(comL);
f3.add(comP);


f3.setSize(1113,831);
f3.setDefaultLookAndFeelDecorated(true);
f3.getRootPane().putClientProperty("JRootPane.titleBarBackground",Color.red);
f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f3.setVisible(true);
f3.setResizable(false);
//setBackground(new Color(128,128,0));

f3.setLocationRelativeTo(null);*/

