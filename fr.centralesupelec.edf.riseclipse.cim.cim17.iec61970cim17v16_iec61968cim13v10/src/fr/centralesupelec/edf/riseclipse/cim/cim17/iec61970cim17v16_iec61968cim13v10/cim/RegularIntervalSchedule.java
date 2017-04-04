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
 * A representation of the model object '<em><b>Regular Interval Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegularIntervalSchedule#getEndTime <em>End Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegularIntervalSchedule#getTimePoints <em>Time Points</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegularIntervalSchedule()
 * @model
 * @generated
 */
public interface RegularIntervalSchedule extends BasicIntervalSchedule {
    /**
     * Returns the value of the '<em><b>End Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>End Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>End Time</em>' attribute.
     * @see #isSetEndTime()
     * @see #unsetEndTime()
     * @see #setEndTime(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegularIntervalSchedule_EndTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegularIntervalSchedule.endTime' kind='element'"
     * @generated
     */
    Date getEndTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegularIntervalSchedule#getEndTime <em>End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>End Time</em>' attribute.
     * @see #isSetEndTime()
     * @see #unsetEndTime()
     * @see #getEndTime()
     * @generated
     */
    void setEndTime( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegularIntervalSchedule#getEndTime <em>End Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEndTime()
     * @see #getEndTime()
     * @see #setEndTime(Date)
     * @generated
     */
    void unsetEndTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegularIntervalSchedule#getEndTime <em>End Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>End Time</em>' attribute is set.
     * @see #unsetEndTime()
     * @see #getEndTime()
     * @see #setEndTime(Date)
     * @generated
     */
    boolean isSetEndTime();

    /**
     * Returns the value of the '<em><b>Time Step</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Step</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Step</em>' attribute.
     * @see #isSetTimeStep()
     * @see #unsetTimeStep()
     * @see #setTimeStep(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegularIntervalSchedule_TimeStep()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegularIntervalSchedule.timeStep' kind='element'"
     * @generated
     */
    Float getTimeStep();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Step</em>' attribute.
     * @see #isSetTimeStep()
     * @see #unsetTimeStep()
     * @see #getTimeStep()
     * @generated
     */
    void setTimeStep( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeStep()
     * @see #getTimeStep()
     * @see #setTimeStep(Float)
     * @generated
     */
    void unsetTimeStep();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegularIntervalSchedule#getTimeStep <em>Time Step</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Step</em>' attribute is set.
     * @see #unsetTimeStep()
     * @see #getTimeStep()
     * @see #setTimeStep(Float)
     * @generated
     */
    boolean isSetTimeStep();

    /**
     * Returns the value of the '<em><b>Time Points</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegularTimePoint}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegularTimePoint#getIntervalSchedule <em>Interval Schedule</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Points</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Points</em>' reference list.
     * @see #isSetTimePoints()
     * @see #unsetTimePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegularIntervalSchedule_TimePoints()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegularTimePoint#getIntervalSchedule
     * @model opposite="IntervalSchedule" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegularIntervalSchedule.TimePoints' kind='element'"
     * @generated
     */
    EList< RegularTimePoint > getTimePoints();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegularIntervalSchedule#getTimePoints <em>Time Points</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimePoints()
     * @see #getTimePoints()
     * @generated
     */
    void unsetTimePoints();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegularIntervalSchedule#getTimePoints <em>Time Points</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Points</em>' reference list is set.
     * @see #unsetTimePoints()
     * @see #getTimePoints()
     * @generated
     */
    boolean isSetTimePoints();

} // RegularIntervalSchedule
