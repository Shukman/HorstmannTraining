package Training160507;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarTest {
	
	public static void main(String[] args) {
		
		//построить объект d текущей деты
		GregorianCalendar d = new GregorianCalendar();
		
		int today = d.get(Calendar.DAY_OF_MONTH);
		int month = d.get(Calendar.MONTH);
		
		//установить объект d  на начало месяца
		d.set(Calendar.DAY_OF_MONTH, 1);
		
		int weekday = d.get(Calendar.DAY_OF_WEEK);
		
		//получить первый день недели (май воскресенье в России)
		int firstDayOfWeek = d.getFirstDayOfWeek();
		
		//определить отступ, требующийся в первой строке
		int indent = 0;
		
		while (weekday != firstDayOfWeek){
			indent++;
			d.add(Calendar.DAY_OF_MONTH, -1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}
		//вывести название дней недели
		String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();
		
		do {
			System.out.printf("%4s", weekdayNames[weekday]);
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
		}
		while(weekday != firstDayOfWeek);
		System.out.println();
		
		for (int i = 1; i <= indent; i++) {
			System.out.print("    ");
		}
		
		d.set(Calendar.DAY_OF_MONTH, 1);
		
		do{
			//вывести день недели
			int day = d.get(Calendar.DAY_OF_MONTH);
			System.out.printf("%3d", day);
			
			//пометить текущий день знамком *
			if(day == today) {
				System.out.print("*");
			} else {
				System.out.print(" ");
			}
			
			//продвинуть объект d к следующему дню
			d.add(Calendar.DAY_OF_MONTH, 1);
			weekday = d.get(Calendar.DAY_OF_WEEK);
			
			//начать очередную неделю с новой строки
			if(weekday == firstDayOfWeek) {
				System.out.println();
			}
		}
		while(d.get(Calendar.MONTH) == month);
		
		//завершить цикл, когда в объекте d устанавливается первый день следующего месяца
		
		//переместить строку если требуется
		if(weekday != firstDayOfWeek) {
			System.out.println();
		}
	}
}
