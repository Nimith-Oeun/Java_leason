package control_flow_Statment;

public class Loop {
    public static void main(String[] args) throws InterruptedException {
        // While loop
        int i =0;
        do{
            System.out.println("This is called from do while loop");
        }while (i>0);

        // While loop with break
        do{
            Thread.sleep(100);
            System.out.println("i value [ " + i + " ]");
            i++;
            if(i==500){
                break;
            }
        }while (i>0);

        // While loop with continue

        char character = 'A';
        do{
            Thread.sleep(100);
            System.out.println("i value [ " + character + " ]");
            character++;
            if(character=='Z'+1){
                break;
            }
        }while (character!='Z');

        // While loop with continue
        int number = 1;
        do{
            number++;
            if(number==10){
                continue;
            }
            System.out.println("Value of number: " + number);
            if(number==20){
                break;
            }
        }while (number>0);

        // For loop with break Label and continue Label
        myLabel:
        for(int k=0;k<10;k++){
            for(int j=1;j<10;j++){
                if(j%2==0){
                    break myLabel;
                }
                System.out.println(k + "=> " + j);
            }
        }
    }
}
