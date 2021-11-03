/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.google.protobuf.TextFormat.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;


/**
 *
 * @author Lenovo
 */
public class ConvertidorFechas {
    
     Scanner input = new Scanner (System.in);
        
    
    public String ParseFecha() throws java.text.ParseException 
    {
        String fecha = input.next();
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
        Date fechaDate = null;
        fechaDate = formato.parse(fecha);
        String convertedCurrentDate =formato.format(formato.parse(fecha));
        System.out.println(convertedCurrentDate);
        return convertedCurrentDate;
    }
    
    
}
