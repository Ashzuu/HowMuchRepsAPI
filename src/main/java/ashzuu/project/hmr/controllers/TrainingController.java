package ashzuu.project.hmr.controllers;

import jakarta.annotation.Resource;
import jakarta.ws.rs.Path;

/**
 * Controller to manage all training, with authentication of not.
 * The user must be able to create new training according to known exercises, etc...
 */
@Resource
@Path("/training")
public class TrainingController {
    @Path("/all")
    public void getAllTrainings(){

    }
}
