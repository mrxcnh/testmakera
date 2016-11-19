/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daylamotpackage;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author Dell
 */
public class MultipleChoiceQuestion extends Question implements Serializable{
    private ArrayList<Answer> answer;
    
    public MultipleChoiceQuestion(){
        super();
        this.answer = new ArrayList<>();
    }

    public ArrayList<Answer> getAnswer() {
        return answer;
    }

    public void setAnswer(ArrayList<Answer> answer) {
        this.answer = answer;
    }
    

    @Override
    public void printQuestion() {
        int count = 64;
        String content = "";
        String result = "";
        content += this.getStatement() + "\n";
        for (Answer answer : this.getAnswer()) {
            count++;
            content += (char) count;
            content += ". " + answer.getContent() + "\n";
            if (answer.isTrueAnswer()) result += (char) count + " ";
        } 
    }
}
