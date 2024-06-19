public class Hufflepuff extends hogwarts {
    private int hardWork, loyalty, honesty;

    // конструктор
    public Hufflepuff(String name, int magicPower, int transDistance, int hardWork, int loyalty, int honesty) {
        super(name ,magicPower, transDistance);
        this.hardWork = hardWork;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }
    // геттеры и сеттеры
    public int getHardWork() {
        return hardWork;
    }
    public void setHardWork(int hardWork) {
        this.hardWork = hardWork;
    }
    public int getLoyalty() {
        return loyalty;
    }
    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }
    public int getHonesty() {
        return honesty;
    }
    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }

    @Override
    public String toString() {
        return "Факультет 'Пуффендуй'. Имя студента: " + getName() + ". Сила магии: " + getMagicPower() + ". Расстоянии трансгрессии: " + getTransDistance() + ". Трудолюбие: "
                + hardWork + ". Верность: " + loyalty + ". Честность: " + honesty + ".";

    }
}
