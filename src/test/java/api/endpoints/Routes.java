package api.endpoints;
//swagger -- https://petstore.swagger.io
//post-- https://petstore.swagger.io/v2/user
//get -- https://petstore.swagger.io/v2/user/{username}
//put -- https://petstore.swagger.io/v2/user/{username}
//delete -- https://petstore.swagger.io/v2/user/{username}
public class Routes {
    public static String baseUrl="https://petstore.swagger.io/v2";

    //User module
    public static String post_Url=baseUrl+"/user";
    public static String get_Url=baseUrl+"/user/{username}";
    public static String update_Url=baseUrl+"/user/{username}";
    public static String delete_Url=baseUrl+"/user/{username}";

}
