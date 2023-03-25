package Metoda_Trapezow;

import java.util.Scanner;

public class Trapezy {

    public float F(float x, float am, float bm){
        float fun;
        fun = am/bm;
        return fun;
    }
    public float f1(float x){
        float an = 1;
        return an;
    }
    public float f2(float x){
        float bn = (float)(Math.sqrt(1-x*x));
        return bn;
    }

    public static void main(String[] args) {
        Trapezy t = new Trapezy();
        int n;
        float a,b,h;
        float calka = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj przedział od: (a)");
        a = sc.nextFloat();
        System.out.println("do: (b)");
        b = sc.nextFloat();
        System.out.println("Podaj wartosc n(na ile części dzielimy przedział):");
        n = sc.nextInt();

        h = (b-a)/n;

//        float fxi[]= new float[n+1];
//        for(int i=0;i<=n+1;i++){
//            System.out.println("Podaj wartosc f(x"+ "i) " +":");
//            n = sc.nextInt();
//        }

        float xi[]= new float[n+1]; //wartości funkcji punktów w przedziale(skoro n przedziałów to n+1 punktów xi)
        xi[0] = a; //pierwszy równy a
        xi[n] = b; //ostatni równy b

        calka = calka+t.F(xi[0],t.f1(xi[0]),t.f2(xi[0]))/2;
        calka = calka+t.F(xi[n],t.f1(xi[n]),t.f2(xi[n]))/2;

        for(int i=1;i<n;i++){
            xi[i] = xi[i-1]+h;
        }
        for(int i=1;i<n;i++){
            calka = calka+t.F(xi[i],t.f1(xi[i]),t.f2(xi[i]));
        }
        calka = h*calka;
        System.out.println("Calka: "+calka);
    }
}
