package com.backendMarch.librarymanagementsystem.DTO;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;





@AllArgsConstructor
@NoArgsConstructor
@Data

public class StaffRequestDto{

    private String name;
    private String Email;
    private String mobile;
    private String AADHAR;
}
