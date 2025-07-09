import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        mostrarMenu();

    }

    public static void mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        double pesoPrecio = 0;
        double referenciaBajo=0,referenciaMedio=0,referenciaAlto=0;
        String tipoCoccion="";
        String tipoCarne="";
        double cantidadCarne=0;
        do {
            System.out.println("**** Menu ****");
            System.out.println("**** 1. Carne Vacuno ****");
            System.out.println("**** 2. Carne Cordero ****");
            System.out.println("**** 3. Salir ****");
            System.out.println("Seleccione tipo de carne → ");
            tipoCarne=sc.next();
            switch (tipoCarne) {
                case "vacuno": {
                    System.out.println("**** Carne Vacuno ***");
                    System.out.println("Introduzca una cantidad (Gramos) →");
                    cantidadCarne = sc.nextInt();

                    if (cantidadCarne > 0 && cantidadCarne < 400) {
                        System.out.println("Introduzca el punto de la carne (poco hecho / al punto/muy hecho)");
                        tipoCoccion = sc.next();
                        switch (tipoCoccion) {
                            case "poco hecho": {
                                referenciaBajo = 400 / 15;
                                System.out.println("Tiempo de cocción: " + referenciaBajo + " minutos");
                                System.out.println("Tiempo de cocción (segundos): " + (referenciaBajo * 60) + " segundos");
                                break;
                            }
                            case "punto medio": {
                                referenciaMedio = 400 / 25;
                                System.out.println("Tiempo de cocción: " + referenciaMedio + " minutos");
                                System.out.println("Tiempo de cocción (segundos): " + (referenciaMedio * 60) + " segundos");
                                break;
                            }
                            case "muy hecho": {
                                referenciaAlto = 400 / 40;
                                System.out.println("Tiempo de cocción: " + referenciaAlto + " minutos");
                                System.out.println("Tiempo de cocción (segundos): " + (referenciaAlto * 60) + " segundos");
                                break;
                            }
                        }
                    } else{
                        System.out.println("Introduzca el punto de la carne (poco hecho / al punto/muy hecho)");
                        tipoCoccion = sc.next();
                        switch (tipoCoccion) {
                            case "bajo": {
                                referenciaBajo = 500 / 15;
                                System.out.println("Tiempo de cocción: " + referenciaBajo + " minutos");
                                System.out.println("Tiempo de cocción (segundos): " + (referenciaBajo * 60) + " segundos");
                                break;
                            }
                            case "medio": {
                                referenciaMedio = 500 / 25;
                                System.out.println("Tiempo de cocción: " + referenciaMedio + " minutos");
                                System.out.println("Tiempo de cocción (segundos): " + (referenciaMedio * 60) + " segundos");
                                break;
                            }
                            case "alto": {
                                referenciaAlto = 500 / 40;
                                System.out.println("Tiempo de cocción: " + referenciaAlto + " minutos");
                                System.out.println("Tiempo de cocción (segundos): " + (referenciaAlto * 60) + " segundos");
                                break;
                            }
                        }
                    }
                }
                case "cordero":{
                    System.out.println("**** Carne Cordero ***");
                    System.out.println("Introduzca una cantidad (Gramos) →");
                    cantidadCarne = sc.nextInt();
                    if (cantidadCarne >= 1 && cantidadCarne <= 500) {
                        System.out.println("Introduzca el punto de la carne (poco hecho / al punto/muy hecho)");
                        tipoCoccion = sc.next();
                        switch (tipoCoccion) {
                            case "bajo": {
                                referenciaBajo = 500 / 10;
                                System.out.println("Tiempo de cocción baja: " + referenciaBajo + " minutos");
                                System.out.println("Tiempo de cocción (segundos): " + (referenciaBajo * 60) + " segundos");
                                break;
                            }
                            case "medio": {
                                referenciaMedio = 500 / 17;
                                System.out.println("Tiempo de cocción media: " + referenciaMedio + " minutos");
                                System.out.println("Tiempo de cocción (segundos): " + (referenciaMedio * 60) + " segundos");
                                break;
                            }
                            case "alto": {
                                referenciaAlto = 500 / 25;
                                System.out.println("Tiempo de cocción alta: " + referenciaAlto + " minutos");
                                System.out.println("Tiempo de cocción (segundos): " + (referenciaAlto * 60) + " segundos");
                                break;
                            }
                            default:
                                System.out.println("Opcion no válida");
                                break;
                        }
                    } else {
                        System.out.println("Introduzca el punto de la carne (poco hecho / al punto/muy hecho)");
                        tipoCoccion = sc.next();
                        switch (tipoCoccion) {
                            case "bajo": {
                                referenciaBajo = (500 / 10)*cantidadCarne;
                                System.out.println("Tiempo de cocción: " + referenciaBajo + " minutos");
                                System.out.println("Tiempo de cocción (segundos): " + (referenciaBajo * 60) + " segundos");
                                break;
                            }
                            case "medio": {
                                referenciaMedio = (500 / 17)*cantidadCarne;
                                System.out.println("Tiempo de cocción: " + referenciaMedio + " minutos");
                                System.out.println("Tiempo de cocción (segundos): " + (referenciaMedio * 60) + " segundos");
                                break;
                            }
                            case "alto": {
                                referenciaAlto = (500 / 25)*cantidadCarne;
                                System.out.println("Tiempo de cocción: " + referenciaAlto + " minutos");
                                System.out.println("Tiempo de cocción (segundos): " + (referenciaAlto * 60) + " segundos");
                                break;
                            }
                        }
                    }
                }
            }
        }while (!tipoCarne.equals("salir"));
    }

}