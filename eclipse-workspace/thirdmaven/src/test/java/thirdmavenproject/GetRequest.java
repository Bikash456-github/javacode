package thirdmavenproject;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetRequest {
	@Test
public void verifyGetRequest() {
		//specify the base url
		RestAssured.baseURI="https://reqres.in/";
		//Requestspecification object
		RequestSpecification httpRequest=RestAssured.given();
		//maker equest to retrieve the data from server
		Response res=httpRequest.request(Method.GET,"/api/user? page=2");
		String responseBody=res.getBody().asPrettyString();
		System.out.println(responseBody);
	    Assert.assertTrue(res.getStatusCode()==200);
	    JsonPath js=JsonPath.from(responseBody);
	    String email=js.getString ("data.email");
	    Assert.assertTrue(email.equals ("ianet.weaver@regres.in"));
	    System.out.println("Status code is 200 and assertions passed");
	    JsonPath Js=JsonPath.from(responseBody);
	    String emil=js.getString ("data.email");
	    System.out.println(js.getString("support.url"));
	    Assert.assertTrue(email.equals("janet.weaver@reqres.in"));
	    System.out.println ("Status code is 200 and assertions passed");
	    
	
}
}
