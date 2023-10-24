public class SalaryManager_self {
    public static void main(String[] args) {
        SalaryManager_self salaryManager=new SalaryManager_self();
        double totalPayment=salaryManager.getMonthlySalary(20000000);
        System.out.println("total 급여 : "+totalPayment);
    }
    public double getMonthlySalary(int yearlySalary) {
        double monthlySalary=yearlySalary/12.0;
        System.out.println("Monthly Salary original : "+monthlySalary);
        double tax=calculateTax(monthlySalary);
        System.out.println("tax : "+ tax);
        double nationalTax=calculateNationalPension(monthlySalary);
        System.out.println("nationalTax : "+nationalTax);
        double healthTax=calculateHealthInsurance(monthlySalary);
        System.out.println("healthTax : "+healthTax);
        double sumTax=tax+nationalTax+healthTax;
        monthlySalary-=sumTax;
        return monthlySalary;
    }

    public double calculateTax(double monthSalary) {
        double tax;
        tax=monthSalary*12.5/100;
        return tax;
    }

    public double calculateNationalPension(double monthSalary) {
        double nationalTax=monthSalary*8.1/100;
        return nationalTax;
    }

    public double calculateHealthInsurance(double monthSalary) {
        double healthTax=monthSalary*13.5/100;
        return healthTax;
    }


}
