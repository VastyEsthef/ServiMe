package org.example.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="pagoConTarjeta")
public class PagoConTarjeta {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private double monto;
	
	@ManyToOne
	@JoinColumn(name="tipoPagoConTarjeta_id",nullable=false)
	private TipoPagoConTarjeta tipoPagoConTarjetaCodigo;
	
	@ManyToOne
	@JoinColumn(name="contrato_id",nullable=false)
	private Contrato contrato_codigo;
	
	
	

	public Contrato getContrato_codigo() {
		return contrato_codigo;
	}

	public void setContrato_codigo(Contrato contrato_codigo) {
		this.contrato_codigo = contrato_codigo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMonto() {
		return monto;
	}

	public void setMonto(double monto) {
		this.monto = monto;
	}

	public TipoPagoConTarjeta getTipoPagoConTarjetaCodigo() {
		return tipoPagoConTarjetaCodigo;
	}

	public void setTipoPagoConTarjetaCodigo(TipoPagoConTarjeta tipoPagoConTarjetaCodigo) {
		this.tipoPagoConTarjetaCodigo = tipoPagoConTarjetaCodigo;
	}
	
	
	

}
