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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonConformLoadGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.NonConformLoadSchedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Conform Load Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.NonConformLoadScheduleImpl#getNonConformLoadGroup <em>Non Conform Load Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NonConformLoadScheduleImpl extends SeasonDayTypeScheduleImpl implements NonConformLoadSchedule {
    /**
     * The cached value of the '{@link #getNonConformLoadGroup() <em>Non Conform Load Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getNonConformLoadGroup()
     * @generated
     * @ordered
     */
    protected NonConformLoadGroup nonConformLoadGroup;

    /**
     * This is true if the Non Conform Load Group reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean nonConformLoadGroupESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected NonConformLoadScheduleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getNonConformLoadSchedule();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NonConformLoadGroup getNonConformLoadGroup() {
        return nonConformLoadGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetNonConformLoadGroup( NonConformLoadGroup newNonConformLoadGroup,
            NotificationChain msgs ) {
        NonConformLoadGroup oldNonConformLoadGroup = nonConformLoadGroup;
        nonConformLoadGroup = newNonConformLoadGroup;
        boolean oldNonConformLoadGroupESet = nonConformLoadGroupESet;
        nonConformLoadGroupESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP, oldNonConformLoadGroup,
                    newNonConformLoadGroup, !oldNonConformLoadGroupESet );
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
    public void setNonConformLoadGroup( NonConformLoadGroup newNonConformLoadGroup ) {
        if( newNonConformLoadGroup != nonConformLoadGroup ) {
            NotificationChain msgs = null;
            if( nonConformLoadGroup != null ) msgs = ( ( InternalEObject ) nonConformLoadGroup ).eInverseRemove( this,
                    CimPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES, NonConformLoadGroup.class, msgs );
            if( newNonConformLoadGroup != null )
                msgs = ( ( InternalEObject ) newNonConformLoadGroup ).eInverseAdd( this,
                        CimPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES, NonConformLoadGroup.class,
                        msgs );
            msgs = basicSetNonConformLoadGroup( newNonConformLoadGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldNonConformLoadGroupESet = nonConformLoadGroupESet;
            nonConformLoadGroupESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP, newNonConformLoadGroup,
                    newNonConformLoadGroup, !oldNonConformLoadGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetNonConformLoadGroup( NotificationChain msgs ) {
        NonConformLoadGroup oldNonConformLoadGroup = nonConformLoadGroup;
        nonConformLoadGroup = null;
        boolean oldNonConformLoadGroupESet = nonConformLoadGroupESet;
        nonConformLoadGroupESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP, oldNonConformLoadGroup, null,
                    oldNonConformLoadGroupESet );
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
    public void unsetNonConformLoadGroup() {
        if( nonConformLoadGroup != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) nonConformLoadGroup ).eInverseRemove( this,
                    CimPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES, NonConformLoadGroup.class, msgs );
            msgs = basicUnsetNonConformLoadGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldNonConformLoadGroupESet = nonConformLoadGroupESet;
            nonConformLoadGroupESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP, null, null,
                    oldNonConformLoadGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetNonConformLoadGroup() {
        return nonConformLoadGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
            if( nonConformLoadGroup != null ) msgs = ( ( InternalEObject ) nonConformLoadGroup ).eInverseRemove( this,
                    CimPackage.NON_CONFORM_LOAD_GROUP__NON_CONFORM_LOAD_SCHEDULES, NonConformLoadGroup.class, msgs );
            return basicSetNonConformLoadGroup( ( NonConformLoadGroup ) otherEnd, msgs );
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
        case CimPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
            return basicUnsetNonConformLoadGroup( msgs );
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
        case CimPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
            return getNonConformLoadGroup();
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
        case CimPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
            setNonConformLoadGroup( ( NonConformLoadGroup ) newValue );
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
        case CimPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
            unsetNonConformLoadGroup();
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
        case CimPackage.NON_CONFORM_LOAD_SCHEDULE__NON_CONFORM_LOAD_GROUP:
            return isSetNonConformLoadGroup();
        }
        return super.eIsSet( featureID );
    }

} //NonConformLoadScheduleImpl
