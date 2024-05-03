import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String numberone;
        String numbertwo;
        int intNumberone;
        int intNumbertwo;
        int counter = 0;
        String typeOperations;
        MathOperations mathOperations = new MathOperations();
        OtherMethods otherMethods = new OtherMethods();
        Scanner scanner = new Scanner(System.in);

        do {
            int counter2 = 1;
            System.out.println("Введите первое число: ");
            numberone = scanner.nextLine();
            if(otherMethods.exitProgramm(numberone) == true){
                scanner.close();
                break;
            }
            System.out.println("Введите тип операции: ");
            typeOperations = scanner.nextLine();
            if(otherMethods.exitProgramm(typeOperations) == true){
                scanner.close();
                break;
            }
            if (typeOperations.equals("*")) {
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextLine();
                if(otherMethods.exitProgramm(numbertwo) == true){
                    scanner.close();
                    break;
                };
                intNumberone = Integer.parseInt(numberone);
                intNumbertwo = Integer.parseInt(numbertwo);
                System.out.println("Произведение чисел равняется: " + mathOperations.multiplicationMethod(intNumberone, intNumbertwo));
                counter = counter + counter2;
                scanner.close();
            } else if (typeOperations.equals("+")) {
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextLine();
                if(otherMethods.exitProgramm(numbertwo) == true){
                    scanner.close();
                    break;
                }
                intNumberone = Integer.parseInt(numberone);
                intNumbertwo = Integer.parseInt(numbertwo);
                System.out.println("Сумма чисел равна: " + mathOperations.sumMethod(intNumberone, intNumbertwo));
                counter = counter + counter2;
                scanner.close();
            } else if (typeOperations.equals(":")) {
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextLine();
                if(otherMethods.exitProgramm(numbertwo) == true){
                    scanner.close();
                    break;
                }
                intNumberone = Integer.parseInt(numberone);
                intNumbertwo = Integer.parseInt(numbertwo);
                System.out.println("Результат деления равен: " + mathOperations.divisionMethod(intNumberone, intNumbertwo));
                counter = counter + counter2;
                scanner.close();
            } else if (typeOperations.equals("-")) {
                System.out.println("Введите второе число: ");
                numbertwo = scanner.nextLine();
                if(otherMethods.exitProgramm(numbertwo) == true){
                    scanner.close();
                    break;
                }
                intNumberone = Integer.parseInt(numberone);
                intNumbertwo = Integer.parseInt(numbertwo);
                System.out.println("Результат вычитания равен: " + mathOperations.substractionMethod(intNumberone, intNumbertwo));
                counter = counter + counter2;
                scanner.close();
            } else {
                System.out.println("Ошибка");
            }
        } while (counter == 0);
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