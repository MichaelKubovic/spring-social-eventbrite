package org.springframework.social.eventbrite.api;

import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;

//<ticket>
//<id>45264859</id>
//<name>VIP Registration</name>
//<description>Access to VIP Rooms</description>
//<type>0</type>
//<currency>USD</currency>
//<price>199.99</price>
//<start_date>2008-10-24 00:00:00</start_date>
//<end_date>2008-12-30 23:00:00</end_date>
//<quantity_available>100</quantity_available>
//<quantity_sold>0</quantity_sold>
//</ticket>
@XmlAccessorType(XmlAccessType.FIELD)
public class Ticket {

	private String id;
	private String name;
	private String description;
	private String type;
	private String currency;
	private BigDecimal price;
	@XmlJavaTypeAdapter(EventbriteXmlDateAdapter.class)
	@XmlElement(name="start_date")
	private Date startDate;
	@XmlJavaTypeAdapter(EventbriteXmlDateAdapter.class)
	@XmlElement(name="end_date")
	private Date endDate;
	@XmlElement(name="quantity_available")
	private Integer quantityAvailable;
	@XmlElement(name="quantity_sold")
	private Integer quantitySold;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getQuantityAvailable() {
		return quantityAvailable;
	}
	public void setQuantityAvailable(Integer quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	public Integer getQuantitySold() {
		return quantitySold;
	}

	public void setQuantitySold(Integer quantitySold) {
		this.quantitySold = quantitySold;
	}

}
