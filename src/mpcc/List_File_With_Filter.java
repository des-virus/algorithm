/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mpcc;

import java.io.File;
import java.io.FilenameFilter;

/**
 *
 * @author thuctap02
 */
public class List_File_With_Filter {

    public static void main(String[] args) {
        File[] files = new File("D:\\Project_folder\\FB_NotifierNew1\\FB_Notifier\\target\\MPCC_FBNotifier\\images\\upload\\1863210517250420").listFiles(
                new FilenameFilter() {
                    @Override
                    public boolean accept(File dir, String name) {
                        return name.endsWith(".jpg") || name.endsWith(".png");
                    }
                });
        
        for(File f: files){
            System.out.println(f.getName());
        }
        
    }
}
