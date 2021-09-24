package hello;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import hello.UserSimple;

public class App {
    public static void main(String[] args) {
        System.out.println("----------app----------");

        deserializeUser();


        System.out.println("----------app end----------");
    }

    private static void serializeUser(){
        UserSimple userObject = new UserSimple(
                1,
                "taixingbi",
                "tb@gmail.com",
                true
        );

        Gson gson = new GsonBuilder().excludeFieldsWithoutExposeAnnotation().create();
        String userJson = gson.toJson(userObject);
        System.out.println("userJson"+ userJson);
    }

    private static void deserializeUser() {
        String userJson= "{\"id\":1,\"name\":\"taixingbi\",\"email\":\"tb@gmail.com\",\"isDeveloper\":true}";
        Gson gson = new Gson();
        UserSimple userObject = gson.fromJson(userJson, UserSimple.class);

        System.out.println("getName: "+ userObject.getName());
    }

}
