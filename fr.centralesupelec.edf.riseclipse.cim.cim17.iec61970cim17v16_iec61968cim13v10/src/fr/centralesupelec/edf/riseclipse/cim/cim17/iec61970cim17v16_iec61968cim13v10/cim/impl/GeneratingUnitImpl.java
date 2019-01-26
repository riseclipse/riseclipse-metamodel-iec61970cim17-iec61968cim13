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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ControlAreaGeneratingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenUnitOpCostCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GenUnitOpSchedule;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratingUnit;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratorControlMode;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GeneratorControlSource;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.GrossToNetActivePowerCurve;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.RotatingMachine;

import java.math.BigDecimal;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generating Unit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getAllocSpinResP <em>Alloc Spin Res P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getAutoCntrlMarginP <em>Auto Cntrl Margin P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getBaseP <em>Base P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getControlDeadband <em>Control Deadband</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getControlPulseHigh <em>Control Pulse High</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getControlPulseLow <em>Control Pulse Low</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getControlResponseRate <em>Control Response Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getGenControlMode <em>Gen Control Mode</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getGenControlSource <em>Gen Control Source</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getGovernorMPL <em>Governor MPL</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getGovernorSCD <em>Governor SCD</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getHighControlLimit <em>High Control Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getInitialP <em>Initial P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getLongPF <em>Long PF</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getLowControlLimit <em>Low Control Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getLowerRampRate <em>Lower Ramp Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getMaxEconomicP <em>Max Economic P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getMaximumAllowableSpinningReserve <em>Maximum Allowable Spinning Reserve</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getMaxOperatingP <em>Max Operating P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getMinEconomicP <em>Min Economic P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getMinimumOffTime <em>Minimum Off Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getMinOperatingP <em>Min Operating P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getModelDetail <em>Model Detail</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getNominalP <em>Nominal P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getNormalPF <em>Normal PF</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getPenaltyFactor <em>Penalty Factor</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getRaiseRampRate <em>Raise Ramp Rate</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getRatedGrossMaxP <em>Rated Gross Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getRatedGrossMinP <em>Rated Gross Min P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getRatedNetMaxP <em>Rated Net Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getShortPF <em>Short PF</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getStartupCost <em>Startup Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getStartupTime <em>Startup Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getTieLinePF <em>Tie Line PF</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getTotalEfficiency <em>Total Efficiency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getVariableCost <em>Variable Cost</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getRotatingMachine <em>Rotating Machine</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getGrossToNetActivePowerCurves <em>Gross To Net Active Power Curves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getControlAreaGeneratingUnit <em>Control Area Generating Unit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getGenUnitOpCostCurves <em>Gen Unit Op Cost Curves</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.GeneratingUnitImpl#getGenUnitOpSchedule <em>Gen Unit Op Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GeneratingUnitImpl extends EquipmentImpl implements GeneratingUnit {
    /**
     * The default value of the '{@link #getAllocSpinResP() <em>Alloc Spin Res P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAllocSpinResP()
     * @generated
     * @ordered
     */
    protected static final Float ALLOC_SPIN_RES_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAllocSpinResP() <em>Alloc Spin Res P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAllocSpinResP()
     * @generated
     * @ordered
     */
    protected Float allocSpinResP = ALLOC_SPIN_RES_P_EDEFAULT;

    /**
     * This is true if the Alloc Spin Res P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean allocSpinResPESet;

    /**
     * The default value of the '{@link #getAutoCntrlMarginP() <em>Auto Cntrl Margin P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAutoCntrlMarginP()
     * @generated
     * @ordered
     */
    protected static final Float AUTO_CNTRL_MARGIN_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getAutoCntrlMarginP() <em>Auto Cntrl Margin P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAutoCntrlMarginP()
     * @generated
     * @ordered
     */
    protected Float autoCntrlMarginP = AUTO_CNTRL_MARGIN_P_EDEFAULT;

    /**
     * This is true if the Auto Cntrl Margin P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean autoCntrlMarginPESet;

    /**
     * The default value of the '{@link #getBaseP() <em>Base P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseP()
     * @generated
     * @ordered
     */
    protected static final Float BASE_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBaseP() <em>Base P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBaseP()
     * @generated
     * @ordered
     */
    protected Float baseP = BASE_P_EDEFAULT;

    /**
     * This is true if the Base P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean basePESet;

    /**
     * The default value of the '{@link #getControlDeadband() <em>Control Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlDeadband()
     * @generated
     * @ordered
     */
    protected static final Float CONTROL_DEADBAND_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlDeadband() <em>Control Deadband</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlDeadband()
     * @generated
     * @ordered
     */
    protected Float controlDeadband = CONTROL_DEADBAND_EDEFAULT;

    /**
     * This is true if the Control Deadband attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlDeadbandESet;

    /**
     * The default value of the '{@link #getControlPulseHigh() <em>Control Pulse High</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlPulseHigh()
     * @generated
     * @ordered
     */
    protected static final Float CONTROL_PULSE_HIGH_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlPulseHigh() <em>Control Pulse High</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlPulseHigh()
     * @generated
     * @ordered
     */
    protected Float controlPulseHigh = CONTROL_PULSE_HIGH_EDEFAULT;

    /**
     * This is true if the Control Pulse High attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlPulseHighESet;

    /**
     * The default value of the '{@link #getControlPulseLow() <em>Control Pulse Low</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlPulseLow()
     * @generated
     * @ordered
     */
    protected static final Float CONTROL_PULSE_LOW_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlPulseLow() <em>Control Pulse Low</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlPulseLow()
     * @generated
     * @ordered
     */
    protected Float controlPulseLow = CONTROL_PULSE_LOW_EDEFAULT;

    /**
     * This is true if the Control Pulse Low attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlPulseLowESet;

    /**
     * The default value of the '{@link #getControlResponseRate() <em>Control Response Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlResponseRate()
     * @generated
     * @ordered
     */
    protected static final Float CONTROL_RESPONSE_RATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlResponseRate() <em>Control Response Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlResponseRate()
     * @generated
     * @ordered
     */
    protected Float controlResponseRate = CONTROL_RESPONSE_RATE_EDEFAULT;

    /**
     * This is true if the Control Response Rate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlResponseRateESet;

    /**
     * The default value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfficiency()
     * @generated
     * @ordered
     */
    protected static final Float EFFICIENCY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEfficiency() <em>Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEfficiency()
     * @generated
     * @ordered
     */
    protected Float efficiency = EFFICIENCY_EDEFAULT;

    /**
     * This is true if the Efficiency attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean efficiencyESet;

    /**
     * The default value of the '{@link #getGenControlMode() <em>Gen Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenControlMode()
     * @generated
     * @ordered
     */
    protected static final GeneratorControlMode GEN_CONTROL_MODE_EDEFAULT = GeneratorControlMode.SETPOINT;

    /**
     * The cached value of the '{@link #getGenControlMode() <em>Gen Control Mode</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenControlMode()
     * @generated
     * @ordered
     */
    protected GeneratorControlMode genControlMode = GEN_CONTROL_MODE_EDEFAULT;

    /**
     * This is true if the Gen Control Mode attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean genControlModeESet;

    /**
     * The default value of the '{@link #getGenControlSource() <em>Gen Control Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenControlSource()
     * @generated
     * @ordered
     */
    protected static final GeneratorControlSource GEN_CONTROL_SOURCE_EDEFAULT = GeneratorControlSource.UNAVAILABLE;

    /**
     * The cached value of the '{@link #getGenControlSource() <em>Gen Control Source</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenControlSource()
     * @generated
     * @ordered
     */
    protected GeneratorControlSource genControlSource = GEN_CONTROL_SOURCE_EDEFAULT;

    /**
     * This is true if the Gen Control Source attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean genControlSourceESet;

    /**
     * The default value of the '{@link #getGovernorMPL() <em>Governor MPL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGovernorMPL()
     * @generated
     * @ordered
     */
    protected static final Float GOVERNOR_MPL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGovernorMPL() <em>Governor MPL</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGovernorMPL()
     * @generated
     * @ordered
     */
    protected Float governorMPL = GOVERNOR_MPL_EDEFAULT;

    /**
     * This is true if the Governor MPL attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean governorMPLESet;

    /**
     * The default value of the '{@link #getGovernorSCD() <em>Governor SCD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGovernorSCD()
     * @generated
     * @ordered
     */
    protected static final Float GOVERNOR_SCD_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGovernorSCD() <em>Governor SCD</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGovernorSCD()
     * @generated
     * @ordered
     */
    protected Float governorSCD = GOVERNOR_SCD_EDEFAULT;

    /**
     * This is true if the Governor SCD attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean governorSCDESet;

    /**
     * The default value of the '{@link #getHighControlLimit() <em>High Control Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighControlLimit()
     * @generated
     * @ordered
     */
    protected static final Float HIGH_CONTROL_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHighControlLimit() <em>High Control Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighControlLimit()
     * @generated
     * @ordered
     */
    protected Float highControlLimit = HIGH_CONTROL_LIMIT_EDEFAULT;

    /**
     * This is true if the High Control Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean highControlLimitESet;

    /**
     * The default value of the '{@link #getInitialP() <em>Initial P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialP()
     * @generated
     * @ordered
     */
    protected static final Float INITIAL_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInitialP() <em>Initial P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialP()
     * @generated
     * @ordered
     */
    protected Float initialP = INITIAL_P_EDEFAULT;

    /**
     * This is true if the Initial P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean initialPESet;

    /**
     * The default value of the '{@link #getLongPF() <em>Long PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLongPF()
     * @generated
     * @ordered
     */
    protected static final Float LONG_PF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLongPF() <em>Long PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLongPF()
     * @generated
     * @ordered
     */
    protected Float longPF = LONG_PF_EDEFAULT;

    /**
     * This is true if the Long PF attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean longPFESet;

    /**
     * The default value of the '{@link #getLowControlLimit() <em>Low Control Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowControlLimit()
     * @generated
     * @ordered
     */
    protected static final Float LOW_CONTROL_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLowControlLimit() <em>Low Control Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowControlLimit()
     * @generated
     * @ordered
     */
    protected Float lowControlLimit = LOW_CONTROL_LIMIT_EDEFAULT;

    /**
     * This is true if the Low Control Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lowControlLimitESet;

    /**
     * The default value of the '{@link #getLowerRampRate() <em>Lower Ramp Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowerRampRate()
     * @generated
     * @ordered
     */
    protected static final Float LOWER_RAMP_RATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLowerRampRate() <em>Lower Ramp Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowerRampRate()
     * @generated
     * @ordered
     */
    protected Float lowerRampRate = LOWER_RAMP_RATE_EDEFAULT;

    /**
     * This is true if the Lower Ramp Rate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lowerRampRateESet;

    /**
     * The default value of the '{@link #getMaxEconomicP() <em>Max Economic P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxEconomicP()
     * @generated
     * @ordered
     */
    protected static final Float MAX_ECONOMIC_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxEconomicP() <em>Max Economic P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxEconomicP()
     * @generated
     * @ordered
     */
    protected Float maxEconomicP = MAX_ECONOMIC_P_EDEFAULT;

    /**
     * This is true if the Max Economic P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxEconomicPESet;

    /**
     * The default value of the '{@link #getMaximumAllowableSpinningReserve() <em>Maximum Allowable Spinning Reserve</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumAllowableSpinningReserve()
     * @generated
     * @ordered
     */
    protected static final Float MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaximumAllowableSpinningReserve() <em>Maximum Allowable Spinning Reserve</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaximumAllowableSpinningReserve()
     * @generated
     * @ordered
     */
    protected Float maximumAllowableSpinningReserve = MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT;

    /**
     * This is true if the Maximum Allowable Spinning Reserve attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maximumAllowableSpinningReserveESet;

    /**
     * The default value of the '{@link #getMaxOperatingP() <em>Max Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxOperatingP()
     * @generated
     * @ordered
     */
    protected static final Float MAX_OPERATING_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxOperatingP() <em>Max Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxOperatingP()
     * @generated
     * @ordered
     */
    protected Float maxOperatingP = MAX_OPERATING_P_EDEFAULT;

    /**
     * This is true if the Max Operating P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxOperatingPESet;

    /**
     * The default value of the '{@link #getMinEconomicP() <em>Min Economic P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinEconomicP()
     * @generated
     * @ordered
     */
    protected static final Float MIN_ECONOMIC_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinEconomicP() <em>Min Economic P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinEconomicP()
     * @generated
     * @ordered
     */
    protected Float minEconomicP = MIN_ECONOMIC_P_EDEFAULT;

    /**
     * This is true if the Min Economic P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minEconomicPESet;

    /**
     * The default value of the '{@link #getMinimumOffTime() <em>Minimum Off Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumOffTime()
     * @generated
     * @ordered
     */
    protected static final Float MINIMUM_OFF_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinimumOffTime() <em>Minimum Off Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinimumOffTime()
     * @generated
     * @ordered
     */
    protected Float minimumOffTime = MINIMUM_OFF_TIME_EDEFAULT;

    /**
     * This is true if the Minimum Off Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minimumOffTimeESet;

    /**
     * The default value of the '{@link #getMinOperatingP() <em>Min Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinOperatingP()
     * @generated
     * @ordered
     */
    protected static final Float MIN_OPERATING_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinOperatingP() <em>Min Operating P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinOperatingP()
     * @generated
     * @ordered
     */
    protected Float minOperatingP = MIN_OPERATING_P_EDEFAULT;

    /**
     * This is true if the Min Operating P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minOperatingPESet;

    /**
     * The default value of the '{@link #getModelDetail() <em>Model Detail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelDetail()
     * @generated
     * @ordered
     */
    protected static final Integer MODEL_DETAIL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getModelDetail() <em>Model Detail</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getModelDetail()
     * @generated
     * @ordered
     */
    protected Integer modelDetail = MODEL_DETAIL_EDEFAULT;

    /**
     * This is true if the Model Detail attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean modelDetailESet;

    /**
     * The default value of the '{@link #getNominalP() <em>Nominal P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalP()
     * @generated
     * @ordered
     */
    protected static final Float NOMINAL_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNominalP() <em>Nominal P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalP()
     * @generated
     * @ordered
     */
    protected Float nominalP = NOMINAL_P_EDEFAULT;

    /**
     * This is true if the Nominal P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nominalPESet;

    /**
     * The default value of the '{@link #getNormalPF() <em>Normal PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalPF()
     * @generated
     * @ordered
     */
    protected static final Float NORMAL_PF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNormalPF() <em>Normal PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalPF()
     * @generated
     * @ordered
     */
    protected Float normalPF = NORMAL_PF_EDEFAULT;

    /**
     * This is true if the Normal PF attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean normalPFESet;

    /**
     * The default value of the '{@link #getPenaltyFactor() <em>Penalty Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPenaltyFactor()
     * @generated
     * @ordered
     */
    protected static final Float PENALTY_FACTOR_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPenaltyFactor() <em>Penalty Factor</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPenaltyFactor()
     * @generated
     * @ordered
     */
    protected Float penaltyFactor = PENALTY_FACTOR_EDEFAULT;

    /**
     * This is true if the Penalty Factor attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean penaltyFactorESet;

    /**
     * The default value of the '{@link #getRaiseRampRate() <em>Raise Ramp Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRaiseRampRate()
     * @generated
     * @ordered
     */
    protected static final Float RAISE_RAMP_RATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRaiseRampRate() <em>Raise Ramp Rate</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRaiseRampRate()
     * @generated
     * @ordered
     */
    protected Float raiseRampRate = RAISE_RAMP_RATE_EDEFAULT;

    /**
     * This is true if the Raise Ramp Rate attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean raiseRampRateESet;

    /**
     * The default value of the '{@link #getRatedGrossMaxP() <em>Rated Gross Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedGrossMaxP()
     * @generated
     * @ordered
     */
    protected static final Float RATED_GROSS_MAX_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedGrossMaxP() <em>Rated Gross Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedGrossMaxP()
     * @generated
     * @ordered
     */
    protected Float ratedGrossMaxP = RATED_GROSS_MAX_P_EDEFAULT;

    /**
     * This is true if the Rated Gross Max P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedGrossMaxPESet;

    /**
     * The default value of the '{@link #getRatedGrossMinP() <em>Rated Gross Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedGrossMinP()
     * @generated
     * @ordered
     */
    protected static final Float RATED_GROSS_MIN_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedGrossMinP() <em>Rated Gross Min P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedGrossMinP()
     * @generated
     * @ordered
     */
    protected Float ratedGrossMinP = RATED_GROSS_MIN_P_EDEFAULT;

    /**
     * This is true if the Rated Gross Min P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedGrossMinPESet;

    /**
     * The default value of the '{@link #getRatedNetMaxP() <em>Rated Net Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedNetMaxP()
     * @generated
     * @ordered
     */
    protected static final Float RATED_NET_MAX_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedNetMaxP() <em>Rated Net Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedNetMaxP()
     * @generated
     * @ordered
     */
    protected Float ratedNetMaxP = RATED_NET_MAX_P_EDEFAULT;

    /**
     * This is true if the Rated Net Max P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedNetMaxPESet;

    /**
     * The default value of the '{@link #getShortPF() <em>Short PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortPF()
     * @generated
     * @ordered
     */
    protected static final Float SHORT_PF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getShortPF() <em>Short PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getShortPF()
     * @generated
     * @ordered
     */
    protected Float shortPF = SHORT_PF_EDEFAULT;

    /**
     * This is true if the Short PF attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean shortPFESet;

    /**
     * The default value of the '{@link #getStartupCost() <em>Startup Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupCost()
     * @generated
     * @ordered
     */
    protected static final BigDecimal STARTUP_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartupCost() <em>Startup Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupCost()
     * @generated
     * @ordered
     */
    protected BigDecimal startupCost = STARTUP_COST_EDEFAULT;

    /**
     * This is true if the Startup Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startupCostESet;

    /**
     * The default value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupTime()
     * @generated
     * @ordered
     */
    protected static final Float STARTUP_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartupTime() <em>Startup Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartupTime()
     * @generated
     * @ordered
     */
    protected Float startupTime = STARTUP_TIME_EDEFAULT;

    /**
     * This is true if the Startup Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startupTimeESet;

    /**
     * The default value of the '{@link #getTieLinePF() <em>Tie Line PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTieLinePF()
     * @generated
     * @ordered
     */
    protected static final Float TIE_LINE_PF_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTieLinePF() <em>Tie Line PF</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTieLinePF()
     * @generated
     * @ordered
     */
    protected Float tieLinePF = TIE_LINE_PF_EDEFAULT;

    /**
     * This is true if the Tie Line PF attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tieLinePFESet;

    /**
     * The default value of the '{@link #getTotalEfficiency() <em>Total Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTotalEfficiency()
     * @generated
     * @ordered
     */
    protected static final Float TOTAL_EFFICIENCY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTotalEfficiency() <em>Total Efficiency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTotalEfficiency()
     * @generated
     * @ordered
     */
    protected Float totalEfficiency = TOTAL_EFFICIENCY_EDEFAULT;

    /**
     * This is true if the Total Efficiency attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean totalEfficiencyESet;

    /**
     * The default value of the '{@link #getVariableCost() <em>Variable Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariableCost()
     * @generated
     * @ordered
     */
    protected static final BigDecimal VARIABLE_COST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVariableCost() <em>Variable Cost</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVariableCost()
     * @generated
     * @ordered
     */
    protected BigDecimal variableCost = VARIABLE_COST_EDEFAULT;

    /**
     * This is true if the Variable Cost attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean variableCostESet;

    /**
     * The cached value of the '{@link #getRotatingMachine() <em>Rotating Machine</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRotatingMachine()
     * @generated
     * @ordered
     */
    protected EList< RotatingMachine > rotatingMachine;

    /**
     * The cached value of the '{@link #getGrossToNetActivePowerCurves() <em>Gross To Net Active Power Curves</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGrossToNetActivePowerCurves()
     * @generated
     * @ordered
     */
    protected EList< GrossToNetActivePowerCurve > grossToNetActivePowerCurves;

    /**
     * The cached value of the '{@link #getControlAreaGeneratingUnit() <em>Control Area Generating Unit</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlAreaGeneratingUnit()
     * @generated
     * @ordered
     */
    protected EList< ControlAreaGeneratingUnit > controlAreaGeneratingUnit;

    /**
     * The cached value of the '{@link #getGenUnitOpCostCurves() <em>Gen Unit Op Cost Curves</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenUnitOpCostCurves()
     * @generated
     * @ordered
     */
    protected EList< GenUnitOpCostCurve > genUnitOpCostCurves;

    /**
     * The cached value of the '{@link #getGenUnitOpSchedule() <em>Gen Unit Op Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGenUnitOpSchedule()
     * @generated
     * @ordered
     */
    protected GenUnitOpSchedule genUnitOpSchedule;

    /**
     * This is true if the Gen Unit Op Schedule reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean genUnitOpScheduleESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected GeneratingUnitImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getGeneratingUnit();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAllocSpinResP() {
        return allocSpinResP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAllocSpinResP( Float newAllocSpinResP ) {
        Float oldAllocSpinResP = allocSpinResP;
        allocSpinResP = newAllocSpinResP;
        boolean oldAllocSpinResPESet = allocSpinResPESet;
        allocSpinResPESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P,
                    oldAllocSpinResP, allocSpinResP, !oldAllocSpinResPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAllocSpinResP() {
        Float oldAllocSpinResP = allocSpinResP;
        boolean oldAllocSpinResPESet = allocSpinResPESet;
        allocSpinResP = ALLOC_SPIN_RES_P_EDEFAULT;
        allocSpinResPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P,
                    oldAllocSpinResP, ALLOC_SPIN_RES_P_EDEFAULT, oldAllocSpinResPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAllocSpinResP() {
        return allocSpinResPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getAutoCntrlMarginP() {
        return autoCntrlMarginP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAutoCntrlMarginP( Float newAutoCntrlMarginP ) {
        Float oldAutoCntrlMarginP = autoCntrlMarginP;
        autoCntrlMarginP = newAutoCntrlMarginP;
        boolean oldAutoCntrlMarginPESet = autoCntrlMarginPESet;
        autoCntrlMarginPESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P,
                    oldAutoCntrlMarginP, autoCntrlMarginP, !oldAutoCntrlMarginPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAutoCntrlMarginP() {
        Float oldAutoCntrlMarginP = autoCntrlMarginP;
        boolean oldAutoCntrlMarginPESet = autoCntrlMarginPESet;
        autoCntrlMarginP = AUTO_CNTRL_MARGIN_P_EDEFAULT;
        autoCntrlMarginPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P,
                    oldAutoCntrlMarginP, AUTO_CNTRL_MARGIN_P_EDEFAULT, oldAutoCntrlMarginPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAutoCntrlMarginP() {
        return autoCntrlMarginPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBaseP() {
        return baseP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBaseP( Float newBaseP ) {
        Float oldBaseP = baseP;
        baseP = newBaseP;
        boolean oldBasePESet = basePESet;
        basePESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__BASE_P, oldBaseP, baseP, !oldBasePESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBaseP() {
        Float oldBaseP = baseP;
        boolean oldBasePESet = basePESet;
        baseP = BASE_P_EDEFAULT;
        basePESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GENERATING_UNIT__BASE_P, oldBaseP, BASE_P_EDEFAULT, oldBasePESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBaseP() {
        return basePESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getControlDeadband() {
        return controlDeadband;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlDeadband( Float newControlDeadband ) {
        Float oldControlDeadband = controlDeadband;
        controlDeadband = newControlDeadband;
        boolean oldControlDeadbandESet = controlDeadbandESet;
        controlDeadbandESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__CONTROL_DEADBAND,
                    oldControlDeadband, controlDeadband, !oldControlDeadbandESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlDeadband() {
        Float oldControlDeadband = controlDeadband;
        boolean oldControlDeadbandESet = controlDeadbandESet;
        controlDeadband = CONTROL_DEADBAND_EDEFAULT;
        controlDeadbandESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__CONTROL_DEADBAND,
                    oldControlDeadband, CONTROL_DEADBAND_EDEFAULT, oldControlDeadbandESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlDeadband() {
        return controlDeadbandESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getControlPulseHigh() {
        return controlPulseHigh;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlPulseHigh( Float newControlPulseHigh ) {
        Float oldControlPulseHigh = controlPulseHigh;
        controlPulseHigh = newControlPulseHigh;
        boolean oldControlPulseHighESet = controlPulseHighESet;
        controlPulseHighESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH,
                    oldControlPulseHigh, controlPulseHigh, !oldControlPulseHighESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlPulseHigh() {
        Float oldControlPulseHigh = controlPulseHigh;
        boolean oldControlPulseHighESet = controlPulseHighESet;
        controlPulseHigh = CONTROL_PULSE_HIGH_EDEFAULT;
        controlPulseHighESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH,
                    oldControlPulseHigh, CONTROL_PULSE_HIGH_EDEFAULT, oldControlPulseHighESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlPulseHigh() {
        return controlPulseHighESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getControlPulseLow() {
        return controlPulseLow;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlPulseLow( Float newControlPulseLow ) {
        Float oldControlPulseLow = controlPulseLow;
        controlPulseLow = newControlPulseLow;
        boolean oldControlPulseLowESet = controlPulseLowESet;
        controlPulseLowESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__CONTROL_PULSE_LOW,
                    oldControlPulseLow, controlPulseLow, !oldControlPulseLowESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlPulseLow() {
        Float oldControlPulseLow = controlPulseLow;
        boolean oldControlPulseLowESet = controlPulseLowESet;
        controlPulseLow = CONTROL_PULSE_LOW_EDEFAULT;
        controlPulseLowESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__CONTROL_PULSE_LOW,
                    oldControlPulseLow, CONTROL_PULSE_LOW_EDEFAULT, oldControlPulseLowESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlPulseLow() {
        return controlPulseLowESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getControlResponseRate() {
        return controlResponseRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlResponseRate( Float newControlResponseRate ) {
        Float oldControlResponseRate = controlResponseRate;
        controlResponseRate = newControlResponseRate;
        boolean oldControlResponseRateESet = controlResponseRateESet;
        controlResponseRateESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE,
                    oldControlResponseRate, controlResponseRate, !oldControlResponseRateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlResponseRate() {
        Float oldControlResponseRate = controlResponseRate;
        boolean oldControlResponseRateESet = controlResponseRateESet;
        controlResponseRate = CONTROL_RESPONSE_RATE_EDEFAULT;
        controlResponseRateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE,
                    oldControlResponseRate, CONTROL_RESPONSE_RATE_EDEFAULT, oldControlResponseRateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlResponseRate() {
        return controlResponseRateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getEfficiency() {
        return efficiency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEfficiency( Float newEfficiency ) {
        Float oldEfficiency = efficiency;
        efficiency = newEfficiency;
        boolean oldEfficiencyESet = efficiencyESet;
        efficiencyESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__EFFICIENCY, oldEfficiency, efficiency, !oldEfficiencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEfficiency() {
        Float oldEfficiency = efficiency;
        boolean oldEfficiencyESet = efficiencyESet;
        efficiency = EFFICIENCY_EDEFAULT;
        efficiencyESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GENERATING_UNIT__EFFICIENCY, oldEfficiency, EFFICIENCY_EDEFAULT, oldEfficiencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEfficiency() {
        return efficiencyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeneratorControlMode getGenControlMode() {
        return genControlMode;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGenControlMode( GeneratorControlMode newGenControlMode ) {
        GeneratorControlMode oldGenControlMode = genControlMode;
        genControlMode = newGenControlMode == null ? GEN_CONTROL_MODE_EDEFAULT : newGenControlMode;
        boolean oldGenControlModeESet = genControlModeESet;
        genControlModeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__GEN_CONTROL_MODE,
                    oldGenControlMode, genControlMode, !oldGenControlModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGenControlMode() {
        GeneratorControlMode oldGenControlMode = genControlMode;
        boolean oldGenControlModeESet = genControlModeESet;
        genControlMode = GEN_CONTROL_MODE_EDEFAULT;
        genControlModeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__GEN_CONTROL_MODE,
                    oldGenControlMode, GEN_CONTROL_MODE_EDEFAULT, oldGenControlModeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGenControlMode() {
        return genControlModeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GeneratorControlSource getGenControlSource() {
        return genControlSource;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGenControlSource( GeneratorControlSource newGenControlSource ) {
        GeneratorControlSource oldGenControlSource = genControlSource;
        genControlSource = newGenControlSource == null ? GEN_CONTROL_SOURCE_EDEFAULT : newGenControlSource;
        boolean oldGenControlSourceESet = genControlSourceESet;
        genControlSourceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE,
                    oldGenControlSource, genControlSource, !oldGenControlSourceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGenControlSource() {
        GeneratorControlSource oldGenControlSource = genControlSource;
        boolean oldGenControlSourceESet = genControlSourceESet;
        genControlSource = GEN_CONTROL_SOURCE_EDEFAULT;
        genControlSourceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE,
                    oldGenControlSource, GEN_CONTROL_SOURCE_EDEFAULT, oldGenControlSourceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGenControlSource() {
        return genControlSourceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGovernorMPL() {
        return governorMPL;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGovernorMPL( Float newGovernorMPL ) {
        Float oldGovernorMPL = governorMPL;
        governorMPL = newGovernorMPL;
        boolean oldGovernorMPLESet = governorMPLESet;
        governorMPLESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__GOVERNOR_MPL, oldGovernorMPL, governorMPL, !oldGovernorMPLESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGovernorMPL() {
        Float oldGovernorMPL = governorMPL;
        boolean oldGovernorMPLESet = governorMPLESet;
        governorMPL = GOVERNOR_MPL_EDEFAULT;
        governorMPLESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GENERATING_UNIT__GOVERNOR_MPL, oldGovernorMPL, GOVERNOR_MPL_EDEFAULT, oldGovernorMPLESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGovernorMPL() {
        return governorMPLESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGovernorSCD() {
        return governorSCD;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGovernorSCD( Float newGovernorSCD ) {
        Float oldGovernorSCD = governorSCD;
        governorSCD = newGovernorSCD;
        boolean oldGovernorSCDESet = governorSCDESet;
        governorSCDESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__GOVERNOR_SCD, oldGovernorSCD, governorSCD, !oldGovernorSCDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGovernorSCD() {
        Float oldGovernorSCD = governorSCD;
        boolean oldGovernorSCDESet = governorSCDESet;
        governorSCD = GOVERNOR_SCD_EDEFAULT;
        governorSCDESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GENERATING_UNIT__GOVERNOR_SCD, oldGovernorSCD, GOVERNOR_SCD_EDEFAULT, oldGovernorSCDESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGovernorSCD() {
        return governorSCDESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHighControlLimit() {
        return highControlLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHighControlLimit( Float newHighControlLimit ) {
        Float oldHighControlLimit = highControlLimit;
        highControlLimit = newHighControlLimit;
        boolean oldHighControlLimitESet = highControlLimitESet;
        highControlLimitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT,
                    oldHighControlLimit, highControlLimit, !oldHighControlLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHighControlLimit() {
        Float oldHighControlLimit = highControlLimit;
        boolean oldHighControlLimitESet = highControlLimitESet;
        highControlLimit = HIGH_CONTROL_LIMIT_EDEFAULT;
        highControlLimitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT,
                    oldHighControlLimit, HIGH_CONTROL_LIMIT_EDEFAULT, oldHighControlLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHighControlLimit() {
        return highControlLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getInitialP() {
        return initialP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInitialP( Float newInitialP ) {
        Float oldInitialP = initialP;
        initialP = newInitialP;
        boolean oldInitialPESet = initialPESet;
        initialPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__INITIAL_P, oldInitialP, initialP, !oldInitialPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInitialP() {
        Float oldInitialP = initialP;
        boolean oldInitialPESet = initialPESet;
        initialP = INITIAL_P_EDEFAULT;
        initialPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GENERATING_UNIT__INITIAL_P, oldInitialP, INITIAL_P_EDEFAULT, oldInitialPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInitialP() {
        return initialPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLongPF() {
        return longPF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLongPF( Float newLongPF ) {
        Float oldLongPF = longPF;
        longPF = newLongPF;
        boolean oldLongPFESet = longPFESet;
        longPFESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__LONG_PF, oldLongPF, longPF, !oldLongPFESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLongPF() {
        Float oldLongPF = longPF;
        boolean oldLongPFESet = longPFESet;
        longPF = LONG_PF_EDEFAULT;
        longPFESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GENERATING_UNIT__LONG_PF, oldLongPF, LONG_PF_EDEFAULT, oldLongPFESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLongPF() {
        return longPFESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLowControlLimit() {
        return lowControlLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLowControlLimit( Float newLowControlLimit ) {
        Float oldLowControlLimit = lowControlLimit;
        lowControlLimit = newLowControlLimit;
        boolean oldLowControlLimitESet = lowControlLimitESet;
        lowControlLimitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT,
                    oldLowControlLimit, lowControlLimit, !oldLowControlLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLowControlLimit() {
        Float oldLowControlLimit = lowControlLimit;
        boolean oldLowControlLimitESet = lowControlLimitESet;
        lowControlLimit = LOW_CONTROL_LIMIT_EDEFAULT;
        lowControlLimitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT,
                    oldLowControlLimit, LOW_CONTROL_LIMIT_EDEFAULT, oldLowControlLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLowControlLimit() {
        return lowControlLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLowerRampRate() {
        return lowerRampRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLowerRampRate( Float newLowerRampRate ) {
        Float oldLowerRampRate = lowerRampRate;
        lowerRampRate = newLowerRampRate;
        boolean oldLowerRampRateESet = lowerRampRateESet;
        lowerRampRateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__LOWER_RAMP_RATE, oldLowerRampRate, lowerRampRate, !oldLowerRampRateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLowerRampRate() {
        Float oldLowerRampRate = lowerRampRate;
        boolean oldLowerRampRateESet = lowerRampRateESet;
        lowerRampRate = LOWER_RAMP_RATE_EDEFAULT;
        lowerRampRateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__LOWER_RAMP_RATE,
                    oldLowerRampRate, LOWER_RAMP_RATE_EDEFAULT, oldLowerRampRateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLowerRampRate() {
        return lowerRampRateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxEconomicP() {
        return maxEconomicP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxEconomicP( Float newMaxEconomicP ) {
        Float oldMaxEconomicP = maxEconomicP;
        maxEconomicP = newMaxEconomicP;
        boolean oldMaxEconomicPESet = maxEconomicPESet;
        maxEconomicPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__MAX_ECONOMIC_P, oldMaxEconomicP, maxEconomicP, !oldMaxEconomicPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxEconomicP() {
        Float oldMaxEconomicP = maxEconomicP;
        boolean oldMaxEconomicPESet = maxEconomicPESet;
        maxEconomicP = MAX_ECONOMIC_P_EDEFAULT;
        maxEconomicPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__MAX_ECONOMIC_P,
                    oldMaxEconomicP, MAX_ECONOMIC_P_EDEFAULT, oldMaxEconomicPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxEconomicP() {
        return maxEconomicPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaximumAllowableSpinningReserve() {
        return maximumAllowableSpinningReserve;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaximumAllowableSpinningReserve( Float newMaximumAllowableSpinningReserve ) {
        Float oldMaximumAllowableSpinningReserve = maximumAllowableSpinningReserve;
        maximumAllowableSpinningReserve = newMaximumAllowableSpinningReserve;
        boolean oldMaximumAllowableSpinningReserveESet = maximumAllowableSpinningReserveESet;
        maximumAllowableSpinningReserveESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE, oldMaximumAllowableSpinningReserve,
                maximumAllowableSpinningReserve, !oldMaximumAllowableSpinningReserveESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaximumAllowableSpinningReserve() {
        Float oldMaximumAllowableSpinningReserve = maximumAllowableSpinningReserve;
        boolean oldMaximumAllowableSpinningReserveESet = maximumAllowableSpinningReserveESet;
        maximumAllowableSpinningReserve = MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT;
        maximumAllowableSpinningReserveESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE, oldMaximumAllowableSpinningReserve,
                MAXIMUM_ALLOWABLE_SPINNING_RESERVE_EDEFAULT, oldMaximumAllowableSpinningReserveESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaximumAllowableSpinningReserve() {
        return maximumAllowableSpinningReserveESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxOperatingP() {
        return maxOperatingP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxOperatingP( Float newMaxOperatingP ) {
        Float oldMaxOperatingP = maxOperatingP;
        maxOperatingP = newMaxOperatingP;
        boolean oldMaxOperatingPESet = maxOperatingPESet;
        maxOperatingPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__MAX_OPERATING_P, oldMaxOperatingP, maxOperatingP, !oldMaxOperatingPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxOperatingP() {
        Float oldMaxOperatingP = maxOperatingP;
        boolean oldMaxOperatingPESet = maxOperatingPESet;
        maxOperatingP = MAX_OPERATING_P_EDEFAULT;
        maxOperatingPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__MAX_OPERATING_P,
                    oldMaxOperatingP, MAX_OPERATING_P_EDEFAULT, oldMaxOperatingPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxOperatingP() {
        return maxOperatingPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinEconomicP() {
        return minEconomicP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinEconomicP( Float newMinEconomicP ) {
        Float oldMinEconomicP = minEconomicP;
        minEconomicP = newMinEconomicP;
        boolean oldMinEconomicPESet = minEconomicPESet;
        minEconomicPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__MIN_ECONOMIC_P, oldMinEconomicP, minEconomicP, !oldMinEconomicPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinEconomicP() {
        Float oldMinEconomicP = minEconomicP;
        boolean oldMinEconomicPESet = minEconomicPESet;
        minEconomicP = MIN_ECONOMIC_P_EDEFAULT;
        minEconomicPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__MIN_ECONOMIC_P,
                    oldMinEconomicP, MIN_ECONOMIC_P_EDEFAULT, oldMinEconomicPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinEconomicP() {
        return minEconomicPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinimumOffTime() {
        return minimumOffTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinimumOffTime( Float newMinimumOffTime ) {
        Float oldMinimumOffTime = minimumOffTime;
        minimumOffTime = newMinimumOffTime;
        boolean oldMinimumOffTimeESet = minimumOffTimeESet;
        minimumOffTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__MINIMUM_OFF_TIME,
                    oldMinimumOffTime, minimumOffTime, !oldMinimumOffTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinimumOffTime() {
        Float oldMinimumOffTime = minimumOffTime;
        boolean oldMinimumOffTimeESet = minimumOffTimeESet;
        minimumOffTime = MINIMUM_OFF_TIME_EDEFAULT;
        minimumOffTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__MINIMUM_OFF_TIME,
                    oldMinimumOffTime, MINIMUM_OFF_TIME_EDEFAULT, oldMinimumOffTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinimumOffTime() {
        return minimumOffTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinOperatingP() {
        return minOperatingP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinOperatingP( Float newMinOperatingP ) {
        Float oldMinOperatingP = minOperatingP;
        minOperatingP = newMinOperatingP;
        boolean oldMinOperatingPESet = minOperatingPESet;
        minOperatingPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__MIN_OPERATING_P, oldMinOperatingP, minOperatingP, !oldMinOperatingPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinOperatingP() {
        Float oldMinOperatingP = minOperatingP;
        boolean oldMinOperatingPESet = minOperatingPESet;
        minOperatingP = MIN_OPERATING_P_EDEFAULT;
        minOperatingPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__MIN_OPERATING_P,
                    oldMinOperatingP, MIN_OPERATING_P_EDEFAULT, oldMinOperatingPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinOperatingP() {
        return minOperatingPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getModelDetail() {
        return modelDetail;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setModelDetail( Integer newModelDetail ) {
        Integer oldModelDetail = modelDetail;
        modelDetail = newModelDetail;
        boolean oldModelDetailESet = modelDetailESet;
        modelDetailESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__MODEL_DETAIL, oldModelDetail, modelDetail, !oldModelDetailESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetModelDetail() {
        Integer oldModelDetail = modelDetail;
        boolean oldModelDetailESet = modelDetailESet;
        modelDetail = MODEL_DETAIL_EDEFAULT;
        modelDetailESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GENERATING_UNIT__MODEL_DETAIL, oldModelDetail, MODEL_DETAIL_EDEFAULT, oldModelDetailESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetModelDetail() {
        return modelDetailESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNominalP() {
        return nominalP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNominalP( Float newNominalP ) {
        Float oldNominalP = nominalP;
        nominalP = newNominalP;
        boolean oldNominalPESet = nominalPESet;
        nominalPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__NOMINAL_P, oldNominalP, nominalP, !oldNominalPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNominalP() {
        Float oldNominalP = nominalP;
        boolean oldNominalPESet = nominalPESet;
        nominalP = NOMINAL_P_EDEFAULT;
        nominalPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GENERATING_UNIT__NOMINAL_P, oldNominalP, NOMINAL_P_EDEFAULT, oldNominalPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNominalP() {
        return nominalPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNormalPF() {
        return normalPF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNormalPF( Float newNormalPF ) {
        Float oldNormalPF = normalPF;
        normalPF = newNormalPF;
        boolean oldNormalPFESet = normalPFESet;
        normalPFESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__NORMAL_PF, oldNormalPF, normalPF, !oldNormalPFESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNormalPF() {
        Float oldNormalPF = normalPF;
        boolean oldNormalPFESet = normalPFESet;
        normalPF = NORMAL_PF_EDEFAULT;
        normalPFESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GENERATING_UNIT__NORMAL_PF, oldNormalPF, NORMAL_PF_EDEFAULT, oldNormalPFESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNormalPF() {
        return normalPFESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPenaltyFactor() {
        return penaltyFactor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPenaltyFactor( Float newPenaltyFactor ) {
        Float oldPenaltyFactor = penaltyFactor;
        penaltyFactor = newPenaltyFactor;
        boolean oldPenaltyFactorESet = penaltyFactorESet;
        penaltyFactorESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__PENALTY_FACTOR, oldPenaltyFactor, penaltyFactor, !oldPenaltyFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPenaltyFactor() {
        Float oldPenaltyFactor = penaltyFactor;
        boolean oldPenaltyFactorESet = penaltyFactorESet;
        penaltyFactor = PENALTY_FACTOR_EDEFAULT;
        penaltyFactorESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__PENALTY_FACTOR,
                    oldPenaltyFactor, PENALTY_FACTOR_EDEFAULT, oldPenaltyFactorESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPenaltyFactor() {
        return penaltyFactorESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRaiseRampRate() {
        return raiseRampRate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRaiseRampRate( Float newRaiseRampRate ) {
        Float oldRaiseRampRate = raiseRampRate;
        raiseRampRate = newRaiseRampRate;
        boolean oldRaiseRampRateESet = raiseRampRateESet;
        raiseRampRateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__RAISE_RAMP_RATE, oldRaiseRampRate, raiseRampRate, !oldRaiseRampRateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRaiseRampRate() {
        Float oldRaiseRampRate = raiseRampRate;
        boolean oldRaiseRampRateESet = raiseRampRateESet;
        raiseRampRate = RAISE_RAMP_RATE_EDEFAULT;
        raiseRampRateESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__RAISE_RAMP_RATE,
                    oldRaiseRampRate, RAISE_RAMP_RATE_EDEFAULT, oldRaiseRampRateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRaiseRampRate() {
        return raiseRampRateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedGrossMaxP() {
        return ratedGrossMaxP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedGrossMaxP( Float newRatedGrossMaxP ) {
        Float oldRatedGrossMaxP = ratedGrossMaxP;
        ratedGrossMaxP = newRatedGrossMaxP;
        boolean oldRatedGrossMaxPESet = ratedGrossMaxPESet;
        ratedGrossMaxPESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__RATED_GROSS_MAX_P,
                    oldRatedGrossMaxP, ratedGrossMaxP, !oldRatedGrossMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedGrossMaxP() {
        Float oldRatedGrossMaxP = ratedGrossMaxP;
        boolean oldRatedGrossMaxPESet = ratedGrossMaxPESet;
        ratedGrossMaxP = RATED_GROSS_MAX_P_EDEFAULT;
        ratedGrossMaxPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__RATED_GROSS_MAX_P,
                    oldRatedGrossMaxP, RATED_GROSS_MAX_P_EDEFAULT, oldRatedGrossMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedGrossMaxP() {
        return ratedGrossMaxPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedGrossMinP() {
        return ratedGrossMinP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedGrossMinP( Float newRatedGrossMinP ) {
        Float oldRatedGrossMinP = ratedGrossMinP;
        ratedGrossMinP = newRatedGrossMinP;
        boolean oldRatedGrossMinPESet = ratedGrossMinPESet;
        ratedGrossMinPESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__RATED_GROSS_MIN_P,
                    oldRatedGrossMinP, ratedGrossMinP, !oldRatedGrossMinPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedGrossMinP() {
        Float oldRatedGrossMinP = ratedGrossMinP;
        boolean oldRatedGrossMinPESet = ratedGrossMinPESet;
        ratedGrossMinP = RATED_GROSS_MIN_P_EDEFAULT;
        ratedGrossMinPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__RATED_GROSS_MIN_P,
                    oldRatedGrossMinP, RATED_GROSS_MIN_P_EDEFAULT, oldRatedGrossMinPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedGrossMinP() {
        return ratedGrossMinPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedNetMaxP() {
        return ratedNetMaxP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedNetMaxP( Float newRatedNetMaxP ) {
        Float oldRatedNetMaxP = ratedNetMaxP;
        ratedNetMaxP = newRatedNetMaxP;
        boolean oldRatedNetMaxPESet = ratedNetMaxPESet;
        ratedNetMaxPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__RATED_NET_MAX_P, oldRatedNetMaxP, ratedNetMaxP, !oldRatedNetMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedNetMaxP() {
        Float oldRatedNetMaxP = ratedNetMaxP;
        boolean oldRatedNetMaxPESet = ratedNetMaxPESet;
        ratedNetMaxP = RATED_NET_MAX_P_EDEFAULT;
        ratedNetMaxPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__RATED_NET_MAX_P,
                    oldRatedNetMaxP, RATED_NET_MAX_P_EDEFAULT, oldRatedNetMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedNetMaxP() {
        return ratedNetMaxPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getShortPF() {
        return shortPF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setShortPF( Float newShortPF ) {
        Float oldShortPF = shortPF;
        shortPF = newShortPF;
        boolean oldShortPFESet = shortPFESet;
        shortPFESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__SHORT_PF, oldShortPF, shortPF, !oldShortPFESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetShortPF() {
        Float oldShortPF = shortPF;
        boolean oldShortPFESet = shortPFESet;
        shortPF = SHORT_PF_EDEFAULT;
        shortPFESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GENERATING_UNIT__SHORT_PF, oldShortPF, SHORT_PF_EDEFAULT, oldShortPFESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetShortPF() {
        return shortPFESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getStartupCost() {
        return startupCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartupCost( BigDecimal newStartupCost ) {
        BigDecimal oldStartupCost = startupCost;
        startupCost = newStartupCost;
        boolean oldStartupCostESet = startupCostESet;
        startupCostESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__STARTUP_COST, oldStartupCost, startupCost, !oldStartupCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStartupCost() {
        BigDecimal oldStartupCost = startupCost;
        boolean oldStartupCostESet = startupCostESet;
        startupCost = STARTUP_COST_EDEFAULT;
        startupCostESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GENERATING_UNIT__STARTUP_COST, oldStartupCost, STARTUP_COST_EDEFAULT, oldStartupCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartupCost() {
        return startupCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getStartupTime() {
        return startupTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartupTime( Float newStartupTime ) {
        Float oldStartupTime = startupTime;
        startupTime = newStartupTime;
        boolean oldStartupTimeESet = startupTimeESet;
        startupTimeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__STARTUP_TIME, oldStartupTime, startupTime, !oldStartupTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStartupTime() {
        Float oldStartupTime = startupTime;
        boolean oldStartupTimeESet = startupTimeESet;
        startupTime = STARTUP_TIME_EDEFAULT;
        startupTimeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GENERATING_UNIT__STARTUP_TIME, oldStartupTime, STARTUP_TIME_EDEFAULT, oldStartupTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartupTime() {
        return startupTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTieLinePF() {
        return tieLinePF;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTieLinePF( Float newTieLinePF ) {
        Float oldTieLinePF = tieLinePF;
        tieLinePF = newTieLinePF;
        boolean oldTieLinePFESet = tieLinePFESet;
        tieLinePFESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__TIE_LINE_PF, oldTieLinePF, tieLinePF, !oldTieLinePFESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTieLinePF() {
        Float oldTieLinePF = tieLinePF;
        boolean oldTieLinePFESet = tieLinePFESet;
        tieLinePF = TIE_LINE_PF_EDEFAULT;
        tieLinePFESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.GENERATING_UNIT__TIE_LINE_PF, oldTieLinePF, TIE_LINE_PF_EDEFAULT, oldTieLinePFESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTieLinePF() {
        return tieLinePFESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTotalEfficiency() {
        return totalEfficiency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTotalEfficiency( Float newTotalEfficiency ) {
        Float oldTotalEfficiency = totalEfficiency;
        totalEfficiency = newTotalEfficiency;
        boolean oldTotalEfficiencyESet = totalEfficiencyESet;
        totalEfficiencyESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__TOTAL_EFFICIENCY,
                    oldTotalEfficiency, totalEfficiency, !oldTotalEfficiencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTotalEfficiency() {
        Float oldTotalEfficiency = totalEfficiency;
        boolean oldTotalEfficiencyESet = totalEfficiencyESet;
        totalEfficiency = TOTAL_EFFICIENCY_EDEFAULT;
        totalEfficiencyESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__TOTAL_EFFICIENCY,
                    oldTotalEfficiency, TOTAL_EFFICIENCY_EDEFAULT, oldTotalEfficiencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTotalEfficiency() {
        return totalEfficiencyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public BigDecimal getVariableCost() {
        return variableCost;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVariableCost( BigDecimal newVariableCost ) {
        BigDecimal oldVariableCost = variableCost;
        variableCost = newVariableCost;
        boolean oldVariableCostESet = variableCostESet;
        variableCostESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.GENERATING_UNIT__VARIABLE_COST, oldVariableCost, variableCost, !oldVariableCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVariableCost() {
        BigDecimal oldVariableCost = variableCost;
        boolean oldVariableCostESet = variableCostESet;
        variableCost = VARIABLE_COST_EDEFAULT;
        variableCostESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.GENERATING_UNIT__VARIABLE_COST,
                    oldVariableCost, VARIABLE_COST_EDEFAULT, oldVariableCostESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVariableCost() {
        return variableCostESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< RotatingMachine > getRotatingMachine() {
        if( rotatingMachine == null ) {
            rotatingMachine = new EObjectWithInverseResolvingEList.Unsettable< RotatingMachine >( RotatingMachine.class,
                    this, CimPackage.GENERATING_UNIT__ROTATING_MACHINE, CimPackage.ROTATING_MACHINE__GENERATING_UNIT );
        }
        return rotatingMachine;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRotatingMachine() {
        if( rotatingMachine != null ) ( ( InternalEList.Unsettable< ? > ) rotatingMachine ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRotatingMachine() {
        return rotatingMachine != null && ( ( InternalEList.Unsettable< ? > ) rotatingMachine ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< GrossToNetActivePowerCurve > getGrossToNetActivePowerCurves() {
        if( grossToNetActivePowerCurves == null ) {
            grossToNetActivePowerCurves = new EObjectWithInverseResolvingEList.Unsettable< GrossToNetActivePowerCurve >(
                    GrossToNetActivePowerCurve.class, this,
                    CimPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES,
                    CimPackage.GROSS_TO_NET_ACTIVE_POWER_CURVE__GENERATING_UNIT );
        }
        return grossToNetActivePowerCurves;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGrossToNetActivePowerCurves() {
        if( grossToNetActivePowerCurves != null )
            ( ( InternalEList.Unsettable< ? > ) grossToNetActivePowerCurves ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGrossToNetActivePowerCurves() {
        return grossToNetActivePowerCurves != null
                && ( ( InternalEList.Unsettable< ? > ) grossToNetActivePowerCurves ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ControlAreaGeneratingUnit > getControlAreaGeneratingUnit() {
        if( controlAreaGeneratingUnit == null ) {
            controlAreaGeneratingUnit = new EObjectWithInverseResolvingEList.Unsettable< ControlAreaGeneratingUnit >(
                    ControlAreaGeneratingUnit.class, this, CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT,
                    CimPackage.CONTROL_AREA_GENERATING_UNIT__GENERATING_UNIT );
        }
        return controlAreaGeneratingUnit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlAreaGeneratingUnit() {
        if( controlAreaGeneratingUnit != null ) ( ( InternalEList.Unsettable< ? > ) controlAreaGeneratingUnit ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlAreaGeneratingUnit() {
        return controlAreaGeneratingUnit != null
                && ( ( InternalEList.Unsettable< ? > ) controlAreaGeneratingUnit ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< GenUnitOpCostCurve > getGenUnitOpCostCurves() {
        if( genUnitOpCostCurves == null ) {
            genUnitOpCostCurves = new EObjectWithInverseResolvingEList.Unsettable< GenUnitOpCostCurve >(
                    GenUnitOpCostCurve.class, this, CimPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES,
                    CimPackage.GEN_UNIT_OP_COST_CURVE__GENERATING_UNIT );
        }
        return genUnitOpCostCurves;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGenUnitOpCostCurves() {
        if( genUnitOpCostCurves != null ) ( ( InternalEList.Unsettable< ? > ) genUnitOpCostCurves ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGenUnitOpCostCurves() {
        return genUnitOpCostCurves != null && ( ( InternalEList.Unsettable< ? > ) genUnitOpCostCurves ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public GenUnitOpSchedule getGenUnitOpSchedule() {
        if( genUnitOpSchedule != null && genUnitOpSchedule.eIsProxy() ) {
            InternalEObject oldGenUnitOpSchedule = ( InternalEObject ) genUnitOpSchedule;
            genUnitOpSchedule = ( GenUnitOpSchedule ) eResolveProxy( oldGenUnitOpSchedule );
            if( genUnitOpSchedule != oldGenUnitOpSchedule ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE, oldGenUnitOpSchedule, genUnitOpSchedule ) );
            }
        }
        return genUnitOpSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenUnitOpSchedule basicGetGenUnitOpSchedule() {
        return genUnitOpSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetGenUnitOpSchedule( GenUnitOpSchedule newGenUnitOpSchedule,
            NotificationChain msgs ) {
        GenUnitOpSchedule oldGenUnitOpSchedule = genUnitOpSchedule;
        genUnitOpSchedule = newGenUnitOpSchedule;
        boolean oldGenUnitOpScheduleESet = genUnitOpScheduleESet;
        genUnitOpScheduleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE, oldGenUnitOpSchedule, newGenUnitOpSchedule,
                    !oldGenUnitOpScheduleESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGenUnitOpSchedule( GenUnitOpSchedule newGenUnitOpSchedule ) {
        if( newGenUnitOpSchedule != genUnitOpSchedule ) {
            NotificationChain msgs = null;
            if( genUnitOpSchedule != null ) msgs = ( ( InternalEObject ) genUnitOpSchedule ).eInverseRemove( this,
                    CimPackage.GEN_UNIT_OP_SCHEDULE__GENERATING_UNIT, GenUnitOpSchedule.class, msgs );
            if( newGenUnitOpSchedule != null ) msgs = ( ( InternalEObject ) newGenUnitOpSchedule ).eInverseAdd( this,
                    CimPackage.GEN_UNIT_OP_SCHEDULE__GENERATING_UNIT, GenUnitOpSchedule.class, msgs );
            msgs = basicSetGenUnitOpSchedule( newGenUnitOpSchedule, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGenUnitOpScheduleESet = genUnitOpScheduleESet;
            genUnitOpScheduleESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE,
                            newGenUnitOpSchedule, newGenUnitOpSchedule, !oldGenUnitOpScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetGenUnitOpSchedule( NotificationChain msgs ) {
        GenUnitOpSchedule oldGenUnitOpSchedule = genUnitOpSchedule;
        genUnitOpSchedule = null;
        boolean oldGenUnitOpScheduleESet = genUnitOpScheduleESet;
        genUnitOpScheduleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE, oldGenUnitOpSchedule, null,
                    oldGenUnitOpScheduleESet );
            if( msgs == null )
                msgs = notification;
            else
                msgs.add( notification );
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGenUnitOpSchedule() {
        if( genUnitOpSchedule != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) genUnitOpSchedule ).eInverseRemove( this,
                    CimPackage.GEN_UNIT_OP_SCHEDULE__GENERATING_UNIT, GenUnitOpSchedule.class, msgs );
            msgs = basicUnsetGenUnitOpSchedule( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldGenUnitOpScheduleESet = genUnitOpScheduleESet;
            genUnitOpScheduleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE, null, null, oldGenUnitOpScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGenUnitOpSchedule() {
        return genUnitOpScheduleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.GENERATING_UNIT__ROTATING_MACHINE:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getRotatingMachine() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getGrossToNetActivePowerCurves() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getControlAreaGeneratingUnit() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getGenUnitOpCostCurves() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
            if( genUnitOpSchedule != null ) msgs = ( ( InternalEObject ) genUnitOpSchedule ).eInverseRemove( this,
                    CimPackage.GEN_UNIT_OP_SCHEDULE__GENERATING_UNIT, GenUnitOpSchedule.class, msgs );
            return basicSetGenUnitOpSchedule( ( GenUnitOpSchedule ) otherEnd, msgs );
        }
        return super.eInverseAdd( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.GENERATING_UNIT__ROTATING_MACHINE:
            return ( ( InternalEList< ? > ) getRotatingMachine() ).basicRemove( otherEnd, msgs );
        case CimPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
            return ( ( InternalEList< ? > ) getGrossToNetActivePowerCurves() ).basicRemove( otherEnd, msgs );
        case CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
            return ( ( InternalEList< ? > ) getControlAreaGeneratingUnit() ).basicRemove( otherEnd, msgs );
        case CimPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
            return ( ( InternalEList< ? > ) getGenUnitOpCostCurves() ).basicRemove( otherEnd, msgs );
        case CimPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
            return basicUnsetGenUnitOpSchedule( msgs );
        }
        return super.eInverseRemove( otherEnd, featureID, msgs );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P:
            return getAllocSpinResP();
        case CimPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P:
            return getAutoCntrlMarginP();
        case CimPackage.GENERATING_UNIT__BASE_P:
            return getBaseP();
        case CimPackage.GENERATING_UNIT__CONTROL_DEADBAND:
            return getControlDeadband();
        case CimPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH:
            return getControlPulseHigh();
        case CimPackage.GENERATING_UNIT__CONTROL_PULSE_LOW:
            return getControlPulseLow();
        case CimPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE:
            return getControlResponseRate();
        case CimPackage.GENERATING_UNIT__EFFICIENCY:
            return getEfficiency();
        case CimPackage.GENERATING_UNIT__GEN_CONTROL_MODE:
            return getGenControlMode();
        case CimPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
            return getGenControlSource();
        case CimPackage.GENERATING_UNIT__GOVERNOR_MPL:
            return getGovernorMPL();
        case CimPackage.GENERATING_UNIT__GOVERNOR_SCD:
            return getGovernorSCD();
        case CimPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT:
            return getHighControlLimit();
        case CimPackage.GENERATING_UNIT__INITIAL_P:
            return getInitialP();
        case CimPackage.GENERATING_UNIT__LONG_PF:
            return getLongPF();
        case CimPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT:
            return getLowControlLimit();
        case CimPackage.GENERATING_UNIT__LOWER_RAMP_RATE:
            return getLowerRampRate();
        case CimPackage.GENERATING_UNIT__MAX_ECONOMIC_P:
            return getMaxEconomicP();
        case CimPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
            return getMaximumAllowableSpinningReserve();
        case CimPackage.GENERATING_UNIT__MAX_OPERATING_P:
            return getMaxOperatingP();
        case CimPackage.GENERATING_UNIT__MIN_ECONOMIC_P:
            return getMinEconomicP();
        case CimPackage.GENERATING_UNIT__MINIMUM_OFF_TIME:
            return getMinimumOffTime();
        case CimPackage.GENERATING_UNIT__MIN_OPERATING_P:
            return getMinOperatingP();
        case CimPackage.GENERATING_UNIT__MODEL_DETAIL:
            return getModelDetail();
        case CimPackage.GENERATING_UNIT__NOMINAL_P:
            return getNominalP();
        case CimPackage.GENERATING_UNIT__NORMAL_PF:
            return getNormalPF();
        case CimPackage.GENERATING_UNIT__PENALTY_FACTOR:
            return getPenaltyFactor();
        case CimPackage.GENERATING_UNIT__RAISE_RAMP_RATE:
            return getRaiseRampRate();
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
            return getRatedGrossMaxP();
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
            return getRatedGrossMinP();
        case CimPackage.GENERATING_UNIT__RATED_NET_MAX_P:
            return getRatedNetMaxP();
        case CimPackage.GENERATING_UNIT__SHORT_PF:
            return getShortPF();
        case CimPackage.GENERATING_UNIT__STARTUP_COST:
            return getStartupCost();
        case CimPackage.GENERATING_UNIT__STARTUP_TIME:
            return getStartupTime();
        case CimPackage.GENERATING_UNIT__TIE_LINE_PF:
            return getTieLinePF();
        case CimPackage.GENERATING_UNIT__TOTAL_EFFICIENCY:
            return getTotalEfficiency();
        case CimPackage.GENERATING_UNIT__VARIABLE_COST:
            return getVariableCost();
        case CimPackage.GENERATING_UNIT__ROTATING_MACHINE:
            return getRotatingMachine();
        case CimPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
            return getGrossToNetActivePowerCurves();
        case CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
            return getControlAreaGeneratingUnit();
        case CimPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
            return getGenUnitOpCostCurves();
        case CimPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
            if( resolve ) return getGenUnitOpSchedule();
            return basicGetGenUnitOpSchedule();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings( "unchecked" )
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P:
            setAllocSpinResP( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P:
            setAutoCntrlMarginP( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__BASE_P:
            setBaseP( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__CONTROL_DEADBAND:
            setControlDeadband( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH:
            setControlPulseHigh( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__CONTROL_PULSE_LOW:
            setControlPulseLow( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE:
            setControlResponseRate( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__EFFICIENCY:
            setEfficiency( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__GEN_CONTROL_MODE:
            setGenControlMode( ( GeneratorControlMode ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
            setGenControlSource( ( GeneratorControlSource ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__GOVERNOR_MPL:
            setGovernorMPL( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__GOVERNOR_SCD:
            setGovernorSCD( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT:
            setHighControlLimit( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__INITIAL_P:
            setInitialP( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__LONG_PF:
            setLongPF( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT:
            setLowControlLimit( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__LOWER_RAMP_RATE:
            setLowerRampRate( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__MAX_ECONOMIC_P:
            setMaxEconomicP( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
            setMaximumAllowableSpinningReserve( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__MAX_OPERATING_P:
            setMaxOperatingP( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__MIN_ECONOMIC_P:
            setMinEconomicP( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__MINIMUM_OFF_TIME:
            setMinimumOffTime( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__MIN_OPERATING_P:
            setMinOperatingP( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__MODEL_DETAIL:
            setModelDetail( ( Integer ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__NOMINAL_P:
            setNominalP( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__NORMAL_PF:
            setNormalPF( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__PENALTY_FACTOR:
            setPenaltyFactor( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__RAISE_RAMP_RATE:
            setRaiseRampRate( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
            setRatedGrossMaxP( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
            setRatedGrossMinP( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__RATED_NET_MAX_P:
            setRatedNetMaxP( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__SHORT_PF:
            setShortPF( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__STARTUP_COST:
            setStartupCost( ( BigDecimal ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__STARTUP_TIME:
            setStartupTime( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__TIE_LINE_PF:
            setTieLinePF( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__TOTAL_EFFICIENCY:
            setTotalEfficiency( ( Float ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__VARIABLE_COST:
            setVariableCost( ( BigDecimal ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__ROTATING_MACHINE:
            getRotatingMachine().clear();
            getRotatingMachine().addAll( ( Collection< ? extends RotatingMachine > ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
            getGrossToNetActivePowerCurves().clear();
            getGrossToNetActivePowerCurves().addAll( ( Collection< ? extends GrossToNetActivePowerCurve > ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
            getControlAreaGeneratingUnit().clear();
            getControlAreaGeneratingUnit().addAll( ( Collection< ? extends ControlAreaGeneratingUnit > ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
            getGenUnitOpCostCurves().clear();
            getGenUnitOpCostCurves().addAll( ( Collection< ? extends GenUnitOpCostCurve > ) newValue );
            return;
        case CimPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
            setGenUnitOpSchedule( ( GenUnitOpSchedule ) newValue );
            return;
        }
        super.eSet( featureID, newValue );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset( int featureID ) {
        switch( featureID ) {
        case CimPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P:
            unsetAllocSpinResP();
            return;
        case CimPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P:
            unsetAutoCntrlMarginP();
            return;
        case CimPackage.GENERATING_UNIT__BASE_P:
            unsetBaseP();
            return;
        case CimPackage.GENERATING_UNIT__CONTROL_DEADBAND:
            unsetControlDeadband();
            return;
        case CimPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH:
            unsetControlPulseHigh();
            return;
        case CimPackage.GENERATING_UNIT__CONTROL_PULSE_LOW:
            unsetControlPulseLow();
            return;
        case CimPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE:
            unsetControlResponseRate();
            return;
        case CimPackage.GENERATING_UNIT__EFFICIENCY:
            unsetEfficiency();
            return;
        case CimPackage.GENERATING_UNIT__GEN_CONTROL_MODE:
            unsetGenControlMode();
            return;
        case CimPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
            unsetGenControlSource();
            return;
        case CimPackage.GENERATING_UNIT__GOVERNOR_MPL:
            unsetGovernorMPL();
            return;
        case CimPackage.GENERATING_UNIT__GOVERNOR_SCD:
            unsetGovernorSCD();
            return;
        case CimPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT:
            unsetHighControlLimit();
            return;
        case CimPackage.GENERATING_UNIT__INITIAL_P:
            unsetInitialP();
            return;
        case CimPackage.GENERATING_UNIT__LONG_PF:
            unsetLongPF();
            return;
        case CimPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT:
            unsetLowControlLimit();
            return;
        case CimPackage.GENERATING_UNIT__LOWER_RAMP_RATE:
            unsetLowerRampRate();
            return;
        case CimPackage.GENERATING_UNIT__MAX_ECONOMIC_P:
            unsetMaxEconomicP();
            return;
        case CimPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
            unsetMaximumAllowableSpinningReserve();
            return;
        case CimPackage.GENERATING_UNIT__MAX_OPERATING_P:
            unsetMaxOperatingP();
            return;
        case CimPackage.GENERATING_UNIT__MIN_ECONOMIC_P:
            unsetMinEconomicP();
            return;
        case CimPackage.GENERATING_UNIT__MINIMUM_OFF_TIME:
            unsetMinimumOffTime();
            return;
        case CimPackage.GENERATING_UNIT__MIN_OPERATING_P:
            unsetMinOperatingP();
            return;
        case CimPackage.GENERATING_UNIT__MODEL_DETAIL:
            unsetModelDetail();
            return;
        case CimPackage.GENERATING_UNIT__NOMINAL_P:
            unsetNominalP();
            return;
        case CimPackage.GENERATING_UNIT__NORMAL_PF:
            unsetNormalPF();
            return;
        case CimPackage.GENERATING_UNIT__PENALTY_FACTOR:
            unsetPenaltyFactor();
            return;
        case CimPackage.GENERATING_UNIT__RAISE_RAMP_RATE:
            unsetRaiseRampRate();
            return;
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
            unsetRatedGrossMaxP();
            return;
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
            unsetRatedGrossMinP();
            return;
        case CimPackage.GENERATING_UNIT__RATED_NET_MAX_P:
            unsetRatedNetMaxP();
            return;
        case CimPackage.GENERATING_UNIT__SHORT_PF:
            unsetShortPF();
            return;
        case CimPackage.GENERATING_UNIT__STARTUP_COST:
            unsetStartupCost();
            return;
        case CimPackage.GENERATING_UNIT__STARTUP_TIME:
            unsetStartupTime();
            return;
        case CimPackage.GENERATING_UNIT__TIE_LINE_PF:
            unsetTieLinePF();
            return;
        case CimPackage.GENERATING_UNIT__TOTAL_EFFICIENCY:
            unsetTotalEfficiency();
            return;
        case CimPackage.GENERATING_UNIT__VARIABLE_COST:
            unsetVariableCost();
            return;
        case CimPackage.GENERATING_UNIT__ROTATING_MACHINE:
            unsetRotatingMachine();
            return;
        case CimPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
            unsetGrossToNetActivePowerCurves();
            return;
        case CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
            unsetControlAreaGeneratingUnit();
            return;
        case CimPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
            unsetGenUnitOpCostCurves();
            return;
        case CimPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
            unsetGenUnitOpSchedule();
            return;
        }
        super.eUnset( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet( int featureID ) {
        switch( featureID ) {
        case CimPackage.GENERATING_UNIT__ALLOC_SPIN_RES_P:
            return isSetAllocSpinResP();
        case CimPackage.GENERATING_UNIT__AUTO_CNTRL_MARGIN_P:
            return isSetAutoCntrlMarginP();
        case CimPackage.GENERATING_UNIT__BASE_P:
            return isSetBaseP();
        case CimPackage.GENERATING_UNIT__CONTROL_DEADBAND:
            return isSetControlDeadband();
        case CimPackage.GENERATING_UNIT__CONTROL_PULSE_HIGH:
            return isSetControlPulseHigh();
        case CimPackage.GENERATING_UNIT__CONTROL_PULSE_LOW:
            return isSetControlPulseLow();
        case CimPackage.GENERATING_UNIT__CONTROL_RESPONSE_RATE:
            return isSetControlResponseRate();
        case CimPackage.GENERATING_UNIT__EFFICIENCY:
            return isSetEfficiency();
        case CimPackage.GENERATING_UNIT__GEN_CONTROL_MODE:
            return isSetGenControlMode();
        case CimPackage.GENERATING_UNIT__GEN_CONTROL_SOURCE:
            return isSetGenControlSource();
        case CimPackage.GENERATING_UNIT__GOVERNOR_MPL:
            return isSetGovernorMPL();
        case CimPackage.GENERATING_UNIT__GOVERNOR_SCD:
            return isSetGovernorSCD();
        case CimPackage.GENERATING_UNIT__HIGH_CONTROL_LIMIT:
            return isSetHighControlLimit();
        case CimPackage.GENERATING_UNIT__INITIAL_P:
            return isSetInitialP();
        case CimPackage.GENERATING_UNIT__LONG_PF:
            return isSetLongPF();
        case CimPackage.GENERATING_UNIT__LOW_CONTROL_LIMIT:
            return isSetLowControlLimit();
        case CimPackage.GENERATING_UNIT__LOWER_RAMP_RATE:
            return isSetLowerRampRate();
        case CimPackage.GENERATING_UNIT__MAX_ECONOMIC_P:
            return isSetMaxEconomicP();
        case CimPackage.GENERATING_UNIT__MAXIMUM_ALLOWABLE_SPINNING_RESERVE:
            return isSetMaximumAllowableSpinningReserve();
        case CimPackage.GENERATING_UNIT__MAX_OPERATING_P:
            return isSetMaxOperatingP();
        case CimPackage.GENERATING_UNIT__MIN_ECONOMIC_P:
            return isSetMinEconomicP();
        case CimPackage.GENERATING_UNIT__MINIMUM_OFF_TIME:
            return isSetMinimumOffTime();
        case CimPackage.GENERATING_UNIT__MIN_OPERATING_P:
            return isSetMinOperatingP();
        case CimPackage.GENERATING_UNIT__MODEL_DETAIL:
            return isSetModelDetail();
        case CimPackage.GENERATING_UNIT__NOMINAL_P:
            return isSetNominalP();
        case CimPackage.GENERATING_UNIT__NORMAL_PF:
            return isSetNormalPF();
        case CimPackage.GENERATING_UNIT__PENALTY_FACTOR:
            return isSetPenaltyFactor();
        case CimPackage.GENERATING_UNIT__RAISE_RAMP_RATE:
            return isSetRaiseRampRate();
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MAX_P:
            return isSetRatedGrossMaxP();
        case CimPackage.GENERATING_UNIT__RATED_GROSS_MIN_P:
            return isSetRatedGrossMinP();
        case CimPackage.GENERATING_UNIT__RATED_NET_MAX_P:
            return isSetRatedNetMaxP();
        case CimPackage.GENERATING_UNIT__SHORT_PF:
            return isSetShortPF();
        case CimPackage.GENERATING_UNIT__STARTUP_COST:
            return isSetStartupCost();
        case CimPackage.GENERATING_UNIT__STARTUP_TIME:
            return isSetStartupTime();
        case CimPackage.GENERATING_UNIT__TIE_LINE_PF:
            return isSetTieLinePF();
        case CimPackage.GENERATING_UNIT__TOTAL_EFFICIENCY:
            return isSetTotalEfficiency();
        case CimPackage.GENERATING_UNIT__VARIABLE_COST:
            return isSetVariableCost();
        case CimPackage.GENERATING_UNIT__ROTATING_MACHINE:
            return isSetRotatingMachine();
        case CimPackage.GENERATING_UNIT__GROSS_TO_NET_ACTIVE_POWER_CURVES:
            return isSetGrossToNetActivePowerCurves();
        case CimPackage.GENERATING_UNIT__CONTROL_AREA_GENERATING_UNIT:
            return isSetControlAreaGeneratingUnit();
        case CimPackage.GENERATING_UNIT__GEN_UNIT_OP_COST_CURVES:
            return isSetGenUnitOpCostCurves();
        case CimPackage.GENERATING_UNIT__GEN_UNIT_OP_SCHEDULE:
            return isSetGenUnitOpSchedule();
        }
        return super.eIsSet( featureID );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if( eIsProxy() ) return super.toString();

        StringBuilder result = new StringBuilder( super.toString() );
        result.append( " (allocSpinResP: " );
        if( allocSpinResPESet )
            result.append( allocSpinResP );
        else
            result.append( "<unset>" );
        result.append( ", autoCntrlMarginP: " );
        if( autoCntrlMarginPESet )
            result.append( autoCntrlMarginP );
        else
            result.append( "<unset>" );
        result.append( ", baseP: " );
        if( basePESet )
            result.append( baseP );
        else
            result.append( "<unset>" );
        result.append( ", controlDeadband: " );
        if( controlDeadbandESet )
            result.append( controlDeadband );
        else
            result.append( "<unset>" );
        result.append( ", controlPulseHigh: " );
        if( controlPulseHighESet )
            result.append( controlPulseHigh );
        else
            result.append( "<unset>" );
        result.append( ", controlPulseLow: " );
        if( controlPulseLowESet )
            result.append( controlPulseLow );
        else
            result.append( "<unset>" );
        result.append( ", controlResponseRate: " );
        if( controlResponseRateESet )
            result.append( controlResponseRate );
        else
            result.append( "<unset>" );
        result.append( ", efficiency: " );
        if( efficiencyESet )
            result.append( efficiency );
        else
            result.append( "<unset>" );
        result.append( ", genControlMode: " );
        if( genControlModeESet )
            result.append( genControlMode );
        else
            result.append( "<unset>" );
        result.append( ", genControlSource: " );
        if( genControlSourceESet )
            result.append( genControlSource );
        else
            result.append( "<unset>" );
        result.append( ", governorMPL: " );
        if( governorMPLESet )
            result.append( governorMPL );
        else
            result.append( "<unset>" );
        result.append( ", governorSCD: " );
        if( governorSCDESet )
            result.append( governorSCD );
        else
            result.append( "<unset>" );
        result.append( ", highControlLimit: " );
        if( highControlLimitESet )
            result.append( highControlLimit );
        else
            result.append( "<unset>" );
        result.append( ", initialP: " );
        if( initialPESet )
            result.append( initialP );
        else
            result.append( "<unset>" );
        result.append( ", longPF: " );
        if( longPFESet )
            result.append( longPF );
        else
            result.append( "<unset>" );
        result.append( ", lowControlLimit: " );
        if( lowControlLimitESet )
            result.append( lowControlLimit );
        else
            result.append( "<unset>" );
        result.append( ", lowerRampRate: " );
        if( lowerRampRateESet )
            result.append( lowerRampRate );
        else
            result.append( "<unset>" );
        result.append( ", maxEconomicP: " );
        if( maxEconomicPESet )
            result.append( maxEconomicP );
        else
            result.append( "<unset>" );
        result.append( ", maximumAllowableSpinningReserve: " );
        if( maximumAllowableSpinningReserveESet )
            result.append( maximumAllowableSpinningReserve );
        else
            result.append( "<unset>" );
        result.append( ", maxOperatingP: " );
        if( maxOperatingPESet )
            result.append( maxOperatingP );
        else
            result.append( "<unset>" );
        result.append( ", minEconomicP: " );
        if( minEconomicPESet )
            result.append( minEconomicP );
        else
            result.append( "<unset>" );
        result.append( ", minimumOffTime: " );
        if( minimumOffTimeESet )
            result.append( minimumOffTime );
        else
            result.append( "<unset>" );
        result.append( ", minOperatingP: " );
        if( minOperatingPESet )
            result.append( minOperatingP );
        else
            result.append( "<unset>" );
        result.append( ", modelDetail: " );
        if( modelDetailESet )
            result.append( modelDetail );
        else
            result.append( "<unset>" );
        result.append( ", nominalP: " );
        if( nominalPESet )
            result.append( nominalP );
        else
            result.append( "<unset>" );
        result.append( ", normalPF: " );
        if( normalPFESet )
            result.append( normalPF );
        else
            result.append( "<unset>" );
        result.append( ", penaltyFactor: " );
        if( penaltyFactorESet )
            result.append( penaltyFactor );
        else
            result.append( "<unset>" );
        result.append( ", raiseRampRate: " );
        if( raiseRampRateESet )
            result.append( raiseRampRate );
        else
            result.append( "<unset>" );
        result.append( ", ratedGrossMaxP: " );
        if( ratedGrossMaxPESet )
            result.append( ratedGrossMaxP );
        else
            result.append( "<unset>" );
        result.append( ", ratedGrossMinP: " );
        if( ratedGrossMinPESet )
            result.append( ratedGrossMinP );
        else
            result.append( "<unset>" );
        result.append( ", ratedNetMaxP: " );
        if( ratedNetMaxPESet )
            result.append( ratedNetMaxP );
        else
            result.append( "<unset>" );
        result.append( ", shortPF: " );
        if( shortPFESet )
            result.append( shortPF );
        else
            result.append( "<unset>" );
        result.append( ", startupCost: " );
        if( startupCostESet )
            result.append( startupCost );
        else
            result.append( "<unset>" );
        result.append( ", startupTime: " );
        if( startupTimeESet )
            result.append( startupTime );
        else
            result.append( "<unset>" );
        result.append( ", tieLinePF: " );
        if( tieLinePFESet )
            result.append( tieLinePF );
        else
            result.append( "<unset>" );
        result.append( ", totalEfficiency: " );
        if( totalEfficiencyESet )
            result.append( totalEfficiency );
        else
            result.append( "<unset>" );
        result.append( ", variableCost: " );
        if( variableCostESet )
            result.append( variableCost );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //GeneratingUnitImpl
