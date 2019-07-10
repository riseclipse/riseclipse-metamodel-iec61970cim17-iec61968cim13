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

import java.math.BigDecimal;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getAllocSpinResP <em>Alloc Spin Res P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getAutoCntrlMarginP <em>Auto Cntrl Margin P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getBaseP <em>Base P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlDeadband <em>Control Deadband</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlPulseHigh <em>Control Pulse High</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlPulseLow <em>Control Pulse Low</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlResponseRate <em>Control Response Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenControlMode <em>Gen Control Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGovernorMPL <em>Governor MPL</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getHighControlLimit <em>High Control Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getInitialP <em>Initial P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getLongPF <em>Long PF</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getLowControlLimit <em>Low Control Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getLowerRampRate <em>Lower Ramp Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMaxEconomicP <em>Max Economic P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMinEconomicP <em>Min Economic P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMinimumOffTime <em>Minimum Off Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getModelDetail <em>Model Detail</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getNominalP <em>Nominal P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getNormalPF <em>Normal PF</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getPenaltyFactor <em>Penalty Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRaiseRampRate <em>Raise Ramp Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getShortPF <em>Short PF</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getStartupCost <em>Startup Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getStartupTime <em>Startup Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getTieLinePF <em>Tie Line PF</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getTotalEfficiency <em>Total Efficiency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getVariableCost <em>Variable Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRotatingMachine <em>Rotating Machine</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenUnitOpCostCurves <em>Gen Unit Op Cost Curves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenUnitOpSchedule <em>Gen Unit Op Schedule</em>}</li>
 * </ul>
 *
 * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit()
 * @model
 * @generated
 */
public interface GeneratingUnit extends Equipment {
    /**
     * Returns the value of the '<em><b>Alloc Spin Res P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Alloc Spin Res P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Alloc Spin Res P</em>' attribute.
     * @see #isSetAllocSpinResP()
     * @see #unsetAllocSpinResP()
     * @see #setAllocSpinResP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_AllocSpinResP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.allocSpinResP' kind='element'"
     * @generated
     */
    Float getAllocSpinResP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getAllocSpinResP <em>Alloc Spin Res P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Alloc Spin Res P</em>' attribute.
     * @see #isSetAllocSpinResP()
     * @see #unsetAllocSpinResP()
     * @see #getAllocSpinResP()
     * @generated
     */
    void setAllocSpinResP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getAllocSpinResP <em>Alloc Spin Res P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAllocSpinResP()
     * @see #getAllocSpinResP()
     * @see #setAllocSpinResP(Float)
     * @generated
     */
    void unsetAllocSpinResP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getAllocSpinResP <em>Alloc Spin Res P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Alloc Spin Res P</em>' attribute is set.
     * @see #unsetAllocSpinResP()
     * @see #getAllocSpinResP()
     * @see #setAllocSpinResP(Float)
     * @generated
     */
    boolean isSetAllocSpinResP();

    /**
     * Returns the value of the '<em><b>Auto Cntrl Margin P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Auto Cntrl Margin P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Auto Cntrl Margin P</em>' attribute.
     * @see #isSetAutoCntrlMarginP()
     * @see #unsetAutoCntrlMarginP()
     * @see #setAutoCntrlMarginP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_AutoCntrlMarginP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.autoCntrlMarginP' kind='element'"
     * @generated
     */
    Float getAutoCntrlMarginP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getAutoCntrlMarginP <em>Auto Cntrl Margin P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Auto Cntrl Margin P</em>' attribute.
     * @see #isSetAutoCntrlMarginP()
     * @see #unsetAutoCntrlMarginP()
     * @see #getAutoCntrlMarginP()
     * @generated
     */
    void setAutoCntrlMarginP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getAutoCntrlMarginP <em>Auto Cntrl Margin P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetAutoCntrlMarginP()
     * @see #getAutoCntrlMarginP()
     * @see #setAutoCntrlMarginP(Float)
     * @generated
     */
    void unsetAutoCntrlMarginP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getAutoCntrlMarginP <em>Auto Cntrl Margin P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Auto Cntrl Margin P</em>' attribute is set.
     * @see #unsetAutoCntrlMarginP()
     * @see #getAutoCntrlMarginP()
     * @see #setAutoCntrlMarginP(Float)
     * @generated
     */
    boolean isSetAutoCntrlMarginP();

    /**
     * Returns the value of the '<em><b>Base P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Base P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Base P</em>' attribute.
     * @see #isSetBaseP()
     * @see #unsetBaseP()
     * @see #setBaseP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_BaseP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.baseP' kind='element'"
     * @generated
     */
    Float getBaseP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getBaseP <em>Base P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Base P</em>' attribute.
     * @see #isSetBaseP()
     * @see #unsetBaseP()
     * @see #getBaseP()
     * @generated
     */
    void setBaseP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getBaseP <em>Base P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetBaseP()
     * @see #getBaseP()
     * @see #setBaseP(Float)
     * @generated
     */
    void unsetBaseP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getBaseP <em>Base P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Base P</em>' attribute is set.
     * @see #unsetBaseP()
     * @see #getBaseP()
     * @see #setBaseP(Float)
     * @generated
     */
    boolean isSetBaseP();

    /**
     * Returns the value of the '<em><b>Control Deadband</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control Deadband</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Control Deadband</em>' attribute.
     * @see #isSetControlDeadband()
     * @see #unsetControlDeadband()
     * @see #setControlDeadband(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_ControlDeadband()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.controlDeadband' kind='element'"
     * @generated
     */
    Float getControlDeadband();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlDeadband <em>Control Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Deadband</em>' attribute.
     * @see #isSetControlDeadband()
     * @see #unsetControlDeadband()
     * @see #getControlDeadband()
     * @generated
     */
    void setControlDeadband( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlDeadband <em>Control Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlDeadband()
     * @see #getControlDeadband()
     * @see #setControlDeadband(Float)
     * @generated
     */
    void unsetControlDeadband();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlDeadband <em>Control Deadband</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Deadband</em>' attribute is set.
     * @see #unsetControlDeadband()
     * @see #getControlDeadband()
     * @see #setControlDeadband(Float)
     * @generated
     */
    boolean isSetControlDeadband();

    /**
     * Returns the value of the '<em><b>Control Pulse High</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control Pulse High</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Control Pulse High</em>' attribute.
     * @see #isSetControlPulseHigh()
     * @see #unsetControlPulseHigh()
     * @see #setControlPulseHigh(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_ControlPulseHigh()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.controlPulseHigh' kind='element'"
     * @generated
     */
    Float getControlPulseHigh();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlPulseHigh <em>Control Pulse High</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Pulse High</em>' attribute.
     * @see #isSetControlPulseHigh()
     * @see #unsetControlPulseHigh()
     * @see #getControlPulseHigh()
     * @generated
     */
    void setControlPulseHigh( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlPulseHigh <em>Control Pulse High</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlPulseHigh()
     * @see #getControlPulseHigh()
     * @see #setControlPulseHigh(Float)
     * @generated
     */
    void unsetControlPulseHigh();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlPulseHigh <em>Control Pulse High</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Pulse High</em>' attribute is set.
     * @see #unsetControlPulseHigh()
     * @see #getControlPulseHigh()
     * @see #setControlPulseHigh(Float)
     * @generated
     */
    boolean isSetControlPulseHigh();

    /**
     * Returns the value of the '<em><b>Control Pulse Low</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control Pulse Low</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Control Pulse Low</em>' attribute.
     * @see #isSetControlPulseLow()
     * @see #unsetControlPulseLow()
     * @see #setControlPulseLow(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_ControlPulseLow()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.controlPulseLow' kind='element'"
     * @generated
     */
    Float getControlPulseLow();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlPulseLow <em>Control Pulse Low</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Pulse Low</em>' attribute.
     * @see #isSetControlPulseLow()
     * @see #unsetControlPulseLow()
     * @see #getControlPulseLow()
     * @generated
     */
    void setControlPulseLow( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlPulseLow <em>Control Pulse Low</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlPulseLow()
     * @see #getControlPulseLow()
     * @see #setControlPulseLow(Float)
     * @generated
     */
    void unsetControlPulseLow();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlPulseLow <em>Control Pulse Low</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Pulse Low</em>' attribute is set.
     * @see #unsetControlPulseLow()
     * @see #getControlPulseLow()
     * @see #setControlPulseLow(Float)
     * @generated
     */
    boolean isSetControlPulseLow();

    /**
     * Returns the value of the '<em><b>Control Response Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control Response Rate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Control Response Rate</em>' attribute.
     * @see #isSetControlResponseRate()
     * @see #unsetControlResponseRate()
     * @see #setControlResponseRate(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_ControlResponseRate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.controlResponseRate' kind='element'"
     * @generated
     */
    Float getControlResponseRate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlResponseRate <em>Control Response Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Control Response Rate</em>' attribute.
     * @see #isSetControlResponseRate()
     * @see #unsetControlResponseRate()
     * @see #getControlResponseRate()
     * @generated
     */
    void setControlResponseRate( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlResponseRate <em>Control Response Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlResponseRate()
     * @see #getControlResponseRate()
     * @see #setControlResponseRate(Float)
     * @generated
     */
    void unsetControlResponseRate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlResponseRate <em>Control Response Rate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Response Rate</em>' attribute is set.
     * @see #unsetControlResponseRate()
     * @see #getControlResponseRate()
     * @see #setControlResponseRate(Float)
     * @generated
     */
    boolean isSetControlResponseRate();

    /**
     * Returns the value of the '<em><b>Efficiency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Efficiency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Efficiency</em>' attribute.
     * @see #isSetEfficiency()
     * @see #unsetEfficiency()
     * @see #setEfficiency(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_Efficiency()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.efficiency' kind='element'"
     * @generated
     */
    Float getEfficiency();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getEfficiency <em>Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Efficiency</em>' attribute.
     * @see #isSetEfficiency()
     * @see #unsetEfficiency()
     * @see #getEfficiency()
     * @generated
     */
    void setEfficiency( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getEfficiency <em>Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetEfficiency()
     * @see #getEfficiency()
     * @see #setEfficiency(Float)
     * @generated
     */
    void unsetEfficiency();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getEfficiency <em>Efficiency</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Efficiency</em>' attribute is set.
     * @see #unsetEfficiency()
     * @see #getEfficiency()
     * @see #setEfficiency(Float)
     * @generated
     */
    boolean isSetEfficiency();

    /**
     * Returns the value of the '<em><b>Gen Control Mode</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratorControlMode}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gen Control Mode</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gen Control Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratorControlMode
     * @see #isSetGenControlMode()
     * @see #unsetGenControlMode()
     * @see #setGenControlMode(GeneratorControlMode)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_GenControlMode()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.genControlMode' kind='element'"
     * @generated
     */
    GeneratorControlMode getGenControlMode();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenControlMode <em>Gen Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gen Control Mode</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratorControlMode
     * @see #isSetGenControlMode()
     * @see #unsetGenControlMode()
     * @see #getGenControlMode()
     * @generated
     */
    void setGenControlMode( GeneratorControlMode value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenControlMode <em>Gen Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGenControlMode()
     * @see #getGenControlMode()
     * @see #setGenControlMode(GeneratorControlMode)
     * @generated
     */
    void unsetGenControlMode();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenControlMode <em>Gen Control Mode</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gen Control Mode</em>' attribute is set.
     * @see #unsetGenControlMode()
     * @see #getGenControlMode()
     * @see #setGenControlMode(GeneratorControlMode)
     * @generated
     */
    boolean isSetGenControlMode();

    /**
     * Returns the value of the '<em><b>Gen Control Source</b></em>' attribute.
     * The literals are from the enumeration {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratorControlSource}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gen Control Source</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gen Control Source</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratorControlSource
     * @see #isSetGenControlSource()
     * @see #unsetGenControlSource()
     * @see #setGenControlSource(GeneratorControlSource)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_GenControlSource()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.genControlSource' kind='element'"
     * @generated
     */
    GeneratorControlSource getGenControlSource();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gen Control Source</em>' attribute.
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratorControlSource
     * @see #isSetGenControlSource()
     * @see #unsetGenControlSource()
     * @see #getGenControlSource()
     * @generated
     */
    void setGenControlSource( GeneratorControlSource value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGenControlSource()
     * @see #getGenControlSource()
     * @see #setGenControlSource(GeneratorControlSource)
     * @generated
     */
    void unsetGenControlSource();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenControlSource <em>Gen Control Source</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gen Control Source</em>' attribute is set.
     * @see #unsetGenControlSource()
     * @see #getGenControlSource()
     * @see #setGenControlSource(GeneratorControlSource)
     * @generated
     */
    boolean isSetGenControlSource();

    /**
     * Returns the value of the '<em><b>Governor MPL</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Governor MPL</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Governor MPL</em>' attribute.
     * @see #isSetGovernorMPL()
     * @see #unsetGovernorMPL()
     * @see #setGovernorMPL(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_GovernorMPL()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.governorMPL' kind='element'"
     * @generated
     */
    Float getGovernorMPL();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGovernorMPL <em>Governor MPL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Governor MPL</em>' attribute.
     * @see #isSetGovernorMPL()
     * @see #unsetGovernorMPL()
     * @see #getGovernorMPL()
     * @generated
     */
    void setGovernorMPL( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGovernorMPL <em>Governor MPL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGovernorMPL()
     * @see #getGovernorMPL()
     * @see #setGovernorMPL(Float)
     * @generated
     */
    void unsetGovernorMPL();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGovernorMPL <em>Governor MPL</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Governor MPL</em>' attribute is set.
     * @see #unsetGovernorMPL()
     * @see #getGovernorMPL()
     * @see #setGovernorMPL(Float)
     * @generated
     */
    boolean isSetGovernorMPL();

    /**
     * Returns the value of the '<em><b>Governor SCD</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Governor SCD</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Governor SCD</em>' attribute.
     * @see #isSetGovernorSCD()
     * @see #unsetGovernorSCD()
     * @see #setGovernorSCD(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_GovernorSCD()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.governorSCD' kind='element'"
     * @generated
     */
    Float getGovernorSCD();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Governor SCD</em>' attribute.
     * @see #isSetGovernorSCD()
     * @see #unsetGovernorSCD()
     * @see #getGovernorSCD()
     * @generated
     */
    void setGovernorSCD( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGovernorSCD()
     * @see #getGovernorSCD()
     * @see #setGovernorSCD(Float)
     * @generated
     */
    void unsetGovernorSCD();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGovernorSCD <em>Governor SCD</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Governor SCD</em>' attribute is set.
     * @see #unsetGovernorSCD()
     * @see #getGovernorSCD()
     * @see #setGovernorSCD(Float)
     * @generated
     */
    boolean isSetGovernorSCD();

    /**
     * Returns the value of the '<em><b>High Control Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>High Control Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>High Control Limit</em>' attribute.
     * @see #isSetHighControlLimit()
     * @see #unsetHighControlLimit()
     * @see #setHighControlLimit(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_HighControlLimit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.highControlLimit' kind='element'"
     * @generated
     */
    Float getHighControlLimit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getHighControlLimit <em>High Control Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>High Control Limit</em>' attribute.
     * @see #isSetHighControlLimit()
     * @see #unsetHighControlLimit()
     * @see #getHighControlLimit()
     * @generated
     */
    void setHighControlLimit( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getHighControlLimit <em>High Control Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetHighControlLimit()
     * @see #getHighControlLimit()
     * @see #setHighControlLimit(Float)
     * @generated
     */
    void unsetHighControlLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getHighControlLimit <em>High Control Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>High Control Limit</em>' attribute is set.
     * @see #unsetHighControlLimit()
     * @see #getHighControlLimit()
     * @see #setHighControlLimit(Float)
     * @generated
     */
    boolean isSetHighControlLimit();

    /**
     * Returns the value of the '<em><b>Initial P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Initial P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Initial P</em>' attribute.
     * @see #isSetInitialP()
     * @see #unsetInitialP()
     * @see #setInitialP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_InitialP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.initialP' kind='element'"
     * @generated
     */
    Float getInitialP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getInitialP <em>Initial P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initial P</em>' attribute.
     * @see #isSetInitialP()
     * @see #unsetInitialP()
     * @see #getInitialP()
     * @generated
     */
    void setInitialP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getInitialP <em>Initial P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetInitialP()
     * @see #getInitialP()
     * @see #setInitialP(Float)
     * @generated
     */
    void unsetInitialP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getInitialP <em>Initial P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Initial P</em>' attribute is set.
     * @see #unsetInitialP()
     * @see #getInitialP()
     * @see #setInitialP(Float)
     * @generated
     */
    boolean isSetInitialP();

    /**
     * Returns the value of the '<em><b>Long PF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Long PF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Long PF</em>' attribute.
     * @see #isSetLongPF()
     * @see #unsetLongPF()
     * @see #setLongPF(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_LongPF()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.longPF' kind='element'"
     * @generated
     */
    Float getLongPF();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getLongPF <em>Long PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Long PF</em>' attribute.
     * @see #isSetLongPF()
     * @see #unsetLongPF()
     * @see #getLongPF()
     * @generated
     */
    void setLongPF( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getLongPF <em>Long PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLongPF()
     * @see #getLongPF()
     * @see #setLongPF(Float)
     * @generated
     */
    void unsetLongPF();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getLongPF <em>Long PF</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Long PF</em>' attribute is set.
     * @see #unsetLongPF()
     * @see #getLongPF()
     * @see #setLongPF(Float)
     * @generated
     */
    boolean isSetLongPF();

    /**
     * Returns the value of the '<em><b>Low Control Limit</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Low Control Limit</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Low Control Limit</em>' attribute.
     * @see #isSetLowControlLimit()
     * @see #unsetLowControlLimit()
     * @see #setLowControlLimit(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_LowControlLimit()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.lowControlLimit' kind='element'"
     * @generated
     */
    Float getLowControlLimit();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getLowControlLimit <em>Low Control Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Low Control Limit</em>' attribute.
     * @see #isSetLowControlLimit()
     * @see #unsetLowControlLimit()
     * @see #getLowControlLimit()
     * @generated
     */
    void setLowControlLimit( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getLowControlLimit <em>Low Control Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLowControlLimit()
     * @see #getLowControlLimit()
     * @see #setLowControlLimit(Float)
     * @generated
     */
    void unsetLowControlLimit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getLowControlLimit <em>Low Control Limit</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Low Control Limit</em>' attribute is set.
     * @see #unsetLowControlLimit()
     * @see #getLowControlLimit()
     * @see #setLowControlLimit(Float)
     * @generated
     */
    boolean isSetLowControlLimit();

    /**
     * Returns the value of the '<em><b>Lower Ramp Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Lower Ramp Rate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Lower Ramp Rate</em>' attribute.
     * @see #isSetLowerRampRate()
     * @see #unsetLowerRampRate()
     * @see #setLowerRampRate(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_LowerRampRate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.lowerRampRate' kind='element'"
     * @generated
     */
    Float getLowerRampRate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getLowerRampRate <em>Lower Ramp Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Lower Ramp Rate</em>' attribute.
     * @see #isSetLowerRampRate()
     * @see #unsetLowerRampRate()
     * @see #getLowerRampRate()
     * @generated
     */
    void setLowerRampRate( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getLowerRampRate <em>Lower Ramp Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetLowerRampRate()
     * @see #getLowerRampRate()
     * @see #setLowerRampRate(Float)
     * @generated
     */
    void unsetLowerRampRate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getLowerRampRate <em>Lower Ramp Rate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Lower Ramp Rate</em>' attribute is set.
     * @see #unsetLowerRampRate()
     * @see #getLowerRampRate()
     * @see #setLowerRampRate(Float)
     * @generated
     */
    boolean isSetLowerRampRate();

    /**
     * Returns the value of the '<em><b>Max Economic P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Economic P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Economic P</em>' attribute.
     * @see #isSetMaxEconomicP()
     * @see #unsetMaxEconomicP()
     * @see #setMaxEconomicP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_MaxEconomicP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.maxEconomicP' kind='element'"
     * @generated
     */
    Float getMaxEconomicP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMaxEconomicP <em>Max Economic P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Economic P</em>' attribute.
     * @see #isSetMaxEconomicP()
     * @see #unsetMaxEconomicP()
     * @see #getMaxEconomicP()
     * @generated
     */
    void setMaxEconomicP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMaxEconomicP <em>Max Economic P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxEconomicP()
     * @see #getMaxEconomicP()
     * @see #setMaxEconomicP(Float)
     * @generated
     */
    void unsetMaxEconomicP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMaxEconomicP <em>Max Economic P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Economic P</em>' attribute is set.
     * @see #unsetMaxEconomicP()
     * @see #getMaxEconomicP()
     * @see #setMaxEconomicP(Float)
     * @generated
     */
    boolean isSetMaxEconomicP();

    /**
     * Returns the value of the '<em><b>Maximum Allowable Spinning Reserve</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Maximum Allowable Spinning Reserve</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Maximum Allowable Spinning Reserve</em>' attribute.
     * @see #isSetMaximumAllowableSpinningReserve()
     * @see #unsetMaximumAllowableSpinningReserve()
     * @see #setMaximumAllowableSpinningReserve(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_MaximumAllowableSpinningReserve()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.maximumAllowableSpinningReserve' kind='element'"
     * @generated
     */
    Float getMaximumAllowableSpinningReserve();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Maximum Allowable Spinning Reserve</em>' attribute.
     * @see #isSetMaximumAllowableSpinningReserve()
     * @see #unsetMaximumAllowableSpinningReserve()
     * @see #getMaximumAllowableSpinningReserve()
     * @generated
     */
    void setMaximumAllowableSpinningReserve( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaximumAllowableSpinningReserve()
     * @see #getMaximumAllowableSpinningReserve()
     * @see #setMaximumAllowableSpinningReserve(Float)
     * @generated
     */
    void unsetMaximumAllowableSpinningReserve();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Maximum Allowable Spinning Reserve</em>' attribute is set.
     * @see #unsetMaximumAllowableSpinningReserve()
     * @see #getMaximumAllowableSpinningReserve()
     * @see #setMaximumAllowableSpinningReserve(Float)
     * @generated
     */
    boolean isSetMaximumAllowableSpinningReserve();

    /**
     * Returns the value of the '<em><b>Max Operating P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Max Operating P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Max Operating P</em>' attribute.
     * @see #isSetMaxOperatingP()
     * @see #unsetMaxOperatingP()
     * @see #setMaxOperatingP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_MaxOperatingP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.maxOperatingP' kind='element'"
     * @generated
     */
    Float getMaxOperatingP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Max Operating P</em>' attribute.
     * @see #isSetMaxOperatingP()
     * @see #unsetMaxOperatingP()
     * @see #getMaxOperatingP()
     * @generated
     */
    void setMaxOperatingP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMaxOperatingP()
     * @see #getMaxOperatingP()
     * @see #setMaxOperatingP(Float)
     * @generated
     */
    void unsetMaxOperatingP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMaxOperatingP <em>Max Operating P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Max Operating P</em>' attribute is set.
     * @see #unsetMaxOperatingP()
     * @see #getMaxOperatingP()
     * @see #setMaxOperatingP(Float)
     * @generated
     */
    boolean isSetMaxOperatingP();

    /**
     * Returns the value of the '<em><b>Min Economic P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Economic P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Economic P</em>' attribute.
     * @see #isSetMinEconomicP()
     * @see #unsetMinEconomicP()
     * @see #setMinEconomicP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_MinEconomicP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.minEconomicP' kind='element'"
     * @generated
     */
    Float getMinEconomicP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMinEconomicP <em>Min Economic P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Economic P</em>' attribute.
     * @see #isSetMinEconomicP()
     * @see #unsetMinEconomicP()
     * @see #getMinEconomicP()
     * @generated
     */
    void setMinEconomicP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMinEconomicP <em>Min Economic P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinEconomicP()
     * @see #getMinEconomicP()
     * @see #setMinEconomicP(Float)
     * @generated
     */
    void unsetMinEconomicP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMinEconomicP <em>Min Economic P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Economic P</em>' attribute is set.
     * @see #unsetMinEconomicP()
     * @see #getMinEconomicP()
     * @see #setMinEconomicP(Float)
     * @generated
     */
    boolean isSetMinEconomicP();

    /**
     * Returns the value of the '<em><b>Minimum Off Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Minimum Off Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Minimum Off Time</em>' attribute.
     * @see #isSetMinimumOffTime()
     * @see #unsetMinimumOffTime()
     * @see #setMinimumOffTime(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_MinimumOffTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.minimumOffTime' kind='element'"
     * @generated
     */
    Float getMinimumOffTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMinimumOffTime <em>Minimum Off Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Minimum Off Time</em>' attribute.
     * @see #isSetMinimumOffTime()
     * @see #unsetMinimumOffTime()
     * @see #getMinimumOffTime()
     * @generated
     */
    void setMinimumOffTime( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMinimumOffTime <em>Minimum Off Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinimumOffTime()
     * @see #getMinimumOffTime()
     * @see #setMinimumOffTime(Float)
     * @generated
     */
    void unsetMinimumOffTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMinimumOffTime <em>Minimum Off Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Minimum Off Time</em>' attribute is set.
     * @see #unsetMinimumOffTime()
     * @see #getMinimumOffTime()
     * @see #setMinimumOffTime(Float)
     * @generated
     */
    boolean isSetMinimumOffTime();

    /**
     * Returns the value of the '<em><b>Min Operating P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Min Operating P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Min Operating P</em>' attribute.
     * @see #isSetMinOperatingP()
     * @see #unsetMinOperatingP()
     * @see #setMinOperatingP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_MinOperatingP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.minOperatingP' kind='element'"
     * @generated
     */
    Float getMinOperatingP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Min Operating P</em>' attribute.
     * @see #isSetMinOperatingP()
     * @see #unsetMinOperatingP()
     * @see #getMinOperatingP()
     * @generated
     */
    void setMinOperatingP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetMinOperatingP()
     * @see #getMinOperatingP()
     * @see #setMinOperatingP(Float)
     * @generated
     */
    void unsetMinOperatingP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getMinOperatingP <em>Min Operating P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Min Operating P</em>' attribute is set.
     * @see #unsetMinOperatingP()
     * @see #getMinOperatingP()
     * @see #setMinOperatingP(Float)
     * @generated
     */
    boolean isSetMinOperatingP();

    /**
     * Returns the value of the '<em><b>Model Detail</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Model Detail</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Model Detail</em>' attribute.
     * @see #isSetModelDetail()
     * @see #unsetModelDetail()
     * @see #setModelDetail(Integer)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_ModelDetail()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.modelDetail' kind='element'"
     * @generated
     */
    Integer getModelDetail();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getModelDetail <em>Model Detail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Model Detail</em>' attribute.
     * @see #isSetModelDetail()
     * @see #unsetModelDetail()
     * @see #getModelDetail()
     * @generated
     */
    void setModelDetail( Integer value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getModelDetail <em>Model Detail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetModelDetail()
     * @see #getModelDetail()
     * @see #setModelDetail(Integer)
     * @generated
     */
    void unsetModelDetail();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getModelDetail <em>Model Detail</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Model Detail</em>' attribute is set.
     * @see #unsetModelDetail()
     * @see #getModelDetail()
     * @see #setModelDetail(Integer)
     * @generated
     */
    boolean isSetModelDetail();

    /**
     * Returns the value of the '<em><b>Nominal P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Nominal P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Nominal P</em>' attribute.
     * @see #isSetNominalP()
     * @see #unsetNominalP()
     * @see #setNominalP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_NominalP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.nominalP' kind='element'"
     * @generated
     */
    Float getNominalP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getNominalP <em>Nominal P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Nominal P</em>' attribute.
     * @see #isSetNominalP()
     * @see #unsetNominalP()
     * @see #getNominalP()
     * @generated
     */
    void setNominalP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getNominalP <em>Nominal P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNominalP()
     * @see #getNominalP()
     * @see #setNominalP(Float)
     * @generated
     */
    void unsetNominalP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getNominalP <em>Nominal P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Nominal P</em>' attribute is set.
     * @see #unsetNominalP()
     * @see #getNominalP()
     * @see #setNominalP(Float)
     * @generated
     */
    boolean isSetNominalP();

    /**
     * Returns the value of the '<em><b>Normal PF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Normal PF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Normal PF</em>' attribute.
     * @see #isSetNormalPF()
     * @see #unsetNormalPF()
     * @see #setNormalPF(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_NormalPF()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.normalPF' kind='element'"
     * @generated
     */
    Float getNormalPF();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getNormalPF <em>Normal PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Normal PF</em>' attribute.
     * @see #isSetNormalPF()
     * @see #unsetNormalPF()
     * @see #getNormalPF()
     * @generated
     */
    void setNormalPF( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getNormalPF <em>Normal PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetNormalPF()
     * @see #getNormalPF()
     * @see #setNormalPF(Float)
     * @generated
     */
    void unsetNormalPF();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getNormalPF <em>Normal PF</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Normal PF</em>' attribute is set.
     * @see #unsetNormalPF()
     * @see #getNormalPF()
     * @see #setNormalPF(Float)
     * @generated
     */
    boolean isSetNormalPF();

    /**
     * Returns the value of the '<em><b>Penalty Factor</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Penalty Factor</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Penalty Factor</em>' attribute.
     * @see #isSetPenaltyFactor()
     * @see #unsetPenaltyFactor()
     * @see #setPenaltyFactor(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_PenaltyFactor()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.penaltyFactor' kind='element'"
     * @generated
     */
    Float getPenaltyFactor();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getPenaltyFactor <em>Penalty Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Penalty Factor</em>' attribute.
     * @see #isSetPenaltyFactor()
     * @see #unsetPenaltyFactor()
     * @see #getPenaltyFactor()
     * @generated
     */
    void setPenaltyFactor( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getPenaltyFactor <em>Penalty Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetPenaltyFactor()
     * @see #getPenaltyFactor()
     * @see #setPenaltyFactor(Float)
     * @generated
     */
    void unsetPenaltyFactor();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getPenaltyFactor <em>Penalty Factor</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Penalty Factor</em>' attribute is set.
     * @see #unsetPenaltyFactor()
     * @see #getPenaltyFactor()
     * @see #setPenaltyFactor(Float)
     * @generated
     */
    boolean isSetPenaltyFactor();

    /**
     * Returns the value of the '<em><b>Raise Ramp Rate</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Raise Ramp Rate</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Raise Ramp Rate</em>' attribute.
     * @see #isSetRaiseRampRate()
     * @see #unsetRaiseRampRate()
     * @see #setRaiseRampRate(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_RaiseRampRate()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.raiseRampRate' kind='element'"
     * @generated
     */
    Float getRaiseRampRate();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRaiseRampRate <em>Raise Ramp Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Raise Ramp Rate</em>' attribute.
     * @see #isSetRaiseRampRate()
     * @see #unsetRaiseRampRate()
     * @see #getRaiseRampRate()
     * @generated
     */
    void setRaiseRampRate( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRaiseRampRate <em>Raise Ramp Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRaiseRampRate()
     * @see #getRaiseRampRate()
     * @see #setRaiseRampRate(Float)
     * @generated
     */
    void unsetRaiseRampRate();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRaiseRampRate <em>Raise Ramp Rate</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Raise Ramp Rate</em>' attribute is set.
     * @see #unsetRaiseRampRate()
     * @see #getRaiseRampRate()
     * @see #setRaiseRampRate(Float)
     * @generated
     */
    boolean isSetRaiseRampRate();

    /**
     * Returns the value of the '<em><b>Rated Gross Max P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Gross Max P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Gross Max P</em>' attribute.
     * @see #isSetRatedGrossMaxP()
     * @see #unsetRatedGrossMaxP()
     * @see #setRatedGrossMaxP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_RatedGrossMaxP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.ratedGrossMaxP' kind='element'"
     * @generated
     */
    Float getRatedGrossMaxP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Gross Max P</em>' attribute.
     * @see #isSetRatedGrossMaxP()
     * @see #unsetRatedGrossMaxP()
     * @see #getRatedGrossMaxP()
     * @generated
     */
    void setRatedGrossMaxP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedGrossMaxP()
     * @see #getRatedGrossMaxP()
     * @see #setRatedGrossMaxP(Float)
     * @generated
     */
    void unsetRatedGrossMaxP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRatedGrossMaxP <em>Rated Gross Max P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Gross Max P</em>' attribute is set.
     * @see #unsetRatedGrossMaxP()
     * @see #getRatedGrossMaxP()
     * @see #setRatedGrossMaxP(Float)
     * @generated
     */
    boolean isSetRatedGrossMaxP();

    /**
     * Returns the value of the '<em><b>Rated Gross Min P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Gross Min P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Gross Min P</em>' attribute.
     * @see #isSetRatedGrossMinP()
     * @see #unsetRatedGrossMinP()
     * @see #setRatedGrossMinP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_RatedGrossMinP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.ratedGrossMinP' kind='element'"
     * @generated
     */
    Float getRatedGrossMinP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Gross Min P</em>' attribute.
     * @see #isSetRatedGrossMinP()
     * @see #unsetRatedGrossMinP()
     * @see #getRatedGrossMinP()
     * @generated
     */
    void setRatedGrossMinP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedGrossMinP()
     * @see #getRatedGrossMinP()
     * @see #setRatedGrossMinP(Float)
     * @generated
     */
    void unsetRatedGrossMinP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRatedGrossMinP <em>Rated Gross Min P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Gross Min P</em>' attribute is set.
     * @see #unsetRatedGrossMinP()
     * @see #getRatedGrossMinP()
     * @see #setRatedGrossMinP(Float)
     * @generated
     */
    boolean isSetRatedGrossMinP();

    /**
     * Returns the value of the '<em><b>Rated Net Max P</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rated Net Max P</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rated Net Max P</em>' attribute.
     * @see #isSetRatedNetMaxP()
     * @see #unsetRatedNetMaxP()
     * @see #setRatedNetMaxP(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_RatedNetMaxP()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.ratedNetMaxP' kind='element'"
     * @generated
     */
    Float getRatedNetMaxP();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Rated Net Max P</em>' attribute.
     * @see #isSetRatedNetMaxP()
     * @see #unsetRatedNetMaxP()
     * @see #getRatedNetMaxP()
     * @generated
     */
    void setRatedNetMaxP( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRatedNetMaxP()
     * @see #getRatedNetMaxP()
     * @see #setRatedNetMaxP(Float)
     * @generated
     */
    void unsetRatedNetMaxP();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRatedNetMaxP <em>Rated Net Max P</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rated Net Max P</em>' attribute is set.
     * @see #unsetRatedNetMaxP()
     * @see #getRatedNetMaxP()
     * @see #setRatedNetMaxP(Float)
     * @generated
     */
    boolean isSetRatedNetMaxP();

    /**
     * Returns the value of the '<em><b>Short PF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Short PF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Short PF</em>' attribute.
     * @see #isSetShortPF()
     * @see #unsetShortPF()
     * @see #setShortPF(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_ShortPF()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.shortPF' kind='element'"
     * @generated
     */
    Float getShortPF();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getShortPF <em>Short PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Short PF</em>' attribute.
     * @see #isSetShortPF()
     * @see #unsetShortPF()
     * @see #getShortPF()
     * @generated
     */
    void setShortPF( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getShortPF <em>Short PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetShortPF()
     * @see #getShortPF()
     * @see #setShortPF(Float)
     * @generated
     */
    void unsetShortPF();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getShortPF <em>Short PF</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Short PF</em>' attribute is set.
     * @see #unsetShortPF()
     * @see #getShortPF()
     * @see #setShortPF(Float)
     * @generated
     */
    boolean isSetShortPF();

    /**
     * Returns the value of the '<em><b>Startup Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Startup Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Startup Cost</em>' attribute.
     * @see #isSetStartupCost()
     * @see #unsetStartupCost()
     * @see #setStartupCost(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_StartupCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.startupCost' kind='element'"
     * @generated
     */
    BigDecimal getStartupCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getStartupCost <em>Startup Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Startup Cost</em>' attribute.
     * @see #isSetStartupCost()
     * @see #unsetStartupCost()
     * @see #getStartupCost()
     * @generated
     */
    void setStartupCost( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getStartupCost <em>Startup Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartupCost()
     * @see #getStartupCost()
     * @see #setStartupCost(BigDecimal)
     * @generated
     */
    void unsetStartupCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getStartupCost <em>Startup Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Startup Cost</em>' attribute is set.
     * @see #unsetStartupCost()
     * @see #getStartupCost()
     * @see #setStartupCost(BigDecimal)
     * @generated
     */
    boolean isSetStartupCost();

    /**
     * Returns the value of the '<em><b>Startup Time</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Startup Time</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Startup Time</em>' attribute.
     * @see #isSetStartupTime()
     * @see #unsetStartupTime()
     * @see #setStartupTime(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_StartupTime()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.startupTime' kind='element'"
     * @generated
     */
    Float getStartupTime();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getStartupTime <em>Startup Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Startup Time</em>' attribute.
     * @see #isSetStartupTime()
     * @see #unsetStartupTime()
     * @see #getStartupTime()
     * @generated
     */
    void setStartupTime( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getStartupTime <em>Startup Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetStartupTime()
     * @see #getStartupTime()
     * @see #setStartupTime(Float)
     * @generated
     */
    void unsetStartupTime();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getStartupTime <em>Startup Time</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Startup Time</em>' attribute is set.
     * @see #unsetStartupTime()
     * @see #getStartupTime()
     * @see #setStartupTime(Float)
     * @generated
     */
    boolean isSetStartupTime();

    /**
     * Returns the value of the '<em><b>Tie Line PF</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Tie Line PF</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Tie Line PF</em>' attribute.
     * @see #isSetTieLinePF()
     * @see #unsetTieLinePF()
     * @see #setTieLinePF(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_TieLinePF()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.tieLinePF' kind='element'"
     * @generated
     */
    Float getTieLinePF();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getTieLinePF <em>Tie Line PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Tie Line PF</em>' attribute.
     * @see #isSetTieLinePF()
     * @see #unsetTieLinePF()
     * @see #getTieLinePF()
     * @generated
     */
    void setTieLinePF( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getTieLinePF <em>Tie Line PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTieLinePF()
     * @see #getTieLinePF()
     * @see #setTieLinePF(Float)
     * @generated
     */
    void unsetTieLinePF();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getTieLinePF <em>Tie Line PF</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Tie Line PF</em>' attribute is set.
     * @see #unsetTieLinePF()
     * @see #getTieLinePF()
     * @see #setTieLinePF(Float)
     * @generated
     */
    boolean isSetTieLinePF();

    /**
     * Returns the value of the '<em><b>Total Efficiency</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Total Efficiency</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Total Efficiency</em>' attribute.
     * @see #isSetTotalEfficiency()
     * @see #unsetTotalEfficiency()
     * @see #setTotalEfficiency(Float)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_TotalEfficiency()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.totalEfficiency' kind='element'"
     * @generated
     */
    Float getTotalEfficiency();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getTotalEfficiency <em>Total Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Total Efficiency</em>' attribute.
     * @see #isSetTotalEfficiency()
     * @see #unsetTotalEfficiency()
     * @see #getTotalEfficiency()
     * @generated
     */
    void setTotalEfficiency( Float value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getTotalEfficiency <em>Total Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetTotalEfficiency()
     * @see #getTotalEfficiency()
     * @see #setTotalEfficiency(Float)
     * @generated
     */
    void unsetTotalEfficiency();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getTotalEfficiency <em>Total Efficiency</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Total Efficiency</em>' attribute is set.
     * @see #unsetTotalEfficiency()
     * @see #getTotalEfficiency()
     * @see #setTotalEfficiency(Float)
     * @generated
     */
    boolean isSetTotalEfficiency();

    /**
     * Returns the value of the '<em><b>Variable Cost</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Variable Cost</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Variable Cost</em>' attribute.
     * @see #isSetVariableCost()
     * @see #unsetVariableCost()
     * @see #setVariableCost(BigDecimal)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_VariableCost()
     * @model unsettable="true"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.variableCost' kind='element'"
     * @generated
     */
    BigDecimal getVariableCost();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getVariableCost <em>Variable Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Variable Cost</em>' attribute.
     * @see #isSetVariableCost()
     * @see #unsetVariableCost()
     * @see #getVariableCost()
     * @generated
     */
    void setVariableCost( BigDecimal value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getVariableCost <em>Variable Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetVariableCost()
     * @see #getVariableCost()
     * @see #setVariableCost(BigDecimal)
     * @generated
     */
    void unsetVariableCost();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getVariableCost <em>Variable Cost</em>}' attribute is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Variable Cost</em>' attribute is set.
     * @see #unsetVariableCost()
     * @see #getVariableCost()
     * @see #setVariableCost(BigDecimal)
     * @generated
     */
    boolean isSetVariableCost();

    /**
     * Returns the value of the '<em><b>Rotating Machine</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachine}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachine#getGeneratingUnit <em>Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Rotating Machine</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Rotating Machine</em>' reference list.
     * @see #isSetRotatingMachine()
     * @see #unsetRotatingMachine()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_RotatingMachine()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachine#getGeneratingUnit
     * @model opposite="GeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.RotatingMachine' kind='element'"
     * @generated
     */
    EList< RotatingMachine > getRotatingMachine();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRotatingMachine <em>Rotating Machine</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetRotatingMachine()
     * @see #getRotatingMachine()
     * @generated
     */
    void unsetRotatingMachine();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getRotatingMachine <em>Rotating Machine</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Rotating Machine</em>' reference list is set.
     * @see #unsetRotatingMachine()
     * @see #getRotatingMachine()
     * @generated
     */
    boolean isSetRotatingMachine();

    /**
     * Returns the value of the '<em><b>Gross To Net Active Power Curves</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GrossToNetActivePowerCurve}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GrossToNetActivePowerCurve#getGeneratingUnit <em>Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gross To Net Active Power Curves</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gross To Net Active Power Curves</em>' reference list.
     * @see #isSetGrossToNetActivePowerCurves()
     * @see #unsetGrossToNetActivePowerCurves()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_GrossToNetActivePowerCurves()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GrossToNetActivePowerCurve#getGeneratingUnit
     * @model opposite="GeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.GrossToNetActivePowerCurves' kind='element'"
     * @generated
     */
    EList< GrossToNetActivePowerCurve > getGrossToNetActivePowerCurves();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGrossToNetActivePowerCurves()
     * @see #getGrossToNetActivePowerCurves()
     * @generated
     */
    void unsetGrossToNetActivePowerCurves();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gross To Net Active Power Curves</em>' reference list is set.
     * @see #unsetGrossToNetActivePowerCurves()
     * @see #getGrossToNetActivePowerCurves()
     * @generated
     */
    boolean isSetGrossToNetActivePowerCurves();

    /**
     * Returns the value of the '<em><b>Control Area Generating Unit</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlAreaGeneratingUnit}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlAreaGeneratingUnit#getGeneratingUnit <em>Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Control Area Generating Unit</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Control Area Generating Unit</em>' reference list.
     * @see #isSetControlAreaGeneratingUnit()
     * @see #unsetControlAreaGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_ControlAreaGeneratingUnit()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlAreaGeneratingUnit#getGeneratingUnit
     * @model opposite="GeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.ControlAreaGeneratingUnit' kind='element'"
     * @generated
     */
    EList< ControlAreaGeneratingUnit > getControlAreaGeneratingUnit();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetControlAreaGeneratingUnit()
     * @see #getControlAreaGeneratingUnit()
     * @generated
     */
    void unsetControlAreaGeneratingUnit();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Control Area Generating Unit</em>' reference list is set.
     * @see #unsetControlAreaGeneratingUnit()
     * @see #getControlAreaGeneratingUnit()
     * @generated
     */
    boolean isSetControlAreaGeneratingUnit();

    /**
     * Returns the value of the '<em><b>Gen Unit Op Cost Curves</b></em>' reference list.
     * The list contents are of type {@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenUnitOpCostCurve}.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenUnitOpCostCurve#getGeneratingUnit <em>Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gen Unit Op Cost Curves</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gen Unit Op Cost Curves</em>' reference list.
     * @see #isSetGenUnitOpCostCurves()
     * @see #unsetGenUnitOpCostCurves()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_GenUnitOpCostCurves()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenUnitOpCostCurve#getGeneratingUnit
     * @model opposite="GeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.GenUnitOpCostCurves' kind='element'"
     * @generated
     */
    EList< GenUnitOpCostCurve > getGenUnitOpCostCurves();

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenUnitOpCostCurves <em>Gen Unit Op Cost Curves</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGenUnitOpCostCurves()
     * @see #getGenUnitOpCostCurves()
     * @generated
     */
    void unsetGenUnitOpCostCurves();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenUnitOpCostCurves <em>Gen Unit Op Cost Curves</em>}' reference list is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gen Unit Op Cost Curves</em>' reference list is set.
     * @see #unsetGenUnitOpCostCurves()
     * @see #getGenUnitOpCostCurves()
     * @generated
     */
    boolean isSetGenUnitOpCostCurves();

    /**
     * Returns the value of the '<em><b>Gen Unit Op Schedule</b></em>' reference.
     * It is bidirectional and its opposite is '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenUnitOpSchedule#getGeneratingUnit <em>Generating Unit</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gen Unit Op Schedule</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gen Unit Op Schedule</em>' reference.
     * @see #isSetGenUnitOpSchedule()
     * @see #unsetGenUnitOpSchedule()
     * @see #setGenUnitOpSchedule(GenUnitOpSchedule)
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage#getGeneratingUnit_GenUnitOpSchedule()
     * @see fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenUnitOpSchedule#getGeneratingUnit
     * @model opposite="GeneratingUnit" unsettable="true" transient="true" ordered="false"
     *        extendedMetaData="namespace='http://iec.ch/TC57/2016/CIM-schema-cim17' name='GeneratingUnit.GenUnitOpSchedule' kind='element'"
     * @generated
     */
    GenUnitOpSchedule getGenUnitOpSchedule();

    /**
     * Sets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenUnitOpSchedule <em>Gen Unit Op Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Gen Unit Op Schedule</em>' reference.
     * @see #isSetGenUnitOpSchedule()
     * @see #unsetGenUnitOpSchedule()
     * @see #getGenUnitOpSchedule()
     * @generated
     */
    void setGenUnitOpSchedule( GenUnitOpSchedule value );

    /**
     * Unsets the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenUnitOpSchedule <em>Gen Unit Op Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isSetGenUnitOpSchedule()
     * @see #getGenUnitOpSchedule()
     * @see #setGenUnitOpSchedule(GenUnitOpSchedule)
     * @generated
     */
    void unsetGenUnitOpSchedule();

    /**
     * Returns whether the value of the '{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit#getGenUnitOpSchedule <em>Gen Unit Op Schedule</em>}' reference is set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return whether the value of the '<em>Gen Unit Op Schedule</em>' reference is set.
     * @see #unsetGenUnitOpSchedule()
     * @see #getGenUnitOpSchedule()
     * @see #setGenUnitOpSchedule(GenUnitOpSchedule)
     * @generated
     */
    boolean isSetGenUnitOpSchedule();

} // GeneratingUnit
