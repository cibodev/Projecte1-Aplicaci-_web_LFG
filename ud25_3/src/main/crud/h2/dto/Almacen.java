
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
	@Table(name="almacen")//en caso que la tabla sea diferente
	public class Almacen  {
	 
		//Atributos de entidad departamentos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "codigo")//no hace falta si se llama igual
		private int codigo;
		@Column(name = "lugar")//no hace falta si se llama igual
		private String lugar;
		@Column(name = "capacidad")//no hace falta si se llama igual
		private int capacidad;
		@Temporal(TemporalType.TIMESTAMP)
		
	    @OneToMany
	    @JoinColumn(name="id")
	    private List<Almacen> almacen;
		
		//Constructores
		
		public Almacen() {
		
		}

		/**
		 * @param codigo
		 * @param lugar
		 * @param capacidad
		 */
		public Almacen(int codigo, String lugar, int capacidad) {
			//super();
			this.codigo = codigo;
			this.lugar = lugar;
			this.capacidad = capacidad;
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
		 * @return the lugar
		 */
		public String getLugar() {
			return lugar;
		}

		/**
		 * @param lugar the lugar to set
		 */
		public void setLugar(String lugar) {
			this.lugar = lugar;
		}

		/**
		 * @return the capacidad
		 */
		public int getCapacidad() {
			return capacidad;
		}

		/**
		 * @param capacidad the capacidad to set
		 */
		public void setCapacidad(int capacidad) {
			this.capacidad = capacidad;
		}
		
		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Almacen")
		public List<Almacen> getAlmacen() {
			return almacen;
		}

		/**
		 * @param almacen the almacen to set
		 */
		public void setAlmacen(List<Almacen> almacen) {
			this.almacen = almacen;
		}

		//Metodo impresion de datos por consola
		@Override
		public String toString() {
			return "Almacen [codigo=" + codigo + ", lugar=" + lugar + ", capacidad=" + capacidad + "]";
		}
		
		
		
		
		
	}

}

}
