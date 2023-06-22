package JavaOOP;

import java.util.ArrayList;

public abstract class Departman {

    //Napraviti abstraktnu klasu Departman koja ima sledece atribute:
    //-(List<Student>) Listu studenata
    //-(String) naziv
    //Kreirati metode:
    //List<Student> vredni(int prosek) - Metoda koja vraca listu Studenata koji imaju veci prosek
    //od prosledjenog.
    //double prosekSvih() - Metoda koja vraca prosek svih Studenata sa Departmana.
    //double finansije() - Ova metoda je abstraktna. Vraca ukupan broj zarade od fakulteta, ako
    //racunamo da na svakom Departmanu 50% mesta su budzetska(besplatna), osim na
    //Departmanu za Biologije gde nema ni jedno budzetsko mesto.

    private ArrayList<Student> listaStudenata;
    private String naziv;

    public Departman(ArrayList<Student> listaStudenata, String naziv) {
        this.listaStudenata = listaStudenata;
        this.naziv = naziv;
    }

    public Departman() {
        this.listaStudenata = new ArrayList<>();
        this.naziv = "";
    }

    public ArrayList<Student> getListaStudenata() {
        return listaStudenata;
    }

    public void setListaStudenata(ArrayList<Student> listaStudenata) {
        this.listaStudenata = listaStudenata;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Student> vredni(double prosek) {

        ArrayList<Student> konacnaLista = new ArrayList<>();

        for (int i = 0; i < listaStudenata.size(); i++) {
            if (listaStudenata.get(i).prosek() > prosek) {
                konacnaLista.add(listaStudenata.get(i));
            }
        }
        return konacnaLista;
    }

    //double prosekSvih()

    public double prosekSvih() {
        double prosekSvih = 0;
        for (int i = 0; i < listaStudenata.size(); i++) {
            prosekSvih += listaStudenata.get(i).prosek();
        }

        return prosekSvih / listaStudenata.size();

    }

    //double finansije() - Ova metoda je abstraktna. Vraca ukupan broj zarade od fakulteta, ako
    //racunamo da na svakom Departmanu 50% mesta su budzetska(besplatna), osim na
    //Departmanu za Biologije gde nema ni jedno budzetsko mesto.

    public abstract double finansije();

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naziv: ").append(naziv).append("\n");
        sb.append("Lista studenata: ").append("\n");
        for (int i = 0; i < listaStudenata.size(); i++) {
            sb.append(listaStudenata.get(i)).append(" ");
        }
        sb.append("Prosek svih Studenata: ").append(prosekSvih());
            return sb.toString();
    }
}

