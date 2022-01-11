package Hallodos.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
	private String email;
	private String name;
	private String type_user;
	private String birthday;
	private String asal_sekolah;
	private String jenis_kelamin;
}
