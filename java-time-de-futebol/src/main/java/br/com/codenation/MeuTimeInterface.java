package br.com.codenation;

import br.com.codenation.desafio.annotation.Desafio;
import br.com.codenation.desafio.exceptions.TimeNaoEncontradoException;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

interface MeuTimeInterface {

    @Desafio(key = "incluirTime")
    void incluirTime(Long id, String nome, LocalDate dataCriacao, String corUniformePrincipal, String corUniformeSecundario) throws Exception;

    @Desafio(key = "incluirJogador")
    void incluirJogador(Long id, Long idTime, String nome, LocalDate dataNascimento, Integer nivelHabilidade, BigDecimal salario) throws Exception;

    @Desafio(key = "definirCapitao")
    void definirCapitao(Long idJogador) throws Exception;

    @Desafio(key = "buscarCapitaoDoTime")
    public Long buscarCapitaoDoTime(Long idTime) throws Exception;

    @Desafio(key = "buscarNomeJogador")
    String buscarNomeJogador(Long idJogador) throws Exception;

    @Desafio(key = "buscarNomeTime")
    String buscarNomeTime(Long idTime) throws Exception;

    @Desafio(key = "buscarJogadorMaiorSalario")
    public Long buscarJogadorMaiorSalario(Long idTime) throws Exception;

//    @Desafio(key = "buscarSalarioDoJogador")
//    BigDecimal buscarSalarioDoJogador(Long idJogador) throws Exception;

    @Desafio(key = "buscarJogadoresDoTime")
    List<Long> buscarJogadoresDoTime(Long idTime) throws Exception;

    @Desafio(key = "buscarMelhorJogadorDoTime")
    public Long buscarMelhorJogadorDoTime(Long idTime) throws Exception;

    @Desafio(key = "buscarJogadorMaisVelho")
    public Long buscarJogadorMaisVelho(Long idTime) throws TimeNaoEncontradoException;

    @Desafio(key = "buscarTimes")
    List<Long> buscarTimes();

    @Desafio(key = "buscarTopJogadores")
    List<Long> buscarTopJogadores(Integer top);

//    @Desafio("buscarCorCamisaTimeDeFora")
//    public String buscarCorCamisaTimeDeFora(Long idTimeDaCasa, Long idTimeDeFora) throws Exception;
}
