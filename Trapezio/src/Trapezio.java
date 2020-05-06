/**
 * 
 * @author cristian colona
 *
 */

public class Trapezio {
private float bMax,bMin,h,l1,l2;

/**
 * 
 *
 * @param bmax
 * @param bmin
 * @param altezza
 * @param lato1
 * @param lato2
 */
public Trapezio(float bmax,float bmin,float altezza,float lato1,float lato2){
	bMax=bmax;
	bMin=bmin;
	h=altezza;
	l1=lato1;
	l2=lato2;
}

/**
 * 
 * @return
 */


/**
 * 
 * calcola area
 *  */


public float CalcolaArea() {
	float r=0;
	r=((bMax+bMin)*h)/2;
	return r;
}
	public static void main(String[] args) {
		Trapezio t=new Trapezio(2,2,2,2,2);
		System.out.println(t.CalcolaArea());
	}

}
