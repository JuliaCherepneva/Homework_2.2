public class Slytherin extends hogwarts {
    private int cunning, resoluteness, ambition, resourcefulness, power;
    // конструктор
    public Slytherin(String name, int magicPower, int transDistance, int cunning, int resoluteness,
                     int ambition, int resourcefulness, int power) {
        super(name, magicPower, transDistance);
        this.cunning = cunning;
        this.resoluteness = resoluteness;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.power = power;
    }
    // геттеры и сеттеры
    public int getCunning() {
        return cunning;
    }
    public void setCunning(int cunning) {
        this.cunning = cunning;
    }
    public int getResoluteness() {
        return resoluteness;
    }
    public void setResoluteness(int resoluteness) {
        this.resoluteness = resoluteness;
    }
    public int getAmbition() {
        return ambition;
    }
    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }
    public int getResourcefulness() {
        return resourcefulness;
    }
    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }
    public int getPower() {
        return power;
    }
    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Факультет 'Слизерин'. Имя студента: " + getName() + ". Сила магии: " + getMagicPower() + ". Расстоянии трансгрессии: " + getTransDistance() + ". Хитрость: "
                + cunning + ". Решительность: " +  resoluteness + ". Амбициозность: " + ambition + ". Находчивость: " + resourcefulness + ". Жажда власти" + power + ".";
    }
}
