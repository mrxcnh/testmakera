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
public class Subject implements Serializable {
    private String nameSubject;
    private String codeSubject;
    private int numberChapter;
    private String overview;
    
    //--------------------------------------------
    
    public Subject() {
        this.nameSubject = "Unknown";
        this.codeSubject = "Unknown";
        this.numberChapter = 0;
        this.overview = "Unknown";
    }
    
    public Subject(String nameSubject, String codeSubject, int numberChapter, String overview){
        this.nameSubject = nameSubject;
        this.codeSubject = codeSubject;
        this.numberChapter = numberChapter;
        this.overview = overview;
    }
    
    //--------------------------------------------

    public String getNameSubject() {
        return nameSubject;
    }

    public void setNameSubject(String nameSubject) {
        this.nameSubject = nameSubject;
    }

    public String getCodeSubject() {
        return codeSubject;
    }

    public void setCodeSubject(String codeSubject) {
        this.codeSubject = codeSubject;
    }

    public int getNumberChapter() {
        return numberChapter;
    }

    public void setNumberChapter(int numberChapter) {
        this.numberChapter = numberChapter;
    }

    public String getOverview() {
        return overview;
    }

    public void setOverview(String overview) {
        this.overview = overview;
    }
    
}
