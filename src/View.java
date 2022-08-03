public enum View {
    home("дом"), apartment("квартира"), room("комната");

    private String value;
    private View(String brand) {
        this.value = brand;
    }

    @Override
    public String toString() {
        return value;
    }
}


