// Enum definition for Days
enum Days {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class EnumExamples {

    public static void main(String[] args) {
        Days day = Days.SATURDAY;

        // Switch statement to handle each day
        switch(day) {
            case SUNDAY:
                System.out.println("Fun Day");
                break;
            case MONDAY:
                System.out.println("Mood Off Day");
                break;
            case TUESDAY:
                System.out.println("Some what day");
                break;
            case WEDNESDAY:
                System.out.println("Medium day");
                break;
            case THURSDAY:
                System.out.println("Waiting for Friday");
                break;
            case FRIDAY:
                System.out.println("Excited for weekend");
                break;
            case SATURDAY:
                System.out.println("Party Vibes");
          
        }

    }
}
