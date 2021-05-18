package BRTProject;

import static spark.Spark.*;

public class BRTService {
    public static void main( String[] args ){
        staticFiles.location("/public");
        port(getPort());
        post("/logged", (req,res) -> {
            return true;
        });
        get("/auth", (req,res) -> true);
    }

    private static int getPort() {
        if (System.getenv("PORT") != null) {
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 35000;
    }
}
