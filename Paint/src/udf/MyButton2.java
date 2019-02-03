package udf;
import java.awt.*;
import javax.swing.*;
public class MyButton2 extends Button
{
public MyButton2()
{
this("");
}
public MyButton2 (String str)
{
super(str);
this.setBackground(Color.blue);
this.setForeground(Color.white);
}
public void paint(Graphics g)
{
g.setFont(new Font("Arial",1,50));
g.drawOval(10,10,20,25);


}
}