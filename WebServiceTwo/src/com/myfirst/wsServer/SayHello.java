/**
 * 
 */
package com.myfirst.wsServer;

import javax.jws.WebService;
/**
 * @author vinodkottem
 *
 */

@WebService

public class SayHello {
	private static final String SALUTATION = "Hello";
    
	 public String getGreeting( String name ) {
	  return SALUTATION + " " + name;
	 }
}
