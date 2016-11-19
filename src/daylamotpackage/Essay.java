/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daylamotpackage;

import java.io.Serializable;

/**
 *
 * @author Dell
 */
public class Essay extends Question implements Serializable{
    
    private String barem;
    
    //-------------------------------------------
    public Essay(){
        this.barem = "";
    }
    
    public Essay(String barem) {
        this.barem = barem;
    }
    //-------------------------------------------

    public String getBarem() {
        return barem;
    }

    public void setBarem(String barem) {
        this.barem = barem;
    }

    
    
    @Override
    public void printQuestion() {
        
    }
    
}
