package com.example.datefinder; 
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter; 
@RestController

public class MyController { 
    @GetMapping("/")
    public String getdate(){   
        LocalDate now = LocalDate.now(); 
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd-MM-yyyy"); 
        LocalDate Newdate = now.plusDays(100); 
        String res = Newdate.format(df); 
        return res; 
    }
    
}
