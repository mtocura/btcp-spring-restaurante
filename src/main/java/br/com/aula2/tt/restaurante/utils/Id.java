package br.com.aula2.tt.restaurante.utils;

public class Id {
    private static long idMesa = 1l;
    private static long idPedido = 1l;
    private static long idPrato = 1l;

    public static long genrateIdMesa() {
        return  idMesa++;
    }

    public static long genrateIdPedido() {
        return  idPedido++;
    }

    public static long genrateIdPrato() {
        return  idPrato++;
    }
}
