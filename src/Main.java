import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int y;
		int m;
		int d;
		y = sc.nextInt();
		m = sc.nextInt();
		d = sc.nextInt();
		
		//fecha por defecto
		int y2 = 2016;//el dia de esta fecha es viernes
		int m2 = 1;
		int d2 = 1;
		
		Date fecha1 = new Date(y,m,d);

		
		//pruebas
		boolean esano=false;
		boolean esmes=false;
		boolean esdia=false;
		boolean eslamisma=false;
		String imprmes=null;
		int comprdia=0;
		String comprestac=null;
		int ultimes=0;
		String imprimirfecha;
		
		
		esano = fecha1.isSameYear(y2);
		esmes = fecha1.isSameMonth(m2);
		esdia = fecha1.isSameDay(d2);
		eslamisma = fecha1.isSame(y2, m2, d2);
		System.out.println(esano);
		System.out.println(esmes);
		System.out.println(esdia);
		System.out.println(eslamisma);
		
		imprmes = fecha1.printMonth(m);
		comprdia = fecha1.checkDay(m);
		System.out.println(comprdia);
		comprestac = fecha1.printSeason(m, d);
		//definir estaciones del año. algunos meses pertenecen a distintas estaciones
		ultimes = fecha1.lastMonth(m);
		System.out.println(ultimes);
		imprimirfecha = fecha1.printDate(y, m, d);
		System.out.println(imprimirfecha);
		
		//imprime todas las fechas hasta final de mes
		for (int i = d; i <= fecha1.checkDay(m); i++) {
			System.out.println(i + " / " + m + " / " + y); 
		}
		
		//imprime los meses con el mismo numero de dias del mes introducido
		if (m==1 || m==3 || m==5 || m==7 || m==8 || m==10 || m==12) {
			System.out.println("Enero");
			System.out.println("Marzo");
			System.out.println("Mayo");
			System.out.println("Julio");
			System.out.println("Agosto");
			System.out.println("Octubre");
			System.out.println("Diciembre");
		}else if (m==4 || m==6 || m==9 || m==11) {
			System.out.println("Abril");
			System.out.println("Junio");
			System.out.println("Septiembre");
			System.out.println("Noviembre");
		}else if (m==2) {
			System.out.println("Febrero");
		}
		
		//imprime los dias que an pasado desde principo de año
		int diasprincipioaño=0;
		int contday=0;
		for (int i = 1; i <= m; i++) {
			
			if (i==1 && m==1) {
				System.out.println(d);
			}else if (i==2 && m==2) {
				diasprincipioaño = fecha1.checkDay(1) + d;
				System.out.println(diasprincipioaño);
			}else if (i==3 && m==3 ) {
				contday=31;
				diasprincipioaño = contday + fecha1.checkDay(2) + d;
				System.out.println(diasprincipioaño);
			}else if (i==4 && m==4 ) {
				contday=59;
				diasprincipioaño = contday + fecha1.checkDay(3) + d;
				System.out.println(diasprincipioaño);
			}else if (i==5 && m==5 ) {
				contday=90;
				diasprincipioaño = contday + fecha1.checkDay(4) + d;
				System.out.println(diasprincipioaño);
			}else if (i==6 && m==6 ) {
				contday=120;
				diasprincipioaño = contday + fecha1.checkDay(5) + d;
				System.out.println(diasprincipioaño);
			}else if (i==7 && m==7 ) {
				contday=151;
				diasprincipioaño = contday + fecha1.checkDay(6) + d;
				System.out.println(diasprincipioaño);
			}else if (i==8 && m==8 ) {
				contday=181;
				diasprincipioaño = contday + fecha1.checkDay(7) + d;
				System.out.println(diasprincipioaño);
			}else if (i==9 && m==9 ) {
				contday=212;
				diasprincipioaño = contday + fecha1.checkDay(8) + d;
				System.out.println(diasprincipioaño);
			}else if (i==10 && m==10 ) {
				contday=243;
				diasprincipioaño = contday + fecha1.checkDay(9) + d;
				System.out.println(diasprincipioaño);
			}else if (i==11 && m==11 ) {
				contday=273;
				diasprincipioaño = contday + fecha1.checkDay(10) + d;
				System.out.println(diasprincipioaño);
			}else if (i==12 && m==12 ) {
				contday=304;
				diasprincipioaño = contday + fecha1.checkDay(11) + d;
				System.out.println(diasprincipioaño);
			}
		}
		
		//intentos para encontrar el año con un numero aleatorio echo con while
		int contale=0;
		contale = fecha1.randomYear(y);
		System.out.println(contale + " Intentos");
		
		//intentos para encontrar el año con un metodo aleatorio echo con do-while
		int contaledo=0;
		contaledo = fecha1.randomYearDo(y);
		System.out.println(contaledo + " Intentos");
		
		//saber el dia de la semana de una fechas dada
		int contaño;
		int conttotaldias=0;
		
		contaño = y - y2;
		
		int diasprincipioaño2=0;
		int contday2=0;
		for (int i = 1; i <= m; i++) {
			
			if (i==1 && m==1) {
				conttotaldias = contaño*365 + d;
			}else if (i==2 && m==2) {
				diasprincipioaño2 = fecha1.checkDay(1) + d;
				conttotaldias = contaño*365 + diasprincipioaño2;
			}else if (i==3 && m==3 ) {
				contday2=31;
				diasprincipioaño2 = contday + fecha1.checkDay(2) + d;
				conttotaldias = contaño*365 + diasprincipioaño2;
			}else if (i==4 && m==4 ) {
				contday2=59;
				diasprincipioaño2 = contday + fecha1.checkDay(3) + d;
				conttotaldias = contaño*365 + diasprincipioaño2;
			}else if (i==5 && m==5 ) {
				contday2=90;
				diasprincipioaño2 = contday + fecha1.checkDay(4) + d;
				conttotaldias = contaño*365 + diasprincipioaño2;
			}else if (i==6 && m==6 ) {
				contday2=120;
				diasprincipioaño2 = contday + fecha1.checkDay(5) + d;
				conttotaldias = contaño*365 + diasprincipioaño2;
			}else if (i==7 && m==7 ) {
				contday2=151;
				diasprincipioaño2 = contday + fecha1.checkDay(6) + d;
				conttotaldias = contaño*365 + diasprincipioaño2;
			}else if (i==8 && m==8 ) {
				contday2=181;
				diasprincipioaño2 = contday + fecha1.checkDay(7) + d;
				conttotaldias = contaño*365 + diasprincipioaño2;
			}else if (i==9 && m==9 ) {
				contday2=212;
				diasprincipioaño2 = contday + fecha1.checkDay(8) + d;
				conttotaldias = contaño*365 + diasprincipioaño2;
			}else if (i==10 && m==10 ) {
				contday2=243;
				diasprincipioaño2 = contday + fecha1.checkDay(9) + d;
				conttotaldias = contaño*365 + diasprincipioaño2;
			}else if (i==11 && m==11 ) {
				contday2=273;
				diasprincipioaño2 = contday + fecha1.checkDay(10) + d;
				conttotaldias = contaño*365 + diasprincipioaño2;
			}else if (i==12 && m==12 ) {
				contday2=304;
				diasprincipioaño2 = contday + fecha1.checkDay(11) + d;
				conttotaldias = contaño*365 + diasprincipioaño2;
			}
		}
		
		
		int contsem=0;
		contsem = conttotaldias%7;
		if (contsem == 0) {
			System.out.println("Es Viernes ");
		}else if (contsem == 1) {
			System.out.println("Es Sabado");
		}else if (contsem == 2) {
			System.out.println("Es Domingo");
		}else if (contsem == 3) {
			System.out.println("Es Lunes");
		}else if (contsem == 4) {
			System.out.println("Es Martes");
		}else if (contsem == 5) {
			System.out.println("Es Miercoles");
		}else if (contsem == 6) {
			System.out.println("Es Jueves");
		}

		
		
	}

}
