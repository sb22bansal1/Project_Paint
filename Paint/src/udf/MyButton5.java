package udf;
import java.awt.*;
import javax.swing.*;
public class MyButton5 extends Button
{
public MyButton5()
{
this("");
}
public MyButton5 (String str)
{
super(str);
this.setBackground(Color.blue);
this.setForeground(Color.white);
}
public void paint(Graphics g)
{
g.setFont(new Font("Arial",1,50));
g.setColor(Color.white);
g.fillRect(10,10,20,25);


}
}