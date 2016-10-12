package br.com.saojudas.maven.projetointegrado.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome", length = 100, nullable = false)
	private String nome;

	@Column(name = "cpf", length = 15, unique = true, nullable = false)
	private String cpf;

	@Column(name = "login", length = 100, nullable = false)
	private String login;

	@Column(name = "senha", length = 100, nullable = false)
	private String senha;

	@Column(name = "horarioDeAcesso", length = 100, nullable = false)
	private String horarioDeAcesso;

	@Enumerated(EnumType.STRING)
	private TipoUsuario tipoUSuario;

	@Column(name = "acessoLivre", nullable = false)
	private boolean acessoLivre;

	@Column(name = "permissaoAlterarTemperatura", nullable = false)
	private boolean permissaoAlterarTemperatura;

	@Column(name = "empresa", length = 20, nullable = false)
	private String empresa;

	public Usuario() {

	}

	public Usuario(String nome, String cpf, String login, String senha, String horarioDeAcesso, TipoUsuario tipoUSuario,
			boolean acessoLivre, boolean permissaoAlterarTemperatura, String empresa) {
		setNome(nome);
		setCpf(cpf);
		setLogin(login);
		setSenha(senha);
		setHorarioDeAcesso(horarioDeAcesso);
		setTipoUsuario(tipoUSuario);
		setAcessoLivre(acessoLivre);
		setPermissaoAlterarTemperatura(permissaoAlterarTemperatura);
		setEmpresa(empresa);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (nome == null) {
			throw new RuntimeException("O nome nao pode ser nulo!");
		} else if (nome.trim().equals("")) {
			throw new RuntimeException("O nome nao pode ser vazio!");
		} else {
			this.nome = nome;
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {

		if (cpf.equals("")) {
			throw new RuntimeException("O cpf nao pode ser nulo!");
		} else if (cpf.trim().equals("")) {
			throw new RuntimeException("O cpf  nao pode ser vazio!");
		} else {
			this.cpf = cpf;
		}
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		if (login == null) {
			throw new RuntimeException("O login nao pode ser nulo!");
		} else if (login.trim().equals("")) {
			throw new RuntimeException("O login nao pode ser vazio!");
		} else {
			this.login = login;
		}
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		if (senha == null) {
			throw new RuntimeException("O senha nao pode ser nulo!");
		} else if (senha.trim().equals("")) {
			throw new RuntimeException("O senha nao pode ser vazio!");
		} else {
			this.senha = senha;
		}
	}

	public String getHorarioDeAcesso() {
		return horarioDeAcesso;
	}

	public void setHorarioDeAcesso(String horarioDeAcesso) {
		if (horarioDeAcesso == null) {
			throw new RuntimeException("O horario de acesso nao pode ser nulo!");
		} else if (horarioDeAcesso.trim().equals("")) {
			throw new RuntimeException("O horario de acesso nao pode ser vazio!");
		} else {
			this.horarioDeAcesso = horarioDeAcesso;
		}
	}

	public TipoUsuario getTipoUsuario() {
		return tipoUSuario;
	}

	public void setTipoUsuario(TipoUsuario tipoUSuario) {
		this.tipoUSuario = tipoUSuario;
	}

	public boolean isAcessoLivre() {
		return acessoLivre;
	}

	public void setAcessoLivre(boolean acessoLivre) {
		this.acessoLivre = acessoLivre;
	}

	public boolean isPermissaoAlterarTemperatura() {
		return permissaoAlterarTemperatura;
	}

	public void setPermissaoAlterarTemperatura(boolean permissaoAlterarTemperatura) {
		this.permissaoAlterarTemperatura = permissaoAlterarTemperatura;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		if (empresa == null) {
			throw new RuntimeException("O empresa nao pode ser nulo!");
		} else if (empresa.trim().equals("")) {
			throw new RuntimeException("O empresa nao pode ser vazio!");
		} else {
			this.empresa = empresa;
		}
	}

	public String toString() {
		return "DADOS USUARIO"+ "\n" + getId() + "\n" + getNome() + "\n" + getCpf() + "\n" + getLogin() + "\n" + getSenha() + "\n"
				+ getHorarioDeAcesso() + "\n" + getTipoUsuario() + "\n" + isAcessoLivre() + "\n"
				+ isPermissaoAlterarTemperatura() + "\n" + getEmpresa();
	}
}