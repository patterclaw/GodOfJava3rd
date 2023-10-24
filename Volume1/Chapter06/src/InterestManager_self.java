public class InterestManager_self {
    public static void main(String[] args) {
        InterestManager_self sample=new InterestManager_self();
        int day=10;
        while(day<=365){
            double amount= sample.calculateAmount(day,1000000);
            System.out.println("day : "+day +", amount : "+amount);
            day+=10;
        }
    }

    public double getInterestRate(int day) {
        double interestRate;
        if(1<=day && day<=90)
            interestRate=0.5;
        else if (90<day && day<=180)
            interestRate=1;
        else if (180<day && day<=364)
            interestRate=2;
        else
            interestRate=5.6;
        return interestRate;
    }
    public double calculateAmount(int day,long amount){
        double interest=getInterestRate(day);
        double interestRate=amount*interest/100;
        //amount : 예치금 interestRate : 이자
        double totalAmount=amount+interestRate;
        return totalAmount;
    }



}
