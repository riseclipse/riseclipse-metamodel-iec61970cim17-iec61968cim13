/*
*************************************************************************
**  Copyright (c) 2019 CentraleSupélec & EDF.
**  All rights reserved. This program and the accompanying materials
**  are made available under the terms of the Eclipse Public License v2.0
**  which accompanies this distribution, and is available at
**  https://www.eclipse.org/legal/epl-v20.html
** 
**  This file is part of the RiseClipse tool
**  
**  Contributors:
**      Computer Science Department, CentraleSupélec
**      EDF R&D
**  Contacts:
**      dominique.marcadet@centralesupelec.fr
**      aurelie.dehouck-neveu@edf.fr
**  Web site:
**      http://wdi.supelec.fr/software/RiseClipse/
*************************************************************************
*/
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Customer Notification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getContactType <em>Contact Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getContactValue <em>Contact Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getEarliestDateTimeToCall <em>Earliest Date Time To Call</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getLatestDateTimeToCall <em>Latest Date Time To Call</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getTrigger <em>Trigger</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getTroubleTickets <em>Trouble Tickets</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getCustomer <em>Customer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getIncident <em>Incident</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerNotification()
 * @model
 * @generated
 */
public interface CustomerNotification extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Contact Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contact Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contact Type</em>' attribute.
     * @see #isSetContactType()
     * @see #unsetContactType()
     * @see #setContactType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerNotification_ContactType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CustomerNotification.contactType' kind='element'"
     * @generated
     */
    String getContactType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getContactType <em>Contact Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contact Type</em>' attribute.
     * @see #isSetContactType()
     * @see #unsetContactType()
     * @see #getContactType()
     * @generated
     */
    void setContactType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getContactType <em>Contact Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetContactType()
     * @see #getContactType()
     * @see #setContactType(String)
     * @generated
     */
    void unsetContactType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getContactType <em>Contact Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Contact Type</em>' attribute is set.
     * @see #unsetContactType()
     * @see #getContactType()
     * @see #setContactType(String)
     * @generated
     */
    boolean isSetContactType();

    /**
     * Returns the value of the '<em><b>Contact Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Contact Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Contact Value</em>' attribute.
     * @see #isSetContactValue()
     * @see #unsetContactValue()
     * @see #setContactValue(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerNotification_ContactValue()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CustomerNotification.contactValue' kind='element'"
     * @generated
     */
    String getContactValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getContactValue <em>Contact Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Contact Value</em>' attribute.
     * @see #isSetContactValue()
     * @see #unsetContactValue()
     * @see #getContactValue()
     * @generated
     */
    void setContactValue( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getContactValue <em>Contact Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetContactValue()
     * @see #getContactValue()
     * @see #setContactValue(String)
     * @generated
     */
    void unsetContactValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getContactValue <em>Contact Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Contact Value</em>' attribute is set.
     * @see #unsetContactValue()
     * @see #getContactValue()
     * @see #setContactValue(String)
     * @generated
     */
    boolean isSetContactValue();

    /**
     * Returns the value of the '<em><b>Earliest Date Time To Call</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Earliest Date Time To Call</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Earliest Date Time To Call</em>' attribute.
     * @see #isSetEarliestDateTimeToCall()
     * @see #unsetEarliestDateTimeToCall()
     * @see #setEarliestDateTimeToCall(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerNotification_EarliestDateTimeToCall()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CustomerNotification.earliestDateTimeToCall' kind='element'"
     * @generated
     */
    Date getEarliestDateTimeToCall();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getEarliestDateTimeToCall <em>Earliest Date Time To Call</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Earliest Date Time To Call</em>' attribute.
     * @see #isSetEarliestDateTimeToCall()
     * @see #unsetEarliestDateTimeToCall()
     * @see #getEarliestDateTimeToCall()
     * @generated
     */
    void setEarliestDateTimeToCall( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getEarliestDateTimeToCall <em>Earliest Date Time To Call</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEarliestDateTimeToCall()
     * @see #getEarliestDateTimeToCall()
     * @see #setEarliestDateTimeToCall(Date)
     * @generated
     */
    void unsetEarliestDateTimeToCall();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getEarliestDateTimeToCall <em>Earliest Date Time To Call</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Earliest Date Time To Call</em>' attribute is set.
     * @see #unsetEarliestDateTimeToCall()
     * @see #getEarliestDateTimeToCall()
     * @see #setEarliestDateTimeToCall(Date)
     * @generated
     */
    boolean isSetEarliestDateTimeToCall();

    /**
     * Returns the value of the '<em><b>Latest Date Time To Call</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Latest Date Time To Call</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Latest Date Time To Call</em>' attribute.
     * @see #isSetLatestDateTimeToCall()
     * @see #unsetLatestDateTimeToCall()
     * @see #setLatestDateTimeToCall(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerNotification_LatestDateTimeToCall()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CustomerNotification.latestDateTimeToCall' kind='element'"
     * @generated
     */
    Date getLatestDateTimeToCall();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getLatestDateTimeToCall <em>Latest Date Time To Call</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Latest Date Time To Call</em>' attribute.
     * @see #isSetLatestDateTimeToCall()
     * @see #unsetLatestDateTimeToCall()
     * @see #getLatestDateTimeToCall()
     * @generated
     */
    void setLatestDateTimeToCall( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getLatestDateTimeToCall <em>Latest Date Time To Call</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLatestDateTimeToCall()
     * @see #getLatestDateTimeToCall()
     * @see #setLatestDateTimeToCall(Date)
     * @generated
     */
    void unsetLatestDateTimeToCall();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getLatestDateTimeToCall <em>Latest Date Time To Call</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Latest Date Time To Call</em>' attribute is set.
     * @see #unsetLatestDateTimeToCall()
     * @see #getLatestDateTimeToCall()
     * @see #setLatestDateTimeToCall(Date)
     * @generated
     */
    boolean isSetLatestDateTimeToCall();

    /**
     * Returns the value of the '<em><b>Trigger</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NotificationTriggerKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trigger</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trigger</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NotificationTriggerKind
     * @see #isSetTrigger()
     * @see #unsetTrigger()
     * @see #setTrigger(NotificationTriggerKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerNotification_Trigger()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CustomerNotification.trigger' kind='element'"
     * @generated
     */
    NotificationTriggerKind getTrigger();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getTrigger <em>Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trigger</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NotificationTriggerKind
     * @see #isSetTrigger()
     * @see #unsetTrigger()
     * @see #getTrigger()
     * @generated
     */
    void setTrigger( NotificationTriggerKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getTrigger <em>Trigger</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTrigger()
     * @see #getTrigger()
     * @see #setTrigger(NotificationTriggerKind)
     * @generated
     */
    void unsetTrigger();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getTrigger <em>Trigger</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Trigger</em>' attribute is set.
     * @see #unsetTrigger()
     * @see #getTrigger()
     * @see #setTrigger(NotificationTriggerKind)
     * @generated
     */
    boolean isSetTrigger();

    /**
     * Returns the value of the '<em><b>Trouble Tickets</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getNotification <em>Notification</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trouble Tickets</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trouble Tickets</em>' reference list.
     * @see #isSetTroubleTickets()
     * @see #unsetTroubleTickets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerNotification_TroubleTickets()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getNotification
     * @model opposite="Notification" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CustomerNotification.TroubleTickets' kind='element'"
     * @generated
     */
    EList< TroubleTicket > getTroubleTickets();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getTroubleTickets <em>Trouble Tickets</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTroubleTickets()
     * @see #getTroubleTickets()
     * @generated
     */
    void unsetTroubleTickets();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getTroubleTickets <em>Trouble Tickets</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Trouble Tickets</em>' reference list is set.
     * @see #unsetTroubleTickets()
     * @see #getTroubleTickets()
     * @generated
     */
    boolean isSetTroubleTickets();

    /**
     * Returns the value of the '<em><b>Customer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getNotifications <em>Notifications</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customer</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customer</em>' reference.
     * @see #isSetCustomer()
     * @see #unsetCustomer()
     * @see #setCustomer(Customer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerNotification_Customer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getNotifications
     * @model opposite="Notifications" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CustomerNotification.Customer' kind='element'"
     * @generated
     */
    Customer getCustomer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getCustomer <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Customer</em>' reference.
     * @see #isSetCustomer()
     * @see #unsetCustomer()
     * @see #getCustomer()
     * @generated
     */
    void setCustomer( Customer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getCustomer <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomer()
     * @see #getCustomer()
     * @see #setCustomer(Customer)
     * @generated
     */
    void unsetCustomer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getCustomer <em>Customer</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customer</em>' reference is set.
     * @see #unsetCustomer()
     * @see #getCustomer()
     * @see #setCustomer(Customer)
     * @generated
     */
    boolean isSetCustomer();

    /**
     * Returns the value of the '<em><b>Incident</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident#getCustomerNotifications <em>Customer Notifications</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incident</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incident</em>' reference.
     * @see #isSetIncident()
     * @see #unsetIncident()
     * @see #setIncident(Incident)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getCustomerNotification_Incident()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident#getCustomerNotifications
     * @model opposite="CustomerNotifications" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='CustomerNotification.Incident' kind='element'"
     * @generated
     */
    Incident getIncident();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getIncident <em>Incident</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Incident</em>' reference.
     * @see #isSetIncident()
     * @see #unsetIncident()
     * @see #getIncident()
     * @generated
     */
    void setIncident( Incident value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getIncident <em>Incident</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIncident()
     * @see #getIncident()
     * @see #setIncident(Incident)
     * @generated
     */
    void unsetIncident();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getIncident <em>Incident</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Incident</em>' reference is set.
     * @see #unsetIncident()
     * @see #getIncident()
     * @see #setIncident(Incident)
     * @generated
     */
    boolean isSetIncident();

} // CustomerNotification
