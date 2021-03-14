
package com.example.demo;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "empleados") // en caso que la tabla sea diferente
public class Empleados {

	// Atributos de entidad departamentos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // busca ultimo valor e incrementa desde id final de db
	private Long id;
	@Column(name = "DNI") // no hace falta si se llama igual
	private int dni;
	@Column(name = "nombre") // no hace falta si se llama igual
	private String nombre;
	@Column(name = "apellido") // no hace falta si se llama igual
	private String apellido;
	@Column(name = "departamento") // no hace falta si se llama igual
	private int departamento;
	@Temporal(TemporalType.TIMESTAMP)

	@OneToMany
	@JoinColumn(name = "id")
	private List<Empleados> empleados;

	// Constructores

	public Empleados() {

	}

	/**
	 * @param dni
	 * @param nombre
	 * @param apellidos
	 * @param departamento
	 */
	public Empleados(int dni, String nombre, String apellido, int presupuesto) {
		// super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
		this.presupuesto = presupuesto;

	}

	// Getters y Setters

	/**
	 * @return the dni
	 */
	public Long getDNI() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDNI(Long dni) {
		this.dni = dni;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the apellido
	 */
	public String getApellido() {
		return apellido;
	}

	/**
	 * @param apellido the apellido to set
	 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	/**
	 * @return the departamento
	 */
	public int getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento the departamento to set
	 */
	public void setDepartamento(int departamento) {
		this.departamento = departamento;
	}

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Empleados")
	public List<Empleados> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados the empleados to set
	 */
	public void setEmpleados(List<Empleados> empleados) {
		this.empleados = empleados;
	}

	// Metodo impresion de datos por consola
	@Override
		public String toString() {
			return "Empleados [dni=" + dni + ", nombre=" + nombre + ", apellidos=" + apellidos + ", departamento= "+ departamento+""]";
		}

}

}

}
