package lk.ijse.gdse.springdeployment.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class EventDTO {
    private Long id;
    private String name;
    private String description;
    private String date;
    private String location;
}
