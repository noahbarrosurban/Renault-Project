package jornadadeaprendizagem.renault.modules.controllers

import io.swagger.annotations.Api
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import jornadadeaprendizagem.renault.models.dtos.action.ResponseActionDTO
import jornadadeaprendizagem.renault.models.entities.Action
import jornadadeaprendizagem.renault.modules.services.ActionService
import org.springframework.web.bind.annotation.*
import java.util.*

@Api(value = "Action", description = "Action Controller")
@RestController
@RequestMapping("/action")
class ActionController (private val actionService: ActionService){

    @PostMapping
    @Operation(summary = "Create a Action")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun createAction(action: Action) : ResponseActionDTO {
        return actionService.create(action)
    }

    //read
    @GetMapping
    @Operation(summary = "Get all actions")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "Ok"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun getAllActions() : List<ResponseActionDTO> {
        return actionService.findAll()
    }

    //read
    @GetMapping("/{id}")
    @Operation(summary = "Get all actions by id")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun getActionById(id: UUID) : ResponseActionDTO {
        return actionService.findById(id)
    }

    @PutMapping
    @Operation(summary = "Update a action")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun updateAction(id: UUID, action: Action) : ResponseActionDTO {
        return actionService.update(id, action)
    }

    @DeleteMapping
    @Operation(summary = "Delete a action")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun deleteAction(id: UUID) {
        return actionService.delete(id)
    }
}