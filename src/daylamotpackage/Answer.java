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
public class Answer implements Serializable{
    private String content;
    private boolean trueAnswer;
    
    //------------------------------------------------
    
    public void Answer(){
        content = "Unknown";
        trueAnswer = true;
    }
    
    public void Answer(String content, boolean trueAnswer) {
        this.content = content;
        this.trueAnswer = trueAnswer;              
    }
    
    //------------------------------------------------

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isTrueAnswer() {
        return trueAnswer;
    }

    public void setTrueAnswer(boolean trueAnswer) {
        this.trueAnswer = trueAnswer;
    }
    
    
    
}
