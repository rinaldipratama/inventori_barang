/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventori_barang;

/**
 *
 * @author muhamadyusuf
 */
public class PetugasSession {
    private static int u_id;
    private static String u_username;
    private static String u_nama;
    private static String u_status;
     
    public static int getU_id() {
        return u_id;
    }
 
    public static void setU_id(int u_id) {
        PetugasSession.u_id = u_id;
    }
 
    public static String getU_username() {
        return u_username;
    }
 
    public static void setU_username(String u_username) {
        PetugasSession.u_username = u_username;
    }
 
    public static String getU_nama() {
        return u_nama;
    }
 
    public static void setU_nama(String u_nama) {
        PetugasSession.u_nama = u_nama;
    }
    
    public static String getU_status() {
        return u_status;
    }
 
    public static void setU_status(String u_status) {
        PetugasSession.u_status = u_status;
    }
}
