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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CogenerationPlant;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SteamSendoutSchedule;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ThermalGeneratingUnit;

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
 * An implementation of the model object '<em><b>Cogeneration Plant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CogenerationPlantImpl#getCogenHPSendoutRating <em>Cogen HP Sendout Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CogenerationPlantImpl#getCogenHPSteamRating <em>Cogen HP Steam Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CogenerationPlantImpl#getCogenLPSendoutRating <em>Cogen LP Sendout Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CogenerationPlantImpl#getCogenLPSteamRating <em>Cogen LP Steam Rating</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CogenerationPlantImpl#getRatedP <em>Rated P</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CogenerationPlantImpl#getThermalGeneratingUnits <em>Thermal Generating Units</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.CogenerationPlantImpl#getSteamSendoutSchedule <em>Steam Sendout Schedule</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CogenerationPlantImpl extends PowerSystemResourceImpl implements CogenerationPlant {
    /**
     * The default value of the '{@link #getCogenHPSendoutRating() <em>Cogen HP Sendout Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCogenHPSendoutRating()
     * @generated
     * @ordered
     */
    protected static final Float COGEN_HP_SENDOUT_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCogenHPSendoutRating() <em>Cogen HP Sendout Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCogenHPSendoutRating()
     * @generated
     * @ordered
     */
    protected Float cogenHPSendoutRating = COGEN_HP_SENDOUT_RATING_EDEFAULT;

    /**
     * This is true if the Cogen HP Sendout Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cogenHPSendoutRatingESet;

    /**
     * The default value of the '{@link #getCogenHPSteamRating() <em>Cogen HP Steam Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCogenHPSteamRating()
     * @generated
     * @ordered
     */
    protected static final Float COGEN_HP_STEAM_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCogenHPSteamRating() <em>Cogen HP Steam Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCogenHPSteamRating()
     * @generated
     * @ordered
     */
    protected Float cogenHPSteamRating = COGEN_HP_STEAM_RATING_EDEFAULT;

    /**
     * This is true if the Cogen HP Steam Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cogenHPSteamRatingESet;

    /**
     * The default value of the '{@link #getCogenLPSendoutRating() <em>Cogen LP Sendout Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCogenLPSendoutRating()
     * @generated
     * @ordered
     */
    protected static final Float COGEN_LP_SENDOUT_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCogenLPSendoutRating() <em>Cogen LP Sendout Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCogenLPSendoutRating()
     * @generated
     * @ordered
     */
    protected Float cogenLPSendoutRating = COGEN_LP_SENDOUT_RATING_EDEFAULT;

    /**
     * This is true if the Cogen LP Sendout Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cogenLPSendoutRatingESet;

    /**
     * The default value of the '{@link #getCogenLPSteamRating() <em>Cogen LP Steam Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCogenLPSteamRating()
     * @generated
     * @ordered
     */
    protected static final Float COGEN_LP_STEAM_RATING_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getCogenLPSteamRating() <em>Cogen LP Steam Rating</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCogenLPSteamRating()
     * @generated
     * @ordered
     */
    protected Float cogenLPSteamRating = COGEN_LP_STEAM_RATING_EDEFAULT;

    /**
     * This is true if the Cogen LP Steam Rating attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean cogenLPSteamRatingESet;

    /**
     * The default value of the '{@link #getRatedP() <em>Rated P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedP()
     * @generated
     * @ordered
     */
    protected static final Float RATED_P_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getRatedP() <em>Rated P</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getRatedP()
     * @generated
     * @ordered
     */
    protected Float ratedP = RATED_P_EDEFAULT;

    /**
     * This is true if the Rated P attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean ratedPESet;

    /**
     * The cached value of the '{@link #getThermalGeneratingUnits() <em>Thermal Generating Units</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getThermalGeneratingUnits()
     * @generated
     * @ordered
     */
    protected EList< ThermalGeneratingUnit > thermalGeneratingUnits;

    /**
     * The cached value of the '{@link #getSteamSendoutSchedule() <em>Steam Sendout Schedule</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSteamSendoutSchedule()
     * @generated
     * @ordered
     */
    protected SteamSendoutSchedule steamSendoutSchedule;

    /**
     * This is true if the Steam Sendout Schedule reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean steamSendoutScheduleESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected CogenerationPlantImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getCogenerationPlant();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCogenHPSendoutRating() {
        return cogenHPSendoutRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCogenHPSendoutRating( Float newCogenHPSendoutRating ) {
        Float oldCogenHPSendoutRating = cogenHPSendoutRating;
        cogenHPSendoutRating = newCogenHPSendoutRating;
        boolean oldCogenHPSendoutRatingESet = cogenHPSendoutRatingESet;
        cogenHPSendoutRatingESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING,
                        oldCogenHPSendoutRating, cogenHPSendoutRating, !oldCogenHPSendoutRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCogenHPSendoutRating() {
        Float oldCogenHPSendoutRating = cogenHPSendoutRating;
        boolean oldCogenHPSendoutRatingESet = cogenHPSendoutRatingESet;
        cogenHPSendoutRating = COGEN_HP_SENDOUT_RATING_EDEFAULT;
        cogenHPSendoutRatingESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING,
                        oldCogenHPSendoutRating, COGEN_HP_SENDOUT_RATING_EDEFAULT, oldCogenHPSendoutRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCogenHPSendoutRating() {
        return cogenHPSendoutRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCogenHPSteamRating() {
        return cogenHPSteamRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCogenHPSteamRating( Float newCogenHPSteamRating ) {
        Float oldCogenHPSteamRating = cogenHPSteamRating;
        cogenHPSteamRating = newCogenHPSteamRating;
        boolean oldCogenHPSteamRatingESet = cogenHPSteamRatingESet;
        cogenHPSteamRatingESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING,
                        oldCogenHPSteamRating, cogenHPSteamRating, !oldCogenHPSteamRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCogenHPSteamRating() {
        Float oldCogenHPSteamRating = cogenHPSteamRating;
        boolean oldCogenHPSteamRatingESet = cogenHPSteamRatingESet;
        cogenHPSteamRating = COGEN_HP_STEAM_RATING_EDEFAULT;
        cogenHPSteamRatingESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING,
                        oldCogenHPSteamRating, COGEN_HP_STEAM_RATING_EDEFAULT, oldCogenHPSteamRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCogenHPSteamRating() {
        return cogenHPSteamRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCogenLPSendoutRating() {
        return cogenLPSendoutRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCogenLPSendoutRating( Float newCogenLPSendoutRating ) {
        Float oldCogenLPSendoutRating = cogenLPSendoutRating;
        cogenLPSendoutRating = newCogenLPSendoutRating;
        boolean oldCogenLPSendoutRatingESet = cogenLPSendoutRatingESet;
        cogenLPSendoutRatingESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING,
                        oldCogenLPSendoutRating, cogenLPSendoutRating, !oldCogenLPSendoutRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCogenLPSendoutRating() {
        Float oldCogenLPSendoutRating = cogenLPSendoutRating;
        boolean oldCogenLPSendoutRatingESet = cogenLPSendoutRatingESet;
        cogenLPSendoutRating = COGEN_LP_SENDOUT_RATING_EDEFAULT;
        cogenLPSendoutRatingESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING,
                        oldCogenLPSendoutRating, COGEN_LP_SENDOUT_RATING_EDEFAULT, oldCogenLPSendoutRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCogenLPSendoutRating() {
        return cogenLPSendoutRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getCogenLPSteamRating() {
        return cogenLPSteamRating;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setCogenLPSteamRating( Float newCogenLPSteamRating ) {
        Float oldCogenLPSteamRating = cogenLPSteamRating;
        cogenLPSteamRating = newCogenLPSteamRating;
        boolean oldCogenLPSteamRatingESet = cogenLPSteamRatingESet;
        cogenLPSteamRatingESet = true;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.SET, CimPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING,
                        oldCogenLPSteamRating, cogenLPSteamRating, !oldCogenLPSteamRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetCogenLPSteamRating() {
        Float oldCogenLPSteamRating = cogenLPSteamRating;
        boolean oldCogenLPSteamRatingESet = cogenLPSteamRatingESet;
        cogenLPSteamRating = COGEN_LP_STEAM_RATING_EDEFAULT;
        cogenLPSteamRatingESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING,
                        oldCogenLPSteamRating, COGEN_LP_STEAM_RATING_EDEFAULT, oldCogenLPSteamRatingESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetCogenLPSteamRating() {
        return cogenLPSteamRatingESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getRatedP() {
        return ratedP;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setRatedP( Float newRatedP ) {
        Float oldRatedP = ratedP;
        ratedP = newRatedP;
        boolean oldRatedPESet = ratedPESet;
        ratedPESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.COGENERATION_PLANT__RATED_P, oldRatedP, ratedP, !oldRatedPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetRatedP() {
        Float oldRatedP = ratedP;
        boolean oldRatedPESet = ratedPESet;
        ratedP = RATED_P_EDEFAULT;
        ratedPESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.COGENERATION_PLANT__RATED_P, oldRatedP, RATED_P_EDEFAULT, oldRatedPESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetRatedP() {
        return ratedPESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< ThermalGeneratingUnit > getThermalGeneratingUnits() {
        if( thermalGeneratingUnits == null ) {
            thermalGeneratingUnits = new EObjectWithInverseResolvingEList.Unsettable< ThermalGeneratingUnit >(
                    ThermalGeneratingUnit.class, this, CimPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS,
                    CimPackage.THERMAL_GENERATING_UNIT__COGENERATION_PLANT );
        }
        return thermalGeneratingUnits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetThermalGeneratingUnits() {
        if( thermalGeneratingUnits != null ) ( ( InternalEList.Unsettable< ? > ) thermalGeneratingUnits ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetThermalGeneratingUnits() {
        return thermalGeneratingUnits != null && ( ( InternalEList.Unsettable< ? > ) thermalGeneratingUnits ).isSet();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public SteamSendoutSchedule getSteamSendoutSchedule() {
        return steamSendoutSchedule;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSteamSendoutSchedule( SteamSendoutSchedule newSteamSendoutSchedule,
            NotificationChain msgs ) {
        SteamSendoutSchedule oldSteamSendoutSchedule = steamSendoutSchedule;
        steamSendoutSchedule = newSteamSendoutSchedule;
        boolean oldSteamSendoutScheduleESet = steamSendoutScheduleESet;
        steamSendoutScheduleESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, oldSteamSendoutSchedule,
                    newSteamSendoutSchedule, !oldSteamSendoutScheduleESet );
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
    public void setSteamSendoutSchedule( SteamSendoutSchedule newSteamSendoutSchedule ) {
        if( newSteamSendoutSchedule != steamSendoutSchedule ) {
            NotificationChain msgs = null;
            if( steamSendoutSchedule != null ) msgs = ( ( InternalEObject ) steamSendoutSchedule ).eInverseRemove( this,
                    CimPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, SteamSendoutSchedule.class, msgs );
            if( newSteamSendoutSchedule != null )
                msgs = ( ( InternalEObject ) newSteamSendoutSchedule ).eInverseAdd( this,
                        CimPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, SteamSendoutSchedule.class, msgs );
            msgs = basicSetSteamSendoutSchedule( newSteamSendoutSchedule, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSteamSendoutScheduleESet = steamSendoutScheduleESet;
            steamSendoutScheduleESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, newSteamSendoutSchedule,
                    newSteamSendoutSchedule, !oldSteamSendoutScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSteamSendoutSchedule( NotificationChain msgs ) {
        SteamSendoutSchedule oldSteamSendoutSchedule = steamSendoutSchedule;
        steamSendoutSchedule = null;
        boolean oldSteamSendoutScheduleESet = steamSendoutScheduleESet;
        steamSendoutScheduleESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, oldSteamSendoutSchedule, null,
                    oldSteamSendoutScheduleESet );
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
    public void unsetSteamSendoutSchedule() {
        if( steamSendoutSchedule != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) steamSendoutSchedule ).eInverseRemove( this,
                    CimPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, SteamSendoutSchedule.class, msgs );
            msgs = basicUnsetSteamSendoutSchedule( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSteamSendoutScheduleESet = steamSendoutScheduleESet;
            steamSendoutScheduleESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE, null, null, oldSteamSendoutScheduleESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSteamSendoutSchedule() {
        return steamSendoutScheduleESet;
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
        case CimPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getThermalGeneratingUnits() )
                    .basicAdd( otherEnd, msgs );
        case CimPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
            if( steamSendoutSchedule != null ) msgs = ( ( InternalEObject ) steamSendoutSchedule ).eInverseRemove( this,
                    CimPackage.STEAM_SENDOUT_SCHEDULE__COGENERATION_PLANT, SteamSendoutSchedule.class, msgs );
            return basicSetSteamSendoutSchedule( ( SteamSendoutSchedule ) otherEnd, msgs );
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
        case CimPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
            return ( ( InternalEList< ? > ) getThermalGeneratingUnits() ).basicRemove( otherEnd, msgs );
        case CimPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
            return basicUnsetSteamSendoutSchedule( msgs );
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
        case CimPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING:
            return getCogenHPSendoutRating();
        case CimPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING:
            return getCogenHPSteamRating();
        case CimPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING:
            return getCogenLPSendoutRating();
        case CimPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING:
            return getCogenLPSteamRating();
        case CimPackage.COGENERATION_PLANT__RATED_P:
            return getRatedP();
        case CimPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
            return getThermalGeneratingUnits();
        case CimPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
            return getSteamSendoutSchedule();
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
        case CimPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING:
            setCogenHPSendoutRating( ( Float ) newValue );
            return;
        case CimPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING:
            setCogenHPSteamRating( ( Float ) newValue );
            return;
        case CimPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING:
            setCogenLPSendoutRating( ( Float ) newValue );
            return;
        case CimPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING:
            setCogenLPSteamRating( ( Float ) newValue );
            return;
        case CimPackage.COGENERATION_PLANT__RATED_P:
            setRatedP( ( Float ) newValue );
            return;
        case CimPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
            getThermalGeneratingUnits().clear();
            getThermalGeneratingUnits().addAll( ( Collection< ? extends ThermalGeneratingUnit > ) newValue );
            return;
        case CimPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
            setSteamSendoutSchedule( ( SteamSendoutSchedule ) newValue );
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
        case CimPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING:
            unsetCogenHPSendoutRating();
            return;
        case CimPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING:
            unsetCogenHPSteamRating();
            return;
        case CimPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING:
            unsetCogenLPSendoutRating();
            return;
        case CimPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING:
            unsetCogenLPSteamRating();
            return;
        case CimPackage.COGENERATION_PLANT__RATED_P:
            unsetRatedP();
            return;
        case CimPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
            unsetThermalGeneratingUnits();
            return;
        case CimPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
            unsetSteamSendoutSchedule();
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
        case CimPackage.COGENERATION_PLANT__COGEN_HP_SENDOUT_RATING:
            return isSetCogenHPSendoutRating();
        case CimPackage.COGENERATION_PLANT__COGEN_HP_STEAM_RATING:
            return isSetCogenHPSteamRating();
        case CimPackage.COGENERATION_PLANT__COGEN_LP_SENDOUT_RATING:
            return isSetCogenLPSendoutRating();
        case CimPackage.COGENERATION_PLANT__COGEN_LP_STEAM_RATING:
            return isSetCogenLPSteamRating();
        case CimPackage.COGENERATION_PLANT__RATED_P:
            return isSetRatedP();
        case CimPackage.COGENERATION_PLANT__THERMAL_GENERATING_UNITS:
            return isSetThermalGeneratingUnits();
        case CimPackage.COGENERATION_PLANT__STEAM_SENDOUT_SCHEDULE:
            return isSetSteamSendoutSchedule();
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
        result.append( " (cogenHPSendoutRating: " );
        if( cogenHPSendoutRatingESet )
            result.append( cogenHPSendoutRating );
        else
            result.append( "<unset>" );
        result.append( ", cogenHPSteamRating: " );
        if( cogenHPSteamRatingESet )
            result.append( cogenHPSteamRating );
        else
            result.append( "<unset>" );
        result.append( ", cogenLPSendoutRating: " );
        if( cogenLPSendoutRatingESet )
            result.append( cogenLPSendoutRating );
        else
            result.append( "<unset>" );
        result.append( ", cogenLPSteamRating: " );
        if( cogenLPSteamRatingESet )
            result.append( cogenLPSteamRating );
        else
            result.append( "<unset>" );
        result.append( ", ratedP: " );
        if( ratedPESet )
            result.append( ratedP );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //CogenerationPlantImpl
