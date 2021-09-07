package pl.piomin.samples.saga.customer.message;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Order {
    private Integer id;
    private Integer customerId;
    private int amount;
    private OrderStatus status;
}
