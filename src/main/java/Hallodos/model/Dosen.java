package Hallodos.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name="dosen")
@Entity
public class Dosen {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	

	@Column(nullable = true, length = 64)
    private String photos;
	
	private String email;
	private String name;
	@ManyToOne
	@JoinColumn(name="type_user",referencedColumnName = "type_user")
	private User type_user;
	private String birthday;
	private String asal_sekolah;
	private String jenisKelamin;
	private String tanggallahir;
	

}
