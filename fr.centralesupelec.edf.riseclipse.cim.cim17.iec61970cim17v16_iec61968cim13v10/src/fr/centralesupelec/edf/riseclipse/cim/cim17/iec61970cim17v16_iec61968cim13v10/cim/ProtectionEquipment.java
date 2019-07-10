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
 * A representation of the model object '<em><b>Protection Equipment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getHighLimit <em>High Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getLowLimit <em>Low Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getPowerDirectionFlag <em>Power Direction Flag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getRelayDelayTime <em>Relay Delay Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getUnitMultiplier <em>Unit Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getUnitSymbol <em>Unit Symbol</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getProtectedSwitches <em>Protected Switches</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getConductingEquipments <em>Conducting Equipments</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProtectionEquipment()
 * @model
 * @generated
 */
public interface ProtectionEquipment extends Equipment {
    /**
     * Returns the value of the '<em><b>High Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>High Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>High Limit</em>' attribute.
     * @see #isSetHighLimit()
     * @see #unsetHighLimit()
     * @see #setHighLimit(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProtectionEquipment_HighLimit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProtectionEquipment.highLimit' kind='element'"
     * @generated
     */
    Float getHighLimit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getHighLimit <em>High Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>High Limit</em>' attribute.
     * @see #isSetHighLimit()
     * @see #unsetHighLimit()
     * @see #getHighLimit()
     * @generated
     */
    void setHighLimit( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getHighLimit <em>High Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHighLimit()
     * @see #getHighLimit()
     * @see #setHighLimit(Float)
     * @generated
     */
    void unsetHighLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getHighLimit <em>High Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>High Limit</em>' attribute is set.
     * @see #unsetHighLimit()
     * @see #getHighLimit()
     * @see #setHighLimit(Float)
     * @generated
     */
    boolean isSetHighLimit();

    /**
     * Returns the value of the '<em><b>Low Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Low Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Low Limit</em>' attribute.
     * @see #isSetLowLimit()
     * @see #unsetLowLimit()
     * @see #setLowLimit(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProtectionEquipment_LowLimit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProtectionEquipment.lowLimit' kind='element'"
     * @generated
     */
    Float getLowLimit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getLowLimit <em>Low Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Low Limit</em>' attribute.
     * @see #isSetLowLimit()
     * @see #unsetLowLimit()
     * @see #getLowLimit()
     * @generated
     */
    void setLowLimit( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getLowLimit <em>Low Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLowLimit()
     * @see #getLowLimit()
     * @see #setLowLimit(Float)
     * @generated
     */
    void unsetLowLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getLowLimit <em>Low Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Low Limit</em>' attribute is set.
     * @see #unsetLowLimit()
     * @see #getLowLimit()
     * @see #setLowLimit(Float)
     * @generated
     */
    boolean isSetLowLimit();

    /**
     * Returns the value of the '<em><b>Power Direction Flag</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power Direction Flag</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power Direction Flag</em>' attribute.
     * @see #isSetPowerDirectionFlag()
     * @see #unsetPowerDirectionFlag()
     * @see #setPowerDirectionFlag(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProtectionEquipment_PowerDirectionFlag()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProtectionEquipment.powerDirectionFlag' kind='element'"
     * @generated
     */
    Boolean getPowerDirectionFlag();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getPowerDirectionFlag <em>Power Direction Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power Direction Flag</em>' attribute.
     * @see #isSetPowerDirectionFlag()
     * @see #unsetPowerDirectionFlag()
     * @see #getPowerDirectionFlag()
     * @generated
     */
    void setPowerDirectionFlag( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getPowerDirectionFlag <em>Power Direction Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerDirectionFlag()
     * @see #getPowerDirectionFlag()
     * @see #setPowerDirectionFlag(Boolean)
     * @generated
     */
    void unsetPowerDirectionFlag();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getPowerDirectionFlag <em>Power Direction Flag</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power Direction Flag</em>' attribute is set.
     * @see #unsetPowerDirectionFlag()
     * @see #getPowerDirectionFlag()
     * @see #setPowerDirectionFlag(Boolean)
     * @generated
     */
    boolean isSetPowerDirectionFlag();

    /**
     * Returns the value of the '<em><b>Relay Delay Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Relay Delay Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Relay Delay Time</em>' attribute.
     * @see #isSetRelayDelayTime()
     * @see #unsetRelayDelayTime()
     * @see #setRelayDelayTime(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProtectionEquipment_RelayDelayTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProtectionEquipment.relayDelayTime' kind='element'"
     * @generated
     */
    Float getRelayDelayTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getRelayDelayTime <em>Relay Delay Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Relay Delay Time</em>' attribute.
     * @see #isSetRelayDelayTime()
     * @see #unsetRelayDelayTime()
     * @see #getRelayDelayTime()
     * @generated
     */
    void setRelayDelayTime( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getRelayDelayTime <em>Relay Delay Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRelayDelayTime()
     * @see #getRelayDelayTime()
     * @see #setRelayDelayTime(Float)
     * @generated
     */
    void unsetRelayDelayTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getRelayDelayTime <em>Relay Delay Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Relay Delay Time</em>' attribute is set.
     * @see #unsetRelayDelayTime()
     * @see #getRelayDelayTime()
     * @see #setRelayDelayTime(Float)
     * @generated
     */
    boolean isSetRelayDelayTime();

    /**
     * Returns the value of the '<em><b>Unit Multiplier</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit Multiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unit Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetUnitMultiplier()
     * @see #unsetUnitMultiplier()
     * @see #setUnitMultiplier(UnitMultiplier)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProtectionEquipment_UnitMultiplier()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProtectionEquipment.unitMultiplier' kind='element'"
     * @generated
     */
    UnitMultiplier getUnitMultiplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getUnitMultiplier <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetUnitMultiplier()
     * @see #unsetUnitMultiplier()
     * @see #getUnitMultiplier()
     * @generated
     */
    void setUnitMultiplier( UnitMultiplier value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getUnitMultiplier <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnitMultiplier()
     * @see #getUnitMultiplier()
     * @see #setUnitMultiplier(UnitMultiplier)
     * @generated
     */
    void unsetUnitMultiplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getUnitMultiplier <em>Unit Multiplier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Unit Multiplier</em>' attribute is set.
     * @see #unsetUnitMultiplier()
     * @see #getUnitMultiplier()
     * @see #setUnitMultiplier(UnitMultiplier)
     * @generated
     */
    boolean isSetUnitMultiplier();

    /**
     * Returns the value of the '<em><b>Unit Symbol</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Unit Symbol</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Unit Symbol</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol
     * @see #isSetUnitSymbol()
     * @see #unsetUnitSymbol()
     * @see #setUnitSymbol(UnitSymbol)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProtectionEquipment_UnitSymbol()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProtectionEquipment.unitSymbol' kind='element'"
     * @generated
     */
    UnitSymbol getUnitSymbol();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getUnitSymbol <em>Unit Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Unit Symbol</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitSymbol
     * @see #isSetUnitSymbol()
     * @see #unsetUnitSymbol()
     * @see #getUnitSymbol()
     * @generated
     */
    void setUnitSymbol( UnitSymbol value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getUnitSymbol <em>Unit Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnitSymbol()
     * @see #getUnitSymbol()
     * @see #setUnitSymbol(UnitSymbol)
     * @generated
     */
    void unsetUnitSymbol();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getUnitSymbol <em>Unit Symbol</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Unit Symbol</em>' attribute is set.
     * @see #unsetUnitSymbol()
     * @see #getUnitSymbol()
     * @see #setUnitSymbol(UnitSymbol)
     * @generated
     */
    boolean isSetUnitSymbol();

    /**
     * Returns the value of the '<em><b>Protected Switches</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch#getOperatedByProtectionEquipment <em>Operated By Protection Equipment</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Protected Switches</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Protected Switches</em>' reference list.
     * @see #isSetProtectedSwitches()
     * @see #unsetProtectedSwitches()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProtectionEquipment_ProtectedSwitches()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectedSwitch#getOperatedByProtectionEquipment
     * @model opposite="OperatedByProtectionEquipment" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProtectionEquipment.ProtectedSwitches' kind='element'"
     * @generated
     */
    EList< ProtectedSwitch > getProtectedSwitches();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getProtectedSwitches <em>Protected Switches</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetProtectedSwitches()
     * @see #getProtectedSwitches()
     * @generated
     */
    void unsetProtectedSwitches();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getProtectedSwitches <em>Protected Switches</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Protected Switches</em>' reference list is set.
     * @see #unsetProtectedSwitches()
     * @see #getProtectedSwitches()
     * @generated
     */
    boolean isSetProtectedSwitches();

    /**
     * Returns the value of the '<em><b>Conducting Equipments</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getProtectionEquipments <em>Protection Equipments</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Conducting Equipments</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Conducting Equipments</em>' reference list.
     * @see #isSetConductingEquipments()
     * @see #unsetConductingEquipments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getProtectionEquipment_ConductingEquipments()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConductingEquipment#getProtectionEquipments
     * @model opposite="ProtectionEquipments" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='ProtectionEquipment.ConductingEquipments' kind='element'"
     * @generated
     */
    EList< ConductingEquipment > getConductingEquipments();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getConductingEquipments <em>Conducting Equipments</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetConductingEquipments()
     * @see #getConductingEquipments()
     * @generated
     */
    void unsetConductingEquipments();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProtectionEquipment#getConductingEquipments <em>Conducting Equipments</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Conducting Equipments</em>' reference list is set.
     * @see #unsetConductingEquipments()
     * @see #getConductingEquipments()
     * @generated
     */
    boolean isSetConductingEquipments();

} // ProtectionEquipment
