
package in.benchresources.entities.book;

import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for bookInfo complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="bookInfo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bookISBN" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="bookName" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="author" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="category" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "bookInfo", propOrder = {
    "bookISBN",
    "bookName",
    "author",
    "category"
})
@Entity
@Table(name="bookInfo")
public class BookInfo {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="bookISBN")
    @XmlElement(required = true)
    protected String bookISBN;
    @XmlElement(required = true)
    @Column(name="bookName")
    protected String bookName;
    @XmlElement(required = true)
    @Column(name="author")
    protected String author;
    @XmlElement(required = true)
    @Column(name="category")
    protected String category;

    /**
     * Gets the value of the bookISBN property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookISBN() {
        return bookISBN;
    }

    /**
     * Sets the value of the bookISBN property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookISBN(String value) {
        this.bookISBN = value;
    }

    /**
     * Gets the value of the bookName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookName() {
        return bookName;
    }

    /**
     * Sets the value of the bookName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookName(String value) {
        this.bookName = value;
    }

    /**
     * Gets the value of the author property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the value of the author property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthor(String value) {
        this.author = value;
    }

    /**
     * Gets the value of the category property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * Sets the value of the category property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

}
