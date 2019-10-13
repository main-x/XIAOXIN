package ui;

public class people {
    private static Integer MAXIN_TEMP = 12131;

    public static void main(String[] args) {
        System.out.println(people.MAXIN_TEMP);
        String item = "hello,world";
        String strings[] = item.split("");
        for (String l:
             strings) {
            System.out.println(l);
        }
    }
}
