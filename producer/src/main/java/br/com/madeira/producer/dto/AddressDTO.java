package br.com.madeira.producer.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class AddressDTO implements Serializable {
    private Integer id;
    private String addressOne;

    private String AddressTwo;

    private String city;


}
