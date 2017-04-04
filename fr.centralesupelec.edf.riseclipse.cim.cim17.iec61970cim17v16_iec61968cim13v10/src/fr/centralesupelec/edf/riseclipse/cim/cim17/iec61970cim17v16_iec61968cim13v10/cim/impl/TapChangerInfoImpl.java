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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChangerInfo;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tap Changer Info</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerInfoImpl#getBil <em>Bil</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerInfoImpl#getCtRating <em>Ct Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerInfoImpl#getCtRatio <em>Ct Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerInfoImpl#getFrequency <em>Frequency</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerInfoImpl#getHighStep <em>High Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerInfoImpl#getIsTcul <em>Is Tcul</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerInfoImpl#getLowStep <em>Low Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerInfoImpl#getNeutralStep <em>Neutral Step</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerInfoImpl#getNeutralU <em>Neutral U</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerInfoImpl#getPtRatio <em>Pt Ratio</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerInfoImpl#getRatedApparentPower <em>Rated Apparent Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerInfoImpl#getRatedCurrent <em>Rated Current</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerInfoImpl#getRatedVoltage <em>Rated Voltage</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerInfoImpl#getStepPhaseIncrement <em>Step Phase Increment</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapChangerInfoImpl#getStepVoltageIncrement <em>Step Voltage Increment</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TapChangerInfoImpl extends AssetInfoImpl implements TapChangerInfo {
    /**
     * The default value of the '{@link #getBil() <em>Bil</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBil()
     * @generated
     * @ordered
     */
    protected static final Float BIL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getBil() <em>Bil</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getBil()
     * @generated
     * @ordered
     */
    protected Float bil = BIL_EDEFAULT;

    /**
     * This is true if the Bil attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean bilESet;

    /**
     * The default value of the '{@link #getCtRating() <em>Ct Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCtRating()
     * @generated
     * @ordered
     */
    protected static final Float CT_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCtRating() <em>Ct Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCtRating()
     * @generated
     * @ordered
     */
    protected Float ctRating = CT_RATING_EDEFAULT;

    /**
     * This is true if the Ct Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ctRatingESet;

    /**
     * The default value of the '{@link #getCtRatio() <em>Ct Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCtRatio()
     * @generated
     * @ordered
     */
    protected static final Float CT_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCtRatio() <em>Ct Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCtRatio()
     * @generated
     * @ordered
     */
    protected Float ctRatio = CT_RATIO_EDEFAULT;

    /**
     * This is true if the Ct Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ctRatioESet;

    /**
     * The default value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrequency()
     * @generated
     * @ordered
     */
    protected static final Float FREQUENCY_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getFrequency() <em>Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFrequency()
     * @generated
     * @ordered
     */
    protected Float frequency = FREQUENCY_EDEFAULT;

    /**
     * This is true if the Frequency attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean frequencyESet;

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
     * The default value of the '{@link #getIsTcul() <em>Is Tcul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsTcul()
     * @generated
     * @ordered
     */
    protected static final Boolean IS_TCUL_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getIsTcul() <em>Is Tcul</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getIsTcul()
     * @generated
     * @ordered
     */
    protected Boolean isTcul = IS_TCUL_EDEFAULT;

    /**
     * This is true if the Is Tcul attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean isTculESet;

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
     * The default value of the '{@link #getPtRatio() <em>Pt Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPtRatio()
     * @generated
     * @ordered
     */
    protected static final Float PT_RATIO_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getPtRatio() <em>Pt Ratio</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPtRatio()
     * @generated
     * @ordered
     */
    protected Float ptRatio = PT_RATIO_EDEFAULT;

    /**
     * This is true if the Pt Ratio attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ptRatioESet;

    /**
     * The default value of the '{@link #getRatedApparentPower() <em>Rated Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedApparentPower()
     * @generated
     * @ordered
     */
    protected static final Float RATED_APPARENT_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedApparentPower() <em>Rated Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedApparentPower()
     * @generated
     * @ordered
     */
    protected Float ratedApparentPower = RATED_APPARENT_POWER_EDEFAULT;

    /**
     * This is true if the Rated Apparent Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedApparentPowerESet;

    /**
     * The default value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCurrent()
     * @generated
     * @ordered
     */
    protected static final Float RATED_CURRENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedCurrent() <em>Rated Current</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedCurrent()
     * @generated
     * @ordered
     */
    protected Float ratedCurrent = RATED_CURRENT_EDEFAULT;

    /**
     * This is true if the Rated Current attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedCurrentESet;

    /**
     * The default value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedVoltage()
     * @generated
     * @ordered
     */
    protected static final Float RATED_VOLTAGE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedVoltage() <em>Rated Voltage</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedVoltage()
     * @generated
     * @ordered
     */
    protected Float ratedVoltage = RATED_VOLTAGE_EDEFAULT;

    /**
     * This is true if the Rated Voltage attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedVoltageESet;

    /**
     * The default value of the '{@link #getStepPhaseIncrement() <em>Step Phase Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStepPhaseIncrement()
     * @generated
     * @ordered
     */
    protected static final Float STEP_PHASE_INCREMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStepPhaseIncrement() <em>Step Phase Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStepPhaseIncrement()
     * @generated
     * @ordered
     */
    protected Float stepPhaseIncrement = STEP_PHASE_INCREMENT_EDEFAULT;

    /**
     * This is true if the Step Phase Increment attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean stepPhaseIncrementESet;

    /**
     * The default value of the '{@link #getStepVoltageIncrement() <em>Step Voltage Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStepVoltageIncrement()
     * @generated
     * @ordered
     */
    protected static final Float STEP_VOLTAGE_INCREMENT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStepVoltageIncrement() <em>Step Voltage Increment</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStepVoltageIncrement()
     * @generated
     * @ordered
     */
    protected Float stepVoltageIncrement = STEP_VOLTAGE_INCREMENT_EDEFAULT;

    /**
     * This is true if the Step Voltage Increment attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean stepVoltageIncrementESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TapChangerInfoImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTapChangerInfo();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getBil() {
        return bil;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setBil( Float newBil ) {
        Float oldBil = bil;
        bil = newBil;
        boolean oldBilESet = bilESet;
        bilESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER_INFO__BIL, oldBil, bil, !oldBilESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetBil() {
        Float oldBil = bil;
        boolean oldBilESet = bilESet;
        bil = BIL_EDEFAULT;
        bilESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER_INFO__BIL, oldBil, BIL_EDEFAULT, oldBilESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetBil() {
        return bilESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCtRating() {
        return ctRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCtRating( Float newCtRating ) {
        Float oldCtRating = ctRating;
        ctRating = newCtRating;
        boolean oldCtRatingESet = ctRatingESet;
        ctRatingESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER_INFO__CT_RATING, oldCtRating, ctRating, !oldCtRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCtRating() {
        Float oldCtRating = ctRating;
        boolean oldCtRatingESet = ctRatingESet;
        ctRating = CT_RATING_EDEFAULT;
        ctRatingESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER_INFO__CT_RATING, oldCtRating, CT_RATING_EDEFAULT, oldCtRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCtRating() {
        return ctRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCtRatio() {
        return ctRatio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCtRatio( Float newCtRatio ) {
        Float oldCtRatio = ctRatio;
        ctRatio = newCtRatio;
        boolean oldCtRatioESet = ctRatioESet;
        ctRatioESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER_INFO__CT_RATIO, oldCtRatio, ctRatio, !oldCtRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCtRatio() {
        Float oldCtRatio = ctRatio;
        boolean oldCtRatioESet = ctRatioESet;
        ctRatio = CT_RATIO_EDEFAULT;
        ctRatioESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER_INFO__CT_RATIO, oldCtRatio, CT_RATIO_EDEFAULT, oldCtRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCtRatio() {
        return ctRatioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getFrequency() {
        return frequency;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setFrequency( Float newFrequency ) {
        Float oldFrequency = frequency;
        frequency = newFrequency;
        boolean oldFrequencyESet = frequencyESet;
        frequencyESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER_INFO__FREQUENCY, oldFrequency, frequency, !oldFrequencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetFrequency() {
        Float oldFrequency = frequency;
        boolean oldFrequencyESet = frequencyESet;
        frequency = FREQUENCY_EDEFAULT;
        frequencyESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER_INFO__FREQUENCY, oldFrequency, FREQUENCY_EDEFAULT, oldFrequencyESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetFrequency() {
        return frequencyESet;
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
                CimPackage.TAP_CHANGER_INFO__HIGH_STEP, oldHighStep, highStep, !oldHighStepESet ) );
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
                CimPackage.TAP_CHANGER_INFO__HIGH_STEP, oldHighStep, HIGH_STEP_EDEFAULT, oldHighStepESet ) );
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
    public Boolean getIsTcul() {
        return isTcul;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setIsTcul( Boolean newIsTcul ) {
        Boolean oldIsTcul = isTcul;
        isTcul = newIsTcul;
        boolean oldIsTculESet = isTculESet;
        isTculESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER_INFO__IS_TCUL, oldIsTcul, isTcul, !oldIsTculESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetIsTcul() {
        Boolean oldIsTcul = isTcul;
        boolean oldIsTculESet = isTculESet;
        isTcul = IS_TCUL_EDEFAULT;
        isTculESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER_INFO__IS_TCUL, oldIsTcul, IS_TCUL_EDEFAULT, oldIsTculESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetIsTcul() {
        return isTculESet;
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
                CimPackage.TAP_CHANGER_INFO__LOW_STEP, oldLowStep, lowStep, !oldLowStepESet ) );
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
                CimPackage.TAP_CHANGER_INFO__LOW_STEP, oldLowStep, LOW_STEP_EDEFAULT, oldLowStepESet ) );
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
                CimPackage.TAP_CHANGER_INFO__NEUTRAL_STEP, oldNeutralStep, neutralStep, !oldNeutralStepESet ) );
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
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_INFO__NEUTRAL_STEP,
                    oldNeutralStep, NEUTRAL_STEP_EDEFAULT, oldNeutralStepESet ) );
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
                CimPackage.TAP_CHANGER_INFO__NEUTRAL_U, oldNeutralU, neutralU, !oldNeutralUESet ) );
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
                CimPackage.TAP_CHANGER_INFO__NEUTRAL_U, oldNeutralU, NEUTRAL_U_EDEFAULT, oldNeutralUESet ) );
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
    public Float getPtRatio() {
        return ptRatio;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setPtRatio( Float newPtRatio ) {
        Float oldPtRatio = ptRatio;
        ptRatio = newPtRatio;
        boolean oldPtRatioESet = ptRatioESet;
        ptRatioESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER_INFO__PT_RATIO, oldPtRatio, ptRatio, !oldPtRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetPtRatio() {
        Float oldPtRatio = ptRatio;
        boolean oldPtRatioESet = ptRatioESet;
        ptRatio = PT_RATIO_EDEFAULT;
        ptRatioESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.TAP_CHANGER_INFO__PT_RATIO, oldPtRatio, PT_RATIO_EDEFAULT, oldPtRatioESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPtRatio() {
        return ptRatioESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedApparentPower() {
        return ratedApparentPower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedApparentPower( Float newRatedApparentPower ) {
        Float oldRatedApparentPower = ratedApparentPower;
        ratedApparentPower = newRatedApparentPower;
        boolean oldRatedApparentPowerESet = ratedApparentPowerESet;
        ratedApparentPowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER_INFO__RATED_APPARENT_POWER,
                    oldRatedApparentPower, ratedApparentPower, !oldRatedApparentPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedApparentPower() {
        Float oldRatedApparentPower = ratedApparentPower;
        boolean oldRatedApparentPowerESet = ratedApparentPowerESet;
        ratedApparentPower = RATED_APPARENT_POWER_EDEFAULT;
        ratedApparentPowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_INFO__RATED_APPARENT_POWER,
                    oldRatedApparentPower, RATED_APPARENT_POWER_EDEFAULT, oldRatedApparentPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedApparentPower() {
        return ratedApparentPowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedCurrent() {
        return ratedCurrent;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedCurrent( Float newRatedCurrent ) {
        Float oldRatedCurrent = ratedCurrent;
        ratedCurrent = newRatedCurrent;
        boolean oldRatedCurrentESet = ratedCurrentESet;
        ratedCurrentESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER_INFO__RATED_CURRENT, oldRatedCurrent, ratedCurrent, !oldRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedCurrent() {
        Float oldRatedCurrent = ratedCurrent;
        boolean oldRatedCurrentESet = ratedCurrentESet;
        ratedCurrent = RATED_CURRENT_EDEFAULT;
        ratedCurrentESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_INFO__RATED_CURRENT,
                    oldRatedCurrent, RATED_CURRENT_EDEFAULT, oldRatedCurrentESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedCurrent() {
        return ratedCurrentESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedVoltage() {
        return ratedVoltage;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedVoltage( Float newRatedVoltage ) {
        Float oldRatedVoltage = ratedVoltage;
        ratedVoltage = newRatedVoltage;
        boolean oldRatedVoltageESet = ratedVoltageESet;
        ratedVoltageESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.TAP_CHANGER_INFO__RATED_VOLTAGE, oldRatedVoltage, ratedVoltage, !oldRatedVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedVoltage() {
        Float oldRatedVoltage = ratedVoltage;
        boolean oldRatedVoltageESet = ratedVoltageESet;
        ratedVoltage = RATED_VOLTAGE_EDEFAULT;
        ratedVoltageESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_INFO__RATED_VOLTAGE,
                    oldRatedVoltage, RATED_VOLTAGE_EDEFAULT, oldRatedVoltageESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedVoltage() {
        return ratedVoltageESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getStepPhaseIncrement() {
        return stepPhaseIncrement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStepPhaseIncrement( Float newStepPhaseIncrement ) {
        Float oldStepPhaseIncrement = stepPhaseIncrement;
        stepPhaseIncrement = newStepPhaseIncrement;
        boolean oldStepPhaseIncrementESet = stepPhaseIncrementESet;
        stepPhaseIncrementESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER_INFO__STEP_PHASE_INCREMENT,
                    oldStepPhaseIncrement, stepPhaseIncrement, !oldStepPhaseIncrementESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStepPhaseIncrement() {
        Float oldStepPhaseIncrement = stepPhaseIncrement;
        boolean oldStepPhaseIncrementESet = stepPhaseIncrementESet;
        stepPhaseIncrement = STEP_PHASE_INCREMENT_EDEFAULT;
        stepPhaseIncrementESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_INFO__STEP_PHASE_INCREMENT,
                    oldStepPhaseIncrement, STEP_PHASE_INCREMENT_EDEFAULT, oldStepPhaseIncrementESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStepPhaseIncrement() {
        return stepPhaseIncrementESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getStepVoltageIncrement() {
        return stepVoltageIncrement;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStepVoltageIncrement( Float newStepVoltageIncrement ) {
        Float oldStepVoltageIncrement = stepVoltageIncrement;
        stepVoltageIncrement = newStepVoltageIncrement;
        boolean oldStepVoltageIncrementESet = stepVoltageIncrementESet;
        stepVoltageIncrementESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TAP_CHANGER_INFO__STEP_VOLTAGE_INCREMENT,
                    oldStepVoltageIncrement, stepVoltageIncrement, !oldStepVoltageIncrementESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStepVoltageIncrement() {
        Float oldStepVoltageIncrement = stepVoltageIncrement;
        boolean oldStepVoltageIncrementESet = stepVoltageIncrementESet;
        stepVoltageIncrement = STEP_VOLTAGE_INCREMENT_EDEFAULT;
        stepVoltageIncrementESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.TAP_CHANGER_INFO__STEP_VOLTAGE_INCREMENT,
                        oldStepVoltageIncrement, STEP_VOLTAGE_INCREMENT_EDEFAULT, oldStepVoltageIncrementESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStepVoltageIncrement() {
        return stepVoltageIncrementESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.TAP_CHANGER_INFO__BIL:
            return getBil();
        case CimPackage.TAP_CHANGER_INFO__CT_RATING:
            return getCtRating();
        case CimPackage.TAP_CHANGER_INFO__CT_RATIO:
            return getCtRatio();
        case CimPackage.TAP_CHANGER_INFO__FREQUENCY:
            return getFrequency();
        case CimPackage.TAP_CHANGER_INFO__HIGH_STEP:
            return getHighStep();
        case CimPackage.TAP_CHANGER_INFO__IS_TCUL:
            return getIsTcul();
        case CimPackage.TAP_CHANGER_INFO__LOW_STEP:
            return getLowStep();
        case CimPackage.TAP_CHANGER_INFO__NEUTRAL_STEP:
            return getNeutralStep();
        case CimPackage.TAP_CHANGER_INFO__NEUTRAL_U:
            return getNeutralU();
        case CimPackage.TAP_CHANGER_INFO__PT_RATIO:
            return getPtRatio();
        case CimPackage.TAP_CHANGER_INFO__RATED_APPARENT_POWER:
            return getRatedApparentPower();
        case CimPackage.TAP_CHANGER_INFO__RATED_CURRENT:
            return getRatedCurrent();
        case CimPackage.TAP_CHANGER_INFO__RATED_VOLTAGE:
            return getRatedVoltage();
        case CimPackage.TAP_CHANGER_INFO__STEP_PHASE_INCREMENT:
            return getStepPhaseIncrement();
        case CimPackage.TAP_CHANGER_INFO__STEP_VOLTAGE_INCREMENT:
            return getStepVoltageIncrement();
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
        case CimPackage.TAP_CHANGER_INFO__BIL:
            setBil( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER_INFO__CT_RATING:
            setCtRating( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER_INFO__CT_RATIO:
            setCtRatio( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER_INFO__FREQUENCY:
            setFrequency( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER_INFO__HIGH_STEP:
            setHighStep( ( Integer ) newValue );
            return;
        case CimPackage.TAP_CHANGER_INFO__IS_TCUL:
            setIsTcul( ( Boolean ) newValue );
            return;
        case CimPackage.TAP_CHANGER_INFO__LOW_STEP:
            setLowStep( ( Integer ) newValue );
            return;
        case CimPackage.TAP_CHANGER_INFO__NEUTRAL_STEP:
            setNeutralStep( ( Integer ) newValue );
            return;
        case CimPackage.TAP_CHANGER_INFO__NEUTRAL_U:
            setNeutralU( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER_INFO__PT_RATIO:
            setPtRatio( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER_INFO__RATED_APPARENT_POWER:
            setRatedApparentPower( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER_INFO__RATED_CURRENT:
            setRatedCurrent( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER_INFO__RATED_VOLTAGE:
            setRatedVoltage( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER_INFO__STEP_PHASE_INCREMENT:
            setStepPhaseIncrement( ( Float ) newValue );
            return;
        case CimPackage.TAP_CHANGER_INFO__STEP_VOLTAGE_INCREMENT:
            setStepVoltageIncrement( ( Float ) newValue );
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
        case CimPackage.TAP_CHANGER_INFO__BIL:
            unsetBil();
            return;
        case CimPackage.TAP_CHANGER_INFO__CT_RATING:
            unsetCtRating();
            return;
        case CimPackage.TAP_CHANGER_INFO__CT_RATIO:
            unsetCtRatio();
            return;
        case CimPackage.TAP_CHANGER_INFO__FREQUENCY:
            unsetFrequency();
            return;
        case CimPackage.TAP_CHANGER_INFO__HIGH_STEP:
            unsetHighStep();
            return;
        case CimPackage.TAP_CHANGER_INFO__IS_TCUL:
            unsetIsTcul();
            return;
        case CimPackage.TAP_CHANGER_INFO__LOW_STEP:
            unsetLowStep();
            return;
        case CimPackage.TAP_CHANGER_INFO__NEUTRAL_STEP:
            unsetNeutralStep();
            return;
        case CimPackage.TAP_CHANGER_INFO__NEUTRAL_U:
            unsetNeutralU();
            return;
        case CimPackage.TAP_CHANGER_INFO__PT_RATIO:
            unsetPtRatio();
            return;
        case CimPackage.TAP_CHANGER_INFO__RATED_APPARENT_POWER:
            unsetRatedApparentPower();
            return;
        case CimPackage.TAP_CHANGER_INFO__RATED_CURRENT:
            unsetRatedCurrent();
            return;
        case CimPackage.TAP_CHANGER_INFO__RATED_VOLTAGE:
            unsetRatedVoltage();
            return;
        case CimPackage.TAP_CHANGER_INFO__STEP_PHASE_INCREMENT:
            unsetStepPhaseIncrement();
            return;
        case CimPackage.TAP_CHANGER_INFO__STEP_VOLTAGE_INCREMENT:
            unsetStepVoltageIncrement();
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
        case CimPackage.TAP_CHANGER_INFO__BIL:
            return isSetBil();
        case CimPackage.TAP_CHANGER_INFO__CT_RATING:
            return isSetCtRating();
        case CimPackage.TAP_CHANGER_INFO__CT_RATIO:
            return isSetCtRatio();
        case CimPackage.TAP_CHANGER_INFO__FREQUENCY:
            return isSetFrequency();
        case CimPackage.TAP_CHANGER_INFO__HIGH_STEP:
            return isSetHighStep();
        case CimPackage.TAP_CHANGER_INFO__IS_TCUL:
            return isSetIsTcul();
        case CimPackage.TAP_CHANGER_INFO__LOW_STEP:
            return isSetLowStep();
        case CimPackage.TAP_CHANGER_INFO__NEUTRAL_STEP:
            return isSetNeutralStep();
        case CimPackage.TAP_CHANGER_INFO__NEUTRAL_U:
            return isSetNeutralU();
        case CimPackage.TAP_CHANGER_INFO__PT_RATIO:
            return isSetPtRatio();
        case CimPackage.TAP_CHANGER_INFO__RATED_APPARENT_POWER:
            return isSetRatedApparentPower();
        case CimPackage.TAP_CHANGER_INFO__RATED_CURRENT:
            return isSetRatedCurrent();
        case CimPackage.TAP_CHANGER_INFO__RATED_VOLTAGE:
            return isSetRatedVoltage();
        case CimPackage.TAP_CHANGER_INFO__STEP_PHASE_INCREMENT:
            return isSetStepPhaseIncrement();
        case CimPackage.TAP_CHANGER_INFO__STEP_VOLTAGE_INCREMENT:
            return isSetStepVoltageIncrement();
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
        result.append( " (bil: " );
        if( bilESet )
            result.append( bil );
        else
            result.append( "<unset>" );
        result.append( ", ctRating: " );
        if( ctRatingESet )
            result.append( ctRating );
        else
            result.append( "<unset>" );
        result.append( ", ctRatio: " );
        if( ctRatioESet )
            result.append( ctRatio );
        else
            result.append( "<unset>" );
        result.append( ", frequency: " );
        if( frequencyESet )
            result.append( frequency );
        else
            result.append( "<unset>" );
        result.append( ", highStep: " );
        if( highStepESet )
            result.append( highStep );
        else
            result.append( "<unset>" );
        result.append( ", isTcul: " );
        if( isTculESet )
            result.append( isTcul );
        else
            result.append( "<unset>" );
        result.append( ", lowStep: " );
        if( lowStepESet )
            result.append( lowStep );
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
        result.append( ", ptRatio: " );
        if( ptRatioESet )
            result.append( ptRatio );
        else
            result.append( "<unset>" );
        result.append( ", ratedApparentPower: " );
        if( ratedApparentPowerESet )
            result.append( ratedApparentPower );
        else
            result.append( "<unset>" );
        result.append( ", ratedCurrent: " );
        if( ratedCurrentESet )
            result.append( ratedCurrent );
        else
            result.append( "<unset>" );
        result.append( ", ratedVoltage: " );
        if( ratedVoltageESet )
            result.append( ratedVoltage );
        else
            result.append( "<unset>" );
        result.append( ", stepPhaseIncrement: " );
        if( stepPhaseIncrementESet )
            result.append( stepPhaseIncrement );
        else
            result.append( "<unset>" );
        result.append( ", stepVoltageIncrement: " );
        if( stepVoltageIncrementESet )
            result.append( stepVoltageIncrement );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TapChangerInfoImpl
