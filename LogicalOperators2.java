package class5.notes;

public class LogicalOperators2 {
    public static void main(String[] args) {
        double mathscore= 92.5;
        double historyscore= 91.5;
        double sciencescore=93.5;
        if(mathscore>90){
            if(historyscore>90){
                if(sciencescore>90){
                    System.out.println("your are a brilliant student");

                }else{
                    System.out.println("you need to work hard");
                }
                if(mathscore>90&&historyscore>90&&sciencescore>90){
                    System.out.println("you are a brilliant student");
                }else{
                    System.out.println("you need to study");
                }
            }
        }
    }
}
