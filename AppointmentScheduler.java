import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {

    private static final DateTimeFormatter appointment = DateTimeFormatter.ofPattern("M/d/yyyy H:mm:ss");

    public LocalDateTime schedule(String appointmentDateDescription) {
        return LocalDateTime.parse(appointmentDateDescription, appointment);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        String hour = "";
        if (appointmentDate.getHour() >= 13){
            if (appointmentDate.getMinute() == 0){
                hour += String.format("%d:00 PM", appointmentDate.getHour() - 12);
            } else if (appointmentDate.getMinute() < 10) {
                hour += String.format("%d:0%d PM", appointmentDate.getHour() - 12, appointmentDate.getMinute());
            } else  {
                hour += String.format("%d:%d PM", appointmentDate.getHour() - 12, appointmentDate.getMinute());
            }
        }
        else {
            if (appointmentDate.getMinute() == 0){
                hour += String.format("%d:00 PM AM", appointmentDate.getHour() );
            } else if (appointmentDate.getMinute() < 10) {
                hour += String.format("%d:0%d AM", appointmentDate.getHour() , appointmentDate.getMinute());
            } else  {
                hour += String.format("%d:%d AM", appointmentDate.getHour() , appointmentDate.getMinute());
            }
        }
        return String.format("You have an appointment on %s, %s %d, %d, at %s.",
                appointmentDate.getDayOfWeek().toString().substring(0, 1).toUpperCase() + appointmentDate.getDayOfWeek().toString().substring(1).toLowerCase(),
                appointmentDate.getMonth().toString().substring(0, 1).toUpperCase() + appointmentDate.getMonth().toString().substring(1).toLowerCase(),
                appointmentDate.getDayOfMonth(),
                appointmentDate.getYear(),
                hour
                );
    }

    public LocalDate getAnniversaryDate() {
        LocalDate localDate = LocalDate.now();
        return LocalDate.of(LocalDate.now().getYear(), 9, 15);

    }
}
