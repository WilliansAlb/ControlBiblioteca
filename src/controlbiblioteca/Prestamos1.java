/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlbiblioteca;

/**
 *
 * @author willians
 */
public class Prestamos1 {
    
    private int codigo_prestamos;
    private String codgo_libro;
    private int carnet;
    private String fecha;
    private int mora;
    private int moto;

    public int getCodigo_prestamos() {
        return codigo_prestamos;
    }

    public void setCodigo_prestamos(int codigo_prestamos) {
        this.codigo_prestamos = codigo_prestamos;
    }

    public String getCodgo_libro() {
        return codgo_libro;
    }

    public void setCodgo_libro(String codgo_libro) {
        this.codgo_libro = codgo_libro;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMora() {
        return mora;
    }

    public void setMora(int mora) {
        this.mora = mora;
    }

    public int getMoto() {
        return moto;
    }

    public void setMoto(int moto) {
        this.moto = moto;
    }
}
