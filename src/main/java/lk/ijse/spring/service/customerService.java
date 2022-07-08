package lk.ijse.spring.service;

import lk.ijse.spring.dto.customerDTO;

import java.util.List;

public interface customerService {
    void saveCustomer(customerDTO dto);
    void updateCustomer(customerDTO dto);
    customerDTO searchCustomer(String id);
    List<customerDTO> getAllCustomers();
}
