package jornadadeaprendizagem.renault.modules.repositories

import jornadadeaprendizagem.renault.models.entities.ResidualRisk
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface ResidualRiskRepository : JpaRepository<ResidualRisk, UUID>