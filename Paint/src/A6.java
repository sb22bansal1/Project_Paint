import udf.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;
public class A6 extends MouseAdapter implements ActionListener
{
	MyButton b1,b2,b9,b8;
	MyButton1 b11;
	MyButton2 b3;
	MyButton3 b4;
	MyButton4 b5;
	MyButton5 b6;
	MyButton6 b7;
	Button b12,b13;
	JFrame f;
	JFrame b;
	public static String str="";
	JPanel p1,p3,p4;
	static ArrayList a1;
	Mypanel1 p;
	public A6()
	{
	a1=new ArrayList();
	f=new JFrame();
	p1=new JPanel();
	p1.setBounds(0,0,80,400);
	p1.setBackground(Color.red);
	p=new Mypanel1();
	
	p.addMouseListener(this);
	p.addMouseMotionListener(this);
	p1.setLayout(new GridLayout(2,1));
	p3=new JPanel();
	b12=new Button("+");
	b12.setBackground(new Color(160,160,160));
	b12.setForeground(Color.black);
	b13=new Button("-");
	b13.setBackground(new Color(160,160,160));
	b13.setForeground(Color.black);
	b9=new MyButton("");
	b9.setBackground(new Color(160,160,160));
	b9.setForeground(Color.black);
	b11=new MyButton1("");
	
	b11.setBackground(new Color(160,160,160));
	b11.setForeground(Color.black);
	b3=new MyButton2("");
	
	b3.setBackground(new Color(160,160,160));
	b3.setForeground(Color.black);
	b4=new MyButton3("");
	
	b4.setBackground(new Color(160,160,160));
	b4.setForeground(Color.black);
	b5=new MyButton4("");
	
	b5.setBackground(new Color(160,160,160));
	b5.setForeground(Color.black);
	b6=new MyButton5("");
	
	b6.setBackground(new Color(160,160,160));
	b6.setForeground(Color.black);
	b7=new MyButton6("");
	
	b7.setBackground(new Color(160,160,160));
	b7.setForeground(Color.black);
	b8=new MyButton("");
	
	b8.setBackground(new Color(160,160,160));
	b8.setForeground(Color.black);
	p3.setLayout(new GridLayout(5,2));
	b9.addActionListener(this);
	b3.addActionListener(this);
	b11.addActionListener(this);
	b4.addActionListener(this);
	b5.addActionListener(this);
	b6.addActionListener(this);
	b7.addActionListener(this);	
	b12.addActionListener(this);
	b13.addActionListener(this);	
	p3.setBackground(Color.white);
	p4=new JPanel();
	p4.setBackground(new Color(160,160,160));
	p.setBounds(81,0,400,400);
	b1=new MyButton("");
	b2=new MyButton("");
	f.setLayout(null);
	p1.add(p3);
	p1.add(p4);
	p3.add(b9);
	p3.add(b11);
	p3.add(b3);
	p3.add(b4);
	p3.add(b5);
	p3.add(b6);
	p3.add(b7);
	p3.add(b8);
	p3.add(b12);
	p3.add(b13);
	f.add(p1);
	
	f.add(p);
	f.setSize(400,400);
	f.setVisible(true);
	}
	public static void main(String args[])
	{
	A6 a=new A6();
	}
	public void actionPerformed(ActionEvent e)
	{
	if(e.getSource()==b9)
	str="line";
	 else if(e.getSource()==b3)
	str="oval";
	else if(e.getSource()==b11)
	str="rect"; 
	else if(e.getSource()==b4)
	str="frect";
	else if(e.getSource()==b5)
	str="foval";
	else if(e.getSource()==b6)
	str="eraser";
	else if(e.getSource()==b7)
	
	str="rrect";
	else if(e.getSource()==b12)
	{
	str="plus";
	System.out.println("str");
	}
	else if(e.getSource()==b13)
	str="minus";
	}
	public void mouseDragged(MouseEvent e)
	{
	p.x2=e.getX();
	p.y2=e.getY();
	p.repaint();
	}
	public void mousePressed(MouseEvent e)
	{
	p.x1=e.getX();
	p.y1=e.getY();
	}
	public void mouseReleased(MouseEvent e)
	{
	if(str.equals("rect"))
	{
	Rect r=new Rect(p.x1,p.y1,p.x2-p.x1,p.y2-p.y1);
	System.out.println("Added rect");
	a1.add(r);
	}
	else if(str.equals("oval"))
	{
	Oval r=new Oval(p.x1,p.y1,p.x2-p.x1,p.y2-p.y1);
	a1.add(r);
	}
	else if(str.equals("rrect"))
	{
	RoundRect r=new RoundRect(p.x1,p.y1,p.x2-p.x1,p.y2-p.y1);
	a1.add(r);
	}
	else if(str.equals("frect"))
	{
	FillRect r=new FillRect(p.x1,p.y1,p.x2-p.x1,p.y2-p.y1);
	a1.add(r);
	}
	else if(str.equals("foval"))
	{
	FillOval r=new FillOval(p.x1,p.y1,p.x2-p.x1,p.y2-p.y1);
	a1.add(r);
	}
	else if(str.equals("line"))
	{
	line r=new line(p.x1,p.y1,p.x2,p.y2);
	a1.add(r);
	}
	else if(str.equals("eraser"))
	{
	eraser	r=new eraser(p.x1,p.y1,p.x2-p.x1,p.y2-p.y1);
	a1.add(r);
	}
	}
}