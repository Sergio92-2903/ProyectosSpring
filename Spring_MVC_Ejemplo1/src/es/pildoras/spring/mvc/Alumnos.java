package es.pildoras.spring.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.sun.istack.internal.NotNull;

import es.pildoras.spring.mvc.validacionespersonalizadas.CPostalMadrid;

public class Alumnos {

	@NotNull
	@Size(min = 2, message = "Campo requerido")
	private String nombre;

	@NotNull
	@Size(min = 2, message = "Campo requerido")
	private String apellido;

	@Min(value = 10, message = "No se permiten menores de 10 años")
	@Max(value = 100, message = "No se permiten personas mayores de 100 años")
	private int edad;

	//@Pattern(regexp="[0-9]{5}",message="Sólo cinco valores numéricos")
	@CPostalMadrid
	private String codigoPostal;

	private String optativa;

	private String ciudadEstudios;

	private String idiomasAlumnos;

	@Email
	private String email;

	public String getCodigoPostal() {
		return codigoPostal;
	}

	public void setCodigoPostal(String codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getIdiomasAlumnos() {
		return idiomasAlumnos;
	}

	public void setIdiomasAlumnos(String idiomasAlumnos) {
		this.idiomasAlumnos = idiomasAlumnos;
	}

	public String getCiudadEstudios() {
		return ciudadEstudios;
	}

	public void setCiudadEstudios(String ciudadEstudios) {
		this.ciudadEstudios = ciudadEstudios;
	}

	public String getOptativa() {
		return optativa;
	}

	public void setOptativa(String optativa) {
		this.optativa = optativa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

}
