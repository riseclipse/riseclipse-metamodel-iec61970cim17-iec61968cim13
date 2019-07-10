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

import java.util.Date;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getControlType <em>Control Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getOperationInProgress <em>Operation In Progress</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getTimeStamp <em>Time Stamp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getUnitMultiplier <em>Unit Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getUnitSymbol <em>Unit Symbol</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getPowerSystemResource <em>Power System Resource</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getRemoteControl <em>Remote Control</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControl()
 * @model
 * @generated
 */
public interface Control extends IOPoint {
    /**
     * Returns the value of the '<em><b>Control Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Control Type</em>' attribute.
     * @see #isSetControlType()
     * @see #unsetControlType()
     * @see #setControlType(String)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControl_ControlType()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Control.controlType' kind='element'"
     * @generated
     */
    String getControlType();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getControlType <em>Control Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Type</em>' attribute.
     * @see #isSetControlType()
     * @see #unsetControlType()
     * @see #getControlType()
     * @generated
     */
    void setControlType( String value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getControlType <em>Control Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlType()
     * @see #getControlType()
     * @see #setControlType(String)
     * @generated
     */
    void unsetControlType();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getControlType <em>Control Type</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Type</em>' attribute is set.
     * @see #unsetControlType()
     * @see #getControlType()
     * @see #setControlType(String)
     * @generated
     */
    boolean isSetControlType();

    /**
     * Returns the value of the '<em><b>Operation In Progress</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Operation In Progress</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Operation In Progress</em>' attribute.
     * @see #isSetOperationInProgress()
     * @see #unsetOperationInProgress()
     * @see #setOperationInProgress(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControl_OperationInProgress()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Control.operationInProgress' kind='element'"
     * @generated
     */
    Boolean getOperationInProgress();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getOperationInProgress <em>Operation In Progress</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Operation In Progress</em>' attribute.
     * @see #isSetOperationInProgress()
     * @see #unsetOperationInProgress()
     * @see #getOperationInProgress()
     * @generated
     */
    void setOperationInProgress( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getOperationInProgress <em>Operation In Progress</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetOperationInProgress()
     * @see #getOperationInProgress()
     * @see #setOperationInProgress(Boolean)
     * @generated
     */
    void unsetOperationInProgress();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getOperationInProgress <em>Operation In Progress</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Operation In Progress</em>' attribute is set.
     * @see #unsetOperationInProgress()
     * @see #getOperationInProgress()
     * @see #setOperationInProgress(Boolean)
     * @generated
     */
    boolean isSetOperationInProgress();

    /**
     * Returns the value of the '<em><b>Time Stamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Time Stamp</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Time Stamp</em>' attribute.
     * @see #isSetTimeStamp()
     * @see #unsetTimeStamp()
     * @see #setTimeStamp(Date)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControl_TimeStamp()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Control.timeStamp' kind='element'"
     * @generated
     */
    Date getTimeStamp();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getTimeStamp <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Time Stamp</em>' attribute.
     * @see #isSetTimeStamp()
     * @see #unsetTimeStamp()
     * @see #getTimeStamp()
     * @generated
     */
    void setTimeStamp( Date value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getTimeStamp <em>Time Stamp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTimeStamp()
     * @see #getTimeStamp()
     * @see #setTimeStamp(Date)
     * @generated
     */
    void unsetTimeStamp();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getTimeStamp <em>Time Stamp</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Time Stamp</em>' attribute is set.
     * @see #unsetTimeStamp()
     * @see #getTimeStamp()
     * @see #setTimeStamp(Date)
     * @generated
     */
    boolean isSetTimeStamp();

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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControl_UnitMultiplier()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Control.unitMultiplier' kind='element'"
     * @generated
     */
    UnitMultiplier getUnitMultiplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getUnitMultiplier <em>Unit Multiplier</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getUnitMultiplier <em>Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnitMultiplier()
     * @see #getUnitMultiplier()
     * @see #setUnitMultiplier(UnitMultiplier)
     * @generated
     */
    void unsetUnitMultiplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getUnitMultiplier <em>Unit Multiplier</em>}' attribute is set.
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
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControl_UnitSymbol()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Control.unitSymbol' kind='element'"
     * @generated
     */
    UnitSymbol getUnitSymbol();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getUnitSymbol <em>Unit Symbol</em>}' attribute.
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
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getUnitSymbol <em>Unit Symbol</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetUnitSymbol()
     * @see #getUnitSymbol()
     * @see #setUnitSymbol(UnitSymbol)
     * @generated
     */
    void unsetUnitSymbol();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getUnitSymbol <em>Unit Symbol</em>}' attribute is set.
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
     * Returns the value of the '<em><b>Power System Resource</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getControls <em>Controls</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Power System Resource</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Power System Resource</em>' reference.
     * @see #isSetPowerSystemResource()
     * @see #unsetPowerSystemResource()
     * @see #setPowerSystemResource(PowerSystemResource)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControl_PowerSystemResource()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemResource#getControls
     * @model opposite="Controls" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Control.PowerSystemResource' kind='element'"
     * @generated
     */
    PowerSystemResource getPowerSystemResource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getPowerSystemResource <em>Power System Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Power System Resource</em>' reference.
     * @see #isSetPowerSystemResource()
     * @see #unsetPowerSystemResource()
     * @see #getPowerSystemResource()
     * @generated
     */
    void setPowerSystemResource( PowerSystemResource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getPowerSystemResource <em>Power System Resource</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPowerSystemResource()
     * @see #getPowerSystemResource()
     * @see #setPowerSystemResource(PowerSystemResource)
     * @generated
     */
    void unsetPowerSystemResource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getPowerSystemResource <em>Power System Resource</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Power System Resource</em>' reference is set.
     * @see #unsetPowerSystemResource()
     * @see #getPowerSystemResource()
     * @see #setPowerSystemResource(PowerSystemResource)
     * @generated
     */
    boolean isSetPowerSystemResource();

    /**
     * Returns the value of the '<em><b>Remote Control</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getControl <em>Control</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Remote Control</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Remote Control</em>' reference.
     * @see #isSetRemoteControl()
     * @see #unsetRemoteControl()
     * @see #setRemoteControl(RemoteControl)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getControl_RemoteControl()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RemoteControl#getControl
     * @model opposite="Control" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='Control.RemoteControl' kind='element'"
     * @generated
     */
    RemoteControl getRemoteControl();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getRemoteControl <em>Remote Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Remote Control</em>' reference.
     * @see #isSetRemoteControl()
     * @see #unsetRemoteControl()
     * @see #getRemoteControl()
     * @generated
     */
    void setRemoteControl( RemoteControl value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getRemoteControl <em>Remote Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRemoteControl()
     * @see #getRemoteControl()
     * @see #setRemoteControl(RemoteControl)
     * @generated
     */
    void unsetRemoteControl();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Control#getRemoteControl <em>Remote Control</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Remote Control</em>' reference is set.
     * @see #unsetRemoteControl()
     * @see #getRemoteControl()
     * @see #setRemoteControl(RemoteControl)
     * @generated
     */
    boolean isSetRemoteControl();

} // Control
