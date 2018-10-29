package main;

import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import capElements.Alert;
import capElements.Alert.Info;

public class Main {

	public static void main(String[] args)
	{
			new Main();
	}

	public Main() {
		Alert alert = new Alert();
		alert.setIdentifier("a");
		alert.setMsgType("Actual");
		
		Info info = new Info();
		info.setDescription("호우주의보 발령");
		
		alert.getInfo().add(info);
		
		jaxbObjectToXML(alert);
	}

	private void jaxbObjectToXML(Alert alert)
	{
		try
		{
			//Create JAXB Context
			JAXBContext jaxbContext = JAXBContext.newInstance(Alert.class);

			//Create Marshaller
			Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

			//Required formatting??
			jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			//Print XML String to Console
			StringWriter sw = new StringWriter();

			//Write XML to StringWriter
			jaxbMarshaller.marshal(alert, sw);

			//Verify XML Content
			String xmlContent = sw.toString();
			System.out.println( xmlContent );

		} catch (JAXBException e) {
			e.printStackTrace();
		}
	}

}
