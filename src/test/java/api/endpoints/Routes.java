package api.endpoints;
/*Swagger url -->https://petstore.swagger.io //
base_url : https://petstore.swagger.io/v2
create user(post) : https://petstore.swagger.io/v2/user
get user (Get): https://petstore.swagger.io/v2/user/{username}
Update user (put) :  https://petstore.swagger.io/v2/user/{username}
delete user (delete) : https://petstore.swagger.io/v2/user/{username}
 */
public class Routes {

    public static String base_url ="https://petstore.swagger.io/v2";
  //User module
    public static String post_url  = base_url+"/user";
    public static String get_url  = base_url+"/user/{username}";
    public static String update_url  = base_url+"/user/{username}";
    public static String delete_url  = base_url+"/user/{username}";
}
