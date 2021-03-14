
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
	@Table(name="departamentos")//en caso que la tabla sea diferente
	public class Departamentos  {
	 
		//Atributos de entidad departamentos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "codigo")//no hace falta si se llama igual
		private String codigo;
		@Column(name = "nombre")//no hace falta si se llama igual
		private String nombre;
		@Column(name = "presupuesto")//no hace falta si se llama igual
		private int presupuesto;
		@Temporal(TemporalType.TIMESTAMP)
		
	    @OneToMany
	    @JoinColumn(name="id")
	    private List<Departamentos> departamentos;
		
		//Constructores
		
		public Departamentos() {
		
		}

		/**
		 * @param codigo
		 * @param nombre
		 * @param presupuesto
		 */
		public Articulos(int codigo, String nombre, int presupuesto) {
			//super();
			this.codigo = codigo;
			this.nombre = nombre;
			this.presupuesto = presupuesto;
		}

		
		//Getters y Setters
		
		/**
		 * @return the codigo
		 */
		public Long getCodigo() {
			return codigo;
		}

		/**
		 * @param codigo the codigo to set
		 */
		public void setCodigo(Long codigo) {
			this.codigo = codigo;
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
		 * @return the presupuesto
		 */
		public int getPresupuesto() {
			return presupuesto;
		}

		/**
		 * @param presupuesto the presupuesto to set
		 */
		public void setPresupuesto(int presupuesto) {
			this.presupuesto = presupuesto;
		}

		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Departamentos")
		public List<Departamentos> getDepartamentos() {
			return departamentos;
		}

		/**
		 * @param departamentos the departamentos to set
		 */
		public void setDepartamentos(List<Departamentos> departamentos) {
			this.departamentos = departamentos;
		}

		//Metodo impresion de datos por consola
		@Override
		public String toString() {
			return "Departamentos [codigo=" + codigo + ", nombre=" + nombre + ", presupuesto=" + presupuesto + "]";
		}
		
		
		
		
		
	}

	
	
	
	
	
	
	
}

	
	
	
	
	
}
