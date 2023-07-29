import java.util.*;

public class OOPSAssignment{
    public static void main(String[] args) {
        Complex c1 = new Complex();
        c1.setReal();
        c1.setComplex();
        Complex c2 = new Complex();
        c2.setReal();
        c2.setComplex();
        c1.sum(c2);
        c1.difference(c2);
        c1.product(c2);
    }
}

 class Complex{
        int real;
        int complex;
        Scanner sc = new Scanner(System.in);
        public void setReal() {
            System.out.println("Enter real part");
            this.real = sc.nextInt();
        }

        public void setComplex() {
            System.out.println("Enter imaginary part");
            this.complex = sc.nextInt();
        }

        public void sum(Complex d){
            int rsum=this.real + d.real;
            int csum=this.complex + d.complex;
            System.out.println(rsum + " + "+ csum+"i");
        }

        public void difference(Complex d){
            int rdif=this.real - d.real;
            int cdif = this.complex - d.complex;
            System.out.println(rdif + " + "+ cdif+"i");
        }

        public void product(Complex d){
            int rpro = this.real * d.real;
            int cpro = this.complex * d.complex;
            System.out.println(rpro + " + "+ cpro+"i");
        }
    }