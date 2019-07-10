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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DayType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Season;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SeasonDayTypeSchedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Season Day Type Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SeasonDayTypeScheduleImpl#getDayType <em>Day Type</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SeasonDayTypeScheduleImpl#getSeason <em>Season</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeasonDayTypeScheduleImpl extends RegularIntervalScheduleImpl implements SeasonDayTypeSchedule {
    /**
     * The cached value of the '{@link #getDayType() <em>Day Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDayType()
     * @generated
     * @ordered
     */
    protected DayType dayType;

    /**
     * This is true if the Day Type reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean dayTypeESet;

    /**
     * The cached value of the '{@link #getSeason() <em>Season</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeason()
     * @generated
     * @ordered
     */
    protected Season season;

    /**
     * This is true if the Season reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean seasonESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SeasonDayTypeScheduleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSeasonDayTypeSchedule();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public DayType getDayType() {
        return dayType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetDayType( DayType newDayType, NotificationChain msgs ) {
        DayType oldDayType = dayType;
        dayType = newDayType;
        boolean oldDayTypeESet = dayTypeESet;
        dayTypeESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE, oldDayType, newDayType, !oldDayTypeESet );
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
    public void setDayType( DayType newDayType ) {
        if( newDayType != dayType ) {
            NotificationChain msgs = null;
            if( dayType != null ) msgs = ( ( InternalEObject ) dayType ).eInverseRemove( this,
                    CimPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES, DayType.class, msgs );
            if( newDayType != null ) msgs = ( ( InternalEObject ) newDayType ).eInverseAdd( this,
                    CimPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES, DayType.class, msgs );
            msgs = basicSetDayType( newDayType, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDayTypeESet = dayTypeESet;
            dayTypeESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE, newDayType, newDayType, !oldDayTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetDayType( NotificationChain msgs ) {
        DayType oldDayType = dayType;
        dayType = null;
        boolean oldDayTypeESet = dayTypeESet;
        dayTypeESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE, oldDayType, null, oldDayTypeESet );
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
    public void unsetDayType() {
        if( dayType != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) dayType ).eInverseRemove( this, CimPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES,
                    DayType.class, msgs );
            msgs = basicUnsetDayType( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldDayTypeESet = dayTypeESet;
            dayTypeESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE, null, null, oldDayTypeESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetDayType() {
        return dayTypeESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Season getSeason() {
        return season;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSeason( Season newSeason, NotificationChain msgs ) {
        Season oldSeason = season;
        season = newSeason;
        boolean oldSeasonESet = seasonESet;
        seasonESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON, oldSeason, newSeason, !oldSeasonESet );
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
    public void setSeason( Season newSeason ) {
        if( newSeason != season ) {
            NotificationChain msgs = null;
            if( season != null ) msgs = ( ( InternalEObject ) season ).eInverseRemove( this,
                    CimPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES, Season.class, msgs );
            if( newSeason != null ) msgs = ( ( InternalEObject ) newSeason ).eInverseAdd( this,
                    CimPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES, Season.class, msgs );
            msgs = basicSetSeason( newSeason, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSeasonESet = seasonESet;
            seasonESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON, newSeason, newSeason, !oldSeasonESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSeason( NotificationChain msgs ) {
        Season oldSeason = season;
        season = null;
        boolean oldSeasonESet = seasonESet;
        seasonESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON, oldSeason, null, oldSeasonESet );
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
    public void unsetSeason() {
        if( season != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) season ).eInverseRemove( this, CimPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES,
                    Season.class, msgs );
            msgs = basicUnsetSeason( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSeasonESet = seasonESet;
            seasonESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON, null, null, oldSeasonESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSeason() {
        return seasonESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
            if( dayType != null ) msgs = ( ( InternalEObject ) dayType ).eInverseRemove( this,
                    CimPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES, DayType.class, msgs );
            return basicSetDayType( ( DayType ) otherEnd, msgs );
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
            if( season != null ) msgs = ( ( InternalEObject ) season ).eInverseRemove( this,
                    CimPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES, Season.class, msgs );
            return basicSetSeason( ( Season ) otherEnd, msgs );
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
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
            return basicUnsetDayType( msgs );
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
            return basicUnsetSeason( msgs );
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
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
            return getDayType();
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
            return getSeason();
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
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
            setDayType( ( DayType ) newValue );
            return;
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
            setSeason( ( Season ) newValue );
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
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
            unsetDayType();
            return;
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
            unsetSeason();
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
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE:
            return isSetDayType();
        case CimPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON:
            return isSetSeason();
        }
        return super.eIsSet( featureID );
    }

} //SeasonDayTypeScheduleImpl
