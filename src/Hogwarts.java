public class Hogwarts {
    private String name;
    private int magicPower, transDistance;

    // конструктор
    public Hogwarts(String name, int magicPower, int transDistance) {
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

    public static void compareStudents(Griffindor[] griffindor, Slytherin[] slytherin) {
        int sum1 = griffindor[0].getMagicPower() + griffindor[0].getTransDistance();
        int sum2 = slytherin[0].getMagicPower() + slytherin[0].getTransDistance();
        if (sum1 > sum2) {
            System.out.println(griffindor[0].getName() + "(" + sum1 + ")" + " круче, чем " + slytherin[0].getName() + "(" + sum1 + ")");
        } else if (sum1 == sum2) {
            System.out.println(griffindor[0].getName() + "(" + sum1 + ")" + " также крут, как и " + slytherin[0].getName() + "(" + sum2 + ")");
        } else if (sum1 < sum2) {
            System.out.println(slytherin[0].getName() + "(" + sum2 + ")" + " круче, чем " + griffindor[0].getName() + "(" + sum1 + ")");
        }
    }
    public static void compareMagic (Griffindor[] griffindor, Slytherin[] slytherin) {
        if (griffindor[0].getMagicPower() > slytherin[0].getMagicPower()) {
            System.out.println(griffindor[0].getName() + "("+ griffindor[0].getMagicPower() + ")" + " обладает большей силой магии, чем " + slytherin[0].getName() + "(" + slytherin[0].getMagicPower() + ")");
        } else if (griffindor[0].getMagicPower() == slytherin[0].getMagicPower()) {
            System.out.println(griffindor[0].getName() + "("+ griffindor[0].getMagicPower() + ")" + " также крут в силе магии, как и " + slytherin[0].getName() + "(" + slytherin[0].getMagicPower() + ")");
        } else if (griffindor[0].getMagicPower() < slytherin[0].getMagicPower()) {
            System.out.println(slytherin[0].getName() + "(" + slytherin[0].getMagicPower() + ")" + " обладает большей силой магии, чем " + griffindor[0].getName() + "("+ griffindor[0].getMagicPower() + ")");
        }
    }
    public static void compareTransDistance (Griffindor[] griffindor, Slytherin[] slytherin) {
        if (griffindor[0].getTransDistance() > slytherin[1].getTransDistance()) {
            System.out.println(griffindor[0].getName() + "(" + griffindor[0].getTransDistance() + ")" + " трангрессирует на большее расстояние, чем " + slytherin[1].getName() + "(" + slytherin[1].getTransDistance() + ")");
        } else if (griffindor[0].getTransDistance() == slytherin[1].getTransDistance()) {
            System.out.println(griffindor[0].getName() + "(" + griffindor[0].getTransDistance() + ")" + " также крут в трансгрессии, как и " + slytherin[1].getName() + "(" + slytherin[1].getTransDistance() + ")");
        } else if (griffindor[0].getTransDistance() < slytherin[1].getTransDistance()) {
            System.out.println(slytherin[1].getName() + "(" + slytherin[1].getTransDistance() + ")" + " трангрессирует на большее расстояние, чем " + griffindor[0].getName() + "(" + griffindor[0].getTransDistance() + ")");
        }
    }
}

