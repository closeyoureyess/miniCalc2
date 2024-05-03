public class OtherMethods {

    String a;
    public boolean exitProgramm(String number) {
        if (number.equals("Exit")) {
            System.out.println("Exit out programm. Power is turned off.");
            return true;
        } else if (number.equals("Выйти")) {
            System.out.println("Выйти из программы. Работа завершена.");
            return true;
        } else if (number.equals("Выход")) {
            System.out.println("Выход из программы. Работа завершена.");
            return true;
        }
        return false;
    }
}
