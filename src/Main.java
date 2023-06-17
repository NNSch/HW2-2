public class Main {
    public static void main(String[] args) {
        int x = 100; // баланс счёта до пополнения
        int y = 1500; // сумма пополения баланса
        int z = (y > 1000) ? (y / 100) : 0; // бонусные рубли
        int q = x + y + z; // пополненный баланс счёта
        System.out.println("пополненный баланс счёта - " + q);
        System.out.println("бонусные рубли - " + z);
    }
}
