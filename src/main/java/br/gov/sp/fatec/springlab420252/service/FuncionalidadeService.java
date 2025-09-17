package br.gov.sp.fatec.springlab420252.service;

public class FuncionalidadeService {

    public interface FuncionalidadeService {

    public List<Funcionalidade> buscarTodos();

    public Funcionalidade novoFuncionalidade(Funcionalidade funcionalidade);

    public List<Funcionalidade> buscarPorFuncionalidadeEDataDeAtivacao(String funcionalidade, LocalDateTime dataAtivacao);

    }
}