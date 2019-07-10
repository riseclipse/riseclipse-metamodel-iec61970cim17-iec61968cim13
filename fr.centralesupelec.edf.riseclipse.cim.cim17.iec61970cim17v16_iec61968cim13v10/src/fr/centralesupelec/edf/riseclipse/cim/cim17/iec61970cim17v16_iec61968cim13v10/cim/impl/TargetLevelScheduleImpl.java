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
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.Reservoir;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.TargetLevelSchedule;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Target Level Schedule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TargetLevelScheduleImpl#getHighLevelLimit <em>High Level Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TargetLevelScheduleImpl#getLowLevelLimit <em>Low Level Limit</em>}</li>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.TargetLevelScheduleImpl#getReservoir <em>Reservoir</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TargetLevelScheduleImpl extends CurveImpl implements TargetLevelSchedule {
    /**
     * The default value of the '{@link #getHighLevelLimit() <em>High Level Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighLevelLimit()
     * @generated
     * @ordered
     */
    protected static final Float HIGH_LEVEL_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getHighLevelLimit() <em>High Level Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getHighLevelLimit()
     * @generated
     * @ordered
     */
    protected Float highLevelLimit = HIGH_LEVEL_LIMIT_EDEFAULT;

    /**
     * This is true if the High Level Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean highLevelLimitESet;

    /**
     * The default value of the '{@link #getLowLevelLimit() <em>Low Level Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowLevelLimit()
     * @generated
     * @ordered
     */
    protected static final Float LOW_LEVEL_LIMIT_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getLowLevelLimit() <em>Low Level Limit</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getLowLevelLimit()
     * @generated
     * @ordered
     */
    protected Float lowLevelLimit = LOW_LEVEL_LIMIT_EDEFAULT;

    /**
     * This is true if the Low Level Limit attribute has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean lowLevelLimitESet;

    /**
     * The cached value of the '{@link #getReservoir() <em>Reservoir</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getReservoir()
     * @generated
     * @ordered
     */
    protected Reservoir reservoir;

    /**
     * This is true if the Reservoir reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean reservoirESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TargetLevelScheduleImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getTargetLevelSchedule();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getHighLevelLimit() {
        return highLevelLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setHighLevelLimit( Float newHighLevelLimit ) {
        Float oldHighLevelLimit = highLevelLimit;
        highLevelLimit = newHighLevelLimit;
        boolean oldHighLevelLimitESet = highLevelLimitESet;
        highLevelLimitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT,
                    oldHighLevelLimit, highLevelLimit, !oldHighLevelLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetHighLevelLimit() {
        Float oldHighLevelLimit = highLevelLimit;
        boolean oldHighLevelLimitESet = highLevelLimitESet;
        highLevelLimit = HIGH_LEVEL_LIMIT_EDEFAULT;
        highLevelLimitESet = false;
        if( eNotificationRequired() ) eNotify(
                new ENotificationImpl( this, Notification.UNSET, CimPackage.TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT,
                        oldHighLevelLimit, HIGH_LEVEL_LIMIT_EDEFAULT, oldHighLevelLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetHighLevelLimit() {
        return highLevelLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Float getLowLevelLimit() {
        return lowLevelLimit;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void setLowLevelLimit( Float newLowLevelLimit ) {
        Float oldLowLevelLimit = lowLevelLimit;
        lowLevelLimit = newLowLevelLimit;
        boolean oldLowLevelLimitESet = lowLevelLimitESet;
        lowLevelLimitESet = true;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT,
                    oldLowLevelLimit, lowLevelLimit, !oldLowLevelLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void unsetLowLevelLimit() {
        Float oldLowLevelLimit = lowLevelLimit;
        boolean oldLowLevelLimitESet = lowLevelLimitESet;
        lowLevelLimit = LOW_LEVEL_LIMIT_EDEFAULT;
        lowLevelLimitESet = false;
        if( eNotificationRequired() )
            eNotify( new ENotificationImpl( this, Notification.UNSET, CimPackage.TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT,
                    oldLowLevelLimit, LOW_LEVEL_LIMIT_EDEFAULT, oldLowLevelLimitESet ) );
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetLowLevelLimit() {
        return lowLevelLimitESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Reservoir getReservoir() {
        return reservoir;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetReservoir( Reservoir newReservoir, NotificationChain msgs ) {
        Reservoir oldReservoir = reservoir;
        reservoir = newReservoir;
        boolean oldReservoirESet = reservoirESet;
        reservoirESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, oldReservoir, newReservoir, !oldReservoirESet );
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
    public void setReservoir( Reservoir newReservoir ) {
        if( newReservoir != reservoir ) {
            NotificationChain msgs = null;
            if( reservoir != null ) msgs = ( ( InternalEObject ) reservoir ).eInverseRemove( this,
                    CimPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, Reservoir.class, msgs );
            if( newReservoir != null ) msgs = ( ( InternalEObject ) newReservoir ).eInverseAdd( this,
                    CimPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, Reservoir.class, msgs );
            msgs = basicSetReservoir( newReservoir, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReservoirESet = reservoirESet;
            reservoirESet = true;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.SET,
                    CimPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, newReservoir, newReservoir, !oldReservoirESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetReservoir( NotificationChain msgs ) {
        Reservoir oldReservoir = reservoir;
        reservoir = null;
        boolean oldReservoirESet = reservoirESet;
        reservoirESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, oldReservoir, null, oldReservoirESet );
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
    public void unsetReservoir() {
        if( reservoir != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) reservoir ).eInverseRemove( this, CimPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE,
                    Reservoir.class, msgs );
            msgs = basicUnsetReservoir( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldReservoirESet = reservoirESet;
            reservoirESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR, null, null, oldReservoirESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetReservoir() {
        return reservoirESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
            if( reservoir != null ) msgs = ( ( InternalEObject ) reservoir ).eInverseRemove( this,
                    CimPackage.RESERVOIR__TARGET_LEVEL_SCHEDULE, Reservoir.class, msgs );
            return basicSetReservoir( ( Reservoir ) otherEnd, msgs );
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
        case CimPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
            return basicUnsetReservoir( msgs );
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
        case CimPackage.TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT:
            return getHighLevelLimit();
        case CimPackage.TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT:
            return getLowLevelLimit();
        case CimPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
            return getReservoir();
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
        case CimPackage.TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT:
            setHighLevelLimit( ( Float ) newValue );
            return;
        case CimPackage.TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT:
            setLowLevelLimit( ( Float ) newValue );
            return;
        case CimPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
            setReservoir( ( Reservoir ) newValue );
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
        case CimPackage.TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT:
            unsetHighLevelLimit();
            return;
        case CimPackage.TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT:
            unsetLowLevelLimit();
            return;
        case CimPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
            unsetReservoir();
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
        case CimPackage.TARGET_LEVEL_SCHEDULE__HIGH_LEVEL_LIMIT:
            return isSetHighLevelLimit();
        case CimPackage.TARGET_LEVEL_SCHEDULE__LOW_LEVEL_LIMIT:
            return isSetLowLevelLimit();
        case CimPackage.TARGET_LEVEL_SCHEDULE__RESERVOIR:
            return isSetReservoir();
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
        result.append( " (highLevelLimit: " );
        if( highLevelLimitESet )
            result.append( highLevelLimit );
        else
            result.append( "<unset>" );
        result.append( ", lowLevelLimit: " );
        if( lowLevelLimitESet )
            result.append( lowLevelLimit );
        else
            result.append( "<unset>" );
        result.append( ')' );
        return result.toString();
    }

} //TargetLevelScheduleImpl
