
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class FDemo extends JFrame
{
JPDemo jp1;
	FDemo()
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
int y=640;
int cc=0;
int x1=40;
int y1=640;
 
 int counts;

int countr;
 
 int pa=0;
 

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
		tx1.setBounds(50,220,150,40);
		add(tx1);
		tx1.setFont(f);
		tx1.setBackground(Color.black);
		tx1.setForeground(Color.green);
		
		tx2=new JTextField("Player 1");
		tx2.setBounds(50,280,150,40);
		add(tx2);
	    tx2.setFont(f);
		tx2.setBackground(Color.black);
		tx2.setForeground(Color.green);
		
		
		tx3=new JTextField("Player 2");
		tx3.setBounds(50,350,150,40);
		add(tx3);
	    tx3.setFont(f);
		tx3.setBackground(Color.black);
		tx3.setForeground(Color.green);
		
		b1=new JButton("Roll");
		b1.setFont(f);
		b1.setBounds(50,500,100,40);
		add(b1);
	    b1.setForeground(Color.red);
		b1.addActionListener(this);
		
		
		img9=new ImageIcon("start1.gif");
		img10=new ImageIcon("reset1.png");
        img11=new ImageIcon("about.gif");

		bstart=new JButton(img9);
		bstart.setBounds(25,575,138,60);
		add(bstart);
	    bstart.setForeground(Color.red);
		bstart.addActionListener(this);
		
		
		breset=new JButton(img10);
		breset.setBounds(50,170,115,30);
		add(breset);
	    breset.setForeground(Color.red);
		//breset.addActionListener(this);
		
		
		babout=new JButton(img11);
		babout.setBounds(50,120,105,30);
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
		g.fillRect(0,0,200,750);
		
		g.drawImage(swt,0,0,this);
		
		g.drawImage(ladder,200,0,this);
		g.drawImage(cor,920,0,this);
		g.drawImage(start,20,560,this);	
		
		
		g.drawImage(black,10,280,this);
		g.drawImage(blue,10,350,this);
		
		
		g.drawImage(dice,20,420,this);
		g.drawImage(blank,130,430,this);
		
		//g.drawImage(black,40,640,this);
		g.drawImage(black,x1,y1,this);
		g.drawImage(blue,x,y,this);	
		
		
 
	}
	
	public void actionPerformed(ActionEvent e)
	{
	    if(e.getSource()==bstart)
		{String m = JOptionPane.showInputDialog("Enter Player1 name?");
	         tx2.setText(""+m);
			 String m1 = JOptionPane.showInputDialog("Enter Player2 name?");
	         tx3.setText(""+m1);
			 
			 pa++;
			 }
		
		
		
		
		
		if(e.getSource()==b1)
		{    if(pa==0){
		JOptionPane.showMessageDialog(null, "First click on Start");}
	      if(pa!=0)   
		  {int random=(int)Math.round(Math.random()*5+1);
				
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
		 
	 	
	  	if(cc%2==0){
			int count=0;
			int k=1;
			tx1.setText("p1 chance");
			x=180;
			y=640;
			x=x+70;
					counts+=random;
					if(counts>100){counts-=random;}
					
					if(counts==4){counts=25;}
					if(counts==13){counts=46;}
					if(counts==33){counts=49;}
					if(counts==42){counts=63;}
					if(counts==50){counts=69;}
					if(counts==74){counts=92;}
					if(counts==62){counts=81;}
					
					if(counts==38){counts=3;}
					if(counts==43){counts=18;}
					if(counts==27){counts=5;}
					if(counts==52){counts=31;}
					if(counts==89){counts=53;}
					if(counts==99){counts=41;}
					if(counts==76){counts=58;}
					if(counts==66){counts=45;}
					
					if(counts==100){JOptionPane.showMessageDialog(null, "Player 2 won");}
		 			
	 	M:
		for(int i=1;i<=10;i++)
			{   if(k==11){x-=70;k--;}
				if(k==0){x+=70;k++;}
	         for(int j=1;j<=10;j++)
		        { 
		          count++;
				  // try{Thread.sleep(300);}catch(Exception e1){}
		  if(counts==count)break M;
				if(i%2==0)
		       {
			     x-=70;   k--;
			   }else{x+=70;k++;}
				}
			y=y-70;
		}
		
		}
		else{
			int count=0;
			tx1.setText("p2 chance");
			int k=1;
			x1=x1+140;
			
			x1=200;
			y1=640;
			
			countr+=random;
			if(countr>100){countr-=random;}
					if(countr==4){countr=25;}
					if(countr==13){countr=46;}
					if(countr==33){countr=49;}
					if(countr==42){countr=63;}
					if(countr==50){countr=69;}
					if(countr==74){countr=92;}
					if(countr==62){countr=81;}
			
					
					if(countr==38){countr=3;}
					if(countr==43){countr=18;}
					if(countr==27){countr=5;}
					if(countr==52){countr=31;}
					if(countr==89){countr=53;}
					if(countr==99){countr=41;}
					if(countr==76){countr=58;}
					if(countr==66){countr=45;}
		
		if(countr==100){JOptionPane.showMessageDialog(null, "Player 1 won");}
            	L:
		for(int i=1;i<=10;i++)
			{   if(k==11){x1-=70;k--;}
				if(k==0){x1+=70;k++;}
	         for(int j=1;j<=10;j++)
		        { 
		          count++;
		  if(countr==count)break L;
				if(i%2==0)
		       {
			     x1-=70;   k--;
			   }else{x1+=70;k++;}
				}
			y1=y1-70;}
		 }
		}cc++;  repaint();
		
		  }
			//logic
 	}		
		 
 }
	 
		
	

class SnakeLadder
{
public static void main(String ar[])
{
	FDemo f=new FDemo();
	f.setBounds(200,100,990,750);
	f.setVisible(true);
	f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}
}