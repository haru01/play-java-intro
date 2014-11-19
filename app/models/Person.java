package models;

import play.db.ebean.Model;
import javax.persistence.*;

@Entity
public class Person extends Model {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;

	public String name;
}