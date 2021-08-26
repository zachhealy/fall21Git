

public class cLab2{

    public static void main (String[] args) {
        Account account = newAccount(1122, 20000);
        Account.setAnnualInterestRate(4.5);
        account.withdraw(2500);
        account.deposit(3000);
        System.out.println("Balance is "+ account.getBalance());
        System.out.println("Monthly interest is "+account.getMonthlyInterest());
        System.out.println("This account was created at "+account.getDateCreated());
    }

    Class Account; {
        private void newAccount(int id, double balance){
            this.bal = balance;
            this.accNo = id;

        }
        private newAccount(){

        }
        private void getBalance(){
            return this.bal;
        }
        private void setAnnualInterestRate(double rate) {
            this.rate = rate;

        }
        private void dateCreated(Date date){
            this.date = date;

        }
        private void withdraw(int wd){
            this.wd = wd;
            this.bal=-this.wd;

        }
        private void deposit(int depo){
            this.depo = depo;
            this.bal=-this.depo;

        }
        private void getMonthlyIntrest(){
            return this.bal*this.rate;
            
        }

    }

}