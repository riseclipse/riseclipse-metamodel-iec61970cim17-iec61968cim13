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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapChanger;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TapSchedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tap Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TapScheduleImpl#getTapChanger <em>Tap Changer</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TapScheduleImpl extends SeasonDayTypeScheduleImpl implements TapSchedule {
    /**
     * The cached value of the '{@link #getTapChanger() <em>Tap Changer</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTapChanger()
     * @generated
     * @ordered
     */
    protected TapChanger tapChanger;

    /**
     * This is true if the Tap Changer reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean tapChangerESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TapScheduleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTapSchedule();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public TapChanger getTapChanger() {
        return tapChanger;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetTapChanger( TapChanger newTapChanger, NotificationChain msgs ) {
        TapChanger oldTapChanger = tapChanger;
        tapChanger = newTapChanger;
        boolean oldTapChangerESet = tapChangerESet;
        tapChangerESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TAP_SCHEDULE__TAP_CHANGER, oldTapChanger, newTapChanger, !oldTapChangerESet );
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
    public void setTapChanger( TapChanger newTapChanger ) {
        if( newTapChanger != tapChanger ) {
            NotificationChain msgs = null;
            if( tapChanger != null ) msgs = ( ( InternalEObject ) tapChanger ).eInverseRemove( this,
                    CimPackage.TAP_CHANGER__TAP_SCHEDULES, TapChanger.class, msgs );
            if( newTapChanger != null ) msgs = ( ( InternalEObject ) newTapChanger ).eInverseAdd( this,
                    CimPackage.TAP_CHANGER__TAP_SCHEDULES, TapChanger.class, msgs );
            msgs = basicSetTapChanger( newTapChanger, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTapChangerESet = tapChangerESet;
            tapChangerESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TAP_SCHEDULE__TAP_CHANGER, newTapChanger, newTapChanger, !oldTapChangerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetTapChanger( NotificationChain msgs ) {
        TapChanger oldTapChanger = tapChanger;
        tapChanger = null;
        boolean oldTapChangerESet = tapChangerESet;
        tapChangerESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TAP_SCHEDULE__TAP_CHANGER, oldTapChanger, null, oldTapChangerESet );
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
    public void unsetTapChanger() {
        if( tapChanger != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) tapChanger ).eInverseRemove( this, CimPackage.TAP_CHANGER__TAP_SCHEDULES,
                    TapChanger.class, msgs );
            msgs = basicUnsetTapChanger( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldTapChangerESet = tapChangerESet;
            tapChangerESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TAP_SCHEDULE__TAP_CHANGER, null, null, oldTapChangerESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetTapChanger() {
        return tapChangerESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TAP_SCHEDULE__TAP_CHANGER:
            if( tapChanger != null ) msgs = ( ( InternalEObject ) tapChanger ).eInverseRemove( this,
                    CimPackage.TAP_CHANGER__TAP_SCHEDULES, TapChanger.class, msgs );
            return basicSetTapChanger( ( TapChanger ) otherEnd, msgs );
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
        case CimPackage.TAP_SCHEDULE__TAP_CHANGER:
            return basicUnsetTapChanger( msgs );
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
        case CimPackage.TAP_SCHEDULE__TAP_CHANGER:
            return getTapChanger();
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
        case CimPackage.TAP_SCHEDULE__TAP_CHANGER:
            setTapChanger( ( TapChanger ) newValue );
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
        case CimPackage.TAP_SCHEDULE__TAP_CHANGER:
            unsetTapChanger();
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
        case CimPackage.TAP_SCHEDULE__TAP_CHANGER:
            return isSetTapChanger();
        }
        return super.eIsSet( featureID );
    }

} //TapScheduleImpl
