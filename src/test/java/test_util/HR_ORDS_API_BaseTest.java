package test_util;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import static io.restassured.RestAssured.*;

public class HR_ORDS_API_BaseTest {

    @BeforeAll
    public static void init(){
        baseURI = "http://18.235.32.166:1000";
        basePath = "/ords/hr/api" ;
    }

    @AfterAll
    public static void cleanup(){
        reset();
    }

}