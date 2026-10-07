package object_oriented_programming.practice02;

import java.util.ArrayList;

public class MaquinaSoldar {

    private String marca;
    private String modelo;
    private String potencia;
    private ArrayList<String> metales = new ArrayList<>();

    public MaquinaSoldar(String marca, String modelo, String potencia, ArrayList<String> metales) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.metales = metales;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPotencia() {
        return potencia;
    }

    public void setPotencia(String potencia) {
        this.potencia = potencia;
    }

    public ArrayList<String> getMetales() {
        return metales;
    }

    public void setMetales(ArrayList<String> metales) {
        this.metales = metales;
    }

    public void soldar(String metal){
        if (metales.contains(metal)){
            System.out.println(this.marca + " modelo: " + this.modelo +" puede soldar " + metal);
        }else{
            System.out.println(this.marca + " modelo: " + this.modelo +" no puede soldar " + metal);
        }
    }
}