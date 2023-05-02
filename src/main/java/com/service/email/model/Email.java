package com.service.email.model;

import com.service.email.response.MessageResponse;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Email {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer emailId;

    @Column
    private String email;

    @Column
    private String vehiclePlate;

    @Column
    private String message;

    @Column
    private String parkingName;

}
