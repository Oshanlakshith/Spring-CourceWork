package lk.ijse.spring.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
public class customer {
    @Id
    private String cId;
    private String cname;
    private String DrivingLicence;
    private String city;
    private  String houseNo;
    private String Tnumber;
}
