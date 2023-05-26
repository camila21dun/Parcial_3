package model;

import java.util.Optional;

import exeptions.EstudianteExeption;

public interface ManejoEstudiantes {

	public void crearEstudiante(Estudiante c) throws EstudianteExeption;

    public void actualizarEstudiante (Estudiante estudiante) throws EstudianteExeption;

	public boolean validarEstudiante(Estudiante c) throws EstudianteExeption;

	public Estudiante buscarEstudiante(Estudiante estudiante) throws EstudianteExeption;


}
