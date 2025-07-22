package jornadadeaprendizagem.renault.modules.providers

import jornadadeaprendizagem.renault.models.entities.Pilot
import jornadadeaprendizagem.renault.modules.repositories.PilotRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class PilotProvider (private val pilotRepository: PilotRepository) {

    fun create(pilot: Pilot): Pilot {
        return pilotRepository.save(pilot)
    }

    //read
    fun findAll(): List<Pilot> {
        return pilotRepository.findAll()
    }

    //read
    fun findById(id: UUID): Pilot {
        return pilotRepository.findById(id).orElseThrow()
    }

    fun update(id: UUID, pilot: Pilot): Pilot {
        return pilotRepository.save(pilot)
    }

    fun delete(id: UUID){
        return pilotRepository.deleteById(id)
    }
}