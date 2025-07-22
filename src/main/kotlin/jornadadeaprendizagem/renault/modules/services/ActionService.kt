package jornadadeaprendizagem.renault.modules.services

import jornadadeaprendizagem.renault.models.dtos.action.RequestActionDTO
import jornadadeaprendizagem.renault.models.dtos.action.ResponseActionDTO
import jornadadeaprendizagem.renault.models.entities.Action
import jornadadeaprendizagem.renault.modules.providers.ActionProvider
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ActionService (private val actionProvider: ActionProvider) {

    fun create(requestActionDTO: RequestActionDTO): ResponseActionDTO = ResponseActionDTO(actionProvider.create(Action((requestActionDTO))))

    //read
    fun findAll(): List<ResponseActionDTO> = actionProvider.findAll().map { ResponseActionDTO(it) }

    //read
    fun findById(id: UUID): ResponseActionDTO = ResponseActionDTO(actionProvider.findById(id))

    fun update(id: UUID, requestActionDTO: RequestActionDTO): ResponseActionDTO {
        var existingAction = actionProvider.findById(id)
        existingAction.strategy = requestActionDTO.strategy
        existingAction.description = requestActionDTO.description
        existingAction.alertDate = requestActionDTO.alertDate
        existingAction.startDate = requestActionDTO.startDate
        existingAction.endDate = requestActionDTO.endDate
        existingAction.hour = requestActionDTO.hour
        existingAction.comment = requestActionDTO.comment
        existingAction.captalization = requestActionDTO.captalization
        return ResponseActionDTO(actionProvider.update(id, existingAction))
    }
    fun delete(id: UUID) = actionProvider.delete(id)
}