package dev.ericrocha.springboot2.service;

import dev.ericrocha.springboot2.domain.Anime;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AnimeService {
    //private final AnimeRepository animeRepository
    public List<Anime> ListAll(){
        return List.of(new Anime(1L,"DBZ"), new Anime(2L,"Death Note"));
    }
}
