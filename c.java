class Account{
    static int balance;
    static int amount;

   void Credit(){
   
       balance = amount+balance;
       System.out.println("CREDITED BALANCE="+balance);
   }
   
   void debit(){
    balance = balance-amount;
    System.out.println("DEBITED BALANCE="+balance);
}
  void display(){
    System.out.println("UPDATED BALANCE"+this.balance);
  }
}   
   class c{
       public static void main(String[] args) {
      Account bal=new Account();
      bal.balance=1000;
      bal.amount=500;
      System.out.println("BALANCE="+bal.balance);
      Account bal1=new Account();
      System.out.println("BALANCE="+bal1.balance);
      bal.Credit( );
      bal.debit( );
      bal.display();
      bal1.Credit();
      bal1.debit();
      bal1.display();
   }
   }
