<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>
	<s:form action="country-search">		
		<s:textfield name="country" key="Introduza as iniciais do país a pesquisar (Exemplo: PT)"></s:textfield>
		<s:submit value="Pesquisar"></s:submit>		 	
	</s:form>
	
	<div>
		<s:property value="languageText"/><s:property value="language"/>
		<s:property value="populationText"/><s:property value="population"/>
		<s:property value="currencyText"/><s:property value="currency"/>
		<s:property value="capitalText"/><s:property value="capital"/>
		<s:property value="icaoText"/><s:property value="icao"/>
		<s:property value="latitudeText"/><s:property value="latitude"/>
		<s:property value="longitudeText"/><s:property value="longitude"/>
		<s:property value="meteorologicText"/><s:property value="meteorologicInfo"/>
	</div>
</body>
</html>