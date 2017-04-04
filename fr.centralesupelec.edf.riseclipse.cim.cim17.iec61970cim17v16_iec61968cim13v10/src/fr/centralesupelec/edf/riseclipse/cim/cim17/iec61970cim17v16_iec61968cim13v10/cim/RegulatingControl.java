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
 * A representation of the model object '<em><b>Regulating Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getDiscrete <em>Discrete</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getMode <em>Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getMonitoredPhase <em>Monitored Phase</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTargetDeadband <em>Target Deadband</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTargetValue <em>Target Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTargetValueUnitMultiplier <em>Target Value Unit Multiplier</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTerminal <em>Terminal</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulatingControl()
 * @model
 * @generated
 */
public interface RegulatingControl extends PowerSystemResource {
    /**
     * Returns the value of the '<em><b>Discrete</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Discrete</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Discrete</em>' attribute.
     * @see #isSetDiscrete()
     * @see #unsetDiscrete()
     * @see #setDiscrete(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulatingControl_Discrete()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegulatingControl.discrete' kind='element'"
     * @generated
     */
    Boolean getDiscrete();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getDiscrete <em>Discrete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Discrete</em>' attribute.
     * @see #isSetDiscrete()
     * @see #unsetDiscrete()
     * @see #getDiscrete()
     * @generated
     */
    void setDiscrete( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getDiscrete <em>Discrete</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetDiscrete()
     * @see #getDiscrete()
     * @see #setDiscrete(Boolean)
     * @generated
     */
    void unsetDiscrete();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getDiscrete <em>Discrete</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Discrete</em>' attribute is set.
     * @see #unsetDiscrete()
     * @see #getDiscrete()
     * @see #setDiscrete(Boolean)
     * @generated
     */
    boolean isSetDiscrete();

    /**
     * Returns the value of the '<em><b>Enabled</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Enabled</em>' attribute.
     * @see #isSetEnabled()
     * @see #unsetEnabled()
     * @see #setEnabled(Boolean)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulatingControl_Enabled()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegulatingControl.enabled' kind='element'"
     * @generated
     */
    Boolean getEnabled();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getEnabled <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Enabled</em>' attribute.
     * @see #isSetEnabled()
     * @see #unsetEnabled()
     * @see #getEnabled()
     * @generated
     */
    void setEnabled( Boolean value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getEnabled <em>Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEnabled()
     * @see #getEnabled()
     * @see #setEnabled(Boolean)
     * @generated
     */
    void unsetEnabled();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getEnabled <em>Enabled</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Enabled</em>' attribute is set.
     * @see #unsetEnabled()
     * @see #getEnabled()
     * @see #setEnabled(Boolean)
     * @generated
     */
    boolean isSetEnabled();

    /**
     * Returns the value of the '<em><b>Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControlModeKind}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControlModeKind
     * @see #isSetMode()
     * @see #unsetMode()
     * @see #setMode(RegulatingControlModeKind)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulatingControl_Mode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegulatingControl.mode' kind='element'"
     * @generated
     */
    RegulatingControlModeKind getMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControlModeKind
     * @see #isSetMode()
     * @see #unsetMode()
     * @see #getMode()
     * @generated
     */
    void setMode( RegulatingControlModeKind value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getMode <em>Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMode()
     * @see #getMode()
     * @see #setMode(RegulatingControlModeKind)
     * @generated
     */
    void unsetMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getMode <em>Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Mode</em>' attribute is set.
     * @see #unsetMode()
     * @see #getMode()
     * @see #setMode(RegulatingControlModeKind)
     * @generated
     */
    boolean isSetMode();

    /**
     * Returns the value of the '<em><b>Monitored Phase</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Monitored Phase</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Monitored Phase</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode
     * @see #isSetMonitoredPhase()
     * @see #unsetMonitoredPhase()
     * @see #setMonitoredPhase(PhaseCode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulatingControl_MonitoredPhase()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegulatingControl.monitoredPhase' kind='element'"
     * @generated
     */
    PhaseCode getMonitoredPhase();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getMonitoredPhase <em>Monitored Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Monitored Phase</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PhaseCode
     * @see #isSetMonitoredPhase()
     * @see #unsetMonitoredPhase()
     * @see #getMonitoredPhase()
     * @generated
     */
    void setMonitoredPhase( PhaseCode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getMonitoredPhase <em>Monitored Phase</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMonitoredPhase()
     * @see #getMonitoredPhase()
     * @see #setMonitoredPhase(PhaseCode)
     * @generated
     */
    void unsetMonitoredPhase();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getMonitoredPhase <em>Monitored Phase</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Monitored Phase</em>' attribute is set.
     * @see #unsetMonitoredPhase()
     * @see #getMonitoredPhase()
     * @see #setMonitoredPhase(PhaseCode)
     * @generated
     */
    boolean isSetMonitoredPhase();

    /**
     * Returns the value of the '<em><b>Target Deadband</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Deadband</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Deadband</em>' attribute.
     * @see #isSetTargetDeadband()
     * @see #unsetTargetDeadband()
     * @see #setTargetDeadband(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulatingControl_TargetDeadband()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegulatingControl.targetDeadband' kind='element'"
     * @generated
     */
    Float getTargetDeadband();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTargetDeadband <em>Target Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Deadband</em>' attribute.
     * @see #isSetTargetDeadband()
     * @see #unsetTargetDeadband()
     * @see #getTargetDeadband()
     * @generated
     */
    void setTargetDeadband( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTargetDeadband <em>Target Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetDeadband()
     * @see #getTargetDeadband()
     * @see #setTargetDeadband(Float)
     * @generated
     */
    void unsetTargetDeadband();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTargetDeadband <em>Target Deadband</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Deadband</em>' attribute is set.
     * @see #unsetTargetDeadband()
     * @see #getTargetDeadband()
     * @see #setTargetDeadband(Float)
     * @generated
     */
    boolean isSetTargetDeadband();

    /**
     * Returns the value of the '<em><b>Target Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Value</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Value</em>' attribute.
     * @see #isSetTargetValue()
     * @see #unsetTargetValue()
     * @see #setTargetValue(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulatingControl_TargetValue()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegulatingControl.targetValue' kind='element'"
     * @generated
     */
    Float getTargetValue();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTargetValue <em>Target Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Value</em>' attribute.
     * @see #isSetTargetValue()
     * @see #unsetTargetValue()
     * @see #getTargetValue()
     * @generated
     */
    void setTargetValue( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTargetValue <em>Target Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetValue()
     * @see #getTargetValue()
     * @see #setTargetValue(Float)
     * @generated
     */
    void unsetTargetValue();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTargetValue <em>Target Value</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Value</em>' attribute is set.
     * @see #unsetTargetValue()
     * @see #getTargetValue()
     * @see #setTargetValue(Float)
     * @generated
     */
    boolean isSetTargetValue();

    /**
     * Returns the value of the '<em><b>Target Value Unit Multiplier</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Target Value Unit Multiplier</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Target Value Unit Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetTargetValueUnitMultiplier()
     * @see #unsetTargetValueUnitMultiplier()
     * @see #setTargetValueUnitMultiplier(UnitMultiplier)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulatingControl_TargetValueUnitMultiplier()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegulatingControl.targetValueUnitMultiplier' kind='element'"
     * @generated
     */
    UnitMultiplier getTargetValueUnitMultiplier();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTargetValueUnitMultiplier <em>Target Value Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Target Value Unit Multiplier</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnitMultiplier
     * @see #isSetTargetValueUnitMultiplier()
     * @see #unsetTargetValueUnitMultiplier()
     * @see #getTargetValueUnitMultiplier()
     * @generated
     */
    void setTargetValueUnitMultiplier( UnitMultiplier value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTargetValueUnitMultiplier <em>Target Value Unit Multiplier</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTargetValueUnitMultiplier()
     * @see #getTargetValueUnitMultiplier()
     * @see #setTargetValueUnitMultiplier(UnitMultiplier)
     * @generated
     */
    void unsetTargetValueUnitMultiplier();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTargetValueUnitMultiplier <em>Target Value Unit Multiplier</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Target Value Unit Multiplier</em>' attribute is set.
     * @see #unsetTargetValueUnitMultiplier()
     * @see #getTargetValueUnitMultiplier()
     * @see #setTargetValueUnitMultiplier(UnitMultiplier)
     * @generated
     */
    boolean isSetTargetValueUnitMultiplier();

    /**
     * Returns the value of the '<em><b>Regulating Cond Eq</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingCondEq}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingCondEq#getRegulatingControl <em>Regulating Control</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Regulating Cond Eq</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Regulating Cond Eq</em>' reference list.
     * @see #isSetRegulatingCondEq()
     * @see #unsetRegulatingCondEq()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulatingControl_RegulatingCondEq()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingCondEq#getRegulatingControl
     * @model opposite="RegulatingControl" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegulatingControl.RegulatingCondEq' kind='element'"
     * @generated
     */
    EList< RegulatingCondEq > getRegulatingCondEq();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegulatingCondEq()
     * @see #getRegulatingCondEq()
     * @generated
     */
    void unsetRegulatingCondEq();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getRegulatingCondEq <em>Regulating Cond Eq</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Regulating Cond Eq</em>' reference list is set.
     * @see #unsetRegulatingCondEq()
     * @see #getRegulatingCondEq()
     * @generated
     */
    boolean isSetRegulatingCondEq();

    /**
     * Returns the value of the '<em><b>Terminal</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getRegulatingControl <em>Regulating Control</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Terminal</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #setTerminal(Terminal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulatingControl_Terminal()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Terminal#getRegulatingControl
     * @model opposite="RegulatingControl" resolveProxies="false" unsettable="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegulatingControl.Terminal' kind='element'"
     * @generated
     */
    Terminal getTerminal();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Terminal</em>' reference.
     * @see #isSetTerminal()
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @generated
     */
    void setTerminal( Terminal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTerminal <em>Terminal</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(Terminal)
     * @generated
     */
    void unsetTerminal();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getTerminal <em>Terminal</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Terminal</em>' reference is set.
     * @see #unsetTerminal()
     * @see #getTerminal()
     * @see #setTerminal(Terminal)
     * @generated
     */
    boolean isSetTerminal();

    /**
     * Returns the value of the '<em><b>Regulation Schedule</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulationSchedule}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulationSchedule#getRegulatingControl <em>Regulating Control</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Regulation Schedule</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Regulation Schedule</em>' reference list.
     * @see #isSetRegulationSchedule()
     * @see #unsetRegulationSchedule()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getRegulatingControl_RegulationSchedule()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulationSchedule#getRegulatingControl
     * @model opposite="RegulatingControl" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='RegulatingControl.RegulationSchedule' kind='element'"
     * @generated
     */
    EList< RegulationSchedule > getRegulationSchedule();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRegulationSchedule()
     * @see #getRegulationSchedule()
     * @generated
     */
    void unsetRegulationSchedule();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RegulatingControl#getRegulationSchedule <em>Regulation Schedule</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Regulation Schedule</em>' reference list is set.
     * @see #unsetRegulationSchedule()
     * @see #getRegulationSchedule()
     * @generated
     */
    boolean isSetRegulationSchedule();

} // RegulatingControl
