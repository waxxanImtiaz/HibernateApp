/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.util.List;  
  
public class Question {  
private int id;  
private String qname;  
private List<Answer> answers;//Here, List stores the objects of Answer class  

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
     * @return the qname
     */
    public String getQname() {
        return qname;
    }

    /**
     * @param qname the qname to set
     */
    public void setQname(String qname) {
        this.qname = qname;
    }

    /**
     * @return the answers
     */
    public List<Answer> getAnswers() {
        return answers;
    }

    /**
     * @param answers the answers to set
     */
    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }
  

  
}  