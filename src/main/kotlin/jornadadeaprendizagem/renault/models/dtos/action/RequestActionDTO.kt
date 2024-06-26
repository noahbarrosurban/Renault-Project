package jornadadeaprendizagem.renault.models.dtos.action

import com.fasterxml.jackson.annotation.JsonProperty
import io.swagger.annotations.ApiModel
import io.swagger.annotations.ApiModelProperty
import org.springframework.format.annotation.DateTimeFormat
import java.util.*

@ApiModel(
        value = "RequestActionDTO",
        description = "Request Data Transfer Object for Action"
)
data class RequestActionDTO (
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
        val captalization : String)