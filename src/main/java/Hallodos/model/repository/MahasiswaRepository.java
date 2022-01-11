package Hallodos.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import Hallodos.model.entities.Mahasiswa;

public interface MahasiswaRepository extends JpaRepository<Mahasiswa, Long> {

}
