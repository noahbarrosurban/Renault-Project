package jornadadeaprendizagem.renault.modules.repositories

import jornadadeaprendizagem.renault.models.entities.Risk
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface RiskRepository : JpaRepository<Risk, UUID>