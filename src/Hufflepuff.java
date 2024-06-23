public class Hufflepuff extends Hogwarts {
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

    public static void compareStudents (Hufflepuff[] hufflepuff) {
        int sum1 = hufflepuff[0].getHardWork() + hufflepuff[0].getLoyalty() + hufflepuff[0].getHonesty();
        int sum2 = hufflepuff[1].getHardWork() + hufflepuff[1].getLoyalty() + hufflepuff[1].getHonesty();
        if (sum1 > sum2) {
            System.out.println(hufflepuff[0].getName() + "(" + sum1 + ")" + " круче, чем " + hufflepuff[1].getName() + "(" + sum2 + ").");
        } else if (sum1 == sum2) {
            System.out.println(hufflepuff[0].getName() + "(" + sum1 + ")" + " также крут, как и " + hufflepuff[1].getName() + "(" + sum2 + ")");
        } else {
            System.out.println(hufflepuff[1].getName() + "(" + sum2 + ")" + " круче, чем " + hufflepuff[0].getName() + "(" + sum1 + ")");
        }

    }
}

