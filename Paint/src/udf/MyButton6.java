package udf;
import java.awt.*;
import javax.swing.*;
public class MyButton6 extends Button
{
public MyButton6()
{
this("");
}
public MyButton6 (String str)
{
super(str);
this.setBackground(Color.blue);
this.setForeground(Color.white);
}
public void paint(Graphics g)
{
g.setFont(new Font("Arial",1,50));
g.setColor(Color.white);
g.drawRoundRect(10,10,20,25,10,10);


}
}