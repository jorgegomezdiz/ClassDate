
public class Date {

	//declaracion de variables del constructor
	private int _year;
	private int _month;
	private int _day;
	
	//constructor de la clase
	public Date(int year, int month, int day){
		this._year = year;
		this._month = month;
		this._day = day;
	}

	//inicializar variables
	public Date(){
		_year = 2016;
		_month = 1;
		_day = 1;
	}

	//definir getter
	int get_year(){
		return _year;
	}
	
	int get_month(){
		return _month;
	}
	
	int get_day(){
		return _day;
	}
	//definir setters
	public void set_year(int _year) {
		this._year = _year;
	}
	
	public void set_month(int _month) {
		this._month = _month;
	}
	
	public void set_day(int _day) {
		this._day = _day;
	}
	
	//metodo isSameYear
	boolean isSameYear(int y){
		boolean esIgual = false;
		
		if (this._year == y) {
			esIgual = true;
		}else{
			esIgual = false;
		}
		
		return esIgual;
	}
	
	//metodo isSameMonth
	boolean isSameMonth(int m){
		boolean esIgual = false;
		
		if(this._month == m){
			esIgual = true;
		}else{
			esIgual = false;
		}
		
		return esIgual;
	}
	
	//metodo isSameDay
	boolean isSameDay(int d){
		boolean esIgual = false;
		
		if (this._day == d) {
			esIgual = true;
		}else{
			esIgual = false;
		}
		
		return esIgual;
	}
	
	//metodo isSame
	boolean isSame(int y, int m, int d){
		boolean esIgual = false;
		
		if (this._year == y && this._month == m && this._day == d) {
			esIgual = true;
		}else{
			esIgual = false;
		}
		
		return esIgual;
	}
	
	//metodo printMonth
	//imprime el nombre del mes
	String printMonth(int m){
		String month=null;
		
		switch(m){
		case 1:
			System.out.println("Enero");
			break;
		case 2:
			System.out.println("Febrero");
			break;
		case 3:
			System.out.println("Marzo");
			break;
		case 4:
			System.out.println("Abril");
			break;
		case 5:
			System.out.println("Mayo");
			break;
		case 6:
			System.out.println("Junio");
			break;
		case 7:
			System.out.println("Julio");
			break;
		case 8:
			System.out.println("Agosto");
			break;
		case 9:
			System.out.println("Septiembre");
			break;
		case 10:
			System.out.println("Octubre");
			break;
		case 11:
			System.out.println("Noviembre");
			break;
		case 12:
			System.out.println("Diciembre");
			break;
        default:
            System.out.println("Esta opcion no es un mes");
		}
		String.valueOf(m);
		return month;
	}
	
	//metodo checkDay
	//imprime los dias que tiene cada mes
	int checkDay(int m){
		int esValido=0;
		
		switch(m){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			esValido=31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			esValido=30;
			break;
		case 2:
			esValido=28;
			break;
        default:
            System.out.println("Esta opcion no es un mes");
		}
		
		return esValido;
	}
	
	//metodo printSeason
	//imprime la estacion del año segun el dia
	String printSeason(int m,int d){
		String estacion=null;
		
		switch(m){
		case 1:
		case 2:
			System.out.println("Invierno");
			break;
		case 3:
			if (d <= 20) {
				System.out.println("Invierno");
			}else {
				System.out.println("Primavera");
			}
			break;
		case 4:
		case 5:
			System.out.println("Primavera");
			break;
		case 6:
			if (d <= 20) {
				System.out.println("Primavera");
			}else {
				System.out.println("Verano");
			}
			break;
		case 7:
		case 8:
			System.out.println("Verano");
			break;
		case 9:
			if (d <= 20) {
				System.out.println("Verano");
			}else {
				System.out.println("Otoño");
			}
			break;
		case 10:
		case 11:
			System.out.println("Otoño");
			break;
		case 12:
			if (d <= 20) {
				System.out.println("Otoño");
			}else {
				System.out.println("Invierno");
			}
			break;
        default:
            System.out.println("Esta opcion no corresponde a ninguna estacion");
		}
		String.valueOf(m);
		return estacion;
	}
	
	//metodo lastMonth
	//imprime cuantos meses quedan para final de año
	int lastMonth(int m){
		int ultimoMes=0;
		ultimoMes = 12 - m;
		
		return ultimoMes;
	}
	
	//metodo printDate
	//imprime una fecha
	String printDate(int y,int m,int d){
		String unaFecha=null;
		
		unaFecha = _day + " / " + _month + " / " + _year;
		
		return unaFecha;
	}
	
	//metodo randonYear
	//devuelve el numero de intentos para encontrar el año introducido mediante una funcion aleatoria
	int randomYear(int y){
		int ale=0;//variable que aloja numeros aleatorios
		int i=0;
		int contale=0; //contador de numeros aleatorios
		while (i!=y) {
			ale = (int) (Math.random()*3000+1);//genera numeros entre 1 y 3000
			i = ale;
			contale++;
		}
		return contale;
	}
	
	//metodo randonYearDo
	int randomYearDo(int y){
		int contaledo=0;
		int i=0;
		int ale=0;
		
		do {
			ale = (int) (Math.random()*3000+1);
			i = ale;
			if (i!=y) {
				contaledo++;
			}
			
		} while (i != y);
		
		return contaledo;
	}
	
	
	
	
}
