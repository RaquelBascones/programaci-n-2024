package edu.ucjc.programacion.ArraysStrings;

public class ejEmailsArrayDeStrings {
    public static void main(String[] args) {
    	String[]emails = {
    			"holacaracola@gmail.com",
    			"hola caracola@gmail.com",
    			"holacaracola@gmail.com ",
    			"holaaaaagmail@@gmail.com",
    			"holacaracola@g.mail.com",
    			"holacaracola@gmail.com123",
    			"holaaaaagmail.com"};
    	
    	for(String email: emails) {
    		boolean isValid=true;
    		String mensaje= "";
    		email=email.trim(); //elimino los espacios en blanco
    		
    		
    		if (email.contains(" ")) {
    			isValid=false;
    			mensaje +=" tiene un espacio en blanco";
    		}
    		if (!email.contains("@") || email.indexOf("@")!=email.lastIndexOf("@")) {
    			isValid=false;
    			mensaje +=" debe tener un @";
    			
    		}else {
    			int posicionArroba=email.indexOf("@");
    			String dominio=email.substring(posicionArroba+1);
    			if (!dominio.contains(".")) {
    				isValid=false;
    				mensaje+= " debe contener un punto despu´s de la @";
    				
    			}else {
    				if (dominio.indexOf(".")<2) {
    					isValid=false;
    					mensaje += ",la distancia entre el @ y el primer punto después de ésta tiene que ser superior a 2";
    				}
    				String subdominio=dominio.substring(dominio.lastIndexOf(".")+1);
    				if(subdominio.length()<2|| subdominio.length()>5) {
    					isValid=false;
    					mensaje+=",el número de caracteres después del último punto debe estar entre 2 y 5";
    				}
    				
    			}
    			
    		}
    		
    		
    		if(!isValid) {
    			System.out.println("El email"+email+ "no es válido"+ mensaje);
    		}
    	}
    			
    	}
    }
      
       
