
interface SchoolManagementApp {
    void integrateSystem();
}


class AttendanceSystem {
    public void markAttendance() {
        System.out.println("Attendance system has been integrated and is recording attendance.");
    }
}

class GradingSystem {
    public void recordGrades() {
        System.out.println("Grading system has been integrated and is recording grades.");
    }
}

class LibrarySystem {
    public void manageBooks() {
        System.out.println("Library system has been integrated and is managing books.");
    }
}


class AttendanceSystemAdapter implements SchoolManagementApp {
    private AttendanceSystem attendanceSystem;

    public AttendanceSystemAdapter(AttendanceSystem attendanceSystem) {
        this.attendanceSystem = attendanceSystem;
    }

    @Override
    public void integrateSystem() {
        attendanceSystem.markAttendance();
    }
}

class GradingSystemAdapter implements SchoolManagementApp {
    private GradingSystem gradingSystem;

    public GradingSystemAdapter(GradingSystem gradingSystem) {
        this.gradingSystem = gradingSystem;
    }

    @Override
    public void integrateSystem() {
        gradingSystem.recordGrades();
    }
}

class LibrarySystemAdapter implements SchoolManagementApp {
    private LibrarySystem librarySystem;

    public LibrarySystemAdapter(LibrarySystem librarySystem) {
        this.librarySystem = librarySystem;
    }

    @Override
    public void integrateSystem() {
        librarySystem.manageBooks();
    }
}


public class Main {
    public static void main(String[] args) {
        SchoolManagementApp attendanceAdapter = new AttendanceSystemAdapter(new AttendanceSystem());
        SchoolManagementApp gradingAdapter = new GradingSystemAdapter(new GradingSystem());
        SchoolManagementApp libraryAdapter = new LibrarySystemAdapter(new LibrarySystem());

        attendanceAdapter.integrateSystem();
        gradingAdapter.integrateSystem();
        libraryAdapter.integrateSystem();
    }
}