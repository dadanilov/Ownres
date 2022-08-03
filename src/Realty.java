import java.lang.String;

public class Realty extends Data {
    private View view;
    private String cadastral_number;
    private double square;
    private Data data;

    public Realty(int i, String cadastral_number, double square, int day, int m, int year) {
        super(day, m, year);
        setRealty(i, cadastral_number, square);
    }

    public void setView(View view) {
        this.view = view;
    }

    public void setCadastral_number(String cadastral_number) {
        this.cadastral_number = cadastral_number;
    }

    public void setSquare(double square) {
        this.square = square;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setRealty(int i, String cadastral_number, double square) {
        if (i < 3) {
            this.view = View.values()[i];
        } else {
            this.view = View.home;
        }
        if (isCN(cadastral_number)) {
            this.cadastral_number = cadastral_number;
        } else {
            this.cadastral_number = "00:00:000000:000";
        }
        if ((square >= 1.0) && (square <= 1000.0)) {
            this.square = square;
        } else {
            this.square = 1.0;
        }
    }

    public View getView() {
        return view;
    }

    public String getCadastral_number() {
        return cadastral_number;
    }

    public double getSquare() {
        return square;
    }

    public boolean isCN(String CN)
    {
        int check = 0;
        String min = "01:11:010001:000", max = "99:99:999999:999";
        if ((CN.compareTo(min) > 0) && (CN.compareTo(max) < 0)) {
            if (CN.charAt(2) == ':' && CN.charAt(5) == ':' && CN.charAt(12) == ':') {
                for (int i = 0; i < CN.length(); i++) {
                    if ((Character.isDigit(CN.charAt(i))) && ((i != 2) || (i != 5) || (i != 12))) {
                        check++;
                    }
                }
            }
        }
        if (check == 13) {
            return true;
        } else {
            return false;
        }
    }
}
