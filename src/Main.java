public class Main {
    public static void main(String[] args) {

        task1();
        task2();
    }
    private static void task1(){
        //Задание 1
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName +" "+ firstName+ " " + middleName;
        System.out.println("ФИО сотрудника - " + fullName);

        // Задание 2
        System.out.println("Задание 2");
        fullName = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);

    }
    private static void task2(){
        //Задание 3
        System.out.println("Задание 3");
        String fullName = "Иванов Семён Семёнович";
        if (fullName.contains("ё")){
            String fullName1 = fullName.replace("ё", "е");
            System.out.println("Данные ФИО сотрудника — " + fullName1);
        }else {
            System.out.println("Данные ФИО сотрудника — " + fullName);
        }
    }

}