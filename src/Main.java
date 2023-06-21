public class Main {
    public static void main(String[] args) {
        int balance = 100; // баланс счёта до пополнения
        int many = 100; // сумма пополения баланса
        int bonus = (many > 1000) ? (many / 100) : 0; // бонусные рубли
        int check = balance + many + bonus; // пополненный баланс счёта
        System.out.println("пополненный баланс счёта - " + check);
        System.out.println("бонусные рубли - " + bonus);
    }
}
