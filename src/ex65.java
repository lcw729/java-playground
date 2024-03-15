import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class ex65 {
    public static void main(String[] args) {
        // 날짜관련 클래스
        // Date => LocalDate, LocalTime, LocalDateTime
        // JDK 1.8이상 지원
        // LocalDate : 날짜
        // LocalTime : 시간
        // LocalDateTime : 날짜시간

        LocalDate now = LocalDate.now(); // 현재 날짜 가져옴
        System.out.println( now );

        LocalDate birthDay = LocalDate.of(2000, 12, 1);
        System.out.println(birthDay);

//        LocalDate xmas = LocalDate.parse("2023-12-25");
//        System.out.println(xmas);

        // "2023/12/25" "20231225" "2022 12 25" "2022:12:25" 안됨.
        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate xmas2 = LocalDate.parse("2023/12/25", formatter);
        System.out.println(xmas2);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        // 타이존
        LocalTime parisTime = LocalTime.now(ZoneId.of("Europe/Paris"));
        System.out.println(parisTime);
        LocalTime seoulTime = LocalTime.now(ZoneId.of("Asia/Seoul"));
        System.out.println(seoulTime);

        // 시간 설정하기
        LocalTime sleepTime = LocalTime.of(23, 30, 0);
        LocalTime getupTime = sleepTime.plusHours(8);
        LocalTime inhouseTIme = sleepTime.minusHours(5);
        System.out.println(sleepTime);
        System.out.println(getupTime);
        System.out.println(inhouseTIme);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime); // 2024-03-15T10:14:29.946377
        System.out.println(dateTime.getYear());
        System.out.println(dateTime.getDayOfWeek());
        System.out.println(dateTime.getMonth()); // 달은 1부터 시작

        // 클래스 필드      MySQL(MariaDB)       Oracle
        // String         varchar              varchar2
        // int long       INT                  number
        // float double   FLOAT                float
        // Date           DATE                 date
        // LocalDate      DATE                 date
        // LocalDateTime  DATETIME             date
        LocalDate localDate = LocalDate.now();
        LocalDate xmas = LocalDate.of(2024,12,25);
        long Dday = ChronoUnit.DAYS.between(localDate, xmas);
//        int days = xmas.getDayOfYear() - localDate.getDayOfYear();

        System.out.println("TODAY: "+ localDate);
        System.out.println("X-MAX: "+ xmas);
        System.out.println("D-" + Dday);


    }
}
