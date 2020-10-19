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
import net.sf.jasperreports.view.*;
import net.sf.jasperreports.engine.design.*;
import net.sf.jasperreports.engine.*;

import java.io.File;
import javax.swing.JOptionPane;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.util.JRLoader;
public class report {
    public report(){}

    //konstruktor dua parameter
    public report(String filename, Connection conn){
        try {
            File report = new File(filename);
            JasperReport jreprt = (JasperReport)JRLoader.loadObject(report);
            JasperPrint jprintt = JasperFillManager.fillReport(jreprt,null, conn);
            JasperViewer.viewReport(jprintt,false);
        } catch (JRException e) {
            JOptionPane.showMessageDialog(null, "Gagal Membuka Laporan","Cetak Laporan",JOptionPane.ERROR_MESSAGE);
        }
    }

    //konstruktor tiga parameter
//    public report(String filename, Connection conn, String query){
//        try{
//            JasperDesign jasperDesign = new
//            JasperDesign();
//            jasperDesign = JasperManager.loadXmlDesign(filename);
//            Map parameter = new HashMap();
//            JRDesignQuery jrq = new JRDesignQuery();
//            jrq.setText(query);
//            jasperDesign.setQuery(jrq);
//            JasperReport jasperReport =
//            JasperManager.compileReport(jasperDesign);
//            JasperPrint jasperPrint = JasperManager.fillReport(jasperReport,parameter,conn);
//            JasperViewer.viewReport(jasperPrint,false);
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }

}
