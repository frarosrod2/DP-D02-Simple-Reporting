<%@ page language="java"%>

<%@taglib prefix="jstl" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="acme" tagdir="/WEB-INF/tags"%>

<acme:list>
	<acme:list-column code="anonymous.toolRecord.list.label.title" path="title"/>
	<acme:list-column code="anonymous.toolRecord.list.label.activitySector" path="activitySector"/>
	<acme:list-column code="anonymous.toolRecord.list.label.stars" path="stars"/>
</acme:list>

	<acme:form-return code="anonymous.toolRecord.form.button.return"/>