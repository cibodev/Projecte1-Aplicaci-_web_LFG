package com.example.demo;	
	
	import java.util.Date;

	import javax.persistence.Column;
	import javax.persistence.Entity;
	import javax.persistence.GeneratedValue;
	import javax.persistence.GenerationType;
	import javax.persistence.Id;
	import javax.persistence.Table;
	import javax.persistence.Temporal;
	import javax.persistence.TemporalType;

	@Entity
	@Table(name="empleados")//en caso que la tabala sea diferente
	public class Empleados {

		//Atributos de entidad empleados
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "nomApels")//no hace falta si se llama igual
		private String nomApels;
		@Column(name = "salario")//no hace falta si se llama igual
		private int salario;
		@Column(name = "trabajo")//no hace falta si se llama igual
		private String trabajo;
		@Temporal(TemporalType.TIMESTAMP)
	
		
		//Constructores
		
		public Cliente() {
		
		}

		/**
		 * @param id
		 * @param nomApels
		 * @param salario
		 * @param trabajo
		 */
		public Empleados(Long id, String nomApels, int salario, String trabajo) {
			//super();
			this.id = id;
			this.nomApels = nomApels;
			this.salario = salario;
			this.trabajo = trabajo;
		}

		
		//Getters y Setters
		
		/**
		 * @return the id
		 */
		public Long getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(Long id) {
			this.id = id;
		}

		/**
		 * @return the nombre y apellidos
		 */
		public String getNomApels() {
			return nomApels;
		}

		/**
		 * @param nombre the nombre to set
		 */
		public void setNomApels(String nomApels) {
			this.nomApels = nomApels;
		}

		/**
		 * @return the salario
		 */
		public int getSalario() {
			return salario;
		}

		/**
		 * @param salario the salario to set
		 */
		public void setSalario(int salario) {
			this.salario = salario;
		}

		/**
		 * @return the trabajo
		 */
		public String getTrabajo() {
			return trabajo;
		}

		/**
		 * @param trabajo the trabajo to set
		 */
		public void setTrabajo(String trabajo) {
			this.trabajo = trabajo;
		}

		//Metodo impresion de datos por consola
		@Override
		public String toString() {
			return "Empleado [id=" + id + ", nomApels=" + nomApels + ", salario=" + salario + ", trabajo=" + trabajo+ "]";
		}
		
		
		
		
		
	}

	
	
}
