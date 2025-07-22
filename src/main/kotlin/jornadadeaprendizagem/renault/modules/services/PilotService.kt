package jornadadeaprendizagem.renault.modules.services

import jornadadeaprendizagem.renault.models.dtos.pilot.RequestPilotDTO
import jornadadeaprendizagem.renault.models.dtos.pilot.ResponsePilotDTO
import jornadadeaprendizagem.renault.models.entities.Pilot
import jornadadeaprendizagem.renault.modules.providers.PilotProvider
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class PilotService (private val pilotProvider: PilotProvider) {

    fun create(requestPilotDTO: RequestPilotDTO): ResponsePilotDTO = ResponsePilotDTO(pilotProvider.create(Pilot(requestPilotDTO)))

    //read
    fun findAll(): List<ResponsePilotDTO> = pilotProvider.findAll().map { ResponsePilotDTO(it) }

    //read
    fun findById(id: UUID): ResponsePilotDTO = ResponsePilotDTO(pilotProvider.findById(id))

    fun update(id: UUID, requestPilotDTO: RequestPilotDTO): ResponsePilotDTO {
        var existingPilot = pilotProvider.findById(id)
        existingPilot.name = requestPilotDTO.name
        return ResponsePilotDTO(pilotProvider.update(id, existingPilot))
    }

    fun delete(id: UUID) = pilotProvider.delete(id)
}