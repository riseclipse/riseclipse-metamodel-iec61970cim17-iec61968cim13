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
 * A representation of the model object '<em><b>Base Work</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getKind <em>Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getStatusKind <em>Status Kind</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getPriority <em>Priority</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getWorkActivityRecords <em>Work Activity Records</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getWorkLocation <em>Work Location</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getTimeSchedules <em>Time Schedules</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBaseWork()
 * @model
 * @generated
 */
public interface BaseWork extends Document {
    /**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #setKind(WorkKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBaseWork_Kind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BaseWork.kind' kind='element'"
     * @generated
     */
    WorkKind getKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkKind
     * @see #isSetKind()
     * @see #unsetKind()
     * @see #getKind()
     * @generated
     */
    void setKind( WorkKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetKind()
     * @see #getKind()
     * @see #setKind(WorkKind)
     * @generated
     */
    void unsetKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getKind <em>Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Kind</em>' attribute is set.
     * @see #unsetKind()
     * @see #getKind()
     * @see #setKind(WorkKind)
     * @generated
     */
    boolean isSetKind();

    /**
     * Returns the value of the '<em><b>Status Kind</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkStatusKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Status Kind</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Status Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkStatusKind
     * @see #isSetStatusKind()
     * @see #unsetStatusKind()
     * @see #setStatusKind(WorkStatusKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBaseWork_StatusKind()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BaseWork.statusKind' kind='element'"
     * @generated
     */
    WorkStatusKind getStatusKind();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getStatusKind <em>Status Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Status Kind</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkStatusKind
     * @see #isSetStatusKind()
     * @see #unsetStatusKind()
     * @see #getStatusKind()
     * @generated
     */
    void setStatusKind( WorkStatusKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getStatusKind <em>Status Kind</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStatusKind()
     * @see #getStatusKind()
     * @see #setStatusKind(WorkStatusKind)
     * @generated
     */
    void unsetStatusKind();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getStatusKind <em>Status Kind</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Status Kind</em>' attribute is set.
     * @see #unsetStatusKind()
     * @see #getStatusKind()
     * @see #setStatusKind(WorkStatusKind)
     * @generated
     */
    boolean isSetStatusKind();

    /**
     * Returns the value of the '<em><b>Priority</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Priority</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Priority</em>' containment reference.
     * @see #isSetPriority()
     * @see #unsetPriority()
     * @see #setPriority(Priority)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBaseWork_Priority()
     * @model containment="true" unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BaseWork.priority' kind='element'"
     * @generated
     */
    Priority getPriority();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getPriority <em>Priority</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Priority</em>' containment reference.
     * @see #isSetPriority()
     * @see #unsetPriority()
     * @see #getPriority()
     * @generated
     */
    void setPriority( Priority value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getPriority <em>Priority</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPriority()
     * @see #getPriority()
     * @see #setPriority(Priority)
     * @generated
     */
    void unsetPriority();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getPriority <em>Priority</em>}' containment reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Priority</em>' containment reference is set.
     * @see #unsetPriority()
     * @see #getPriority()
     * @see #setPriority(Priority)
     * @generated
     */
    boolean isSetPriority();

    /**
     * Returns the value of the '<em><b>Work Activity Records</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkActivityRecord}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkActivityRecord#getBaseWork <em>Base Work</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Work Activity Records</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Work Activity Records</em>' reference list.
     * @see #isSetWorkActivityRecords()
     * @see #unsetWorkActivityRecords()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBaseWork_WorkActivityRecords()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkActivityRecord#getBaseWork
     * @model opposite="BaseWork" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BaseWork.WorkActivityRecords' kind='element'"
     * @generated
     */
    EList< WorkActivityRecord > getWorkActivityRecords();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getWorkActivityRecords <em>Work Activity Records</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWorkActivityRecords()
     * @see #getWorkActivityRecords()
     * @generated
     */
    void unsetWorkActivityRecords();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getWorkActivityRecords <em>Work Activity Records</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Work Activity Records</em>' reference list is set.
     * @see #unsetWorkActivityRecords()
     * @see #getWorkActivityRecords()
     * @generated
     */
    boolean isSetWorkActivityRecords();

    /**
     * Returns the value of the '<em><b>Work Location</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkLocation#getBaseWorks <em>Base Works</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Work Location</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Work Location</em>' reference.
     * @see #isSetWorkLocation()
     * @see #unsetWorkLocation()
     * @see #setWorkLocation(WorkLocation)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBaseWork_WorkLocation()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkLocation#getBaseWorks
     * @model opposite="BaseWorks" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BaseWork.WorkLocation' kind='element'"
     * @generated
     */
    WorkLocation getWorkLocation();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getWorkLocation <em>Work Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Work Location</em>' reference.
     * @see #isSetWorkLocation()
     * @see #unsetWorkLocation()
     * @see #getWorkLocation()
     * @generated
     */
    void setWorkLocation( WorkLocation value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getWorkLocation <em>Work Location</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWorkLocation()
     * @see #getWorkLocation()
     * @see #setWorkLocation(WorkLocation)
     * @generated
     */
    void unsetWorkLocation();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getWorkLocation <em>Work Location</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Work Location</em>' reference is set.
     * @see #unsetWorkLocation()
     * @see #getWorkLocation()
     * @see #setWorkLocation(WorkLocation)
     * @generated
     */
    boolean isSetWorkLocation();

    /**
     * Returns the value of the '<em><b>Time Schedules</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTimeSchedule}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTimeSchedule#getBaseWork <em>Base Work</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Schedules</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Schedules</em>' reference list.
     * @see #isSetTimeSchedules()
     * @see #unsetTimeSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBaseWork_TimeSchedules()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WorkTimeSchedule#getBaseWork
     * @model opposite="BaseWork" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BaseWork.TimeSchedules' kind='element'"
     * @generated
     */
    EList< WorkTimeSchedule > getTimeSchedules();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getTimeSchedules <em>Time Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeSchedules()
     * @see #getTimeSchedules()
     * @generated
     */
    void unsetTimeSchedules();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BaseWork#getTimeSchedules <em>Time Schedules</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Schedules</em>' reference list is set.
     * @see #unsetTimeSchedules()
     * @see #getTimeSchedules()
     * @generated
     */
    boolean isSetTimeSchedules();

} // BaseWork
