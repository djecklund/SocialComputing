/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.oakgrovedevelopment.socialcomputingproject;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

/**
 *
 * @author dillo
 */
public class RedditFileReader {

    public void read() throws IOException{
        
        ArrayList<Reddit> redditData = new ArrayList<>();
        
        XSSFWorkbook wb = null;
        FileInputStream input = null;
        
        try{
            File file = new File("Enter Excel file path here...");
            input = new FileInputStream(file);
            wb = new XSSFWorkbook(input);
            Sheet sheet = wb.getSheetAt(0);
            Row row;
            
            for(int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++){
                Reddit info = new Reddit();
                row = sheet.getRow(rowIndex);
                if(row != null){
                    Cell text = row.getCell(7);
                
                    if(!text.getStringCellValue().startsWith(" ")){
                        info.setText(text.getStringCellValue());
                        info.setNumText(1);
                        redditData.add(info);
                    }
                }
            }
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }finally{
            wb.close();
            input.close();
        }
        
        for(int i = 0; i < redditData.size(); i++){
            for(int j = 1; j < redditData.size(); j++){
                if(redditData.get(i).getText().equals(redditData.get(j).getText()) && i != j){
                    redditData.get(i).setNumText(redditData.get(i).getNumText() + 1);
                    redditData.remove(j);
                    j--;
                }
            }
        }
                
        for(Reddit text : redditData){
            System.out.println(text.getText() + "\t" + text.getNumText());
        }
    }
}
