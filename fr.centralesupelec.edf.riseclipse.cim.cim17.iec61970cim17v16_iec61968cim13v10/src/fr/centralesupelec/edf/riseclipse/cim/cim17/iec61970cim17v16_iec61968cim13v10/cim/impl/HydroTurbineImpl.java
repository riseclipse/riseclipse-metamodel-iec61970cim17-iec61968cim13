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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroTurbine;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TurbineType;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hydro Turbine</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroTurbineImpl#getGateRateLimit <em>Gate Rate Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroTurbineImpl#getGateUpperLimit <em>Gate Upper Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroTurbineImpl#getMaxHeadMaxP <em>Max Head Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroTurbineImpl#getMinHeadMaxP <em>Min Head Max P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroTurbineImpl#getSpeedRating <em>Speed Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroTurbineImpl#getSpeedRegulation <em>Speed Regulation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroTurbineImpl#getTransientDroopTime <em>Transient Droop Time</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroTurbineImpl#getTransientRegulation <em>Transient Regulation</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroTurbineImpl#getTurbineRating <em>Turbine Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroTurbineImpl#getTurbineType <em>Turbine Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroTurbineImpl#getWaterStartingTime <em>Water Starting Time</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydroTurbineImpl extends PrimeMoverImpl implements HydroTurbine {
    /**
     * The default value of the '{@link #getGateRateLimit() <em>Gate Rate Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGateRateLimit()
     * @generated
     * @ordered
     */
    protected static final Float GATE_RATE_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGateRateLimit() <em>Gate Rate Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGateRateLimit()
     * @generated
     * @ordered
     */
    protected Float gateRateLimit = GATE_RATE_LIMIT_EDEFAULT;

    /**
     * This is true if the Gate Rate Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gateRateLimitESet;

    /**
     * The default value of the '{@link #getGateUpperLimit() <em>Gate Upper Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGateUpperLimit()
     * @generated
     * @ordered
     */
    protected static final Float GATE_UPPER_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getGateUpperLimit() <em>Gate Upper Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getGateUpperLimit()
     * @generated
     * @ordered
     */
    protected Float gateUpperLimit = GATE_UPPER_LIMIT_EDEFAULT;

    /**
     * This is true if the Gate Upper Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean gateUpperLimitESet;

    /**
     * The default value of the '{@link #getMaxHeadMaxP() <em>Max Head Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxHeadMaxP()
     * @generated
     * @ordered
     */
    protected static final Float MAX_HEAD_MAX_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMaxHeadMaxP() <em>Max Head Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMaxHeadMaxP()
     * @generated
     * @ordered
     */
    protected Float maxHeadMaxP = MAX_HEAD_MAX_P_EDEFAULT;

    /**
     * This is true if the Max Head Max P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean maxHeadMaxPESet;

    /**
     * The default value of the '{@link #getMinHeadMaxP() <em>Min Head Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinHeadMaxP()
     * @generated
     * @ordered
     */
    protected static final Float MIN_HEAD_MAX_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getMinHeadMaxP() <em>Min Head Max P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getMinHeadMaxP()
     * @generated
     * @ordered
     */
    protected Float minHeadMaxP = MIN_HEAD_MAX_P_EDEFAULT;

    /**
     * This is true if the Min Head Max P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean minHeadMaxPESet;

    /**
     * The default value of the '{@link #getSpeedRating() <em>Speed Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpeedRating()
     * @generated
     * @ordered
     */
    protected static final Float SPEED_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpeedRating() <em>Speed Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpeedRating()
     * @generated
     * @ordered
     */
    protected Float speedRating = SPEED_RATING_EDEFAULT;

    /**
     * This is true if the Speed Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean speedRatingESet;

    /**
     * The default value of the '{@link #getSpeedRegulation() <em>Speed Regulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpeedRegulation()
     * @generated
     * @ordered
     */
    protected static final Float SPEED_REGULATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSpeedRegulation() <em>Speed Regulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSpeedRegulation()
     * @generated
     * @ordered
     */
    protected Float speedRegulation = SPEED_REGULATION_EDEFAULT;

    /**
     * This is true if the Speed Regulation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean speedRegulationESet;

    /**
     * The default value of the '{@link #getTransientDroopTime() <em>Transient Droop Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransientDroopTime()
     * @generated
     * @ordered
     */
    protected static final Float TRANSIENT_DROOP_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTransientDroopTime() <em>Transient Droop Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransientDroopTime()
     * @generated
     * @ordered
     */
    protected Float transientDroopTime = TRANSIENT_DROOP_TIME_EDEFAULT;

    /**
     * This is true if the Transient Droop Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transientDroopTimeESet;

    /**
     * The default value of the '{@link #getTransientRegulation() <em>Transient Regulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransientRegulation()
     * @generated
     * @ordered
     */
    protected static final Float TRANSIENT_REGULATION_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTransientRegulation() <em>Transient Regulation</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTransientRegulation()
     * @generated
     * @ordered
     */
    protected Float transientRegulation = TRANSIENT_REGULATION_EDEFAULT;

    /**
     * This is true if the Transient Regulation attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean transientRegulationESet;

    /**
     * The default value of the '{@link #getTurbineRating() <em>Turbine Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurbineRating()
     * @generated
     * @ordered
     */
    protected static final Float TURBINE_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getTurbineRating() <em>Turbine Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurbineRating()
     * @generated
     * @ordered
     */
    protected Float turbineRating = TURBINE_RATING_EDEFAULT;

    /**
     * This is true if the Turbine Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean turbineRatingESet;

    /**
     * The default value of the '{@link #getTurbineType() <em>Turbine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurbineType()
     * @generated
     * @ordered
     */
    protected static final TurbineType TURBINE_TYPE_EDEFAULT = TurbineType.PELTON;

    /**
     * The cached value of the '{@link #getTurbineType() <em>Turbine Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTurbineType()
     * @generated
     * @ordered
     */
    protected TurbineType turbineType = TURBINE_TYPE_EDEFAULT;

    /**
     * This is true if the Turbine Type attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean turbineTypeESet;

    /**
     * The default value of the '{@link #getWaterStartingTime() <em>Water Starting Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWaterStartingTime()
     * @generated
     * @ordered
     */
    protected static final Float WATER_STARTING_TIME_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getWaterStartingTime() <em>Water Starting Time</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getWaterStartingTime()
     * @generated
     * @ordered
     */
    protected Float waterStartingTime = WATER_STARTING_TIME_EDEFAULT;

    /**
     * This is true if the Water Starting Time attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean waterStartingTimeESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HydroTurbineImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getHydroTurbine();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGateRateLimit() {
        return gateRateLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGateRateLimit( Float newGateRateLimit ) {
        Float oldGateRateLimit = gateRateLimit;
        gateRateLimit = newGateRateLimit;
        boolean oldGateRateLimitESet = gateRateLimitESet;
        gateRateLimitESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.HYDRO_TURBINE__GATE_RATE_LIMIT, oldGateRateLimit, gateRateLimit, !oldGateRateLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGateRateLimit() {
        Float oldGateRateLimit = gateRateLimit;
        boolean oldGateRateLimitESet = gateRateLimitESet;
        gateRateLimit = GATE_RATE_LIMIT_EDEFAULT;
        gateRateLimitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_TURBINE__GATE_RATE_LIMIT,
                    oldGateRateLimit, GATE_RATE_LIMIT_EDEFAULT, oldGateRateLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGateRateLimit() {
        return gateRateLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getGateUpperLimit() {
        return gateUpperLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setGateUpperLimit( Float newGateUpperLimit ) {
        Float oldGateUpperLimit = gateUpperLimit;
        gateUpperLimit = newGateUpperLimit;
        boolean oldGateUpperLimitESet = gateUpperLimitESet;
        gateUpperLimitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT,
                    oldGateUpperLimit, gateUpperLimit, !oldGateUpperLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetGateUpperLimit() {
        Float oldGateUpperLimit = gateUpperLimit;
        boolean oldGateUpperLimitESet = gateUpperLimitESet;
        gateUpperLimit = GATE_UPPER_LIMIT_EDEFAULT;
        gateUpperLimitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT,
                    oldGateUpperLimit, GATE_UPPER_LIMIT_EDEFAULT, oldGateUpperLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetGateUpperLimit() {
        return gateUpperLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMaxHeadMaxP() {
        return maxHeadMaxP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMaxHeadMaxP( Float newMaxHeadMaxP ) {
        Float oldMaxHeadMaxP = maxHeadMaxP;
        maxHeadMaxP = newMaxHeadMaxP;
        boolean oldMaxHeadMaxPESet = maxHeadMaxPESet;
        maxHeadMaxPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P, oldMaxHeadMaxP, maxHeadMaxP, !oldMaxHeadMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMaxHeadMaxP() {
        Float oldMaxHeadMaxP = maxHeadMaxP;
        boolean oldMaxHeadMaxPESet = maxHeadMaxPESet;
        maxHeadMaxP = MAX_HEAD_MAX_P_EDEFAULT;
        maxHeadMaxPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P,
                    oldMaxHeadMaxP, MAX_HEAD_MAX_P_EDEFAULT, oldMaxHeadMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMaxHeadMaxP() {
        return maxHeadMaxPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getMinHeadMaxP() {
        return minHeadMaxP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setMinHeadMaxP( Float newMinHeadMaxP ) {
        Float oldMinHeadMaxP = minHeadMaxP;
        minHeadMaxP = newMinHeadMaxP;
        boolean oldMinHeadMaxPESet = minHeadMaxPESet;
        minHeadMaxPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P, oldMinHeadMaxP, minHeadMaxP, !oldMinHeadMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetMinHeadMaxP() {
        Float oldMinHeadMaxP = minHeadMaxP;
        boolean oldMinHeadMaxPESet = minHeadMaxPESet;
        minHeadMaxP = MIN_HEAD_MAX_P_EDEFAULT;
        minHeadMaxPESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P,
                    oldMinHeadMaxP, MIN_HEAD_MAX_P_EDEFAULT, oldMinHeadMaxPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetMinHeadMaxP() {
        return minHeadMaxPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSpeedRating() {
        return speedRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpeedRating( Float newSpeedRating ) {
        Float oldSpeedRating = speedRating;
        speedRating = newSpeedRating;
        boolean oldSpeedRatingESet = speedRatingESet;
        speedRatingESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.HYDRO_TURBINE__SPEED_RATING, oldSpeedRating, speedRating, !oldSpeedRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpeedRating() {
        Float oldSpeedRating = speedRating;
        boolean oldSpeedRatingESet = speedRatingESet;
        speedRating = SPEED_RATING_EDEFAULT;
        speedRatingESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.HYDRO_TURBINE__SPEED_RATING, oldSpeedRating, SPEED_RATING_EDEFAULT, oldSpeedRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpeedRating() {
        return speedRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getSpeedRegulation() {
        return speedRegulation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setSpeedRegulation( Float newSpeedRegulation ) {
        Float oldSpeedRegulation = speedRegulation;
        speedRegulation = newSpeedRegulation;
        boolean oldSpeedRegulationESet = speedRegulationESet;
        speedRegulationESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_TURBINE__SPEED_REGULATION,
                    oldSpeedRegulation, speedRegulation, !oldSpeedRegulationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSpeedRegulation() {
        Float oldSpeedRegulation = speedRegulation;
        boolean oldSpeedRegulationESet = speedRegulationESet;
        speedRegulation = SPEED_REGULATION_EDEFAULT;
        speedRegulationESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_TURBINE__SPEED_REGULATION,
                    oldSpeedRegulation, SPEED_REGULATION_EDEFAULT, oldSpeedRegulationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSpeedRegulation() {
        return speedRegulationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTransientDroopTime() {
        return transientDroopTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransientDroopTime( Float newTransientDroopTime ) {
        Float oldTransientDroopTime = transientDroopTime;
        transientDroopTime = newTransientDroopTime;
        boolean oldTransientDroopTimeESet = transientDroopTimeESet;
        transientDroopTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME,
                    oldTransientDroopTime, transientDroopTime, !oldTransientDroopTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransientDroopTime() {
        Float oldTransientDroopTime = transientDroopTime;
        boolean oldTransientDroopTimeESet = transientDroopTimeESet;
        transientDroopTime = TRANSIENT_DROOP_TIME_EDEFAULT;
        transientDroopTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME,
                    oldTransientDroopTime, TRANSIENT_DROOP_TIME_EDEFAULT, oldTransientDroopTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransientDroopTime() {
        return transientDroopTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTransientRegulation() {
        return transientRegulation;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTransientRegulation( Float newTransientRegulation ) {
        Float oldTransientRegulation = transientRegulation;
        transientRegulation = newTransientRegulation;
        boolean oldTransientRegulationESet = transientRegulationESet;
        transientRegulationESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_TURBINE__TRANSIENT_REGULATION,
                    oldTransientRegulation, transientRegulation, !oldTransientRegulationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTransientRegulation() {
        Float oldTransientRegulation = transientRegulation;
        boolean oldTransientRegulationESet = transientRegulationESet;
        transientRegulation = TRANSIENT_REGULATION_EDEFAULT;
        transientRegulationESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_TURBINE__TRANSIENT_REGULATION,
                    oldTransientRegulation, TRANSIENT_REGULATION_EDEFAULT, oldTransientRegulationESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTransientRegulation() {
        return transientRegulationESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getTurbineRating() {
        return turbineRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTurbineRating( Float newTurbineRating ) {
        Float oldTurbineRating = turbineRating;
        turbineRating = newTurbineRating;
        boolean oldTurbineRatingESet = turbineRatingESet;
        turbineRatingESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.HYDRO_TURBINE__TURBINE_RATING, oldTurbineRating, turbineRating, !oldTurbineRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTurbineRating() {
        Float oldTurbineRating = turbineRating;
        boolean oldTurbineRatingESet = turbineRatingESet;
        turbineRating = TURBINE_RATING_EDEFAULT;
        turbineRatingESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_TURBINE__TURBINE_RATING,
                    oldTurbineRating, TURBINE_RATING_EDEFAULT, oldTurbineRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTurbineRating() {
        return turbineRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TurbineType getTurbineType() {
        return turbineType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setTurbineType( TurbineType newTurbineType ) {
        TurbineType oldTurbineType = turbineType;
        turbineType = newTurbineType == null ? TURBINE_TYPE_EDEFAULT : newTurbineType;
        boolean oldTurbineTypeESet = turbineTypeESet;
        turbineTypeESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.HYDRO_TURBINE__TURBINE_TYPE, oldTurbineType, turbineType, !oldTurbineTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetTurbineType() {
        TurbineType oldTurbineType = turbineType;
        boolean oldTurbineTypeESet = turbineTypeESet;
        turbineType = TURBINE_TYPE_EDEFAULT;
        turbineTypeESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.HYDRO_TURBINE__TURBINE_TYPE, oldTurbineType, TURBINE_TYPE_EDEFAULT, oldTurbineTypeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTurbineType() {
        return turbineTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getWaterStartingTime() {
        return waterStartingTime;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setWaterStartingTime( Float newWaterStartingTime ) {
        Float oldWaterStartingTime = waterStartingTime;
        waterStartingTime = newWaterStartingTime;
        boolean oldWaterStartingTimeESet = waterStartingTimeESet;
        waterStartingTimeESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.HYDRO_TURBINE__WATER_STARTING_TIME,
                    oldWaterStartingTime, waterStartingTime, !oldWaterStartingTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetWaterStartingTime() {
        Float oldWaterStartingTime = waterStartingTime;
        boolean oldWaterStartingTimeESet = waterStartingTimeESet;
        waterStartingTime = WATER_STARTING_TIME_EDEFAULT;
        waterStartingTimeESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.HYDRO_TURBINE__WATER_STARTING_TIME,
                    oldWaterStartingTime, WATER_STARTING_TIME_EDEFAULT, oldWaterStartingTimeESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetWaterStartingTime() {
        return waterStartingTimeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet( int featureID, boolean resolve, boolean coreType ) {
        switch( featureID ) {
        case CimPackage.HYDRO_TURBINE__GATE_RATE_LIMIT:
            return getGateRateLimit();
        case CimPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT:
            return getGateUpperLimit();
        case CimPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P:
            return getMaxHeadMaxP();
        case CimPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P:
            return getMinHeadMaxP();
        case CimPackage.HYDRO_TURBINE__SPEED_RATING:
            return getSpeedRating();
        case CimPackage.HYDRO_TURBINE__SPEED_REGULATION:
            return getSpeedRegulation();
        case CimPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME:
            return getTransientDroopTime();
        case CimPackage.HYDRO_TURBINE__TRANSIENT_REGULATION:
            return getTransientRegulation();
        case CimPackage.HYDRO_TURBINE__TURBINE_RATING:
            return getTurbineRating();
        case CimPackage.HYDRO_TURBINE__TURBINE_TYPE:
            return getTurbineType();
        case CimPackage.HYDRO_TURBINE__WATER_STARTING_TIME:
            return getWaterStartingTime();
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
        case CimPackage.HYDRO_TURBINE__GATE_RATE_LIMIT:
            setGateRateLimit( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT:
            setGateUpperLimit( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P:
            setMaxHeadMaxP( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P:
            setMinHeadMaxP( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_TURBINE__SPEED_RATING:
            setSpeedRating( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_TURBINE__SPEED_REGULATION:
            setSpeedRegulation( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME:
            setTransientDroopTime( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_TURBINE__TRANSIENT_REGULATION:
            setTransientRegulation( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_TURBINE__TURBINE_RATING:
            setTurbineRating( ( Float ) newValue );
            return;
        case CimPackage.HYDRO_TURBINE__TURBINE_TYPE:
            setTurbineType( ( TurbineType ) newValue );
            return;
        case CimPackage.HYDRO_TURBINE__WATER_STARTING_TIME:
            setWaterStartingTime( ( Float ) newValue );
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
        case CimPackage.HYDRO_TURBINE__GATE_RATE_LIMIT:
            unsetGateRateLimit();
            return;
        case CimPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT:
            unsetGateUpperLimit();
            return;
        case CimPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P:
            unsetMaxHeadMaxP();
            return;
        case CimPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P:
            unsetMinHeadMaxP();
            return;
        case CimPackage.HYDRO_TURBINE__SPEED_RATING:
            unsetSpeedRating();
            return;
        case CimPackage.HYDRO_TURBINE__SPEED_REGULATION:
            unsetSpeedRegulation();
            return;
        case CimPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME:
            unsetTransientDroopTime();
            return;
        case CimPackage.HYDRO_TURBINE__TRANSIENT_REGULATION:
            unsetTransientRegulation();
            return;
        case CimPackage.HYDRO_TURBINE__TURBINE_RATING:
            unsetTurbineRating();
            return;
        case CimPackage.HYDRO_TURBINE__TURBINE_TYPE:
            unsetTurbineType();
            return;
        case CimPackage.HYDRO_TURBINE__WATER_STARTING_TIME:
            unsetWaterStartingTime();
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
        case CimPackage.HYDRO_TURBINE__GATE_RATE_LIMIT:
            return isSetGateRateLimit();
        case CimPackage.HYDRO_TURBINE__GATE_UPPER_LIMIT:
            return isSetGateUpperLimit();
        case CimPackage.HYDRO_TURBINE__MAX_HEAD_MAX_P:
            return isSetMaxHeadMaxP();
        case CimPackage.HYDRO_TURBINE__MIN_HEAD_MAX_P:
            return isSetMinHeadMaxP();
        case CimPackage.HYDRO_TURBINE__SPEED_RATING:
            return isSetSpeedRating();
        case CimPackage.HYDRO_TURBINE__SPEED_REGULATION:
            return isSetSpeedRegulation();
        case CimPackage.HYDRO_TURBINE__TRANSIENT_DROOP_TIME:
            return isSetTransientDroopTime();
        case CimPackage.HYDRO_TURBINE__TRANSIENT_REGULATION:
            return isSetTransientRegulation();
        case CimPackage.HYDRO_TURBINE__TURBINE_RATING:
            return isSetTurbineRating();
        case CimPackage.HYDRO_TURBINE__TURBINE_TYPE:
            return isSetTurbineType();
        case CimPackage.HYDRO_TURBINE__WATER_STARTING_TIME:
            return isSetWaterStartingTime();
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
        result.append( " (gateRateLimit: " );
        if( gateRateLimitESet )
            result.append( gateRateLimit );
        else
            result.append( "<unset>" );
        result.append( ", gateUpperLimit: " );
        if( gateUpperLimitESet )
            result.append( gateUpperLimit );
        else
            result.append( "<unset>" );
        result.append( ", maxHeadMaxP: " );
        if( maxHeadMaxPESet )
            result.append( maxHeadMaxP );
        else
            result.append( "<unset>" );
        result.append( ", minHeadMaxP: " );
        if( minHeadMaxPESet )
            result.append( minHeadMaxP );
        else
            result.append( "<unset>" );
        result.append( ", speedRating: " );
        if( speedRatingESet )
            result.append( speedRating );
        else
            result.append( "<unset>" );
        result.append( ", speedRegulation: " );
        if( speedRegulationESet )
            result.append( speedRegulation );
        else
            result.append( "<unset>" );
        result.append( ", transientDroopTime: " );
        if( transientDroopTimeESet )
            result.append( transientDroopTime );
        else
            result.append( "<unset>" );
        result.append( ", transientRegulation: " );
        if( transientRegulationESet )
            result.append( transientRegulation );
        else
            result.append( "<unset>" );
        result.append( ", turbineRating: " );
        if( turbineRatingESet )
            result.append( turbineRating );
        else
            result.append( "<unset>" );
        result.append( ", turbineType: " );
        if( turbineTypeESet )
            result.append( turbineType );
        else
            result.append( "<unset>" );
        result.append( ", waterStartingTime: " );
        if( waterStartingTimeESet )
            result.append( waterStartingTime );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //HydroTurbineImpl
