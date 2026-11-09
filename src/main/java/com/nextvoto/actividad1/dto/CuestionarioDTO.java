package com.nextvoto.actividad1.dto;

public class CuestionarioDTO {
    private Long id;
    private String titulo;
    private String materia;
    private Integer duracionMinutos;

    public CuestionarioDTO() {}

    public CuestionarioDTO(Long id, String titulo, String materia, Integer duracionMinutos) {
        this.id = id;
        this.titulo = titulo;
        this.materia = materia;
        this.duracionMinutos = duracionMinutos;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }

    public String getMateria() { return materia; }
    public void setMateria(String materia) { this.materia = materia; }

    public Integer getDuracionMinutos() { return duracionMinutos; }
    public void setDuracionMinutos(Integer duracionMinutos) { this.duracionMinutos = duracionMinutos; }
}