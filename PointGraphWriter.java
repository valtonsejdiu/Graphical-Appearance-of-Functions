//*Klasa PointGraphWriter eshte nje klase ndihmese e cila krijon grafikun per equacionet e y */
import javax.swing.*;
import java.awt.*;
public class PointGraphWriter extends JPanel
{
/**Vlerat e gjeresise dhe gjatesise se Kornizes dhe Panelit*/
   public int width = 300;
   public int height = 200;
/**Pika e nisjes se boshtit Ox ne Panel*/
   public int x_pos;
/**Pika e nisjes se boshtit Oy ne Panel*/
   public int y_pos;
/**Gjatesia e boshteve Ox dhe Oy e shprehur ne piksela*/
   public int axis_length; 
/**Pika maksimale e paraqitur ne boshtin Oy*/
   public String x_label; 
/**Pika maksimale e paraqitur ne boshtin Oy*/
   public String y_label;
/**Hyrja interaktive e vleres se x_1,...,x_6 permes metodes showInputDialog te JOptionPane-s*/
   public String x_1=JOptionPane.showInputDialog("Vendose vleren e x1 siq eshte dhene ne detyre :");
   public String x_2=JOptionPane.showInputDialog("Vendose vleren e x2 siq eshte dhene ne detyre :"); 
   public String x_3=JOptionPane.showInputDialog("Vendose vleren e x3 siq eshte dhene ne detyre :"); 
   public String x_4=JOptionPane.showInputDialog("Vendose vleren e x4 siq eshte dhene ne detyre :"); 
   public String x_5=JOptionPane.showInputDialog("Vendose vleren e x5 siq eshte dhene ne detyre :");
   public String x_6=JOptionPane.showInputDialog("Vendose vleren e x6 siq eshte dhene ne detyre :");
/**Kthimi i vleres x_1,...,x_6 nga tipi String ne tipin Integer*/ 
   public int x1=Integer.parseInt(x_1);
   public int x2=Integer.parseInt(x_2);
   public int x3=Integer.parseInt(x_3);
   public int x4=Integer.parseInt(x_4);
   public int x5=Integer.parseInt(x_5);
   public int x6=Integer.parseInt(x_6);
   public int prop_y1;
   public int prop_y2;
   public int prop_y3;
   public int prop_y4;
   public int prop_y5;
   public int prop_y6; 
   JFrame obj = new JFrame();   
   public PointGraphWriter()
   {  
      obj.getContentPane().add(this);//Vendosja e Panelit ne Kornize
      obj.setSize(width,height);//Caktimi i gjeresise dhe gjatesise se Kornizes
      obj.setVisible(true);//Paraqitja vizuele e Kornizes      
   }
/**Emertimi i titullit te Kornizes nga metoda setTitle, emrin e te cilit e merr si argument te tipit String*/ 
   public void setTitle(String s)
   {
      obj.setTitle(s);
   }
/**Metode e cila cakton pikat startuese te boshteve (Ox dhe Oy), gjatesine e tyre (ne piksela) 
dhe vlerat e fundit e boshteve Ox dhe Oy nga argumentet e poshte shenuara*/ 
   public void setAxes(int x_pos, int y_pos, int axis_length, String x_label, String y_label)
   {
      this.x_pos= x_pos;
      this.y_pos= y_pos;
      this.x_label= x_label;
      this.y_label= y_label;
      this.axis_length=axis_length;
   }   
   public void paintComponent(Graphics g)
   { /**Kthimi i variables x_label nga tipi String ne tipin Integer per llogaritjen e vleres se x ne proporcion me gjatesine e boshtit Ox*/
      int x_range = Integer.parseInt(x_label);
     /**Instruksioni per kthimin e vleres se variablave x1,...,x6 ne proporcion me gjatsine e boshtit Ox te shprehur ne piksela*/     
      int prop_x1 = ((x1*axis_length)/x_range)+x_pos;
      int prop_x2 = ((x2*axis_length)/x_range)+x_pos; 
      int prop_x3 = ((x3*axis_length)/x_range)+x_pos;
      int prop_x4 = ((x4*axis_length)/x_range)+x_pos;
      int prop_x5 = ((x5*axis_length)/x_range)+x_pos;
      int prop_x6 = ((x6*axis_length)/x_range)+x_pos;
      g.setColor(Color.white);//Ngjyra e panelit
      g.fillRect(0,0,width,height);
      g.setColor(Color.black);//Ngjyra e penes g qe do te paraqes ne vazhdim boshtet , pikat, dhe drjetzat me te cilat jane te lidhura pikat
     /**Paraqitja e boshtit Ox dhe Oy , me gjatesi prej axis_length*/
      g.drawLine(x_pos+2, y_pos, x_pos+axis_length, y_pos);
      g.drawLine(x_pos, y_pos, x_pos, y_pos-axis_length);
     /**Paraqitja e pikes maksimale te boshtit Ox(x_label) dhe boshtit Oy(y_label)*/
      g.drawString(x_label, x_pos+axis_length, y_pos+20);
      g.drawString(y_label, x_pos-20, y_pos-axis_length);
      g.drawString("0", x_pos+5,y_pos+20);
      g.drawString("0", x_pos-15,y_pos-5);
     /**Instruksioni per paraqitjen grafike te pikave ne panel*/
      g.fillOval(prop_x1,prop_y1-3,4,4);
      g.fillOval(prop_x2,prop_y2-3,4,4);
      g.fillOval(prop_x3,prop_y3-3,4,4);
      g.fillOval(prop_x4,prop_y4-3,4,4);
      g.fillOval(prop_x5,prop_y5-3,4,4);
      g.fillOval(prop_x6,prop_y6-3,4,4);
     /**Instruksioni per paraqitjen e drejtezave te cilat lidhin pikat x1,x2,...,x5*/
      g.drawLine(prop_x1, prop_y1, prop_x2 ,prop_y2);
      g.drawLine(prop_x2, prop_y2, prop_x3, prop_y3);
      g.drawLine(prop_x3, prop_y3, prop_x4, prop_y4);
      g.drawLine(prop_x4, prop_y4, prop_x5, prop_y5);
      g.drawLine(prop_x5, prop_y5, prop_x6, prop_y6);
   }
/**Metodat setPoint1,setPoint2,...,setPoint6 jane metoda te cilat i caktojn pikat 1,...,6 ne Grafikun e ekuacionit y
 me lartesin(height) te cilen e marrin si argument te tipit Integer*/
   public void setPoint1(int height)
   {  /*Kthimi i variables y_label nga tipi String ne tipin Integer per llogaritjen e vleres se y ne proporcion me gjatesine e boshtit Oy*/
      int y_range = Integer.parseInt(y_label);
      /*Instruksioni per kthimin e vleres se argumentit height ne proporcion me gjatsine e boshtit Oy te shprehur ne piksela*/
      prop_y1=y_pos-(height*axis_length)/y_range;     
   }
   public void setPoint2(int height)
   {
      int y_range = Integer.parseInt(y_label);
      prop_y2=y_pos-(height*axis_length)/y_range;
   }
   public void setPoint3(int height)
   {
      int y_range = Integer.parseInt(y_label);
      prop_y3=y_pos-(height*axis_length)/y_range;
   }
   public void setPoint4(int height)
   {
      int y_range = Integer.parseInt(y_label);
      prop_y4=y_pos-(height*axis_length)/y_range;
   }
   public void setPoint5(int height)
   {
      int y_range = Integer.parseInt(y_label);
      prop_y5=y_pos-(height*axis_length)/y_range;
   }
   public void setPoint6(int height)
   {
      int y_range = Integer.parseInt(y_label);
      prop_y6=y_pos-(height*axis_length)/y_range;
   }
      
}