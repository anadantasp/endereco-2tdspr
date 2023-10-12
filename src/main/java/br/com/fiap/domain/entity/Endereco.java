package br.com.fiap.domain.entity;

public class Endereco {

    private String cep;
    private String logradouro;

    private String bairro;

    private String localidade;

    private String uf;

    private String ibge;

    private String gia;

    private String ddd;

    private String siafi;

    public Endereco() {
    }

    public Endereco(String cep, String logradouro, String bairro, String localidade, String uf, String ibge, String gia, String ddd, String siafi) {
        this.cep = cep;
        this.logradouro = logradouro;
        this.bairro = bairro;
        this.localidade = localidade;
        this.uf = uf;
        this.ibge = ibge;
        this.gia = gia;
        this.ddd = ddd;
        this.siafi = siafi;
    }

    public String getCep() {
        return cep;
    }

    public Endereco setCep(String cep) {
        this.cep = cep;
        return this;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public Endereco setLogradouro(String logradouro) {
        this.logradouro = logradouro;
        return this;
    }

    public String getBairro() {
        return bairro;
    }

    public Endereco setBairro(String bairro) {
        this.bairro = bairro;
        return this;
    }

    public String getLocalidade() {
        return localidade;
    }

    public Endereco setLocalidade(String localidade) {
        this.localidade = localidade;
        return this;
    }

    public String getUf() {
        return uf;
    }

    public Endereco setUf(String uf) {
        this.uf = uf;
        return this;
    }

    public String getIbge() {
        return ibge;
    }

    public Endereco setIbge(String ibge) {
        this.ibge = ibge;
        return this;
    }

    public String getGia() {
        return gia;
    }

    public Endereco setGia(String gia) {
        this.gia = gia;
        return this;
    }

    public String getDdd() {
        return ddd;
    }

    public Endereco setDdd(String ddd) {
        this.ddd = ddd;
        return this;
    }

    public String getSiafi() {
        return siafi;
    }

    public Endereco setSiafi(String siafi) {
        this.siafi = siafi;
        return this;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "CEP='" + cep + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", bairro='" + bairro + '\'' +
                ", localidade='" + localidade + '\'' +
                ", UF='" + uf + '\'' +
                ", IBGE='" + ibge + '\'' +
                ", guia='" + gia + '\'' +
                ", ddd='" + ddd + '\'' +
                ", SIAFI='" + siafi + '\'' +
                '}';
    }
}