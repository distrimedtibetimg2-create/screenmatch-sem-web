package br.com.alurastudy.screenmatchspring.sevice;

public interface IConverteDados {

    <T> T obterDados(String json, Class<T> classe);

}
