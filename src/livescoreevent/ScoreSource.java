/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package livescoreevent;

import java.util.ArrayList;

/**
 *
 * @author jiapat
 */
public class ScoreSource {
    ArrayList<ScoreListener> listeners;
    
    public ScoreSource() {
        listeners = new ArrayList<>();
    }
    
    public void addScoreListener(ScoreListener obj) {
        listeners.add(obj);
    }
    
    public void removeScoreListener() {
        
    }
    
    public void setScoreLine(String score) {
        fireHeadQuaterEvent(new ScoreEvent(this, score));
    }
    
    public void fireHeadQuaterEvent(ScoreEvent evt) {
        for(ScoreListener listener : listeners) {
            listener.scoreChange(evt);
        }
    }
}
