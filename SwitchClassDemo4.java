package class5.notes;

public class SwitchClassDemo4 {
    public static void main(String[] args) {
        String day= "Friday";
        switch (day){
            case "Monday":
                System.out.println("1");
                break;
                case "Tuesday":
                    System.out.println("2");
                    break;
            case "wednesday":
                System.out.println("3");
                break;
            case "Thursday":
                System.out.println("4");
                break;
            case"Friday":
                System.out.println("5");
                break;
            case "Saturday":
                    System.out.println("6");
                    break;
            default:
                System.out.println("wrong day");


        }
    }
}
