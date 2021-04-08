/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Siswa;
import View.FormSiswa;

/**
 *
 * @author bekti
 */
public class CtrlSiswa {
    private FormSiswa tampil;
    private Siswa siswa;
    
    public CtrlSiswa(FormSiswa tampil){
        this.tampil = tampil;
    }
    
    public void proses(){
        siswa = new Siswa();
        
        siswa.setNis(tampil.getTxtNis().getText());
        siswa.setNama(tampil.getTxtNama().getText());
        siswa.setUh(Integer.parseInt(tampil.getTxtUh().getText()));
        siswa.setUts(Integer.parseInt(tampil.getTxtUts().getText()));
        siswa.setUas(Integer.parseInt(tampil.getTxtUas().getText()));
        
        siswa.setRata((siswa.getUh() + siswa.getUts() + siswa.getUas())/3);
        
        if(siswa.getRata() >= 75){
            siswa.setKompetensi("Kompeten");
        }else{
            siswa.setKompetensi("Belum Kompeten");
        }
        
        tampil.getTxtHasil().setText("----- INFORMASI SISWA -----\n"+
                                     "NIS : "+siswa.getNis() + "\n"+
                                     "NAMA : "+siswa.getNama() + "\n"+
                                     "UH  : "+siswa.getUh() + "\n" +
                                     "UTS : "+siswa.getUts() + "\n"+
                                     "UAS : "+siswa.getUas() +"\n"+
                                     "---------------------------\n"+
                                     "Rata-Rata : "+siswa.getRata() + "\n"+
                                     "Anda dinyatakan "+siswa.getKompetensi());
    }
    
    public void reset(){
        tampil.getTxtNis().setText(null);
        tampil.getTxtNama().setText(null);
        tampil.getTxtUh().setText("0");
        tampil.getTxtUts().setText("0");
        tampil.getTxtUas().setText("0");
        tampil.getTxtHasil().setText(null);
        
    }
}
