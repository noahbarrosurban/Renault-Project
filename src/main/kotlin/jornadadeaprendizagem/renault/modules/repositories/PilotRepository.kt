package jornadadeaprendizagem.renault.modules.repositories

import jornadadeaprendizagem.renault.models.entities.Pilot
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface PilotRepository : JpaRepository<Pilot, UUID>