package br.com.enay.zuin.spring.jpa.filter.usage.example.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "HOSPITAIS")
@Table(name = "HOSPITAIS")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
public class HospitalEntity {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "NOME_HOSPITAL")
	private String nomeHospital;
	
	@Column(name = "DATA")
	private Date data;
	
	@OneToMany(fetch = FetchType.LAZY, cascade=CascadeType.PERSIST)
    @JoinColumn(name = "HOSPITAL")
    private List<HospitaisExamesEntity> exames;
	
}

