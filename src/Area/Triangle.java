package Area;

public class Triangle extends Rectangle {
double a;

public Triangle(int i, int j) {
	super(i, j);
	// TODO Auto-generated constructor stub
}
public double gettriangle(){
	a = (i*j)/2;
	return a;
}
}
