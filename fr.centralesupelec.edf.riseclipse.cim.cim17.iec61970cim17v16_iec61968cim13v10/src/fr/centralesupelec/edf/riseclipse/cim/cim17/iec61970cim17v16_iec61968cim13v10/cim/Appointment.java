/**
 *  Copyright (c) 2016 CentraleSupélec & EDF.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 * 
 *  This file is part of the RiseClipse tool
 *  
 *  Contributors:
 *      Computer Science Department, CentraleSupélec : initial implementation
 *  Contacts:
 *      Dominique.Marcadet@centralesupelec.fr
 * 
 */
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Appointment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getCallAhead <em>Call Ahead</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getMeetingInterval <em>Meeting Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getPersons <em>Persons</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getWorks <em>Works</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAppointment()
 * @model
 * @generated
 */
public interface Appointment extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Call Ahead</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Call Ahead</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Call Ahead</em>' attribute.
     * @see #isSetCallAhead()
     * @see #unsetCallAhead()
     * @see #setCallAhead(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAppointment_CallAhead()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Appointment.callAhead' kind='element'"
     * @generated
     */
    Boolean getCallAhead();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getCallAhead <em>Call Ahead</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Call Ahead</em>' attribute.
     * @see #isSetCallAhead()
     * @see #unsetCallAhead()
     * @see #getCallAhead()
     * @generated
     */
    void setCallAhead( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getCallAhead <em>Call Ahead</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCallAhead()
     * @see #getCallAhead()
     * @see #setCallAhead(Boolean)
     * @generated
     */
    void unsetCallAhead();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getCallAhead <em>Call Ahead</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Call Ahead</em>' attribute is set.
     * @see #unsetCallAhead()
     * @see #getCallAhead()
     * @see #setCallAhead(Boolean)
     * @generated
     */
    boolean isSetCallAhead();

    /**
     * Returns the value of the '<em><b>Meeting Interval</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Meeting Interval</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Meeting Interval</em>' containment reference.
     * @see #isSetMeetingInterval()
     * @see #unsetMeetingInterval()
     * @see #setMeetingInterval(DateTimeInterval)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAppointment_MeetingInterval()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Appointment.meetingInterval' kind='element'"
     * @generated
     */
    DateTimeInterval getMeetingInterval();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getMeetingInterval <em>Meeting Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Meeting Interval</em>' containment reference.
     * @see #isSetMeetingInterval()
     * @see #unsetMeetingInterval()
     * @see #getMeetingInterval()
     * @generated
     */
    void setMeetingInterval( DateTimeInterval value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getMeetingInterval <em>Meeting Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMeetingInterval()
     * @see #getMeetingInterval()
     * @see #setMeetingInterval(DateTimeInterval)
     * @generated
     */
    void unsetMeetingInterval();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getMeetingInterval <em>Meeting Interval</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Meeting Interval</em>' containment reference is set.
     * @see #unsetMeetingInterval()
     * @see #getMeetingInterval()
     * @see #setMeetingInterval(DateTimeInterval)
     * @generated
     */
    boolean isSetMeetingInterval();

    /**
     * Returns the value of the '<em><b>Persons</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getAppointments <em>Appointments</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Persons</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Persons</em>' reference list.
     * @see #isSetPersons()
     * @see #unsetPersons()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAppointment_Persons()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getAppointments
     * @model opposite="Appointments" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Appointment.Persons' kind='element'"
     * @generated
     */
    EList< PersonRole > getPersons();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getPersons <em>Persons</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPersons()
     * @see #getPersons()
     * @generated
     */
    void unsetPersons();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getPersons <em>Persons</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Persons</em>' reference list is set.
     * @see #unsetPersons()
     * @see #getPersons()
     * @generated
     */
    boolean isSetPersons();

    /**
     * Returns the value of the '<em><b>Works</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getAppointments <em>Appointments</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Works</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Works</em>' reference list.
     * @see #isSetWorks()
     * @see #unsetWorks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getAppointment_Works()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getAppointments
     * @model opposite="Appointments" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Appointment.Works' kind='element'"
     * @generated
     */
    EList< Work > getWorks();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getWorks <em>Works</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWorks()
     * @see #getWorks()
     * @generated
     */
    void unsetWorks();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getWorks <em>Works</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Works</em>' reference list is set.
     * @see #unsetWorks()
     * @see #getWorks()
     * @generated
     */
    boolean isSetWorks();

} // Appointment
