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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineUserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DiscontinuousExcitationControlUserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ExcitationSystemUserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.LoadUserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.MechanicalLoadUserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OverexcitationLimiterUserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArControllerType1UserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PFVArControllerType2UserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.PowerSystemStabilizerUserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ProprietaryParameterDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SynchronousMachineUserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbineGovernorUserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbineLoadControllerUserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.UnderexcitationLimiterUserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageAdjusterUserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.VoltageCompensatorUserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindPlantUserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindType1or2UserDefined;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.WindType3or4UserDefined;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proprietary Parameter Dynamics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getBooleanParameterValue <em>Boolean Parameter Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getFloatParameterValue <em>Float Parameter Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getIntegerParameterValue <em>Integer Parameter Value</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getParameterNumber <em>Parameter Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getSynchronousMachineUserDefined <em>Synchronous Machine User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getPowerSystemStabilizerUserDefined <em>Power System Stabilizer User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getWindType3or4UserDefined <em>Wind Type3or4 User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getDiscontinuousExcitationControlUserDefined <em>Discontinuous Excitation Control User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getLoadUserDefined <em>Load User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getTurbineGovernorUserDefined <em>Turbine Governor User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getWindType1or2UserDefined <em>Wind Type1or2 User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getExcitationSystemUserDefined <em>Excitation System User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getVoltageAdjusterUserDefined <em>Voltage Adjuster User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getPFVArControllerType2UserDefined <em>PFV Ar Controller Type2 User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getTurbineLoadControllerUserDefined <em>Turbine Load Controller User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getUnderexcitationLimiterUserDefined <em>Underexcitation Limiter User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getAsynchronousMachineUserDefined <em>Asynchronous Machine User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getPFVArControllerType1UserDefined <em>PFV Ar Controller Type1 User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getOverexcitationLimiterUserDefined <em>Overexcitation Limiter User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getWindPlantUserDefined <em>Wind Plant User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getMechanicalLoadUserDefined <em>Mechanical Load User Defined</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ProprietaryParameterDynamicsImpl#getVoltageCompensatorUserDefined <em>Voltage Compensator User Defined</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProprietaryParameterDynamicsImpl extends CimObjectWithIDImpl implements ProprietaryParameterDynamics {
    /**
     * The default value of the '{@link #getBooleanParameterValue() <em>Boolean Parameter Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBooleanParameterValue()
     * @generated
     * @ordered
     */
    protected static final Boolean BOOLEAN_PARAMETER_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBooleanParameterValue() <em>Boolean Parameter Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBooleanParameterValue()
     * @generated
     * @ordered
     */
    protected Boolean booleanParameterValue = BOOLEAN_PARAMETER_VALUE_EDEFAULT;

    /**
     * This is true if the Boolean Parameter Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean booleanParameterValueESet;

    /**
     * The default value of the '{@link #getFloatParameterValue() <em>Float Parameter Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFloatParameterValue()
     * @generated
     * @ordered
     */
    protected static final Float FLOAT_PARAMETER_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFloatParameterValue() <em>Float Parameter Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFloatParameterValue()
     * @generated
     * @ordered
     */
    protected Float floatParameterValue = FLOAT_PARAMETER_VALUE_EDEFAULT;

    /**
     * This is true if the Float Parameter Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean floatParameterValueESet;

    /**
     * The default value of the '{@link #getIntegerParameterValue() <em>Integer Parameter Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntegerParameterValue()
     * @generated
     * @ordered
     */
    protected static final Integer INTEGER_PARAMETER_VALUE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIntegerParameterValue() <em>Integer Parameter Value</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIntegerParameterValue()
     * @generated
     * @ordered
     */
    protected Integer integerParameterValue = INTEGER_PARAMETER_VALUE_EDEFAULT;

    /**
     * This is true if the Integer Parameter Value attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean integerParameterValueESet;

    /**
     * The default value of the '{@link #getParameterNumber() <em>Parameter Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameterNumber()
     * @generated
     * @ordered
     */
    protected static final Integer PARAMETER_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getParameterNumber() <em>Parameter Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getParameterNumber()
     * @generated
     * @ordered
     */
    protected Integer parameterNumber = PARAMETER_NUMBER_EDEFAULT;

    /**
     * This is true if the Parameter Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean parameterNumberESet;

    /**
     * The cached value of the '{@link #getSynchronousMachineUserDefined() <em>Synchronous Machine User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSynchronousMachineUserDefined()
     * @generated
     * @ordered
     */
    protected SynchronousMachineUserDefined synchronousMachineUserDefined;

    /**
     * This is true if the Synchronous Machine User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean synchronousMachineUserDefinedESet;

    /**
     * The cached value of the '{@link #getPowerSystemStabilizerUserDefined() <em>Power System Stabilizer User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPowerSystemStabilizerUserDefined()
     * @generated
     * @ordered
     */
    protected PowerSystemStabilizerUserDefined powerSystemStabilizerUserDefined;

    /**
     * This is true if the Power System Stabilizer User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerSystemStabilizerUserDefinedESet;

    /**
     * The cached value of the '{@link #getWindType3or4UserDefined() <em>Wind Type3or4 User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindType3or4UserDefined()
     * @generated
     * @ordered
     */
    protected WindType3or4UserDefined windType3or4UserDefined;

    /**
     * This is true if the Wind Type3or4 User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windType3or4UserDefinedESet;

    /**
     * The cached value of the '{@link #getDiscontinuousExcitationControlUserDefined() <em>Discontinuous Excitation Control User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDiscontinuousExcitationControlUserDefined()
     * @generated
     * @ordered
     */
    protected DiscontinuousExcitationControlUserDefined discontinuousExcitationControlUserDefined;

    /**
     * This is true if the Discontinuous Excitation Control User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean discontinuousExcitationControlUserDefinedESet;

    /**
     * The cached value of the '{@link #getLoadUserDefined() <em>Load User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoadUserDefined()
     * @generated
     * @ordered
     */
    protected LoadUserDefined loadUserDefined;

    /**
     * This is true if the Load User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean loadUserDefinedESet;

    /**
     * The cached value of the '{@link #getTurbineGovernorUserDefined() <em>Turbine Governor User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurbineGovernorUserDefined()
     * @generated
     * @ordered
     */
    protected TurbineGovernorUserDefined turbineGovernorUserDefined;

    /**
     * This is true if the Turbine Governor User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean turbineGovernorUserDefinedESet;

    /**
     * The cached value of the '{@link #getWindType1or2UserDefined() <em>Wind Type1or2 User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindType1or2UserDefined()
     * @generated
     * @ordered
     */
    protected WindType1or2UserDefined windType1or2UserDefined;

    /**
     * This is true if the Wind Type1or2 User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windType1or2UserDefinedESet;

    /**
     * The cached value of the '{@link #getExcitationSystemUserDefined() <em>Excitation System User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getExcitationSystemUserDefined()
     * @generated
     * @ordered
     */
    protected ExcitationSystemUserDefined excitationSystemUserDefined;

    /**
     * This is true if the Excitation System User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean excitationSystemUserDefinedESet;

    /**
     * The cached value of the '{@link #getVoltageAdjusterUserDefined() <em>Voltage Adjuster User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageAdjusterUserDefined()
     * @generated
     * @ordered
     */
    protected VoltageAdjusterUserDefined voltageAdjusterUserDefined;

    /**
     * This is true if the Voltage Adjuster User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageAdjusterUserDefinedESet;

    /**
     * The cached value of the '{@link #getPFVArControllerType2UserDefined() <em>PFV Ar Controller Type2 User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPFVArControllerType2UserDefined()
     * @generated
     * @ordered
     */
    protected PFVArControllerType2UserDefined pfvArControllerType2UserDefined;

    /**
     * This is true if the PFV Ar Controller Type2 User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pfvArControllerType2UserDefinedESet;

    /**
     * The cached value of the '{@link #getTurbineLoadControllerUserDefined() <em>Turbine Load Controller User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurbineLoadControllerUserDefined()
     * @generated
     * @ordered
     */
    protected TurbineLoadControllerUserDefined turbineLoadControllerUserDefined;

    /**
     * This is true if the Turbine Load Controller User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean turbineLoadControllerUserDefinedESet;

    /**
     * The cached value of the '{@link #getUnderexcitationLimiterUserDefined() <em>Underexcitation Limiter User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getUnderexcitationLimiterUserDefined()
     * @generated
     * @ordered
     */
    protected UnderexcitationLimiterUserDefined underexcitationLimiterUserDefined;

    /**
     * This is true if the Underexcitation Limiter User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean underexcitationLimiterUserDefinedESet;

    /**
     * The cached value of the '{@link #getAsynchronousMachineUserDefined() <em>Asynchronous Machine User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsynchronousMachineUserDefined()
     * @generated
     * @ordered
     */
    protected AsynchronousMachineUserDefined asynchronousMachineUserDefined;

    /**
     * This is true if the Asynchronous Machine User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean asynchronousMachineUserDefinedESet;

    /**
     * The cached value of the '{@link #getPFVArControllerType1UserDefined() <em>PFV Ar Controller Type1 User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPFVArControllerType1UserDefined()
     * @generated
     * @ordered
     */
    protected PFVArControllerType1UserDefined pfvArControllerType1UserDefined;

    /**
     * This is true if the PFV Ar Controller Type1 User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean pfvArControllerType1UserDefinedESet;

    /**
     * The cached value of the '{@link #getOverexcitationLimiterUserDefined() <em>Overexcitation Limiter User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOverexcitationLimiterUserDefined()
     * @generated
     * @ordered
     */
    protected OverexcitationLimiterUserDefined overexcitationLimiterUserDefined;

    /**
     * This is true if the Overexcitation Limiter User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean overexcitationLimiterUserDefinedESet;

    /**
     * The cached value of the '{@link #getWindPlantUserDefined() <em>Wind Plant User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWindPlantUserDefined()
     * @generated
     * @ordered
     */
    protected WindPlantUserDefined windPlantUserDefined;

    /**
     * This is true if the Wind Plant User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean windPlantUserDefinedESet;

    /**
     * The cached value of the '{@link #getMechanicalLoadUserDefined() <em>Mechanical Load User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMechanicalLoadUserDefined()
     * @generated
     * @ordered
     */
    protected MechanicalLoadUserDefined mechanicalLoadUserDefined;

    /**
     * This is true if the Mechanical Load User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean mechanicalLoadUserDefinedESet;

    /**
     * The cached value of the '{@link #getVoltageCompensatorUserDefined() <em>Voltage Compensator User Defined</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltageCompensatorUserDefined()
     * @generated
     * @ordered
     */
    protected VoltageCompensatorUserDefined voltageCompensatorUserDefined;

    /**
     * This is true if the Voltage Compensator User Defined reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageCompensatorUserDefinedESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ProprietaryParameterDynamicsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getProprietaryParameterDynamics();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getBooleanParameterValue() {
        return booleanParameterValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBooleanParameterValue( Boolean newBooleanParameterValue ) {
        Boolean oldBooleanParameterValue = booleanParameterValue;
        booleanParameterValue = newBooleanParameterValue;
        boolean oldBooleanParameterValueESet = booleanParameterValueESet;
        booleanParameterValueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__BOOLEAN_PARAMETER_VALUE, oldBooleanParameterValue,
                booleanParameterValue, !oldBooleanParameterValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBooleanParameterValue() {
        Boolean oldBooleanParameterValue = booleanParameterValue;
        boolean oldBooleanParameterValueESet = booleanParameterValueESet;
        booleanParameterValue = BOOLEAN_PARAMETER_VALUE_EDEFAULT;
        booleanParameterValueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__BOOLEAN_PARAMETER_VALUE, oldBooleanParameterValue,
                BOOLEAN_PARAMETER_VALUE_EDEFAULT, oldBooleanParameterValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBooleanParameterValue() {
        return booleanParameterValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFloatParameterValue() {
        return floatParameterValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFloatParameterValue( Float newFloatParameterValue ) {
        Float oldFloatParameterValue = floatParameterValue;
        floatParameterValue = newFloatParameterValue;
        boolean oldFloatParameterValueESet = floatParameterValueESet;
        floatParameterValueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__FLOAT_PARAMETER_VALUE, oldFloatParameterValue,
                floatParameterValue, !oldFloatParameterValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFloatParameterValue() {
        Float oldFloatParameterValue = floatParameterValue;
        boolean oldFloatParameterValueESet = floatParameterValueESet;
        floatParameterValue = FLOAT_PARAMETER_VALUE_EDEFAULT;
        floatParameterValueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__FLOAT_PARAMETER_VALUE, oldFloatParameterValue,
                FLOAT_PARAMETER_VALUE_EDEFAULT, oldFloatParameterValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFloatParameterValue() {
        return floatParameterValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getIntegerParameterValue() {
        return integerParameterValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIntegerParameterValue( Integer newIntegerParameterValue ) {
        Integer oldIntegerParameterValue = integerParameterValue;
        integerParameterValue = newIntegerParameterValue;
        boolean oldIntegerParameterValueESet = integerParameterValueESet;
        integerParameterValueESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__INTEGER_PARAMETER_VALUE, oldIntegerParameterValue,
                integerParameterValue, !oldIntegerParameterValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIntegerParameterValue() {
        Integer oldIntegerParameterValue = integerParameterValue;
        boolean oldIntegerParameterValueESet = integerParameterValueESet;
        integerParameterValue = INTEGER_PARAMETER_VALUE_EDEFAULT;
        integerParameterValueESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__INTEGER_PARAMETER_VALUE, oldIntegerParameterValue,
                INTEGER_PARAMETER_VALUE_EDEFAULT, oldIntegerParameterValueESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIntegerParameterValue() {
        return integerParameterValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getParameterNumber() {
        return parameterNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setParameterNumber( Integer newParameterNumber ) {
        Integer oldParameterNumber = parameterNumber;
        parameterNumber = newParameterNumber;
        boolean oldParameterNumberESet = parameterNumberESet;
        parameterNumberESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PARAMETER_NUMBER, oldParameterNumber, parameterNumber,
                !oldParameterNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetParameterNumber() {
        Integer oldParameterNumber = parameterNumber;
        boolean oldParameterNumberESet = parameterNumberESet;
        parameterNumber = PARAMETER_NUMBER_EDEFAULT;
        parameterNumberESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PARAMETER_NUMBER, oldParameterNumber,
                PARAMETER_NUMBER_EDEFAULT, oldParameterNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetParameterNumber() {
        return parameterNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SynchronousMachineUserDefined getSynchronousMachineUserDefined() {
        return synchronousMachineUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSynchronousMachineUserDefined(
            SynchronousMachineUserDefined newSynchronousMachineUserDefined, NotificationChain msgs ) {
        SynchronousMachineUserDefined oldSynchronousMachineUserDefined = synchronousMachineUserDefined;
        synchronousMachineUserDefined = newSynchronousMachineUserDefined;
        boolean oldSynchronousMachineUserDefinedESet = synchronousMachineUserDefinedESet;
        synchronousMachineUserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__SYNCHRONOUS_MACHINE_USER_DEFINED,
                    oldSynchronousMachineUserDefined, newSynchronousMachineUserDefined,
                    !oldSynchronousMachineUserDefinedESet );
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
    public void setSynchronousMachineUserDefined( SynchronousMachineUserDefined newSynchronousMachineUserDefined ) {
        if( newSynchronousMachineUserDefined != synchronousMachineUserDefined ) {
            NotificationChain msgs = null;
            if( synchronousMachineUserDefined != null )
                msgs = ( ( InternalEObject ) synchronousMachineUserDefined ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        SynchronousMachineUserDefined.class, msgs );
            if( newSynchronousMachineUserDefined != null )
                msgs = ( ( InternalEObject ) newSynchronousMachineUserDefined ).eInverseAdd( this,
                        CimPackage.SYNCHRONOUS_MACHINE_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        SynchronousMachineUserDefined.class, msgs );
            msgs = basicSetSynchronousMachineUserDefined( newSynchronousMachineUserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSynchronousMachineUserDefinedESet = synchronousMachineUserDefinedESet;
            synchronousMachineUserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__SYNCHRONOUS_MACHINE_USER_DEFINED,
                    newSynchronousMachineUserDefined, newSynchronousMachineUserDefined,
                    !oldSynchronousMachineUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSynchronousMachineUserDefined( NotificationChain msgs ) {
        SynchronousMachineUserDefined oldSynchronousMachineUserDefined = synchronousMachineUserDefined;
        synchronousMachineUserDefined = null;
        boolean oldSynchronousMachineUserDefinedESet = synchronousMachineUserDefinedESet;
        synchronousMachineUserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__SYNCHRONOUS_MACHINE_USER_DEFINED,
                    oldSynchronousMachineUserDefined, null, oldSynchronousMachineUserDefinedESet );
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
    public void unsetSynchronousMachineUserDefined() {
        if( synchronousMachineUserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) synchronousMachineUserDefined ).eInverseRemove( this,
                    CimPackage.SYNCHRONOUS_MACHINE_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    SynchronousMachineUserDefined.class, msgs );
            msgs = basicUnsetSynchronousMachineUserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSynchronousMachineUserDefinedESet = synchronousMachineUserDefinedESet;
            synchronousMachineUserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__SYNCHRONOUS_MACHINE_USER_DEFINED, null, null,
                    oldSynchronousMachineUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSynchronousMachineUserDefined() {
        return synchronousMachineUserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PowerSystemStabilizerUserDefined getPowerSystemStabilizerUserDefined() {
        return powerSystemStabilizerUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPowerSystemStabilizerUserDefined(
            PowerSystemStabilizerUserDefined newPowerSystemStabilizerUserDefined, NotificationChain msgs ) {
        PowerSystemStabilizerUserDefined oldPowerSystemStabilizerUserDefined = powerSystemStabilizerUserDefined;
        powerSystemStabilizerUserDefined = newPowerSystemStabilizerUserDefined;
        boolean oldPowerSystemStabilizerUserDefinedESet = powerSystemStabilizerUserDefinedESet;
        powerSystemStabilizerUserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__POWER_SYSTEM_STABILIZER_USER_DEFINED,
                    oldPowerSystemStabilizerUserDefined, newPowerSystemStabilizerUserDefined,
                    !oldPowerSystemStabilizerUserDefinedESet );
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
    public void setPowerSystemStabilizerUserDefined(
            PowerSystemStabilizerUserDefined newPowerSystemStabilizerUserDefined ) {
        if( newPowerSystemStabilizerUserDefined != powerSystemStabilizerUserDefined ) {
            NotificationChain msgs = null;
            if( powerSystemStabilizerUserDefined != null )
                msgs = ( ( InternalEObject ) powerSystemStabilizerUserDefined ).eInverseRemove( this,
                        CimPackage.POWER_SYSTEM_STABILIZER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        PowerSystemStabilizerUserDefined.class, msgs );
            if( newPowerSystemStabilizerUserDefined != null )
                msgs = ( ( InternalEObject ) newPowerSystemStabilizerUserDefined ).eInverseAdd( this,
                        CimPackage.POWER_SYSTEM_STABILIZER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        PowerSystemStabilizerUserDefined.class, msgs );
            msgs = basicSetPowerSystemStabilizerUserDefined( newPowerSystemStabilizerUserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemStabilizerUserDefinedESet = powerSystemStabilizerUserDefinedESet;
            powerSystemStabilizerUserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__POWER_SYSTEM_STABILIZER_USER_DEFINED,
                    newPowerSystemStabilizerUserDefined, newPowerSystemStabilizerUserDefined,
                    !oldPowerSystemStabilizerUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPowerSystemStabilizerUserDefined( NotificationChain msgs ) {
        PowerSystemStabilizerUserDefined oldPowerSystemStabilizerUserDefined = powerSystemStabilizerUserDefined;
        powerSystemStabilizerUserDefined = null;
        boolean oldPowerSystemStabilizerUserDefinedESet = powerSystemStabilizerUserDefinedESet;
        powerSystemStabilizerUserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__POWER_SYSTEM_STABILIZER_USER_DEFINED,
                    oldPowerSystemStabilizerUserDefined, null, oldPowerSystemStabilizerUserDefinedESet );
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
    public void unsetPowerSystemStabilizerUserDefined() {
        if( powerSystemStabilizerUserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) powerSystemStabilizerUserDefined ).eInverseRemove( this,
                    CimPackage.POWER_SYSTEM_STABILIZER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    PowerSystemStabilizerUserDefined.class, msgs );
            msgs = basicUnsetPowerSystemStabilizerUserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPowerSystemStabilizerUserDefinedESet = powerSystemStabilizerUserDefinedESet;
            powerSystemStabilizerUserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__POWER_SYSTEM_STABILIZER_USER_DEFINED, null, null,
                    oldPowerSystemStabilizerUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPowerSystemStabilizerUserDefined() {
        return powerSystemStabilizerUserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindType3or4UserDefined getWindType3or4UserDefined() {
        return windType3or4UserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindType3or4UserDefined( WindType3or4UserDefined newWindType3or4UserDefined,
            NotificationChain msgs ) {
        WindType3or4UserDefined oldWindType3or4UserDefined = windType3or4UserDefined;
        windType3or4UserDefined = newWindType3or4UserDefined;
        boolean oldWindType3or4UserDefinedESet = windType3or4UserDefinedESet;
        windType3or4UserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE3OR4_USER_DEFINED, oldWindType3or4UserDefined,
                    newWindType3or4UserDefined, !oldWindType3or4UserDefinedESet );
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
    public void setWindType3or4UserDefined( WindType3or4UserDefined newWindType3or4UserDefined ) {
        if( newWindType3or4UserDefined != windType3or4UserDefined ) {
            NotificationChain msgs = null;
            if( windType3or4UserDefined != null )
                msgs = ( ( InternalEObject ) windType3or4UserDefined ).eInverseRemove( this,
                        CimPackage.WIND_TYPE3OR4_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        WindType3or4UserDefined.class, msgs );
            if( newWindType3or4UserDefined != null )
                msgs = ( ( InternalEObject ) newWindType3or4UserDefined ).eInverseAdd( this,
                        CimPackage.WIND_TYPE3OR4_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        WindType3or4UserDefined.class, msgs );
            msgs = basicSetWindType3or4UserDefined( newWindType3or4UserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindType3or4UserDefinedESet = windType3or4UserDefinedESet;
            windType3or4UserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE3OR4_USER_DEFINED, newWindType3or4UserDefined,
                    newWindType3or4UserDefined, !oldWindType3or4UserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindType3or4UserDefined( NotificationChain msgs ) {
        WindType3or4UserDefined oldWindType3or4UserDefined = windType3or4UserDefined;
        windType3or4UserDefined = null;
        boolean oldWindType3or4UserDefinedESet = windType3or4UserDefinedESet;
        windType3or4UserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE3OR4_USER_DEFINED, oldWindType3or4UserDefined,
                    null, oldWindType3or4UserDefinedESet );
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
    public void unsetWindType3or4UserDefined() {
        if( windType3or4UserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windType3or4UserDefined ).eInverseRemove( this,
                    CimPackage.WIND_TYPE3OR4_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    WindType3or4UserDefined.class, msgs );
            msgs = basicUnsetWindType3or4UserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindType3or4UserDefinedESet = windType3or4UserDefinedESet;
            windType3or4UserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE3OR4_USER_DEFINED, null, null,
                    oldWindType3or4UserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindType3or4UserDefined() {
        return windType3or4UserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DiscontinuousExcitationControlUserDefined getDiscontinuousExcitationControlUserDefined() {
        return discontinuousExcitationControlUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDiscontinuousExcitationControlUserDefined(
            DiscontinuousExcitationControlUserDefined newDiscontinuousExcitationControlUserDefined,
            NotificationChain msgs ) {
        DiscontinuousExcitationControlUserDefined oldDiscontinuousExcitationControlUserDefined = discontinuousExcitationControlUserDefined;
        discontinuousExcitationControlUserDefined = newDiscontinuousExcitationControlUserDefined;
        boolean oldDiscontinuousExcitationControlUserDefinedESet = discontinuousExcitationControlUserDefinedESet;
        discontinuousExcitationControlUserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED,
                    oldDiscontinuousExcitationControlUserDefined, newDiscontinuousExcitationControlUserDefined,
                    !oldDiscontinuousExcitationControlUserDefinedESet );
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
    public void setDiscontinuousExcitationControlUserDefined(
            DiscontinuousExcitationControlUserDefined newDiscontinuousExcitationControlUserDefined ) {
        if( newDiscontinuousExcitationControlUserDefined != discontinuousExcitationControlUserDefined ) {
            NotificationChain msgs = null;
            if( discontinuousExcitationControlUserDefined != null )
                msgs = ( ( InternalEObject ) discontinuousExcitationControlUserDefined ).eInverseRemove( this,
                        CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        DiscontinuousExcitationControlUserDefined.class, msgs );
            if( newDiscontinuousExcitationControlUserDefined != null )
                msgs = ( ( InternalEObject ) newDiscontinuousExcitationControlUserDefined ).eInverseAdd( this,
                        CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        DiscontinuousExcitationControlUserDefined.class, msgs );
            msgs = basicSetDiscontinuousExcitationControlUserDefined( newDiscontinuousExcitationControlUserDefined,
                    msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiscontinuousExcitationControlUserDefinedESet = discontinuousExcitationControlUserDefinedESet;
            discontinuousExcitationControlUserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED,
                    newDiscontinuousExcitationControlUserDefined, newDiscontinuousExcitationControlUserDefined,
                    !oldDiscontinuousExcitationControlUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDiscontinuousExcitationControlUserDefined( NotificationChain msgs ) {
        DiscontinuousExcitationControlUserDefined oldDiscontinuousExcitationControlUserDefined = discontinuousExcitationControlUserDefined;
        discontinuousExcitationControlUserDefined = null;
        boolean oldDiscontinuousExcitationControlUserDefinedESet = discontinuousExcitationControlUserDefinedESet;
        discontinuousExcitationControlUserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED,
                    oldDiscontinuousExcitationControlUserDefined, null,
                    oldDiscontinuousExcitationControlUserDefinedESet );
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
    public void unsetDiscontinuousExcitationControlUserDefined() {
        if( discontinuousExcitationControlUserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) discontinuousExcitationControlUserDefined ).eInverseRemove( this,
                    CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    DiscontinuousExcitationControlUserDefined.class, msgs );
            msgs = basicUnsetDiscontinuousExcitationControlUserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDiscontinuousExcitationControlUserDefinedESet = discontinuousExcitationControlUserDefinedESet;
            discontinuousExcitationControlUserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED, null,
                    null, oldDiscontinuousExcitationControlUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDiscontinuousExcitationControlUserDefined() {
        return discontinuousExcitationControlUserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public LoadUserDefined getLoadUserDefined() {
        return loadUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetLoadUserDefined( LoadUserDefined newLoadUserDefined, NotificationChain msgs ) {
        LoadUserDefined oldLoadUserDefined = loadUserDefined;
        loadUserDefined = newLoadUserDefined;
        boolean oldLoadUserDefinedESet = loadUserDefinedESet;
        loadUserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__LOAD_USER_DEFINED, oldLoadUserDefined,
                    newLoadUserDefined, !oldLoadUserDefinedESet );
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
    public void setLoadUserDefined( LoadUserDefined newLoadUserDefined ) {
        if( newLoadUserDefined != loadUserDefined ) {
            NotificationChain msgs = null;
            if( loadUserDefined != null ) msgs = ( ( InternalEObject ) loadUserDefined ).eInverseRemove( this,
                    CimPackage.LOAD_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS, LoadUserDefined.class, msgs );
            if( newLoadUserDefined != null ) msgs = ( ( InternalEObject ) newLoadUserDefined ).eInverseAdd( this,
                    CimPackage.LOAD_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS, LoadUserDefined.class, msgs );
            msgs = basicSetLoadUserDefined( newLoadUserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadUserDefinedESet = loadUserDefinedESet;
            loadUserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__LOAD_USER_DEFINED, newLoadUserDefined,
                    newLoadUserDefined, !oldLoadUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetLoadUserDefined( NotificationChain msgs ) {
        LoadUserDefined oldLoadUserDefined = loadUserDefined;
        loadUserDefined = null;
        boolean oldLoadUserDefinedESet = loadUserDefinedESet;
        loadUserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__LOAD_USER_DEFINED, oldLoadUserDefined, null,
                    oldLoadUserDefinedESet );
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
    public void unsetLoadUserDefined() {
        if( loadUserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) loadUserDefined ).eInverseRemove( this,
                    CimPackage.LOAD_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS, LoadUserDefined.class, msgs );
            msgs = basicUnsetLoadUserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldLoadUserDefinedESet = loadUserDefinedESet;
            loadUserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__LOAD_USER_DEFINED, null, null,
                    oldLoadUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLoadUserDefined() {
        return loadUserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TurbineGovernorUserDefined getTurbineGovernorUserDefined() {
        return turbineGovernorUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTurbineGovernorUserDefined(
            TurbineGovernorUserDefined newTurbineGovernorUserDefined, NotificationChain msgs ) {
        TurbineGovernorUserDefined oldTurbineGovernorUserDefined = turbineGovernorUserDefined;
        turbineGovernorUserDefined = newTurbineGovernorUserDefined;
        boolean oldTurbineGovernorUserDefinedESet = turbineGovernorUserDefinedESet;
        turbineGovernorUserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_GOVERNOR_USER_DEFINED,
                    oldTurbineGovernorUserDefined, newTurbineGovernorUserDefined, !oldTurbineGovernorUserDefinedESet );
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
    public void setTurbineGovernorUserDefined( TurbineGovernorUserDefined newTurbineGovernorUserDefined ) {
        if( newTurbineGovernorUserDefined != turbineGovernorUserDefined ) {
            NotificationChain msgs = null;
            if( turbineGovernorUserDefined != null )
                msgs = ( ( InternalEObject ) turbineGovernorUserDefined ).eInverseRemove( this,
                        CimPackage.TURBINE_GOVERNOR_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        TurbineGovernorUserDefined.class, msgs );
            if( newTurbineGovernorUserDefined != null )
                msgs = ( ( InternalEObject ) newTurbineGovernorUserDefined ).eInverseAdd( this,
                        CimPackage.TURBINE_GOVERNOR_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        TurbineGovernorUserDefined.class, msgs );
            msgs = basicSetTurbineGovernorUserDefined( newTurbineGovernorUserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTurbineGovernorUserDefinedESet = turbineGovernorUserDefinedESet;
            turbineGovernorUserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_GOVERNOR_USER_DEFINED,
                    newTurbineGovernorUserDefined, newTurbineGovernorUserDefined,
                    !oldTurbineGovernorUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTurbineGovernorUserDefined( NotificationChain msgs ) {
        TurbineGovernorUserDefined oldTurbineGovernorUserDefined = turbineGovernorUserDefined;
        turbineGovernorUserDefined = null;
        boolean oldTurbineGovernorUserDefinedESet = turbineGovernorUserDefinedESet;
        turbineGovernorUserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_GOVERNOR_USER_DEFINED,
                    oldTurbineGovernorUserDefined, null, oldTurbineGovernorUserDefinedESet );
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
    public void unsetTurbineGovernorUserDefined() {
        if( turbineGovernorUserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) turbineGovernorUserDefined ).eInverseRemove( this,
                    CimPackage.TURBINE_GOVERNOR_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    TurbineGovernorUserDefined.class, msgs );
            msgs = basicUnsetTurbineGovernorUserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTurbineGovernorUserDefinedESet = turbineGovernorUserDefinedESet;
            turbineGovernorUserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_GOVERNOR_USER_DEFINED, null, null,
                    oldTurbineGovernorUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTurbineGovernorUserDefined() {
        return turbineGovernorUserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindType1or2UserDefined getWindType1or2UserDefined() {
        return windType1or2UserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindType1or2UserDefined( WindType1or2UserDefined newWindType1or2UserDefined,
            NotificationChain msgs ) {
        WindType1or2UserDefined oldWindType1or2UserDefined = windType1or2UserDefined;
        windType1or2UserDefined = newWindType1or2UserDefined;
        boolean oldWindType1or2UserDefinedESet = windType1or2UserDefinedESet;
        windType1or2UserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE1OR2_USER_DEFINED, oldWindType1or2UserDefined,
                    newWindType1or2UserDefined, !oldWindType1or2UserDefinedESet );
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
    public void setWindType1or2UserDefined( WindType1or2UserDefined newWindType1or2UserDefined ) {
        if( newWindType1or2UserDefined != windType1or2UserDefined ) {
            NotificationChain msgs = null;
            if( windType1or2UserDefined != null )
                msgs = ( ( InternalEObject ) windType1or2UserDefined ).eInverseRemove( this,
                        CimPackage.WIND_TYPE1OR2_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        WindType1or2UserDefined.class, msgs );
            if( newWindType1or2UserDefined != null )
                msgs = ( ( InternalEObject ) newWindType1or2UserDefined ).eInverseAdd( this,
                        CimPackage.WIND_TYPE1OR2_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        WindType1or2UserDefined.class, msgs );
            msgs = basicSetWindType1or2UserDefined( newWindType1or2UserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindType1or2UserDefinedESet = windType1or2UserDefinedESet;
            windType1or2UserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE1OR2_USER_DEFINED, newWindType1or2UserDefined,
                    newWindType1or2UserDefined, !oldWindType1or2UserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindType1or2UserDefined( NotificationChain msgs ) {
        WindType1or2UserDefined oldWindType1or2UserDefined = windType1or2UserDefined;
        windType1or2UserDefined = null;
        boolean oldWindType1or2UserDefinedESet = windType1or2UserDefinedESet;
        windType1or2UserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE1OR2_USER_DEFINED, oldWindType1or2UserDefined,
                    null, oldWindType1or2UserDefinedESet );
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
    public void unsetWindType1or2UserDefined() {
        if( windType1or2UserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windType1or2UserDefined ).eInverseRemove( this,
                    CimPackage.WIND_TYPE1OR2_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    WindType1or2UserDefined.class, msgs );
            msgs = basicUnsetWindType1or2UserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindType1or2UserDefinedESet = windType1or2UserDefinedESet;
            windType1or2UserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE1OR2_USER_DEFINED, null, null,
                    oldWindType1or2UserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindType1or2UserDefined() {
        return windType1or2UserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ExcitationSystemUserDefined getExcitationSystemUserDefined() {
        return excitationSystemUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetExcitationSystemUserDefined(
            ExcitationSystemUserDefined newExcitationSystemUserDefined, NotificationChain msgs ) {
        ExcitationSystemUserDefined oldExcitationSystemUserDefined = excitationSystemUserDefined;
        excitationSystemUserDefined = newExcitationSystemUserDefined;
        boolean oldExcitationSystemUserDefinedESet = excitationSystemUserDefinedESet;
        excitationSystemUserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__EXCITATION_SYSTEM_USER_DEFINED,
                    oldExcitationSystemUserDefined, newExcitationSystemUserDefined,
                    !oldExcitationSystemUserDefinedESet );
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
    public void setExcitationSystemUserDefined( ExcitationSystemUserDefined newExcitationSystemUserDefined ) {
        if( newExcitationSystemUserDefined != excitationSystemUserDefined ) {
            NotificationChain msgs = null;
            if( excitationSystemUserDefined != null )
                msgs = ( ( InternalEObject ) excitationSystemUserDefined ).eInverseRemove( this,
                        CimPackage.EXCITATION_SYSTEM_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        ExcitationSystemUserDefined.class, msgs );
            if( newExcitationSystemUserDefined != null )
                msgs = ( ( InternalEObject ) newExcitationSystemUserDefined ).eInverseAdd( this,
                        CimPackage.EXCITATION_SYSTEM_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        ExcitationSystemUserDefined.class, msgs );
            msgs = basicSetExcitationSystemUserDefined( newExcitationSystemUserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldExcitationSystemUserDefinedESet = excitationSystemUserDefinedESet;
            excitationSystemUserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__EXCITATION_SYSTEM_USER_DEFINED,
                    newExcitationSystemUserDefined, newExcitationSystemUserDefined,
                    !oldExcitationSystemUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetExcitationSystemUserDefined( NotificationChain msgs ) {
        ExcitationSystemUserDefined oldExcitationSystemUserDefined = excitationSystemUserDefined;
        excitationSystemUserDefined = null;
        boolean oldExcitationSystemUserDefinedESet = excitationSystemUserDefinedESet;
        excitationSystemUserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__EXCITATION_SYSTEM_USER_DEFINED,
                    oldExcitationSystemUserDefined, null, oldExcitationSystemUserDefinedESet );
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
    public void unsetExcitationSystemUserDefined() {
        if( excitationSystemUserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) excitationSystemUserDefined ).eInverseRemove( this,
                    CimPackage.EXCITATION_SYSTEM_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    ExcitationSystemUserDefined.class, msgs );
            msgs = basicUnsetExcitationSystemUserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldExcitationSystemUserDefinedESet = excitationSystemUserDefinedESet;
            excitationSystemUserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__EXCITATION_SYSTEM_USER_DEFINED, null, null,
                    oldExcitationSystemUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetExcitationSystemUserDefined() {
        return excitationSystemUserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageAdjusterUserDefined getVoltageAdjusterUserDefined() {
        return voltageAdjusterUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVoltageAdjusterUserDefined(
            VoltageAdjusterUserDefined newVoltageAdjusterUserDefined, NotificationChain msgs ) {
        VoltageAdjusterUserDefined oldVoltageAdjusterUserDefined = voltageAdjusterUserDefined;
        voltageAdjusterUserDefined = newVoltageAdjusterUserDefined;
        boolean oldVoltageAdjusterUserDefinedESet = voltageAdjusterUserDefinedESet;
        voltageAdjusterUserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_ADJUSTER_USER_DEFINED,
                    oldVoltageAdjusterUserDefined, newVoltageAdjusterUserDefined, !oldVoltageAdjusterUserDefinedESet );
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
    public void setVoltageAdjusterUserDefined( VoltageAdjusterUserDefined newVoltageAdjusterUserDefined ) {
        if( newVoltageAdjusterUserDefined != voltageAdjusterUserDefined ) {
            NotificationChain msgs = null;
            if( voltageAdjusterUserDefined != null )
                msgs = ( ( InternalEObject ) voltageAdjusterUserDefined ).eInverseRemove( this,
                        CimPackage.VOLTAGE_ADJUSTER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        VoltageAdjusterUserDefined.class, msgs );
            if( newVoltageAdjusterUserDefined != null )
                msgs = ( ( InternalEObject ) newVoltageAdjusterUserDefined ).eInverseAdd( this,
                        CimPackage.VOLTAGE_ADJUSTER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        VoltageAdjusterUserDefined.class, msgs );
            msgs = basicSetVoltageAdjusterUserDefined( newVoltageAdjusterUserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageAdjusterUserDefinedESet = voltageAdjusterUserDefinedESet;
            voltageAdjusterUserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_ADJUSTER_USER_DEFINED,
                    newVoltageAdjusterUserDefined, newVoltageAdjusterUserDefined,
                    !oldVoltageAdjusterUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVoltageAdjusterUserDefined( NotificationChain msgs ) {
        VoltageAdjusterUserDefined oldVoltageAdjusterUserDefined = voltageAdjusterUserDefined;
        voltageAdjusterUserDefined = null;
        boolean oldVoltageAdjusterUserDefinedESet = voltageAdjusterUserDefinedESet;
        voltageAdjusterUserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_ADJUSTER_USER_DEFINED,
                    oldVoltageAdjusterUserDefined, null, oldVoltageAdjusterUserDefinedESet );
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
    public void unsetVoltageAdjusterUserDefined() {
        if( voltageAdjusterUserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) voltageAdjusterUserDefined ).eInverseRemove( this,
                    CimPackage.VOLTAGE_ADJUSTER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    VoltageAdjusterUserDefined.class, msgs );
            msgs = basicUnsetVoltageAdjusterUserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageAdjusterUserDefinedESet = voltageAdjusterUserDefinedESet;
            voltageAdjusterUserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_ADJUSTER_USER_DEFINED, null, null,
                    oldVoltageAdjusterUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageAdjusterUserDefined() {
        return voltageAdjusterUserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArControllerType2UserDefined getPFVArControllerType2UserDefined() {
        return pfvArControllerType2UserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPFVArControllerType2UserDefined(
            PFVArControllerType2UserDefined newPFVArControllerType2UserDefined, NotificationChain msgs ) {
        PFVArControllerType2UserDefined oldPFVArControllerType2UserDefined = pfvArControllerType2UserDefined;
        pfvArControllerType2UserDefined = newPFVArControllerType2UserDefined;
        boolean oldPFVArControllerType2UserDefinedESet = pfvArControllerType2UserDefinedESet;
        pfvArControllerType2UserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_USER_DEFINED,
                    oldPFVArControllerType2UserDefined, newPFVArControllerType2UserDefined,
                    !oldPFVArControllerType2UserDefinedESet );
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
    public void setPFVArControllerType2UserDefined(
            PFVArControllerType2UserDefined newPFVArControllerType2UserDefined ) {
        if( newPFVArControllerType2UserDefined != pfvArControllerType2UserDefined ) {
            NotificationChain msgs = null;
            if( pfvArControllerType2UserDefined != null )
                msgs = ( ( InternalEObject ) pfvArControllerType2UserDefined ).eInverseRemove( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE2_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        PFVArControllerType2UserDefined.class, msgs );
            if( newPFVArControllerType2UserDefined != null )
                msgs = ( ( InternalEObject ) newPFVArControllerType2UserDefined ).eInverseAdd( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE2_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        PFVArControllerType2UserDefined.class, msgs );
            msgs = basicSetPFVArControllerType2UserDefined( newPFVArControllerType2UserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPFVArControllerType2UserDefinedESet = pfvArControllerType2UserDefinedESet;
            pfvArControllerType2UserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_USER_DEFINED,
                    newPFVArControllerType2UserDefined, newPFVArControllerType2UserDefined,
                    !oldPFVArControllerType2UserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPFVArControllerType2UserDefined( NotificationChain msgs ) {
        PFVArControllerType2UserDefined oldPFVArControllerType2UserDefined = pfvArControllerType2UserDefined;
        pfvArControllerType2UserDefined = null;
        boolean oldPFVArControllerType2UserDefinedESet = pfvArControllerType2UserDefinedESet;
        pfvArControllerType2UserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_USER_DEFINED,
                    oldPFVArControllerType2UserDefined, null, oldPFVArControllerType2UserDefinedESet );
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
    public void unsetPFVArControllerType2UserDefined() {
        if( pfvArControllerType2UserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) pfvArControllerType2UserDefined ).eInverseRemove( this,
                    CimPackage.PFV_AR_CONTROLLER_TYPE2_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    PFVArControllerType2UserDefined.class, msgs );
            msgs = basicUnsetPFVArControllerType2UserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPFVArControllerType2UserDefinedESet = pfvArControllerType2UserDefinedESet;
            pfvArControllerType2UserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_USER_DEFINED, null, null,
                    oldPFVArControllerType2UserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPFVArControllerType2UserDefined() {
        return pfvArControllerType2UserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TurbineLoadControllerUserDefined getTurbineLoadControllerUserDefined() {
        return turbineLoadControllerUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTurbineLoadControllerUserDefined(
            TurbineLoadControllerUserDefined newTurbineLoadControllerUserDefined, NotificationChain msgs ) {
        TurbineLoadControllerUserDefined oldTurbineLoadControllerUserDefined = turbineLoadControllerUserDefined;
        turbineLoadControllerUserDefined = newTurbineLoadControllerUserDefined;
        boolean oldTurbineLoadControllerUserDefinedESet = turbineLoadControllerUserDefinedESet;
        turbineLoadControllerUserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_LOAD_CONTROLLER_USER_DEFINED,
                    oldTurbineLoadControllerUserDefined, newTurbineLoadControllerUserDefined,
                    !oldTurbineLoadControllerUserDefinedESet );
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
    public void setTurbineLoadControllerUserDefined(
            TurbineLoadControllerUserDefined newTurbineLoadControllerUserDefined ) {
        if( newTurbineLoadControllerUserDefined != turbineLoadControllerUserDefined ) {
            NotificationChain msgs = null;
            if( turbineLoadControllerUserDefined != null )
                msgs = ( ( InternalEObject ) turbineLoadControllerUserDefined ).eInverseRemove( this,
                        CimPackage.TURBINE_LOAD_CONTROLLER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        TurbineLoadControllerUserDefined.class, msgs );
            if( newTurbineLoadControllerUserDefined != null )
                msgs = ( ( InternalEObject ) newTurbineLoadControllerUserDefined ).eInverseAdd( this,
                        CimPackage.TURBINE_LOAD_CONTROLLER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        TurbineLoadControllerUserDefined.class, msgs );
            msgs = basicSetTurbineLoadControllerUserDefined( newTurbineLoadControllerUserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTurbineLoadControllerUserDefinedESet = turbineLoadControllerUserDefinedESet;
            turbineLoadControllerUserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_LOAD_CONTROLLER_USER_DEFINED,
                    newTurbineLoadControllerUserDefined, newTurbineLoadControllerUserDefined,
                    !oldTurbineLoadControllerUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTurbineLoadControllerUserDefined( NotificationChain msgs ) {
        TurbineLoadControllerUserDefined oldTurbineLoadControllerUserDefined = turbineLoadControllerUserDefined;
        turbineLoadControllerUserDefined = null;
        boolean oldTurbineLoadControllerUserDefinedESet = turbineLoadControllerUserDefinedESet;
        turbineLoadControllerUserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_LOAD_CONTROLLER_USER_DEFINED,
                    oldTurbineLoadControllerUserDefined, null, oldTurbineLoadControllerUserDefinedESet );
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
    public void unsetTurbineLoadControllerUserDefined() {
        if( turbineLoadControllerUserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) turbineLoadControllerUserDefined ).eInverseRemove( this,
                    CimPackage.TURBINE_LOAD_CONTROLLER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    TurbineLoadControllerUserDefined.class, msgs );
            msgs = basicUnsetTurbineLoadControllerUserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTurbineLoadControllerUserDefinedESet = turbineLoadControllerUserDefinedESet;
            turbineLoadControllerUserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_LOAD_CONTROLLER_USER_DEFINED, null, null,
                    oldTurbineLoadControllerUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTurbineLoadControllerUserDefined() {
        return turbineLoadControllerUserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public UnderexcitationLimiterUserDefined getUnderexcitationLimiterUserDefined() {
        return underexcitationLimiterUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetUnderexcitationLimiterUserDefined(
            UnderexcitationLimiterUserDefined newUnderexcitationLimiterUserDefined, NotificationChain msgs ) {
        UnderexcitationLimiterUserDefined oldUnderexcitationLimiterUserDefined = underexcitationLimiterUserDefined;
        underexcitationLimiterUserDefined = newUnderexcitationLimiterUserDefined;
        boolean oldUnderexcitationLimiterUserDefinedESet = underexcitationLimiterUserDefinedESet;
        underexcitationLimiterUserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__UNDEREXCITATION_LIMITER_USER_DEFINED,
                    oldUnderexcitationLimiterUserDefined, newUnderexcitationLimiterUserDefined,
                    !oldUnderexcitationLimiterUserDefinedESet );
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
    public void setUnderexcitationLimiterUserDefined(
            UnderexcitationLimiterUserDefined newUnderexcitationLimiterUserDefined ) {
        if( newUnderexcitationLimiterUserDefined != underexcitationLimiterUserDefined ) {
            NotificationChain msgs = null;
            if( underexcitationLimiterUserDefined != null )
                msgs = ( ( InternalEObject ) underexcitationLimiterUserDefined ).eInverseRemove( this,
                        CimPackage.UNDEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        UnderexcitationLimiterUserDefined.class, msgs );
            if( newUnderexcitationLimiterUserDefined != null )
                msgs = ( ( InternalEObject ) newUnderexcitationLimiterUserDefined ).eInverseAdd( this,
                        CimPackage.UNDEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        UnderexcitationLimiterUserDefined.class, msgs );
            msgs = basicSetUnderexcitationLimiterUserDefined( newUnderexcitationLimiterUserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUnderexcitationLimiterUserDefinedESet = underexcitationLimiterUserDefinedESet;
            underexcitationLimiterUserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__UNDEREXCITATION_LIMITER_USER_DEFINED,
                    newUnderexcitationLimiterUserDefined, newUnderexcitationLimiterUserDefined,
                    !oldUnderexcitationLimiterUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetUnderexcitationLimiterUserDefined( NotificationChain msgs ) {
        UnderexcitationLimiterUserDefined oldUnderexcitationLimiterUserDefined = underexcitationLimiterUserDefined;
        underexcitationLimiterUserDefined = null;
        boolean oldUnderexcitationLimiterUserDefinedESet = underexcitationLimiterUserDefinedESet;
        underexcitationLimiterUserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__UNDEREXCITATION_LIMITER_USER_DEFINED,
                    oldUnderexcitationLimiterUserDefined, null, oldUnderexcitationLimiterUserDefinedESet );
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
    public void unsetUnderexcitationLimiterUserDefined() {
        if( underexcitationLimiterUserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) underexcitationLimiterUserDefined ).eInverseRemove( this,
                    CimPackage.UNDEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    UnderexcitationLimiterUserDefined.class, msgs );
            msgs = basicUnsetUnderexcitationLimiterUserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldUnderexcitationLimiterUserDefinedESet = underexcitationLimiterUserDefinedESet;
            underexcitationLimiterUserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__UNDEREXCITATION_LIMITER_USER_DEFINED, null, null,
                    oldUnderexcitationLimiterUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetUnderexcitationLimiterUserDefined() {
        return underexcitationLimiterUserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachineUserDefined getAsynchronousMachineUserDefined() {
        return asynchronousMachineUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAsynchronousMachineUserDefined(
            AsynchronousMachineUserDefined newAsynchronousMachineUserDefined, NotificationChain msgs ) {
        AsynchronousMachineUserDefined oldAsynchronousMachineUserDefined = asynchronousMachineUserDefined;
        asynchronousMachineUserDefined = newAsynchronousMachineUserDefined;
        boolean oldAsynchronousMachineUserDefinedESet = asynchronousMachineUserDefinedESet;
        asynchronousMachineUserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__ASYNCHRONOUS_MACHINE_USER_DEFINED,
                    oldAsynchronousMachineUserDefined, newAsynchronousMachineUserDefined,
                    !oldAsynchronousMachineUserDefinedESet );
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
    public void setAsynchronousMachineUserDefined( AsynchronousMachineUserDefined newAsynchronousMachineUserDefined ) {
        if( newAsynchronousMachineUserDefined != asynchronousMachineUserDefined ) {
            NotificationChain msgs = null;
            if( asynchronousMachineUserDefined != null )
                msgs = ( ( InternalEObject ) asynchronousMachineUserDefined ).eInverseRemove( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        AsynchronousMachineUserDefined.class, msgs );
            if( newAsynchronousMachineUserDefined != null )
                msgs = ( ( InternalEObject ) newAsynchronousMachineUserDefined ).eInverseAdd( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        AsynchronousMachineUserDefined.class, msgs );
            msgs = basicSetAsynchronousMachineUserDefined( newAsynchronousMachineUserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAsynchronousMachineUserDefinedESet = asynchronousMachineUserDefinedESet;
            asynchronousMachineUserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__ASYNCHRONOUS_MACHINE_USER_DEFINED,
                    newAsynchronousMachineUserDefined, newAsynchronousMachineUserDefined,
                    !oldAsynchronousMachineUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAsynchronousMachineUserDefined( NotificationChain msgs ) {
        AsynchronousMachineUserDefined oldAsynchronousMachineUserDefined = asynchronousMachineUserDefined;
        asynchronousMachineUserDefined = null;
        boolean oldAsynchronousMachineUserDefinedESet = asynchronousMachineUserDefinedESet;
        asynchronousMachineUserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__ASYNCHRONOUS_MACHINE_USER_DEFINED,
                    oldAsynchronousMachineUserDefined, null, oldAsynchronousMachineUserDefinedESet );
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
    public void unsetAsynchronousMachineUserDefined() {
        if( asynchronousMachineUserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) asynchronousMachineUserDefined ).eInverseRemove( this,
                    CimPackage.ASYNCHRONOUS_MACHINE_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    AsynchronousMachineUserDefined.class, msgs );
            msgs = basicUnsetAsynchronousMachineUserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAsynchronousMachineUserDefinedESet = asynchronousMachineUserDefinedESet;
            asynchronousMachineUserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__ASYNCHRONOUS_MACHINE_USER_DEFINED, null, null,
                    oldAsynchronousMachineUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsynchronousMachineUserDefined() {
        return asynchronousMachineUserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public PFVArControllerType1UserDefined getPFVArControllerType1UserDefined() {
        return pfvArControllerType1UserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPFVArControllerType1UserDefined(
            PFVArControllerType1UserDefined newPFVArControllerType1UserDefined, NotificationChain msgs ) {
        PFVArControllerType1UserDefined oldPFVArControllerType1UserDefined = pfvArControllerType1UserDefined;
        pfvArControllerType1UserDefined = newPFVArControllerType1UserDefined;
        boolean oldPFVArControllerType1UserDefinedESet = pfvArControllerType1UserDefinedESet;
        pfvArControllerType1UserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_USER_DEFINED,
                    oldPFVArControllerType1UserDefined, newPFVArControllerType1UserDefined,
                    !oldPFVArControllerType1UserDefinedESet );
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
    public void setPFVArControllerType1UserDefined(
            PFVArControllerType1UserDefined newPFVArControllerType1UserDefined ) {
        if( newPFVArControllerType1UserDefined != pfvArControllerType1UserDefined ) {
            NotificationChain msgs = null;
            if( pfvArControllerType1UserDefined != null )
                msgs = ( ( InternalEObject ) pfvArControllerType1UserDefined ).eInverseRemove( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE1_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        PFVArControllerType1UserDefined.class, msgs );
            if( newPFVArControllerType1UserDefined != null )
                msgs = ( ( InternalEObject ) newPFVArControllerType1UserDefined ).eInverseAdd( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE1_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        PFVArControllerType1UserDefined.class, msgs );
            msgs = basicSetPFVArControllerType1UserDefined( newPFVArControllerType1UserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPFVArControllerType1UserDefinedESet = pfvArControllerType1UserDefinedESet;
            pfvArControllerType1UserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_USER_DEFINED,
                    newPFVArControllerType1UserDefined, newPFVArControllerType1UserDefined,
                    !oldPFVArControllerType1UserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPFVArControllerType1UserDefined( NotificationChain msgs ) {
        PFVArControllerType1UserDefined oldPFVArControllerType1UserDefined = pfvArControllerType1UserDefined;
        pfvArControllerType1UserDefined = null;
        boolean oldPFVArControllerType1UserDefinedESet = pfvArControllerType1UserDefinedESet;
        pfvArControllerType1UserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_USER_DEFINED,
                    oldPFVArControllerType1UserDefined, null, oldPFVArControllerType1UserDefinedESet );
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
    public void unsetPFVArControllerType1UserDefined() {
        if( pfvArControllerType1UserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) pfvArControllerType1UserDefined ).eInverseRemove( this,
                    CimPackage.PFV_AR_CONTROLLER_TYPE1_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    PFVArControllerType1UserDefined.class, msgs );
            msgs = basicUnsetPFVArControllerType1UserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPFVArControllerType1UserDefinedESet = pfvArControllerType1UserDefinedESet;
            pfvArControllerType1UserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_USER_DEFINED, null, null,
                    oldPFVArControllerType1UserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPFVArControllerType1UserDefined() {
        return pfvArControllerType1UserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public OverexcitationLimiterUserDefined getOverexcitationLimiterUserDefined() {
        return overexcitationLimiterUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetOverexcitationLimiterUserDefined(
            OverexcitationLimiterUserDefined newOverexcitationLimiterUserDefined, NotificationChain msgs ) {
        OverexcitationLimiterUserDefined oldOverexcitationLimiterUserDefined = overexcitationLimiterUserDefined;
        overexcitationLimiterUserDefined = newOverexcitationLimiterUserDefined;
        boolean oldOverexcitationLimiterUserDefinedESet = overexcitationLimiterUserDefinedESet;
        overexcitationLimiterUserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__OVEREXCITATION_LIMITER_USER_DEFINED,
                    oldOverexcitationLimiterUserDefined, newOverexcitationLimiterUserDefined,
                    !oldOverexcitationLimiterUserDefinedESet );
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
    public void setOverexcitationLimiterUserDefined(
            OverexcitationLimiterUserDefined newOverexcitationLimiterUserDefined ) {
        if( newOverexcitationLimiterUserDefined != overexcitationLimiterUserDefined ) {
            NotificationChain msgs = null;
            if( overexcitationLimiterUserDefined != null )
                msgs = ( ( InternalEObject ) overexcitationLimiterUserDefined ).eInverseRemove( this,
                        CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        OverexcitationLimiterUserDefined.class, msgs );
            if( newOverexcitationLimiterUserDefined != null )
                msgs = ( ( InternalEObject ) newOverexcitationLimiterUserDefined ).eInverseAdd( this,
                        CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        OverexcitationLimiterUserDefined.class, msgs );
            msgs = basicSetOverexcitationLimiterUserDefined( newOverexcitationLimiterUserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOverexcitationLimiterUserDefinedESet = overexcitationLimiterUserDefinedESet;
            overexcitationLimiterUserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__OVEREXCITATION_LIMITER_USER_DEFINED,
                    newOverexcitationLimiterUserDefined, newOverexcitationLimiterUserDefined,
                    !oldOverexcitationLimiterUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetOverexcitationLimiterUserDefined( NotificationChain msgs ) {
        OverexcitationLimiterUserDefined oldOverexcitationLimiterUserDefined = overexcitationLimiterUserDefined;
        overexcitationLimiterUserDefined = null;
        boolean oldOverexcitationLimiterUserDefinedESet = overexcitationLimiterUserDefinedESet;
        overexcitationLimiterUserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__OVEREXCITATION_LIMITER_USER_DEFINED,
                    oldOverexcitationLimiterUserDefined, null, oldOverexcitationLimiterUserDefinedESet );
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
    public void unsetOverexcitationLimiterUserDefined() {
        if( overexcitationLimiterUserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) overexcitationLimiterUserDefined ).eInverseRemove( this,
                    CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    OverexcitationLimiterUserDefined.class, msgs );
            msgs = basicUnsetOverexcitationLimiterUserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldOverexcitationLimiterUserDefinedESet = overexcitationLimiterUserDefinedESet;
            overexcitationLimiterUserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__OVEREXCITATION_LIMITER_USER_DEFINED, null, null,
                    oldOverexcitationLimiterUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOverexcitationLimiterUserDefined() {
        return overexcitationLimiterUserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public WindPlantUserDefined getWindPlantUserDefined() {
        return windPlantUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetWindPlantUserDefined( WindPlantUserDefined newWindPlantUserDefined,
            NotificationChain msgs ) {
        WindPlantUserDefined oldWindPlantUserDefined = windPlantUserDefined;
        windPlantUserDefined = newWindPlantUserDefined;
        boolean oldWindPlantUserDefinedESet = windPlantUserDefinedESet;
        windPlantUserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_PLANT_USER_DEFINED, oldWindPlantUserDefined,
                    newWindPlantUserDefined, !oldWindPlantUserDefinedESet );
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
    public void setWindPlantUserDefined( WindPlantUserDefined newWindPlantUserDefined ) {
        if( newWindPlantUserDefined != windPlantUserDefined ) {
            NotificationChain msgs = null;
            if( windPlantUserDefined != null ) msgs = ( ( InternalEObject ) windPlantUserDefined ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS, WindPlantUserDefined.class,
                    msgs );
            if( newWindPlantUserDefined != null )
                msgs = ( ( InternalEObject ) newWindPlantUserDefined ).eInverseAdd( this,
                        CimPackage.WIND_PLANT_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS, WindPlantUserDefined.class,
                        msgs );
            msgs = basicSetWindPlantUserDefined( newWindPlantUserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantUserDefinedESet = windPlantUserDefinedESet;
            windPlantUserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_PLANT_USER_DEFINED, newWindPlantUserDefined,
                    newWindPlantUserDefined, !oldWindPlantUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetWindPlantUserDefined( NotificationChain msgs ) {
        WindPlantUserDefined oldWindPlantUserDefined = windPlantUserDefined;
        windPlantUserDefined = null;
        boolean oldWindPlantUserDefinedESet = windPlantUserDefinedESet;
        windPlantUserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_PLANT_USER_DEFINED, oldWindPlantUserDefined, null,
                    oldWindPlantUserDefinedESet );
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
    public void unsetWindPlantUserDefined() {
        if( windPlantUserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) windPlantUserDefined ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS, WindPlantUserDefined.class,
                    msgs );
            msgs = basicUnsetWindPlantUserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldWindPlantUserDefinedESet = windPlantUserDefinedESet;
            windPlantUserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_PLANT_USER_DEFINED, null, null,
                    oldWindPlantUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWindPlantUserDefined() {
        return windPlantUserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public MechanicalLoadUserDefined getMechanicalLoadUserDefined() {
        return mechanicalLoadUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetMechanicalLoadUserDefined( MechanicalLoadUserDefined newMechanicalLoadUserDefined,
            NotificationChain msgs ) {
        MechanicalLoadUserDefined oldMechanicalLoadUserDefined = mechanicalLoadUserDefined;
        mechanicalLoadUserDefined = newMechanicalLoadUserDefined;
        boolean oldMechanicalLoadUserDefinedESet = mechanicalLoadUserDefinedESet;
        mechanicalLoadUserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__MECHANICAL_LOAD_USER_DEFINED,
                    oldMechanicalLoadUserDefined, newMechanicalLoadUserDefined, !oldMechanicalLoadUserDefinedESet );
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
    public void setMechanicalLoadUserDefined( MechanicalLoadUserDefined newMechanicalLoadUserDefined ) {
        if( newMechanicalLoadUserDefined != mechanicalLoadUserDefined ) {
            NotificationChain msgs = null;
            if( mechanicalLoadUserDefined != null )
                msgs = ( ( InternalEObject ) mechanicalLoadUserDefined ).eInverseRemove( this,
                        CimPackage.MECHANICAL_LOAD_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        MechanicalLoadUserDefined.class, msgs );
            if( newMechanicalLoadUserDefined != null )
                msgs = ( ( InternalEObject ) newMechanicalLoadUserDefined ).eInverseAdd( this,
                        CimPackage.MECHANICAL_LOAD_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        MechanicalLoadUserDefined.class, msgs );
            msgs = basicSetMechanicalLoadUserDefined( newMechanicalLoadUserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMechanicalLoadUserDefinedESet = mechanicalLoadUserDefinedESet;
            mechanicalLoadUserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__MECHANICAL_LOAD_USER_DEFINED,
                    newMechanicalLoadUserDefined, newMechanicalLoadUserDefined, !oldMechanicalLoadUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetMechanicalLoadUserDefined( NotificationChain msgs ) {
        MechanicalLoadUserDefined oldMechanicalLoadUserDefined = mechanicalLoadUserDefined;
        mechanicalLoadUserDefined = null;
        boolean oldMechanicalLoadUserDefinedESet = mechanicalLoadUserDefinedESet;
        mechanicalLoadUserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__MECHANICAL_LOAD_USER_DEFINED,
                    oldMechanicalLoadUserDefined, null, oldMechanicalLoadUserDefinedESet );
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
    public void unsetMechanicalLoadUserDefined() {
        if( mechanicalLoadUserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) mechanicalLoadUserDefined ).eInverseRemove( this,
                    CimPackage.MECHANICAL_LOAD_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    MechanicalLoadUserDefined.class, msgs );
            msgs = basicUnsetMechanicalLoadUserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldMechanicalLoadUserDefinedESet = mechanicalLoadUserDefinedESet;
            mechanicalLoadUserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__MECHANICAL_LOAD_USER_DEFINED, null, null,
                    oldMechanicalLoadUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMechanicalLoadUserDefined() {
        return mechanicalLoadUserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public VoltageCompensatorUserDefined getVoltageCompensatorUserDefined() {
        return voltageCompensatorUserDefined;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetVoltageCompensatorUserDefined(
            VoltageCompensatorUserDefined newVoltageCompensatorUserDefined, NotificationChain msgs ) {
        VoltageCompensatorUserDefined oldVoltageCompensatorUserDefined = voltageCompensatorUserDefined;
        voltageCompensatorUserDefined = newVoltageCompensatorUserDefined;
        boolean oldVoltageCompensatorUserDefinedESet = voltageCompensatorUserDefinedESet;
        voltageCompensatorUserDefinedESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_COMPENSATOR_USER_DEFINED,
                    oldVoltageCompensatorUserDefined, newVoltageCompensatorUserDefined,
                    !oldVoltageCompensatorUserDefinedESet );
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
    public void setVoltageCompensatorUserDefined( VoltageCompensatorUserDefined newVoltageCompensatorUserDefined ) {
        if( newVoltageCompensatorUserDefined != voltageCompensatorUserDefined ) {
            NotificationChain msgs = null;
            if( voltageCompensatorUserDefined != null )
                msgs = ( ( InternalEObject ) voltageCompensatorUserDefined ).eInverseRemove( this,
                        CimPackage.VOLTAGE_COMPENSATOR_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        VoltageCompensatorUserDefined.class, msgs );
            if( newVoltageCompensatorUserDefined != null )
                msgs = ( ( InternalEObject ) newVoltageCompensatorUserDefined ).eInverseAdd( this,
                        CimPackage.VOLTAGE_COMPENSATOR_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        VoltageCompensatorUserDefined.class, msgs );
            msgs = basicSetVoltageCompensatorUserDefined( newVoltageCompensatorUserDefined, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageCompensatorUserDefinedESet = voltageCompensatorUserDefinedESet;
            voltageCompensatorUserDefinedESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_COMPENSATOR_USER_DEFINED,
                    newVoltageCompensatorUserDefined, newVoltageCompensatorUserDefined,
                    !oldVoltageCompensatorUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetVoltageCompensatorUserDefined( NotificationChain msgs ) {
        VoltageCompensatorUserDefined oldVoltageCompensatorUserDefined = voltageCompensatorUserDefined;
        voltageCompensatorUserDefined = null;
        boolean oldVoltageCompensatorUserDefinedESet = voltageCompensatorUserDefinedESet;
        voltageCompensatorUserDefinedESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_COMPENSATOR_USER_DEFINED,
                    oldVoltageCompensatorUserDefined, null, oldVoltageCompensatorUserDefinedESet );
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
    public void unsetVoltageCompensatorUserDefined() {
        if( voltageCompensatorUserDefined != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) voltageCompensatorUserDefined ).eInverseRemove( this,
                    CimPackage.VOLTAGE_COMPENSATOR_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                    VoltageCompensatorUserDefined.class, msgs );
            msgs = basicUnsetVoltageCompensatorUserDefined( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldVoltageCompensatorUserDefinedESet = voltageCompensatorUserDefinedESet;
            voltageCompensatorUserDefinedESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_COMPENSATOR_USER_DEFINED, null, null,
                    oldVoltageCompensatorUserDefinedESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltageCompensatorUserDefined() {
        return voltageCompensatorUserDefinedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__SYNCHRONOUS_MACHINE_USER_DEFINED:
            if( synchronousMachineUserDefined != null )
                msgs = ( ( InternalEObject ) synchronousMachineUserDefined ).eInverseRemove( this,
                        CimPackage.SYNCHRONOUS_MACHINE_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        SynchronousMachineUserDefined.class, msgs );
            return basicSetSynchronousMachineUserDefined( ( SynchronousMachineUserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__POWER_SYSTEM_STABILIZER_USER_DEFINED:
            if( powerSystemStabilizerUserDefined != null )
                msgs = ( ( InternalEObject ) powerSystemStabilizerUserDefined ).eInverseRemove( this,
                        CimPackage.POWER_SYSTEM_STABILIZER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        PowerSystemStabilizerUserDefined.class, msgs );
            return basicSetPowerSystemStabilizerUserDefined( ( PowerSystemStabilizerUserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE3OR4_USER_DEFINED:
            if( windType3or4UserDefined != null )
                msgs = ( ( InternalEObject ) windType3or4UserDefined ).eInverseRemove( this,
                        CimPackage.WIND_TYPE3OR4_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        WindType3or4UserDefined.class, msgs );
            return basicSetWindType3or4UserDefined( ( WindType3or4UserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED:
            if( discontinuousExcitationControlUserDefined != null )
                msgs = ( ( InternalEObject ) discontinuousExcitationControlUserDefined ).eInverseRemove( this,
                        CimPackage.DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        DiscontinuousExcitationControlUserDefined.class, msgs );
            return basicSetDiscontinuousExcitationControlUserDefined(
                    ( DiscontinuousExcitationControlUserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__LOAD_USER_DEFINED:
            if( loadUserDefined != null ) msgs = ( ( InternalEObject ) loadUserDefined ).eInverseRemove( this,
                    CimPackage.LOAD_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS, LoadUserDefined.class, msgs );
            return basicSetLoadUserDefined( ( LoadUserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_GOVERNOR_USER_DEFINED:
            if( turbineGovernorUserDefined != null )
                msgs = ( ( InternalEObject ) turbineGovernorUserDefined ).eInverseRemove( this,
                        CimPackage.TURBINE_GOVERNOR_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        TurbineGovernorUserDefined.class, msgs );
            return basicSetTurbineGovernorUserDefined( ( TurbineGovernorUserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE1OR2_USER_DEFINED:
            if( windType1or2UserDefined != null )
                msgs = ( ( InternalEObject ) windType1or2UserDefined ).eInverseRemove( this,
                        CimPackage.WIND_TYPE1OR2_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        WindType1or2UserDefined.class, msgs );
            return basicSetWindType1or2UserDefined( ( WindType1or2UserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__EXCITATION_SYSTEM_USER_DEFINED:
            if( excitationSystemUserDefined != null )
                msgs = ( ( InternalEObject ) excitationSystemUserDefined ).eInverseRemove( this,
                        CimPackage.EXCITATION_SYSTEM_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        ExcitationSystemUserDefined.class, msgs );
            return basicSetExcitationSystemUserDefined( ( ExcitationSystemUserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_ADJUSTER_USER_DEFINED:
            if( voltageAdjusterUserDefined != null )
                msgs = ( ( InternalEObject ) voltageAdjusterUserDefined ).eInverseRemove( this,
                        CimPackage.VOLTAGE_ADJUSTER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        VoltageAdjusterUserDefined.class, msgs );
            return basicSetVoltageAdjusterUserDefined( ( VoltageAdjusterUserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_USER_DEFINED:
            if( pfvArControllerType2UserDefined != null )
                msgs = ( ( InternalEObject ) pfvArControllerType2UserDefined ).eInverseRemove( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE2_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        PFVArControllerType2UserDefined.class, msgs );
            return basicSetPFVArControllerType2UserDefined( ( PFVArControllerType2UserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_LOAD_CONTROLLER_USER_DEFINED:
            if( turbineLoadControllerUserDefined != null )
                msgs = ( ( InternalEObject ) turbineLoadControllerUserDefined ).eInverseRemove( this,
                        CimPackage.TURBINE_LOAD_CONTROLLER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        TurbineLoadControllerUserDefined.class, msgs );
            return basicSetTurbineLoadControllerUserDefined( ( TurbineLoadControllerUserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__UNDEREXCITATION_LIMITER_USER_DEFINED:
            if( underexcitationLimiterUserDefined != null )
                msgs = ( ( InternalEObject ) underexcitationLimiterUserDefined ).eInverseRemove( this,
                        CimPackage.UNDEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        UnderexcitationLimiterUserDefined.class, msgs );
            return basicSetUnderexcitationLimiterUserDefined( ( UnderexcitationLimiterUserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__ASYNCHRONOUS_MACHINE_USER_DEFINED:
            if( asynchronousMachineUserDefined != null )
                msgs = ( ( InternalEObject ) asynchronousMachineUserDefined ).eInverseRemove( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        AsynchronousMachineUserDefined.class, msgs );
            return basicSetAsynchronousMachineUserDefined( ( AsynchronousMachineUserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_USER_DEFINED:
            if( pfvArControllerType1UserDefined != null )
                msgs = ( ( InternalEObject ) pfvArControllerType1UserDefined ).eInverseRemove( this,
                        CimPackage.PFV_AR_CONTROLLER_TYPE1_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        PFVArControllerType1UserDefined.class, msgs );
            return basicSetPFVArControllerType1UserDefined( ( PFVArControllerType1UserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__OVEREXCITATION_LIMITER_USER_DEFINED:
            if( overexcitationLimiterUserDefined != null )
                msgs = ( ( InternalEObject ) overexcitationLimiterUserDefined ).eInverseRemove( this,
                        CimPackage.OVEREXCITATION_LIMITER_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        OverexcitationLimiterUserDefined.class, msgs );
            return basicSetOverexcitationLimiterUserDefined( ( OverexcitationLimiterUserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_PLANT_USER_DEFINED:
            if( windPlantUserDefined != null ) msgs = ( ( InternalEObject ) windPlantUserDefined ).eInverseRemove( this,
                    CimPackage.WIND_PLANT_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS, WindPlantUserDefined.class,
                    msgs );
            return basicSetWindPlantUserDefined( ( WindPlantUserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__MECHANICAL_LOAD_USER_DEFINED:
            if( mechanicalLoadUserDefined != null )
                msgs = ( ( InternalEObject ) mechanicalLoadUserDefined ).eInverseRemove( this,
                        CimPackage.MECHANICAL_LOAD_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        MechanicalLoadUserDefined.class, msgs );
            return basicSetMechanicalLoadUserDefined( ( MechanicalLoadUserDefined ) otherEnd, msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_COMPENSATOR_USER_DEFINED:
            if( voltageCompensatorUserDefined != null )
                msgs = ( ( InternalEObject ) voltageCompensatorUserDefined ).eInverseRemove( this,
                        CimPackage.VOLTAGE_COMPENSATOR_USER_DEFINED__PROPRIETARY_PARAMETER_DYNAMICS,
                        VoltageCompensatorUserDefined.class, msgs );
            return basicSetVoltageCompensatorUserDefined( ( VoltageCompensatorUserDefined ) otherEnd, msgs );
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
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__SYNCHRONOUS_MACHINE_USER_DEFINED:
            return basicUnsetSynchronousMachineUserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__POWER_SYSTEM_STABILIZER_USER_DEFINED:
            return basicUnsetPowerSystemStabilizerUserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE3OR4_USER_DEFINED:
            return basicUnsetWindType3or4UserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED:
            return basicUnsetDiscontinuousExcitationControlUserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__LOAD_USER_DEFINED:
            return basicUnsetLoadUserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_GOVERNOR_USER_DEFINED:
            return basicUnsetTurbineGovernorUserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE1OR2_USER_DEFINED:
            return basicUnsetWindType1or2UserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__EXCITATION_SYSTEM_USER_DEFINED:
            return basicUnsetExcitationSystemUserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_ADJUSTER_USER_DEFINED:
            return basicUnsetVoltageAdjusterUserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_USER_DEFINED:
            return basicUnsetPFVArControllerType2UserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_LOAD_CONTROLLER_USER_DEFINED:
            return basicUnsetTurbineLoadControllerUserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__UNDEREXCITATION_LIMITER_USER_DEFINED:
            return basicUnsetUnderexcitationLimiterUserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__ASYNCHRONOUS_MACHINE_USER_DEFINED:
            return basicUnsetAsynchronousMachineUserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_USER_DEFINED:
            return basicUnsetPFVArControllerType1UserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__OVEREXCITATION_LIMITER_USER_DEFINED:
            return basicUnsetOverexcitationLimiterUserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_PLANT_USER_DEFINED:
            return basicUnsetWindPlantUserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__MECHANICAL_LOAD_USER_DEFINED:
            return basicUnsetMechanicalLoadUserDefined( msgs );
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_COMPENSATOR_USER_DEFINED:
            return basicUnsetVoltageCompensatorUserDefined( msgs );
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
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__BOOLEAN_PARAMETER_VALUE:
            return getBooleanParameterValue();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__FLOAT_PARAMETER_VALUE:
            return getFloatParameterValue();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__INTEGER_PARAMETER_VALUE:
            return getIntegerParameterValue();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PARAMETER_NUMBER:
            return getParameterNumber();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__SYNCHRONOUS_MACHINE_USER_DEFINED:
            return getSynchronousMachineUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__POWER_SYSTEM_STABILIZER_USER_DEFINED:
            return getPowerSystemStabilizerUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE3OR4_USER_DEFINED:
            return getWindType3or4UserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED:
            return getDiscontinuousExcitationControlUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__LOAD_USER_DEFINED:
            return getLoadUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_GOVERNOR_USER_DEFINED:
            return getTurbineGovernorUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE1OR2_USER_DEFINED:
            return getWindType1or2UserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__EXCITATION_SYSTEM_USER_DEFINED:
            return getExcitationSystemUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_ADJUSTER_USER_DEFINED:
            return getVoltageAdjusterUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_USER_DEFINED:
            return getPFVArControllerType2UserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_LOAD_CONTROLLER_USER_DEFINED:
            return getTurbineLoadControllerUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__UNDEREXCITATION_LIMITER_USER_DEFINED:
            return getUnderexcitationLimiterUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__ASYNCHRONOUS_MACHINE_USER_DEFINED:
            return getAsynchronousMachineUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_USER_DEFINED:
            return getPFVArControllerType1UserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__OVEREXCITATION_LIMITER_USER_DEFINED:
            return getOverexcitationLimiterUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_PLANT_USER_DEFINED:
            return getWindPlantUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__MECHANICAL_LOAD_USER_DEFINED:
            return getMechanicalLoadUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_COMPENSATOR_USER_DEFINED:
            return getVoltageCompensatorUserDefined();
        }
        return super.eGet( featureID, resolve, coreType );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet( int featureID, Object newValue ) {
        switch( featureID ) {
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__BOOLEAN_PARAMETER_VALUE:
            setBooleanParameterValue( ( Boolean ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__FLOAT_PARAMETER_VALUE:
            setFloatParameterValue( ( Float ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__INTEGER_PARAMETER_VALUE:
            setIntegerParameterValue( ( Integer ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PARAMETER_NUMBER:
            setParameterNumber( ( Integer ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__SYNCHRONOUS_MACHINE_USER_DEFINED:
            setSynchronousMachineUserDefined( ( SynchronousMachineUserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__POWER_SYSTEM_STABILIZER_USER_DEFINED:
            setPowerSystemStabilizerUserDefined( ( PowerSystemStabilizerUserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE3OR4_USER_DEFINED:
            setWindType3or4UserDefined( ( WindType3or4UserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED:
            setDiscontinuousExcitationControlUserDefined( ( DiscontinuousExcitationControlUserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__LOAD_USER_DEFINED:
            setLoadUserDefined( ( LoadUserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_GOVERNOR_USER_DEFINED:
            setTurbineGovernorUserDefined( ( TurbineGovernorUserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE1OR2_USER_DEFINED:
            setWindType1or2UserDefined( ( WindType1or2UserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__EXCITATION_SYSTEM_USER_DEFINED:
            setExcitationSystemUserDefined( ( ExcitationSystemUserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_ADJUSTER_USER_DEFINED:
            setVoltageAdjusterUserDefined( ( VoltageAdjusterUserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_USER_DEFINED:
            setPFVArControllerType2UserDefined( ( PFVArControllerType2UserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_LOAD_CONTROLLER_USER_DEFINED:
            setTurbineLoadControllerUserDefined( ( TurbineLoadControllerUserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__UNDEREXCITATION_LIMITER_USER_DEFINED:
            setUnderexcitationLimiterUserDefined( ( UnderexcitationLimiterUserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__ASYNCHRONOUS_MACHINE_USER_DEFINED:
            setAsynchronousMachineUserDefined( ( AsynchronousMachineUserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_USER_DEFINED:
            setPFVArControllerType1UserDefined( ( PFVArControllerType1UserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__OVEREXCITATION_LIMITER_USER_DEFINED:
            setOverexcitationLimiterUserDefined( ( OverexcitationLimiterUserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_PLANT_USER_DEFINED:
            setWindPlantUserDefined( ( WindPlantUserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__MECHANICAL_LOAD_USER_DEFINED:
            setMechanicalLoadUserDefined( ( MechanicalLoadUserDefined ) newValue );
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_COMPENSATOR_USER_DEFINED:
            setVoltageCompensatorUserDefined( ( VoltageCompensatorUserDefined ) newValue );
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
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__BOOLEAN_PARAMETER_VALUE:
            unsetBooleanParameterValue();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__FLOAT_PARAMETER_VALUE:
            unsetFloatParameterValue();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__INTEGER_PARAMETER_VALUE:
            unsetIntegerParameterValue();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PARAMETER_NUMBER:
            unsetParameterNumber();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__SYNCHRONOUS_MACHINE_USER_DEFINED:
            unsetSynchronousMachineUserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__POWER_SYSTEM_STABILIZER_USER_DEFINED:
            unsetPowerSystemStabilizerUserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE3OR4_USER_DEFINED:
            unsetWindType3or4UserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED:
            unsetDiscontinuousExcitationControlUserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__LOAD_USER_DEFINED:
            unsetLoadUserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_GOVERNOR_USER_DEFINED:
            unsetTurbineGovernorUserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE1OR2_USER_DEFINED:
            unsetWindType1or2UserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__EXCITATION_SYSTEM_USER_DEFINED:
            unsetExcitationSystemUserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_ADJUSTER_USER_DEFINED:
            unsetVoltageAdjusterUserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_USER_DEFINED:
            unsetPFVArControllerType2UserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_LOAD_CONTROLLER_USER_DEFINED:
            unsetTurbineLoadControllerUserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__UNDEREXCITATION_LIMITER_USER_DEFINED:
            unsetUnderexcitationLimiterUserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__ASYNCHRONOUS_MACHINE_USER_DEFINED:
            unsetAsynchronousMachineUserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_USER_DEFINED:
            unsetPFVArControllerType1UserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__OVEREXCITATION_LIMITER_USER_DEFINED:
            unsetOverexcitationLimiterUserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_PLANT_USER_DEFINED:
            unsetWindPlantUserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__MECHANICAL_LOAD_USER_DEFINED:
            unsetMechanicalLoadUserDefined();
            return;
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_COMPENSATOR_USER_DEFINED:
            unsetVoltageCompensatorUserDefined();
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
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__BOOLEAN_PARAMETER_VALUE:
            return isSetBooleanParameterValue();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__FLOAT_PARAMETER_VALUE:
            return isSetFloatParameterValue();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__INTEGER_PARAMETER_VALUE:
            return isSetIntegerParameterValue();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PARAMETER_NUMBER:
            return isSetParameterNumber();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__SYNCHRONOUS_MACHINE_USER_DEFINED:
            return isSetSynchronousMachineUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__POWER_SYSTEM_STABILIZER_USER_DEFINED:
            return isSetPowerSystemStabilizerUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE3OR4_USER_DEFINED:
            return isSetWindType3or4UserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__DISCONTINUOUS_EXCITATION_CONTROL_USER_DEFINED:
            return isSetDiscontinuousExcitationControlUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__LOAD_USER_DEFINED:
            return isSetLoadUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_GOVERNOR_USER_DEFINED:
            return isSetTurbineGovernorUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_TYPE1OR2_USER_DEFINED:
            return isSetWindType1or2UserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__EXCITATION_SYSTEM_USER_DEFINED:
            return isSetExcitationSystemUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_ADJUSTER_USER_DEFINED:
            return isSetVoltageAdjusterUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE2_USER_DEFINED:
            return isSetPFVArControllerType2UserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__TURBINE_LOAD_CONTROLLER_USER_DEFINED:
            return isSetTurbineLoadControllerUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__UNDEREXCITATION_LIMITER_USER_DEFINED:
            return isSetUnderexcitationLimiterUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__ASYNCHRONOUS_MACHINE_USER_DEFINED:
            return isSetAsynchronousMachineUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__PFV_AR_CONTROLLER_TYPE1_USER_DEFINED:
            return isSetPFVArControllerType1UserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__OVEREXCITATION_LIMITER_USER_DEFINED:
            return isSetOverexcitationLimiterUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__WIND_PLANT_USER_DEFINED:
            return isSetWindPlantUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__MECHANICAL_LOAD_USER_DEFINED:
            return isSetMechanicalLoadUserDefined();
        case CimPackage.PROPRIETARY_PARAMETER_DYNAMICS__VOLTAGE_COMPENSATOR_USER_DEFINED:
            return isSetVoltageCompensatorUserDefined();
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

        StringBuffer result = new StringBuffer( super.toString() );
        result.append( " (booleanParameterValue: " );
        if( booleanParameterValueESet )
            result.append( booleanParameterValue );
        else
            result.append( "<unset>" );
        result.append( ", floatParameterValue: " );
        if( floatParameterValueESet )
            result.append( floatParameterValue );
        else
            result.append( "<unset>" );
        result.append( ", integerParameterValue: " );
        if( integerParameterValueESet )
            result.append( integerParameterValue );
        else
            result.append( "<unset>" );
        result.append( ", parameterNumber: " );
        if( parameterNumberESet )
            result.append( parameterNumber );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ProprietaryParameterDynamicsImpl
