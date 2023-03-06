package Insurance;

import java.util.Date;

public abstract class Insurance {
    private String insuranceName;
    private double price;
    private Date firstOutDate;

    public abstract void calculate();
}
