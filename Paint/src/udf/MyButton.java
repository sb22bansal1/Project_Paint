package udf;
import java.awt.*;
import javax.swing.*;
public class MyButton extends Button
{
public MyButton()
{
this("");
}
public MyButton (String str)
{
super(str);
this.setBackground(Color.blue);
this.setForeground(Color.white);
}
public void paint(Graphics g)
{
g.setFont(new Font("Arial",1,50));
g.drawLine(10,10,32,32);


}
}