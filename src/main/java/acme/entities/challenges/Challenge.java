
package acme.entities.challenges;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import acme.framework.datatypes.Money;
import acme.framework.entities.DomainEntity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Challenge extends DomainEntity {

	//Serialisation identifier ----------------

	private static final long	serialVersionUID	= 1L;

	//Atributtes -------------------------------

	@NotBlank
	private String				title;

	@NotNull
	@Temporal(TemporalType.TIMESTAMP)
	@Future
	private Date				deadline;

	@NotBlank
	private String				description;

	@NotBlank
	private String				rookieGoal;
	@NotNull
	private Money				rookieReward;

	@NotBlank
	private String				averageGoal;
	@NotNull
	private Money				averageReward;

	@NotBlank
	private String				expertGoal;
	@NotNull
	private Money				expertReward;


	// Derived Attributes ----------------------------------------------------------------

	@Transient
	public Boolean isDeadlineCorrect() {
		Boolean res = false;
		Date now = new Date();
		if (this.deadline.getTime() - now.getTime() / 86400000 > 30) {
			res = true;
		}
		return res;
	}

}