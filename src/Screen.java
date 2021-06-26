
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Game extends JFrame implements ActionListener,Runnable
{
	JButton bt1;
	JButton[] b=new JButton[36];
	JButton brules,beven,bodd,bno,bspin,b50,b100,b500,b1000,bplayAgn,bquit,brestart,bexit;
	JPanel p1,p2,p3,p4,p5,p6;
	JLabel l1,jl1,jl2,jl3,jl4,jl5,jl6,jl7,jl8,jl9,jl10,l2,lresult,jl11,lscore,lamount,lscard,linScore,lbetScore,lNo,lfinals,llooser;
	Random ra;
	Font f,f1,f2,font,f3,f4;
	Thread th;
	int a=-700,digit,col,credit=500,betAmount,btnNo,i,j=30,k=3,count=0;
	String wheelColor,na="",user,betAmt,color,number;
	
	
	Game(String s)
	{
		super(s);
		setLayout(null);
		
		
// ====================   SCREEN ONE    ===============================================================================================
		
			
		th=new Thread(this);
		
		p1=new JPanel();
		p1.setLayout(null);
		p2=new JPanel();
		p2.setLayout(null);
		
		l1=new JLabel(" WEL-COME TO ROULETTE GAME ");
	    f=new Font("Arial",Font.BOLD+Font.ITALIC,45);
		l1.setFont(f);
		l1.setBounds(250,10,1200,90);
		 
		p1.setBackground(Color.PINK);
		p2.setBackground(Color.LIGHT_GRAY);
		
		p1.setBounds(0,0,1600,100);
		p2.setBounds(0,100,1600,1200);
		
		
		jl1=new JLabel("RULES TO FOLLOW : ");
		jl1.setBounds(50,1,1000,100);
		f1=new Font("Serif",Font.BOLD,20);
	    jl1.setFont(f1);
	    
	    
	    jl2=new JLabel(" • PLAYER HAVE TO BET EITHER ON BLACK OR RED COLOR FOR EACH BET. ");
	    jl2.setBounds(50,40,1000,100);
	    f2=new Font("Serif",Font.ITALIC,20);
	    jl2.setFont(f2);
	    
	    jl3=new JLabel(" • BET 1 --> EVEN NUMBER ");
	    jl3.setBounds(50,85,1000,100);
	    f2=new Font("Serif",Font.ITALIC,20);
	    jl3.setFont(f2);
	    
	    jl4=new JLabel(" HERE PLAYER WILL GET REWARD OF X CREDIT ON WIN AND LOSE 2X ON WRONG GUESS ");
	    jl4.setBounds(150,110,1000,100);
	    f2=new Font("Serif",Font.ITALIC,20);
	    jl4.setFont(f2);
	    
	    
	    jl5=new JLabel(" • BET 2 --> ODD NUMBER ");
	    jl5.setBounds(50,155,1000,100);
	    f2=new Font("Serif",Font.ITALIC,20);
	    jl5.setFont(f2);
	    
	    jl6=new JLabel(" HERE PLAYER WILL GET REWARD OF X CREDIT ON WIN AND LOSE 2X ON WRONG GUESS ");
	    jl6.setBounds(150,180,1000,100);
	    f2=new Font("Serif",Font.ITALIC,20);
	    jl6.setFont(f2);
	    
	    jl7=new JLabel(" • BET 3 --> NUMBER FROM 1-36 [ACCRODRING TO WHEEL] ");
	    jl7.setBounds(50,230,1000,100);
	    f2=new Font("Serif",Font.ITALIC,20);
	    jl7.setFont(f2);
	    
	    jl8=new JLabel(" HERE PLAYER WILL GET REWARD OF 2X ON WIN AND LOSE X ON WRONG GUESS ");
	    jl8.setBounds(150,255,1000,100);
	    f2=new Font("Serif",Font.ITALIC,20);
	    jl8.setFont(f2);
	    
	    
	    jl9=new JLabel(" NOTE:-");
	    jl9.setBounds(50,320,1000,100);
	    f2=new Font("ROMAN",Font.BOLD,20);
	    jl9.setFont(f2);
	    
	    jl10=new JLabel(" FROM BET 1,2,3 PLAYER CAN ONLY BET ONE AT A TIME ");
	    jl10.setBounds(150,320,1000,100);
	    f2=new Font("Serif",Font.ITALIC,20);
	    jl10.setFont(f2);
	    
	    bt1=new JButton("READY");
		bt1.setBounds(550,450,150,50);
		bt1.setFont(f1);
	    bt1.setBackground(Color.green);
	    
	    
	   
// ===============   SCREEN TWO   =======================================================================================
	   
	   
	    
	    l2 =new JLabel("GAME BEGINS....");
		l2.setBounds(600,10,1600,90);
		f=new Font("Arial",Font.BOLD+Font.ITALIC,45);
		l2.setFont(f);
		
		p3=new JPanel();
		p3.setLayout(null);
		p3.setBounds(0,100,785,1200);
		p3.setBackground(Color.CYAN);
		
		p4=new JPanel();
		p4.setLayout(null);
		p4.setBounds(785,100,1200,250);
		p4.setBackground(Color.orange);   
		
		p5=new JPanel();
		p5.setLayout(null);
		p5.setBounds(785,350,1200,550);
		p5.setBackground(Color.lightGray);  
		
		f=new Font("ROMAN",Font.BOLD,20);
		f3=new Font("Arial",Font.BOLD,50);
		f4=new Font("Arial",Font.BOLD+Font.ITALIC,26);
		
		for(i=0;i<12;i++)
		{
			b[i]=new JButton(""+k);
			b[i].setFont(f);
			b[i].setBounds(j,30,60,60);
			
			if(i%2==0)
			{
				b[i].setBackground(Color.red);
			}
			else
			{
				b[i].setBackground(Color.black);
			}
			
			k=k+3;
			j=j+60;
		}
		
		j=30;
		k=2;
		
		for(i=12;i<24;i++)
		{
			
			b[i]=new JButton(""+k);
			b[i].setFont(f);
			b[i].setBounds(j,90,60,60);
			
			if(i%2==0)
			{
				b[i].setBackground(Color.black);
			}
			else
			{
				b[i].setBackground(Color.red);
			}
			
			k=k+3;
			j=j+60;
		}
		
		j=30;
		k=1;
		
		for(i=24;i<36;i++)
		{
			
			b[i]=new JButton(""+k);
			b[i].setFont(f);
			b[i].setBounds(j,150,60,60);
			
			if(i%2==0)
			{
				b[i].setBackground(Color.red);
			}
			else
			{
				b[i].setBackground(Color.black);
			}
			
			k=k+3;
			j=j+60;
		}
		
		brules=new JButton("RULES");
		brules.setBounds(30,30,135,45);
		brules.setFont(f);
		
		beven=new JButton("EVEN");
		beven.setBounds(30,220,150,50);
		beven.setFont(f);
		
		bodd=new JButton("ODD");
		bodd.setBounds(600,220,150,50);
		bodd.setFont(f);
		
		bno=new JButton(" GUESS NUMBER ");
		bno.setBounds(260,220,270,50);
		bno.setFont(f);
		
		lNo=new JLabel("");
		lNo.setBounds(280,270,450,70);
		lNo.setFont(f);
		
		bspin=new JButton("SPIN");
		bspin.setBounds(310,20,150,35);
		bspin.setFont(f);
		
		lresult=new JLabel("");
		lresult.setBounds(355,115,500,50);
		lresult.setFont(f3);
		
		jl11=new JLabel("CHOOSE THE BET FROM THE FOLLOWING : ");
		jl11.setBounds(180,330,450,70);
	    jl11.setFont(f1);

	    b50=new JButton("50");
		b50.setBounds(180,400,150,50);
		b50.setFont(f1);
		
		b100=new JButton("100");
		b100.setBounds(450,400,150,50);
		b100.setFont(f1);

		b500=new JButton("500");
		b500.setBounds(180,500,150,50);
		b500.setFont(f1);
		
		b1000=new JButton("1000");
		b1000.setBounds(450,500,150,50);
		b1000.setFont(f1);
		
		lscore=new JLabel("SCORE CARD");
		lscore.setBounds(290,1,500,50);
		lscore.setFont(f4);
		
		lamount=new JLabel("");
		lamount.setBounds(240,230,500,50);
		lamount.setFont(f4);
		
		linScore=new JLabel(" INITIAL CREDIT : 500 ");
		linScore.setLabelFor(null);
		linScore.setBounds(275,50,600,50);
		linScore.setFont(f);
		
		lbetScore=new JLabel("");
		lbetScore.setLabelFor(null);
		lbetScore.setBounds(130,140,600,50);
		lbetScore.setFont(f);
		
		bplayAgn=new JButton("PLAY AGAIN");
		bplayAgn.setFont(f);
		bplayAgn.setBounds(0,390,385,50);
		
		bquit=new JButton("QUIT");
		bquit.setFont(f);
		bquit.setBounds(385,390,385,50);
		
	
		
// ================   SCREEN THREE  ================================================================================
		
		
		
		p6=new JPanel();
		p6.setLayout(null);
		p6.setBounds(0,0,1600,1200);
		p6.setBackground(Color.GRAY);

		llooser=new JLabel("");
		llooser.setBounds(400,150,1000,100);
		font = new Font("Sen Serif",Font.BOLD,25);
		llooser.setFont(font);
		
		lscard=new JLabel("");
		lscard.setBounds(500,250,500,100);
		lscard.setBackground(Color.red);
		lscard.setFont(font);
		
		lfinals=new JLabel("");
		lfinals.setBounds(590,350,500,100);
		lfinals.setBackground(Color.red);
		font = new Font("Sen Serif",Font.BOLD,25);
		lfinals.setFont(font);
		
		brestart=new JButton("RESTART");
		brestart.setBounds(400,500,200,50);
		f=new Font("ROMAN",Font.BOLD,20);
		brestart.setFont(f);
		
		bexit=new JButton("EXIT");
		bexit.setBounds(800,500,200,50);
		bexit.setFont(f);	
		
		add(p6);
		
		p6.add(lscard);  p6.add(brestart);  p6.add(bexit);  p6.add(lfinals);
		
		p6.setVisible(false);

		
// =================================================================================================================
		
	    p2.add(jl1);    p2.add(jl2);   p2.add(jl3);  p2.add(jl4);
	    p2.add(jl5);    p2.add(jl6);   p2.add(jl7);	 p2.add(jl8);  p2.add(jl9);  p2.add(jl10);
	  	
		add(p1); add(p2); p2.add(bt1); p1.add(l1);  
		
		b50.setEnabled(false);
		b100.setEnabled(false);
		b500.setEnabled(false);
		b1000.setEnabled(false);
		bspin.setEnabled(false);
		
		bt1.addActionListener(this);
		brules.addActionListener(this);
		bspin.addActionListener(this);
		beven.addActionListener(this);
		bodd.addActionListener(this);
		bno.addActionListener(this);

		b50.addActionListener(this);
		b100.addActionListener(this);
		b500.addActionListener(this);
		b1000.addActionListener(this);
			
		for(i=0;i<b.length;i++)
		{
			b[i].addActionListener(this);
		}
		
		bplayAgn.addActionListener(this);
		bquit.addActionListener(this);
		brestart.addActionListener(this);
		bexit.addActionListener(this);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
			
		th.start();
	}
	
	
   public void run()
    {
    	
    	while(true)
    	{
    		if(a<=1200)
    		{
    			 l1.setBounds(a++,10,1200,90);
    		}
    		else 
    		{
    			a=-700;
    		}
    	
    		
    		try { Thread.sleep(7); }
    		catch(Exception e) {   }
    	}
    	
    }
    
    
	@Override
	public void actionPerformed(ActionEvent e) {
		
		na=e.getActionCommand();
		
		if(na.equals("READY"))
		{
		p2.setVisible(false);
		l1.setVisible(false);
		
		p3.setVisible(true);
		p4.setVisible(true);
		p5.setVisible(true);
		l2.setVisible(true);
		brules.setVisible(true);
		
		p1.add(l2);  add(p3);  add(p4);  add(p5);
		
		
		for(i=0;i<b.length;i++)
		{
			b[i].setEnabled(false);
			p3.add(b[i]);
		}
		
		
		p1.add(brules);  p3.add(beven);   p3.add(bodd);  p3.add(bno);  p4.add(bspin);  p4.add(lresult);
		p3.add(jl11); p3.add(b50);
		p3.add(b100); p3.add(b500); p3.add(b1000);  p3.add(lNo);
		
		p5.add(lscore);  p5.add(lamount);  p5.add(bplayAgn);  p5.add(bquit);  p5.add(linScore); p5.add(lbetScore); 
		
		}
		
		else if(na.equals("RULES"))
		{
			p3.setVisible(false);
			p4.setVisible(false);
			p5.setVisible(false);
			l2.setVisible(false);
			brules.setVisible(false);
			
			p2.setVisible(true);
			l1.setVisible(true);
			
		}
		
		else if(na.equals("EVEN") || na.equals("ODD") || na.equals(" GUESS NUMBER "))
		{
		     user=e.getActionCommand();
		     
		     if(user.equals("EVEN"))
		     {
		    	 bno.setEnabled(false);
		    	 bodd.setEnabled(false);
		    	 
		    	  b50.setEnabled(true);
				  b100.setEnabled(true);
				  b500.setEnabled(true);
				  b1000.setEnabled(true);
		     }
		     else if(user.equals("ODD"))
		     {
		    	 bno.setEnabled(false);
		    	 beven.setEnabled(false);
		    	 
		    	  b50.setEnabled(true);
				  b100.setEnabled(true);
				  b500.setEnabled(true);
				  b1000.setEnabled(true);
		     }
		     else
		     {
		    	 bodd.setEnabled(false);
				 beven.setEnabled(false);
				
				 for(i=0;i<b.length;i++)
					{
						b[i].setEnabled(true);                    
					}
		     }
		}
		
		else if(na.equals("50") || na.equals("100") || na.equals("500") || na.equals("1000"))
		{
			betAmt=e.getActionCommand();
			
			betAmount=Integer.parseInt(betAmt);
			
			bspin.setEnabled(true);
		}
		
		else if(na.equals("1") || na.equals("2")  || na.equals("3")  || na.equals("4")  || na.equals("5")  || na.equals("6")  || na.equals("7")  || na.equals("8")  || na.equals("9")  || na.equals("10")  || na.equals("11")  || na.equals("12")  || na.equals("13")  || na.equals("14")  || na.equals("15")  || na.equals("16")  || na.equals("17")  || na.equals("18")  || na.equals("19")  || na.equals("20")  || na.equals("21")  || na.equals("22")  || na.equals("23")  || na.equals("24")  || na.equals("25")  || na.equals("26")  || na.equals("27")  || na.equals("28")  || na.equals("29")  || na.equals("30")  || na.equals("31")  || na.equals("32")  || na.equals("33")  || na.equals("34")  || na.equals("35")  || na.equals("36") )
		{
			number=e.getActionCommand();
			
			btnNo=Integer.parseInt(number);
			
			lNo.setText(" NUMBER CHOSEN : "+number);
			
			b50.setEnabled(true);
			b100.setEnabled(true);
			b500.setEnabled(true);
			b1000.setEnabled(true);
			
			bodd.setEnabled(false);
			beven.setEnabled(false);
		}
	
		else if(na.equals("SPIN"))
		{
			bspin.setEnabled(false);
			bodd.setEnabled(false);
			beven.setEnabled(false);
			bno.setEnabled(false);
			
			b50.setEnabled(false);
			b100.setEnabled(false);
			b500.setEnabled(false);
			b1000.setEnabled(false);

			count++;
			
			ra=new Random();
			
			digit=0;
		
			digit=ra.nextInt(36);
			digit++;
			
		    lresult.setText(""+digit);	
		    
		    if(digit%2==0 && user.equals("EVEN") )
		    {
		    	credit=credit+betAmount;
		    	
		    	lbetScore.setText("• BET AMOUNT : "+betAmt+"                  • WON AMOUNT : "+betAmount);
		    	lfinals.setText("FINAL CREDIT : "+credit);
		    	lamount.setText("CURRENT CREDIT : "+credit);
		    }
		    
		    else if(user.equals("EVEN") && digit%2!=0)
		    {	
		    	credit=credit-2*betAmount;
		    	lbetScore.setText("• BET AMOUNT : "+betAmt+"                  • LOST AMOUNT : "+2*betAmount);
		    	
		    	if(credit>0)
		    	{
		    		lfinals.setText("FINAL CREDIT : "+credit); 
		    		lamount.setText("CURRENT CREDIT : "+credit);
		    	}
		    	else 
		    	{
		    		p6.setVisible(true);
					 
				    p3.setVisible(false);
				    p4.setVisible(false);
				    p5.setVisible(false);
				   
				    lscard.setText("TOTAL NUMBER OF BET MADE : "+count);
				    llooser.setText("GAME OVER !!!   AS YOU RAN OUT OF YOUR CREDIT");
				    lfinals.setText("FINAL CREDIT : 0");
				       
				    p6.add(llooser);
		    	}
		    }
		    
		   
		    else if(digit%2!=0 && user.equals("ODD"))
		    {
		    	
		    	credit=credit+betAmount;
		    	
		    	lbetScore.setText("• BET AMOUNT : "+betAmt+"                  • WON AMOUNT : "+betAmount);
		    	lfinals.setText("FINAL CREDIT : "+credit);
		    	lamount.setText("CURRENT CREDIT : "+credit);
		    }
		    
		    else if(user.equals("ODD") && digit%2==0)
		    {
		    	credit=credit-2*betAmount;
		    	lbetScore.setText("• BET AMOUNT : "+betAmt+"                  • LOST AMOUNT : "+2*betAmount);
		    	
		    	if(credit>0)
		    	{
		    		lfinals.setText("FINAL CREDIT : "+credit);   
		    		lamount.setText("CURRENT CREDIT : "+credit);
		    	}
		    	else 
		    	{
		    		p6.setVisible(true);
					 
				    p3.setVisible(false);
				    p4.setVisible(false);
				    p5.setVisible(false);
				    	
				    lscard.setText("TOTAL NUMBER OF  BET MADE : "+count);
				    llooser.setText("GAME OVER !!!   AS YOU RAN OUT OF YOUR CREDIT");
				    lfinals.setText("FINAL CREDIT : 0");
				   	
				    p6.add(llooser);
		    	}
		    	
		    }
		    
		    else if(digit==btnNo)
		    {
		    	credit=credit+2*betAmount;
		    	
		    	lbetScore.setText("• BET AMOUNT : "+betAmt+"                  • WON AMOUNT : "+2*betAmount);
		    	lfinals.setText("FINAL CREDIT : "+credit);
		    	lamount.setText("CURRENT CREDIT : "+credit);
		    	
		    }
		    else if(digit!=btnNo)
		    {
		    	credit=credit-betAmount;
		    	lbetScore.setText("• BET AMOUNT : "+betAmt+"                  • LOST AMOUNT : "+betAmount);
		    	
		    	if(credit>0)
		    	{
		    		lfinals.setText("FINAL CREDIT : "+credit);   
		    		lamount.setText("CURRENT CREDIT : "+credit);
		    	}
		    	else 
		    	{
		    		p6.setVisible(true);
					 
				    p3.setVisible(false);
				    p4.setVisible(false);
				    p5.setVisible(false);
				    	
				    lscard.setText("TOTAL NUMBER OF BET  MADE : "+count);
				    llooser.setText("GAME OVER !!!    AS YOU RAN OUT OF YOUR CREDIT");
				    lfinals.setText("FINAL CREDIT : 0");
				    	
				    p6.add(llooser);
		    	}
		    	
		    }
	    }
		
		 else if(na.equals("PLAY AGAIN"))
		 {
			beven.setEnabled(true);
			bodd.setEnabled(true);
			bno.setEnabled(true);
			lNo.setVisible(false);
			lresult.setText(null);
		 }
		
		 else if(na.equals("QUIT"))
		 {
			brules.setVisible(false);
			p6.setVisible(true); 
		    p3.setVisible(false);
		    p4.setVisible(false);
		    p5.setVisible(false);
		    
		    p6.setVisible(true);
		    	
		    lscard.setText("TOTAL NUMBER OF BET MADE : "+count);
		    
		    if(count==0)
		    {
		    	lfinals.setText("FINAL CREDIT : 0");
		    }
		    else
		    {
		    	lfinals.setText("FINAL CREDIT : "+credit);
		    }
		 }
		
		else if(na.equals("EXIT"))
		{
			System.exit(0);
		}
		
		else if(na.equals("RESTART"))
		{
			p6.setVisible(false);
			
			brules.setVisible(true);
			l2.setVisible(true);
			p3.setVisible(true);
			
			beven.setEnabled(true);
			bodd.setEnabled(true);
			bno.setEnabled(true);
			
	    	p4.setVisible(true);
	    	p5.setVisible(true);
	    	lresult.setText(null);
	  
	        lbetScore.setText(null);
	        lamount.setText(null);
	        

			b50.setEnabled(false);
			b100.setEnabled(false);
			b500.setEnabled(false);
			b1000.setEnabled(false);
	        
	    	credit=500;
	    	count=0;
		}
	}
}

public class Screen
{
	public static void main(String[] args)
	{
		Game gg = new Game("Roulette");
		gg.setSize(1300,700);
		gg.setVisible(true);
		gg.setLocation(25,25);
		//gg.setResizable(false);
	}
}

