/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;  
public class Answer {  
private int id;  
private String answer;  
private String posterName;  

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the answer
     */
    public String getAnswer() {
        return answer;
    }

    /**
     * @param answer the answer to set
     */
    public void setAnswer(String answer) {
        this.answer = answer;
    }

    /**
     * @return the posterName
     */
    public String getPosterName() {
        return posterName;
    }

    /**
     * @param posterName the posterName to set
     */
    public void setPosterName(String posterName) {
        this.posterName = posterName;
    }

}  