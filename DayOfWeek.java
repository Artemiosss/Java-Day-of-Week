import java.util.*;											  //подключаем библиотеки java.util
public class DayOfWeek{
	public static void main (String[] args){
		Scanner ent = new Scanner (System.in);        //создаём объект сканера
		System.out.println();		
		System.out.println("-----------------------------------------------");
		System.out.println("Welcome to the day of week calculating software");
		System.out.println("-----------------------------------------------");
		System.out.println();		
		System.out.print("Year:");
      int year=ent.nextInt();									
      System.out.print("Month:");
      int month=ent.nextInt()-1;
      System.out.print("Day:");
      int day=ent.nextInt();
      GregorianCalendar dd= new GregorianCalendar(); //создаём объект календаря
		dd.set (year, month, day);
		int dow=dd.get(Calendar.DAY_OF_WEEK);
		System.out.println();
		month=month+1;
		if (dow==2){
			System.out.println(day+"."+month+"."+year+" is "+"Monday");
		}
		if (dow==3){
			System.out.println(day+"."+month+"."+year+" is "+"Tuesday");
		}
		if (dow==4){
			System.out.println(day+"."+month+"."+year+" is "+"Wednesday");
		}
		if (dow==5){
			System.out.println(day+"."+month+"."+year+" is "+"Thursday");
		}
		if (dow==6){
			System.out.println(day+"."+month+"."+year+" is "+"Friday");
		}
		if (dow==7){
			System.out.println(day+"."+month+"."+year+" is "+"Saturday");
		}
		if (dow==1){
			System.out.println(day+"."+month+"."+year+" is "+"Sunday");
		}	
	}
}