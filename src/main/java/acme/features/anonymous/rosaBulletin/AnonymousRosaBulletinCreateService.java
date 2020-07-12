
package acme.features.anonymous.rosaBulletin;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import acme.entities.bulletin.RosaBulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousRosaBulletinCreateService implements AbstractCreateService<Anonymous, RosaBulletin> {

	@Autowired
	AnonymousRosaBulletinRepository repository;


	@Override
	public boolean authorise(final Request<RosaBulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final Request<RosaBulletin> request, final RosaBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<RosaBulletin> request, final RosaBulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "title", "description");
	}

	@Override
	public RosaBulletin instantiate(final Request<RosaBulletin> request) {
		assert request != null;

		RosaBulletin result;
		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);

		result = new RosaBulletin();
		result.setMoment(moment);

		return result;
	}

	@Override
	public void validate(final Request<RosaBulletin> request, final RosaBulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<RosaBulletin> request, final RosaBulletin entity) {
=======
import acme.entities.bulletin.Rosabulletin;
import acme.framework.components.Errors;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Anonymous;
import acme.framework.services.AbstractCreateService;

@Service
public class AnonymousRosaBulletinCreateService implements AbstractCreateService<Anonymous, Rosabulletin> {

	@Autowired
	AnonymousRosaBulletinRepository repository;


	@Override
	public boolean authorise(final Request<Rosabulletin> request) {
		assert request != null;
		return true;
	}

	@Override
	public void bind(final Request<Rosabulletin> request, final Rosabulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

		request.bind(entity, errors);
	}

	@Override
	public void unbind(final Request<Rosabulletin> request, final Rosabulletin entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "author", "title", "description");
	}

	@Override
	public Rosabulletin instantiate(final Request<Rosabulletin> request) {
		assert request != null;

		Rosabulletin result;
		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);

		result = new Rosabulletin();
		result.setMoment(moment);

		return result;
	}

	@Override
	public void validate(final Request<Rosabulletin> request, final Rosabulletin entity, final Errors errors) {
		assert request != null;
		assert entity != null;
		assert errors != null;

	}

	@Override
	public void create(final Request<Rosabulletin> request, final Rosabulletin entity) {
>>>>>>> branch 'master' of https://github.com/frarosrod2/D02-Simple-Reporting.git
		assert request != null;
		assert entity != null;

		Date moment;

		moment = new Date(System.currentTimeMillis() - 1);
		entity.setMoment(moment);
		this.repository.save(entity);

	}
}
