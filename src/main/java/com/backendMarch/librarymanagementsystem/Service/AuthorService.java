package com.backendMarch.librarymanagementsystem.Service;

import com.backendMarch.librarymanagementsystem.DTO.AuthorRequestDto;
import com.backendMarch.librarymanagementsystem.Entity.Author;
import com.backendMarch.librarymanagementsystem.Repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {

    @Autowired
    AuthorRepository authorRepository;
  Author author = new Author();


    public void addAuthor(AuthorRequestDto authorRequestDto){

        author.setName(authorRequestDto.getName());
        author.setAge(authorRequestDto.getAge());
        author.setMobNo(authorRequestDto.getMobNo());
        author.setEmail(authorRequestDto.getEmail());

    }

    public List<Author> getAuthors(){
        return authorRepository.findAll();
    }
}
