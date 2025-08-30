package br.com.fatecwebsystem.websystem.entity;

import jakarta.persistence.*;

@Entity
public class Curso {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idCurso;

    @Column(nullable = false, length = 40)
    private String nomeCurso;

    @Column(nullable = false, length = 40)
    private String periodoCurso;

    @Column(nullable = false, length = 40)
    private Integer chCurso;

    @Column(nullable = false, length = 40)
    private String tipoCurso;

    public Curso() {
    }

    public Curso(Integer idCurso, String nomeCurso, String periodoCurso, Integer chCurso, String tipoCurso) {
        this.idCurso = idCurso;
        this.nomeCurso = nomeCurso;
        this.periodoCurso = periodoCurso;
        this.chCurso = chCurso;
        this.tipoCurso = tipoCurso;
    }

    public Integer getIdCurso() {
        return idCurso;
    }

    public void setIdCurso(Integer idCurso) {
        this.idCurso = idCurso;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public String getPeriodoCurso() {
        return periodoCurso;
    }

    public void setPeriodoCurso(String periodoCurso) {
        this.periodoCurso = periodoCurso;
    }

    public Integer getChCurso() {
        return chCurso;
    }

    public void setChCurso(Integer chCurso) {
        this.chCurso = chCurso;
    }

    public String getTipoCurso() {
        return tipoCurso;
    }

    public void setTipoCurso(String tipoCurso) {
        this.tipoCurso = tipoCurso;
    }
}
