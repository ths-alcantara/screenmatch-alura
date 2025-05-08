package com.thais.screenmatch_alura.model;

import java.util.OptionalDouble;

public class Serie {
   private String titulo;
   private Integer totalTemporadas;
   private Double avaliacao;
   private Categoria genero;
   private String atores;
   private String sinopse;
   private String poster;

   public Serie(DadosSerie dadosSerie){
       this.titulo = dadosSerie.titulo();
       this.totalTemporadas = dadosSerie.totalTemporadas();
       this.avaliacao = OptionalDouble.of(Double.valueOf(dadosSerie.avaliacao())).orElse(0);
       this.genero = Categoria.fromString(dadosSerie.genero().split(",")[0].trim());
       this.atores = dadosSerie.atores();
       this.sinopse = dadosSerie.sinopse();
       this.poster = dadosSerie.sinopse();
   }
}
