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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SvTapStep;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerControl;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapSchedule;

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
 * An implementation of the model object '<em><b>Tap Changer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerImpl#getControlEnabled <em>Control Enabled</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerImpl#getHighStep <em>High Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerImpl#getInitialDelay <em>Initial Delay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerImpl#getLowStep <em>Low Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerImpl#getLtcFlag <em>Ltc Flag</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerImpl#getNeutralStep <em>Neutral Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerImpl#getNeutralU <em>Neutral U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerImpl#getNormalStep <em>Normal Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerImpl#getStep <em>Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerImpl#getSubsequentDelay <em>Subsequent Delay</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerImpl#getSvTapStep <em>Sv Tap Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerImpl#getTapSchedules <em>Tap Schedules</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerImpl#getTapChangerControl <em>Tap Changer Control</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TapChangerImpl extends PowerSystemResourceImpl implements TapChanger {
    /**
     * The default value of the '{@link #getControlEnabled() <em>Control Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlEnabled()
     * @generated
     * @ordered
     */
    protected static final Boolean CONTROL_ENABLED_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getControlEnabled() <em>Control Enabled</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getControlEnabled()
     * @generated
     * @ordered
     */
    protected Boolean controlEnabled = CONTROL_ENABLED_EDEFAULT;

    /**
     * This is true if the Control Enabled attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean controlEnabledESet;

    /**
     * The default value of the '{@link #getHighStep() <em>High Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighStep()
     * @generated
     * @ordered
     */
    protected static final Integer HIGH_STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHighStep() <em>High Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighStep()
     * @generated
     * @ordered
     */
    protected Integer highStep = HIGH_STEP_EDEFAULT;

    /**
     * This is true if the High Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean highStepESet;

    /**
     * The default value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialDelay()
     * @generated
     * @ordered
     */
    protected static final Float INITIAL_DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getInitialDelay() <em>Initial Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getInitialDelay()
     * @generated
     * @ordered
     */
    protected Float initialDelay = INITIAL_DELAY_EDEFAULT;

    /**
     * This is true if the Initial Delay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean initialDelayESet;

    /**
     * The default value of the '{@link #getLowStep() <em>Low Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowStep()
     * @generated
     * @ordered
     */
    protected static final Integer LOW_STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLowStep() <em>Low Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowStep()
     * @generated
     * @ordered
     */
    protected Integer lowStep = LOW_STEP_EDEFAULT;

    /**
     * This is true if the Low Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lowStepESet;

    /**
     * The default value of the '{@link #getLtcFlag() <em>Ltc Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLtcFlag()
     * @generated
     * @ordered
     */
    protected static final Boolean LTC_FLAG_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLtcFlag() <em>Ltc Flag</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLtcFlag()
     * @generated
     * @ordered
     */
    protected Boolean ltcFlag = LTC_FLAG_EDEFAULT;

    /**
     * This is true if the Ltc Flag attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ltcFlagESet;

    /**
     * The default value of the '{@link #getNeutralStep() <em>Neutral Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralStep()
     * @generated
     * @ordered
     */
    protected static final Integer NEUTRAL_STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNeutralStep() <em>Neutral Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralStep()
     * @generated
     * @ordered
     */
    protected Integer neutralStep = NEUTRAL_STEP_EDEFAULT;

    /**
     * This is true if the Neutral Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean neutralStepESet;

    /**
     * The default value of the '{@link #getNeutralU() <em>Neutral U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralU()
     * @generated
     * @ordered
     */
    protected static final Float NEUTRAL_U_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNeutralU() <em>Neutral U</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNeutralU()
     * @generated
     * @ordered
     */
    protected Float neutralU = NEUTRAL_U_EDEFAULT;

    /**
     * This is true if the Neutral U attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean neutralUESet;

    /**
     * The default value of the '{@link #getNormalStep() <em>Normal Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalStep()
     * @generated
     * @ordered
     */
    protected static final Integer NORMAL_STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getNormalStep() <em>Normal Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNormalStep()
     * @generated
     * @ordered
     */
    protected Integer normalStep = NORMAL_STEP_EDEFAULT;

    /**
     * This is true if the Normal Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean normalStepESet;

    /**
     * The default value of the '{@link #getStep() <em>Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStep()
     * @generated
     * @ordered
     */
    protected static final Float STEP_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStep() <em>Step</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStep()
     * @generated
     * @ordered
     */
    protected Float step = STEP_EDEFAULT;

    /**
     * This is true if the Step attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean stepESet;

    /**
     * The default value of the '{@link #getSubsequentDelay() <em>Subsequent Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubsequentDelay()
     * @generated
     * @ordered
     */
    protected static final Float SUBSEQUENT_DELAY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSubsequentDelay() <em>Subsequent Delay</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSubsequentDelay()
     * @generated
     * @ordered
     */
    protected Float subsequentDelay = SUBSEQUENT_DELAY_EDEFAULT;

    /**
     * This is true if the Subsequent Delay attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean subsequentDelayESet;

    /**
     * The cached value of the '{@link #getSvTapStep() <em>Sv Tap Step</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSvTapStep()
     * @generated
     * @ordered
     */
    protected SvTapStep svTapStep;

    /**
     * This is true if the Sv Tap Step reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean svTapStepESet;

    /**
     * The cached value of the '{@link #getTapSchedules() <em>Tap Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTapSchedules()
     * @generated
     * @ordered
     */
    protected EList< TapSchedule > tapSchedules;

    /**
     * The cached value of the '{@link #getTapChangerControl() <em>Tap Changer Control</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTapChangerControl()
     * @generated
     * @ordered
     */
    protected TapChangerControl tapChangerControl;

    /**
     * This is true if the Tap Changer Control reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tapChangerControlESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TapChangerImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTapChanger();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getControlEnabled() {
        return controlEnabled;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setControlEnabled( Boolean newControlEnabled ) {
        Boolean oldControlEnabled = controlEnabled;
        controlEnabled = newControlEnabled;
        boolean oldControlEnabledESet = controlEnabledESet;
        controlEnabledESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER__CONTROL_ENABLED, oldControlEnabled, controlEnabled, !oldControlEnabledESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetControlEnabled() {
        Boolean oldControlEnabled = controlEnabled;
        boolean oldControlEnabledESet = controlEnabledESet;
        controlEnabled = CONTROL_ENABLED_EDEFAULT;
        controlEnabledESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER__CONTROL_ENABLED,
                    oldControlEnabled, CONTROL_ENABLED_EDEFAULT, oldControlEnabledESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetControlEnabled() {
        return controlEnabledESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getHighStep() {
        return highStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHighStep( Integer newHighStep ) {
        Integer oldHighStep = highStep;
        highStep = newHighStep;
        boolean oldHighStepESet = highStepESet;
        highStepESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER__HIGH_STEP, oldHighStep, highStep, !oldHighStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHighStep() {
        Integer oldHighStep = highStep;
        boolean oldHighStepESet = highStepESet;
        highStep = HIGH_STEP_EDEFAULT;
        highStepESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER__HIGH_STEP, oldHighStep, HIGH_STEP_EDEFAULT, oldHighStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHighStep() {
        return highStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getInitialDelay() {
        return initialDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setInitialDelay( Float newInitialDelay ) {
        Float oldInitialDelay = initialDelay;
        initialDelay = newInitialDelay;
        boolean oldInitialDelayESet = initialDelayESet;
        initialDelayESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER__INITIAL_DELAY, oldInitialDelay, initialDelay, !oldInitialDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetInitialDelay() {
        Float oldInitialDelay = initialDelay;
        boolean oldInitialDelayESet = initialDelayESet;
        initialDelay = INITIAL_DELAY_EDEFAULT;
        initialDelayESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER__INITIAL_DELAY, oldInitialDelay, INITIAL_DELAY_EDEFAULT, oldInitialDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetInitialDelay() {
        return initialDelayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getLowStep() {
        return lowStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLowStep( Integer newLowStep ) {
        Integer oldLowStep = lowStep;
        lowStep = newLowStep;
        boolean oldLowStepESet = lowStepESet;
        lowStepESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER__LOW_STEP, oldLowStep, lowStep, !oldLowStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLowStep() {
        Integer oldLowStep = lowStep;
        boolean oldLowStepESet = lowStepESet;
        lowStep = LOW_STEP_EDEFAULT;
        lowStepESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER__LOW_STEP, oldLowStep, LOW_STEP_EDEFAULT, oldLowStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLowStep() {
        return lowStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Boolean getLtcFlag() {
        return ltcFlag;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLtcFlag( Boolean newLtcFlag ) {
        Boolean oldLtcFlag = ltcFlag;
        ltcFlag = newLtcFlag;
        boolean oldLtcFlagESet = ltcFlagESet;
        ltcFlagESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER__LTC_FLAG, oldLtcFlag, ltcFlag, !oldLtcFlagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLtcFlag() {
        Boolean oldLtcFlag = ltcFlag;
        boolean oldLtcFlagESet = ltcFlagESet;
        ltcFlag = LTC_FLAG_EDEFAULT;
        ltcFlagESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER__LTC_FLAG, oldLtcFlag, LTC_FLAG_EDEFAULT, oldLtcFlagESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLtcFlag() {
        return ltcFlagESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getNeutralStep() {
        return neutralStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNeutralStep( Integer newNeutralStep ) {
        Integer oldNeutralStep = neutralStep;
        neutralStep = newNeutralStep;
        boolean oldNeutralStepESet = neutralStepESet;
        neutralStepESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER__NEUTRAL_STEP, oldNeutralStep, neutralStep, !oldNeutralStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNeutralStep() {
        Integer oldNeutralStep = neutralStep;
        boolean oldNeutralStepESet = neutralStepESet;
        neutralStep = NEUTRAL_STEP_EDEFAULT;
        neutralStepESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER__NEUTRAL_STEP, oldNeutralStep, NEUTRAL_STEP_EDEFAULT, oldNeutralStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNeutralStep() {
        return neutralStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getNeutralU() {
        return neutralU;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNeutralU( Float newNeutralU ) {
        Float oldNeutralU = neutralU;
        neutralU = newNeutralU;
        boolean oldNeutralUESet = neutralUESet;
        neutralUESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER__NEUTRAL_U, oldNeutralU, neutralU, !oldNeutralUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNeutralU() {
        Float oldNeutralU = neutralU;
        boolean oldNeutralUESet = neutralUESet;
        neutralU = NEUTRAL_U_EDEFAULT;
        neutralUESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER__NEUTRAL_U, oldNeutralU, NEUTRAL_U_EDEFAULT, oldNeutralUESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNeutralU() {
        return neutralUESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getNormalStep() {
        return normalStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setNormalStep( Integer newNormalStep ) {
        Integer oldNormalStep = normalStep;
        normalStep = newNormalStep;
        boolean oldNormalStepESet = normalStepESet;
        normalStepESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER__NORMAL_STEP, oldNormalStep, normalStep, !oldNormalStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetNormalStep() {
        Integer oldNormalStep = normalStep;
        boolean oldNormalStepESet = normalStepESet;
        normalStep = NORMAL_STEP_EDEFAULT;
        normalStepESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER__NORMAL_STEP, oldNormalStep, NORMAL_STEP_EDEFAULT, oldNormalStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNormalStep() {
        return normalStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getStep() {
        return step;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStep( Float newStep ) {
        Float oldStep = step;
        step = newStep;
        boolean oldStepESet = stepESet;
        stepESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER__STEP, oldStep, step, !oldStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStep() {
        Float oldStep = step;
        boolean oldStepESet = stepESet;
        step = STEP_EDEFAULT;
        stepESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER__STEP, oldStep, STEP_EDEFAULT, oldStepESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStep() {
        return stepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSubsequentDelay() {
        return subsequentDelay;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSubsequentDelay( Float newSubsequentDelay ) {
        Float oldSubsequentDelay = subsequentDelay;
        subsequentDelay = newSubsequentDelay;
        boolean oldSubsequentDelayESet = subsequentDelayESet;
        subsequentDelayESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER__SUBSEQUENT_DELAY,
                    oldSubsequentDelay, subsequentDelay, !oldSubsequentDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSubsequentDelay() {
        Float oldSubsequentDelay = subsequentDelay;
        boolean oldSubsequentDelayESet = subsequentDelayESet;
        subsequentDelay = SUBSEQUENT_DELAY_EDEFAULT;
        subsequentDelayESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER__SUBSEQUENT_DELAY,
                    oldSubsequentDelay, SUBSEQUENT_DELAY_EDEFAULT, oldSubsequentDelayESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSubsequentDelay() {
        return subsequentDelayESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SvTapStep getSvTapStep() {
        return svTapStep;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSvTapStep( SvTapStep newSvTapStep, NotificationChain msgs ) {
        SvTapStep oldSvTapStep = svTapStep;
        svTapStep = newSvTapStep;
        boolean oldSvTapStepESet = svTapStepESet;
        svTapStepESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TAP_CHANGER__SV_TAP_STEP, oldSvTapStep, newSvTapStep, !oldSvTapStepESet );
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
    public void setSvTapStep( SvTapStep newSvTapStep ) {
        if( newSvTapStep != svTapStep ) {
            NotificationChain msgs = null;
            if( svTapStep != null ) msgs = ( ( InternalEObject ) svTapStep ).eInverseRemove( this,
                    CimPackage.SV_TAP_STEP__TAP_CHANGER, SvTapStep.class, msgs );
            if( newSvTapStep != null ) msgs = ( ( InternalEObject ) newSvTapStep ).eInverseAdd( this,
                    CimPackage.SV_TAP_STEP__TAP_CHANGER, SvTapStep.class, msgs );
            msgs = basicSetSvTapStep( newSvTapStep, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSvTapStepESet = svTapStepESet;
            svTapStepESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TAP_CHANGER__SV_TAP_STEP, newSvTapStep, newSvTapStep, !oldSvTapStepESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSvTapStep( NotificationChain msgs ) {
        SvTapStep oldSvTapStep = svTapStep;
        svTapStep = null;
        boolean oldSvTapStepESet = svTapStepESet;
        svTapStepESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TAP_CHANGER__SV_TAP_STEP, oldSvTapStep, null, oldSvTapStepESet );
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
    public void unsetSvTapStep() {
        if( svTapStep != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) svTapStep ).eInverseRemove( this, CimPackage.SV_TAP_STEP__TAP_CHANGER,
                    SvTapStep.class, msgs );
            msgs = basicUnsetSvTapStep( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSvTapStepESet = svTapStepESet;
            svTapStepESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TAP_CHANGER__SV_TAP_STEP, null, null, oldSvTapStepESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSvTapStep() {
        return svTapStepESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< TapSchedule > getTapSchedules() {
        if( tapSchedules == null ) {
            tapSchedules = new EObjectWithInverseResolvingEList.Unsettable< TapSchedule >( TapSchedule.class, this,
                    CimPackage.TAP_CHANGER__TAP_SCHEDULES, CimPackage.TAP_SCHEDULE__TAP_CHANGER );
        }
        return tapSchedules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTapSchedules() {
        if( tapSchedules != null ) ( ( InternalEList.Unsettable< ? > ) tapSchedules ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTapSchedules() {
        return tapSchedules != null && ( ( InternalEList.Unsettable< ? > ) tapSchedules ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapChangerControl getTapChangerControl() {
        return tapChangerControl;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTapChangerControl( TapChangerControl newTapChangerControl,
            NotificationChain msgs ) {
        TapChangerControl oldTapChangerControl = tapChangerControl;
        tapChangerControl = newTapChangerControl;
        boolean oldTapChangerControlESet = tapChangerControlESet;
        tapChangerControlESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL, oldTapChangerControl, newTapChangerControl,
                    !oldTapChangerControlESet );
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
    public void setTapChangerControl( TapChangerControl newTapChangerControl ) {
        if( newTapChangerControl != tapChangerControl ) {
            NotificationChain msgs = null;
            if( tapChangerControl != null ) msgs = ( ( InternalEObject ) tapChangerControl ).eInverseRemove( this,
                    CimPackage.TAP_CHANGER_CONTROL__TAP_CHANGER, TapChangerControl.class, msgs );
            if( newTapChangerControl != null ) msgs = ( ( InternalEObject ) newTapChangerControl ).eInverseAdd( this,
                    CimPackage.TAP_CHANGER_CONTROL__TAP_CHANGER, TapChangerControl.class, msgs );
            msgs = basicSetTapChangerControl( newTapChangerControl, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTapChangerControlESet = tapChangerControlESet;
            tapChangerControlESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL,
                        newTapChangerControl, newTapChangerControl, !oldTapChangerControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTapChangerControl( NotificationChain msgs ) {
        TapChangerControl oldTapChangerControl = tapChangerControl;
        tapChangerControl = null;
        boolean oldTapChangerControlESet = tapChangerControlESet;
        tapChangerControlESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL, oldTapChangerControl, null, oldTapChangerControlESet );
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
    public void unsetTapChangerControl() {
        if( tapChangerControl != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) tapChangerControl ).eInverseRemove( this,
                    CimPackage.TAP_CHANGER_CONTROL__TAP_CHANGER, TapChangerControl.class, msgs );
            msgs = basicUnsetTapChangerControl( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTapChangerControlESet = tapChangerControlESet;
            tapChangerControlESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL, null, null, oldTapChangerControlESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTapChangerControl() {
        return tapChangerControlESet;
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
        case CimPackage.TAP_CHANGER__SV_TAP_STEP:
            if( svTapStep != null ) msgs = ( ( InternalEObject ) svTapStep ).eInverseRemove( this,
                    CimPackage.SV_TAP_STEP__TAP_CHANGER, SvTapStep.class, msgs );
            return basicSetSvTapStep( ( SvTapStep ) otherEnd, msgs );
        case CimPackage.TAP_CHANGER__TAP_SCHEDULES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getTapSchedules() ).basicAdd( otherEnd,
                    msgs );
        case CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
            if( tapChangerControl != null ) msgs = ( ( InternalEObject ) tapChangerControl ).eInverseRemove( this,
                    CimPackage.TAP_CHANGER_CONTROL__TAP_CHANGER, TapChangerControl.class, msgs );
            return basicSetTapChangerControl( ( TapChangerControl ) otherEnd, msgs );
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
        case CimPackage.TAP_CHANGER__SV_TAP_STEP:
            return basicUnsetSvTapStep( msgs );
        case CimPackage.TAP_CHANGER__TAP_SCHEDULES:
            return ( ( InternalEList< ? > ) getTapSchedules() ).basicRemove( otherEnd, msgs );
        case CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
            return basicUnsetTapChangerControl( msgs );
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
        case CimPackage.TAP_CHANGER__CONTROL_ENABLED:
            return getControlEnabled();
        case CimPackage.TAP_CHANGER__HIGH_STEP:
            return getHighStep();
        case CimPackage.TAP_CHANGER__INITIAL_DELAY:
            return getInitialDelay();
        case CimPackage.TAP_CHANGER__LOW_STEP:
            return getLowStep();
        case CimPackage.TAP_CHANGER__LTC_FLAG:
            return getLtcFlag();
        case CimPackage.TAP_CHANGER__NEUTRAL_STEP:
            return getNeutralStep();
        case CimPackage.TAP_CHANGER__NEUTRAL_U:
            return getNeutralU();
        case CimPackage.TAP_CHANGER__NORMAL_STEP:
            return getNormalStep();
        case CimPackage.TAP_CHANGER__STEP:
            return getStep();
        case CimPackage.TAP_CHANGER__SUBSEQUENT_DELAY:
            return getSubsequentDelay();
        case CimPackage.TAP_CHANGER__SV_TAP_STEP:
            return getSvTapStep();
        case CimPackage.TAP_CHANGER__TAP_SCHEDULES:
            return getTapSchedules();
        case CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
            return getTapChangerControl();
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
        case CimPackage.TAP_CHANGER__CONTROL_ENABLED:
            setControlEnabled( ( Boolean ) newValue );
            return;
        case CimPackage.TAP_CHANGER__HIGH_STEP:
            setHighStep( ( Integer ) newValue );
            return;
        case CimPackage.TAP_CHANGER__INITIAL_DELAY:
            setInitialDelay( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER__LOW_STEP:
            setLowStep( ( Integer ) newValue );
            return;
        case CimPackage.TAP_CHANGER__LTC_FLAG:
            setLtcFlag( ( Boolean ) newValue );
            return;
        case CimPackage.TAP_CHANGER__NEUTRAL_STEP:
            setNeutralStep( ( Integer ) newValue );
            return;
        case CimPackage.TAP_CHANGER__NEUTRAL_U:
            setNeutralU( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER__NORMAL_STEP:
            setNormalStep( ( Integer ) newValue );
            return;
        case CimPackage.TAP_CHANGER__STEP:
            setStep( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER__SUBSEQUENT_DELAY:
            setSubsequentDelay( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER__SV_TAP_STEP:
            setSvTapStep( ( SvTapStep ) newValue );
            return;
        case CimPackage.TAP_CHANGER__TAP_SCHEDULES:
            getTapSchedules().clear();
            getTapSchedules().addAll( ( Collection< ? extends TapSchedule > ) newValue );
            return;
        case CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
            setTapChangerControl( ( TapChangerControl ) newValue );
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
        case CimPackage.TAP_CHANGER__CONTROL_ENABLED:
            unsetControlEnabled();
            return;
        case CimPackage.TAP_CHANGER__HIGH_STEP:
            unsetHighStep();
            return;
        case CimPackage.TAP_CHANGER__INITIAL_DELAY:
            unsetInitialDelay();
            return;
        case CimPackage.TAP_CHANGER__LOW_STEP:
            unsetLowStep();
            return;
        case CimPackage.TAP_CHANGER__LTC_FLAG:
            unsetLtcFlag();
            return;
        case CimPackage.TAP_CHANGER__NEUTRAL_STEP:
            unsetNeutralStep();
            return;
        case CimPackage.TAP_CHANGER__NEUTRAL_U:
            unsetNeutralU();
            return;
        case CimPackage.TAP_CHANGER__NORMAL_STEP:
            unsetNormalStep();
            return;
        case CimPackage.TAP_CHANGER__STEP:
            unsetStep();
            return;
        case CimPackage.TAP_CHANGER__SUBSEQUENT_DELAY:
            unsetSubsequentDelay();
            return;
        case CimPackage.TAP_CHANGER__SV_TAP_STEP:
            unsetSvTapStep();
            return;
        case CimPackage.TAP_CHANGER__TAP_SCHEDULES:
            unsetTapSchedules();
            return;
        case CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
            unsetTapChangerControl();
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
        case CimPackage.TAP_CHANGER__CONTROL_ENABLED:
            return isSetControlEnabled();
        case CimPackage.TAP_CHANGER__HIGH_STEP:
            return isSetHighStep();
        case CimPackage.TAP_CHANGER__INITIAL_DELAY:
            return isSetInitialDelay();
        case CimPackage.TAP_CHANGER__LOW_STEP:
            return isSetLowStep();
        case CimPackage.TAP_CHANGER__LTC_FLAG:
            return isSetLtcFlag();
        case CimPackage.TAP_CHANGER__NEUTRAL_STEP:
            return isSetNeutralStep();
        case CimPackage.TAP_CHANGER__NEUTRAL_U:
            return isSetNeutralU();
        case CimPackage.TAP_CHANGER__NORMAL_STEP:
            return isSetNormalStep();
        case CimPackage.TAP_CHANGER__STEP:
            return isSetStep();
        case CimPackage.TAP_CHANGER__SUBSEQUENT_DELAY:
            return isSetSubsequentDelay();
        case CimPackage.TAP_CHANGER__SV_TAP_STEP:
            return isSetSvTapStep();
        case CimPackage.TAP_CHANGER__TAP_SCHEDULES:
            return isSetTapSchedules();
        case CimPackage.TAP_CHANGER__TAP_CHANGER_CONTROL:
            return isSetTapChangerControl();
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
        result.append( " (controlEnabled: " );
        if( controlEnabledESet )
            result.append( controlEnabled );
        else
            result.append( "<unset>" );
        result.append( ", highStep: " );
        if( highStepESet )
            result.append( highStep );
        else
            result.append( "<unset>" );
        result.append( ", initialDelay: " );
        if( initialDelayESet )
            result.append( initialDelay );
        else
            result.append( "<unset>" );
        result.append( ", lowStep: " );
        if( lowStepESet )
            result.append( lowStep );
        else
            result.append( "<unset>" );
        result.append( ", ltcFlag: " );
        if( ltcFlagESet )
            result.append( ltcFlag );
        else
            result.append( "<unset>" );
        result.append( ", neutralStep: " );
        if( neutralStepESet )
            result.append( neutralStep );
        else
            result.append( "<unset>" );
        result.append( ", neutralU: " );
        if( neutralUESet )
            result.append( neutralU );
        else
            result.append( "<unset>" );
        result.append( ", normalStep: " );
        if( normalStepESet )
            result.append( normalStep );
        else
            result.append( "<unset>" );
        result.append( ", step: " );
        if( stepESet )
            result.append( step );
        else
            result.append( "<unset>" );
        result.append( ", subsequentDelay: " );
        if( subsequentDelayESet )
            result.append( subsequentDelay );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TapChangerImpl
