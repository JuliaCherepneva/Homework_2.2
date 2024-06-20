//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static final Griffindor[] griffindor = new Griffindor[3];
    private static final Hufflepuff[] hufflepuff = new Hufflepuff[3];
    private static final Ravenclaw[] ravenclaw = new Ravenclaw[3];
    private static final Slytherin[] slytherin = new Slytherin[3];

    public static void printStudents() {
        for (int i = 0; i < griffindor.length; i++) {
            System.out.println(griffindor[i]);
        }
        System.out.println("============================");
        for (int i = 0; i < hufflepuff.length; i++) {
            System.out.println(hufflepuff[i]);
        }
        System.out.println("============================");
        for (int i = 0; i < ravenclaw.length; i++) {
            System.out.println(ravenclaw[i]);
        }
        System.out.println("============================");
        for (int i = 0; i < slytherin.length; i++) {
            System.out.println(slytherin[i]);
        }
    }

    public static void main(String[] args) {

        griffindor[0] = new Griffindor("Гарри Поттер", 98, 86, 85, 74, 92);
        griffindor[1] = new Griffindor("Гермиона Грейнджер", 74, 84, 65, 54, 57);
        griffindor[2] = new Griffindor("Рон Уизли", 76, 75, 83, 78, 63);

        hufflepuff[0] = new Hufflepuff("Захария Смит", 67, 86, 58, 38, 48);
        hufflepuff[1] = new Hufflepuff("Седрик Диггори", 76, 89, 34, 98, 34);
        hufflepuff[2] = new Hufflepuff("Джастин Финч-Флетчли", 78, 76, 45, 89, 57);

        ravenclaw [0] = new Ravenclaw("Чжоу Чанг", 45, 54, 78, 76, 89, 78);
        ravenclaw [1] = new Ravenclaw("Падма Патил", 78, 87, 34, 89, 90, 56);
        ravenclaw [2] = new Ravenclaw("Маркус Белби", 92, 45, 78, 23, 78, 89);

        slytherin [0] = new Slytherin("Драко Малфой", 89, 97, 45, 23, 97, 45, 66);
        slytherin [1] = new Slytherin("Грэхэм Монтегю", 35, 67, 80, 23, 90, 34, 34);
        slytherin [2] = new Slytherin("Грегори Гойл", 78, 34, 77, 46, 32, 78, 54);

        printStudents();

        System.out.println("============================");
        Griffindor.compareStudents (griffindor);
        Hufflepuff.compareStudents (hufflepuff);
        Ravenclaw.compareStudents (ravenclaw);
        Slytherin.compareStudents (slytherin);

        System.out.println("============================");
        Hogwarts.compareStudents (griffindor, slytherin);
        Hogwarts.compareMagic (griffindor,slytherin);
        Hogwarts.compareTransDistance (griffindor,slytherin);
    }
}