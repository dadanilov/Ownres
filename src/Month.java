public enum Month {
    January("Январь"), February("Февраль"), March("Март"), April("Апрель"), May("Май"), June("Июнь"), July("Июль"), August("Авгест"), September("Сентябрь"), October("Октябрь"), November("Ноябрь"), December("Декабрь");

    private String value;
    private Month(String brand) {
        this.value = brand;
    }

    @Override
    public String toString() {
        return value;
    }
}
