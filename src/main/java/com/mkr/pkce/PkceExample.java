package com.mkr.pkce;

import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PkceExample {
	
	public static void main(String[] args) {

        try {
            
            PkceUtil pkce = new PkceUtil();
     
            String codeVerifier = pkce.generateCodeVerifier();
            System.out.println("Code verifier: " + codeVerifier);
 
        } catch (UnsupportedEncodingException ex) {
            Logger.getLogger(PkceExample.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
