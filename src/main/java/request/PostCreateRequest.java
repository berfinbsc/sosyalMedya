package request;


import lombok.Data;

@Data
public class PostCreateRequest {

    Long id;
    String text;
    String title;
    Long user_id;
}
