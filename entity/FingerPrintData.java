package entity;

import java.io.*;
import java.util.*;

public class FingerPrintData {

    public FingerPrintData() {
    }

    private String TemplateID;
    private Integer QualityScore;

    // --- ADD THESE SETTER METHODS TO FIX THE ERROR ---

    public void SetTemplateID(String id) {
        this.TemplateID = id;
    }

    public void SetQualityScore(Integer score) {
        this.QualityScore = score;
    }

    // --- EXISTING GETTERS ---

    public Integer GetQualityScore() {
        return this.QualityScore;
    }

    public String GetTemplateID() {
        return this.TemplateID;
    }
}