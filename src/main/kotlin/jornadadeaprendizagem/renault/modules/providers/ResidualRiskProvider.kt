package jornadadeaprendizagem.renault.modules.providers

import jornadadeaprendizagem.renault.models.entities.ResidualRisk
import jornadadeaprendizagem.renault.modules.repositories.ResidualRiskRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class ResidualRiskProvider (private val residualRiskRepository: ResidualRiskRepository) {

    fun create(residualRisk: ResidualRisk): ResidualRisk {
        return residualRiskRepository.save(residualRisk)
    }

    fun findAll(): List<ResidualRisk> {
        return residualRiskRepository.findAll()
    }

    fun findById(id: UUID): ResidualRisk {
        return residualRiskRepository.findById(id).orElseThrow()
    }

    fun update(id: UUID, residualRisk: ResidualRisk): ResidualRisk {
        return residualRiskRepository.save(residualRisk)
    }

    fun delete(id: UUID) {
        return residualRiskRepository.deleteById(id)
    }
}