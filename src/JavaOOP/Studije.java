package JavaOOP;

import java.util.ArrayList;

public interface Studije {

    //Napraviti Interfejs Studije koje implementiraju metode:
    //-void dodajStudenta(Departman d, Student s) - Dodaje odgovarajuceg studenta u listu iz
    //Departmana.
    //-void izbaciStudenta(Departman d, Student s) - Izbacuje studenta iz liste za odredjen
    //Departman
    //-Departman najvecaZarada() - Vraca departman koji donosi najvise para fakultetu
    //-List<Student> sviApsolventi() - Vraca listu studenata koji su cetvrta godina

    //Klasa Fakultet implementira interfejs Studije i kao argument ima listu departmana. //35 bod
    //Kreirati za sve klase dodatne get i set metode, kao toString i konstruktore. // 5 bodova

    void dodajStudenta(Departman d, Student s);

    void izbaciStudenta(Departman d, Student s);

    Departman najvecaZarada();

    ArrayList<Student> sviApsolventi();
}
