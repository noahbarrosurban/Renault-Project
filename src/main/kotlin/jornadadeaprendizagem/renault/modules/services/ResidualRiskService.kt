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

    fun update(id: UUID, requestResidualRiskDTO : RequestResidualRiskDTO): ResponseResidualRiskDTO = ResponseResidualRiskDTO(residualRiskProvider.update(id, ResidualRisk(requestResidualRiskDTO)))

    fun delete(id: UUID) = residualRiskProvider.delete(id)
}