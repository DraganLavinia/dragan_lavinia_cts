import Builder.Phone;
import Builder.PhoneBuilder;
import Prototype.SistemOperare;
import Singletons.ConexiuneGSMLazy;
import Singletons.ConexiuneGSMRegistry;
import Singletons.IGSMInterface;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //singleton lazy
        IGSMInterface igsmInterface = null;

        for(int i =0; i<=6;i++){
            igsmInterface = ConexiuneGSMLazy.getInstance();
        }
        System.out.printf("------------------------------------------------------\n");

        //builder
        Phone phone = new PhoneBuilder("samsung","version1").build();
        System.out.println(phone);
        Phone phone2 = new PhoneBuilder("samsung","version1")
                .addAntena()
                .addBattery().build();
        System.out.println(phone2);
        System.out.printf("------------------------------------------------------\n");

        //singleton registry
        ConexiuneGSMRegistry instanta1 = ConexiuneGSMRegistry.getinstance("URGENTE");
        ConexiuneGSMRegistry instanta2 = ConexiuneGSMRegistry.getinstance("PRIORITARE");
        System.out.printf("------------------------------------------------------\n");

        //prototype
        SistemOperare so1 = new SistemOperare("Sistem operare 1", " Versiunea7");
        SistemOperare so2 = so1.clone();

         so1.print();
         so2.print();
    }
}