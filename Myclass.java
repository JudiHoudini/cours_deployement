/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Path("/user")
public class Myclass {    
    /*@GET
    public String myFunction() {
        return "Resultat de la fonction";
    }*/
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudent() {
        Student student = new Student("Rakoto", "Faly", "Sain Paulin", "One", 14);
        return student;
    }
    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public Response createStudent(Student student) {
        System.out.println("Donnee JSON recue"+student.toString());
        return Response.status(Response.Status.CREATED).entity(student).build();
    }
}
