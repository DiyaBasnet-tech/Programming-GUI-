

/**
 
 *
 * @author (Diya Basnet)
 * @version (1.1)
 */
//Creating a class DebitCard which is child class of BankCard.
public class DebitCard extends BankCard
{
    private int pinNumber;//Declaring the attributes of DebitCard.
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithDrawn;
    //Creating a constructor in child class and passing given attributes and calling superclass through super concept.
    public DebitCard(int balanceAmount, int cardID, String issuerBank, String bankAccount, String clientName, int pinNumber) 
    {
        super(balanceAmount,cardID,bankAccount,issuerBank);
        this.pinNumber = pinNumber;
        this.hasWithDrawn = false;
        super.setClientName(clientName);
    }
    //Creating a getter method which returns value in parameters.
    public int getPinNumber() 
    {
        return this.pinNumber;
    }

    public int getWithdrawalAmount() 
    {
        return this.withdrawalAmount;
    }

    public String getDateOfWithdrawal() 
    {
        return this.dateOfWithdrawal;
    }

    public boolean getHasWithdrawn() 
    {
        return this.hasWithDrawn;
    }
    //Creating setter method that sets the value of given variable according to the given parameters.
    public void setWithdrawalAmount(int withdrawalAmount) 
    {
        this.withdrawalAmount = withdrawalAmount;
    }
    //Creating a withdraw method to display withdrawal Amount, dateOfWithdrawal, pinNumber using if else condition.
    public void withdraw(int withdrawalAmount, String dateOfWithdrawal, int pinNumber) 
    {
        if (pinNumber == this.pinNumber) 
        {
            if (withdrawalAmount <= super.getBalanceAmount()) 
            {
                super.setBalanceAmount(super.getBalanceAmount() - withdrawalAmount);
                this.withdrawalAmount = withdrawalAmount;
                this.dateOfWithdrawal = dateOfWithdrawal;
                this.hasWithDrawn = true;
            } else 
            {
                System.out.println("Insufficient balance.");
            }
        } else 
        {
            System.out.println("Incorrect pin.");
        }
    }
    //Creating a display method to display all the details of debit class.
    public void display() 
    {
        super.display();
        if (hasWithDrawn) 
        {
            System.out.println("pin: " + pinNumber);
            System.out.println("withdrawal Amount: " +withdrawalAmount);
            System.out.println("date of Withdrawal: " + dateOfWithdrawal);
        }
        else
        {
            System.out.println("Your balance is Nrs."+ super.getBalanceAmount()+"."); 
        }
    }
}




