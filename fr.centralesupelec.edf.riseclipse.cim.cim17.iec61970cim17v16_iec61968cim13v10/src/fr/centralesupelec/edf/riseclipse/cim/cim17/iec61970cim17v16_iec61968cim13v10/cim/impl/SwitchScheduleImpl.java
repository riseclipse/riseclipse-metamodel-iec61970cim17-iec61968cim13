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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Switch;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.SwitchSchedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.SwitchScheduleImpl#getSwitch <em>Switch</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchScheduleImpl extends SeasonDayTypeScheduleImpl implements SwitchSchedule {
    /**
     * The cached value of the '{@link #getSwitch() <em>Switch</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSwitch()
     * @generated
     * @ordered
     */
    protected Switch switch_;

    /**
     * This is true if the Switch reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean switchESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SwitchScheduleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getSwitchSchedule();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Switch getSwitch() {
        return switch_;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetSwitch( Switch newSwitch, NotificationChain msgs ) {
        Switch oldSwitch = switch_;
        switch_ = newSwitch;
        boolean oldSwitchESet = switchESet;
        switchESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCH_SCHEDULE__SWITCH, oldSwitch, newSwitch, !oldSwitchESet );
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
    public void setSwitch( Switch newSwitch ) {
        if( newSwitch != switch_ ) {
            NotificationChain msgs = null;
            if( switch_ != null ) msgs = ( ( InternalEObject ) switch_ ).eInverseRemove( this,
                    CimPackage.SWITCH__SWITCH_SCHEDULES, Switch.class, msgs );
            if( newSwitch != null ) msgs = ( ( InternalEObject ) newSwitch ).eInverseAdd( this,
                    CimPackage.SWITCH__SWITCH_SCHEDULES, Switch.class, msgs );
            msgs = basicSetSwitch( newSwitch, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchESet = switchESet;
            switchESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.SWITCH_SCHEDULE__SWITCH, newSwitch, newSwitch, !oldSwitchESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetSwitch( NotificationChain msgs ) {
        Switch oldSwitch = switch_;
        switch_ = null;
        boolean oldSwitchESet = switchESet;
        switchESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH_SCHEDULE__SWITCH, oldSwitch, null, oldSwitchESet );
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
    public void unsetSwitch() {
        if( switch_ != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) switch_ ).eInverseRemove( this, CimPackage.SWITCH__SWITCH_SCHEDULES,
                    Switch.class, msgs );
            msgs = basicUnsetSwitch( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldSwitchESet = switchESet;
            switchESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.SWITCH_SCHEDULE__SWITCH, null, null, oldSwitchESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetSwitch() {
        return switchESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.SWITCH_SCHEDULE__SWITCH:
            if( switch_ != null ) msgs = ( ( InternalEObject ) switch_ ).eInverseRemove( this,
                    CimPackage.SWITCH__SWITCH_SCHEDULES, Switch.class, msgs );
            return basicSetSwitch( ( Switch ) otherEnd, msgs );
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
        case CimPackage.SWITCH_SCHEDULE__SWITCH:
            return basicUnsetSwitch( msgs );
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
        case CimPackage.SWITCH_SCHEDULE__SWITCH:
            return getSwitch();
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
        case CimPackage.SWITCH_SCHEDULE__SWITCH:
            setSwitch( ( Switch ) newValue );
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
        case CimPackage.SWITCH_SCHEDULE__SWITCH:
            unsetSwitch();
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
        case CimPackage.SWITCH_SCHEDULE__SWITCH:
            return isSetSwitch();
        }
        return super.eIsSet( featureID );
    }

} //SwitchScheduleImpl
