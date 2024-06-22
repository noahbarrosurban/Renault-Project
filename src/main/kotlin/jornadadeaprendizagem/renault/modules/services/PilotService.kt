package jornadadeaprendizagem.renault.modules.services

import jornadadeaprendizagem.renault.models.dtos.ResponsePilotDTO
import jornadadeaprendizagem.renault.models.entities.Pilot
import jornadadeaprendizagem.renault.modules.providers.PilotProvider
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class PilotService (private val pilotProvider: PilotProvider) {

    fun create(pilot: Pilot): ResponsePilotDTO = ResponsePilotDTO(pilotProvider.create(pilot))

    //read
    fun findAll(): List<ResponsePilotDTO> {
        return pilotProvider.findAll().map { pilot ->
            ResponsePilotDTO(pilot)}
    }

    //read
    fun findById(id: UUID): ResponsePilotDTO = ResponsePilotDTO(pilotProvider.findById(id))

    fun update(id: UUID, pilot: Pilot): ResponsePilotDTO = ResponsePilotDTO(pilotProvider.update(id, pilot))

    fun delete(id: UUID) = pilotProvider.delete(id)
}