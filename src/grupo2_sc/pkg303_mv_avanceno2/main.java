/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package grupo2_sc.pkg303_mv_avanceno2;


public class main {
    
    public static void main (String[] args) {
    File fichero = new File("src/main/java/archivos/Usuarios.txt");
        File directorio = new File("src/main/java/archivos");
        if (!directorio.exists()) {
            directorio.mkdirs();
        }
        
     FidnessPro FidnessPro2 = new FidnessPro();
     FidnessPro2.setVisible(true);
     
    }
}
