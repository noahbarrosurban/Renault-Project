package jornadadeaprendizagem.renault.models.entities

import jakarta.persistence.*
import jornadadeaprendizagem.renault.models.dtos.risk.RequestRiskDTO
import jornadadeaprendizagem.renault.models.dtos.risk.ResponseRiskDTO
import org.springframework.data.jpa.domain.support.AuditingEntityListener
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

@Entity
@EntityListeners(AuditingEntityListener::class)
@Table(name = "risks")
open class Risk (
    @Id
    @Column(name = "id")
    val id : UUID,

    @Column(name = "name")
    var name : String,

    @Column(name = "type")
    var type : String,

    @Column(name = "departament")
    var departament : String,

    @Column(name = "startdate")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    var startDate : Date?,

    @Column(name = "consequence")
    var consequence : String,

    @Column(name = "project")
    var project : String,

    @Column(name = "metier")
    var metier : String,

    @Column(name = "jalon")
    var jalon : String,

    @Column(name = "futurejalon")
    var futurejalon : String,

    @Column(name = "probability")
    var probability : String,

    @Column(name = "impact")
    var impact : String,

    @Column(name = "classification")
    var classification : String,

    @Column(name = "generalimpact")
    var generalimpact : String,

    @Column(name = "risksituation")
    var risksituation : String)
{

    constructor(responseRiskDTO : ResponseRiskDTO) : this(
        id = UUID.randomUUID(),
        name = responseRiskDTO.name,
        type = responseRiskDTO.type,
        departament = responseRiskDTO.departament,
        startDate = responseRiskDTO.startDate,
        consequence = responseRiskDTO.consequence,
        project = responseRiskDTO.project,
        metier = responseRiskDTO.metier,
        jalon = responseRiskDTO.jalon,
        futurejalon = responseRiskDTO.futurejalon,
        probability = responseRiskDTO.probability,
        impact = responseRiskDTO.impact,
        classification = responseRiskDTO.classification,
        generalimpact = responseRiskDTO.generalimpact,
        risksituation = responseRiskDTO.risksituation
    )

    constructor(requestRiskDTO: RequestRiskDTO) : this(
        id = UUID.randomUUID(),
        name = requestRiskDTO.name,
        type = requestRiskDTO.type,
        departament = requestRiskDTO.departament,
        startDate = requestRiskDTO.startDate,
        consequence = requestRiskDTO.consequence,
        project = requestRiskDTO.project,
        metier = requestRiskDTO.metier,
        jalon = requestRiskDTO.jalon,
        futurejalon = requestRiskDTO.futurejalon,
        probability = requestRiskDTO.probability,
        impact = requestRiskDTO.impact,
        classification = requestRiskDTO.classification,
        generalimpact = requestRiskDTO.generalimpact,
        risksituation = requestRiskDTO.risksituation
    )
}