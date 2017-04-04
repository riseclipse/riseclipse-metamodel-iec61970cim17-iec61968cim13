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
 * A representation of the model object '<em><b>Wire Spacing</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getIsCable <em>Is Cable</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getPhaseWireCount <em>Phase Wire Count</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getPhaseWireSpacing <em>Phase Wire Spacing</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getUsage <em>Usage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getStructures <em>Structures</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getDuctBank <em>Duct Bank</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getWirePositions <em>Wire Positions</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireSpacing()
 * @model
 * @generated
 */
public interface WireSpacing extends IdentifiedObject {
    /**
     * Returns the value of the '<em><b>Is Cable</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Is Cable</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Is Cable</em>' attribute.
     * @see #isSetIsCable()
     * @see #unsetIsCable()
     * @see #setIsCable(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireSpacing_IsCable()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireSpacing.isCable' kind='element'"
     * @generated
     */
    Boolean getIsCable();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getIsCable <em>Is Cable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Is Cable</em>' attribute.
     * @see #isSetIsCable()
     * @see #unsetIsCable()
     * @see #getIsCable()
     * @generated
     */
    void setIsCable( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getIsCable <em>Is Cable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetIsCable()
     * @see #getIsCable()
     * @see #setIsCable(Boolean)
     * @generated
     */
    void unsetIsCable();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getIsCable <em>Is Cable</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Is Cable</em>' attribute is set.
     * @see #unsetIsCable()
     * @see #getIsCable()
     * @see #setIsCable(Boolean)
     * @generated
     */
    boolean isSetIsCable();

    /**
     * Returns the value of the '<em><b>Phase Wire Count</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Wire Count</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Wire Count</em>' attribute.
     * @see #isSetPhaseWireCount()
     * @see #unsetPhaseWireCount()
     * @see #setPhaseWireCount(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireSpacing_PhaseWireCount()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireSpacing.phaseWireCount' kind='element'"
     * @generated
     */
    Integer getPhaseWireCount();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getPhaseWireCount <em>Phase Wire Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Wire Count</em>' attribute.
     * @see #isSetPhaseWireCount()
     * @see #unsetPhaseWireCount()
     * @see #getPhaseWireCount()
     * @generated
     */
    void setPhaseWireCount( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getPhaseWireCount <em>Phase Wire Count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseWireCount()
     * @see #getPhaseWireCount()
     * @see #setPhaseWireCount(Integer)
     * @generated
     */
    void unsetPhaseWireCount();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getPhaseWireCount <em>Phase Wire Count</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Wire Count</em>' attribute is set.
     * @see #unsetPhaseWireCount()
     * @see #getPhaseWireCount()
     * @see #setPhaseWireCount(Integer)
     * @generated
     */
    boolean isSetPhaseWireCount();

    /**
     * Returns the value of the '<em><b>Phase Wire Spacing</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Phase Wire Spacing</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Phase Wire Spacing</em>' attribute.
     * @see #isSetPhaseWireSpacing()
     * @see #unsetPhaseWireSpacing()
     * @see #setPhaseWireSpacing(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireSpacing_PhaseWireSpacing()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireSpacing.phaseWireSpacing' kind='element'"
     * @generated
     */
    Float getPhaseWireSpacing();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getPhaseWireSpacing <em>Phase Wire Spacing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Phase Wire Spacing</em>' attribute.
     * @see #isSetPhaseWireSpacing()
     * @see #unsetPhaseWireSpacing()
     * @see #getPhaseWireSpacing()
     * @generated
     */
    void setPhaseWireSpacing( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getPhaseWireSpacing <em>Phase Wire Spacing</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPhaseWireSpacing()
     * @see #getPhaseWireSpacing()
     * @see #setPhaseWireSpacing(Float)
     * @generated
     */
    void unsetPhaseWireSpacing();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getPhaseWireSpacing <em>Phase Wire Spacing</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Phase Wire Spacing</em>' attribute is set.
     * @see #unsetPhaseWireSpacing()
     * @see #getPhaseWireSpacing()
     * @see #setPhaseWireSpacing(Float)
     * @generated
     */
    boolean isSetPhaseWireSpacing();

    /**
     * Returns the value of the '<em><b>Usage</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireUsageKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Usage</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Usage</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireUsageKind
     * @see #isSetUsage()
     * @see #unsetUsage()
     * @see #setUsage(WireUsageKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireSpacing_Usage()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireSpacing.usage' kind='element'"
     * @generated
     */
    WireUsageKind getUsage();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getUsage <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Usage</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireUsageKind
     * @see #isSetUsage()
     * @see #unsetUsage()
     * @see #getUsage()
     * @generated
     */
    void setUsage( WireUsageKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getUsage <em>Usage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUsage()
     * @see #getUsage()
     * @see #setUsage(WireUsageKind)
     * @generated
     */
    void unsetUsage();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getUsage <em>Usage</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Usage</em>' attribute is set.
     * @see #unsetUsage()
     * @see #getUsage()
     * @see #setUsage(WireUsageKind)
     * @generated
     */
    boolean isSetUsage();

    /**
     * Returns the value of the '<em><b>Structures</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getWireSpacingInfos <em>Wire Spacing Infos</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Structures</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Structures</em>' reference list.
     * @see #isSetStructures()
     * @see #unsetStructures()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireSpacing_Structures()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Structure#getWireSpacingInfos
     * @model opposite="WireSpacingInfos" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireSpacing.Structures' kind='element'"
     * @generated
     */
    EList< Structure > getStructures();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getStructures <em>Structures</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStructures()
     * @see #getStructures()
     * @generated
     */
    void unsetStructures();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getStructures <em>Structures</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Structures</em>' reference list is set.
     * @see #unsetStructures()
     * @see #getStructures()
     * @generated
     */
    boolean isSetStructures();

    /**
     * Returns the value of the '<em><b>Duct Bank</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DuctBank#getWireSpacingInfos <em>Wire Spacing Infos</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Duct Bank</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Duct Bank</em>' reference.
     * @see #isSetDuctBank()
     * @see #unsetDuctBank()
     * @see #setDuctBank(DuctBank)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireSpacing_DuctBank()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DuctBank#getWireSpacingInfos
     * @model opposite="WireSpacingInfos" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireSpacing.DuctBank' kind='element'"
     * @generated
     */
    DuctBank getDuctBank();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getDuctBank <em>Duct Bank</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Duct Bank</em>' reference.
     * @see #isSetDuctBank()
     * @see #unsetDuctBank()
     * @see #getDuctBank()
     * @generated
     */
    void setDuctBank( DuctBank value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getDuctBank <em>Duct Bank</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDuctBank()
     * @see #getDuctBank()
     * @see #setDuctBank(DuctBank)
     * @generated
     */
    void unsetDuctBank();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getDuctBank <em>Duct Bank</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Duct Bank</em>' reference is set.
     * @see #unsetDuctBank()
     * @see #getDuctBank()
     * @see #setDuctBank(DuctBank)
     * @generated
     */
    boolean isSetDuctBank();

    /**
     * Returns the value of the '<em><b>Wire Positions</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getWireSpacingInfo <em>Wire Spacing Info</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Wire Positions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Wire Positions</em>' reference list.
     * @see #isSetWirePositions()
     * @see #unsetWirePositions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getWireSpacing_WirePositions()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WirePosition#getWireSpacingInfo
     * @model opposite="WireSpacingInfo" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='WireSpacing.WirePositions' kind='element'"
     * @generated
     */
    EList< WirePosition > getWirePositions();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getWirePositions <em>Wire Positions</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetWirePositions()
     * @see #getWirePositions()
     * @generated
     */
    void unsetWirePositions();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WireSpacing#getWirePositions <em>Wire Positions</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Wire Positions</em>' reference list is set.
     * @see #unsetWirePositions()
     * @see #getWirePositions()
     * @generated
     */
    boolean isSetWirePositions();

} // WireSpacing
