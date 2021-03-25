
public class Principal {

    public static void main(String[] args) {

        Fecha p = new Fecha();

        p.setDia(20);
        p.setMes(11);
        p.setYear(2021);

        System.out.println("Dia: " + p.getDia() + "\nMes: " + p.getMes() + "\nAño: " + p.getYear());
    }

}
