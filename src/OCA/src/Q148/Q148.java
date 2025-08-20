package OCA.src.Q148;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Q148 {
	public static void main(String[] args) {
		LocalDateTime dt = LocalDateTime.of(2014, 7, 31, 1, 1);
		dt.plusDays(30);
		dt.plusMonths(1);
		System.out.println(dt.format(DateTimeFormatter.ISO_DATE_TIME));
	}
}
/*
	 What is the result?
	A. An exception is thrown at runtime.
	B. 2014-07-31T01:01:00
	C. 2014-07-31
	D. 2014-09-30T00:00:00

 */





