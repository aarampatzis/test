package pawnshop.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class DeliveryData implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "delivery_date")
    private LocalDateTime deliveryDate;

    @OneToOne(mappedBy = "deliveryData")
    private PawnedItem pawnedItem;

    public PawnedItem getPawnedItem() {
        return pawnedItem;
    }

    public void setPawnedItem(PawnedItem pawnedItem) {
        this.pawnedItem = pawnedItem;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
}
