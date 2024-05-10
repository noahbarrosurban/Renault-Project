package jornadadeaprendizagem.renault.modules.controllers

import io.swagger.annotations.Api
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import jornadadeaprendizagem.renault.models.entities.Pilot
import jornadadeaprendizagem.renault.modules.services.PilotService
import org.springframework.web.bind.annotation.*
import java.util.*

@Api(value = "Pilot", description = "Pilot Controller")
@RestController
@RequestMapping("/pilot")
class PilotController (private val pilotService: PilotService){

    @GetMapping
    @Operation(summary = "Get all pilots")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "Ok"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun getAllPilots() : List<Pilot> {
        return pilotService.findAll()
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get all pilots by id")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun getPilotById(id: UUID) : Pilot {
        return pilotService.findById(id)
    }

    @PostMapping
    @Operation(summary = "Save a pilot")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun savePilot(pilot: Pilot) : Pilot {
        return pilotService.save(pilot)
    }

    @PutMapping
    @Operation(summary = "Update a pilot")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun updatePilot(id: UUID, pilot: Pilot) : Pilot {
        return pilotService.update(id, pilot)
    }

    @DeleteMapping
    @Operation(summary = "Delete a pilot")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun deletePilot(id: UUID) {
        return pilotService.delete(id)
    }
}