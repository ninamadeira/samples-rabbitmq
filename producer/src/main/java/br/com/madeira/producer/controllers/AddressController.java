package br.com.madeira.producer.controllers;

import br.com.madeira.producer.dto.AddressDTO;
import br.com.madeira.producer.services.AddressService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.HttpStatus.CREATED;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/address")
public class AddressController {

    private final AddressService service;

    @PostMapping
    public ResponseEntity<AddressDTO> produces(@RequestBody AddressDTO dto) {
        service.createAddress(dto);
        return ResponseEntity.status(CREATED).build();
    }
}