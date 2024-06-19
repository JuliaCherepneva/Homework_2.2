public class hogwarts {
    private String name;
    private int magicPower, transDistance;

    // конструктор
    public hogwarts(String name, int magicPower, int transDistance) {
        this.name = name;
        this.magicPower = magicPower;
        this.transDistance = transDistance;
    }
    // геттеры и сеттеры
    public int getMagicPower() {
        return magicPower;
    }
    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }
    public int getTransDistance() {
        return transDistance;
    }
    public void setTransDistance(int transDistance) {
        this.transDistance = transDistance;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "hogwarts{" +
                "name='" + name + '\'' +
                ", magicPower=" + magicPower +
                ", transDistance=" + transDistance +
                '}';
    }
}
