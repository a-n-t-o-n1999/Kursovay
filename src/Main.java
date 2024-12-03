import java.util.Random;

public class Main {

    private final static Random RANDOM = new Random();
   private final static String[] NAME = {"Антон","Артем","Алексей","Иван","Константин","Павел","Егор","Владислав","Максим","Семен"};
    private final static String[] OTCHESTVO = {"Антонович","Артемович","Алексеевич","Иванович","Константинович","Павлович","Егорович","Владиславович","Максимович","Семенович"};
    private final static String[] SURNAME = {"Антонов","Артемов","Алексеев","Иванов","Константинов","Павелов","Егоров","Владиславов","Максимов","Семенов"};
    private final static Employee[] MASSEMPLOYEE = new Employee[10];

    private static void initEmployee(){
        for (int i = 0; i < MASSEMPLOYEE.length; i++) {
            String fullName = SURNAME[RANDOM.nextInt(0,SURNAME.length)] + " " + NAME[RANDOM.nextInt(0,NAME.length)] + " " + OTCHESTVO[RANDOM.nextInt(0,OTCHESTVO.length)];
            MASSEMPLOYEE[i] = new Employee(fullName,RANDOM.nextInt(1,6),RANDOM.nextInt(50_000,100_000));
        }

    }


    public static void main(String[] args) {
        initEmployee();
        print(MASSEMPLOYEE);
        System.out.println("Сумма всех сотрудников = " + sumZp(MASSEMPLOYEE));
        System.out.println("Самый бедный сотрудник = " + employeeMinZp(MASSEMPLOYEE));
        System.out.println("Самый богатый сотрудник = " + employeeMaxZp(MASSEMPLOYEE));
        System.out.println("Средняя зарплата сотрудников = " + averageZp(MASSEMPLOYEE));
        printAllFullName (MASSEMPLOYEE);
    }

    public static void print(Employee[] arrayEmployee) {
        for (int i = 0; i < arrayEmployee.length; i++) {
            System.out.println(arrayEmployee[i]);
        }
    }
    public static int sumZp(Employee[] arrayEmployee) {
        int sum=0;
        for (int i = 0; i < arrayEmployee.length; i++) {
            sum+=arrayEmployee[i].getZP();
        }
        return sum;
    }

    public static Employee employeeMinZp(Employee[] arrayEmployee){
        Employee employee = null;
        for (int i = 0; i < arrayEmployee.length; i++) {
            if (employee == null || arrayEmployee[i].getZP() < employee.getZP()) {
             employee=arrayEmployee[i];
            }
        }
        return employee;
    }
    public static Employee employeeMaxZp(Employee[] arrayEmployee){
        Employee employee = null;
        for (int i = 0; i < arrayEmployee.length; i++) {
            if (employee == null || arrayEmployee[i].getZP() > employee.getZP()) {
                employee=arrayEmployee[i];
            }
        }
        return employee;
    }
    public static double averageZp(Employee[] arrayEmployee) {
        return (double) sumZp(arrayEmployee)/ arrayEmployee.length;
    }
    public static void printAllFullName (Employee[] arrayEmployee) {
        for (int i = 0; i < arrayEmployee.length; i++) {
            System.out.println(arrayEmployee[i].getFullName());
        }
    }
}