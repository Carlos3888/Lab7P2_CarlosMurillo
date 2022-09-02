package lab7p2_carlosmurillo;

public class Plantas {
    private String tipo;
    
    private String nombre;
    private int ataque;
    private int vida;
    private String rango;
    
    private int explsion;
    
    private String proyectil;
    private String color;
    
    private int altura;
    private int peso;
    private int dureza;

    public Plantas() {
    }

    public Plantas(String tipo, String nombre, int ataque, int vida, String rango, int explsion) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.rango = rango;
        this.explsion = explsion;
    }

    public Plantas(String tipo, String nombre, int ataque, int vida, String rango, String proyectil, String color) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.rango = rango;
        this.proyectil = proyectil;
        this.color = color;
    }

    public Plantas(String tipo, String nombre, int ataque, int vida, String rango, int altura, int peso, int dureza) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.rango = rango;
        this.altura = altura;
        this.peso = peso;
        this.dureza = dureza;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public int getExplsion() {
        return explsion;
    }

    public void setExplsion(int explsion) {
        this.explsion = explsion;
    }

    public String getProyectil() {
        return proyectil;
    }

    public void setProyectil(String proyectil) {
        this.proyectil = proyectil;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getDureza() {
        return dureza;
    }

    public void setDureza(int dureza) {
        this.dureza = dureza;
    }

    @Override
    public String toString() {
        return "Planta";
    }
    
    
    
}
