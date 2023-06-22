package JavaOOP;

import java.util.ArrayList;

public class Fakultet implements Studije {

    //Klasa Fakultet implementira interfejs Studije i kao argument ima listu departmana.


    private ArrayList<Departman> listaDepartmana;

    public Fakultet(ArrayList<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }

    public Fakultet() {
        this.listaDepartmana = new ArrayList<>();
    }

    public ArrayList<Departman> getListaDepartmana() {
        return listaDepartmana;
    }

    public void setListaDepartmana(ArrayList<Departman> listaDepartmana) {
        this.listaDepartmana = listaDepartmana;
    }



    //-void dodajStudenta(Departman d, Student s) - Dodaje odgovarajuceg studenta u listu iz
    //Departmana.

    @Override
    public void dodajStudenta(Departman d, Student s) {
        d.getListaStudenata().add(s);

    }

    //-void izbaciStudenta(Departman d, Student s) - Izbacuje studenta iz liste za odredjen
    //Departman

    @Override
    public void izbaciStudenta(Departman d, Student s) {
        d.getListaStudenata().remove(s);

        }

    //-Departman najvecaZarada() - Vraca departman koji donosi najvise para fakultetu

    @Override
    public Departman najvecaZarada() {
        double najvecaZarada = listaDepartmana.get(0).finansije();
        Departman saNajvecomZaradom = listaDepartmana.get(0);

        for (int i = 0; i < listaDepartmana.size(); i++) {
            Departman trenutni = listaDepartmana.get(i);
            if (trenutni.finansije() > najvecaZarada) {
                najvecaZarada = trenutni.finansije();
                saNajvecomZaradom = trenutni;
            }

        }
        return saNajvecomZaradom;
    }


    //-List<Student> sviApsolventi() - Vraca listu studenata koji su cetvrta godina

    @Override
    public ArrayList<Student> sviApsolventi() {
        ArrayList<Student> apsolventi = new ArrayList<>();
        int trenutnaGodinaStudiranja = listaDepartmana.get(0).getListaStudenata().get(0).getTrenutnaGodinaStudiranja();
        for (int i = 0; i < getListaDepartmana().size() ; i++) {
            if (trenutnaGodinaStudiranja == 4)
                apsolventi.add(listaDepartmana.get(i).getListaStudenata().get(i));
        }

        return apsolventi;
    }




}
