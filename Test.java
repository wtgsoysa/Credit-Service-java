import java.util.Scanner;

public class Test {

    // ANSI escape codes for text color
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    // Method to print colored text
    static void printColored(String text, String color) {
        System.out.print(color + text + RESET);
    }

    // Method to print animated text
    static void printAnimatedText(String text) {
        // Your text animation logic goes here
        // You can add delays between characters or lines
        System.out.println(text);
    }

    static void Mobile_Number_Checker(String user_number) {
        char[] Array_mobile = user_number.toCharArray();
        int Array_length = Array_mobile.length;

        if (Array_mobile[0] == '7' && (Array_mobile[1] == '7' || Array_mobile[1] == '6')) {
            if (Array_length == 9) {
                printColored("\n+94" + user_number + " Mobile Number Access Granted! \n ", GREEN);
                System.out.print("\n\t >>>>>> MENU <<<<<< \n\n\t 1. Ask For Loan \n\t 2. Send Credit \n\t 3. Reloard \n\t 4. Exit \n");
            } else {
                printColored("Invalid Mobile Number!!", RED);
            }
        } else {
            printColored("+94 " + Array_mobile[0] + "" + Array_mobile[1] + "\n This is Not a Valid Number!!", RED);
        }
    }

    static void Menu_Access(int Access_digit) {
        switch (Access_digit) {
            case 1:
                printColored("\n\n\t >>>>> # Ask For Loan <<<<<< \n\n\t 1. Automatic Reloard Loan \n\t 2. One Time Reloard Loan \n\t 3. Data Loan \n\t 4. Credit from Dialog : Postpaid \n\t 5. Credit from Dialog : DTV \n\t 6. Exit", CYAN);
                Scanner input1 = new Scanner(System.in);
                printColored("\nEnter : ", YELLOW);
                int Loan_menu = input1.nextInt();
                switch (Loan_menu) {
                    case 1:
                        printColored("\n\t# Automatic Reloard Loan\n\n", PURPLE);
                        System.out.print("You have already activated the Automatic loan facility.Your current loan value is Rs.40.0/- \n");
                        Scanner inputL = new Scanner(System.in);
                        printColored("Activate the Loan Amount (Yes/No) : ", YELLOW);
                        String Activate = inputL.nextLine();
                        if (Activate.equalsIgnoreCase("yes")) {
                            printColored("Loan Activated!", GREEN);
                        } else {
                            printColored("Loan not activated.", RED);
                        }
                        break;

                    case 2:
                        printColored("\n\t# One Time Reloard Loan\n", PURPLE);
                        Scanner inputLoanAmount = new Scanner(System.in);
                        printColored("Enter the loan amount (Maximum Rs.100): ", YELLOW);
                        double loanAmount = inputLoanAmount.nextDouble();

                        if (loanAmount <= 100) {
                            printColored("One-time reload loan of Rs. " + loanAmount + " granted!", GREEN);
                        } else {
                            printColored("Amount is Invalid!!", RED);
                        }
                        break;

                    case 3:
                        printColored("\n\t# Data Loan\n\n", PURPLE);
                        Scanner inputDataAmount = new Scanner(System.in);
                        printColored("Maximum Get (1000 MB) \n100 MB = Rs.10.0/- \nEnter the data loan amount (in MB): ", YELLOW);
                        int dataAmount = inputDataAmount.nextInt();

                        if (dataAmount <= 1000) {
                            printColored("Data loan of " + dataAmount + " MB granted!", GREEN);
                        }
                        break;

                    case 4:
                        printColored("\n\t# Credit from Dialog : Postpaid\n\n", PURPLE);

                        Scanner inputPostpaidCredit = new Scanner(System.in);
                        printColored("Enter the credit amount for Dialog Postpaid: ", YELLOW);
                        double postpaidCreditAmount = inputPostpaidCredit.nextDouble();

                        printColored("\nCredit of Rs. " + postpaidCreditAmount + " added to Dialog Postpaid!", GREEN);
                        break;

                    case 5:
                        printColored("\n\t# Credit from Dialog : DTV\n\n", PURPLE);

                        Scanner inputDTVcredit = new Scanner(System.in);
                        printColored("Enter the credit amount for Dialog DTV: ", YELLOW);
                        double dtvCreditAmount = inputDTVcredit.nextDouble();

                        printColored("\nCredit of Rs. " + dtvCreditAmount + " added to Dialog DTV!", GREEN);
                        break;

                    case 6:
                        printColored("\nThanks For Using Dialog Credit Service.\nGood Bye!!", BLUE);
                        break;

                    default:
                        break;
                }
                break;

            case 2:
                printColored("\n\n\t # Send Credit \n\n", CYAN);
                Scanner inputSend = new Scanner(System.in);
                printColored("Enter the Phone Number +94 :", YELLOW);
                String credit_send_number = inputSend.nextLine();
                char[] Array_other_mobile = credit_send_number.toCharArray();
                int Array_length = Array_other_mobile.length;
                if (Array_length == 9) {
                    Scanner input_transfer = new Scanner(System.in);
                    printColored("\nMaximum Amount (Rs.500)\nEnter the Amount : ", YELLOW);
                    int input_transfer_amount = input_transfer.nextInt();
                    if (input_transfer_amount <= 500) {
                        printColored("\n Rs." + input_transfer_amount + " Transfer to " + credit_send_number + " Is Successfully!!", GREEN);
                    } else {
                        printColored("Invalid Amount", RED);
                    }
                }
                break;

            case 3:
                printColored("\n\n\t # Reloard", CYAN);
                System.out.print("( People's Bank / Commercial Bank / DFCC Bank ) \n");
                Scanner reloardInput = new Scanner(System.in);

                printColored("Enter the Bank Name :", YELLOW);
                String bank_name = reloardInput.nextLine();
                if (bank_name.equalsIgnoreCase("People's Bank")) {
                    printColored("People's Bank \n", PURPLE);
                    Scanner peoples_input = new Scanner(System.in);
                    printColored("Enter the Account Number : ", YELLOW);
                    String peoples_account_number = peoples_input.nextLine();
                    char[] Array_account = peoples_account_number.toCharArray();
                    int Array_account_peoples = Array_account.length;

                    if (Array_account_peoples == 12) {
                        Scanner transfer_input = new Scanner(System.in);
                        printColored("\nEnter the Amount : Rs.", YELLOW);
                        int transfer_amount = transfer_input.nextInt();
                        int peoples_otp = transfer_amount + transfer_amount;
                        printColored("On Time OTP : " + peoples_otp, GREEN);
                        Scanner Ontime = new Scanner(System.in);
                        printColored("\nEnter the OTP Code : ", YELLOW);
                        int otp = Ontime.nextInt();

                        if (otp == peoples_otp) {
                            printColored("Rs."+ transfer_amount + "Reloader add to your Number.", GREEN);
                            printColored("Transfer Successfully Confirmed !! \n  ", GREEN);
                        }
                    } else {
                        printColored("Invalid Bank", RED);
                    }
                } else if (bank_name.equalsIgnoreCase("Commercial Bank")) {
                    Scanner commercialInput = new Scanner(System.in);
                    printColored("Enter the Account Number : ", YELLOW);
                    String commercial_account_number = commercialInput.nextLine();
                    char[] Array_account_commercial = commercial_account_number.toCharArray();
                    int Array_account_commercial_length = Array_account_commercial.length;

                    if (Array_account_commercial_length == 12) {
                        Scanner transfer_input = new Scanner(System.in);
                        printColored("\nEnter the Amount : Rs.", YELLOW);
                        int transfer_amount = transfer_input.nextInt();
                        int commercial_otp = transfer_amount + transfer_amount;
                        printColored("One Time OTP : " + commercial_otp, GREEN);
                        Scanner onTime = new Scanner(System.in);
                        printColored("\nEnter the OTP Code : ", YELLOW);
                        int otp = onTime.nextInt();

                        if (otp == commercial_otp) {
                            printColored("Rs."+ transfer_amount + "Reloader add to your Number.", GREEN);
                            printColored("Transfer Successfully Confirmed !! \n ", GREEN);
                        }
                    } else {
                        printColored("Invalid Bank", RED);
                    }
                } else if (bank_name.equalsIgnoreCase("DFCC Bank")) {
                    Scanner dfccInput = new Scanner(System.in);
                    printColored("Enter the Account Number : ", YELLOW);
                    String dfcc_account_number = dfccInput.nextLine();
                    char[] Array_account_dfcc = dfcc_account_number.toCharArray();
                    int Array_account_dfcc_length = Array_account_dfcc.length;

                    if (Array_account_dfcc_length == 12) {
                        Scanner transfer_input = new Scanner(System.in);
                        printColored("\nEnter the Amount : Rs.", YELLOW);
                        int transfer_amount = transfer_input.nextInt();
                        int dfcc_otp = transfer_amount + transfer_amount;
                        printColored("One Time OTP : " + dfcc_otp, GREEN);
                        Scanner onTime = new Scanner(System.in);
                        printColored("\nEnter the OTP Code : ", YELLOW);
                        int otp = onTime.nextInt();

                        if (otp == dfcc_otp) {
                            printColored("Rs."+ transfer_amount + "Reloader add to your Number.", GREEN);
                            printColored("Transfer Successfully Confirmed !! \n ", GREEN);
                        }
                    } else {
                        printColored("Invalid Bank", RED);
                    }
                } else {
                    printColored("Invalid Bank", RED);
                }
                break;

            case 4:
                printColored("\n\n\t Thanks For Using Dialog Credit Service. \n\t Good Bye !!!", BLUE);
                break;

            default:
                printColored("\n\n\t Invalid Number ", RED);
                break;
        }
    }

    public static void main(String[] args) {
        printColored("\n\n\t>>>>>> Dialog <<<<<< \n\nWelcome to #356# Credit Services \n\n", BLUE);
        Scanner input = new Scanner(System.in);
        // Get the user Mobile Number
        printColored("Enter Your Mobile Number +94 : ", YELLOW);
        String Mobile_Number = input.nextLine();
        Mobile_Number_Checker(Mobile_Number);

        printColored("Enter : ", YELLOW);
        int Menu_category = input.nextInt();
        Menu_Access(Menu_category);
    }
}
