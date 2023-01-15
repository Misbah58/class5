package class5.notes;

public class LogicalOperators1 {
    public static void main(String[] args) {
        System.out.println(true||true);
        System.out.println(true||false);
        System.out.println(false||false);
        System.out.println(false||false||true||false);

        boolean boughtcho=true;
        boolean boughtflowers=false;
        if(boughtcho||boughtflowers){
            System.out.println("i am happy");

        }else{
            System.out.println("i am sad");
        }


            boolean wifi=true;
            boolean fiveG=true;
            if(wifi||fiveG){
                System.out.println("you are good for browsing the internet");
            }else {
                System.out.println("either connect to wifi or fiveG");
            }
        }




    }
