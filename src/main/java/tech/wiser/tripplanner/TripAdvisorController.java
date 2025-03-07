  package tech.wiser.tripplanner;


import org.springframework.ai.chat.model.ChatModel;
import org.springframework.ai.chat.model.ChatResponse;
import org.springframework.ai.chat.prompt.Prompt;
import org.springframework.ai.openai.OpenAiChatOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tripadvisor")

public class TripAdvisorController {


    @Autowired
    ChatModel chatModel;

    @PostMapping("/details")
    public ResponseEntity<String> getTripDetails(@RequestBody TripRequest request) {


        String finalPrompt = Prompts.TRIP_DETAILS_PROMPT
                .replace("SOURCE", request.getSource())
                .replace("TARGET", request.getDestination())
                .replaceAll("SATRT_DATE", request.getStartDate())
                .replace("END_DATE", request.getEndDate())
                .replace("BUDGET_OPTION", request.getBudgetOptions())
                .replace("TRIP_INTEREST", String.join(",", request.getInterests()));


        ChatResponse response = chatModel.call(new Prompt(
                finalPrompt,
                OpenAiChatOptions.builder()
                        .withModel("gpt-4o")
                        .withTemperature(0.4)
                        .build()
        ));

        String output = response.getResult().getOutput().getContent().replace("```json", "").replace("```", "");

        return ResponseEntity.ok().contentType(MediaType.APPLICATION_JSON).body(output);
    }

}
