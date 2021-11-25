import io.restassured.http.ContentType;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class CreateUsersData {


    @Test
    public void testCreatingAUserAndValidatingStatusCode() {

        UserDetails userDetails = new UserDetails();
        userDetails.setId(0);
        userDetails.setUsername("neha");
        userDetails.setFirstname("neha");
        userDetails.setLastname("Sharma");
        userDetails.setEmail("neha@abc.com");
        userDetails.setPassword("12345");
        userDetails.setPhone("9999999");
        userDetails.setUserStatus(1);

        given().
                contentType(ContentType.JSON).
                body(userDetails).
                log().body().
                when().
                post("https://petstore.swagger.io/v2/user").
                then().
                assertThat().
                statusCode(200);
    }
}
