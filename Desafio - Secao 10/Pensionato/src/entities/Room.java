package entities;

public class Room {
    private String nameStudent;
    private String emailStudent;

    public Room(String nameStudent, String emailStudent) {
        this.nameStudent = nameStudent;
        this.emailStudent = emailStudent;
    }

    @Override
    public String toString() {
        return "nameStudent:" + nameStudent + '\'' +
                ", emailStudent='" + emailStudent + '\'' +
                '}';
    }
}
