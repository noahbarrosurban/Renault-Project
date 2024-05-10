package jornadadeaprendizagem.renault.modules.providers

import jornadadeaprendizagem.renault.models.entities.Pilot
import jornadadeaprendizagem.renault.modules.repositories.PilotRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class PilotProvider (private val pilotRepository: PilotRepository) {
    fun findAll(): List<Pilot> {
        return pilotRepository.findAll()
    }

    fun findById(id: UUID): Pilot {
        return pilotRepository.findById(id).orElseThrow()
    }

    fun save(pilot: Pilot): Pilot {
        return pilotRepository.save(pilot)
    }

    fun update(id: UUID, pilot: Pilot): Pilot {
        val pilotUpdate = pilotRepository.findById(id).orElseThrow()
        return pilotRepository.save(pilotUpdate)
    }

    fun delete(id: UUID){
        return pilotRepository.deleteById(id)
    }
}