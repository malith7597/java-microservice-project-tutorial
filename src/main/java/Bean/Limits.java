package Bean;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder

public class Limits {
    private int maximum;
    private int minimum;

    @Override
    public String toString() {
        return "Limits{" +
                "maximum=" + maximum +
                ", minimum=" + minimum +
                '}';
    }
}
