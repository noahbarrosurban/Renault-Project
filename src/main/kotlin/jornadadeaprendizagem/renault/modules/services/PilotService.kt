package jornadadeaprendizagem.renault.modules.services

import jornadadeaprendizagem.renault.models.entities.Pilot
import jornadadeaprendizagem.renault.modules.providers.PilotProvider
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class PilotService (private val pilotProvider: PilotProvider) {
    fun findAll(): List<Pilot> {
        return pilotProvider.findAll()
    }

    fun findById(id: UUID): Pilot {
        return pilotProvider.findById(id)
    }

    fun save(pilot: Pilot): Pilot {
        return pilotProvider.save(pilot)
    }

    fun update(id: UUID, pilot: Pilot): Pilot {
        return pilotProvider.update(id, pilot)
    }

    fun delete(id: UUID){
        return pilotProvider.delete(id)
    }
}