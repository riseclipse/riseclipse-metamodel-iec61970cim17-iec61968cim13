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

import java.util.Date;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getRequestDateTime <em>Request Date Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getWorkOrderNumber <em>Work Order Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getIncidents <em>Incidents</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getWorkTasks <em>Work Tasks</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getCustomers <em>Customers</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getAppointments <em>Appointments</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWork()
 * @model
 * @generated
 */
public interface Work extends BaseWork {
    /**
     * Returns the value of the '<em><b>Request Date Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Request Date Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Request Date Time</em>' attribute.
     * @see #isSetRequestDateTime()
     * @see #unsetRequestDateTime()
     * @see #setRequestDateTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWork_RequestDateTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Work.requestDateTime' kind='element'"
     * @generated
     */
    Date getRequestDateTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getRequestDateTime <em>Request Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Request Date Time</em>' attribute.
     * @see #isSetRequestDateTime()
     * @see #unsetRequestDateTime()
     * @see #getRequestDateTime()
     * @generated
     */
    void setRequestDateTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getRequestDateTime <em>Request Date Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRequestDateTime()
     * @see #getRequestDateTime()
     * @see #setRequestDateTime(Date)
     * @generated
     */
    void unsetRequestDateTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getRequestDateTime <em>Request Date Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Request Date Time</em>' attribute is set.
     * @see #unsetRequestDateTime()
     * @see #getRequestDateTime()
     * @see #setRequestDateTime(Date)
     * @generated
     */
    boolean isSetRequestDateTime();

    /**
     * Returns the value of the '<em><b>Work Order Number</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Work Order Number</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Work Order Number</em>' attribute.
     * @see #isSetWorkOrderNumber()
     * @see #unsetWorkOrderNumber()
     * @see #setWorkOrderNumber(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWork_WorkOrderNumber()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Work.workOrderNumber' kind='element'"
     * @generated
     */
    String getWorkOrderNumber();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getWorkOrderNumber <em>Work Order Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Work Order Number</em>' attribute.
     * @see #isSetWorkOrderNumber()
     * @see #unsetWorkOrderNumber()
     * @see #getWorkOrderNumber()
     * @generated
     */
    void setWorkOrderNumber( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getWorkOrderNumber <em>Work Order Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWorkOrderNumber()
     * @see #getWorkOrderNumber()
     * @see #setWorkOrderNumber(String)
     * @generated
     */
    void unsetWorkOrderNumber();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getWorkOrderNumber <em>Work Order Number</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Work Order Number</em>' attribute is set.
     * @see #unsetWorkOrderNumber()
     * @see #getWorkOrderNumber()
     * @see #setWorkOrderNumber(String)
     * @generated
     */
    boolean isSetWorkOrderNumber();

    /**
     * Returns the value of the '<em><b>Incidents</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident#getWorks <em>Works</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Incidents</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Incidents</em>' reference list.
     * @see #isSetIncidents()
     * @see #unsetIncidents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWork_Incidents()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Incident#getWorks
     * @model opposite="Works" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Work.Incidents' kind='element'"
     * @generated
     */
    EList< Incident > getIncidents();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getIncidents <em>Incidents</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIncidents()
     * @see #getIncidents()
     * @generated
     */
    void unsetIncidents();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getIncidents <em>Incidents</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Incidents</em>' reference list is set.
     * @see #unsetIncidents()
     * @see #getIncidents()
     * @generated
     */
    boolean isSetIncidents();

    /**
     * Returns the value of the '<em><b>Work Tasks</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getWork <em>Work</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Work Tasks</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Work Tasks</em>' reference list.
     * @see #isSetWorkTasks()
     * @see #unsetWorkTasks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWork_WorkTasks()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTask#getWork
     * @model opposite="Work" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Work.WorkTasks' kind='element'"
     * @generated
     */
    EList< WorkTask > getWorkTasks();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getWorkTasks <em>Work Tasks</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWorkTasks()
     * @see #getWorkTasks()
     * @generated
     */
    void unsetWorkTasks();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getWorkTasks <em>Work Tasks</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Work Tasks</em>' reference list is set.
     * @see #unsetWorkTasks()
     * @see #getWorkTasks()
     * @generated
     */
    boolean isSetWorkTasks();

    /**
     * Returns the value of the '<em><b>Customers</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getWorks <em>Works</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Customers</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Customers</em>' reference list.
     * @see #isSetCustomers()
     * @see #unsetCustomers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWork_Customers()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Customer#getWorks
     * @model opposite="Works" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Work.Customers' kind='element'"
     * @generated
     */
    EList< Customer > getCustomers();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getCustomers <em>Customers</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCustomers()
     * @see #getCustomers()
     * @generated
     */
    void unsetCustomers();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getCustomers <em>Customers</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Customers</em>' reference list is set.
     * @see #unsetCustomers()
     * @see #getCustomers()
     * @generated
     */
    boolean isSetCustomers();

    /**
     * Returns the value of the '<em><b>Appointments</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getWorks <em>Works</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Appointments</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Appointments</em>' reference list.
     * @see #isSetAppointments()
     * @see #unsetAppointments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWork_Appointments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Appointment#getWorks
     * @model opposite="Works" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Work.Appointments' kind='element'"
     * @generated
     */
    EList< Appointment > getAppointments();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getAppointments <em>Appointments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAppointments()
     * @see #getAppointments()
     * @generated
     */
    void unsetAppointments();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Work#getAppointments <em>Appointments</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Appointments</em>' reference list is set.
     * @see #unsetAppointments()
     * @see #getAppointments()
     * @generated
     */
    boolean isSetAppointments();

} // Work
