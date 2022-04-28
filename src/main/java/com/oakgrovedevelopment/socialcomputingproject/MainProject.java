/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oakgrovedevelopment.socialcomputingproject;

import java.io.IOException;

/**
 *
 * @author dillo
 */
public class MainProject {
    public static void main(String[] args) throws IOException{
        RedditFileReader reader = new RedditFileReader();
//        reader.read();
        reader.dateProcessing();
    }
}
