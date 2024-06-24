package jornadadeaprendizagem.renault.modules.services

import jornadadeaprendizagem.renault.models.dtos.ResponseActionDTO
import jornadadeaprendizagem.renault.models.entities.Action
import jornadadeaprendizagem.renault.modules.providers.ActionProvider
import org.springframework.stereotype.Service
import java.util.UUID

@Service
class ActionService (private val actionProvider: ActionProvider) {

    fun create(action: Action): ResponseActionDTO = ResponseActionDTO(actionProvider.create(action))

    //read
    fun findAll(): List<ResponseActionDTO> = actionProvider.findAll().map { ResponseActionDTO(it) }

    //read
    fun findById(id: UUID): ResponseActionDTO = ResponseActionDTO(actionProvider.findById(id))

    fun update(id: UUID, action: Action): ResponseActionDTO = ResponseActionDTO(actionProvider.update(id, action))

    fun delete(id: UUID) = actionProvider.delete(id)
}