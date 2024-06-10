package at.din.user;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("user")
public class UserEndpoint {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String test() {
        return "Hello from Quarkus REST";
    }

}
