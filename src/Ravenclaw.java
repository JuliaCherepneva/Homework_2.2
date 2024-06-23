public class Ravenclaw extends Hogwarts {
    private int intellect, wisdom, wittiness, creativity;
    // конструтор
    public Ravenclaw(String name, int magicPower, int transDistance, int intellect, int wisdom, int wittiness, int creativity) {
        super(name, magicPower, transDistance);
        this.intellect = intellect;
        this.wisdom = wisdom;
        this.wittiness = wittiness;
        this.creativity = creativity;
    }
    // геттеры и сеттеры

    public int getIntellect() {
        return intellect;
    }
    public void setIntellect(int intellect) {
        this.intellect = intellect;
    }
    public int getWisdom() {
        return wisdom;
    }
    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }
    public int getWittiness() {
        return wittiness;
    }
    public void setWittiness(int wittiness) {
        this.wittiness = wittiness;
    }
    public int getCreativity() {
        return creativity;
    }
    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }

    @Override
    public String toString() {
        return "Факультет 'Когтевран'. Имя студента: " + getName() + ". Сила магии: " + getMagicPower() + ". Расстоянии трансгрессии: " + getTransDistance() + ". Интеллект: "
                + intellect + ". Мудрость: " + wisdom + ". Остроумие: " + wittiness + ". Креативность: " + creativity + ".";
    }

    public static void compareStudents (Ravenclaw[] ravenclaws) {
        int sum1 =ravenclaws[0].getIntellect() + ravenclaws[0].getWisdom() + ravenclaws[0].getWittiness() + ravenclaws[0].getCreativity();
        int sum2 = ravenclaws[1].getIntellect() + ravenclaws[1].getWisdom() + ravenclaws[1].getWittiness() + ravenclaws[0].getCreativity();
        if (sum1 > sum2) {
            System.out.println(ravenclaws[0].getName() + "(" + sum1 + ")" + " круче, чем " + ravenclaws[1].getName() + "(" + sum2 + ").");
        } else if (sum1 == sum2) {
            System.out.println(ravenclaws[0].getName() + "(" + sum1 + ")" + " также крут, как и " + ravenclaws[1].getName() + "(" + sum2 + ")");
        } else {
            System.out.println(ravenclaws[1].getName() + "(" + sum2 + ")" + " круче, чем " + ravenclaws[0].getName() + "(" + sum1 + ")");
        }

    }
}
