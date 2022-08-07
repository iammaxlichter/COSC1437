package CHAPTER5;

import java.util.*;
public class AcmePay {
    public static void main(String[] args) throws Exception {
        
        int ShiftNum, Retirement;
        int Hours;
        double Deduction = 0;

        Scanner INPUT = new Scanner(System.in);

        System.out.println("Please enter shift - 1, 2, or 3");
        ShiftNum = INPUT.nextInt();

        System.out.println("Please enter hours worked");
        Hours = INPUT.nextInt();

        if (ShiftNum == 1){

            final double ShiftPay1 = 17.0;

            if (Hours > 40.0){

                double OT = ((Hours - 40.0) * (ShiftPay1 * 1.50));
                double Regular = 40 * ShiftPay1;
                double TotalMoney = Regular + OT;


                System.out.println("Hours worked is    " + Hours);
                System.out.println("Hourly pay rate is " + ShiftPay1);
                System.out.println("Regular pay is     " + Regular);
                System.out.println("Overtime pay is    " + OT);
                System.out.println("Retirement deduction is " + Deduction);
                System.out.println("Net pay is...................." + TotalMoney);
                }

            else if (Hours <= 40.0){

                double OT = 0;
                double Regular = Hours * ShiftPay1;
                double TotalMoney = Regular + OT;


                System.out.println("Hours worked is    " + Hours);
                System.out.println("Hourly pay rate is " + ShiftPay1);
                System.out.println("Regular pay is     " + Regular);
                System.out.println("Overtime pay is    " + OT);
                System.out.println("Retirement deduction is " + Deduction);
                System.out.println("Net pay is...................." + TotalMoney);
                }
            }

        if (ShiftNum == 2){

            System.out.println("Do you want to participate in the retirement plan?\n\tEnter 1 for Yes and 2 for No.");
            Retirement = INPUT.nextInt();

            final double ShiftPay2 = 18.50;

            if (Hours > 40.0){

                double OT = ((Hours - 40.0) * (ShiftPay2 * 1.50));
                double Regular = 40 * ShiftPay2;
                double TotalMoney = Regular + OT;

                if (Retirement == 1){

                    Deduction = TotalMoney * .03;
                    TotalMoney = TotalMoney * .97;

                    System.out.println("Hours worked is    " + Hours);
                    System.out.println("Hourly pay rate is " + ShiftPay2);
                    System.out.println("Regular pay is     " + Regular);
                    System.out.println("Overtime pay is    " + OT);
                    System.out.println("Retirement deduction is " + Deduction);
                    System.out.println("Net pay is...................." + TotalMoney);
                }
                else if (Retirement == 2){

                    System.out.println("Hours worked is    " + Hours);
                    System.out.println("Hourly pay rate is " + ShiftPay2);
                    System.out.println("Regular pay is     " + Regular);
                    System.out.println("Overtime pay is    " + OT);
                    System.out.println("Retirement deduction is " + Deduction);
                    System.out.println("Net pay is...................." + TotalMoney);
                }
            }
            if (Hours <= 40.0){

                double OT = 0;
                double Regular = Hours * ShiftPay2;
                double TotalMoney = Regular + OT;

                if (Retirement == 1){

                    Deduction = TotalMoney * .03;
                    TotalMoney = TotalMoney * .97;

                    System.out.println("Hours worked is    " + Hours);
                    System.out.println("Hourly pay rate is " + ShiftPay2);
                    System.out.println("Regular pay is     " + Regular);
                    System.out.println("Overtime pay is    " + OT);
                    System.out.println("Retirement deduction is " + Deduction);
                    System.out.println("Net pay is...................." + TotalMoney);
                }
                else if (Retirement == 2){

                    System.out.println("Hours worked is    " + Hours);
                    System.out.println("Hourly pay rate is " + ShiftPay2);
                    System.out.println("Regular pay is     " + Regular);
                    System.out.println("Overtime pay is    " + OT);
                    System.out.println("Retirement deduction is " + Deduction);
                    System.out.println("Net pay is...................." + TotalMoney);
                }
            }
        }


        if (ShiftNum == 3){

            System.out.println("Do you want to participate in the retirement plan?\n\tEnter 1 for Yes and 2 for No.");
            Retirement = INPUT.nextInt();
    
            INPUT.close();
    
            final double ShiftPay3 = 22;

            if (Hours > 40.0){

                double OT = ((Hours - 40.0) * (ShiftPay3 * 1.50));
                double Regular = 40 * ShiftPay3;
                double TotalMoney = Regular + OT;

                if (Retirement == 1){

                    Deduction = TotalMoney * .03;
                    TotalMoney = TotalMoney * .97;

                    System.out.println("Hours worked is    " + Hours);
                    System.out.println("Hourly pay rate is " + ShiftPay3);
                    System.out.println("Regular pay is     " + Regular);
                    System.out.println("Overtime pay is    " + OT);
                    System.out.println("Retirement deduction is " + Deduction);
                    System.out.println("Net pay is...................." + TotalMoney);
                }
                else if (Retirement == 2){

                    System.out.println("Hours worked is    " + Hours);
                    System.out.println("Hourly pay rate is " + ShiftPay3);
                    System.out.println("Regular pay is     " + Regular);
                    System.out.println("Overtime pay is    " + OT);
                    System.out.println("Retirement deduction is " + Deduction);
                    System.out.println("Net pay is...................." + TotalMoney);
                }
            }
            if (Hours <= 40.0){

                double OT = 0;
                double Regular = Hours * ShiftPay3;
                double TotalMoney = Regular + OT;

                if (Retirement == 1){

                    Deduction = TotalMoney * .03;
                    TotalMoney = TotalMoney * .97;

                    System.out.println("Hours worked is    " + Hours);
                    System.out.println("Hourly pay rate is " + ShiftPay3);
                    System.out.println("Regular pay is     " + Regular);
                    System.out.println("Overtime pay is    " + OT);
                    System.out.println("Retirement deduction is " + Deduction);
                    System.out.println("Net pay is...................." + TotalMoney);
                }
                else if (Retirement == 2){

                    System.out.println("Hours worked is    " + Hours);
                    System.out.println("Hourly pay rate is " + ShiftPay3);
                    System.out.println("Regular pay is     " + Regular);
                    System.out.println("Overtime pay is    " + OT);
                    System.out.println("Retirement deduction is " + Deduction);
                    System.out.println("Net pay is...................." + TotalMoney);
                }
            }
        }



    }
}
