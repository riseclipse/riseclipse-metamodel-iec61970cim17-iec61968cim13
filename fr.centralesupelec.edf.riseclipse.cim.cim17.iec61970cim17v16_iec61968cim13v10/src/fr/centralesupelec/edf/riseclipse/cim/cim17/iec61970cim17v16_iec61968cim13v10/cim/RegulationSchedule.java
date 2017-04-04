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
 * A representation of the model object '<em><b>Regulation Schedule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulationSchedule#getVoltageControlZones <em>Voltage Control Zones</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulationSchedule()
 * @model
 * @generated
 */
public interface RegulationSchedule extends SeasonDayTypeSchedule {
    /**
     * Returns the value of the '<em><b>Voltage Control Zones</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageControlZone}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageControlZone#getRegulationSchedule <em>Regulation Schedule</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voltage Control Zones</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voltage Control Zones</em>' reference list.
     * @see #isSetVoltageControlZones()
     * @see #unsetVoltageControlZones()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulationSchedule_VoltageControlZones()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageControlZone#getRegulationSchedule
     * @model opposite="RegulationSchedule" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegulationSchedule.VoltageControlZones' kind='element'"
     * @generated
     */
    EList< VoltageControlZone > getVoltageControlZones();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulationSchedule#getVoltageControlZones <em>Voltage Control Zones</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageControlZones()
     * @see #getVoltageControlZones()
     * @generated
     */
    void unsetVoltageControlZones();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulationSchedule#getVoltageControlZones <em>Voltage Control Zones</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Control Zones</em>' reference list is set.
     * @see #unsetVoltageControlZones()
     * @see #getVoltageControlZones()
     * @generated
     */
    boolean isSetVoltageControlZones();

    /**
     * Returns the value of the '<em><b>Regulating Control</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Regulating Control</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Regulating Control</em>' reference.
     * @see #isSetRegulatingControl()
     * @see #unsetRegulatingControl()
     * @see #setRegulatingControl(RegulatingControl)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulationSchedule_RegulatingControl()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getRegulationSchedule
     * @model opposite="RegulationSchedule" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegulationSchedule.RegulatingControl' kind='element'"
     * @generated
     */
    RegulatingControl getRegulatingControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Regulating Control</em>' reference.
     * @see #isSetRegulatingControl()
     * @see #unsetRegulatingControl()
     * @see #getRegulatingControl()
     * @generated
     */
    void setRegulatingControl( RegulatingControl value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegulatingControl()
     * @see #getRegulatingControl()
     * @see #setRegulatingControl(RegulatingControl)
     * @generated
     */
    void unsetRegulatingControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Regulating Control</em>' reference is set.
     * @see #unsetRegulatingControl()
     * @see #getRegulatingControl()
     * @see #setRegulatingControl(RegulatingControl)
     * @generated
     */
    boolean isSetRegulatingControl();

} // RegulationSchedule
