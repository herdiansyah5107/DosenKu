package Hallodos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import Hallodos.model.Mahasiswa;
import Hallodos.repository.MahasiswaRepository;

@Controller
public class UserController {
	
	@Autowired
	MahasiswaRepository mahasiswaRepo;
	
	@GetMapping("/profilMahasiswa")
	public String getMahasiswa(Model model) {
	List<Mahasiswa> profil = mahasiswaRepo.findAll();
	model.addAttribute("data",profil);
	return "profilmahasiswa";
}
}
