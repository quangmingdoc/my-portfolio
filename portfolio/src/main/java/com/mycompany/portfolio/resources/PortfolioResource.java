package com.mycompany.portfolio.resources;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import jakarta.json.Json;
import jakarta.json.JsonObject;

/**
 * REST API cho Portfolio
 */
@Path("portfolio")
public class PortfolioResource {
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getPortfolioInfo() {
        JsonObject portfolio = Json.createObjectBuilder()
                .add("name", "Portfolio của tôi")
                .add("title", "Java Developer & Web Developer")
                .add("description", "Developer đam mê công nghệ và sáng tạo")
                .add("skills", Json.createArrayBuilder()
                        .add("Java")
                        .add("Jakarta EE")
                        .add("Spring Framework")
                        .add("HTML/CSS/JavaScript")
                        .add("React")
                        .add("MySQL")
                        .add("Git")
                        .add("Maven"))
                .add("projects", Json.createArrayBuilder()
                        .add(Json.createObjectBuilder()
                                .add("name", "E-Commerce Platform")
                                .add("description", "Nền tảng thương mại điện tử")
                                .add("tech", "Java Spring Boot, React"))
                        .add(Json.createObjectBuilder()
                                .add("name", "Hospital Management System")
                                .add("description", "Hệ thống quản lý bệnh viện")
                                .add("tech", "Jakarta EE, JPA"))
                        .add(Json.createObjectBuilder()
                                .add("name", "Data Analytics Dashboard")
                                .add("description", "Dashboard phân tích dữ liệu")
                                .add("tech", "Java, Chart.js")))
                .build();
        
        return Response.ok(portfolio).build();
    }
    
    @GET
    @Path("status")
    @Produces(MediaType.TEXT_PLAIN)
    public Response getStatus() {
        return Response.ok("Portfolio API đang hoạt động! ✅").build();
    }
} 