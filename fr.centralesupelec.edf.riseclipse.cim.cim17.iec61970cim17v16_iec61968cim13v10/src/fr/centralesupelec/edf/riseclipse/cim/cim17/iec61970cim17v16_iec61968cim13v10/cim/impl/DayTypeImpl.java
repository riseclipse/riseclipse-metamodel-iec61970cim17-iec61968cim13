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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.DayType;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SeasonDayTypeSchedule;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Day Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.DayTypeImpl#getSeasonDayTypeSchedules <em>Season Day Type Schedules</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DayTypeImpl extends IdentifiedObjectImpl implements DayType {
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
    protected DayTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getDayType();
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
                    SeasonDayTypeSchedule.class, this, CimPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES,
                    CimPackage.SEASON_DAY_TYPE_SCHEDULE__DAY_TYPE );
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
        case CimPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
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
        case CimPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
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
        case CimPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
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
        case CimPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
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
        case CimPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
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
        case CimPackage.DAY_TYPE__SEASON_DAY_TYPE_SCHEDULES:
            return isSetSeasonDayTypeSchedules();
        }
        return super.eIsSet( featureID );
    }

} //DayTypeImpl
