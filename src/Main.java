public class Main {
    public static void main(String[] args) {
        int amount = 20000;
        int bonus = 20;
        int bonusMiles = amount / bonus;
        System.out.println("Стоимость билета: " + amount + " рублей");
        System.out.println("Количество начисленных миль за купленный билет: " + bonusMiles);
    }
}