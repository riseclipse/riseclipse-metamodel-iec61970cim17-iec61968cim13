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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConformLoadGroup;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.ConformLoadSchedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Conform Load Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.ConformLoadScheduleImpl#getConformLoadGroup <em>Conform Load Group</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConformLoadScheduleImpl extends SeasonDayTypeScheduleImpl implements ConformLoadSchedule {
    /**
     * The cached value of the '{@link #getConformLoadGroup() <em>Conform Load Group</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConformLoadGroup()
     * @generated
     * @ordered
     */
    protected ConformLoadGroup conformLoadGroup;

    /**
     * This is true if the Conform Load Group reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean conformLoadGroupESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ConformLoadScheduleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getConformLoadSchedule();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public ConformLoadGroup getConformLoadGroup() {
        return conformLoadGroup;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetConformLoadGroup( ConformLoadGroup newConformLoadGroup, NotificationChain msgs ) {
        ConformLoadGroup oldConformLoadGroup = conformLoadGroup;
        conformLoadGroup = newConformLoadGroup;
        boolean oldConformLoadGroupESet = conformLoadGroupESet;
        conformLoadGroupESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP, oldConformLoadGroup, newConformLoadGroup,
                    !oldConformLoadGroupESet );
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
    public void setConformLoadGroup( ConformLoadGroup newConformLoadGroup ) {
        if( newConformLoadGroup != conformLoadGroup ) {
            NotificationChain msgs = null;
            if( conformLoadGroup != null ) msgs = ( ( InternalEObject ) conformLoadGroup ).eInverseRemove( this,
                    CimPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES, ConformLoadGroup.class, msgs );
            if( newConformLoadGroup != null ) msgs = ( ( InternalEObject ) newConformLoadGroup ).eInverseAdd( this,
                    CimPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES, ConformLoadGroup.class, msgs );
            msgs = basicSetConformLoadGroup( newConformLoadGroup, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConformLoadGroupESet = conformLoadGroupESet;
            conformLoadGroupESet = true;
            if( eNotificationRequired() ) eNotify(
                    new ENotificationImpl( this, Notification.SET, CimPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP,
                            newConformLoadGroup, newConformLoadGroup, !oldConformLoadGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetConformLoadGroup( NotificationChain msgs ) {
        ConformLoadGroup oldConformLoadGroup = conformLoadGroup;
        conformLoadGroup = null;
        boolean oldConformLoadGroupESet = conformLoadGroupESet;
        conformLoadGroupESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP, oldConformLoadGroup, null,
                    oldConformLoadGroupESet );
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
    public void unsetConformLoadGroup() {
        if( conformLoadGroup != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) conformLoadGroup ).eInverseRemove( this,
                    CimPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES, ConformLoadGroup.class, msgs );
            msgs = basicUnsetConformLoadGroup( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldConformLoadGroupESet = conformLoadGroupESet;
            conformLoadGroupESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP, null, null, oldConformLoadGroupESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetConformLoadGroup() {
        return conformLoadGroupESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
            if( conformLoadGroup != null ) msgs = ( ( InternalEObject ) conformLoadGroup ).eInverseRemove( this,
                    CimPackage.CONFORM_LOAD_GROUP__CONFORM_LOAD_SCHEDULES, ConformLoadGroup.class, msgs );
            return basicSetConformLoadGroup( ( ConformLoadGroup ) otherEnd, msgs );
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
        case CimPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
            return basicUnsetConformLoadGroup( msgs );
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
        case CimPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
            return getConformLoadGroup();
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
        case CimPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
            setConformLoadGroup( ( ConformLoadGroup ) newValue );
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
        case CimPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
            unsetConformLoadGroup();
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
        case CimPackage.CONFORM_LOAD_SCHEDULE__CONFORM_LOAD_GROUP:
            return isSetConformLoadGroup();
        }
        return super.eIsSet( featureID );
    }

} //ConformLoadScheduleImpl
