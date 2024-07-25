

/**
 
 *
 * @author (your name)
 * @version (a version number or a date)
 */

//Creating a class CreditCard which is another child class of BankCard
public class CreditCard extends BankCard 
{
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    //Creating a constructor in child class and passing given attributes and calling superclass through super concept.

    public CreditCard(int balanceAmount, int cardID, String issuerBank, String bankAccount, int cvcNumber,String clientName, double interestRate, String expirationDate) 
    {
        super(balanceAmount,cardID,issuerBank,bankAccount);
        super.setClientName(clientName);
        this.cvcNumber = cvcNumber;
        this.interestRate = interestRate;
        this.expirationDate = expirationDate;
        this.isGranted = false;
    }
    //Creating a getter method which returns value in parameters.
    public int getCvcNumber() 
    {
        return this.cvcNumber;
    }

    public double getCreditLimit() 
    {
        return this.creditLimit;
    }

    public double getInterestRate() 
    {
        return this.interestRate;
    }

    public String getExpirationDate() 
    {
        return this.expirationDate;
    }

    public int getGracePeriod() 
    {
        return this.gracePeriod;
    }

    public boolean getIsGranted() 
    {
        return this.isGranted;
    }
    //Creating setter method that sets the value of given variable according to the given parameters using if else condition.
    public void setCreditLimit(int creditLimit, int gracePeriod) 
    {
        if (creditLimit <= 2.5 * super.getBalanceAmount()) 
        {
            this.creditLimit = creditLimit;
            this.gracePeriod = gracePeriod;
            this.isGranted = true;
        } else 
        {
            System.out.println("CreditCard cannot be issued.");
        }
    }
    //Creating cancel CreditCard method that does the following actions.
    public void cancelCreditCard() 
    {
        if(isGranted)
        {
            this.cvcNumber = 0;
            this.creditLimit = 0;
            this.gracePeriod = 0;
            this.isGranted = false;
            System.out.println("Your Credit Card has been canceled.");
        }
        else 
        {
            System.out.println("No credit card found.");
        }
    }
    //Creating a display method to display all the details of debit class.
    public void display() 
    {
        super.display();
        System.out.println("CVC Number: " + cvcNumber);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Expiration Date: " + expirationDate);
        if (isGranted == true ) 
        {
            System.out.println("Credit Limit: " + creditLimit); 
            System.out.println("Grace Period: " + gracePeriod);
        }
        else
        {
            System.out.println("Sorry we can't help you. Card limit is not granted.");
        }
    }
}

