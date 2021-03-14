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
	@Table(name="articulos")//en caso que la tabla sea diferente
	public class Articulos  {
	 
		//Atributos de entidad articulos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "codigo")//no hace falta si se llama igual
		private String codigo;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		@Column(name = "precio")//no hace falta si se llama igual
		private int precio;
		@Column(name = "fabricante")//no hace falta si se llama igual
		private int fabricante;
		@Temporal(TemporalType.TIMESTAMP)
		
	    @OneToMany
	    @JoinColumn(name="id")
	    private List<Articulos> articulos;
		
		//Constructores
		
		public Articulos() {
		
		}

		/**
		 * @param codigo
		 * @param nombre
		 * @param precio
		 * @param fabricante
		 */
		public Articulos(Long id, String codigo, String nombre, int precio, int fabricante) {
			//super();
			this.id = id;
			this.nombre = nombre;
			this.precio = precio;
			this.fabricante = fabricante;
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

		/**
		 * @return the precio
		 */
		public int getPrecio() {
			return precio;
		}

		/**
		 * @param precio the precio to set
		 */
		public void setPrecio(int precio) {
			this.precio = precio;
		}

		/**
		 * @return the fabricante
		 */
		public int getFabricante() {
			return fabricante;
		}

		/**
		 * @param fabricante the fabricante to set
		 */
		public void setFabricante(int fabricante) {
			this.fabricante = fabricante;
		}
		
		/**
		 * @return the articulos
		 */
		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulos")
		public List<Articulos> getArticulos() {
			return articulos;
		}

		/**
		 * @param articulos the articulos to set
		 */
		public void setArticulos(List<Articulos> articulos) {
			this.articulos = articulos;
		}

		//Metodo impresion de datos por consola
		@Override
		public String toString() {
			return "Articulos [id=" + id + ", nombre=" + nombre + ", precio=" + precio + ", fabricante=" + fabricante+ "]";
		}
		
		
		
		
		
	}

	
	
	
	
	
	
	
}
