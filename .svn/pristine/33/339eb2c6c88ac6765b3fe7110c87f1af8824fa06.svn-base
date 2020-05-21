
import java.awt.Dimension;
import java.awt.Image;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.image.AffineTransformOp;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JToggleButton;

public class VHHG extends JFrame {

static JFrame okno;
static JLabel text;
static JLabel text1;
static JLabel text2;
static JLabel text3;
static JLabel text4;
static JLabel text5;
static JLabel text6;
static JLabel text7;
static JLabel text8;
static JLabel text9;
static JLabel text10;

public static void main(String[] args) throws MalformedURLException

{		
	
String input; 
input=JOptionPane.showInputDialog("Введите значение b:");
int b;
b=Integer.parseInt(input); 	

double a=0.85, c=700, s=a*100*b*c;

okno = new JFrame("panel");

// создаем метку для отображения текста

String vartext="  ";
String vartext1="Хасанов Артем Азатович";
String vartext11=" ";
String vartext2="Вараксин Леонид Дмитриевич";
String vartext21=" ";
String vartext3="Хайруллин Шамиль Динарович";
String vartext31=" ";
String vartext4="Гусейнов Бекболат Эльдарович";
String vartext41=" ";

text = new JLabel(vartext);
text1 = new JLabel(vartext1 + " - "+ vartext11);
text2 = new JLabel(vartext2 + " - "+ vartext21);
text3 = new JLabel(vartext3 + " - "+ vartext31) ;
text4 = new JLabel(vartext4 + " - "+ vartext41);
text5 = new JLabel("Объем параллелепипеда равен" +" "+ a +"*100*"+b+"*"+c+"="+s+" см");
text6= new JLabel ("Ссылка на портал кафедры АСУ: -> http://asu.ugatu.ac.ru/");
text7= new JLabel ("ФГБОУ ВО");
text8= new JLabel ("Уфимский государственный авиационный технический университет");
text9= new JLabel (" ");
text10= new JLabel ("Кнопка Информация добавлена");

// создать панель для добавления кнопок

JPanel p = new JPanel();

// добавить кнопки и текстовое поле на панель

p.add(text);
p.add(text1);
p.add(text2);
p.add(text3);
p.add(text4);
p.add(text6);

JToggleButton msm = new JToggleButton("Сантиметры", false);
// Слушатель события о смене состояния
msm.addItemListener(new ItemListener() {
    public void itemStateChanged(ItemEvent e) {
      if (msm.isSelected())   
      {msm.setText("Метры"); p.remove(text5); p.revalidate(); p.repaint(); text5 = new JLabel("Объем параллелепипеда равен" +" "+ a +"*100*"+b+"*"+c+"="+s/100+" м"); p.add(text5); }  
      else {msm.setText("Сантиметры"); p.remove(text5); p.revalidate(); p.repaint();  text5 = new JLabel("Объем параллелепипеда равен" +" "+ a +"*100*"+b+"*"+c+"="+s+" см"); p.add(text5);  }
       
    }
});


JToggleButton course = new JToggleButton("Кнопка", false);
//Слушатель события о смене состояния
course.addItemListener(new ItemListener() {
 public void itemStateChanged(ItemEvent e) {
   if (course.isSelected())   
   {course.setText("Курсовая"); p.remove(text9); p.revalidate(); p.repaint(); text9 = new JLabel("Информация о курсовой работе (добавлена)"); p.add(text9); }  
   else {msm.setText("Кнопка"); p.remove(text9); p.revalidate(); p.repaint();  text9 = new JLabel(" "); p.add(text9);  }
    
 }
});

JButton informationbutton=new JButton("Информация");


/*String Path = "https://sun1-26.userapi.com/OzHXNg7esGbTvOZqhzHwA4ef_N59ZrVSsM2Fmg/Uov_djgblYo.jpg";
Image img = null;
URL f;
f = new URL(Path);*/
String Path = "src/img.jpg";
Image img = null;
File f;
f = new File(Path);

try {
img = ImageIO.read(f);
} catch(IOException ioe) {
JOptionPane.showConfirmDialog(null, "Что-то неправильно!\n" + ioe.toString(),
"Error!", JOptionPane.PLAIN_MESSAGE);
System.exit(0);
}
Image scaledImg = img.getScaledInstance(400, 240, AffineTransformOp.TYPE_BILINEAR);
JLabel picLabel = new JLabel(new ImageIcon(scaledImg));

JButton button = new JButton("Мнемо");
button.addActionListener(new ButtonAction());

p.add(picLabel);
p.add(text7);
p.add(text8);
p.add(msm);
p.add(course);
p.add(button);
p.add(informationbutton);
p.add(text10);

JFrame win = new JFrame();
win.setSize(new Dimension(100, 50));
win.add(p);
win.setVisible(false);
// setbackground панели

// добавить панель в рамку

okno.add(p);

// установить размер кадра

okno.setSize(440, 500);

okno.show();

}

}
