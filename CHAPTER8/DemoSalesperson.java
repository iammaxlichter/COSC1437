package CHAPTER8;

public class DemoSalesperson {
    public static void main(String[] args) {
        
        Salesperson arr[]=new Salesperson[10];

        arr[0]=new Salesperson(9999, 0);
        arr[1]=new Salesperson(9999, 0);
        arr[2]=new Salesperson(9999, 0);
        arr[3]=new Salesperson(9999, 0);
        arr[4]=new Salesperson(9999, 0);
        arr[5]=new Salesperson(9999, 0);
        arr[6]=new Salesperson(9999, 0);
        arr[7]=new Salesperson(9999, 0);
        arr[8]=new Salesperson(9999, 0);
        arr[9]=new Salesperson(9999, 0);

        for(Salesperson s:arr)
            System.out.println(s);
    }
}