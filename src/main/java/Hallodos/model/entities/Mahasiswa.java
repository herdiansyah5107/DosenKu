package Hallodos.model.entities;

import javax.persistence.*;

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

	@Column(name = "nama_mahasiswa")
	private String namaMahasiswa;

	@Column(name = "email_mahasiswa")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "username_mahasiswa")
	private String username;

	@Column(name = "mahasiswa")
	private String mahasiswa;

	private String photos;

	
}
