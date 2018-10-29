//
// 이 파일은 JAXB(JavaTM Architecture for XML Binding) 참조 구현 2.2.8-b130911.1802 버전을 통해 생성되었습니다. 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>를 참조하십시오. 
// 이 파일을 수정하면 소스 스키마를 재컴파일할 때 수정 사항이 손실됩니다. 
// 생성 날짜: 2018.10.29 시간 02:35:56 PM KST 
//


package capElements;

import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the capElements package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AlertInfoAreaCircle_QNAME = new QName("http://www.incident.com/cap/1.0", "circle");
    private final static QName _AlertInfoAreaPolygon_QNAME = new QName("http://www.incident.com/cap/1.0", "polygon");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: capElements
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Alert }
     * 
     */
    public Alert createAlert() {
        return new Alert();
    }

    /**
     * Create an instance of {@link Alert.Info }
     * 
     */
    public Alert.Info createAlertInfo() {
        return new Alert.Info();
    }

    /**
     * Create an instance of {@link Alert.Info.Resource }
     * 
     */
    public Alert.Info.Resource createAlertInfoResource() {
        return new Alert.Info.Resource();
    }

    /**
     * Create an instance of {@link Alert.Info.Area }
     * 
     */
    public Alert.Info.Area createAlertInfoArea() {
        return new Alert.Info.Area();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.incident.com/cap/1.0", name = "circle", scope = Alert.Info.Area.class)
    public JAXBElement<List<String>> createAlertInfoAreaCircle(List<String> value) {
        return new JAXBElement<List<String>>(_AlertInfoAreaCircle_QNAME, ((Class) List.class), Alert.Info.Area.class, ((List<String> ) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link List }{@code <}{@link String }{@code >}{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.incident.com/cap/1.0", name = "polygon", scope = Alert.Info.Area.class)
    public JAXBElement<List<String>> createAlertInfoAreaPolygon(List<String> value) {
        return new JAXBElement<List<String>>(_AlertInfoAreaPolygon_QNAME, ((Class) List.class), Alert.Info.Area.class, ((List<String> ) value));
    }

}
