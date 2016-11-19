/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daylamotpackage;

import com.sun.jndi.toolkit.dir.SearchFilter;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
abstract class Question implements Serializable {
    private String codeQuestion;
    private String statement;
    private String difficulty;
    private ArrayList<String> chapter;
    private double point;
    
    //---------------------------------------
    
    public Question() {
        statement = "Unknown";
        difficulty = "Dễ";
        chapter = new ArrayList();
        point = 0.0;
        codeQuestion = "";
    }
    
    public Question(String codeQuestion, String statement, String difficulty, ArrayList<String> chapter, double point) {
        this.codeQuestion = codeQuestion;
        this.statement = statement;
        this.difficulty = difficulty;
        this.chapter = chapter;
        this.point = point;                
    }
    
    //---------------------------------------

    public String getCodeQuestion() {
        return codeQuestion;
    }

    public void setCodeQuestion(String codeQuestion) {
        this.codeQuestion = codeQuestion;
    }
    
    public String getStatement() {
        return statement;
    }

    public void setStatement(String statement) {
        this.statement = statement;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }

    public ArrayList getChapter() {
        return chapter;
    }

    public void setChapter(ArrayList<String> chapter) {
        this.chapter = chapter;
    }

    public double getPoint() {
        return point;
    }

    public void setPoint(double point) {
        this.point = point;
    }        
    
    
    //-----------------------------------------------
    public abstract void printQuestion();
}
