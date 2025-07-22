package jornadadeaprendizagem.renault.modules.controllers

import io.swagger.annotations.Api
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import jornadadeaprendizagem.renault.models.dtos.risk.RequestRiskDTO
import jornadadeaprendizagem.renault.models.dtos.risk.ResponseRiskDTO
import jornadadeaprendizagem.renault.modules.services.RiskService
import org.springframework.web.bind.annotation.*
import java.util.*

@Api(value = "Risk", description = "Risk Controller")
@RestController
@RequestMapping("/risk")
class RiskController (private val riskService: RiskService){

    @PostMapping
    @Operation(summary = "Create a risk")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun createRisk(requestRiskDTO : RequestRiskDTO) : ResponseRiskDTO {
        return riskService.create(requestRiskDTO)
    }

    //read
    @GetMapping
    @Operation(summary = "Get all risks")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "Ok"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun getAllRisks() : List<ResponseRiskDTO> {
        return riskService.findAll()
    }

    //read
    @GetMapping("/{id}")
    @Operation(summary = "Get risk by id")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun getRiskById(id: UUID) : ResponseRiskDTO {
        return riskService.findById(id)
    }

    @PutMapping
    @Operation(summary = "Update a risk")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun updateRisk(id: UUID, requestRiskDTO: RequestRiskDTO) : ResponseRiskDTO {
        return riskService.update(id, requestRiskDTO)
    }

    @DeleteMapping
    @Operation(summary = "Delete a risk")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun deleteRisk(id: UUID) {
        return riskService.delete(id)
    }
}