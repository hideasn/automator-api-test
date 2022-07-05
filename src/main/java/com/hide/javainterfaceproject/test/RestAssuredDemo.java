package com.hide.javainterfaceproject.test;

import static io.restassured.RestAssured.*;

/**
 * @program: java-interface-project
 * @ClassName: RestAssuredDemo
 * @description:
 * @author: HideAsn
 * @create: 2022-06-18
 */
public class RestAssuredDemo {
    public static void main(String[] args) {
        given().
                queryParam("name","张三").
        when().
                get("http://httpbin.org/get").
        then().
                log().all();

    }
}
