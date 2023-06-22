package JavaOOP;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        ArrayList<Integer> listaOcena  = new ArrayList<>();
        listaOcena.add(9);
        listaOcena.add(7);
        listaOcena.add(8);
        listaOcena.add(3);
        listaOcena.add(1);
        listaOcena.add(5);
        listaOcena.add(11);
        listaOcena.add(10);

        Student neki = new Student("Marko", listaOcena, 3);
        Student a = new Student("A", listaOcena, 4);
        Student b = new Student("B", listaOcena, 1);
        Student c = new Student("C", listaOcena, 2);

        ArrayList<Student> listaStudenata = new ArrayList<>();
        listaStudenata.add(neki);
        listaStudenata.add(a);
        listaStudenata.add(b);
        listaStudenata.add(c);

        Hemija d1 = new Hemija(listaStudenata, "Hemijski faks");
        System.out.println(d1);







    }
}
