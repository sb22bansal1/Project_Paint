package udf;
import java.awt.*;
import javax.swing.*;
public class MyButton1 extends Button
{
public MyButton1()
{
this("");
}
public MyButton1 (String str)
{
super(str);
this.setBackground(Color.blue);
this.setForeground(Color.white);
}
public void paint(Graphics g)
{
g.setFont(new Font("Arial",1,50));
g.drawRect(10,10,22,24);


}
}