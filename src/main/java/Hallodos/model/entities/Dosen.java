package Hallodos.model.entities;

import javax.persistence.*;

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

	@Column(name = "email_dosen")
	private String emailDosen;

	@Column(name = "nama_dosen")
	private String nameDosen;

	@Column(name = "password")
	private String password;

	@Column(name = "bidang_studi")
	private String bidangStudi;

	@Column(name = "dosen")
	private String dosen;

}
