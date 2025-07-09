public class Main {
    public static void main(String[] args) {

        Personal emp1=new Personal("Pedro", "Lopez",4,"003");
        System.out.println(emp1.toString());

        Personal emp2=new Personal("Marta", "Gutierrez",2,"002");
        System.out.println(emp2.toString());

        Nomina n=new Nomina(190, 9.76,emp1);
        n.mostrarNomina();
    }





}