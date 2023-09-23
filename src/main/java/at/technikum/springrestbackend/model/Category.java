package at.technikum.springrestbackend.model;

import lombok.Getter;

import java.io.Serializable;

@Getter
public enum Category implements Serializable {
    SPORTS(0),
    GEOGRAPHY(1),
    HISTORY(2),
    CULTURE(3),
    SCIENCE(4),
    NATURE(5),
    RANDOM(6);

    private final int value;

    Category(int value) {
        this.value = value;
    }
}
