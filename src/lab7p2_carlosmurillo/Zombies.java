package lab7p2_carlosmurillo;

public class Zombies {
    private String tipo;
    
    private String nombre;
    private int ataque;
    private int vida;
    
    private int experiencia;
    private String bandera;
    private String direccion;
    
    private int tamano;
    private int edad;
    private int enojo;
    private String personas;

    public Zombies() {
    }

    public Zombies(String tipo, String nombre, int ataque, int vida, int experiencia, String bandera, String direccion) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.experiencia = experiencia;
        this.bandera = bandera;
        this.direccion = direccion;
    }

    public Zombies(String tipo, String nombre, int ataque, int vida, int tamano, int edad, int enojo, String personas) {
        this.tipo = tipo;
        this.nombre = nombre;
        this.ataque = ataque;
        this.vida = vida;
        this.tamano = tamano;
        this.edad = edad;
        this.enojo = enojo;
        this.personas = personas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public String getBandera() {
        return bandera;
    }

    public void setBandera(String bandera) {
        this.bandera = bandera;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEnojo() {
        return enojo;
    }

    public void setEnojo(int enojo) {
        this.enojo = enojo;
    }

    public String getPersonas() {
        return personas;
    }

    public void setPersonas(String personas) {
        this.personas = personas;
    }

    @Override
    public String toString() {
        return "Zombie";
    }
    
    
}
