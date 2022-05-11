package site.metacoding.mongotest;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Document(collection = "navers")
public class Navers {

    @Id
    private String _id;
    private String company;
    private String title;
    private String createdAt;
    
}
