import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String numberone;
        String numbertwo;
        int counter = 0;
        String typeOperations;
        OtherMethods otherMethods = new OtherMethods();
        Scanner scanner = new Scanner(System.in);

        do {
            int counter2 = 1;
            System.out.println("Введите первое число: ");
            numberone = scanner.nextLine();
            if (otherMethods.exitProgramm(numberone) == true) {
                break;
            }
            System.out.println("Введите тип операции: ");
            typeOperations = scanner.nextLine();
            if (otherMethods.exitProgramm(typeOperations) == true) {
                break;
            }
            if (typeOperations.equals(MathTypeOperations.MULTIPLICATION.getMathTypeOperations())) {
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextLine();
                if (otherMethods.exitProgramm(numbertwo) == true) {
                    break;
                }
                System.out.println("Произведение чисел равняется: " + MathTypeOperations.MULTIPLICATION.multiplicationMethod(Integer.parseInt(numberone), Integer.parseInt(numbertwo)));
                counter = counter + counter2;
                scanner.close();
            } else if (typeOperations.equals(MathTypeOperations.SUM.getMathTypeOperations())) {
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextLine();
                if (otherMethods.exitProgramm(numbertwo) == true) {
                    break;
                }
                System.out.println("Сумма чисел равна: " + MathTypeOperations.SUM.sumMethod(Integer.parseInt(numberone), Integer.parseInt(numbertwo)));
                counter = counter + counter2;
                scanner.close();
            } else if (typeOperations.equals(MathTypeOperations.DIVISION.getMathTypeOperations())) {
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextLine();
                if (otherMethods.exitProgramm(numbertwo) == true) {
                    break;
                }
                System.out.println("Результат деления равен: " + MathTypeOperations.DIVISION.divisionMethod(Integer.parseInt(numberone), Integer.parseInt(numbertwo)));
                counter = counter + counter2;
                scanner.close();
            } else if (typeOperations.equals(MathTypeOperations.SUBSTRACTION.getMathTypeOperations())) {
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextLine();
                if (otherMethods.exitProgramm(numbertwo) == true) {
                    break;
                }
                System.out.println("Результат вычитания равен: " + MathTypeOperations.SUBSTRACTION.substractionMethod(Integer.parseInt(numberone), Integer.parseInt(numbertwo)));
                counter = counter + counter2;
                scanner.close();
            } else {
                System.out.println("Ошибка");
            }
        }
        while (counter == 0);
        scanner.close();
    }
}

//Хотел написать проще, пробовал такой вариант кода, но работает некорректно, не могу ввести тип операции,
// почему-то программа сразу же переходит к следующему шагу, не дожидаясь, пока я введу String
// т.е как-то неправильно почему-то работает scanner.nextLine. В этом и есть сложность, загвоздка задания?
//Скриншот - https://skr.sh/sPYdhT1Go9M

        /*int numberone;
        int numbertwo;
        String typeOperations;
        MathOperations mathOperations = new MathOperations();
        Scanner scanner = new Scanner(System.in);

        while (true) {
        System.out.println("Введите первое число: ");
        numberone = scanner.nextInt();
        System.out.println("Введите тип операции: ");
        typeOperations = scanner.nextLine();
        System.out.println("Введите второе число: ");
        numbertwo = scanner.nextInt();
            if (typeOperations.equals("*"){
                System.out.println(mathOperations.multiplicationMethod(numberone, numbertwo));
                }
                else{
                System.out.println("Ошибка!");
                }*/