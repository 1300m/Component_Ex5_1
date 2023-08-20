/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescoreevent;

import java.util.EventObject;

/**
 *
 * @author jiapat
 */
public class ScoreEvent extends EventObject {
    private String score;
    
    public ScoreEvent(Object obj, String score) {
        super(obj);
        this.score = score;
    }
    
    public String getScore() {
        return score;
    }
}
