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
 * A representation of the model object '<em><b>Scheduled Event Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getEstimatedWindow <em>Estimated Window</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getRequestedWindow <em>Requested Window</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getStatus <em>Status</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getScheduledEvents <em>Scheduled Events</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getInspectionDataSet <em>Inspection Data Set</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getScheduledEventData()
 * @model
 * @generated
 */
public interface ScheduledEventData extends CimObjectWithID {
    /**
     * Returns the value of the '<em><b>Estimated Window</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Estimated Window</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Estimated Window</em>' containment reference.
     * @see #isSetEstimatedWindow()
     * @see #unsetEstimatedWindow()
     * @see #setEstimatedWindow(DateTimeInterval)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getScheduledEventData_EstimatedWindow()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ScheduledEventData.estimatedWindow' kind='element'"
     * @generated
     */
    DateTimeInterval getEstimatedWindow();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getEstimatedWindow <em>Estimated Window</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Estimated Window</em>' containment reference.
     * @see #isSetEstimatedWindow()
     * @see #unsetEstimatedWindow()
     * @see #getEstimatedWindow()
     * @generated
     */
    void setEstimatedWindow( DateTimeInterval value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getEstimatedWindow <em>Estimated Window</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEstimatedWindow()
     * @see #getEstimatedWindow()
     * @see #setEstimatedWindow(DateTimeInterval)
     * @generated
     */
    void unsetEstimatedWindow();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getEstimatedWindow <em>Estimated Window</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Estimated Window</em>' containment reference is set.
     * @see #unsetEstimatedWindow()
     * @see #getEstimatedWindow()
     * @see #setEstimatedWindow(DateTimeInterval)
     * @generated
     */
    boolean isSetEstimatedWindow();

    /**
     * Returns the value of the '<em><b>Requested Window</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Requested Window</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Requested Window</em>' containment reference.
     * @see #isSetRequestedWindow()
     * @see #unsetRequestedWindow()
     * @see #setRequestedWindow(DateTimeInterval)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getScheduledEventData_RequestedWindow()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ScheduledEventData.requestedWindow' kind='element'"
     * @generated
     */
    DateTimeInterval getRequestedWindow();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getRequestedWindow <em>Requested Window</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Requested Window</em>' containment reference.
     * @see #isSetRequestedWindow()
     * @see #unsetRequestedWindow()
     * @see #getRequestedWindow()
     * @generated
     */
    void setRequestedWindow( DateTimeInterval value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getRequestedWindow <em>Requested Window</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRequestedWindow()
     * @see #getRequestedWindow()
     * @see #setRequestedWindow(DateTimeInterval)
     * @generated
     */
    void unsetRequestedWindow();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getRequestedWindow <em>Requested Window</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Requested Window</em>' containment reference is set.
     * @see #unsetRequestedWindow()
     * @see #getRequestedWindow()
     * @see #setRequestedWindow(DateTimeInterval)
     * @generated
     */
    boolean isSetRequestedWindow();

    /**
     * Returns the value of the '<em><b>Status</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Status</em>' containment reference.
     * @see #isSetStatus()
     * @see #unsetStatus()
     * @see #setStatus(Status)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getScheduledEventData_Status()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ScheduledEventData.status' kind='element'"
     * @generated
     */
    Status getStatus();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getStatus <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Status</em>' containment reference.
     * @see #isSetStatus()
     * @see #unsetStatus()
     * @see #getStatus()
     * @generated
     */
    void setStatus( Status value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getStatus <em>Status</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatus()
     * @see #getStatus()
     * @see #setStatus(Status)
     * @generated
     */
    void unsetStatus();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getStatus <em>Status</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Status</em>' containment reference is set.
     * @see #unsetStatus()
     * @see #getStatus()
     * @see #setStatus(Status)
     * @generated
     */
    boolean isSetStatus();

    /**
     * Returns the value of the '<em><b>Scheduled Events</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEvent}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEvent#getScheduledEventData <em>Scheduled Event Data</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Scheduled Events</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Scheduled Events</em>' reference list.
     * @see #isSetScheduledEvents()
     * @see #unsetScheduledEvents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getScheduledEventData_ScheduledEvents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEvent#getScheduledEventData
     * @model opposite="ScheduledEventData" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ScheduledEventData.ScheduledEvents' kind='element'"
     * @generated
     */
    EList< ScheduledEvent > getScheduledEvents();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getScheduledEvents <em>Scheduled Events</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetScheduledEvents()
     * @see #getScheduledEvents()
     * @generated
     */
    void unsetScheduledEvents();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getScheduledEvents <em>Scheduled Events</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Scheduled Events</em>' reference list is set.
     * @see #unsetScheduledEvents()
     * @see #getScheduledEvents()
     * @generated
     */
    boolean isSetScheduledEvents();

    /**
     * Returns the value of the '<em><b>Inspection Data Set</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InspectionDataSet#getAccordingToSchedules <em>According To Schedules</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Inspection Data Set</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Inspection Data Set</em>' reference.
     * @see #isSetInspectionDataSet()
     * @see #unsetInspectionDataSet()
     * @see #setInspectionDataSet(InspectionDataSet)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getScheduledEventData_InspectionDataSet()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.InspectionDataSet#getAccordingToSchedules
     * @model opposite="AccordingToSchedules" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ScheduledEventData.InspectionDataSet' kind='element'"
     * @generated
     */
    InspectionDataSet getInspectionDataSet();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getInspectionDataSet <em>Inspection Data Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Inspection Data Set</em>' reference.
     * @see #isSetInspectionDataSet()
     * @see #unsetInspectionDataSet()
     * @see #getInspectionDataSet()
     * @generated
     */
    void setInspectionDataSet( InspectionDataSet value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getInspectionDataSet <em>Inspection Data Set</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInspectionDataSet()
     * @see #getInspectionDataSet()
     * @see #setInspectionDataSet(InspectionDataSet)
     * @generated
     */
    void unsetInspectionDataSet();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ScheduledEventData#getInspectionDataSet <em>Inspection Data Set</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Inspection Data Set</em>' reference is set.
     * @see #unsetInspectionDataSet()
     * @see #getInspectionDataSet()
     * @see #setInspectionDataSet(InspectionDataSet)
     * @generated
     */
    boolean isSetInspectionDataSet();

} // ScheduledEventData
