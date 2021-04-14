import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class FDemo1 extends JFrame
{
JPDemo jp1;
	FDemo1()
	{
		super.setTitle("Snake & Ladder");
	jp1=new JPDemo();
	add(jp1);
	}
}
class JPDemo extends JPanel implements ActionListener
{
ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9,img10,img11;
Image swt,dot,ladder,cor,start,blue,black,dice,blank;
JTextField tx1,tx2,tx3;
JButton b1,bstart,breset,babout;

int x=120;
int y=620;
int count_start=0;
//int px2=40;
//int pxy2=640;

int r_black=0;
int r_blue=0;


int countb=0;
int count=0;


	JPDemo()
	{
		setBackground(Color.black);
		
		img1=new ImageIcon("swt.jpg");
		swt=img1.getImage();
		
		img2=new ImageIcon("ladder.jpg");
		ladder=img2.getImage();
		
		img3=new ImageIcon("cor.jpg");
		cor=img3.getImage();
		
		img4=new ImageIcon("start.jpg");
		start=img4.getImage();
		
		img5=new ImageIcon("black.png");
		blue=img5.getImage();
		
		img6=new ImageIcon("blue.jpg");
		black=img6.getImage();
		
		setLayout(null);
		
		Font f=new Font("Bauhaus 93",Font.ITALIC,20);
		tx1=new JTextField("Start Game");
		tx1.setBounds(50,230,150,35);
		add(tx1);
		tx1.setFont(f);
		tx1.setBackground(Color.black);
		tx1.setForeground(Color.green);
		
		tx2=new JTextField("Player 1");
		tx2.setBounds(50,290,150,35);
		add(tx2);
	    tx2.setFont(f);
		tx2.setBackground(Color.black);
		tx2.setForeground(Color.green);
		
		
		tx3=new JTextField("Player 2");
		tx3.setBounds(50,375,150,35);
		add(tx3);
	    tx3.setFont(f);
		tx3.setBackground(Color.black);
		tx3.setForeground(Color.green);
		
		b1=new JButton("Roll");
		b1.setFont(f);
		b1.setBounds(50,500,100,30);
		add(b1);
	    b1.setForeground(Color.red);
		b1.addActionListener(this);
		
		
		img9=new ImageIcon("start.gif");
		img10=new ImageIcon("reset1.png");
        img11=new ImageIcon("about.gif");

		bstart=new JButton(img9);
		bstart.setBounds(25,560,150,60);
		add(bstart);
	    bstart.setForeground(Color.red);
		//bstart.addActionListener(this);
		
		
		breset=new JButton(img10);
		breset.setBounds(50,180,100,30);
		add(breset);
	    breset.setForeground(Color.red);
		//breset.addActionListener(this);
		
		
		babout=new JButton(img11);
		babout.setBounds(50,120,100,30);
		add(babout);
	    babout.setForeground(Color.red);
		//babout.addActionListener(this);
		
		img7=new ImageIcon("dice.gif");
		dice=img7.getImage();
		
		img8=new ImageIcon("blank.jpg");
		blank=img8.getImage();
		
		
		
		
	}
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		g.setColor(new Color(4,129,255));
		g.fillRect(0,0,200,735);
		
		g.drawImage(swt,0,0,this);
		
		g.drawImage(ladder,200,0,this);
		g.drawImage(cor,920,0,this);
		g.drawImage(start,20,550,this);	
		
		
		//g.drawImage(black,x-60,y,this);
		
		 
		g.drawImage(blue,x,y,this);
		 
		//dices
		g.drawImage(dice,10,430,this);
		g.drawImage(blank,110,430,this);
		
		//g.drawImage(black,40,640,this);
		g.drawImage(black,10,280,this);
		g.drawImage(blue,10,360,this);	
		
		
 
	}
	
	public void actionPerformed(ActionEvent e)
	{ 
	
	
	   if(e.getSource()==b1)
	   {
		
		int random=(int)Math.round(Math.random()*5+1);
		x=x+70;
		//countr=countr+random; 
		   switch(random)
		    {
			case 1:
			img8=new ImageIcon("dot1.jpg");
			break;
			case 2:
			img8=new ImageIcon("dot2.jpg");
            break;
			case 3:
			img8=new ImageIcon("dot3.jpg");
			break;
			case 4:       
			img8=new ImageIcon("dot4.jpg");
     		break;
			case 5:
			img8=new ImageIcon("dot5.jpg");
 			break;
			case 6:
			img8=new ImageIcon("dot6.jpg");
 			break;
			}
			blank=img8.getImage();
			
			
			 // for(int r=0;r<=countr;r++)
			  //{ x=x+60;  
				  
				//  }
			  
			//logic to move
			
		  M:
		int k=1;
		int countr=13;
			for(int i=1;i<=10;i++)
			{  if(k==11){x-=70;k--;}
			   if(k==0){x+=70;k++;}
			   
			   for(int j=1;j<=10;j++)
			   {  count++;
		
		
					if(countr==count) break M;
					if(i%2==1)
					{x+=70;
					 k++;
					}
					else{x-=70;  k--;}
				
		       }   y-=70;//if(countr>10&&countr<=20){y-=70;}
				
			}  repaint();
		 	 
			
	 		
	  }
	 	
	 }
	 
}	
	

class SnakeLadderP
{
public static void main(String ar[])
{
	FDemo1 f=new FDemo1();
	f.setBounds(200,100,990,735);
	f.setVisible(true);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}
}