package curso.modelo.entidad;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.RequestScope;

@Component
@RequestScope
public class Pedido {

	private Pc pc;
	private String nombreCliente;
	private String dirCliente;
	private String emailCliente;
	private String comentarios;

	@Override
	public String toString() {
		return "Pedido [pc=" + pc + ", nombreCliente=" + nombreCliente + ", dirCliente=" + dirCliente
				+ ", emailCliente=" + emailCliente + ", comentarios=" + comentarios + "]";
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	public Pc getPc() {
		return pc;
	}

	public void setPc(Pc pc) {
		this.pc = pc;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDirCliente() {
		return dirCliente;
	}

	public void setDirCliente(String dirCliente) {
		this.dirCliente = dirCliente;
	}

	public String getEmailCliente() {
		return emailCliente;
	}

	public void setEmailCliente(String emailCliente) {
		this.emailCliente = emailCliente;
	}

}
