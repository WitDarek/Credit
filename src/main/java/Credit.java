import java.math.BigDecimal;
import java.time.LocalDate;

public class Credit {
    private BigDecimal creditValue;
    private BigDecimal installmentValue;
    private int numberOfInstallment;
    private LocalDate startCredit;
    private int dayPay;

    public Credit(BigDecimal creditValue, BigDecimal installmentValue, int numberOfInstallment, LocalDate startCredit, int dayPay) {
        this.creditValue = creditValue;
        this.installmentValue = installmentValue;
        this.numberOfInstallment = numberOfInstallment;
        this.startCredit = startCredit;
        this.dayPay = dayPay;
    }

    public BigDecimal getCreditValue() {
        return creditValue;
    }

    public void setCreditValue(BigDecimal creditValue) {
        this.creditValue = creditValue;
    }

    public BigDecimal getInstallmentValue() {
        return installmentValue;
    }

    public void setInstallmentValue(BigDecimal installmentValue) {
        this.installmentValue = installmentValue;
    }

    public int getNumberOfInstallment() {
        return numberOfInstallment;
    }

    public void setNumberOfInstallment(int numberOfInstallment) {
        this.numberOfInstallment = numberOfInstallment;
    }

    public LocalDate getStartCredit() {
        return startCredit;
    }

    public void setStartCredit(LocalDate startCredit) {
        this.startCredit = startCredit;
    }

    public int getDayPay() {
        return dayPay;
    }

    public void setDayPay(int dayPay) {
        this.dayPay = dayPay;
    }
}
