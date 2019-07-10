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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Voltage Control Zone</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageControlZone#getRegulationSchedule <em>Regulation Schedule</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageControlZone#getBusbarSection <em>Busbar Section</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVoltageControlZone()
 * @model
 * @generated
 */
public interface VoltageControlZone extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Regulation Schedule</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulationSchedule#getVoltageControlZones <em>Voltage Control Zones</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Regulation Schedule</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Regulation Schedule</em>' reference.
     * @see #isSetRegulationSchedule()
     * @see #unsetRegulationSchedule()
     * @see #setRegulationSchedule(RegulationSchedule)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVoltageControlZone_RegulationSchedule()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulationSchedule#getVoltageControlZones
     * @model opposite="VoltageControlZones" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VoltageControlZone.RegulationSchedule' kind='element'"
     * @generated
     */
    RegulationSchedule getRegulationSchedule();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageControlZone#getRegulationSchedule <em>Regulation Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Regulation Schedule</em>' reference.
     * @see #isSetRegulationSchedule()
     * @see #unsetRegulationSchedule()
     * @see #getRegulationSchedule()
     * @generated
     */
    void setRegulationSchedule( RegulationSchedule value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageControlZone#getRegulationSchedule <em>Regulation Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegulationSchedule()
     * @see #getRegulationSchedule()
     * @see #setRegulationSchedule(RegulationSchedule)
     * @generated
     */
    void unsetRegulationSchedule();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageControlZone#getRegulationSchedule <em>Regulation Schedule</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Regulation Schedule</em>' reference is set.
     * @see #unsetRegulationSchedule()
     * @see #getRegulationSchedule()
     * @see #setRegulationSchedule(RegulationSchedule)
     * @generated
     */
    boolean isSetRegulationSchedule();

    /**
     * Returns the value of the '<em><b>Busbar Section</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSection#getVoltageControlZone <em>Voltage Control Zone</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Busbar Section</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Busbar Section</em>' reference.
     * @see #isSetBusbarSection()
     * @see #unsetBusbarSection()
     * @see #setBusbarSection(BusbarSection)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getVoltageControlZone_BusbarSection()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSection#getVoltageControlZone
     * @model opposite="VoltageControlZone" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='VoltageControlZone.BusbarSection' kind='element'"
     * @generated
     */
    BusbarSection getBusbarSection();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageControlZone#getBusbarSection <em>Busbar Section</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Busbar Section</em>' reference.
     * @see #isSetBusbarSection()
     * @see #unsetBusbarSection()
     * @see #getBusbarSection()
     * @generated
     */
    void setBusbarSection( BusbarSection value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageControlZone#getBusbarSection <em>Busbar Section</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBusbarSection()
     * @see #getBusbarSection()
     * @see #setBusbarSection(BusbarSection)
     * @generated
     */
    void unsetBusbarSection();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageControlZone#getBusbarSection <em>Busbar Section</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Busbar Section</em>' reference is set.
     * @see #unsetBusbarSection()
     * @see #getBusbarSection()
     * @see #setBusbarSection(BusbarSection)
     * @generated
     */
    boolean isSetBusbarSection();

} // VoltageControlZone
