package Desarollo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Desarollo {

	public static void main(String[] args) {
		HashMap<String,String> listaAlumnos = new HashMap<String,String>();
	    Scanner sc = new Scanner(System.in);
	    int opcionElegida = 0;
	    String Nombre;
	    String Edad;
	    String Carrera;
	    String FechaInscrip;

	    while (opcionElegida != 5) {
	        System.out.println("Introduce el numero de la opción que quieras:");
	        System.out.println("1.- LLenar Datos ===Importante primero===");
	        System.out.println("2.- Vaciar Lista");
	        System.out.println("3.- Mostrar Alumno por carrera");
	        System.out.println("4.- Calcular promedio De Edades");
	        System.out.println("5.- Alumnos Inscritod Despes Del 10/08/2016");
	        opcionElegida = sc.nextInt();

	        switch (opcionElegida) {
	            case 1:
	                System.out.println("Introduce el Nombre del Alumno:");
	                Nombre = sc.next();
	                System.out.println("Introduce la Edad del Alumno:");
	                Edad = sc.next();
	                System.out.println("Introduce La carrera del Alumno:");
	                Carrera = sc.next();
	                System.out.println("Introduce La fecha de Inscripcion:");
	                FechaInscrip = sc.next();
	                
	                listaAlumnos.put("Nombre", Nombre);
	                listaAlumnos.put("Edad", Edad);
	                listaAlumnos.put("Carrera", Carrera);
	                listaAlumnos.put("FechaInscrp",FechaInscrip);
	                guardarAlumno( Nombre, Edad,Carrera,FechaInscrip, listaAlumnos);
	                break;
	            case 2:
	            	listaAlumnos.clear();
	                break;
	            case 3:
	                mostrarAlumnosPorCarrera(listaAlumnos);
	                break;
	            case 4:
	                CalcularElPromedioDeEdades();
	                break;
	            case 5:
	            	CantidadDeAlumnosIncreitosDespuesDeEl10del08del2016();
	                break;   
	            default:
	                System.out.println("Tienes que introducir una opción valida");
	}
	    }

}

	private static void CantidadDeAlumnosIncreitosDespuesDeEl10del08del2016() {
	
		
	}

	private static void CalcularElPromedioDeEdades() {
		String PromedioDeEdades ;
		
			
		}
	private static void mostrarAlumnosPorCarrera(HashMap<String, String> listaAlumnos) {
		
	}

	private static void guardarAlumno(String nombre, String edad, String carrera, String fechaInscrip,
			HashMap<String, String> listaAlumnos) {
		 if (listaAlumnos.containsKey(nombre)) {
		        System.out.println("No se puede introducir esta repetido.");
		    } else {
		    	listaAlumnos.put(nombre,edad );               
		    }
		}
	public static void mostrarProductos(HashMap<String,String> listaAlumnos) {
	    String clave;
	    Iterator<String> Alumnos = listaAlumnos.keySet().iterator();
	    System.out.println("Hay los siguientes Alumnos:");
	    while(Alumnos.hasNext()){
	        clave =  Alumnos.next();
	        System.out.println(clave + " - " + listaAlumnos.get(clave));
	    }        
	}
		
	}
