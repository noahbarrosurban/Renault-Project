package jornadadeaprendizagem.renault.models.dtos.risk

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

@ApiModel(
        value = "RequestRiskDTO",
        description = "Request Data Transfer Object for Risk"
)
data class RequestRiskDTO (
        @JsonProperty("name")
        val name : String,

        @JsonProperty("description")
        val description : String,

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
        val risksituation : String
)