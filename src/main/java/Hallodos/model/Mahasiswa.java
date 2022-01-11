package Hallodos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.annotation.Transient;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="mahasiswa")
@Entity
public class Mahasiswa {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	private long id;
	@Transient
    
	@Column(nullable = true, length = 64)
    private String photos;
	
	public String getPhotosImagePath() {
        if (photos == null || id == 0 ||name == null) return null;
        
        return "/user-photos/" + id + "/" + photos;
    }
	
	private String email;
	private String name;
	
	@ManyToOne
	@JoinColumn(name="type_user",referencedColumnName = "type_user")
	private User type_user;

	private String birthday;
	private String asal_sekolah;
	private String jenis_kelamin;
	 
	
	
}
