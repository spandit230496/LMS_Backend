package com.backendMarch.librarymanagementsystem.Service;

import com.backendMarch.librarymanagementsystem.DTO.StaffRequestDto;
import com.backendMarch.librarymanagementsystem.DTO.StudentRequestDto;
import com.backendMarch.librarymanagementsystem.Entity.Staff;
import com.backendMarch.librarymanagementsystem.Entity.Student;
import com.backendMarch.librarymanagementsystem.Repository.StaffRepository;
import com.backendMarch.librarymanagementsystem.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StaffService {
    @Autowired
    StaffRepository staffRepository;

    public void addStaff(StaffRequestDto staffRequestDto) {

        // Create a student object
        Staff staff = new Staff();
        staff.setName(staffRequestDto.getName());
        staff.setEmail(staffRequestDto.getEmail());
        staff.setMobile(staffRequestDto.getMobile());
        staff.setAADHAR(staffRequestDto.getAADHAR());

        staffRepository.save(staff);
    }
}