import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        System.out.println("Enter a loop command");

        Scanner input = new Scanner(System.in);
        String msg = "";

        System.out.print(">");//set visual for ready for command

        while(!msg.equals("exit")){
            msg = input.nextLine();

            if(msg.equals("exit")) {
                System.out.println(msg);
            }else if(msg.equals("for")){
                for(int i=0;i<10;i++) {
                    System.out.println(i);
                }
            }else if(msg.equals("while")){
                int wCount = 0;
                while(wCount<100){
                    wCount++;
                    System.out.println("The count is now: " + wCount);
                }
            }else if(msg.equals("do")){
                int doRand = 0;
                int doCount = 0;
                do{
                    doCount++;
                    doRand = (int)(Math.random()*25);
                }while(doRand != 10);

                System.out.println("It took " + doCount + " loops to get 10");
            }

            if(!msg.equals("exit")){
                System.out.print(">");//set visual for ready for command
            }
        }
    }
}