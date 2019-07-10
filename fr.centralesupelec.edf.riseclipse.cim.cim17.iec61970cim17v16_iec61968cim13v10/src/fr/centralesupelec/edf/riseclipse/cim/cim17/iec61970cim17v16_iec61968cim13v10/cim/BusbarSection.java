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
 * A representation of the model object '<em><b>Busbar Section</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSection#getIpMax <em>Ip Max</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSection#getVoltageControlZone <em>Voltage Control Zone</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBusbarSection()
 * @model
 * @generated
 */
public interface BusbarSection extends Connector {
    /**
     * Returns the value of the '<em><b>Ip Max</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Ip Max</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Ip Max</em>' attribute.
     * @see #isSetIpMax()
     * @see #unsetIpMax()
     * @see #setIpMax(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBusbarSection_IpMax()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BusbarSection.ipMax' kind='element'"
     * @generated
     */
    Float getIpMax();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSection#getIpMax <em>Ip Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ip Max</em>' attribute.
     * @see #isSetIpMax()
     * @see #unsetIpMax()
     * @see #getIpMax()
     * @generated
     */
    void setIpMax( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSection#getIpMax <em>Ip Max</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIpMax()
     * @see #getIpMax()
     * @see #setIpMax(Float)
     * @generated
     */
    void unsetIpMax();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSection#getIpMax <em>Ip Max</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Ip Max</em>' attribute is set.
     * @see #unsetIpMax()
     * @see #getIpMax()
     * @see #setIpMax(Float)
     * @generated
     */
    boolean isSetIpMax();

    /**
     * Returns the value of the '<em><b>Voltage Control Zone</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageControlZone#getBusbarSection <em>Busbar Section</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Voltage Control Zone</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Voltage Control Zone</em>' reference.
     * @see #isSetVoltageControlZone()
     * @see #unsetVoltageControlZone()
     * @see #setVoltageControlZone(VoltageControlZone)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getBusbarSection_VoltageControlZone()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageControlZone#getBusbarSection
     * @model opposite="BusbarSection" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='BusbarSection.VoltageControlZone' kind='element'"
     * @generated
     */
    VoltageControlZone getVoltageControlZone();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSection#getVoltageControlZone <em>Voltage Control Zone</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Voltage Control Zone</em>' reference.
     * @see #isSetVoltageControlZone()
     * @see #unsetVoltageControlZone()
     * @see #getVoltageControlZone()
     * @generated
     */
    void setVoltageControlZone( VoltageControlZone value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSection#getVoltageControlZone <em>Voltage Control Zone</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVoltageControlZone()
     * @see #getVoltageControlZone()
     * @see #setVoltageControlZone(VoltageControlZone)
     * @generated
     */
    void unsetVoltageControlZone();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.BusbarSection#getVoltageControlZone <em>Voltage Control Zone</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Voltage Control Zone</em>' reference is set.
     * @see #unsetVoltageControlZone()
     * @see #getVoltageControlZone()
     * @see #setVoltageControlZone(VoltageControlZone)
     * @generated
     */
    boolean isSetVoltageControlZone();

} // BusbarSection
