package JavaOOP;

import java.util.ArrayList;

public class Informatika extends Departman {

    //Skolarina po Studentu za Biologiju-3000, za Hemiju-4000 a Informatika-5000 //65 bodova


    public Informatika(ArrayList<Student> listaStudenata, String naziv) {
        super(listaStudenata, naziv);
    }


    public Informatika() {
    }

    @Override
    public double finansije() {

        int brojStudenata = getListaStudenata().size() / 2;

        if (getListaStudenata().size() % 2 == 0) {
            return 5000 * brojStudenata;
        }

        else
            return 5000 * ( brojStudenata - 1); // za slucaj da je broj studenata neparan,
        //stavila sam da je broj studenata na budzetu za 1 manje

    }

    //double finansije() - Ova metoda je abstraktna. Vraca ukupan broj zarade od fakulteta, ako
    //racunamo da na svakom Departmanu 50% mesta su budzetska(besplatna), osim na
    //Departmanu za Biologije gde nema ni jedno budzetsko mesto.

    //Skolarina po Studentu za Biologiju-3000, za Hemiju-4000 a Informatika-5000

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString()).append("\n");
        sb.append("Zarada fakulteta je: ").append(finansije());
        return sb.toString();
    }
}
