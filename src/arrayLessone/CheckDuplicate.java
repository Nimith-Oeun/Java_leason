package arrayLessone;

public class CheckDuplicate {
    public static void main(String[] args) {
        Integer [] ages = {20,2,5,18,10,19,21,21,23,20};
        for(int i=0;i<ages.length;i++){
            for(int j=i+1;j<ages.length;j++){
                if(ages[i]==ages[j]){
                    System.out.println(ages[i]);
                }
            }
        }

        //Name duplicate

        String [] name = {"somnang","jame","even","jame"};
        for(int i=0;i<name.length;i++){
            for(int j=i+1;j<name.length;j++){
                if(name[i].equalsIgnoreCase(name[j])){
                    System.out.println("Duplicate: " + name[i]);
                }
            }
        }


    }
}
