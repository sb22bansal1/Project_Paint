
import java.awt.*;
import java.awt.event.*;

class MyNotepad
{
	MenuBar mb;
	Menu file;
	MenuItem n,o,c,e,r,t,y,q,aa;
	Menu edit;
	MenuItem cu,co,pa,u,i,d,a,g;
	Menu format;
	MenuItem aaa,aaaa,aaaaa;
Menu view;
	MenuItem aaaaaa;
Menu help;
	MenuItem t1,t2,t3;
Frame f=new Frame("MyNotepad");
	MyNotepad()
	{
		
		mb = new MenuBar();
		file = new Menu("File");
		n = new MenuItem("New");
		o = new MenuItem("Open...");
		c = new MenuItem("Save");
r = new MenuItem("Save As");
e=new MenuItem("-");
t = new MenuItem("Print...");
y = new MenuItem("Exit");   
   		file.add(n);
file.add(o);		
  		file.add(c);
file.add(r);
file.add(e);
file.add(t);
file.add(y);
//file.add(c);
  		mb.add(file);
 
 		edit = new Menu("Edit");
 		cu = new MenuItem("Cut");
		co = new MenuItem("Copy");
		pa = new MenuItem("Paste", new MenuShortcut(KeyEvent.VK_P));
u = new MenuItem("Delete                  del");
q=new MenuItem("-");  
i = new MenuItem("Find",  new MenuShortcut(KeyEvent.VK_F));
d = new MenuItem("Find next");

a = new MenuItem("Replace", new MenuShortcut(KeyEvent.VK_H));
aa=new MenuItem("-");
g = new MenuItem("Select All", new MenuShortcut(KeyEvent.VK_A));
		edit.add(cu);
		edit.add(co);
		edit.add(pa);
edit.add(u);
edit.add(aa);
edit.add(i);
edit.add(d);
edit.add(a);

edit.add(q);
edit.add(g);
		mb.add(edit);
format = new Menu("Format");
aaa = new MenuItem("Word Wrap");
aaaaa= new MenuItem("-");
aaaa = new MenuItem("Font...");
format.add(aaa);
format.add(aaaaa);
format.add(aaaa);
mb.add(format);		
view = new Menu("View");
aaaaaa = new MenuItem("Status Bar");
view.add(aaaaaa);
mb.add(view);
help = new Menu("Help");
t1 = new MenuItem("View Help");
t2 = new MenuItem("About MyNotepad");
t3 = new MenuItem("-");
help.add(t1);
help.add(t3);
help.add(t2);
mb.add(help);		
		f.setSize(500,500);
		
		f.setVisible(true);

		f.setMenuBar(mb);

	}
	public static void main(String args[])
	{
		MyNotepad d = new MyNotepad();
		
	}
}