import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Parqueadero pp = new Parqueadero();

        System.out.println("Ingrese opcion");
        int op = Integer.parseInt(sc.next());
        do{
            System.out.println("1");
            System.out.println("2");
            System.out.println("3");
            System.out.println("4");
            System.out.println("5");
            System.out.println("6");
            System.out.println("7");
            System.out.println("8");
            System.out.println("9");
            System.out.println("10");
            System.out.println("11");
            System.out.println("12");
            System.out.println("13");
            System.out.println("14");
            System.out.println("15");

            switch (op){
                case 1:
                    System.out.println("Ingrese la placa: ");
                    String pPLaca = sc.next();
                    pp.sacarCarro(pPLaca);
                    break;
                case 2:
                    System.out.println("Ingrese la placa del vehiculo que desea sacar");
                    pPLaca = sc.next();
                    pp.sacarCarro(pPLaca);
                    break;
                case 3:
                    System.out.println(""+pp.darMontoCaja());
                    break;
                case 4:
                    System.out.println(""+pp.calcularPuestosLibres());
                    break;
                case 5:
                    pp.avanzarHora();
                    break;
                case 6:
                    System.out.println("nueva tarifa");
                    int ptarifa = Integer.parseInt(sc.next());
                    pp.cambiarTarifa(ptarifa);
                    break;
                case 7:
                    System.out.println(""+pp.darTiempoPromedio());
                    break;
                case 8:
                    System.out.println(""+pp.hayCarroMasDeOchoHoras());
                    break;
                case 9:
                    System.out.println(""+pp.hay1CarroMasDeOchoHoras());
                    break;
                case 10:
                    for (int i = 0; i < pp.darCarros3Horas().size(); i++){
                        System.out.println(pp.darCarros3Horas().get(i).darPlaca());

                    }
                    break;
                case 11:
                    System.out.println(""+pp.hayCarrosPlacaIgual());
                    break;
                case 12:
                    System.out.println(pp.metodo1());
                    break;
                case 13:
                    System.out.println(pp.metodo2());
                    break;
                case 14:
                    pp.vaciarParqueadero();
                    break;
                default:
                    System.out.println("Opcion incorrecta");

            }

        }while(op!=17);
    }
}