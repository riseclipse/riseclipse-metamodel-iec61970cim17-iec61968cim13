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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Duct Bank</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DuctBank#getCircuitCount <em>Circuit Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DuctBank#getWireSpacingInfos <em>Wire Spacing Infos</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDuctBank()
 * @model
 * @generated
 */
public interface DuctBank extends AssetContainer {
    /**
     * Returns the value of the '<em><b>Circuit Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Circuit Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Circuit Count</em>' attribute.
     * @see #isSetCircuitCount()
     * @see #unsetCircuitCount()
     * @see #setCircuitCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDuctBank_CircuitCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DuctBank.circuitCount' kind='element'"
     * @generated
     */
    Integer getCircuitCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DuctBank#getCircuitCount <em>Circuit Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Circuit Count</em>' attribute.
     * @see #isSetCircuitCount()
     * @see #unsetCircuitCount()
     * @see #getCircuitCount()
     * @generated
     */
    void setCircuitCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DuctBank#getCircuitCount <em>Circuit Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetCircuitCount()
     * @see #getCircuitCount()
     * @see #setCircuitCount(Integer)
     * @generated
     */
    void unsetCircuitCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DuctBank#getCircuitCount <em>Circuit Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Circuit Count</em>' attribute is set.
     * @see #unsetCircuitCount()
     * @see #getCircuitCount()
     * @see #setCircuitCount(Integer)
     * @generated
     */
    boolean isSetCircuitCount();

    /**
     * Returns the value of the '<em><b>Wire Spacing Infos</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getDuctBank <em>Duct Bank</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wire Spacing Infos</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Spacing Infos</em>' reference list.
     * @see #isSetWireSpacingInfos()
     * @see #unsetWireSpacingInfos()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getDuctBank_WireSpacingInfos()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getDuctBank
     * @model opposite="DuctBank" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='DuctBank.WireSpacingInfos' kind='element'"
     * @generated
     */
    EList< WireSpacing > getWireSpacingInfos();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DuctBank#getWireSpacingInfos <em>Wire Spacing Infos</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWireSpacingInfos()
     * @see #getWireSpacingInfos()
     * @generated
     */
    void unsetWireSpacingInfos();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DuctBank#getWireSpacingInfos <em>Wire Spacing Infos</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wire Spacing Infos</em>' reference list is set.
     * @see #unsetWireSpacingInfos()
     * @see #getWireSpacingInfos()
     * @generated
     */
    boolean isSetWireSpacingInfos();

} // DuctBank
