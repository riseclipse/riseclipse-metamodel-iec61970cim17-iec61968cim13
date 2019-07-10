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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Season;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SeasonDayTypeSchedule;

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
 * An implementation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SeasonImpl#getEndDate <em>End Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SeasonImpl#getStartDate <em>Start Date</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SeasonImpl#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SeasonImpl extends IdentifiedObjectImpl implements Season {
    /**
     * The default value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDate()
     * @generated
     * @ordered
     */
    protected static final String END_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getEndDate() <em>End Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getEndDate()
     * @generated
     * @ordered
     */
    protected String endDate = END_DATE_EDEFAULT;

    /**
     * This is true if the End Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean endDateESet;

    /**
     * The default value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDate()
     * @generated
     * @ordered
     */
    protected static final String START_DATE_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getStartDate() <em>Start Date</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStartDate()
     * @generated
     * @ordered
     */
    protected String startDate = START_DATE_EDEFAULT;

    /**
     * This is true if the Start Date attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean startDateESet;

    /**
     * The cached value of the '{@link #getSeasonDayTypeSchedules() <em>Season Day Type Schedules</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSeasonDayTypeSchedules()
     * @generated
     * @ordered
     */
    protected EList< SeasonDayTypeSchedule > seasonDayTypeSchedules;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SeasonImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSeason();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getEndDate() {
        return endDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setEndDate( String newEndDate ) {
        String oldEndDate = endDate;
        endDate = newEndDate;
        boolean oldEndDateESet = endDateESet;
        endDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SEASON__END_DATE, oldEndDate, endDate, !oldEndDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetEndDate() {
        String oldEndDate = endDate;
        boolean oldEndDateESet = endDateESet;
        endDate = END_DATE_EDEFAULT;
        endDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SEASON__END_DATE, oldEndDate, END_DATE_EDEFAULT, oldEndDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetEndDate() {
        return endDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String getStartDate() {
        return startDate;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setStartDate( String newStartDate ) {
        String oldStartDate = startDate;
        startDate = newStartDate;
        boolean oldStartDateESet = startDateESet;
        startDateESet = true;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                CimPackage.SEASON__START_DATE, oldStartDate, startDate, !oldStartDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetStartDate() {
        String oldStartDate = startDate;
        boolean oldStartDateESet = startDateESet;
        startDate = START_DATE_EDEFAULT;
        startDateESet = false;
        if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                CimPackage.SEASON__START_DATE, oldStartDate, START_DATE_EDEFAULT, oldStartDateESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetStartDate() {
        return startDateESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public EList< SeasonDayTypeSchedule > getSeasonDayTypeSchedules() {
        if( seasonDayTypeSchedules == null ) {
            seasonDayTypeSchedules = new EObjectWithInverseResolvingEList.Unsettable< SeasonDayTypeSchedule >(
                    SeasonDayTypeSchedule.class, this, CimPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES,
                    CimPackage.SEASON_DAY_TYPE_SCHEDULE__SEASON );
        }
        return seasonDayTypeSchedules;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetSeasonDayTypeSchedules() {
        if( seasonDayTypeSchedules != null ) ( ( InternalEList.Unsettable< ? > ) seasonDayTypeSchedules ).unset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSeasonDayTypeSchedules() {
        return seasonDayTypeSchedules != null && ( ( InternalEList.Unsettable< ? > ) seasonDayTypeSchedules ).isSet();
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
        case CimPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
            return ( ( InternalEList< InternalEObject > ) ( InternalEList< ? > ) getSeasonDayTypeSchedules() )
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
        case CimPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
            return ( ( InternalEList< ? > ) getSeasonDayTypeSchedules() ).basicRemove( otherEnd, msgs );
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
        case CimPackage.SEASON__END_DATE:
            return getEndDate();
        case CimPackage.SEASON__START_DATE:
            return getStartDate();
        case CimPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
            return getSeasonDayTypeSchedules();
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
        case CimPackage.SEASON__END_DATE:
            setEndDate( ( String ) newValue );
            return;
        case CimPackage.SEASON__START_DATE:
            setStartDate( ( String ) newValue );
            return;
        case CimPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
            getSeasonDayTypeSchedules().clear();
            getSeasonDayTypeSchedules().addAll( ( Collection< ? extends SeasonDayTypeSchedule > ) newValue );
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
        case CimPackage.SEASON__END_DATE:
            unsetEndDate();
            return;
        case CimPackage.SEASON__START_DATE:
            unsetStartDate();
            return;
        case CimPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
            unsetSeasonDayTypeSchedules();
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
        case CimPackage.SEASON__END_DATE:
            return isSetEndDate();
        case CimPackage.SEASON__START_DATE:
            return isSetStartDate();
        case CimPackage.SEASON__SEASON_DAY_TYPE_SCHEDULES:
            return isSetSeasonDayTypeSchedules();
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
        result.append( " (endDate: " );
        if( endDateESet )
            result.append( endDate );
        else
            result.append( "<unset>" );
        result.append( ", startDate: " );
        if( startDateESet )
            result.append( startDate );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //SeasonImpl
