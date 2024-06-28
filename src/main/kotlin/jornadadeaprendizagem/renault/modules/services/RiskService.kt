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

    fun update(id: UUID, requestRiskDTO: RequestRiskDTO): ResponseRiskDTO = ResponseRiskDTO(riskProvider.update(id, Risk(requestRiskDTO)))

    fun delete(id: UUID) = riskProvider.delete(id)
}