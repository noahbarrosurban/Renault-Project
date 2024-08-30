package jornadadeaprendizagem.renault.modules.services

import jornadadeaprendizagem.renault.models.dtos.risk.RequestRiskDTO
import jornadadeaprendizagem.renault.models.dtos.risk.ResponseRiskDTO
import jornadadeaprendizagem.renault.models.entities.Risk
import jornadadeaprendizagem.renault.modules.providers.RiskProvider
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class RiskService (private val riskProvider: RiskProvider) {

    fun create(requestRiskDTO: RequestRiskDTO): ResponseRiskDTO = ResponseRiskDTO(riskProvider.create(Risk(requestRiskDTO)))

    //read
    fun findAll(): List<ResponseRiskDTO> = riskProvider.findAll().map { ResponseRiskDTO(it) }

    //read
    fun findById(id: UUID): ResponseRiskDTO = ResponseRiskDTO(riskProvider.findById(id))

    fun update(id: UUID, requestRiskDTO: RequestRiskDTO): ResponseRiskDTO {
        val existingRisk = riskProvider.findById(id)
        existingRisk.name = requestRiskDTO.name
        existingRisk.type = requestRiskDTO.type
        existingRisk.departament = requestRiskDTO.departament
        existingRisk.startDate = requestRiskDTO.startDate
        existingRisk.consequence = requestRiskDTO.consequence
        existingRisk.project = requestRiskDTO.project
        existingRisk.metier = requestRiskDTO.metier
        existingRisk.jalon = requestRiskDTO.jalon
        existingRisk.futurejalon = requestRiskDTO.futurejalon
        existingRisk.probability = requestRiskDTO.probability
        existingRisk.impact = requestRiskDTO.impact
        existingRisk.classification = requestRiskDTO.classification
        existingRisk.generalimpact = requestRiskDTO.generalimpact
        existingRisk.risksituation = requestRiskDTO.risksituation
        return ResponseRiskDTO(riskProvider.update(id, existingRisk))
    }
    fun delete(id: UUID) = riskProvider.delete(id)
}