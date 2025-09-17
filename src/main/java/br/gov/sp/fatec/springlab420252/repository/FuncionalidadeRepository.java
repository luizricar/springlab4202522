package br.gov.sp.fatec.springlab420252.repository;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.gov.sp.fatec.springlab420252.entity.Funcionalidade;

public interface FuncionalidadeRepository extends JpaRepository<Funcionalidade, Long>{

    public List<Funcionalidade> findByTituloContainsAndUsuarioNomeContains(String titulo, String nomeUsuario);
    
    @Query("select f from Funcionalidade f join f.dataAtivacao f where f.dataAtivacao <= %?2025-09-04% ")
    public List<Funcionalidade> buscarPorFuncionalidadeEDataDeAtivacao(String funcionalidade, LocalDateTime dataAtivacao);

}
