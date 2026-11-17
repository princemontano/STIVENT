package STIvent;
import java.util.*;

class Event {

    private String eventName;
    private String eventDate;
    private String eventPlace;
    private String eventTime;
    private String eventDescription;
    private ArrayList<String> targetLevels;
    private ArrayList<String> targetCourses;

    Event(String name, String date, String place, String time,
          String description, ArrayList<String> levels,
          ArrayList<String> courses) {

        this.eventName = name;
        this.eventDate = date;
        this.eventPlace = place;
        this.eventTime = time;
        this.eventDescription = description;
        this.targetLevels = levels;
        this.targetCourses = courses;
            }

    public String getEventName() {
        return eventName;
   }

    public String getEventDate() {
        return eventDate;
  }

    public String getEventPlace() {
        return eventPlace;
   }

    public String getEventTime() {
        return eventTime;
      }

    public String getEventDescription() {
        return eventDescription;
     }

    public ArrayList<String> getTargetLevels() {
        return targetLevels;
    }

    public ArrayList<String> getTargetCourses() {
        return targetCourses;
    }

    public void displayDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Event Date: " + eventDate);
        System.out.println("Event Place: " + eventPlace);
        System.out.println("Event Time: " + eventTime);
        System.out.println("Description: " + eventDescription);
        System.out.println();
    }
}

class StudentSelection {
    private String schoolLevel;
    private String course;

    StudentSelection(String level, String course) {
        this.schoolLevel = level;
        this.course = course;
    }
    public String getSchoolLevel() {
        return schoolLevel;
    }
    public String getCourse() {
        return course;
    }
}

class EventData {
    public static ArrayList<Event> getEvents() {

        ArrayList<Event> events = new ArrayList<>();

        events.add(new Event("STIvent Launch", "2026-12-01", "STI College", "8:00 AM - 12:00 NN", "School-wide event",
            new ArrayList<>(Arrays.asList("ALL")),
            new ArrayList<>(Arrays.asList("ALL"))
        ));

        events.add(new Event("Junior High School Activity", "2026-12-05", "School Auditorium", "9:00 AM - 12:00 NN", "Activity for all Junior High School students",
            new ArrayList<>(Arrays.asList("Junior High School")),
            new ArrayList<>(Arrays.asList("ALL"))
        ));

        events.add(new Event("Senior High School Seminar", "2026-12-08", "School Auditorium", "1:00 PM - 3:00 PM", "Seminar for all Senior High School students",
            new ArrayList<>(Arrays.asList("Senior High School")),
            new ArrayList<>(Arrays.asList("ALL"))
        ));

        events.add(new Event("STEM Seminar", "2026-12-10", "School Auditorium", "9:00 AM - 12:00 NN", "Seminar for STEM and ETM students",
            new ArrayList<>(Arrays.asList("Senior High School")),
            new ArrayList<>(Arrays.asList("STEM and ETM"))
        ));

        events.add(new Event("ICT Technology Activity", "2026-12-12", "Computer Laboratory", "1:00 PM - 3:00 PM", "Activity for ICT and SCPT students",
            new ArrayList<>(Arrays.asList("Senior High School")),
            new ArrayList<>(Arrays.asList("ICT and SCPT"))
        ));

        events.add(new Event("IT Technology Seminar", "2026-12-15", "Computer Laboratory", "1:00 PM - 3:00 PM", "Seminar for IT students",
            new ArrayList<>(Arrays.asList("College")),
            new ArrayList<>(Arrays.asList("BSIT"))
        ));

        events.add(new Event("College Sports Festival", "2026-12-18", "School Gymnasium", "8:00 AM - 5:00 PM", "Sports event for all college courses",
            new ArrayList<>(Arrays.asList("College")),
            new ArrayList<>(Arrays.asList("ALL"))
        ));

        return events;
    }
}

class EventManager {
    private ArrayList<Event> events;

    EventManager(ArrayList<Event> events) {
        this.events = events;
    }

    public ArrayList<Event> getApplicableEvents(
        StudentSelection student) {

        ArrayList<Event> matchingEvents = new ArrayList<>();

        for (Event event : events) {

            boolean levelMatch =
                event.getTargetLevels().contains("ALL") ||
                event.getTargetLevels().contains(
                    student.getSchoolLevel()
                );

            boolean courseMatch =
                event.getTargetCourses().contains("ALL") ||
                (student.getCourse() != null &&
                 event.getTargetCourses().contains(
                    student.getCourse()
                 ));

            if (levelMatch && courseMatch) {
                matchingEvents.add(event);
            }
        }

        return matchingEvents;
    }
}

public class view {
static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("------- STIvent! -------");
        System.out.println("Stay updated with the latest school activities!");
        System.out.println("\nWelcome to STIvent!");

        System.out.println("\nSelect your school level:");
        System.out.println("1. Junior High School");
        System.out.println("2. Senior High School");
        System.out.println("3. College\n");

     System.out.print("\nEnter: ");
     String choice = sc.nextLine();

     String level = "";
     String course = null;

        if (choice.equals("1")) {
            level = "Junior High School";
        }
        else if (choice.equals("2")) {

            level = "Senior High School";

            System.out.println("\nSelect your strand:");
            System.out.println("1. HTCUA");
            System.out.println("2. HTTO");
            System.out.println("3. ASSH");
            System.out.println("4. STEM and ETM");
            System.out.println("5. B and E");
            System.out.println("6. ICT and SCPT\n");

            System.out.print("\nEnter: ");
            String strandChoice = sc.nextLine();

            switch (strandChoice) {
                case "1":
                    course = "HTCUA";
                    break;
                case "2":
                    course = "HTTO";
                    break;
                case "3":
                    course = "ASSH";
                    break;
                case "4":
                    course = "STEM and ETM";
                    break;
                case "5":
                    course = "B and E";
                    break;
                case "6":
                    course = "ICT and SCPT";
                    break;
                default:
                    System.out.println("Invalid strand selection.");
                    return;
            }
        }
        else if (choice.equals("3")) {

          level = "College";
            System.out.println("\nSelect your course:");
            System.out.println("1. BSCS");
            System.out.println("2. BSIT");
            System.out.println("3. BSAIS");
            System.out.println("4. BSA");
            System.out.println("5. BSHM");
            System.out.println("6. BSTM");
            System.out.println("7. BSNAME");
            System.out.println("8. BSMarE");
            System.out.println("9. BSMT");

            System.out.print("\nEnter: ");
            String courseChoice = sc.nextLine();

            switch (courseChoice) {
                case "1":
                    course = "BSCS";
                    break;
                case "2":
                    course = "BSIT";
                    break;
                case "3":
                    course = "BSAIS";
                    break;
                case "4":
                    course = "BSA";
                    break;
                case "5":
                    course = "BSHM";
                    break;
                case "6":
                    course = "BSTM";
                    break;
                case "7":
                    course = "BSNAME";
                    break;
                case "8":
                    course = "BSMarE";
                    break;
                case "9":
                    course = "BSMT";
                    break;
                default:
                    System.out.println("Invalid course selection.");
                    return;
            }
        }
        else {
            System.out.println("Invalid school level selection.");
            return;
        }

        StudentSelection student =
            new StudentSelection(level, course);

        EventManager manager =
            new EventManager(EventData.getEvents());

        ArrayList<Event> applicableEvents =
            manager.getApplicableEvents(student);

        System.out.println("\n------- Upcoming Events -------");

        if (applicableEvents.isEmpty()) {
            System.out.println("No available events.");
        }
        else {
            for (Event event : applicableEvents) {
                event.displayDetails();
            }
        }
    }
}