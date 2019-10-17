/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118066.latihan33.userlogin;

/**
 *
 * @author DRAGON
 */
public class User {
    private final String user = "RizkiAdam";
    private final String password = "terbaikselalu";
    private boolean statusAkun;
    
    private boolean cekAkun(String parUserName, String parPassword){
        return parUserName.equals(user) && parPassword.equals(password);
    }
    private void hasilLogin(boolean status, String parUserName){
        if(parUserName.equals(user)){
            System.out.println("**********HALLO RIZKI ADAM*********");
            System.out.println("Selamat Datang Di Aplikasi ini");
        }else
            System.out.println("Ooops, username atau password anda salah");
    }
    public void pengecekkanLogin(String parUsername, String parPassword){
        statusAkun = cekAkun(parUsername, parPassword);
        hasilLogin(statusAkun, parUsername);
    }
    
}
