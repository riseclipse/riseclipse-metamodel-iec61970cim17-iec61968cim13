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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ShortCircuitTest;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TransformerEndInfo;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Short Circuit Test</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShortCircuitTestImpl#getCurrent <em>Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShortCircuitTestImpl#getEnergisedEndStep <em>Energised End Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShortCircuitTestImpl#getGroundedEndStep <em>Grounded End Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShortCircuitTestImpl#getLeakageImpedance <em>Leakage Impedance</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShortCircuitTestImpl#getLeakageImpedanceZero <em>Leakage Impedance Zero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShortCircuitTestImpl#getLoss <em>Loss</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShortCircuitTestImpl#getLossZero <em>Loss Zero</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShortCircuitTestImpl#getPower <em>Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShortCircuitTestImpl#getVoltage <em>Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShortCircuitTestImpl#getGroundedEnds <em>Grounded Ends</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ShortCircuitTestImpl#getEnergisedEnd <em>Energised End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ShortCircuitTestImpl extends TransformerTestImpl implements ShortCircuitTest {
    /**
     * The default value of the '{@link #getCurrent() <em>Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrent()
     * @generated
     * @ordered
     */
    protected static final Float CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCurrent() <em>Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCurrent()
     * @generated
     * @ordered
     */
    protected Float current = CURRENT_EDEFAULT;

    /**
     * This is true if the Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean currentESet;

    /**
     * The default value of the '{@link #getEnergisedEndStep() <em>Energised End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergisedEndStep()
     * @generated
     * @ordered
     */
    protected static final Integer ENERGISED_END_STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEnergisedEndStep() <em>Energised End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergisedEndStep()
     * @generated
     * @ordered
     */
    protected Integer energisedEndStep = ENERGISED_END_STEP_EDEFAULT;

    /**
     * This is true if the Energised End Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energisedEndStepESet;

    /**
     * The default value of the '{@link #getGroundedEndStep() <em>Grounded End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroundedEndStep()
     * @generated
     * @ordered
     */
    protected static final Integer GROUNDED_END_STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGroundedEndStep() <em>Grounded End Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroundedEndStep()
     * @generated
     * @ordered
     */
    protected Integer groundedEndStep = GROUNDED_END_STEP_EDEFAULT;

    /**
     * This is true if the Grounded End Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean groundedEndStepESet;

    /**
     * The default value of the '{@link #getLeakageImpedance() <em>Leakage Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeakageImpedance()
     * @generated
     * @ordered
     */
    protected static final Float LEAKAGE_IMPEDANCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLeakageImpedance() <em>Leakage Impedance</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeakageImpedance()
     * @generated
     * @ordered
     */
    protected Float leakageImpedance = LEAKAGE_IMPEDANCE_EDEFAULT;

    /**
     * This is true if the Leakage Impedance attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean leakageImpedanceESet;

    /**
     * The default value of the '{@link #getLeakageImpedanceZero() <em>Leakage Impedance Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeakageImpedanceZero()
     * @generated
     * @ordered
     */
    protected static final Float LEAKAGE_IMPEDANCE_ZERO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLeakageImpedanceZero() <em>Leakage Impedance Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLeakageImpedanceZero()
     * @generated
     * @ordered
     */
    protected Float leakageImpedanceZero = LEAKAGE_IMPEDANCE_ZERO_EDEFAULT;

    /**
     * This is true if the Leakage Impedance Zero attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean leakageImpedanceZeroESet;

    /**
     * The default value of the '{@link #getLoss() <em>Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoss()
     * @generated
     * @ordered
     */
    protected static final Float LOSS_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLoss() <em>Loss</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLoss()
     * @generated
     * @ordered
     */
    protected Float loss = LOSS_EDEFAULT;

    /**
     * This is true if the Loss attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lossESet;

    /**
     * The default value of the '{@link #getLossZero() <em>Loss Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLossZero()
     * @generated
     * @ordered
     */
    protected static final Float LOSS_ZERO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLossZero() <em>Loss Zero</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLossZero()
     * @generated
     * @ordered
     */
    protected Float lossZero = LOSS_ZERO_EDEFAULT;

    /**
     * This is true if the Loss Zero attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lossZeroESet;

    /**
     * The default value of the '{@link #getPower() <em>Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPower()
     * @generated
     * @ordered
     */
    protected static final Float POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPower() <em>Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPower()
     * @generated
     * @ordered
     */
    protected Float power = POWER_EDEFAULT;

    /**
     * This is true if the Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean powerESet;

    /**
     * The default value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltage()
     * @generated
     * @ordered
     */
    protected static final Float VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getVoltage() <em>Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVoltage()
     * @generated
     * @ordered
     */
    protected Float voltage = VOLTAGE_EDEFAULT;

    /**
     * This is true if the Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean voltageESet;

    /**
     * The cached value of the '{@link #getGroundedEnds() <em>Grounded Ends</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGroundedEnds()
     * @generated
     * @ordered
     */
    protected EList< TransformerEndInfo > groundedEnds;

    /**
     * The cached value of the '{@link #getEnergisedEnd() <em>Energised End</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEnergisedEnd()
     * @generated
     * @ordered
     */
    protected TransformerEndInfo energisedEnd;

    /**
     * This is true if the Energised End reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean energisedEndESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ShortCircuitTestImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getShortCircuitTest();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCurrent() {
        return current;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCurrent( Float newCurrent ) {
        Float oldCurrent = current;
        current = newCurrent;
        boolean oldCurrentESet = currentESet;
        currentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SHORT_CIRCUIT_TEST__CURRENT, oldCurrent, current, !oldCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCurrent() {
        Float oldCurrent = current;
        boolean oldCurrentESet = currentESet;
        current = CURRENT_EDEFAULT;
        currentESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SHORT_CIRCUIT_TEST__CURRENT, oldCurrent, CURRENT_EDEFAULT, oldCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCurrent() {
        return currentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getEnergisedEndStep() {
        return energisedEndStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEnergisedEndStep( Integer newEnergisedEndStep ) {
        Integer oldEnergisedEndStep = energisedEndStep;
        energisedEndStep = newEnergisedEndStep;
        boolean oldEnergisedEndStepESet = energisedEndStepESet;
        energisedEndStepESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END_STEP,
                    oldEnergisedEndStep, energisedEndStep, !oldEnergisedEndStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEnergisedEndStep() {
        Integer oldEnergisedEndStep = energisedEndStep;
        boolean oldEnergisedEndStepESet = energisedEndStepESet;
        energisedEndStep = ENERGISED_END_STEP_EDEFAULT;
        energisedEndStepESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END_STEP,
                    oldEnergisedEndStep, ENERGISED_END_STEP_EDEFAULT, oldEnergisedEndStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergisedEndStep() {
        return energisedEndStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getGroundedEndStep() {
        return groundedEndStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGroundedEndStep( Integer newGroundedEndStep ) {
        Integer oldGroundedEndStep = groundedEndStep;
        groundedEndStep = newGroundedEndStep;
        boolean oldGroundedEndStepESet = groundedEndStepESet;
        groundedEndStepESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHORT_CIRCUIT_TEST__GROUNDED_END_STEP,
                    oldGroundedEndStep, groundedEndStep, !oldGroundedEndStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGroundedEndStep() {
        Integer oldGroundedEndStep = groundedEndStep;
        boolean oldGroundedEndStepESet = groundedEndStepESet;
        groundedEndStep = GROUNDED_END_STEP_EDEFAULT;
        groundedEndStepESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHORT_CIRCUIT_TEST__GROUNDED_END_STEP,
                    oldGroundedEndStep, GROUNDED_END_STEP_EDEFAULT, oldGroundedEndStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGroundedEndStep() {
        return groundedEndStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLeakageImpedance() {
        return leakageImpedance;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLeakageImpedance( Float newLeakageImpedance ) {
        Float oldLeakageImpedance = leakageImpedance;
        leakageImpedance = newLeakageImpedance;
        boolean oldLeakageImpedanceESet = leakageImpedanceESet;
        leakageImpedanceESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE,
                    oldLeakageImpedance, leakageImpedance, !oldLeakageImpedanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLeakageImpedance() {
        Float oldLeakageImpedance = leakageImpedance;
        boolean oldLeakageImpedanceESet = leakageImpedanceESet;
        leakageImpedance = LEAKAGE_IMPEDANCE_EDEFAULT;
        leakageImpedanceESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE,
                    oldLeakageImpedance, LEAKAGE_IMPEDANCE_EDEFAULT, oldLeakageImpedanceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLeakageImpedance() {
        return leakageImpedanceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLeakageImpedanceZero() {
        return leakageImpedanceZero;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLeakageImpedanceZero( Float newLeakageImpedanceZero ) {
        Float oldLeakageImpedanceZero = leakageImpedanceZero;
        leakageImpedanceZero = newLeakageImpedanceZero;
        boolean oldLeakageImpedanceZeroESet = leakageImpedanceZeroESet;
        leakageImpedanceZeroESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO,
                        oldLeakageImpedanceZero, leakageImpedanceZero, !oldLeakageImpedanceZeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLeakageImpedanceZero() {
        Float oldLeakageImpedanceZero = leakageImpedanceZero;
        boolean oldLeakageImpedanceZeroESet = leakageImpedanceZeroESet;
        leakageImpedanceZero = LEAKAGE_IMPEDANCE_ZERO_EDEFAULT;
        leakageImpedanceZeroESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO,
                        oldLeakageImpedanceZero, LEAKAGE_IMPEDANCE_ZERO_EDEFAULT, oldLeakageImpedanceZeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLeakageImpedanceZero() {
        return leakageImpedanceZeroESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLoss() {
        return loss;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLoss( Float newLoss ) {
        Float oldLoss = loss;
        loss = newLoss;
        boolean oldLossESet = lossESet;
        lossESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SHORT_CIRCUIT_TEST__LOSS, oldLoss, loss, !oldLossESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLoss() {
        Float oldLoss = loss;
        boolean oldLossESet = lossESet;
        loss = LOSS_EDEFAULT;
        lossESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SHORT_CIRCUIT_TEST__LOSS, oldLoss, LOSS_EDEFAULT, oldLossESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLoss() {
        return lossESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLossZero() {
        return lossZero;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLossZero( Float newLossZero ) {
        Float oldLossZero = lossZero;
        lossZero = newLossZero;
        boolean oldLossZeroESet = lossZeroESet;
        lossZeroESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SHORT_CIRCUIT_TEST__LOSS_ZERO, oldLossZero, lossZero, !oldLossZeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLossZero() {
        Float oldLossZero = lossZero;
        boolean oldLossZeroESet = lossZeroESet;
        lossZero = LOSS_ZERO_EDEFAULT;
        lossZeroESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SHORT_CIRCUIT_TEST__LOSS_ZERO, oldLossZero, LOSS_ZERO_EDEFAULT, oldLossZeroESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLossZero() {
        return lossZeroESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getPower() {
        return power;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPower( Float newPower ) {
        Float oldPower = power;
        power = newPower;
        boolean oldPowerESet = powerESet;
        powerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SHORT_CIRCUIT_TEST__POWER, oldPower, power, !oldPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPower() {
        Float oldPower = power;
        boolean oldPowerESet = powerESet;
        power = POWER_EDEFAULT;
        powerESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SHORT_CIRCUIT_TEST__POWER, oldPower, POWER_EDEFAULT, oldPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPower() {
        return powerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getVoltage() {
        return voltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setVoltage( Float newVoltage ) {
        Float oldVoltage = voltage;
        voltage = newVoltage;
        boolean oldVoltageESet = voltageESet;
        voltageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SHORT_CIRCUIT_TEST__VOLTAGE, oldVoltage, voltage, !oldVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetVoltage() {
        Float oldVoltage = voltage;
        boolean oldVoltageESet = voltageESet;
        voltage = VOLTAGE_EDEFAULT;
        voltageESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SHORT_CIRCUIT_TEST__VOLTAGE, oldVoltage, VOLTAGE_EDEFAULT, oldVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetVoltage() {
        return voltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TransformerEndInfo > getGroundedEnds() {
        if( groundedEnds == null ) {
            groundedEnds = new EObjectWithInverseEList.Unsettable.ManyInverse< TransformerEndInfo >(
                    TransformerEndInfo.class, this, CimPackage.SHORT_CIRCUIT_TEST__GROUNDED_ENDS,
                    CimPackage.TRANSFORMER_END_INFO__GROUNDED_END_SHORT_CIRCUIT_TESTS );
        }
        return groundedEnds;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGroundedEnds() {
        if( groundedEnds != null ) ( ( InternalEList.Unsettable< ? > ) groundedEnds ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGroundedEnds() {
        return groundedEnds != null && ( ( InternalEList.Unsettable< ? > ) groundedEnds ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TransformerEndInfo getEnergisedEnd() {
        return energisedEnd;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEnergisedEnd( TransformerEndInfo newEnergisedEnd, NotificationChain msgs ) {
        TransformerEndInfo oldEnergisedEnd = energisedEnd;
        energisedEnd = newEnergisedEnd;
        boolean oldEnergisedEndESet = energisedEndESet;
        energisedEndESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END, oldEnergisedEnd, newEnergisedEnd,
                    !oldEnergisedEndESet );
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
    public void setEnergisedEnd( TransformerEndInfo newEnergisedEnd ) {
        if( newEnergisedEnd != energisedEnd ) {
            NotificationChain msgs = null;
            if( energisedEnd != null ) msgs = ( ( InternalEObject ) energisedEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS, TransformerEndInfo.class,
                    msgs );
            if( newEnergisedEnd != null ) msgs = ( ( InternalEObject ) newEnergisedEnd ).eInverseAdd( this,
                    CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS, TransformerEndInfo.class,
                    msgs );
            msgs = basicSetEnergisedEnd( newEnergisedEnd, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergisedEndESet = energisedEndESet;
            energisedEndESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END,
                        newEnergisedEnd, newEnergisedEnd, !oldEnergisedEndESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetEnergisedEnd( NotificationChain msgs ) {
        TransformerEndInfo oldEnergisedEnd = energisedEnd;
        energisedEnd = null;
        boolean oldEnergisedEndESet = energisedEndESet;
        energisedEndESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END, oldEnergisedEnd, null, oldEnergisedEndESet );
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
    public void unsetEnergisedEnd() {
        if( energisedEnd != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) energisedEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS, TransformerEndInfo.class,
                    msgs );
            msgs = basicUnsetEnergisedEnd( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldEnergisedEndESet = energisedEndESet;
            energisedEndESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END, null, null, oldEnergisedEndESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEnergisedEnd() {
        return energisedEndESet;
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
        case CimPackage.SHORT_CIRCUIT_TEST__GROUNDED_ENDS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getGroundedEnds() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END:
            if( energisedEnd != null ) msgs = ( ( InternalEObject ) energisedEnd ).eInverseRemove( this,
                    CimPackage.TRANSFORMER_END_INFO__ENERGISED_END_SHORT_CIRCUIT_TESTS, TransformerEndInfo.class,
                    msgs );
            return basicSetEnergisedEnd( ( TransformerEndInfo ) otherEnd, msgs );
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
        case CimPackage.SHORT_CIRCUIT_TEST__GROUNDED_ENDS:
            return ( ( InternalEList< ? > ) getGroundedEnds() ).basicRemove( otherEnd, msgs );
        case CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END:
            return basicUnsetEnergisedEnd( msgs );
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
        case CimPackage.SHORT_CIRCUIT_TEST__CURRENT:
            return getCurrent();
        case CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END_STEP:
            return getEnergisedEndStep();
        case CimPackage.SHORT_CIRCUIT_TEST__GROUNDED_END_STEP:
            return getGroundedEndStep();
        case CimPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE:
            return getLeakageImpedance();
        case CimPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO:
            return getLeakageImpedanceZero();
        case CimPackage.SHORT_CIRCUIT_TEST__LOSS:
            return getLoss();
        case CimPackage.SHORT_CIRCUIT_TEST__LOSS_ZERO:
            return getLossZero();
        case CimPackage.SHORT_CIRCUIT_TEST__POWER:
            return getPower();
        case CimPackage.SHORT_CIRCUIT_TEST__VOLTAGE:
            return getVoltage();
        case CimPackage.SHORT_CIRCUIT_TEST__GROUNDED_ENDS:
            return getGroundedEnds();
        case CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END:
            return getEnergisedEnd();
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
        case CimPackage.SHORT_CIRCUIT_TEST__CURRENT:
            setCurrent( ( Float ) newValue );
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END_STEP:
            setEnergisedEndStep( ( Integer ) newValue );
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__GROUNDED_END_STEP:
            setGroundedEndStep( ( Integer ) newValue );
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE:
            setLeakageImpedance( ( Float ) newValue );
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO:
            setLeakageImpedanceZero( ( Float ) newValue );
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__LOSS:
            setLoss( ( Float ) newValue );
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__LOSS_ZERO:
            setLossZero( ( Float ) newValue );
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__POWER:
            setPower( ( Float ) newValue );
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__VOLTAGE:
            setVoltage( ( Float ) newValue );
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__GROUNDED_ENDS:
            getGroundedEnds().clear();
            getGroundedEnds().addAll( ( Collection< ? extends TransformerEndInfo > ) newValue );
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END:
            setEnergisedEnd( ( TransformerEndInfo ) newValue );
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
        case CimPackage.SHORT_CIRCUIT_TEST__CURRENT:
            unsetCurrent();
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END_STEP:
            unsetEnergisedEndStep();
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__GROUNDED_END_STEP:
            unsetGroundedEndStep();
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE:
            unsetLeakageImpedance();
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO:
            unsetLeakageImpedanceZero();
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__LOSS:
            unsetLoss();
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__LOSS_ZERO:
            unsetLossZero();
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__POWER:
            unsetPower();
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__VOLTAGE:
            unsetVoltage();
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__GROUNDED_ENDS:
            unsetGroundedEnds();
            return;
        case CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END:
            unsetEnergisedEnd();
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
        case CimPackage.SHORT_CIRCUIT_TEST__CURRENT:
            return isSetCurrent();
        case CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END_STEP:
            return isSetEnergisedEndStep();
        case CimPackage.SHORT_CIRCUIT_TEST__GROUNDED_END_STEP:
            return isSetGroundedEndStep();
        case CimPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE:
            return isSetLeakageImpedance();
        case CimPackage.SHORT_CIRCUIT_TEST__LEAKAGE_IMPEDANCE_ZERO:
            return isSetLeakageImpedanceZero();
        case CimPackage.SHORT_CIRCUIT_TEST__LOSS:
            return isSetLoss();
        case CimPackage.SHORT_CIRCUIT_TEST__LOSS_ZERO:
            return isSetLossZero();
        case CimPackage.SHORT_CIRCUIT_TEST__POWER:
            return isSetPower();
        case CimPackage.SHORT_CIRCUIT_TEST__VOLTAGE:
            return isSetVoltage();
        case CimPackage.SHORT_CIRCUIT_TEST__GROUNDED_ENDS:
            return isSetGroundedEnds();
        case CimPackage.SHORT_CIRCUIT_TEST__ENERGISED_END:
            return isSetEnergisedEnd();
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
        result.append( " (current: " );
        if( currentESet )
            result.append( current );
        else
            result.append( "<unset>" );
        result.append( ", energisedEndStep: " );
        if( energisedEndStepESet )
            result.append( energisedEndStep );
        else
            result.append( "<unset>" );
        result.append( ", groundedEndStep: " );
        if( groundedEndStepESet )
            result.append( groundedEndStep );
        else
            result.append( "<unset>" );
        result.append( ", leakageImpedance: " );
        if( leakageImpedanceESet )
            result.append( leakageImpedance );
        else
            result.append( "<unset>" );
        result.append( ", leakageImpedanceZero: " );
        if( leakageImpedanceZeroESet )
            result.append( leakageImpedanceZero );
        else
            result.append( "<unset>" );
        result.append( ", loss: " );
        if( lossESet )
            result.append( loss );
        else
            result.append( "<unset>" );
        result.append( ", lossZero: " );
        if( lossZeroESet )
            result.append( lossZero );
        else
            result.append( "<unset>" );
        result.append( ", power: " );
        if( powerESet )
            result.append( power );
        else
            result.append( "<unset>" );
        result.append( ", voltage: " );
        if( voltageESet )
            result.append( voltage );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //ShortCircuitTestImpl
