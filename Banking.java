import java.util.Scanner;
    public class Banking {
        public static void main(String[] args) {
            //create an object of the bank account class and pass in a name and id)
            BankAccount obj = new BankAccount("Xavier Newkirk" + " ", "081520020021244");
            //use the object to access the show menu method.
            obj.showMenu();
        }
    }
    //create the class and attributes
    class BankAccount {
        int balance;
        int previousTransaction;
        String customerName;
        String customerId;

        //constructor to initialize objects.
        BankAccount(String name, String id) {
            customerName = name;
            customerId = id;
        }
        //the deposit method lets the user deposit any amount into the account.
        void deposit(int amount) {
            if (amount != 0) {
                balance = balance + amount;
                previousTransaction = amount;
            }
        }
        //the withdraw method lets the user withdraw any amount from the account.
        void withdraw(int amount) {
            if (amount != 0) {
                balance = balance - amount;
                previousTransaction = - amount;
            }
        }
        //receives the previous transaction that the user made and displays it.
        void getPreviousTransaction(){
            if(previousTransaction > 0){
                System.out.println("Deposited: "+previousTransaction);

            }
            else if(previousTransaction < 0){
                System.out.println("Withdrawn: "+Math.abs(previousTransaction));
            }
            else{
                System.out.println("no transaction occured");

            }
        }
        //shows the menu of options for the user to choose from.
        void showMenu(){
            char option = '\0';
            Scanner scan = new Scanner(System.in);

            System.out.println("Welcome, " + customerName);
            System.out.println("Your ID: " + customerId);
            System.out.println("\n");
            System.out.println("A. Check Balance");
            System.out.println("B. Deposit");
            System.out.println("C. withdraw");
            System.out.println("D. Previous transaction");
            System.out.println("E. Exit");

            do{
                System.out.println("=======================");
                System.out.println("Enter an option");
                System.out.println("========================");
                option = scan.next().charAt(0);
                System.out.println("\n");

                switch (option) {
                    case 'A':
                        System.out.println("----------------");
                        System.out.println("Balance = " + balance);
                        System.out.println("-----------------");
                        System.out.println("\n");
                        break;

                    case 'B':
                        System.out.println("-----------------");
                        System.out.println("Enter an amount to deposit: ");
                        System.out.println("------------------");
                        int amount = scan.nextInt();
                        deposit(amount);
                        System.out.println("\n");
                        break;

                    case 'C':
                        System.out.println("-----------------");
                        System.out.println("Enter an amount to withdraw: ");
                        System.out.println("------------------");
                        int amount2 = scan.nextInt();
                        withdraw(amount2);
                        System.out.println("\n");
                        break;

                    case 'D':
                        System.out.println("------------------");
                        getPreviousTransaction();
                        System.out.println("------------------");
                        System.out.println("\n");
                        break;
                    case 'E':
                        System.out.println("**********************");
                        break;

                    default:
                        System.out.println("Invalid Option! Please enter again");
                        break;





                }
            }while(option != 'E');
            System.out.println("Thank you for using our services.");



        }
    }



