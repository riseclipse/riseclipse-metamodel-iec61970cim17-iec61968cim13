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
package fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl;

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachine;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineDynamics;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AsynchronousMachineKind;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Asynchronous Machine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getAsynchronousMachineType <em>Asynchronous Machine Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getConverterFedDrive <em>Converter Fed Drive</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getEfficiency <em>Efficiency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getIaIrRatio <em>Ia Ir Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getNominalFrequency <em>Nominal Frequency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getNominalSpeed <em>Nominal Speed</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getPolePairNumber <em>Pole Pair Number</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getRatedMechanicalPower <em>Rated Mechanical Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getReversible <em>Reversible</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getRr1 <em>Rr1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getRr2 <em>Rr2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getRxLockedRotorRatio <em>Rx Locked Rotor Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getTpo <em>Tpo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getTppo <em>Tppo</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getXlr1 <em>Xlr1</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getXlr2 <em>Xlr2</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getXm <em>Xm</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getXp <em>Xp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getXpp <em>Xpp</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getXs <em>Xs</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AsynchronousMachineImpl#getAsynchronousMachineDynamics <em>Asynchronous Machine Dynamics</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AsynchronousMachineImpl extends RotatingMachineImpl implements AsynchronousMachine {
    /**
     * The default value of the '{@link #getAsynchronousMachineType() <em>Asynchronous Machine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsynchronousMachineType()
     * @generated
     * @ordered
     */
    protected static final AsynchronousMachineKind ASYNCHRONOUS_MACHINE_TYPE_EDEFAULT = AsynchronousMachineKind.GENERATOR;

    /**
     * The cached value of the '{@link #getAsynchronousMachineType() <em>Asynchronous Machine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsynchronousMachineType()
     * @generated
     * @ordered
     */
    protected AsynchronousMachineKind asynchronousMachineType = ASYNCHRONOUS_MACHINE_TYPE_EDEFAULT;

    /**
     * This is true if the Asynchronous Machine Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean asynchronousMachineTypeESet;

    /**
     * The default value of the '{@link #getConverterFedDrive() <em>Converter Fed Drive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConverterFedDrive()
     * @generated
     * @ordered
     */
    protected static final Boolean CONVERTER_FED_DRIVE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConverterFedDrive() <em>Converter Fed Drive</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConverterFedDrive()
     * @generated
     * @ordered
     */
    protected Boolean converterFedDrive = CONVERTER_FED_DRIVE_EDEFAULT;

    /**
     * This is true if the Converter Fed Drive attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean converterFedDriveESet;

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
     * The default value of the '{@link #getIaIrRatio() <em>Ia Ir Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIaIrRatio()
     * @generated
     * @ordered
     */
    protected static final Float IA_IR_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIaIrRatio() <em>Ia Ir Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIaIrRatio()
     * @generated
     * @ordered
     */
    protected Float iaIrRatio = IA_IR_RATIO_EDEFAULT;

    /**
     * This is true if the Ia Ir Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean iaIrRatioESet;

    /**
     * The default value of the '{@link #getNominalFrequency() <em>Nominal Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalFrequency()
     * @generated
     * @ordered
     */
    protected static final Float NOMINAL_FREQUENCY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNominalFrequency() <em>Nominal Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalFrequency()
     * @generated
     * @ordered
     */
    protected Float nominalFrequency = NOMINAL_FREQUENCY_EDEFAULT;

    /**
     * This is true if the Nominal Frequency attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nominalFrequencyESet;

    /**
     * The default value of the '{@link #getNominalSpeed() <em>Nominal Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalSpeed()
     * @generated
     * @ordered
     */
    protected static final Float NOMINAL_SPEED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNominalSpeed() <em>Nominal Speed</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNominalSpeed()
     * @generated
     * @ordered
     */
    protected Float nominalSpeed = NOMINAL_SPEED_EDEFAULT;

    /**
     * This is true if the Nominal Speed attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nominalSpeedESet;

    /**
     * The default value of the '{@link #getPolePairNumber() <em>Pole Pair Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPolePairNumber()
     * @generated
     * @ordered
     */
    protected static final Integer POLE_PAIR_NUMBER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPolePairNumber() <em>Pole Pair Number</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPolePairNumber()
     * @generated
     * @ordered
     */
    protected Integer polePairNumber = POLE_PAIR_NUMBER_EDEFAULT;

    /**
     * This is true if the Pole Pair Number attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean polePairNumberESet;

    /**
     * The default value of the '{@link #getRatedMechanicalPower() <em>Rated Mechanical Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedMechanicalPower()
     * @generated
     * @ordered
     */
    protected static final Float RATED_MECHANICAL_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedMechanicalPower() <em>Rated Mechanical Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedMechanicalPower()
     * @generated
     * @ordered
     */
    protected Float ratedMechanicalPower = RATED_MECHANICAL_POWER_EDEFAULT;

    /**
     * This is true if the Rated Mechanical Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedMechanicalPowerESet;

    /**
     * The default value of the '{@link #getReversible() <em>Reversible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReversible()
     * @generated
     * @ordered
     */
    protected static final Boolean REVERSIBLE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getReversible() <em>Reversible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReversible()
     * @generated
     * @ordered
     */
    protected Boolean reversible = REVERSIBLE_EDEFAULT;

    /**
     * This is true if the Reversible attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reversibleESet;

    /**
     * The default value of the '{@link #getRr1() <em>Rr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRr1()
     * @generated
     * @ordered
     */
    protected static final Float RR1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRr1() <em>Rr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRr1()
     * @generated
     * @ordered
     */
    protected Float rr1 = RR1_EDEFAULT;

    /**
     * This is true if the Rr1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rr1ESet;

    /**
     * The default value of the '{@link #getRr2() <em>Rr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRr2()
     * @generated
     * @ordered
     */
    protected static final Float RR2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRr2() <em>Rr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRr2()
     * @generated
     * @ordered
     */
    protected Float rr2 = RR2_EDEFAULT;

    /**
     * This is true if the Rr2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rr2ESet;

    /**
     * The default value of the '{@link #getRxLockedRotorRatio() <em>Rx Locked Rotor Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRxLockedRotorRatio()
     * @generated
     * @ordered
     */
    protected static final Float RX_LOCKED_ROTOR_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRxLockedRotorRatio() <em>Rx Locked Rotor Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRxLockedRotorRatio()
     * @generated
     * @ordered
     */
    protected Float rxLockedRotorRatio = RX_LOCKED_ROTOR_RATIO_EDEFAULT;

    /**
     * This is true if the Rx Locked Rotor Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean rxLockedRotorRatioESet;

    /**
     * The default value of the '{@link #getTpo() <em>Tpo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpo()
     * @generated
     * @ordered
     */
    protected static final Float TPO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTpo() <em>Tpo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTpo()
     * @generated
     * @ordered
     */
    protected Float tpo = TPO_EDEFAULT;

    /**
     * This is true if the Tpo attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tpoESet;

    /**
     * The default value of the '{@link #getTppo() <em>Tppo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTppo()
     * @generated
     * @ordered
     */
    protected static final Float TPPO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTppo() <em>Tppo</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTppo()
     * @generated
     * @ordered
     */
    protected Float tppo = TPPO_EDEFAULT;

    /**
     * This is true if the Tppo attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tppoESet;

    /**
     * The default value of the '{@link #getXlr1() <em>Xlr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXlr1()
     * @generated
     * @ordered
     */
    protected static final Float XLR1_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXlr1() <em>Xlr1</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXlr1()
     * @generated
     * @ordered
     */
    protected Float xlr1 = XLR1_EDEFAULT;

    /**
     * This is true if the Xlr1 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xlr1ESet;

    /**
     * The default value of the '{@link #getXlr2() <em>Xlr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXlr2()
     * @generated
     * @ordered
     */
    protected static final Float XLR2_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXlr2() <em>Xlr2</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXlr2()
     * @generated
     * @ordered
     */
    protected Float xlr2 = XLR2_EDEFAULT;

    /**
     * This is true if the Xlr2 attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xlr2ESet;

    /**
     * The default value of the '{@link #getXm() <em>Xm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXm()
     * @generated
     * @ordered
     */
    protected static final Float XM_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXm() <em>Xm</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXm()
     * @generated
     * @ordered
     */
    protected Float xm = XM_EDEFAULT;

    /**
     * This is true if the Xm attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xmESet;

    /**
     * The default value of the '{@link #getXp() <em>Xp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXp()
     * @generated
     * @ordered
     */
    protected static final Float XP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXp() <em>Xp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXp()
     * @generated
     * @ordered
     */
    protected Float xp = XP_EDEFAULT;

    /**
     * This is true if the Xp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xpESet;

    /**
     * The default value of the '{@link #getXpp() <em>Xpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXpp()
     * @generated
     * @ordered
     */
    protected static final Float XPP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXpp() <em>Xpp</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXpp()
     * @generated
     * @ordered
     */
    protected Float xpp = XPP_EDEFAULT;

    /**
     * This is true if the Xpp attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xppESet;

    /**
     * The default value of the '{@link #getXs() <em>Xs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXs()
     * @generated
     * @ordered
     */
    protected static final Float XS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getXs() <em>Xs</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getXs()
     * @generated
     * @ordered
     */
    protected Float xs = XS_EDEFAULT;

    /**
     * This is true if the Xs attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean xsESet;

    /**
     * The cached value of the '{@link #getAsynchronousMachineDynamics() <em>Asynchronous Machine Dynamics</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAsynchronousMachineDynamics()
     * @generated
     * @ordered
     */
    protected AsynchronousMachineDynamics asynchronousMachineDynamics;

    /**
     * This is true if the Asynchronous Machine Dynamics reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean asynchronousMachineDynamicsESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AsynchronousMachineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAsynchronousMachine();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachineKind getAsynchronousMachineType() {
        return asynchronousMachineType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setAsynchronousMachineType( AsynchronousMachineKind newAsynchronousMachineType ) {
        AsynchronousMachineKind oldAsynchronousMachineType = asynchronousMachineType;
        asynchronousMachineType = newAsynchronousMachineType == null ? ASYNCHRONOUS_MACHINE_TYPE_EDEFAULT
                : newAsynchronousMachineType;
        boolean oldAsynchronousMachineTypeESet = asynchronousMachineTypeESet;
        asynchronousMachineTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_TYPE, oldAsynchronousMachineType,
                asynchronousMachineType, !oldAsynchronousMachineTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetAsynchronousMachineType() {
        AsynchronousMachineKind oldAsynchronousMachineType = asynchronousMachineType;
        boolean oldAsynchronousMachineTypeESet = asynchronousMachineTypeESet;
        asynchronousMachineType = ASYNCHRONOUS_MACHINE_TYPE_EDEFAULT;
        asynchronousMachineTypeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_TYPE, oldAsynchronousMachineType,
                ASYNCHRONOUS_MACHINE_TYPE_EDEFAULT, oldAsynchronousMachineTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsynchronousMachineType() {
        return asynchronousMachineTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getConverterFedDrive() {
        return converterFedDrive;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConverterFedDrive( Boolean newConverterFedDrive ) {
        Boolean oldConverterFedDrive = converterFedDrive;
        converterFedDrive = newConverterFedDrive;
        boolean oldConverterFedDriveESet = converterFedDriveESet;
        converterFedDriveESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ASYNCHRONOUS_MACHINE__CONVERTER_FED_DRIVE,
                        oldConverterFedDrive, converterFedDrive, !oldConverterFedDriveESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConverterFedDrive() {
        Boolean oldConverterFedDrive = converterFedDrive;
        boolean oldConverterFedDriveESet = converterFedDriveESet;
        converterFedDrive = CONVERTER_FED_DRIVE_EDEFAULT;
        converterFedDriveESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.ASYNCHRONOUS_MACHINE__CONVERTER_FED_DRIVE,
                        oldConverterFedDrive, CONVERTER_FED_DRIVE_EDEFAULT, oldConverterFedDriveESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConverterFedDrive() {
        return converterFedDriveESet;
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
                CimPackage.ASYNCHRONOUS_MACHINE__EFFICIENCY, oldEfficiency, efficiency, !oldEfficiencyESet ) );
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
                CimPackage.ASYNCHRONOUS_MACHINE__EFFICIENCY, oldEfficiency, EFFICIENCY_EDEFAULT, oldEfficiencyESet ) );
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
    public Float getIaIrRatio() {
        return iaIrRatio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIaIrRatio( Float newIaIrRatio ) {
        Float oldIaIrRatio = iaIrRatio;
        iaIrRatio = newIaIrRatio;
        boolean oldIaIrRatioESet = iaIrRatioESet;
        iaIrRatioESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASYNCHRONOUS_MACHINE__IA_IR_RATIO, oldIaIrRatio, iaIrRatio, !oldIaIrRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIaIrRatio() {
        Float oldIaIrRatio = iaIrRatio;
        boolean oldIaIrRatioESet = iaIrRatioESet;
        iaIrRatio = IA_IR_RATIO_EDEFAULT;
        iaIrRatioESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASYNCHRONOUS_MACHINE__IA_IR_RATIO, oldIaIrRatio, IA_IR_RATIO_EDEFAULT, oldIaIrRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIaIrRatio() {
        return iaIrRatioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNominalFrequency() {
        return nominalFrequency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNominalFrequency( Float newNominalFrequency ) {
        Float oldNominalFrequency = nominalFrequency;
        nominalFrequency = newNominalFrequency;
        boolean oldNominalFrequencyESet = nominalFrequencyESet;
        nominalFrequencyESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_FREQUENCY,
                    oldNominalFrequency, nominalFrequency, !oldNominalFrequencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNominalFrequency() {
        Float oldNominalFrequency = nominalFrequency;
        boolean oldNominalFrequencyESet = nominalFrequencyESet;
        nominalFrequency = NOMINAL_FREQUENCY_EDEFAULT;
        nominalFrequencyESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_FREQUENCY,
                        oldNominalFrequency, NOMINAL_FREQUENCY_EDEFAULT, oldNominalFrequencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNominalFrequency() {
        return nominalFrequencyESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNominalSpeed() {
        return nominalSpeed;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNominalSpeed( Float newNominalSpeed ) {
        Float oldNominalSpeed = nominalSpeed;
        nominalSpeed = newNominalSpeed;
        boolean oldNominalSpeedESet = nominalSpeedESet;
        nominalSpeedESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_SPEED, oldNominalSpeed, nominalSpeed, !oldNominalSpeedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNominalSpeed() {
        Float oldNominalSpeed = nominalSpeed;
        boolean oldNominalSpeedESet = nominalSpeedESet;
        nominalSpeed = NOMINAL_SPEED_EDEFAULT;
        nominalSpeedESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_SPEED,
                    oldNominalSpeed, NOMINAL_SPEED_EDEFAULT, oldNominalSpeedESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNominalSpeed() {
        return nominalSpeedESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getPolePairNumber() {
        return polePairNumber;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPolePairNumber( Integer newPolePairNumber ) {
        Integer oldPolePairNumber = polePairNumber;
        polePairNumber = newPolePairNumber;
        boolean oldPolePairNumberESet = polePairNumberESet;
        polePairNumberESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ASYNCHRONOUS_MACHINE__POLE_PAIR_NUMBER,
                    oldPolePairNumber, polePairNumber, !oldPolePairNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPolePairNumber() {
        Integer oldPolePairNumber = polePairNumber;
        boolean oldPolePairNumberESet = polePairNumberESet;
        polePairNumber = POLE_PAIR_NUMBER_EDEFAULT;
        polePairNumberESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.ASYNCHRONOUS_MACHINE__POLE_PAIR_NUMBER,
                    oldPolePairNumber, POLE_PAIR_NUMBER_EDEFAULT, oldPolePairNumberESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPolePairNumber() {
        return polePairNumberESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedMechanicalPower() {
        return ratedMechanicalPower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedMechanicalPower( Float newRatedMechanicalPower ) {
        Float oldRatedMechanicalPower = ratedMechanicalPower;
        ratedMechanicalPower = newRatedMechanicalPower;
        boolean oldRatedMechanicalPowerESet = ratedMechanicalPowerESet;
        ratedMechanicalPowerESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ASYNCHRONOUS_MACHINE__RATED_MECHANICAL_POWER,
                        oldRatedMechanicalPower, ratedMechanicalPower, !oldRatedMechanicalPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedMechanicalPower() {
        Float oldRatedMechanicalPower = ratedMechanicalPower;
        boolean oldRatedMechanicalPowerESet = ratedMechanicalPowerESet;
        ratedMechanicalPower = RATED_MECHANICAL_POWER_EDEFAULT;
        ratedMechanicalPowerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASYNCHRONOUS_MACHINE__RATED_MECHANICAL_POWER, oldRatedMechanicalPower,
                RATED_MECHANICAL_POWER_EDEFAULT, oldRatedMechanicalPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedMechanicalPower() {
        return ratedMechanicalPowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getReversible() {
        return reversible;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setReversible( Boolean newReversible ) {
        Boolean oldReversible = reversible;
        reversible = newReversible;
        boolean oldReversibleESet = reversibleESet;
        reversibleESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASYNCHRONOUS_MACHINE__REVERSIBLE, oldReversible, reversible, !oldReversibleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetReversible() {
        Boolean oldReversible = reversible;
        boolean oldReversibleESet = reversibleESet;
        reversible = REVERSIBLE_EDEFAULT;
        reversibleESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASYNCHRONOUS_MACHINE__REVERSIBLE, oldReversible, REVERSIBLE_EDEFAULT, oldReversibleESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReversible() {
        return reversibleESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRr1() {
        return rr1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRr1( Float newRr1 ) {
        Float oldRr1 = rr1;
        rr1 = newRr1;
        boolean oldRr1ESet = rr1ESet;
        rr1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASYNCHRONOUS_MACHINE__RR1, oldRr1, rr1, !oldRr1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRr1() {
        Float oldRr1 = rr1;
        boolean oldRr1ESet = rr1ESet;
        rr1 = RR1_EDEFAULT;
        rr1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASYNCHRONOUS_MACHINE__RR1, oldRr1, RR1_EDEFAULT, oldRr1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRr1() {
        return rr1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRr2() {
        return rr2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRr2( Float newRr2 ) {
        Float oldRr2 = rr2;
        rr2 = newRr2;
        boolean oldRr2ESet = rr2ESet;
        rr2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASYNCHRONOUS_MACHINE__RR2, oldRr2, rr2, !oldRr2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRr2() {
        Float oldRr2 = rr2;
        boolean oldRr2ESet = rr2ESet;
        rr2 = RR2_EDEFAULT;
        rr2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASYNCHRONOUS_MACHINE__RR2, oldRr2, RR2_EDEFAULT, oldRr2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRr2() {
        return rr2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRxLockedRotorRatio() {
        return rxLockedRotorRatio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRxLockedRotorRatio( Float newRxLockedRotorRatio ) {
        Float oldRxLockedRotorRatio = rxLockedRotorRatio;
        rxLockedRotorRatio = newRxLockedRotorRatio;
        boolean oldRxLockedRotorRatioESet = rxLockedRotorRatioESet;
        rxLockedRotorRatioESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.ASYNCHRONOUS_MACHINE__RX_LOCKED_ROTOR_RATIO,
                        oldRxLockedRotorRatio, rxLockedRotorRatio, !oldRxLockedRotorRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRxLockedRotorRatio() {
        Float oldRxLockedRotorRatio = rxLockedRotorRatio;
        boolean oldRxLockedRotorRatioESet = rxLockedRotorRatioESet;
        rxLockedRotorRatio = RX_LOCKED_ROTOR_RATIO_EDEFAULT;
        rxLockedRotorRatioESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.ASYNCHRONOUS_MACHINE__RX_LOCKED_ROTOR_RATIO,
                        oldRxLockedRotorRatio, RX_LOCKED_ROTOR_RATIO_EDEFAULT, oldRxLockedRotorRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRxLockedRotorRatio() {
        return rxLockedRotorRatioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTpo() {
        return tpo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTpo( Float newTpo ) {
        Float oldTpo = tpo;
        tpo = newTpo;
        boolean oldTpoESet = tpoESet;
        tpoESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASYNCHRONOUS_MACHINE__TPO, oldTpo, tpo, !oldTpoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTpo() {
        Float oldTpo = tpo;
        boolean oldTpoESet = tpoESet;
        tpo = TPO_EDEFAULT;
        tpoESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASYNCHRONOUS_MACHINE__TPO, oldTpo, TPO_EDEFAULT, oldTpoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTpo() {
        return tpoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTppo() {
        return tppo;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTppo( Float newTppo ) {
        Float oldTppo = tppo;
        tppo = newTppo;
        boolean oldTppoESet = tppoESet;
        tppoESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASYNCHRONOUS_MACHINE__TPPO, oldTppo, tppo, !oldTppoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTppo() {
        Float oldTppo = tppo;
        boolean oldTppoESet = tppoESet;
        tppo = TPPO_EDEFAULT;
        tppoESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASYNCHRONOUS_MACHINE__TPPO, oldTppo, TPPO_EDEFAULT, oldTppoESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTppo() {
        return tppoESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXlr1() {
        return xlr1;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXlr1( Float newXlr1 ) {
        Float oldXlr1 = xlr1;
        xlr1 = newXlr1;
        boolean oldXlr1ESet = xlr1ESet;
        xlr1ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASYNCHRONOUS_MACHINE__XLR1, oldXlr1, xlr1, !oldXlr1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXlr1() {
        Float oldXlr1 = xlr1;
        boolean oldXlr1ESet = xlr1ESet;
        xlr1 = XLR1_EDEFAULT;
        xlr1ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASYNCHRONOUS_MACHINE__XLR1, oldXlr1, XLR1_EDEFAULT, oldXlr1ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXlr1() {
        return xlr1ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXlr2() {
        return xlr2;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXlr2( Float newXlr2 ) {
        Float oldXlr2 = xlr2;
        xlr2 = newXlr2;
        boolean oldXlr2ESet = xlr2ESet;
        xlr2ESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASYNCHRONOUS_MACHINE__XLR2, oldXlr2, xlr2, !oldXlr2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXlr2() {
        Float oldXlr2 = xlr2;
        boolean oldXlr2ESet = xlr2ESet;
        xlr2 = XLR2_EDEFAULT;
        xlr2ESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASYNCHRONOUS_MACHINE__XLR2, oldXlr2, XLR2_EDEFAULT, oldXlr2ESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXlr2() {
        return xlr2ESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXm() {
        return xm;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXm( Float newXm ) {
        Float oldXm = xm;
        xm = newXm;
        boolean oldXmESet = xmESet;
        xmESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASYNCHRONOUS_MACHINE__XM, oldXm, xm, !oldXmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXm() {
        Float oldXm = xm;
        boolean oldXmESet = xmESet;
        xm = XM_EDEFAULT;
        xmESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASYNCHRONOUS_MACHINE__XM, oldXm, XM_EDEFAULT, oldXmESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXm() {
        return xmESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXp() {
        return xp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXp( Float newXp ) {
        Float oldXp = xp;
        xp = newXp;
        boolean oldXpESet = xpESet;
        xpESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASYNCHRONOUS_MACHINE__XP, oldXp, xp, !oldXpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXp() {
        Float oldXp = xp;
        boolean oldXpESet = xpESet;
        xp = XP_EDEFAULT;
        xpESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASYNCHRONOUS_MACHINE__XP, oldXp, XP_EDEFAULT, oldXpESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXp() {
        return xpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXpp() {
        return xpp;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXpp( Float newXpp ) {
        Float oldXpp = xpp;
        xpp = newXpp;
        boolean oldXppESet = xppESet;
        xppESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASYNCHRONOUS_MACHINE__XPP, oldXpp, xpp, !oldXppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXpp() {
        Float oldXpp = xpp;
        boolean oldXppESet = xppESet;
        xpp = XPP_EDEFAULT;
        xppESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASYNCHRONOUS_MACHINE__XPP, oldXpp, XPP_EDEFAULT, oldXppESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXpp() {
        return xppESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getXs() {
        return xs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setXs( Float newXs ) {
        Float oldXs = xs;
        xs = newXs;
        boolean oldXsESet = xsESet;
        xsESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.ASYNCHRONOUS_MACHINE__XS, oldXs, xs, !oldXsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetXs() {
        Float oldXs = xs;
        boolean oldXsESet = xsESet;
        xs = XS_EDEFAULT;
        xsESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.ASYNCHRONOUS_MACHINE__XS, oldXs, XS_EDEFAULT, oldXsESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetXs() {
        return xsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AsynchronousMachineDynamics getAsynchronousMachineDynamics() {
        if( asynchronousMachineDynamics != null && asynchronousMachineDynamics.eIsProxy() ) {
            InternalEObject oldAsynchronousMachineDynamics = ( InternalEObject ) asynchronousMachineDynamics;
            asynchronousMachineDynamics = ( AsynchronousMachineDynamics ) eResolveProxy(
                    oldAsynchronousMachineDynamics );
            if( asynchronousMachineDynamics != oldAsynchronousMachineDynamics ) {
                if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.RESOLVE,
                        CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS, oldAsynchronousMachineDynamics,
                        asynchronousMachineDynamics ) );
            }
        }
        return asynchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AsynchronousMachineDynamics basicGetAsynchronousMachineDynamics() {
        return asynchronousMachineDynamics;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAsynchronousMachineDynamics(
            AsynchronousMachineDynamics newAsynchronousMachineDynamics, NotificationChain msgs ) {
        AsynchronousMachineDynamics oldAsynchronousMachineDynamics = asynchronousMachineDynamics;
        asynchronousMachineDynamics = newAsynchronousMachineDynamics;
        boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
        asynchronousMachineDynamicsESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS, oldAsynchronousMachineDynamics,
                    newAsynchronousMachineDynamics, !oldAsynchronousMachineDynamicsESet );
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
    public void setAsynchronousMachineDynamics( AsynchronousMachineDynamics newAsynchronousMachineDynamics ) {
        if( newAsynchronousMachineDynamics != asynchronousMachineDynamics ) {
            NotificationChain msgs = null;
            if( asynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) asynchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE,
                        AsynchronousMachineDynamics.class, msgs );
            if( newAsynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) newAsynchronousMachineDynamics ).eInverseAdd( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE,
                        AsynchronousMachineDynamics.class, msgs );
            msgs = basicSetAsynchronousMachineDynamics( newAsynchronousMachineDynamics, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
            asynchronousMachineDynamicsESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS, newAsynchronousMachineDynamics,
                    newAsynchronousMachineDynamics, !oldAsynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAsynchronousMachineDynamics( NotificationChain msgs ) {
        AsynchronousMachineDynamics oldAsynchronousMachineDynamics = asynchronousMachineDynamics;
        asynchronousMachineDynamics = null;
        boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
        asynchronousMachineDynamicsESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS, oldAsynchronousMachineDynamics,
                    null, oldAsynchronousMachineDynamicsESet );
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
    public void unsetAsynchronousMachineDynamics() {
        if( asynchronousMachineDynamics != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) asynchronousMachineDynamics ).eInverseRemove( this,
                    CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE, AsynchronousMachineDynamics.class,
                    msgs );
            msgs = basicUnsetAsynchronousMachineDynamics( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAsynchronousMachineDynamicsESet = asynchronousMachineDynamicsESet;
            asynchronousMachineDynamicsESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS, null, null,
                    oldAsynchronousMachineDynamicsESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAsynchronousMachineDynamics() {
        return asynchronousMachineDynamicsESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS:
            if( asynchronousMachineDynamics != null )
                msgs = ( ( InternalEObject ) asynchronousMachineDynamics ).eInverseRemove( this,
                        CimPackage.ASYNCHRONOUS_MACHINE_DYNAMICS__ASYNCHRONOUS_MACHINE,
                        AsynchronousMachineDynamics.class, msgs );
            return basicSetAsynchronousMachineDynamics( ( AsynchronousMachineDynamics ) otherEnd, msgs );
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
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS:
            return basicUnsetAsynchronousMachineDynamics( msgs );
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
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_TYPE:
            return getAsynchronousMachineType();
        case CimPackage.ASYNCHRONOUS_MACHINE__CONVERTER_FED_DRIVE:
            return getConverterFedDrive();
        case CimPackage.ASYNCHRONOUS_MACHINE__EFFICIENCY:
            return getEfficiency();
        case CimPackage.ASYNCHRONOUS_MACHINE__IA_IR_RATIO:
            return getIaIrRatio();
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_FREQUENCY:
            return getNominalFrequency();
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_SPEED:
            return getNominalSpeed();
        case CimPackage.ASYNCHRONOUS_MACHINE__POLE_PAIR_NUMBER:
            return getPolePairNumber();
        case CimPackage.ASYNCHRONOUS_MACHINE__RATED_MECHANICAL_POWER:
            return getRatedMechanicalPower();
        case CimPackage.ASYNCHRONOUS_MACHINE__REVERSIBLE:
            return getReversible();
        case CimPackage.ASYNCHRONOUS_MACHINE__RR1:
            return getRr1();
        case CimPackage.ASYNCHRONOUS_MACHINE__RR2:
            return getRr2();
        case CimPackage.ASYNCHRONOUS_MACHINE__RX_LOCKED_ROTOR_RATIO:
            return getRxLockedRotorRatio();
        case CimPackage.ASYNCHRONOUS_MACHINE__TPO:
            return getTpo();
        case CimPackage.ASYNCHRONOUS_MACHINE__TPPO:
            return getTppo();
        case CimPackage.ASYNCHRONOUS_MACHINE__XLR1:
            return getXlr1();
        case CimPackage.ASYNCHRONOUS_MACHINE__XLR2:
            return getXlr2();
        case CimPackage.ASYNCHRONOUS_MACHINE__XM:
            return getXm();
        case CimPackage.ASYNCHRONOUS_MACHINE__XP:
            return getXp();
        case CimPackage.ASYNCHRONOUS_MACHINE__XPP:
            return getXpp();
        case CimPackage.ASYNCHRONOUS_MACHINE__XS:
            return getXs();
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS:
            if( resolve ) return getAsynchronousMachineDynamics();
            return basicGetAsynchronousMachineDynamics();
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
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_TYPE:
            setAsynchronousMachineType( ( AsynchronousMachineKind ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__CONVERTER_FED_DRIVE:
            setConverterFedDrive( ( Boolean ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__EFFICIENCY:
            setEfficiency( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__IA_IR_RATIO:
            setIaIrRatio( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_FREQUENCY:
            setNominalFrequency( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_SPEED:
            setNominalSpeed( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__POLE_PAIR_NUMBER:
            setPolePairNumber( ( Integer ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__RATED_MECHANICAL_POWER:
            setRatedMechanicalPower( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__REVERSIBLE:
            setReversible( ( Boolean ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__RR1:
            setRr1( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__RR2:
            setRr2( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__RX_LOCKED_ROTOR_RATIO:
            setRxLockedRotorRatio( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__TPO:
            setTpo( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__TPPO:
            setTppo( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__XLR1:
            setXlr1( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__XLR2:
            setXlr2( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__XM:
            setXm( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__XP:
            setXp( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__XPP:
            setXpp( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__XS:
            setXs( ( Float ) newValue );
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS:
            setAsynchronousMachineDynamics( ( AsynchronousMachineDynamics ) newValue );
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
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_TYPE:
            unsetAsynchronousMachineType();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__CONVERTER_FED_DRIVE:
            unsetConverterFedDrive();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__EFFICIENCY:
            unsetEfficiency();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__IA_IR_RATIO:
            unsetIaIrRatio();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_FREQUENCY:
            unsetNominalFrequency();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_SPEED:
            unsetNominalSpeed();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__POLE_PAIR_NUMBER:
            unsetPolePairNumber();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__RATED_MECHANICAL_POWER:
            unsetRatedMechanicalPower();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__REVERSIBLE:
            unsetReversible();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__RR1:
            unsetRr1();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__RR2:
            unsetRr2();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__RX_LOCKED_ROTOR_RATIO:
            unsetRxLockedRotorRatio();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__TPO:
            unsetTpo();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__TPPO:
            unsetTppo();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__XLR1:
            unsetXlr1();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__XLR2:
            unsetXlr2();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__XM:
            unsetXm();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__XP:
            unsetXp();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__XPP:
            unsetXpp();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__XS:
            unsetXs();
            return;
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS:
            unsetAsynchronousMachineDynamics();
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
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_TYPE:
            return isSetAsynchronousMachineType();
        case CimPackage.ASYNCHRONOUS_MACHINE__CONVERTER_FED_DRIVE:
            return isSetConverterFedDrive();
        case CimPackage.ASYNCHRONOUS_MACHINE__EFFICIENCY:
            return isSetEfficiency();
        case CimPackage.ASYNCHRONOUS_MACHINE__IA_IR_RATIO:
            return isSetIaIrRatio();
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_FREQUENCY:
            return isSetNominalFrequency();
        case CimPackage.ASYNCHRONOUS_MACHINE__NOMINAL_SPEED:
            return isSetNominalSpeed();
        case CimPackage.ASYNCHRONOUS_MACHINE__POLE_PAIR_NUMBER:
            return isSetPolePairNumber();
        case CimPackage.ASYNCHRONOUS_MACHINE__RATED_MECHANICAL_POWER:
            return isSetRatedMechanicalPower();
        case CimPackage.ASYNCHRONOUS_MACHINE__REVERSIBLE:
            return isSetReversible();
        case CimPackage.ASYNCHRONOUS_MACHINE__RR1:
            return isSetRr1();
        case CimPackage.ASYNCHRONOUS_MACHINE__RR2:
            return isSetRr2();
        case CimPackage.ASYNCHRONOUS_MACHINE__RX_LOCKED_ROTOR_RATIO:
            return isSetRxLockedRotorRatio();
        case CimPackage.ASYNCHRONOUS_MACHINE__TPO:
            return isSetTpo();
        case CimPackage.ASYNCHRONOUS_MACHINE__TPPO:
            return isSetTppo();
        case CimPackage.ASYNCHRONOUS_MACHINE__XLR1:
            return isSetXlr1();
        case CimPackage.ASYNCHRONOUS_MACHINE__XLR2:
            return isSetXlr2();
        case CimPackage.ASYNCHRONOUS_MACHINE__XM:
            return isSetXm();
        case CimPackage.ASYNCHRONOUS_MACHINE__XP:
            return isSetXp();
        case CimPackage.ASYNCHRONOUS_MACHINE__XPP:
            return isSetXpp();
        case CimPackage.ASYNCHRONOUS_MACHINE__XS:
            return isSetXs();
        case CimPackage.ASYNCHRONOUS_MACHINE__ASYNCHRONOUS_MACHINE_DYNAMICS:
            return isSetAsynchronousMachineDynamics();
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
        result.append( " (asynchronousMachineType: " );
        if( asynchronousMachineTypeESet )
            result.append( asynchronousMachineType );
        else
            result.append( "<unset>" );
        result.append( ", converterFedDrive: " );
        if( converterFedDriveESet )
            result.append( converterFedDrive );
        else
            result.append( "<unset>" );
        result.append( ", efficiency: " );
        if( efficiencyESet )
            result.append( efficiency );
        else
            result.append( "<unset>" );
        result.append( ", iaIrRatio: " );
        if( iaIrRatioESet )
            result.append( iaIrRatio );
        else
            result.append( "<unset>" );
        result.append( ", nominalFrequency: " );
        if( nominalFrequencyESet )
            result.append( nominalFrequency );
        else
            result.append( "<unset>" );
        result.append( ", nominalSpeed: " );
        if( nominalSpeedESet )
            result.append( nominalSpeed );
        else
            result.append( "<unset>" );
        result.append( ", polePairNumber: " );
        if( polePairNumberESet )
            result.append( polePairNumber );
        else
            result.append( "<unset>" );
        result.append( ", ratedMechanicalPower: " );
        if( ratedMechanicalPowerESet )
            result.append( ratedMechanicalPower );
        else
            result.append( "<unset>" );
        result.append( ", reversible: " );
        if( reversibleESet )
            result.append( reversible );
        else
            result.append( "<unset>" );
        result.append( ", rr1: " );
        if( rr1ESet )
            result.append( rr1 );
        else
            result.append( "<unset>" );
        result.append( ", rr2: " );
        if( rr2ESet )
            result.append( rr2 );
        else
            result.append( "<unset>" );
        result.append( ", rxLockedRotorRatio: " );
        if( rxLockedRotorRatioESet )
            result.append( rxLockedRotorRatio );
        else
            result.append( "<unset>" );
        result.append( ", tpo: " );
        if( tpoESet )
            result.append( tpo );
        else
            result.append( "<unset>" );
        result.append( ", tppo: " );
        if( tppoESet )
            result.append( tppo );
        else
            result.append( "<unset>" );
        result.append( ", xlr1: " );
        if( xlr1ESet )
            result.append( xlr1 );
        else
            result.append( "<unset>" );
        result.append( ", xlr2: " );
        if( xlr2ESet )
            result.append( xlr2 );
        else
            result.append( "<unset>" );
        result.append( ", xm: " );
        if( xmESet )
            result.append( xm );
        else
            result.append( "<unset>" );
        result.append( ", xp: " );
        if( xpESet )
            result.append( xp );
        else
            result.append( "<unset>" );
        result.append( ", xpp: " );
        if( xppESet )
            result.append( xpp );
        else
            result.append( "<unset>" );
        result.append( ", xs: " );
        if( xsESet )
            result.append( xs );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //AsynchronousMachineImpl
