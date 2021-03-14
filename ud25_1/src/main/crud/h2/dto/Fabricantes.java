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
	@Table(name="fabricantes")//en caso que la tabla sea diferente
	public class Fabricantes  {
	 
		//Atributos de entidad fabricantes
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "codigo")//no hace falta si se llama igual
		private String codigo;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		@Temporal(TemporalType.TIMESTAMP)
		
	    @OneToMany
	    @JoinColumn(name="id")
	    private List<fabricantes> fabricantes;
		
		//Constructores
		
		public Fabricantes() {
		
		}

		/**
		 * @param codigo
		 * @param nombre
		 */
		public Fabricantes(Long id, String codigo, String nombre) {
			//super();
			this.id = id;
			this.nombre = nombre;
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

		
		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Fabricantes")
		public List<Fabricantes> getFabricantes() {
			return fabricantes;
		}

		/**
		 * @param fabricantes the fabricantes to set
		 */
		public void setFabricantes(List<Fabricantes> fabricantes) {
			this.fabricantes = fabricantes;
		}

		//Metodo impresion de datos por consola
		@Override
		public String toString() {
			return "Fabricantes [id=" + id + ", nombre=" + nombre + "]";
		}
		
		
		
		
		
	}

	
	
	
	
	
	
	
}
