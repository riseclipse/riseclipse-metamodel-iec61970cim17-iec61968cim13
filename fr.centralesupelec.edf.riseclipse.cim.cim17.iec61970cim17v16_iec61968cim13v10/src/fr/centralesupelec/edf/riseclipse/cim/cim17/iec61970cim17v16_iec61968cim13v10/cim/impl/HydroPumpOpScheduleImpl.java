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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPump;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.HydroPumpOpSchedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Hydro Pump Op Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.HydroPumpOpScheduleImpl#getHydroPump <em>Hydro Pump</em>}</li>
 * </ul>
 *
 * @generated
 */
public class HydroPumpOpScheduleImpl extends RegularIntervalScheduleImpl implements HydroPumpOpSchedule {
    /**
     * The cached value of the '{@link #getHydroPump() <em>Hydro Pump</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHydroPump()
     * @generated
     * @ordered
     */
    protected HydroPump hydroPump;

    /**
     * This is true if the Hydro Pump reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean hydroPumpESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected HydroPumpOpScheduleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getHydroPumpOpSchedule();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public HydroPump getHydroPump() {
        return hydroPump;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetHydroPump( HydroPump newHydroPump, NotificationChain msgs ) {
        HydroPump oldHydroPump = hydroPump;
        hydroPump = newHydroPump;
        boolean oldHydroPumpESet = hydroPumpESet;
        hydroPumpESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, oldHydroPump, newHydroPump, !oldHydroPumpESet );
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
    public void setHydroPump( HydroPump newHydroPump ) {
        if( newHydroPump != hydroPump ) {
            NotificationChain msgs = null;
            if( hydroPump != null ) msgs = ( ( InternalEObject ) hydroPump ).eInverseRemove( this,
                    CimPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, HydroPump.class, msgs );
            if( newHydroPump != null ) msgs = ( ( InternalEObject ) newHydroPump ).eInverseAdd( this,
                    CimPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, HydroPump.class, msgs );
            msgs = basicSetHydroPump( newHydroPump, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroPumpESet = hydroPumpESet;
            hydroPumpESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, newHydroPump, newHydroPump, !oldHydroPumpESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetHydroPump( NotificationChain msgs ) {
        HydroPump oldHydroPump = hydroPump;
        hydroPump = null;
        boolean oldHydroPumpESet = hydroPumpESet;
        hydroPumpESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, oldHydroPump, null, oldHydroPumpESet );
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
    public void unsetHydroPump() {
        if( hydroPump != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) hydroPump ).eInverseRemove( this,
                    CimPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, HydroPump.class, msgs );
            msgs = basicUnsetHydroPump( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldHydroPumpESet = hydroPumpESet;
            hydroPumpESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP, null, null, oldHydroPumpESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHydroPump() {
        return hydroPumpESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
            if( hydroPump != null ) msgs = ( ( InternalEObject ) hydroPump ).eInverseRemove( this,
                    CimPackage.HYDRO_PUMP__HYDRO_PUMP_OP_SCHEDULE, HydroPump.class, msgs );
            return basicSetHydroPump( ( HydroPump ) otherEnd, msgs );
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
        case CimPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
            return basicUnsetHydroPump( msgs );
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
        case CimPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
            return getHydroPump();
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
        case CimPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
            setHydroPump( ( HydroPump ) newValue );
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
        case CimPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
            unsetHydroPump();
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
        case CimPackage.HYDRO_PUMP_OP_SCHEDULE__HYDRO_PUMP:
            return isSetHydroPump();
        }
        return super.eIsSet( featureID );
    }

} //HydroPumpOpScheduleImpl
