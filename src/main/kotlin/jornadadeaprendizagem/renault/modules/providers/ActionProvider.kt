package jornadadeaprendizagem.renault.modules.providers

import jornadadeaprendizagem.renault.models.entities.Action
import jornadadeaprendizagem.renault.modules.repositories.ActionRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class ActionProvider (private val actionRepository: ActionRepository) {

    fun create(action: Action): Action {
        return actionRepository.save(action)
    }

    //read
    fun findAll(): List<Action> {
        return actionRepository.findAll()
    }

    //read
    fun findById(id: UUID): Action {
        return actionRepository.findById(id).orElseThrow()
    }

    fun update(id: UUID, action: Action): Action {
        return actionRepository.save(action)
    }

    fun delete(id: UUID){
        return actionRepository.deleteById(id)
    }
}