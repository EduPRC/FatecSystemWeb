package br.com.fatecwebsystem.websystem.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idAluno;

    @Column(nullable = false, length = 40)
    private String nomeAluno;

    @Column(nullable = false, length = 60)
    private String enderecoAluno;

    @Column(nullable = false, length = 11)
    private String telefoneAluno;

    @Column(nullable = false, length = 11)
    private String cpfAluno;

    @Column(nullable = false, length = 11)
    private Integer raAluno;

    public Aluno() {
    }

    public Aluno(Integer idAluno, String nomeAluno, String enderecoAluno, String telefoneAluno, String cpfAluno, Integer raAluno) {
        this.idAluno = idAluno;
        this.nomeAluno = nomeAluno;
        this.enderecoAluno = enderecoAluno;
        this.telefoneAluno = telefoneAluno;
        this.cpfAluno = cpfAluno;
        this.raAluno = raAluno;
    }

    public Integer getIdAluno() {
        return idAluno;
    }

    public void setIdAluno(Integer idAluno) {
        this.idAluno = idAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public String getEnderecoAluno() {
        return enderecoAluno;
    }

    public void setEnderecoAluno(String enderecoAluno) {
        this.enderecoAluno = enderecoAluno;
    }

    public String getTelefoneAluno() {
        return telefoneAluno;
    }

    public void setTelefoneAluno(String telefoneAluno) {
        this.telefoneAluno = telefoneAluno;
    }

    public String getCpfAluno() {
        return cpfAluno;
    }

    public void setCpfAluno(String cpfAluno) {
        this.cpfAluno = cpfAluno;
    }

    public Integer getRaAluno() {
        return raAluno;
    }

    public void setRaAluno(Integer raAluno) {
        this.raAluno = raAluno;
    }
}
