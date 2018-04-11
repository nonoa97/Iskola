
package verseny;

import java.util.ArrayList;

public class Verseny {

    public static void main(String[] args) {
       
      
       ArrayList<Hallgato> hallgato = new ArrayList<>();
        
       hallgato.add(new Hallgato("Vezetéknév1","Keresztnév1","Sport1"));
       hallgato.add(new Hallgato("Vezetéknév2","Keresztnév2","Sport2"));
       hallgato.add(new Hallgato("Vezetéknév3","Keresztnév3","Sport3","Sport4"));
       
        for (int i = 0; i < hallgato.size(); i++) {
            System.out.println(hallgato.get(i));
        }
       
    }
    
     
    
         
            
    
}

class Hallgato {
        
        private final String kar = "GKZ";
private String vnev;
private String knev;
private String sport;
int rand; 
private String sport2 = null;
public static int szamlalo;

    


public  Hallgato(String vnev, String knev, String sport){
    this.vnev=vnev;
    this.knev=knev;
    this.sport=sport;
    this.szamlalo++;
    rand=(int) (Math.random()*2)+1;
}

public Hallgato(String vnev, String knev, String sport, String sport2 ){
    this.vnev=vnev;
    this.knev=knev;
    this.sport=sport;
    this.sport2=sport2;
    this.szamlalo++;
    rand=(int) (Math.random()*2)+1;
}


    public String getKar() {
        return kar;
    }

    public String getVnev() {
        return vnev;
    }

    public String getKnev() {
        return knev;
    }

    public String getSport() {
        return sport;
    }
    
    public String getSport2() {
        return sport2;
    }

    

    public void a(){
        
        if(sport2 == null){
        System.out.println(vnev+" "+knev+" "+kar+" "+sport+" "+rand+". busz.");
        }else{
            System.out.println(vnev+" "+knev+" "+kar+" "+sport+" "+sport2+" "+rand+". busz.");
        }
    }
       
    
   @Override
    public String toString(){
        String t;
         if(sport2 == null){
        t=(vnev+" "+knev+" "+kar+" "+sport+" "+rand+". busz.");
        }else{
           t= (vnev+" "+knev+" "+kar+" "+sport+" "+sport2+" "+rand+". busz.");
        }
        
        
        return t;
    }
        
        
        
    }
