//*Programi i cili e shfaq ne nje dritare Grafikun e funksionit " y = x * x " per vlerat e x prej 0 deri ne 5*/
public class PunimiSeminarik1_1
{
public static void main (String [] args)
{
PointGraphWriter e = new PointGraphWriter();
e.setTitle("Graph of y = x*x");//Emertimi i Titullit te dritares nga metoda setTitle e klases PointGraphWriter (e).
e.setAxes(50, 110, 90, "5", "30");//Vendosja e argumenteve te cilat kerkohen nga metoda setAxes e klases PointGraphWriter (e).
// boshtet fillojne ne poziten 50,110 dhe boshtet e kane gjatesine prej 90 piksel
// boshti-x eshte i shenuar prej 0 deri 5
// boshti-y eshte i shenuar prej 0 deri 30
int scale_factor =3;
e.setPoint1(0 * scale_factor); //Per vlerat e x=0 -> 0*0 = 0
e.setPoint2(1 * scale_factor); //Per vlerat e x=1 -> 1*1 = 1
e.setPoint3(4 * scale_factor); //Per vlerat e x=2 -> 2*2 = 4
e.setPoint4(9 * scale_factor); //Per vlerat e x=3 -> 3*3 = 9
e.setPoint5(16 * scale_factor);//Per vlerat e x=4 -> 4*4 = 16
e.setPoint6(25 * scale_factor);//Per vlerat e x=5 -> 5*5 = 25
}
}