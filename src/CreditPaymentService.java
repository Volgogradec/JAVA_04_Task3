public class CreditPaymentService {
    public double calculate (int credit, double creditRate, int duration){
       // Месячная кредитная ставка
        double crm = creditRate/100/12;

        // Расчёт срока кредита из лет в месяцы
        int dm = duration * 12;

        // Возведение в степень для промежуточного расчёта
        double elevate = Math.pow(1+crm, dm);

        // Расчитываем ежемесячный платёж
        double creditPayment = credit * (crm + (crm / (elevate - 1)));

        // Возвращаем сумму месячного платежа
        return creditPayment;
    }
}
