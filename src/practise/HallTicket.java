package practise;

public class HallTicket {
    private String name;
    private int age;
    private String hallTicketNumber;
    private String examTime;
    private String venue;

    public HallTicket(String name, int age, String hallTicketNumber, String examTime, String venue)
    {
        this.name = name;
        this.age = age;
        this.hallTicketNumber = hallTicketNumber;
        this.examTime = examTime;
        this.venue = venue;
    }

    // Getters (optional, but useful)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getHallTicketNumber() {
        return hallTicketNumber;
    }

    public String getExamTime() {
        return examTime;
    }

    public String getVenue() {
        return venue;
    }
}

 class Main2 {
    public static void main(String[] args) {
        // Creating a sample hall ticket
        HallTicket myHallTicket = new HallTicket("vara", 20, "HT12345", "9:00 AM", "Exam Hall A");

        // Accessing details
        System.out.println("Name: " + myHallTicket.getName());
        System.out.println("Age: " + myHallTicket.getAge());
        System.out.println("Hall Ticket Number: " + myHallTicket.getHallTicketNumber());
        System.out.println("Exam Time: " + myHallTicket.getExamTime());
        System.out.println("Venue: " + myHallTicket.getVenue());
    }
}

