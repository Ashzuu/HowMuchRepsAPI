package ashzuu.project.hmr.controllers;

import jakarta.annotation.Resource;
import jakarta.ws.rs.Path;

/**
 * Controller to manage all stats which appears in the dashboard when the user connecting to the front.
 * The use of this controller is according to the need of users, and the profil connected.
 */
@Resource
@Path("/stats")
public class StatController {
    @Path("/global")
    public void global(){
        return;
    }
}
