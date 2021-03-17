
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
	@Table(name="caja")//en caso que la tabla sea diferente
	public class Caja  {
	 
		//Atributos de entidad departamentos
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
		private Long id;
		@Column(name = "numReferencia")//no hace falta si se llama igual
		private String numReferencia;
		@Column(name = "contenido")//no hace falta si se llama igual
		private String contenido;
		@Column(name = "valor")//no hace falta si se llama igual
		private int valor;
		@Column(name = "almacen")//no hace falta si se llama igual
		private int almacen;
		@Temporal(TemporalType.TIMESTAMP)
		
	    @OneToMany
	    @JoinColumn(name="id")
	    private List<Caja> caja;
		
		//Constructores
		
		public Caja() {
		
		}

		/**
		 * @param numReferencia
		 * @param contenido
		 * @param valor
		 * @param almacen
		 */
		public Caja(int numReferencia, String contenido, int valor, int almacen) {
			//super();
			this.numReferencia = numReferencia;
			this.contenido = contenido;
			this.valor = valor;
			this.almacen = almacen;
		}

		
		//Getters y Setters
		
		/**
		 * @return the numReferencia
		 */
		public Long getNumReferencia() {
			return numReferencia;
		}

		/**
		 * @param numReferencia the numReferencia to set
		 */
		public void setNumReferencia(Long numReferencia) {
			this.numReferencia = numReferencia;
		}

		/**
		 * @return the contenido
		 */
		public String getContenido() {
			return contenido;
		}

		/**
		 * @param contenido the contenido to set
		 */
		public void setContenido(String contenido) {
			this.contenido = contenido;
		}

		/**
		 * @return the valor
		 */
		public int getValor() {
			return valor;
		}

		/**
		 * @param valor the valor to set
		 */
		public void setValor(int valor) {
			this.valor = valor;
		}
		/**
		 * @return the almacen
		 */
		public int getAlmacen() {
			return almacen;
		}

		/**
		 * @param almacen the almacen to set
		 */
		public void setAlmacen(int almacen) {
			this.almacen = almacen;
		}

		@JsonIgnore
		@OneToMany(fetch = FetchType.LAZY, mappedBy = "Caja")
		public List<Caja> getCaja() {
			return caja;
		}

		/**
		 * @param caja the caja to set
		 */
		public void setCaja(List<Caja> caja) {
			this.caja = caja;
		}

		//Metodo impresion de datos por consola
		@Override
		public String toString() {
			return "Caja [numReferencia=" + numReferencia + ", contenido=" + contenido + ", valor=" + valor +", almacen=" + almacen + "]";
		}
		
		
		
		
		
	}

}

}
