package JavaOOP;

import java.util.ArrayList;

public class Student {

    //Kreirati Klasu Student koja ima sledece parametre:
    //-(String) Ime
    //-(List<Integer>) Listu ocena
    //-(int) Trenutnu godinu studiranja
    //
    //Takodje poseduje metodu prosek() koja vraca prosek svih njegovih ocena;

    private String ime;
    private ArrayList<Integer> listaOcena;
    private int trenutnaGodinaStudiranja;



    private ArrayList<Integer> setujListuOcena(ArrayList<Integer> listaOcena){
        ArrayList<Integer> konacnaLista = new ArrayList<>();

        for (int i = 0; i < listaOcena.size(); i++) {
            if (listaOcena.get(i) <= 10 && listaOcena.get(i) >= 6) {
                konacnaLista.add(listaOcena.get(i));
            }
        }
        setListaOcena(konacnaLista);
        return konacnaLista;
    }

    public Student(String ime, ArrayList<Integer> listaOcena, int trenutnaGodinaStudiranja) {
        this.ime = ime;
        this.listaOcena = setujListuOcena(listaOcena);
        this.trenutnaGodinaStudiranja = trenutnaGodinaStudiranja;
    }


    public Student() {
        this.ime = "";
        this.listaOcena = new ArrayList<>();
        this.trenutnaGodinaStudiranja = 0;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public ArrayList<Integer> getListaOcena() {
        return listaOcena;
    }

    public void setListaOcena(ArrayList<Integer> listaOcena) {
        this.listaOcena = listaOcena;
    }

    public int getTrenutnaGodinaStudiranja() {
        return trenutnaGodinaStudiranja;
    }

    public void setTrenutnaGodinaStudiranja(int trenutnaGodinaStudiranja) {
        this.trenutnaGodinaStudiranja = trenutnaGodinaStudiranja;
    }

    public double prosek() {
        double suma = 0;
        for (int i = 0; i < this.listaOcena.size(); i++) {
            suma += listaOcena.get(i);
        }

        suma = suma / listaOcena.size();
        return suma;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Student: ").append(ime).append("\n");
        sb.append("Trenutna godina studiranja: ").append(trenutnaGodinaStudiranja).append("\n");
        sb.append("Lista ocena: ").append("\n");
        for (int i = 0; i < listaOcena.size(); i++) {
            sb.append(listaOcena.get(i) + " ");
        }
        sb.append("Prosek: ").append(prosek()).append("\n");
        return sb.toString();
    }
}
