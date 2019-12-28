package com.example.backend.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import java.util.Date;
import lombok.*;

@Entity
@Data
@Setter
@Getter
@NoArgsConstructor
public class ShopEntity {
    @Id @SequenceGenerator(name = "shop_seq", sequenceName = "shop_seq")
    @GeneratedValue
    private @NonNull Long id;
    private String shopName;
    private String phonenumber;
    private String email;
    private String website;
    @Temporal(TemporalType.TIMESTAMP)
    @NonNull Date date;  

}