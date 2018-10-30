package com.meuTwitter.Twitter.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.meuTwitter.Twitter.model.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Integer>{

}
