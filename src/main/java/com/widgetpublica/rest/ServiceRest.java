package com.widgetpublica.rest;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import oauth.signpost.OAuthConsumer;
import oauth.signpost.basic.DefaultOAuthConsumer;

import com.fluig.customappkey.Keyring;
import com.fluig.sdk.api.customappkey.KeyVO;

@Path("/service")
public class ServiceRest {
		
    @GET
    @Path("helloWorld")
    @Produces(MediaType.APPLICATION_JSON)
    public Response getHelloWorld() {
      String hello = "Hello World API!";
      Integer status = 200;
      
      Map<String, String> response = new HashMap<String, String>();
      response.put("chave_1", hello);
      
      return Response.status(status).entity(response).type(MediaType.APPLICATION_JSON).build();
    }
    
    @GET
    @Path("layouts/{tenantId}")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
	public Response getLayouts(@PathParam("tenantId") Long tenantId){
    	String APP_KEY = "9876-5432-1987-6543";
    	String UTF_8_ENCODE = StandardCharsets.UTF_8.name();
    	
    	try {
    		KeyVO key = Keyring.getKeys(tenantId, APP_KEY);
        	OAuthConsumer consumer = new DefaultOAuthConsumer(key.getConsumerKey(),key.getConsumerSecret());
        	consumer.setTokenWithSecret(key.getToken(), key.getTokenSecret());
        	
        	URL url = new URL(key.getDomainUrl() + "/page-management/api/v2/layouts");
        	
        	HttpURLConnection urlConnection = (HttpURLConnection) url.openConnection();
        	urlConnection.setRequestMethod("GET");
        	urlConnection.setDoInput(true);
        	urlConnection.setDoOutput(true);
        	consumer.sign(urlConnection);
        	urlConnection.connect();
        	
        	Reader input = new BufferedReader(new InputStreamReader(urlConnection.getInputStream(), UTF_8_ENCODE));
        	String retLayout = "";
        	
        	for (int c = input.read(); c != -1; c = input.read()){
        		retLayout += (char) c;
        	}
        	
        	int code = urlConnection.getResponseCode();
        	urlConnection.disconnect();
        	return Response.status(code).entity(retLayout).build();
        	
		} catch (Exception e) {
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
		}
    }
}