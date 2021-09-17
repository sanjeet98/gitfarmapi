/**
 * 
 */
package com.cloud.farmappapi.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GeneratorType;
import org.springframework.beans.factory.annotation.Autowired;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author kmahendr
 *
 */
@Entity
@Table(name="advertisements")
public class Advertisement {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long advertiseId;
	
	@Column(name="ad_titles",unique=true,updatable=false)
	private String title;
	
	@Column(name="ad_identifiers",unique = true, updatable = false)
	private String advertiseIdentifier;
	
	@Column(name="offers")
	private String offerDescription;
	
	@Column(name="stock")
	private String availableStock;
	
	@Column(name="postedby")
	private String PostedBy;
	/**
	 * @param advertiseId
	 * @param title
	 * @param advertiseIdentifier
	 * @param offerDescription
	 * @param availableStock
	 */
	
	/**
	 * Default Constructor for Advertisement class
	 */
	public Advertisement() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	
	
	
}
