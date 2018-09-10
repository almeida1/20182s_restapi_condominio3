package usjt.eleicao.repository;


import usjt.eleicao.modelo.Candidato;

public interface ICandidatoRepository {

	Iterable<Candidato> findAll();

	Candidato save(Candidato candidato);

	Candidato delete(Candidato candidato);

}

