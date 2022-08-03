public class Data {
    private int day;
    private Month month;
    private int year;

    public Data(int day, int m, int year) {
        setData(day, m, year);
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(Month month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setData(int day, int m, int year) {
        if (isDate(day, m, year))
        {
            this.day = day;
            this.month = Month.values()[m];
            this.year = year;
        }
        else
        {
            this.day = 1;
            this.month = Month.January;
            this.year = 2000;
        }
    }

    public int getDay() {
        return day;
    }

    public Month getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public boolean isDate(int day, int m, int year)
    {
        if ((day < 1) || (day > 31))
            return false;
        if ((m < 1) || (m > 12))
            return false;
        if ((year < 1980) || (year > 2021))
            return false;
        switch (m)
        {
            case 2:
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0))
                {
                    if (day < 30)
                        return true;
                    return false;
                }
                else
                if (day < 29)
                    return true;
                return false;
            case 4:
            case 6:
            case 9:
            case 11:
                if (day < 31)
                    return true;
                return false;
            default:
                return true;
        }
    }
}
