/*
Shantanu Jha, Sachal Malick
e^(Pi*i)
APCS1 pd5
HW32-Irrationality Stops Here
2015-11-17
*/
public class Rational {
private double numerator, denominator;
//Default is rational number 0/1
public Rational(){
this(0,1);
}
//Creates Rational object with numerator a and denominator b
public Rational(double a, double b){
numerator = a;
if(b == 0) b = 1;
denominator = b;
}

public String toString(){
return "" + numerator + "/" + denominator;
}

public double floatValue(){
if(denominator == 0) return 0;
return numerator/denominator;
}

public void  multiply(Rational foo){
numerator *= foo.numerator;
denominator *= foo.denominator;
}

public void divide(Rational foo){
if(foo.numerator == 0) {
System.out.println("Divide by zero error!");
}
else{ 
numerator *= foo.denominator;
denominator *= foo.numerator;
}}


public static void main(String [] args){
System.out.println("\tTest Cases");
Rational r = new Rational(2,3);
Rational s = new Rational(1,2);
Rational t = new Rational();
System.out.println("Rational Number r: " + r);
System.out.println("Rational Number s: " + s);
System.out.println("Rational Number t: " + t);
r.divide(s);
System.out.println("r/s = " + r + " ~= " + r.floatValue());
System.out.println("Rational Number r: " + r);
System.out.println("Rational Number s: " + s);
System.out.println("Rational Number t: " + t);
System.out.print("s/t = ");
s.divide(t);
s.multiply(t);
System.out.println("s/t = " + s + " ~= " + s.floatValue());   
}
} 
