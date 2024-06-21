package jornadadeaprendizagem.renault.modules.services

import jornadadeaprendizagem.renault.models.dtos.PilotDTO
import jornadadeaprendizagem.renault.models.entities.Pilot
import jornadadeaprendizagem.renault.modules.providers.PilotProvider
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class PilotService (private val pilotProvider: PilotProvider) {

    fun findAll(): List<PilotDTO> {
        return pilotProvider.findAll().map { pilot ->
            PilotDTO(pilot)}
    }

    fun findById(id: UUID): PilotDTO = PilotDTO(pilotProvider.findById(id))

    fun save(pilot: Pilot): PilotDTO = PilotDTO(pilotProvider.save(pilot))

    fun update(id: UUID, pilot: Pilot): PilotDTO = PilotDTO(pilotProvider.update(id, pilot))

    fun delete(id: UUID) = pilotProvider.delete(id)
}