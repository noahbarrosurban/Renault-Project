package jornadadeaprendizagem.renault.modules.providers

import jornadadeaprendizagem.renault.models.entities.Risk
import jornadadeaprendizagem.renault.modules.repositories.RiskRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class RiskProvider (private val riskRepository: RiskRepository) {

    fun create(risk : Risk): Risk {
        return riskRepository.save(risk)
    }

    //read
    fun findAll(): List<Risk> {
        return riskRepository.findAll()
    }

    //read
    fun findById(id: UUID): Risk {
        return riskRepository.findById(id).orElseThrow()
    }

    fun update(id: UUID, risk : Risk): Risk {
        return riskRepository.save(risk)
    }

    fun delete(id: UUID){
        return riskRepository.deleteById(id)
    }
}