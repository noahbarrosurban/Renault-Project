package jornadadeaprendizagem.renault.modules.services


import jornadadeaprendizagem.renault.models.dtos.residualrisk.RequestResidualRiskDTO
import jornadadeaprendizagem.renault.models.dtos.residualrisk.ResponseResidualRiskDTO
import jornadadeaprendizagem.renault.models.entities.ResidualRisk
import jornadadeaprendizagem.renault.modules.providers.ResidualRiskProvider
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ResidualRiskService (private val residualRiskProvider: ResidualRiskProvider) {

    fun create(requestResidualRiskDTO: RequestResidualRiskDTO): ResponseResidualRiskDTO = ResponseResidualRiskDTO(residualRiskProvider.create(ResidualRisk(requestResidualRiskDTO)))

    //read
    fun findAll(): List<ResponseResidualRiskDTO> = residualRiskProvider.findAll().map { ResponseResidualRiskDTO(it) }

    //read
    fun findById(id: UUID): ResponseResidualRiskDTO = ResponseResidualRiskDTO(residualRiskProvider.findById(id))

    fun update(id: UUID, requestResidualRiskDTO: RequestResidualRiskDTO): ResponseResidualRiskDTO {
        var existingResidualRisk = residualRiskProvider.findById(id)
        existingResidualRisk.probability = requestResidualRiskDTO.probability
        existingResidualRisk.impact = requestResidualRiskDTO.impact
        existingResidualRisk.classification = requestResidualRiskDTO.classification
        existingResidualRisk.action = requestResidualRiskDTO.action
        existingResidualRisk.risk = requestResidualRiskDTO.risk
        existingResidualRisk.resolutionDate = requestResidualRiskDTO.resolutionDate
        existingResidualRisk.status = requestResidualRiskDTO.status
        return ResponseResidualRiskDTO(residualRiskProvider.update(id, existingResidualRisk))
    }
    fun delete(id: UUID) = residualRiskProvider.delete(id)
}