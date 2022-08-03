import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Realty> realty = new ArrayList<>();
        realty.add(new Realty(0, "12:54:456789:654", 49.3, 21,8, 1997));
        realty.add(new Realty(1, "13:94:495245:776", 29.9, 23, 5, 2005));

        for (Realty r : realty) {
            System.out.println("---------------------------------------------------");
            System.out.println("Вид: " + r.getView());
            System.out.println("Кадастровый номер: " + r.getCadastral_number());
            System.out.println("Площадь: " + r.getSquare());
            System.out.println("Дата регистрации: " + r.getDay() + " " + r.getMonth() + " " + r.getYear());
            System.out.println("---------------------------------------------------");


        }
    }
}
