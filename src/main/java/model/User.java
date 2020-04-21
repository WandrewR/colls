package model;

public class User {

    public int tipoUser;
    public String nome;
    public String email;
    public String senha;
    public String cpf;
    public String endereco;
    public String nascData;
    public String perfilPic;
    public int codBanco;
    public String agenciaBanco;
    public String contaBanco;
    public int digitoBanco;

    public int getTipoUser() {
        return tipoUser;
    }

    public void setTipoUser(int tipoUser) {
        this.tipoUser = tipoUser;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNascData() {
        return nascData;
    }

    public void setNascData(String nascData) {
        this.nascData = nascData;
    }

    public String getPerfilPic() {
        return perfilPic;
    }

    public void setPerfilPic(String perfilPic) {
        this.perfilPic = perfilPic;
    }

    public int getCodBanco() {
        return codBanco;
    }

    public void setCodBanco(int codBanco) {
        this.codBanco = codBanco;
    }

    public String getAgenciaBanco() {
        return agenciaBanco;
    }

    public void setAgenciaBanco(String agenciaBanco) {
        this.agenciaBanco = agenciaBanco;
    }

    public String getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(String contaBanco) {
        this.contaBanco = contaBanco;
    }

    public int getDigitoBanco() {
        return digitoBanco;
    }

    public void setDigitoBanco(int digitoBanco) {
        this.digitoBanco = digitoBanco;
    }
}
