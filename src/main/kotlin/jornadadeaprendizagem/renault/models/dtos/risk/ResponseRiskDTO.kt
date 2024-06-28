package jornadadeaprendizagem.renault.models.dtos.risk

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import jornadadeaprendizagem.renault.models.entities.Risk
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

@ApiModel(
        value = "ResponseRiskDTO",
        description = "Response Data Transfer Object for Risk"
)
data class ResponseRiskDTO (
        @JsonProperty("id")
        val id : UUID,

        @JsonProperty("name")
        val name : String,

        @JsonProperty("type")
        val type : String,

        @JsonProperty("departament")
        val departament : String,

        @JsonProperty("startDate")
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        val startDate : Date?,

        @JsonProperty("consequence")
        val consequence : String,

        @JsonProperty("project")
        val project : String,

        @JsonProperty("metier")
        val metier : String,

        @JsonProperty("jalon")
        val jalon : String,

        @JsonProperty("futurejalon")
        val futurejalon : String,

        @JsonProperty("probability")
        val probability : String,

        @JsonProperty("impact")
        val impact : String,

        @JsonProperty("classification")
        val classification : String,

        @JsonProperty("generalimpact")
        val generalimpact : String,

        @JsonProperty("risksituation")
        val risksituation : String){

    constructor(risk: Risk) : this(
            id = UUID.randomUUID(),
            name = risk.name,
            type = risk.type,
            departament = risk.departament,
            startDate = risk.startDate,
            consequence = risk.consequence,
            project = risk.project,
            metier = risk.metier,
            jalon = risk.jalon,
            futurejalon = risk.futurejalon,
            probability = risk.probability,
            impact = risk.impact,
            classification = risk.classification,
            generalimpact = risk.generalimpact,
            risksituation = risk.risksituation
    )
}