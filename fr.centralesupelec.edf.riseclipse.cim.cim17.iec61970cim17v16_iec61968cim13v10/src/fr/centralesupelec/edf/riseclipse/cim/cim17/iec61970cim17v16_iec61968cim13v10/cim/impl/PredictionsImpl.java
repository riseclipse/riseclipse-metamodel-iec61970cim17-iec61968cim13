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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DERGroupForecast;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DateTimeInterval;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.OtherCapability;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Predictions;

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
 * An implementation of the model object '<em><b>Predictions</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PredictionsImpl#getConfidence <em>Confidence</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PredictionsImpl#getMaxActivePower <em>Max Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PredictionsImpl#getMaxApparentPower <em>Max Apparent Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PredictionsImpl#getMaxReactivePower <em>Max Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PredictionsImpl#getMinActivePower <em>Min Active Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PredictionsImpl#getMinApparentPower <em>Min Apparent Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PredictionsImpl#getMinReactivePower <em>Min Reactive Power</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PredictionsImpl#getSequence <em>Sequence</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PredictionsImpl#getPredictionInterval <em>Prediction Interval</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PredictionsImpl#getOtherCapability <em>Other Capability</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.PredictionsImpl#getDERGroupForecast <em>DER Group Forecast</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PredictionsImpl extends CimObjectWithIDImpl implements Predictions {
    /**
     * The default value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfidence()
     * @generated
     * @ordered
     */
    protected static final Float CONFIDENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getConfidence() <em>Confidence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConfidence()
     * @generated
     * @ordered
     */
    protected Float confidence = CONFIDENCE_EDEFAULT;

    /**
     * This is true if the Confidence attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean confidenceESet;

    /**
     * The default value of the '{@link #getMaxActivePower() <em>Max Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxActivePower()
     * @generated
     * @ordered
     */
    protected static final Float MAX_ACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxActivePower() <em>Max Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxActivePower()
     * @generated
     * @ordered
     */
    protected Float maxActivePower = MAX_ACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Max Active Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxActivePowerESet;

    /**
     * The default value of the '{@link #getMaxApparentPower() <em>Max Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxApparentPower()
     * @generated
     * @ordered
     */
    protected static final Float MAX_APPARENT_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxApparentPower() <em>Max Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxApparentPower()
     * @generated
     * @ordered
     */
    protected Float maxApparentPower = MAX_APPARENT_POWER_EDEFAULT;

    /**
     * This is true if the Max Apparent Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxApparentPowerESet;

    /**
     * The default value of the '{@link #getMaxReactivePower() <em>Max Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxReactivePower()
     * @generated
     * @ordered
     */
    protected static final Float MAX_REACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxReactivePower() <em>Max Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxReactivePower()
     * @generated
     * @ordered
     */
    protected Float maxReactivePower = MAX_REACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Max Reactive Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxReactivePowerESet;

    /**
     * The default value of the '{@link #getMinActivePower() <em>Min Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinActivePower()
     * @generated
     * @ordered
     */
    protected static final Float MIN_ACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinActivePower() <em>Min Active Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinActivePower()
     * @generated
     * @ordered
     */
    protected Float minActivePower = MIN_ACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Min Active Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minActivePowerESet;

    /**
     * The default value of the '{@link #getMinApparentPower() <em>Min Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinApparentPower()
     * @generated
     * @ordered
     */
    protected static final Float MIN_APPARENT_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinApparentPower() <em>Min Apparent Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinApparentPower()
     * @generated
     * @ordered
     */
    protected Float minApparentPower = MIN_APPARENT_POWER_EDEFAULT;

    /**
     * This is true if the Min Apparent Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minApparentPowerESet;

    /**
     * The default value of the '{@link #getMinReactivePower() <em>Min Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinReactivePower()
     * @generated
     * @ordered
     */
    protected static final Float MIN_REACTIVE_POWER_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinReactivePower() <em>Min Reactive Power</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinReactivePower()
     * @generated
     * @ordered
     */
    protected Float minReactivePower = MIN_REACTIVE_POWER_EDEFAULT;

    /**
     * This is true if the Min Reactive Power attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minReactivePowerESet;

    /**
     * The default value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequence()
     * @generated
     * @ordered
     */
    protected static final Integer SEQUENCE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSequence() <em>Sequence</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSequence()
     * @generated
     * @ordered
     */
    protected Integer sequence = SEQUENCE_EDEFAULT;

    /**
     * This is true if the Sequence attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean sequenceESet;

    /**
     * The cached value of the '{@link #getPredictionInterval() <em>Prediction Interval</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPredictionInterval()
     * @generated
     * @ordered
     */
    protected DateTimeInterval predictionInterval;

    /**
     * This is true if the Prediction Interval containment reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean predictionIntervalESet;

    /**
     * The cached value of the '{@link #getOtherCapability() <em>Other Capability</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getOtherCapability()
     * @generated
     * @ordered
     */
    protected EList< OtherCapability > otherCapability;

    /**
     * The cached value of the '{@link #getDERGroupForecast() <em>DER Group Forecast</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDERGroupForecast()
     * @generated
     * @ordered
     */
    protected EList< DERGroupForecast > derGroupForecast;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected PredictionsImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getPredictions();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getConfidence() {
        return confidence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setConfidence( Float newConfidence ) {
        Float oldConfidence = confidence;
        confidence = newConfidence;
        boolean oldConfidenceESet = confidenceESet;
        confidenceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PREDICTIONS__CONFIDENCE, oldConfidence, confidence, !oldConfidenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetConfidence() {
        Float oldConfidence = confidence;
        boolean oldConfidenceESet = confidenceESet;
        confidence = CONFIDENCE_EDEFAULT;
        confidenceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PREDICTIONS__CONFIDENCE, oldConfidence, CONFIDENCE_EDEFAULT, oldConfidenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConfidence() {
        return confidenceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxActivePower() {
        return maxActivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxActivePower( Float newMaxActivePower ) {
        Float oldMaxActivePower = maxActivePower;
        maxActivePower = newMaxActivePower;
        boolean oldMaxActivePowerESet = maxActivePowerESet;
        maxActivePowerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PREDICTIONS__MAX_ACTIVE_POWER, oldMaxActivePower, maxActivePower, !oldMaxActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxActivePower() {
        Float oldMaxActivePower = maxActivePower;
        boolean oldMaxActivePowerESet = maxActivePowerESet;
        maxActivePower = MAX_ACTIVE_POWER_EDEFAULT;
        maxActivePowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PREDICTIONS__MAX_ACTIVE_POWER,
                    oldMaxActivePower, MAX_ACTIVE_POWER_EDEFAULT, oldMaxActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxActivePower() {
        return maxActivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxApparentPower() {
        return maxApparentPower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxApparentPower( Float newMaxApparentPower ) {
        Float oldMaxApparentPower = maxApparentPower;
        maxApparentPower = newMaxApparentPower;
        boolean oldMaxApparentPowerESet = maxApparentPowerESet;
        maxApparentPowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PREDICTIONS__MAX_APPARENT_POWER,
                    oldMaxApparentPower, maxApparentPower, !oldMaxApparentPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxApparentPower() {
        Float oldMaxApparentPower = maxApparentPower;
        boolean oldMaxApparentPowerESet = maxApparentPowerESet;
        maxApparentPower = MAX_APPARENT_POWER_EDEFAULT;
        maxApparentPowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PREDICTIONS__MAX_APPARENT_POWER,
                    oldMaxApparentPower, MAX_APPARENT_POWER_EDEFAULT, oldMaxApparentPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxApparentPower() {
        return maxApparentPowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxReactivePower() {
        return maxReactivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxReactivePower( Float newMaxReactivePower ) {
        Float oldMaxReactivePower = maxReactivePower;
        maxReactivePower = newMaxReactivePower;
        boolean oldMaxReactivePowerESet = maxReactivePowerESet;
        maxReactivePowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PREDICTIONS__MAX_REACTIVE_POWER,
                    oldMaxReactivePower, maxReactivePower, !oldMaxReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxReactivePower() {
        Float oldMaxReactivePower = maxReactivePower;
        boolean oldMaxReactivePowerESet = maxReactivePowerESet;
        maxReactivePower = MAX_REACTIVE_POWER_EDEFAULT;
        maxReactivePowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PREDICTIONS__MAX_REACTIVE_POWER,
                    oldMaxReactivePower, MAX_REACTIVE_POWER_EDEFAULT, oldMaxReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxReactivePower() {
        return maxReactivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinActivePower() {
        return minActivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinActivePower( Float newMinActivePower ) {
        Float oldMinActivePower = minActivePower;
        minActivePower = newMinActivePower;
        boolean oldMinActivePowerESet = minActivePowerESet;
        minActivePowerESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PREDICTIONS__MIN_ACTIVE_POWER, oldMinActivePower, minActivePower, !oldMinActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinActivePower() {
        Float oldMinActivePower = minActivePower;
        boolean oldMinActivePowerESet = minActivePowerESet;
        minActivePower = MIN_ACTIVE_POWER_EDEFAULT;
        minActivePowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PREDICTIONS__MIN_ACTIVE_POWER,
                    oldMinActivePower, MIN_ACTIVE_POWER_EDEFAULT, oldMinActivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinActivePower() {
        return minActivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinApparentPower() {
        return minApparentPower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinApparentPower( Float newMinApparentPower ) {
        Float oldMinApparentPower = minApparentPower;
        minApparentPower = newMinApparentPower;
        boolean oldMinApparentPowerESet = minApparentPowerESet;
        minApparentPowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PREDICTIONS__MIN_APPARENT_POWER,
                    oldMinApparentPower, minApparentPower, !oldMinApparentPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinApparentPower() {
        Float oldMinApparentPower = minApparentPower;
        boolean oldMinApparentPowerESet = minApparentPowerESet;
        minApparentPower = MIN_APPARENT_POWER_EDEFAULT;
        minApparentPowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PREDICTIONS__MIN_APPARENT_POWER,
                    oldMinApparentPower, MIN_APPARENT_POWER_EDEFAULT, oldMinApparentPowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinApparentPower() {
        return minApparentPowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinReactivePower() {
        return minReactivePower;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinReactivePower( Float newMinReactivePower ) {
        Float oldMinReactivePower = minReactivePower;
        minReactivePower = newMinReactivePower;
        boolean oldMinReactivePowerESet = minReactivePowerESet;
        minReactivePowerESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PREDICTIONS__MIN_REACTIVE_POWER,
                    oldMinReactivePower, minReactivePower, !oldMinReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinReactivePower() {
        Float oldMinReactivePower = minReactivePower;
        boolean oldMinReactivePowerESet = minReactivePowerESet;
        minReactivePower = MIN_REACTIVE_POWER_EDEFAULT;
        minReactivePowerESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.PREDICTIONS__MIN_REACTIVE_POWER,
                    oldMinReactivePower, MIN_REACTIVE_POWER_EDEFAULT, oldMinReactivePowerESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinReactivePower() {
        return minReactivePowerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Integer getSequence() {
        return sequence;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSequence( Integer newSequence ) {
        Integer oldSequence = sequence;
        sequence = newSequence;
        boolean oldSequenceESet = sequenceESet;
        sequenceESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.PREDICTIONS__SEQUENCE, oldSequence, sequence, !oldSequenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSequence() {
        Integer oldSequence = sequence;
        boolean oldSequenceESet = sequenceESet;
        sequence = SEQUENCE_EDEFAULT;
        sequenceESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.PREDICTIONS__SEQUENCE, oldSequence, SEQUENCE_EDEFAULT, oldSequenceESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSequence() {
        return sequenceESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DateTimeInterval getPredictionInterval() {
        return predictionInterval;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetPredictionInterval( DateTimeInterval newPredictionInterval,
            NotificationChain msgs ) {
        DateTimeInterval oldPredictionInterval = predictionInterval;
        predictionInterval = newPredictionInterval;
        boolean oldPredictionIntervalESet = predictionIntervalESet;
        predictionIntervalESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.PREDICTIONS__PREDICTION_INTERVAL, oldPredictionInterval, newPredictionInterval,
                    !oldPredictionIntervalESet );
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
    public void setPredictionInterval( DateTimeInterval newPredictionInterval ) {
        if( newPredictionInterval != predictionInterval ) {
            NotificationChain msgs = null;
            if( predictionInterval != null ) msgs = ( ( InternalEObject ) predictionInterval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.PREDICTIONS__PREDICTION_INTERVAL, null, msgs );
            if( newPredictionInterval != null ) msgs = ( ( InternalEObject ) newPredictionInterval ).eInverseAdd( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.PREDICTIONS__PREDICTION_INTERVAL, null, msgs );
            msgs = basicSetPredictionInterval( newPredictionInterval, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPredictionIntervalESet = predictionIntervalESet;
            predictionIntervalESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.PREDICTIONS__PREDICTION_INTERVAL,
                        newPredictionInterval, newPredictionInterval, !oldPredictionIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetPredictionInterval( NotificationChain msgs ) {
        DateTimeInterval oldPredictionInterval = predictionInterval;
        predictionInterval = null;
        boolean oldPredictionIntervalESet = predictionIntervalESet;
        predictionIntervalESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PREDICTIONS__PREDICTION_INTERVAL, oldPredictionInterval, null,
                    oldPredictionIntervalESet );
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
    public void unsetPredictionInterval() {
        if( predictionInterval != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) predictionInterval ).eInverseRemove( this,
                    EOPPOSITE_FEATURE_BASE - CimPackage.PREDICTIONS__PREDICTION_INTERVAL, null, msgs );
            msgs = basicUnsetPredictionInterval( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldPredictionIntervalESet = predictionIntervalESet;
            predictionIntervalESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.PREDICTIONS__PREDICTION_INTERVAL, null, null, oldPredictionIntervalESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetPredictionInterval() {
        return predictionIntervalESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< OtherCapability > getOtherCapability() {
        if( otherCapability == null ) {
            otherCapability = new EObjectWithInverseEList.Unsettable.ManyInverse< OtherCapability >(
                    OtherCapability.class, this, CimPackage.PREDICTIONS__OTHER_CAPABILITY,
                    CimPackage.OTHER_CAPABILITY__DER_GROUP_FORECAST );
        }
        return otherCapability;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetOtherCapability() {
        if( otherCapability != null ) ( ( InternalEList.Unsettable< ? > ) otherCapability ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetOtherCapability() {
        return otherCapability != null && ( ( InternalEList.Unsettable< ? > ) otherCapability ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< DERGroupForecast > getDERGroupForecast() {
        if( derGroupForecast == null ) {
            derGroupForecast = new EObjectWithInverseEList.Unsettable.ManyInverse< DERGroupForecast >(
                    DERGroupForecast.class, this, CimPackage.PREDICTIONS__DER_GROUP_FORECAST,
                    CimPackage.DER_GROUP_FORECAST__PREDICTIONS );
        }
        return derGroupForecast;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetDERGroupForecast() {
        if( derGroupForecast != null ) ( ( InternalEList.Unsettable< ? > ) derGroupForecast ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDERGroupForecast() {
        return derGroupForecast != null && ( ( InternalEList.Unsettable< ? > ) derGroupForecast ).isSet();
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
        case CimPackage.PREDICTIONS__OTHER_CAPABILITY:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getOtherCapability() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.PREDICTIONS__DER_GROUP_FORECAST:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getDERGroupForecast() )
                    .basicAdd( otherEnd, msgs );
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
        case CimPackage.PREDICTIONS__PREDICTION_INTERVAL:
            return basicUnsetPredictionInterval( msgs );
        case CimPackage.PREDICTIONS__OTHER_CAPABILITY:
            return ( ( InternalEList< ? > ) getOtherCapability() ).basicRemove( otherEnd, msgs );
        case CimPackage.PREDICTIONS__DER_GROUP_FORECAST:
            return ( ( InternalEList< ? > ) getDERGroupForecast() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.PREDICTIONS__CONFIDENCE:
            return getConfidence();
        case CimPackage.PREDICTIONS__MAX_ACTIVE_POWER:
            return getMaxActivePower();
        case CimPackage.PREDICTIONS__MAX_APPARENT_POWER:
            return getMaxApparentPower();
        case CimPackage.PREDICTIONS__MAX_REACTIVE_POWER:
            return getMaxReactivePower();
        case CimPackage.PREDICTIONS__MIN_ACTIVE_POWER:
            return getMinActivePower();
        case CimPackage.PREDICTIONS__MIN_APPARENT_POWER:
            return getMinApparentPower();
        case CimPackage.PREDICTIONS__MIN_REACTIVE_POWER:
            return getMinReactivePower();
        case CimPackage.PREDICTIONS__SEQUENCE:
            return getSequence();
        case CimPackage.PREDICTIONS__PREDICTION_INTERVAL:
            return getPredictionInterval();
        case CimPackage.PREDICTIONS__OTHER_CAPABILITY:
            return getOtherCapability();
        case CimPackage.PREDICTIONS__DER_GROUP_FORECAST:
            return getDERGroupForecast();
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
        case CimPackage.PREDICTIONS__CONFIDENCE:
            setConfidence( ( Float ) newValue );
            return;
        case CimPackage.PREDICTIONS__MAX_ACTIVE_POWER:
            setMaxActivePower( ( Float ) newValue );
            return;
        case CimPackage.PREDICTIONS__MAX_APPARENT_POWER:
            setMaxApparentPower( ( Float ) newValue );
            return;
        case CimPackage.PREDICTIONS__MAX_REACTIVE_POWER:
            setMaxReactivePower( ( Float ) newValue );
            return;
        case CimPackage.PREDICTIONS__MIN_ACTIVE_POWER:
            setMinActivePower( ( Float ) newValue );
            return;
        case CimPackage.PREDICTIONS__MIN_APPARENT_POWER:
            setMinApparentPower( ( Float ) newValue );
            return;
        case CimPackage.PREDICTIONS__MIN_REACTIVE_POWER:
            setMinReactivePower( ( Float ) newValue );
            return;
        case CimPackage.PREDICTIONS__SEQUENCE:
            setSequence( ( Integer ) newValue );
            return;
        case CimPackage.PREDICTIONS__PREDICTION_INTERVAL:
            setPredictionInterval( ( DateTimeInterval ) newValue );
            return;
        case CimPackage.PREDICTIONS__OTHER_CAPABILITY:
            getOtherCapability().clear();
            getOtherCapability().addAll( ( Collection< ? extends OtherCapability > ) newValue );
            return;
        case CimPackage.PREDICTIONS__DER_GROUP_FORECAST:
            getDERGroupForecast().clear();
            getDERGroupForecast().addAll( ( Collection< ? extends DERGroupForecast > ) newValue );
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
        case CimPackage.PREDICTIONS__CONFIDENCE:
            unsetConfidence();
            return;
        case CimPackage.PREDICTIONS__MAX_ACTIVE_POWER:
            unsetMaxActivePower();
            return;
        case CimPackage.PREDICTIONS__MAX_APPARENT_POWER:
            unsetMaxApparentPower();
            return;
        case CimPackage.PREDICTIONS__MAX_REACTIVE_POWER:
            unsetMaxReactivePower();
            return;
        case CimPackage.PREDICTIONS__MIN_ACTIVE_POWER:
            unsetMinActivePower();
            return;
        case CimPackage.PREDICTIONS__MIN_APPARENT_POWER:
            unsetMinApparentPower();
            return;
        case CimPackage.PREDICTIONS__MIN_REACTIVE_POWER:
            unsetMinReactivePower();
            return;
        case CimPackage.PREDICTIONS__SEQUENCE:
            unsetSequence();
            return;
        case CimPackage.PREDICTIONS__PREDICTION_INTERVAL:
            unsetPredictionInterval();
            return;
        case CimPackage.PREDICTIONS__OTHER_CAPABILITY:
            unsetOtherCapability();
            return;
        case CimPackage.PREDICTIONS__DER_GROUP_FORECAST:
            unsetDERGroupForecast();
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
        case CimPackage.PREDICTIONS__CONFIDENCE:
            return isSetConfidence();
        case CimPackage.PREDICTIONS__MAX_ACTIVE_POWER:
            return isSetMaxActivePower();
        case CimPackage.PREDICTIONS__MAX_APPARENT_POWER:
            return isSetMaxApparentPower();
        case CimPackage.PREDICTIONS__MAX_REACTIVE_POWER:
            return isSetMaxReactivePower();
        case CimPackage.PREDICTIONS__MIN_ACTIVE_POWER:
            return isSetMinActivePower();
        case CimPackage.PREDICTIONS__MIN_APPARENT_POWER:
            return isSetMinApparentPower();
        case CimPackage.PREDICTIONS__MIN_REACTIVE_POWER:
            return isSetMinReactivePower();
        case CimPackage.PREDICTIONS__SEQUENCE:
            return isSetSequence();
        case CimPackage.PREDICTIONS__PREDICTION_INTERVAL:
            return isSetPredictionInterval();
        case CimPackage.PREDICTIONS__OTHER_CAPABILITY:
            return isSetOtherCapability();
        case CimPackage.PREDICTIONS__DER_GROUP_FORECAST:
            return isSetDERGroupForecast();
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
        result.append( " (confidence: " );
        if( confidenceESet )
            result.append( confidence );
        else
            result.append( "<unset>" );
        result.append( ", maxActivePower: " );
        if( maxActivePowerESet )
            result.append( maxActivePower );
        else
            result.append( "<unset>" );
        result.append( ", maxApparentPower: " );
        if( maxApparentPowerESet )
            result.append( maxApparentPower );
        else
            result.append( "<unset>" );
        result.append( ", maxReactivePower: " );
        if( maxReactivePowerESet )
            result.append( maxReactivePower );
        else
            result.append( "<unset>" );
        result.append( ", minActivePower: " );
        if( minActivePowerESet )
            result.append( minActivePower );
        else
            result.append( "<unset>" );
        result.append( ", minApparentPower: " );
        if( minApparentPowerESet )
            result.append( minApparentPower );
        else
            result.append( "<unset>" );
        result.append( ", minReactivePower: " );
        if( minReactivePowerESet )
            result.append( minReactivePower );
        else
            result.append( "<unset>" );
        result.append( ", sequence: " );
        if( sequenceESet )
            result.append( sequence );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //PredictionsImpl
