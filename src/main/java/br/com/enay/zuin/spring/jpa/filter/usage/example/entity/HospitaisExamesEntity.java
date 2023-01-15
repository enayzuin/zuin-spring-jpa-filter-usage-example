package br.com.enay.zuin.spring.jpa.filter.usage.example.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity(name = "HOSPITAIS_EXAMES")
@Table(name = "HOSPITAIS_EXAMES")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Setter
@Getter
public class HospitaisExamesEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "HOSPITAL")
	private Long hospitalId;
	
	@OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "EXAME")
    private ExameEntity exame;
	

	
}
