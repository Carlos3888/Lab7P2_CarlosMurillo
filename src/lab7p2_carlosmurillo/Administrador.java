package lab7p2_carlosmurillo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrador {
    private ArrayList listaplantas = new ArrayList();
    private ArrayList<Zombies> listazombies = new ArrayList();
    private File archivo = null;

    public Administrador(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList getListaplantas() {
        return listaplantas;
    }

    public void setListaplantas(ArrayList listaplantas) {
        this.listaplantas = listaplantas;
    }

    public ArrayList getListazombies() {
        return listazombies;
    }

    public void setListazombies(ArrayList listazombies) {
        this.listazombies = listazombies;
    }

    

    @Override
    public String toString() {
        return "lista=" + listaplantas+ listazombies;
    }

    //extra mutador
    public void setPlanta(Plantas p) {
        this.listaplantas.add(p);
    }
    public void setZombie(Zombies z) {
        this.listazombies.add(z);
    }

    //metodos de administracion
   /* public void escribirArchivoPlanta() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
                for (Plantas t : listaplantas) {
                bw.write(t.getCodigo() + ";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getedad() + ";");
                if(t.getHobbies().size() == 0){
                    bw.write(" ;");
                }else{
                    String cadena = "";
                    ArrayList l = t.getHobbies();
                    for (int i = 0; i < l.size(); i++) {
                        cadena += l.get(i)+"/";
                        
                    }
                    bw.write(cadena + ";");
                }
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }*/

    public void cargarArchivoPlantas() {
        Scanner sc = null;
        Scanner sc2 = null;
        Scanner sc3 = null;
        Scanner sc4 = null;
        Scanner sc5 = null;
        
        ArrayList defensa = new ArrayList();
        ArrayList disparo = new ArrayList();
        ArrayList explosiva = new ArrayList();
        
        
        
        ArrayList bajo = new ArrayList();
        ArrayList medio = new ArrayList();
        ArrayList alto = new ArrayList();
        
        defensa.add(bajo);
        defensa.add(medio);
        defensa.add(alto);
        disparo.add(bajo);
        disparo.add(medio);
        disparo.add(alto);
        explosiva.add(bajo);
        explosiva.add(medio);
        explosiva.add(alto);
        
        String rango = "";
        
        String proyectil = "";
        String color = "";
        
        String peso = "";
        String altura = "";
        String dureza = "";
        
        String magnitud = "";
        
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                
                while (sc.hasNext()) {
                    String tipo = "";
                    
                    String plantas = sc.next();
                    System.out.println(plantas);
                    
                    sc2 = new Scanner(plantas);
                    sc2.useDelimiter("_");
                    
                    while (sc2.hasNext()){
                        String d_planta = sc2.next();
                        System.out.print("        ");
                        System.out.println(d_planta);
                        
                        sc3 = new Scanner(d_planta);
                        sc3.useDelimiter(":");
                        
                        sc5 = new Scanner(d_planta);
                        sc5.useDelimiter(",");
                        
                        while (sc5.hasNext()){
                            String cadena = sc5.next();
                            if(cadena.charAt(0) == 'R'){
                                rango = cadena;
                            }
                        }
                        
                        
                        while (sc3.hasNext()){
                            String cadena = sc3.next();
                            
                            
                            
                            if (cadena.equals("Disparo")){
                                System.out.print("                ");
                                System.out.println(cadena);
                                sc3.hasNext();
                                cadena = sc3.next();
                                cadena = cadena.substring(1, cadena.length()-1);
                                System.out.print("                        ");
                                System.out.println(cadena);
                                sc4 = new Scanner(cadena);
                                sc4.useDelimiter(";");
                                while(sc4.hasNext()){
                                    String cadena2 = sc4.next();
                                    if(cadena2.charAt(0) == 'P'){
                                        proyectil = cadena2;
                                        System.out.println(proyectil);
                                    }else{
                                        color = cadena2;
                                        System.out.println(color);
                                    }
                                }
                                if(rango.equals("Rango=Bajo")){
                                    ArrayList cambio = (ArrayList) disparo.get(0);
                                    cambio.add("Planta{"+rango+proyectil+"}");
                                    disparo.set(0, cambio);
                                }else if(rango.equals("Rango=Medio")){
                                    ArrayList cambio = (ArrayList) disparo.get(1);
                                    cambio.add("Planta{"+rango+proyectil+"}");
                                    disparo.set(1, cambio);
                                }else{
                                    ArrayList cambio = (ArrayList) disparo.get(2);
                                    cambio.add("Planta{"+rango+proyectil+"}");
                                    disparo.set(2, cambio);
                                }
                                
                            }else if (cadena.equals("Defensa")){
                                System.out.print("                ");
                                System.out.println(cadena);
                                sc3.hasNext();
                                cadena = sc3.next();
                                cadena = cadena.substring(1, cadena.length()-1);
                                System.out.print("                        ");
                                System.out.println(cadena);
                                sc4 = new Scanner(cadena);
                                sc4.useDelimiter(";");
                                while(sc4.hasNext()){
                                    String cadena2 = sc4.next();
                                    if(cadena2.charAt(0) == 'P'){
                                        peso = cadena2;
                                        System.out.println(peso);
                                    }else if(cadena2.charAt(0) == 'A'){
                                        altura = cadena2;
                                        System.out.println(altura);
                                    }else{
                                        dureza = cadena2;
                                        System.out.println(dureza);
                                    }
                                }
                                if(rango.equals("Rango=Bajo")){
                                    ArrayList cambio = (ArrayList) defensa.get(0);
                                    cambio.add("Planta{"+rango+altura+"}");
                                    defensa.set(0, cambio);
                                }else if(rango.equals("Rango=Medio")){
                                    ArrayList cambio = (ArrayList) defensa.get(1);
                                    cambio.add("Planta{"+rango+altura+"}");
                                    defensa.set(1, cambio);
                                }else{
                                    ArrayList cambio = (ArrayList) defensa.get(2);
                                    cambio.add("Planta{"+rango+altura+"}");
                                    defensa.set(2, cambio);
                                }
                                
                            }else if (cadena.equals("Explosiva")){
                                System.out.print("                ");
                                System.out.println(cadena);
                                sc3.hasNext();
                                cadena = sc3.next();
                                cadena = cadena.substring(1, cadena.length()-1);
                                System.out.print("                        ");
                                System.out.println(cadena);
                                sc4 = new Scanner(cadena);
                                sc4.useDelimiter(";");
                                magnitud = cadena;
                                System.out.println(magnitud);
                                if(rango.equals("Rango=Bajo")){
                                    ArrayList cambio = (ArrayList) explosiva.get(0);
                                    cambio.add("Planta{"+rango+magnitud+"}");
                                    explosiva.set(0, cambio);
                                }else if(rango.equals("Rango=Medio")){
                                    ArrayList cambio = (ArrayList) explosiva.get(1);
                                    cambio.add("Planta{"+rango+magnitud+"}");
                                    explosiva.set(1, cambio);
                                }else{
                                    ArrayList cambio = (ArrayList) explosiva.get(2);
                                    cambio.add("Planta{"+rango+magnitud+"}");
                                    explosiva.set(2, cambio);
                                }
                            }else{
                                
                            }
                        }
                    }
                    
                    /*listaplantas.add(new Plantas(c,
                                    n,
                                    e,
                                    l
                                    )
                    );*/
                }
                listaplantas.add(defensa);
                listaplantas.add(disparo);
                listaplantas.add(explosiva);
            } catch (Exception ex) {
            }
            sc.close();
        }
        
    }
    public void cargarArchivoZombies() {
        Scanner sc = null;
        Scanner sc2 = null;
        Scanner sc3 = null;
        listazombies = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                
                while (sc.hasNext()) {
                    String zombies = sc.next();
                    System.out.println(zombies);
                    /*int c = sc.nextInt();
                    String n = sc.next();
                    int e = sc.nextInt();
                    
                    String cadena = sc.next();
                    sc2 = new Scanner(cadena);
                    sc2.useDelimiter("/");
                    ArrayList l = new ArrayList();
                    
                    while (sc2.hasNext()){
                        String cadena2 = sc2.next();
                        l.add(cadena2);
                    }
                    
                    listaplantas.add(new Plantas(c,
                                    n,
                                    e,
                                    l
                                    )
                    );*/
                }
            } catch (Exception ex) {
            }
            sc.close();
        }
    }
}
