package api.endpoints;

import static io.restassured.RestAssured.given;
import api.payloads.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Userendpoints {

    public static Response createUser(User payload)
    {
    Response response=given().contentType(ContentType.JSON).accept(ContentType.JSON).body(payload)
            .when().post(Routes.post_Url);
    return response;
    }

    public static Response readUser(String Username)
    {
        Response response=given().pathParams("username",Username)
                .when().get(Routes.get_Url);
        return response;
    }

    public static Response updateUser(String Username, User payload)
    {
        Response response=given().contentType(ContentType.JSON).accept(ContentType.JSON).pathParams("username",Username).body(payload)
                .when().put(Routes.update_Url);
        return response;
    }

    public static Response deleteUser(String Username)
    {
        Response response=given().pathParams("username",Username)
                .when().delete(Routes.delete_Url);
        return response;
    }
}
