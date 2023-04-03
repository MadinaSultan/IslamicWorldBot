package example.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Profile {
    private Long id;

    private String lang;

    public Profile(Long id) {
        this.id = id;
    }
}
