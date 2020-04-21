package model;

import org.springframework.data.annotation.Id;

import java.util.Date;

public class Arte {

    public String titulo;
    public String descricao;
    public Date data;
    public Id idAutor;
    public Id idColecao;
    public String arteImg;
    public int contVotos;
    public Boolean status;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Id getIdAutor() {
        return idAutor;
    }

    public void setIdAutor(Id idAutor) {
        this.idAutor = idAutor;
    }

    public Id getIdColecao() {
        return idColecao;
    }

    public void setIdColecao(Id idColecao) {
        this.idColecao = idColecao;
    }

    public String getArteImg() {
        return arteImg;
    }

    public void setArteImg(String arteImg) {
        this.arteImg = arteImg;
    }

    public int getContVotos() {
        return contVotos;
    }

    public void setContVotos(int contVotos) {
        this.contVotos = contVotos;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
