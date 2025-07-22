package jornadadeaprendizagem.renault.models.dtos.action

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import jornadadeaprendizagem.renault.models.entities.Action
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

@ApiModel(
        value = "ResponseActionDTO",
        description = "Response Data Transfer Object for Action"
)
data class ResponseActionDTO (
        @JsonProperty("id")
        val id : UUID,

        @JsonProperty("strategy")
        val strategy : String,

        @JsonProperty("description")
        val description : String,

        @JsonProperty("alertdate")
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        val alertDate : Date?,

        @JsonProperty("startdate")
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        val startDate : Date?,

        @JsonProperty("enddate")
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        val endDate : Date?,

        @JsonProperty("hour")
        @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
        val hour : Date?,

        @JsonProperty("comment")
        val comment : String,

        @JsonProperty("captalization")
        val captalization : String
) {
    constructor(action: Action) : this(
            id = UUID.randomUUID(),
            strategy = action.strategy,
            description = action.description,
            alertDate = action.alertDate,
            startDate = action.startDate,
            endDate = action.endDate,
            hour = action.hour,
            comment = action.comment,
            captalization = action.captalization
    )
}