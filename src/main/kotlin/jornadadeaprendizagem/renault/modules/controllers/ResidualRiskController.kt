package jornadadeaprendizagem.renault.modules.controllers

import io.swagger.annotations.Api
import io.swagger.v3.oas.annotations.Operation
import io.swagger.v3.oas.annotations.responses.ApiResponse
import io.swagger.v3.oas.annotations.responses.ApiResponses
import jornadadeaprendizagem.renault.models.dtos.residualrisk.RequestResidualRiskDTO
import jornadadeaprendizagem.renault.models.dtos.residualrisk.ResponseResidualRiskDTO
import jornadadeaprendizagem.renault.modules.services.ResidualRiskService
import org.springframework.web.bind.annotation.*
import java.util.*

@Api(value = "ResidualRisk", description = "Residual Risk Controller")
@RestController
@RequestMapping("/residual-risk")
class ResidualRiskController (private val residualRiskService: ResidualRiskService){

    @PostMapping
    @Operation(summary = "Create a residual risk")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun createResidualRisk(requestResidualRiskDTO : RequestResidualRiskDTO) : ResponseResidualRiskDTO {
        return residualRiskService.create(requestResidualRiskDTO)
    }

    @GetMapping
    @Operation(summary = "Get all residual risks")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "Ok"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun getAllResidualRisks() : List<ResponseResidualRiskDTO> {
        return residualRiskService.findAll()
    }

    @GetMapping("/{id}")
    @Operation(summary = "Get residual risk by id")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun getResidualRiskById(id: UUID) : ResponseResidualRiskDTO {
        return residualRiskService.findById(id)
    }

    @PutMapping
    @Operation(summary = "Update a residual risk")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun updateResidualRisk(id: UUID, requestResidualRiskDTO: RequestResidualRiskDTO) : ResponseResidualRiskDTO {
        return residualRiskService.update(id, requestResidualRiskDTO)
    }

    @DeleteMapping
    @Operation(summary = "Delete a residual risk")
    @ApiResponses(value = [
        ApiResponse(responseCode = 200.toString(), description = "OK"),
        ApiResponse(responseCode = 401.toString(), description = "Unauthorized"),
        ApiResponse(responseCode = 404.toString(), description = "Not Found")])
    fun deleteResidualRisk(id: UUID) {
        return residualRiskService.delete(id)
    }
}