import java.util.Scanner;

public class Logicos {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        /* Operadores Lógicos */
        // Operador Logico -> AND (&&)
        int a=5,b=10,c=15;
        /* Operador Logico -> OR (||)
        // si x=true y y=true el resultado es -> TRUE
        // si x=true y y=false el resultado es -> FALSE
        // si x=true y y=true el resultado es -> TRUE
        // si x=false y y=false el resultado es -> FALSE
        */
        System.out.println("** Operador AND **");
        boolean igual = (a<b)&&(c>b);
        System.out.println("- (a<b)&&(c>b) es: "+igual);
        System.out.println();
        //En el resto de supuesto, donde alguna de las partes sea false, el resultado sera false


        /* Operador Logico -> OR (||)
        // si x=true y y=true el resultado es -> TRUE
        // si x=true y y=false el resultado es -> TRUE
        // si x=true y y=true el resultado es -> TRUE
        // si x=false y y=false el resultado es -> FALSE
         */
        System.out.println("** Operador OR **");
        boolean resultado = (a!=b) || (b!=c);
        boolean resultado2 = (a==b)||(b==c);
        System.out.println("- (a<b)||(a>b) es: "+resultado); // TRUE
        System.out.println("- (a<=b)||(a=>b) es: "+resultado2); // FALSE
        System.out.println();
        //En el resto de supuesto, donde alguna de las partes sea true, el resultado sera true

        /* Operador de Negacion -> ! */
        System.out.println("** Operador Negacion **");
        resultado = a<b;
        System.out.println("- (a<b) es: "+resultado);

        resultado = !(a<b);
        System.out.println("- !(a>b) es: "+resultado);




    }
}
