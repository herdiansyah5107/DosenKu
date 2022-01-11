package Hallodos.controller;

<<<<<<< HEAD
import java.io.IOException;
import java.util.List;

=======
import Hallodos.model.entities.User;
import Hallodos.services.UserServices;
>>>>>>> bd2c2d778b76088382295b08f4c5de851a52fff2
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.view.RedirectView;

<<<<<<< HEAD

import Hallodos.config.FileUploadUtil;
import Hallodos.model.Mahasiswa;
import Hallodos.repository.MahasiswaRepository;

@Controller
public class UserController {
	
	@Autowired
	MahasiswaRepository mahasiswaRepo;
	
	//get untuk memunculkan profil mahasiswa
	@GetMapping("/profilMahasiswa")
	public String Mahasiswa(Model model) {
		        model.addAttribute("fotoUser",new Mahasiswa().getPhotos());
	List<Mahasiswa> profil = mahasiswaRepo.findAll();
	model.addAttribute("data",profil);
	return("profilMahasiswa");
	}
	 @PostMapping("/mahasiswa/save")
	    public RedirectView saveUser(Mahasiswa mahasiswa,
	            @RequestParam("image") MultipartFile multipartFile) throws IOException {
	         
	        String fileName = StringUtils.cleanPath(multipartFile.getOriginalFilename());
	        mahasiswa.setPhotos(fileName);
	         
	        Mahasiswa saveMaha = mahasiswaRepo.save(mahasiswa);
	 
	        String uploadDir = "user-photos/" + saveMaha.getId();
	 
	        FileUploadUtil.saveFile(uploadDir, fileName, multipartFile);
	         
	        return new RedirectView("/profilMahasiswa", true);
	    }
=======
@Controller
public class UserController {

    @Autowired
    private UserServices userServices;

    @GetMapping("/users")
    public String getAllUser(Model model) {
        list<User> users = userServices.getAllUser();
        model.addAttribute("data". users);
        return "user";
    }
>>>>>>> bd2c2d778b76088382295b08f4c5de851a52fff2
}
	

