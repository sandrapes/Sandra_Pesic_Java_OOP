package JavaOOP;

import java.util.ArrayList;

public class Biologija extends Departman {

    public Biologija(ArrayList<Student> listaStudenata, String naziv) {
        super(listaStudenata, naziv);
    }

    public Biologija() {
    }


    //double finansije() - Ova metoda je abstraktna. Vraca ukupan broj zarade od fakulteta, ako
    //racunamo da na svakom Departmanu 50% mesta su budzetska(besplatna), osim na
    //Departmanu za Biologije gde nema ni jedno budzetsko mesto.

    //Skolarina po Studentu za Biologiju-3000, za Hemiju-4000 a Informatika-5000

    @Override
    public double finansije() {
        return 3000 * getListaStudenata().size();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Zarada fakulteta je: ").append(finansije());
        return sb.toString();
    }


}
