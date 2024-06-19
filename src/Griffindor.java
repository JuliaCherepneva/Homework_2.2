public class Griffindor extends hogwarts {
    private int nobility, honor, bravery;
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
                + nobility + ". Честь: " + honor + ". Храбрость: " + bravery + ".";
    }
}
