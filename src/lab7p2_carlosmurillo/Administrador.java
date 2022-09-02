package lab7p2_carlosmurillo;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Administrador {
    private ArrayList<Plantas> listaplantas = new ArrayList();
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
        listaplantas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter("/");
                
                while (sc.hasNext()) {
                    String plantas = sc.next();
                    System.out.println(plantas);
                    
                    sc2 = new Scanner(plantas);
                    sc2.useDelimiter("_");
                    
                    int num = 1;
                    while (sc2.hasNext()){
                        String d_planta = sc2.next();
                        System.out.print("        ");
                        System.out.println(d_planta);
                        
                        sc3 = new Scanner(d_planta);
                        sc3.useDelimiter(":");
                        
                        
                        while (d_planta.charAt(0) != 'N' && num ==1){
                            String d_planta_2 = sc3.next();
                            System.out.print("                ");
                            System.out.println(d_planta_2);
                            if (d_planta_2.equals("Disparo")){
                                
                            }else if (d_planta_2.equals("Defensa")){
                                
                            }else{
                                
                            }
                            num = 2;
                        }
                    }
                    
                    /*listaplantas.add(new Plantas(c,
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
