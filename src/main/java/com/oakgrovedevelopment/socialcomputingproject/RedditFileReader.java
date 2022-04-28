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
import java.util.Scanner;
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
    
    public void dateProcessing(){
        
        int[] dates = new int[24];
        File f = new File("Input/Dates.txt");
        try(Scanner scan = new Scanner(f)){
            while(scan.hasNextLine()){
                
                String date = scan.nextLine();
                
                if(date.startsWith("1/") && date.contains("2021")){
                    dates[0] += 1;
                }
                else if(date.startsWith("2/") && date.contains("2021")){
                    dates[1] += 1;
                }
                else if(date.startsWith("3/") && date.contains("2021")){
                    dates[2] += 1;
                }
                else if(date.startsWith("4/") && date.contains("2021")){
                    dates[3] += 1;
                }
                else if(date.startsWith("5/") && date.contains("2021")){
                    dates[4] += 1;
                }
                else if(date.startsWith("6/") && date.contains("2021")){
                    dates[5] += 1;
                }
                else if(date.startsWith("7/") && date.contains("2021")){
                    dates[6] += 1;
                }
                else if(date.startsWith("8/") && date.contains("2021")){
                    dates[7] += 1;
                }
                else if(date.startsWith("9/") && date.contains("2021")){
                    dates[8] += 1;
                }
                else if(date.startsWith("10/") && date.contains("2021")){
                    dates[9] += 1;
                }
                else if(date.startsWith("11/") && date.contains("2021")){
                    dates[10] += 1;
                }
                else if(date.startsWith("12/") && date.contains("2021")){
                    dates[11] += 1;
                }
                else if(date.startsWith("1/") && date.contains("2022")){
                    dates[12] += 1;
                }
                else if(date.startsWith("2/") && date.contains("2022")){
                    dates[13] += 1;
                }
                else if(date.startsWith("3/") && date.contains("2022")){
                    dates[14] += 1;
                }
                else if(date.startsWith("4/") && date.contains("2022")){
                    dates[15] += 1;
                }
                else if(date.startsWith("5/") && date.contains("2022")){
                    dates[16] += 1;
                }
                else if(date.startsWith("6/") && date.contains("2022")){
                    dates[17] += 1;
                }
                else if(date.startsWith("7/") && date.contains("2022")){
                    dates[18] += 1;
                }
                else if(date.startsWith("8/") && date.contains("2022")){
                    dates[19] += 1;
                }
                else if(date.startsWith("9/") && date.contains("2022")){
                    dates[20] += 1;
                }
                else if(date.startsWith("10/") && date.contains("2022")){
                    dates[21] += 1;
                }
                else if(date.startsWith("11/") && date.contains("2022")){
                    dates[22] += 1;
                }
                else if(date.startsWith("12/") && date.contains("2022")){
                    dates[23] += 1;
                }
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        for(int i = 0; i < dates.length; i++){
            switch(i){
                case 0:
                    System.out.println("January 2021\t" + dates[i]);
                    break;
                case 1:
                    System.out.println("February 2021\t" + dates[i]);
                    break;
                case 2:
                    System.out.println("March 2021\t" + dates[i]);
                    break;
                case 3:
                    System.out.println("April 2021\t" + dates[i]);
                    break;
                case 4:
                    System.out.println("May 2021\t" + dates[i]);
                    break;
                case 5:
                    System.out.println("June 2021\t" + dates[i]);
                    break;
                case 6:
                    System.out.println("July 2021\t" + dates[i]);
                    break;
                case 7:
                    System.out.println("August 2021\t" + dates[i]);
                    break;
                case 8:
                    System.out.println("September 2021\t" + dates[i]);
                    break;
                case 9:
                    System.out.println("October 2021\t" + dates[i]);
                    break;
                case 10:
                    System.out.println("November 2021\t" + dates[i]);
                    break;
                case 11:
                    System.out.println("December 2021\t" + dates[i]);
                    break;
                case 12:
                    System.out.println("January 2022\t" + dates[i]);
                    break;
                case 13:
                    System.out.println("February 2022\t" + dates[i]);
                    break;
                case 14:
                    System.out.println("March 2022\t" + dates[i]);
                    break;
                case 15:
                    System.out.println("April 2022\t" + dates[i]);
                    break;
                case 16:
                    System.out.println("May 2022\t" + dates[i]);
                    break;
                case 17:
                    System.out.println("June 2022\t" + dates[i]);
                    break;
                case 18:
                    System.out.println("July 2022\t" + dates[i]);
                    break;
                case 19:
                    System.out.println("August 2022\t" + dates[i]);
                    break;
                case 20:
                    System.out.println("September 2022\t" + dates[i]);
                    break;
                case 21:
                    System.out.println("October 2022\t" + dates[i]);
                    break;
                case 22:
                    System.out.println("November 2022\t" + dates[i]);
                    break;
                case 23:
                    System.out.println("December 2022\t" + dates[i]);
                    break;
            }
        }
    }
}
