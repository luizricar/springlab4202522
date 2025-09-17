package br.gov.sp.fatec.springlab420252.entity;

import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "fun_funcionalidade")
public class Funcionalidade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fun_id")
    private Long id;

    @Column(name = "fun_Autorizacao")
    private String Autorizacao;

    @Column(name = "fun_data_ativacao")
    private LocalDateTime dataAtivacao;

    @Column(name = "fun_autorizacao")
    private Long autorizacao;

    @Column(name = "fun_url")
    private String url;

    @Column(name = "fun_limite_acessos")
    private Integer limiteacessos;

    @OneToMany(mappedBy = "funcionalidade", fetch = FetchType.LAZY)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Set<Anotacao> anotacoes;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "aut_autorizacao", 
        joinColumns = {@JoinColumn(name = "fun_autorizacao")},
        inverseJoinColumns = {@JoinColumn(name = "aut_id")} )
    private Set<Autorizacao> autorizacoes;

    public Usuario() {
        setAnotacoes(new HashSet<Anotacao>());
        setAutorizacoes(new HashSet<Autorizacao>());
    }

   public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getAutorizacao() {
        return Autorizacao;
    }

    public void setAutorizacao(String Autorizacao) {
        this.Autorizacao = Autorizacao;
    }

    public Long getDataDeAtivacao() {
        return datadeativacao;
    }

    public void setDataDeAtivacao(LocalDateTime datadeativacao) {
        this.datadeativacao = datadeativacao;
    }

    public Long getAutorizacao() {
        return autorizacao;
    }

    public void setAutorizacao(String Autorizacao) {
        this.autorizacao = autorizacao;
    }









    
    public void setSenha(String Autorizacao) {
        this.senha = senha;
    }

    public Set<Anotacao> getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(Set<Anotacao> anotacoes) {
        this.anotacoes = anotacoes;
    }

    public Set<Autorizacao> getAutorizacoes() {
        return autorizacoes;
    }

    public void setAutorizacoes(Set<Autorizacao> autorizacoes) {
        this.autorizacoes = autorizacoes;
    } 
    
}
