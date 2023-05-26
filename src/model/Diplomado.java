package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import exeptions.EstudianteExeption;



public class Diplomado {

	//ATRIBUTOS
	private String nombre;
	private int cupo;
	private List<Estudiante>listaEstudiantes = new ArrayList<Estudiante>();


	public Diplomado() {
		super();
	}

	public Diplomado(String nombre, int cupo, List<Estudiante> listaEstudiantes) {
		super();
		this.nombre = nombre;
		this.cupo = cupo;
		this.listaEstudiantes = listaEstudiantes;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCupo() {
		return cupo;
	}

	public void setCupo(int cupo) {
		this.cupo = cupo;
	}

	public List<Estudiante> getListaEmpleados() {
		return listaEstudiantes;
	}

	public void setListaEmpleados(List<Estudiante> listaEmpleados) {
		this.listaEstudiantes = listaEmpleados;
	}

/**
 * metodo que crea al estudiente
 * @param c
 * @throws EstudianteExeption
 */
	public void crearEstudiante(Estudiante c) throws EstudianteExeption {
		if(!validarEstudiante(c)){
			listaEstudiantes.add(c);
		}
	}
/**
 * metodo que actualice el estudiente
 * @param estudiante
 * @throws EstudianteExeption
 */
    public void actualizarEstudiante (Estudiante estudiante) throws EstudianteExeption {
		if(!validarEstudiante(estudiante)){
			throw new EstudianteExeption("El estudiante no existe");
		}
		int pos = listaEstudiantes.indexOf(estudiante);
		listaEstudiantes.set(pos, estudiante);
	}
/***
 * metodo que valida los datos
 * @param c
 * @return
 * @throws EstudianteExeption
 */
	public boolean validarEstudiante(Estudiante c) throws EstudianteExeption {
		return buscarEstudiante(c)!=null;
	}
/**
 * metodo que busca al estudiente
 * @param estudiante
 * @return
 * @throws EstudianteExeption
 */
	public Estudiante buscarEstudiante(Estudiante estudiante) throws EstudianteExeption {
		if(estudiante==null){
			throw new EstudianteExeption("El estudiente que busca no existe");
		}
		Optional<Estudiante> findFirst =listaEstudiantes.stream().filter(c -> c.equals(estudiante)).findFirst();
		return findFirst.orElse(null);
	}
/**
 * metodo que muestra los estudiantes
 */
	public void mostrarEstudiantes() {
        for (Estudiante estudiante : listaEstudiantes) {
            System.out.println(estudiante);
        }
    }
/**
 * metodo que calcula el promedio de los estudieantes
 * @param id
 * @return
 */
    public float calcularPromedioEstudiante(String id) {
        for (Estudiante estudiante : listaEstudiantes) {
            if (estudiante.getIdentificacion() == id) {
                return estudiante.calcularPromedio();
            }
        }
        return 0;
    }
/**
 * calcular promedio total del estudieantes
 * @return
 */
    public float calcularPromedioTotal() {
        float suma = 0;
        for (Estudiante estudiante : listaEstudiantes) {
            suma += estudiante.calcularPromedio();
        }
        return suma / listaEstudiantes.size();
    }
/**
 * metodo que muestra el mejor estudiante
 * @return
 */
    public String mostrarMejorEstudiante() {
        Estudiante mejorEstudiante = null;
        float mejorPromedio = 0;
        for (Estudiante estudiante : listaEstudiantes) {
            float promedio = estudiante.calcularPromedio();
            if (promedio > mejorPromedio) {
                mejorPromedio = promedio;
                mejorEstudiante = estudiante;
            }
        }
        return mejorEstudiante.getNombre();
    }

}
