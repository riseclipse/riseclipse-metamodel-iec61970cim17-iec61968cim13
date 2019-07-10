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
 * A representation of the model object '<em><b>Trouble Ticket</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getDateTimeOfReport <em>Date Time Of Report</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getFirstResponder <em>First Responder</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getReportingKind <em>Reporting Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getResolvedDateTime <em>Resolved Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getTroubleCode <em>Trouble Code</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getCustomer <em>Customer</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getIncident <em>Incident</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getNotification <em>Notification</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getHazards <em>Hazards</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTroubleTicket()
 * @model
 * @generated
 */
public interface TroubleTicket extends Document {
    /**
     * Returns the value of the '<em><b>Date Time Of Report</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Date Time Of Report</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Date Time Of Report</em>' attribute.
     * @see #isSetDateTimeOfReport()
     * @see #unsetDateTimeOfReport()
     * @see #setDateTimeOfReport(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTroubleTicket_DateTimeOfReport()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TroubleTicket.dateTimeOfReport' kind='element'"
     * @generated
     */
    Date getDateTimeOfReport();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getDateTimeOfReport <em>Date Time Of Report</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Date Time Of Report</em>' attribute.
     * @see #isSetDateTimeOfReport()
     * @see #unsetDateTimeOfReport()
     * @see #getDateTimeOfReport()
     * @generated
     */
    void setDateTimeOfReport( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getDateTimeOfReport <em>Date Time Of Report</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDateTimeOfReport()
     * @see #getDateTimeOfReport()
     * @see #setDateTimeOfReport(Date)
     * @generated
     */
    void unsetDateTimeOfReport();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getDateTimeOfReport <em>Date Time Of Report</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Date Time Of Report</em>' attribute is set.
     * @see #unsetDateTimeOfReport()
     * @see #getDateTimeOfReport()
     * @see #setDateTimeOfReport(Date)
     * @generated
     */
    boolean isSetDateTimeOfReport();

    /**
     * Returns the value of the '<em><b>First Responder</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>First Responder</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>First Responder</em>' attribute.
     * @see #isSetFirstResponder()
     * @see #unsetFirstResponder()
     * @see #setFirstResponder(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTroubleTicket_FirstResponder()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TroubleTicket.firstResponder' kind='element'"
     * @generated
     */
    String getFirstResponder();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getFirstResponder <em>First Responder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>First Responder</em>' attribute.
     * @see #isSetFirstResponder()
     * @see #unsetFirstResponder()
     * @see #getFirstResponder()
     * @generated
     */
    void setFirstResponder( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getFirstResponder <em>First Responder</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetFirstResponder()
     * @see #getFirstResponder()
     * @see #setFirstResponder(String)
     * @generated
     */
    void unsetFirstResponder();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getFirstResponder <em>First Responder</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>First Responder</em>' attribute is set.
     * @see #unsetFirstResponder()
     * @see #getFirstResponder()
     * @see #setFirstResponder(String)
     * @generated
     */
    boolean isSetFirstResponder();

    /**
     * Returns the value of the '<em><b>Reporting Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleReportingKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Reporting Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Reporting Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleReportingKind
     * @see #isSetReportingKind()
     * @see #unsetReportingKind()
     * @see #setReportingKind(TroubleReportingKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTroubleTicket_ReportingKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TroubleTicket.reportingKind' kind='element'"
     * @generated
     */
    TroubleReportingKind getReportingKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getReportingKind <em>Reporting Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reporting Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleReportingKind
     * @see #isSetReportingKind()
     * @see #unsetReportingKind()
     * @see #getReportingKind()
     * @generated
     */
    void setReportingKind( TroubleReportingKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getReportingKind <em>Reporting Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetReportingKind()
     * @see #getReportingKind()
     * @see #setReportingKind(TroubleReportingKind)
     * @generated
     */
    void unsetReportingKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getReportingKind <em>Reporting Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Reporting Kind</em>' attribute is set.
     * @see #unsetReportingKind()
     * @see #getReportingKind()
     * @see #setReportingKind(TroubleReportingKind)
     * @generated
     */
    boolean isSetReportingKind();

    /**
     * Returns the value of the '<em><b>Resolved Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Resolved Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Resolved Date Time</em>' attribute.
     * @see #isSetResolvedDateTime()
     * @see #unsetResolvedDateTime()
     * @see #setResolvedDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTroubleTicket_ResolvedDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TroubleTicket.resolvedDateTime' kind='element'"
     * @generated
     */
    Date getResolvedDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getResolvedDateTime <em>Resolved Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Resolved Date Time</em>' attribute.
     * @see #isSetResolvedDateTime()
     * @see #unsetResolvedDateTime()
     * @see #getResolvedDateTime()
     * @generated
     */
    void setResolvedDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getResolvedDateTime <em>Resolved Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetResolvedDateTime()
     * @see #getResolvedDateTime()
     * @see #setResolvedDateTime(Date)
     * @generated
     */
    void unsetResolvedDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getResolvedDateTime <em>Resolved Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Resolved Date Time</em>' attribute is set.
     * @see #unsetResolvedDateTime()
     * @see #getResolvedDateTime()
     * @see #setResolvedDateTime(Date)
     * @generated
     */
    boolean isSetResolvedDateTime();

    /**
     * Returns the value of the '<em><b>Trouble Code</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Trouble Code</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Trouble Code</em>' attribute.
     * @see #isSetTroubleCode()
     * @see #unsetTroubleCode()
     * @see #setTroubleCode(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTroubleTicket_TroubleCode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TroubleTicket.troubleCode' kind='element'"
     * @generated
     */
    String getTroubleCode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getTroubleCode <em>Trouble Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Trouble Code</em>' attribute.
     * @see #isSetTroubleCode()
     * @see #unsetTroubleCode()
     * @see #getTroubleCode()
     * @generated
     */
    void setTroubleCode( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getTroubleCode <em>Trouble Code</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTroubleCode()
     * @see #getTroubleCode()
     * @see #setTroubleCode(String)
     * @generated
     */
    void unsetTroubleCode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getTroubleCode <em>Trouble Code</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Trouble Code</em>' attribute is set.
     * @see #unsetTroubleCode()
     * @see #getTroubleCode()
     * @see #setTroubleCode(String)
     * @generated
     */
    boolean isSetTroubleCode();

    /**
     * Returns the value of the '<em><b>Customer</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getTroubleTickets <em>Trouble Tickets</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTroubleTicket_Customer()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getTroubleTickets
     * @model opposite="TroubleTickets" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TroubleTicket.Customer' kind='element'"
     * @generated
     */
    Customer getCustomer();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getCustomer <em>Customer</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getCustomer <em>Customer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomer()
     * @see #getCustomer()
     * @see #setCustomer(Customer)
     * @generated
     */
    void unsetCustomer();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getCustomer <em>Customer</em>}' reference is set.
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
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident#getTroubleTickets <em>Trouble Tickets</em>}'.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTroubleTicket_Incident()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident#getTroubleTickets
     * @model opposite="TroubleTickets" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TroubleTicket.Incident' kind='element'"
     * @generated
     */
    Incident getIncident();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getIncident <em>Incident</em>}' reference.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getIncident <em>Incident</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIncident()
     * @see #getIncident()
     * @see #setIncident(Incident)
     * @generated
     */
    void unsetIncident();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getIncident <em>Incident</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Incident</em>' reference is set.
     * @see #unsetIncident()
     * @see #getIncident()
     * @see #setIncident(Incident)
     * @generated
     */
    boolean isSetIncident();

    /**
     * Returns the value of the '<em><b>Notification</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getTroubleTickets <em>Trouble Tickets</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Notification</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Notification</em>' reference.
     * @see #isSetNotification()
     * @see #unsetNotification()
     * @see #setNotification(CustomerNotification)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTroubleTicket_Notification()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CustomerNotification#getTroubleTickets
     * @model opposite="TroubleTickets" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TroubleTicket.Notification' kind='element'"
     * @generated
     */
    CustomerNotification getNotification();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getNotification <em>Notification</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Notification</em>' reference.
     * @see #isSetNotification()
     * @see #unsetNotification()
     * @see #getNotification()
     * @generated
     */
    void setNotification( CustomerNotification value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getNotification <em>Notification</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNotification()
     * @see #getNotification()
     * @see #setNotification(CustomerNotification)
     * @generated
     */
    void unsetNotification();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getNotification <em>Notification</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Notification</em>' reference is set.
     * @see #unsetNotification()
     * @see #getNotification()
     * @see #setNotification(CustomerNotification)
     * @generated
     */
    boolean isSetNotification();

    /**
     * Returns the value of the '<em><b>Hazards</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncidentHazard}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncidentHazard#getTroubleTicket <em>Trouble Ticket</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Hazards</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Hazards</em>' reference list.
     * @see #isSetHazards()
     * @see #unsetHazards()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getTroubleTicket_Hazards()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.IncidentHazard#getTroubleTicket
     * @model opposite="TroubleTicket" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='TroubleTicket.Hazards' kind='element'"
     * @generated
     */
    EList< IncidentHazard > getHazards();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getHazards <em>Hazards</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHazards()
     * @see #getHazards()
     * @generated
     */
    void unsetHazards();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TroubleTicket#getHazards <em>Hazards</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Hazards</em>' reference list is set.
     * @see #unsetHazards()
     * @see #getHazards()
     * @generated
     */
    boolean isSetHazards();

} // TroubleTicket
