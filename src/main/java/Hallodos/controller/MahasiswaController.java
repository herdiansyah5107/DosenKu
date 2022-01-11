package Hallodos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Hallodos.model.entities.Mahasiswa;
import Hallodos.model.repository.MahasiswaRepository;

@Controller
public class MahasiswaController {
	
	@Autowired
	MahasiswaRepository mahasiswaRepo;
	
	@GetMapping("/profilemahasiswa")
	public String getMahasiswa(Model model) {
		List<Mahasiswa> profil = mahasiswaRepo.findAll();
		model.addAttribute("data",profil);
		return "profilemahasiswa";
	}

	
}
