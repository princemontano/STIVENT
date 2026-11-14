package STIvent;
import java.util.*;

class  Event {
    String EventName;
    String EventDate;
    String EventPlace;
    String EventParticipants;
    String EventTime;

    Event(String name, String date, String place, String participants, String time) {
        this.EventName = name;
        this.EventDate = date;
        this.EventPlace = place;
        this.EventParticipants = participants;
        this.EventTime = time;
    }
}

abstract class Participant {
    String Level;

    List<Event> events = new ArrayList<>();

    Participant(String level) {
        this.Level = level;
    }
    abstract String getEventDetails();
}

class HighSchoolStudent extends Participant {
    HighSchoolStudent(String level) {
        super(level);
    }

    @Override
    String getEventDetails() {
        StringBuilder details = new StringBuilder();
        for (Event event : events) {
            details.append("Event Name: ").append(event.EventName).append("\n");
            details.append("Event Date: ").append(event.EventDate).append("\n");
            details.append("Event Place: ").append(event.EventPlace).append("\n");
            details.append("Event Participants: ").append(event.EventParticipants).append("\n");
            details.append("Event Time: ").append(event.EventTime).append("\n\n");
        }
        return details.toString();
    }
}

class SeniorHighSchoolStudent extends Participant {
    SeniorHighSchoolStudent(String level) {
        super(level);
    }

    @Override
    String getEventDetails() {
        StringBuilder details = new StringBuilder();
        for (Event event : events) {
            details.append("Event Name: ").append(event.EventName).append("\n");
            details.append("Event Date: ").append(event.EventDate).append("\n");
            details.append("Event Place: ").append(event.EventPlace).append("\n");
            details.append("Event Participants: ").append(event.EventParticipants).append("\n");
            details.append("Event Time: ").append(event.EventTime).append("\n\n");
        }
        return details.toString();
    }
}

class HTCUAStudent extends SeniorHighSchoolStudent {
    HTCUAStudent(String level) {
        super(level);
    }
}

class HTTOStudent extends SeniorHighSchoolStudent {
    HTTOStudent(String level) {
        super(level);
    }
}

class ASSHStudent extends SeniorHighSchoolStudent {
    ASSHStudent(String level) {
        super(level);
    }
}

class STEMandETMStudent extends SeniorHighSchoolStudent {
    STEMandETMStudent(String level) {
        super(level);
    }
}

class BandEStudent extends SeniorHighSchoolStudent {
    BandEStudent(String level) {
        super(level);
    }
}

class ICTandSCPTStudent extends SeniorHighSchoolStudent {
    ICTandSCPTStudent(String level) {
        super(level);
    }
}

class CollegeStudent extends Participant {
    CollegeStudent(String level) {
        super(level);
    }

    @Override
    String getEventDetails() {
        StringBuilder details = new StringBuilder();
        for (Event event : events) {
            details.append("Event Name: ").append(event.EventName).append("\n");
            details.append("Event Date: ").append(event.EventDate).append("\n");
            details.append("Event Place: ").append(event.EventPlace).append("\n");
            details.append("Event Participants: ").append(event.EventParticipants).append("\n");
            details.append("Event Time: ").append(event.EventTime).append("\n\n");
        }
        return details.toString();
    }
}

class BSCSStudent extends CollegeStudent {
    BSCSStudent(String level) {
        super(level);
    }
}

class BSITStudent extends CollegeStudent {
    BSITStudent(String level) {
        super(level);
    }
}

class BSAISStudent extends CollegeStudent {
    BSAISStudent(String level) {
        super(level);
    }
}

class BSAStudent extends CollegeStudent {
    BSAStudent(String level) {
        super(level);
    }
}

class BSHMStudent extends CollegeStudent {
    BSHMStudent(String level) {
        super(level);
    }
}

class BSTMStudent extends CollegeStudent {
    BSTMStudent(String level) {
        super(level);
    }
}

class BSNAMEStudent extends CollegeStudent {
    BSNAMEStudent(String level) {
        super(level);
    }
}

class BSMarEStudent extends CollegeStudent {
    BSMarEStudent(String level) {
        super(level);
    }
}

class BSMTStudent extends CollegeStudent {
    BSMTStudent(String level) {
        super(level);
    }
}

class HighSchoolEvent {
    private ArrayList<Event> events = new ArrayList<>();

     public HighSchoolEvent() {
        events.add(new Event("STIvent Launch", "2024-06-01", "STI College", "All Students", "8:00 AM - 12:00 NN"));
        events.add(new Event("STIvent Tech Talk", "2024-06-05", "STI College Auditorium", "IT Students", "1:00 PM - 3:00 PM"));
    }
    public void displayEvents() {
        for (Event event : events) {
            System.out.println("- " + event.EventName);
        }
    }
}

class SeniorHighschoolEvent {

}

class CollegeEvent {

}

public class view {
    static Scanner sc = new Scanner(System.in);
    static HashMap<String, Participant> participants = new HashMap<>();
    static List<Event> events = new ArrayList<>();
    public static void main(String[] args) {
        while (true) {
            System.out.println("====== STIvent! ======");
        System.out.println("Stay uptaded with the latest school activities!");
        System.out.println("\nWelcome to STIvent!");
        System.out.println("\nFeatured Events:");
        System.out.println("\nUpcoming Activities:");
        System.out.println("Select your school Level");
        System.out.println("1. Highschool");
        System.out.println("2. Senior Highschool");
        System.out.println("3. College");
            String choice = sc.nextLine();
            if (choose(choice, "1", "one", "Highschool Student")) {
                HighSchoolEvent();
            }
            else if (choose(choice, "2", "two", "Senior Highschool Student")) {
                SeniorHighschoolEvent();
            }
            else if (choose(choice, "3", "three", "College Student")) {
                CollegeEvent();
            }
            else {
                System.out.println("Invalid choice");
            }
        }
    }
    static boolean choose(String input, String... options) {
        input = input.toLowerCase();

        for (String option : options) {
            if (input.equals(option.toLowerCase())) {
                return true;
            }
        }
        return false;
    }
}