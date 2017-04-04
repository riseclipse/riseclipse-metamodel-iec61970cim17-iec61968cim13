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
 * A representation of the model object '<em><b>Person Role</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getPerson <em>Person</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getAppointments <em>Appointments</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getConfigurationEvents <em>Configuration Events</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPersonRole()
 * @model
 * @generated
 */
public interface PersonRole extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Person</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getRoles <em>Roles</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Person</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Person</em>' reference.
     * @see #isSetPerson()
     * @see #unsetPerson()
     * @see #setPerson(Person)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPersonRole_Person()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Person#getRoles
     * @model opposite="Roles" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PersonRole.Person' kind='element'"
     * @generated
     */
    Person getPerson();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getPerson <em>Person</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Person</em>' reference.
     * @see #isSetPerson()
     * @see #unsetPerson()
     * @see #getPerson()
     * @generated
     */
    void setPerson( Person value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getPerson <em>Person</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPerson()
     * @see #getPerson()
     * @see #setPerson(Person)
     * @generated
     */
    void unsetPerson();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getPerson <em>Person</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Person</em>' reference is set.
     * @see #unsetPerson()
     * @see #getPerson()
     * @see #setPerson(Person)
     * @generated
     */
    boolean isSetPerson();

    /**
     * Returns the value of the '<em><b>Appointments</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getPersons <em>Persons</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Appointments</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Appointments</em>' reference list.
     * @see #isSetAppointments()
     * @see #unsetAppointments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPersonRole_Appointments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getPersons
     * @model opposite="Persons" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PersonRole.Appointments' kind='element'"
     * @generated
     */
    EList< Appointment > getAppointments();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getAppointments <em>Appointments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAppointments()
     * @see #getAppointments()
     * @generated
     */
    void unsetAppointments();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getAppointments <em>Appointments</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Appointments</em>' reference list is set.
     * @see #unsetAppointments()
     * @see #getAppointments()
     * @generated
     */
    boolean isSetAppointments();

    /**
     * Returns the value of the '<em><b>Configuration Events</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedPersonRole <em>Changed Person Role</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Configuration Events</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Configuration Events</em>' reference list.
     * @see #isSetConfigurationEvents()
     * @see #unsetConfigurationEvents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getPersonRole_ConfigurationEvents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConfigurationEvent#getChangedPersonRole
     * @model opposite="ChangedPersonRole" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='PersonRole.ConfigurationEvents' kind='element'"
     * @generated
     */
    EList< ConfigurationEvent > getConfigurationEvents();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getConfigurationEvents <em>Configuration Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConfigurationEvents()
     * @see #getConfigurationEvents()
     * @generated
     */
    void unsetConfigurationEvents();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PersonRole#getConfigurationEvents <em>Configuration Events</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Configuration Events</em>' reference list is set.
     * @see #unsetConfigurationEvents()
     * @see #getConfigurationEvents()
     * @generated
     */
    boolean isSetConfigurationEvents();

} // PersonRole
