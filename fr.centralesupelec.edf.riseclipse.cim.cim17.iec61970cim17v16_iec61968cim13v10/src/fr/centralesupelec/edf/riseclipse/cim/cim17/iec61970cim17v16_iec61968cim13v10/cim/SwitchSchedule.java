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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchSchedule#getSwitch <em>Switch</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchSchedule()
 * @model
 * @generated
 */
public interface SwitchSchedule extends SeasonDayTypeSchedule {
    /**
     * Returns the value of the '<em><b>Switch</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchSchedules <em>Switch Schedules</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Switch</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Switch</em>' reference.
     * @see #isSetSwitch()
     * @see #unsetSwitch()
     * @see #setSwitch(Switch)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getSwitchSchedule_Switch()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch#getSwitchSchedules
     * @model opposite="SwitchSchedules" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='SwitchSchedule.Switch' kind='element'"
     * @generated
     */
    Switch getSwitch();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchSchedule#getSwitch <em>Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Switch</em>' reference.
     * @see #isSetSwitch()
     * @see #unsetSwitch()
     * @see #getSwitch()
     * @generated
     */
    void setSwitch( Switch value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchSchedule#getSwitch <em>Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetSwitch()
     * @see #getSwitch()
     * @see #setSwitch(Switch)
     * @generated
     */
    void unsetSwitch();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchSchedule#getSwitch <em>Switch</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Switch</em>' reference is set.
     * @see #unsetSwitch()
     * @see #getSwitch()
     * @see #setSwitch(Switch)
     * @generated
     */
    boolean isSetSwitch();

} // SwitchSchedule
