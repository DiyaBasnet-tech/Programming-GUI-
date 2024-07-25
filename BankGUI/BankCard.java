

/**
 * 
 *
 * @author (Diya Basnet)
 * @version (1.1)
 */
//Creating a parent class named BankCard.
public class BankCard 
{
    private int cardID;//Declaring the variables.
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int balanceAmount;
    
    //Creating a constructor in superclass and passing given parameter.
    public BankCard(int balanceAmount,int cardID,String bankAccount,String issuerBank) 
    {
        this.cardID = cardID;
        this.clientName = "";
        this.issuerBank = issuerBank;
        this.bankAccount = bankAccount;
        this.balanceAmount = balanceAmount;
    }
    
    //Creating a getter method which returns value in parameters.
    public int getCardId() 
    {
        return this.cardID;
    }

    public String getClientName() 
    {
        return this.clientName;
    }

    public String getIssuerBank() 
    {
        return this.issuerBank;
    }

    public String getBankAccount() 
    {
        return this.bankAccount;
    }
    
    public int getBalanceAmount() 
    {
        return this.balanceAmount;
    }
    //Creating setter method that sets the value of given variable according to the given parameter.
    public void setClientName(String clientName)
    {
        this.clientName=clientName;
    }
    
    public void setBalanceAmount(int balanceAmount)
    {
        this.balanceAmount=balanceAmount;
    }
    
    //Creating a display method to display all the details of parent class.
    public void display() 
    {
        if(clientName=="")
        {
            System.out.println(" Client Name Not Found ");
        }
        else
        {
            System.out.println(" The client name is : " + clientName);
        }
        System.out.println(" Your Card ID number is : " + cardID);
        System.out.println(" The Issuer Bank : " + issuerBank);
        System.out.println(" Bank Account is  : " + bankAccount);
        System.out.println(" Balance Amount is : " + balanceAmount);
    }
}

    
    

    
    
    
    
    
 
