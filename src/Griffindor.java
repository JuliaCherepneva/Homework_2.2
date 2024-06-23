public class Griffindor extends Hogwarts {
    private int nobility;
    private int honor;
    private int bravery;
    // конструктор
    public Griffindor(String name, int magicPower, int transDistance, int nobility, int honor, int bravery) {
        super(name, magicPower, transDistance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
    // геттеры и сеттеры
    public int getNobility() {
        return nobility;
    }
    public void setNobility(int nobility) {
        this.nobility = nobility;
    }
    public int getHonor() {
        return honor;
    }
    public void setHonor(int honor) {
        this.honor = honor;
    }
    public int getBravery() {
        return bravery;
    }
    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    @Override
    public String toString() {
        return "Факультет 'Гриффиндор'. Имя студента: " + getName() + ". Сила магии: " + getMagicPower() + ". Расстоянии трансгрессии: " + getTransDistance() + ". Благородство: "
                + getNobility() + ". Честь: " + getHonor() + ". Храбрость: " + getBravery () + ".";
    }

    public static void compareStudents (Griffindor[] griffindor) {
        int sum1 = griffindor[2].getNobility() + griffindor[2].getHonor() + griffindor[2].getBravery();
        int sum2 = griffindor[1].getNobility() + griffindor[1].getHonor() + griffindor[1].getBravery();
        if (sum1 > sum2) {
            System.out.println(griffindor[2].getName() + "(" + sum1 + ")" + " круче, чем " + griffindor[1].getName() + "(" + sum2 + ").");
        } else if (sum1 == sum2) {
            System.out.println(griffindor[2].getName() + "(" + sum1 + ")" + " также крут, как и " + griffindor[1].getName() + "(" + sum2 + ")");
        } else {
            System.out.println(griffindor[1].getName() + "(" + sum2 + ")" + " круче, чем " + griffindor[2].getName() + "(" + sum1 + ")");
        }

    }
    }

