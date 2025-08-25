import java.util.*;

//Clase abstracta Persona
abstract class Persona {
 protected String nombre;
 protected String correo;

 public Persona(String nombre, String correo) {
     this.nombre = nombre;
     this.correo = correo;
 }

 public String getNombre() {
     return nombre;
 }

 public abstract void mostrarInfo();
}

//Clase Estudiante
class Estudiante extends Persona {
 public Estudiante(String nombre, String correo) {
     super(nombre, correo);
 }

 @Override
 public void mostrarInfo() {
     System.out.println("Estudiante: " + nombre + " | Correo: " + correo);
 }
}

//Clase Profesor
class Profesor extends Persona {
 public Profesor(String nombre, String correo) {
     super(nombre, correo);
 }

 @Override
 public void mostrarInfo() {
     System.out.println("Profesor: " + nombre + " | Correo: " + correo);
 }
}

//Clase Curso
class Curso {
 private static int contador = 1;
 private int id;
 private String nombre;
 private String categoria;
 private Profesor profesor;
 private List<Estudiante> estudiantes;

 public Curso(String nombre, String categoria) {
     this.id = contador++;
     this.nombre = nombre;
     this.categoria = categoria;
     this.estudiantes = new ArrayList<>();
 }

 public void asignarProfesor(Profesor profesor) {
     this.profesor = profesor;
 }

 public void inscribir(Estudiante e) {
     estudiantes.add(e);
 }

 @Override
 public String toString() {
     return "Curso: " + nombre +
            " | Categoría: " + categoria +
            " | Profesor: " + (profesor != null ? profesor.getNombre() : "Sin asignar") +
            " | Inscritos: " + estudiantes.size();
 }
}

//Clase SistemaGestion
class SistemaGestion {
 private List<Curso> cursos = new ArrayList<>();

 public void agregarCurso(Curso c) {
     cursos.add(c);
 }

 public void mostrarCursosDisponibles() {
     for (Curso c : cursos) {
         System.out.println(c);
     }
 }
}

//Clase principal
public class Main {
 public static void main(String[] args) {
     SistemaGestion sg = new SistemaGestion();

     Profesor prof1 = new Profesor("Ana", "ana@uni.com");
     Profesor prof2 = new Profesor("Carlos", "carlos@uni.com");

     Estudiante est1 = new Estudiante("Luis", "luis@uni.com");
     Estudiante est2 = new Estudiante("María", "maria@uni.com");
     Estudiante est3 = new Estudiante("Pedro", "pedro@uni.com");

     Curso curso1 = new Curso("Matemáticas", "Álgebra");
     curso1.asignarProfesor(prof1);
     curso1.inscribir(est1);
     curso1.inscribir(est2);

     Curso curso2 = new Curso("Programación", "Java");
     curso2.asignarProfesor(prof2);
     curso2.inscribir(est3);

     sg.agregarCurso(curso1);
     sg.agregarCurso(curso2);

     System.out.println("Cursos disponibles:");
     sg.mostrarCursosDisponibles();
 }
}
