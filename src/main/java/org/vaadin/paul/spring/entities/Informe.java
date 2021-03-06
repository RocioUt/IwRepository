package org.vaadin.paul.spring.entities;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Informe {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column (name = "id")
	int id;
	@JoinColumn (name = "idCita")
	@OneToOne
	Cita cita;
	@Column (name = "porque")
	String porQue;
	@Column (name = "enfermedadActual")
	String enfermedadActual;
	@Column (name = "intervencion")
	String intervencion;
	@Column (name = "diagnostico")
	String diagnostico;
	@Column (name = "medicamentos")
	String medicamentos;
	@Column (name = "planClinico")
	String planClinico;
	@Column (name = "proximaCita")
	Date fechaProximaCita;
	@Column (name = "firmaElectronica")
	boolean firma;
	
	public Informe () {}
	
	public Informe(int id, Cita cita, String pq, String enfActual, String intervencion, String diagnostico, String medicamentos,
			String planClinico, Date proximaCita) {
		this.id = id;
		this.cita = cita;
		this.porQue=pq;
		this.enfermedadActual=enfActual;
		this.intervencion=intervencion;
		this.diagnostico=diagnostico;
		this.medicamentos=medicamentos;
		this.planClinico=planClinico;
		this.fechaProximaCita=proximaCita;
		this.firma=true;
	}
	
	public Cita getIdCita_() {
		return cita;
	}

	public void setIdCita_(Cita cita) {
		this.cita = cita;
	}
	
	public String getPorQue() {
		return this.porQue;
	}
	
	public String getEnfermedadActual() {
		return this.enfermedadActual;
	}
	
	public String getIntervencion() {
		return this.intervencion;
	}
	
	public String getDiagnostico() {
		return this.diagnostico;
	}
	
	public String getMedicamentos() {
		return this.medicamentos;
	}
	
	public String getPlanClinico() {
		return this.planClinico;
	}
	
	public Date getFechaProximaCita() {
		return this.fechaProximaCita;
	}
	
	public boolean getFirma() {
		return this.firma;
	}
	
	public void setPorQue(String pq) {
		this.porQue=pq;
	}
	
	public void setEnfermedadActual(String e) {
		this.enfermedadActual=e;
	}
	
	public void setIntervencion(String i) {
		this.intervencion=i;
	}
	
	public void setDiagnostico(String d) {
		this.diagnostico=d;
	}
	
	public void setMedicamentos(String m) {
		this.medicamentos=m;
	}
	
	public void setPlanClinico(String pc) {
		this.planClinico=pc;
	}
	
	public void setFechaProximaCita(Date f) {
		this.fechaProximaCita=f;
	}
	
	public void setFirma(boolean f) {
		this.firma=f;
	}
	
	public String getNombreyApellidospaciente() {
		return cita.getNombreyApellidospaciente();
	}
	
	public String getNombreyApellidosSanitario() {
		return cita.getNombreyApellidosSanitario();
	}
	
	public int getid() {
		return id;
	}
	
}