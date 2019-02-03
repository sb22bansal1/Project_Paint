package udf;
import java.awt.*;
import javax.swing.*;
public class MyButton4 extends Button
{
public MyButton4()
{
this("");
}
public MyButton4 (String str)
{
super(str);
this.setBackground(Color.blue);
this.setForeground(Color.white);
}
public void paint(Graphics g)
{
g.setFont(new Font("Arial",1,50));
g.setColor(Color.black);
g.fillOval(10,10,20,25);


}
}