package lab3;

public class Complex {
    //A Complex object should be immutable once created

    private final double img; //private final para n se poder mudar 
    private final double real; 


    //constructor to initialize the complex number
    public Complex(double r, double i){
	    this.real = r;
	    this.img = i;
    }

    public static Complex add(Complex n1, Complex n2){
        //ao chamar o add 
        double real_temp;
        double img_temp;
        //(a+bi) + (c+di) = (a+c) + (b+d)i
        real_temp = n1.real + n2.real;
        img_temp = n1.img + n2.img;

        Complex temp = new Complex(real_temp, img_temp);

        return(temp);
        
    }
    
    public static Complex subtract(Complex n1, Complex n2){
        //(a+bi) - (c+di) = (a-c) + (b-d)i
        double real_temp;
        double img_temp;
        real_temp = n1.real - n2.real;
        img_temp = n1.img - n2.img;

        Complex temp = new Complex(real_temp, img_temp);

        return(temp);

    }
    
    public static Complex multiply(Complex n1, Complex n2){
        //(a+bi) (c+di) = (ac-bd) + (bc+ad)i
        double real_temp;
        double img_temp;
        real_temp = (n1.real*n2.real-n1.img*n2.img);
        img_temp = (n1.img*n2.real+n1.real*n2.img);

        return new Complex(real_temp, img_temp);
    }
    
    public String toString(){
        String i = Double.toString(this.img);
        String r = Double.toString(this.real);
        return r+'+'+i+'i';
    }
}
