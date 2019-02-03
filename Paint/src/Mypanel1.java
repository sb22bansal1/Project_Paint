import java.awt.*; 

import javax.swing.*;
 class Rect 
{
int x1,x2,y1,y2;
 Rect(int x1,int y1,int x2,int y2)
{
this.x1=x1;
this.y1=y1;
this.x2=x2;
this.y2=y2;
}
}
class Rect1 
{
int x1,x2,y1,y2;
 Rect1(int x1,int y1,int x2,int y2)
{
this.x1=x1;
this.y1=y1;
this.x2=x2;
this.y2=y2;
}
}
class eraser 
{
int x1,x2,y1,y2;
 eraser(int x1,int y1,int x2,int y2)
{
this.x1=x1;
this.y1=y1;
this.x2=x2;
this.y2=y2;
}
}
class Oval
{
int x1,x2,y1,y2;
public Oval(int x1,int y1,int x2,int y2)
{
this.x1=x1;
this.y1=y1;
this.x2=x2;
this.y2=y2;
}
}
class line
{
int x1,x2,y1,y2;
public line(int x1,int y1,int x2,int y2)
{
this.x1=x1;
this.y1=y1;
this.x2=x2;
this.y2=y2;
}
}
class FillRect
{
int x1,x2,y1,y2;
public FillRect(int x1,int y1,int x2,int y2)
{
this.x1=x1;
this.y1=y1;
this.x2=x2;
this.y2=y2;
}
}
class FillOval
{
int x1,x2,y1,y2;
public FillOval(int x1,int y1,int x2,int y2)
{
this.x1=x1;
this.y1=y1;
this.x2=x2;
this.y2=y2;
}
}
class RoundRect
{
int x1,x2,y1,y2;
public RoundRect(int x1,int y1,int x2,int y2)
{
this.x1=x1;
this.y1=y1;
this.x2=x2;
this.y2=y2;
}
}



public class Mypanel1 extends Panel
{
int x1,x2,y1,y2,x3=10,y3=10,x=0,y=0;
public void paint(Graphics g)
{
for(Object o:A6.a1)
{ 
if(o instanceof Rect)
{
Rect r=(Rect)o;
g.drawRect(r.x1,r.y1,r.x2,r.y2);
}
else if(o instanceof Rect1)
{
Rect1 r=(Rect1)o;

g.fillRect(r.x1,r.y1,r.x2,r.y2);
}
else if(o instanceof Oval)
{
Oval o1=(Oval)o;
g.drawOval(o1.x1,o1.y1,o1.x2,o1.y2);
}
else if(o instanceof line)
{
line l1=(line)o;
g.drawLine(l1.x1,l1.y1,l1.x2,l1.y2);
}
else if(o instanceof FillOval)
{
FillOval o2=(FillOval)o;
g.fillOval(o2.x1,o2.y1,o2.x2,o2.y2);
}
else if(o instanceof eraser)
{
eraser o3=(eraser)o;
g.clearRect(o3.x1,o3.y1,o3.x2,o3.y2);
}
else if(o instanceof FillRect)
{
FillRect r1=(FillRect)o;
g.fillRect(r1.x1,r1.y1,r1.x2,r1.y2);
}
else if(o instanceof RoundRect)
{
RoundRect o1=(RoundRect)o;
g.drawRoundRect(o1.x1,o1.y1,o1.x2,o1.y2,10,10);
}
}
if((A6.str).equals("rect"))
g.drawRect(x1,y1,x2-x1,y2-y1);

else if((A6.str).equals("oval"))
g.drawOval(x1,y1,x2-x1,y2-y1);
else if((A6.str).equals("eraser"))
{
g.setColor(Color.red);
g.clearRect(x1,y1,x2-x1,y2-y1);
}
else if((A6.str).equals("line"))
g.drawLine(x1,y1,x2,y2);

else if((A6.str).equals("foval"))
g.fillOval(x1,y1,x2-x1,y2-y1);

else if((A6.str).equals("frect"))
g.fillRect(x1,y1,x2-x1,y2-y1);
else if((A6.str).equals("rrect"))
g.drawRoundRect(x1,y1,x2-x1,y2-y1,10,10);


}
}