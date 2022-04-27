/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oakgrovedevelopment.socialcomputingproject;

/**
 *
 * @author dillo
 */
public class Reddit {
    private String text;
    private int numText;
    
    public Reddit(){
        text = "";
        numText = 0;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getNumText() {
        return numText;
    }

    public void setNumText(int numText) {
        this.numText = numText;
    }
    
}
