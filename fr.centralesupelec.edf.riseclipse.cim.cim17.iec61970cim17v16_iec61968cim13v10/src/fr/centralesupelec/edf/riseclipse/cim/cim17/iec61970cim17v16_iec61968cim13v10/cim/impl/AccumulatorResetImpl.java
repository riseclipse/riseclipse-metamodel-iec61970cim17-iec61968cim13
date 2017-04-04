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

import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorReset;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.AccumulatorValue;
import fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.CimPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Accumulator Reset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link fr.centralesupelec.edf.riseclipse.cim.cim17.iec61970cim17v16_iec61968cim13v10.cim.impl.AccumulatorResetImpl#getAccumulatorValue <em>Accumulator Value</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AccumulatorResetImpl extends ControlImpl implements AccumulatorReset {
    /**
     * The cached value of the '{@link #getAccumulatorValue() <em>Accumulator Value</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAccumulatorValue()
     * @generated
     * @ordered
     */
    protected AccumulatorValue accumulatorValue;

    /**
     * This is true if the Accumulator Value reference has been set.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    protected boolean accumulatorValueESet;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected AccumulatorResetImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return CimPackage.eINSTANCE.getAccumulatorReset();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public AccumulatorValue getAccumulatorValue() {
        return accumulatorValue;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetAccumulatorValue( AccumulatorValue newAccumulatorValue, NotificationChain msgs ) {
        AccumulatorValue oldAccumulatorValue = accumulatorValue;
        accumulatorValue = newAccumulatorValue;
        boolean oldAccumulatorValueESet = accumulatorValueESet;
        accumulatorValueESet = true;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.SET,
                    CimPackage.ACCUMULATOR_RESET__ACCUMULATOR_VALUE, oldAccumulatorValue, newAccumulatorValue,
                    !oldAccumulatorValueESet );
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
    public void setAccumulatorValue( AccumulatorValue newAccumulatorValue ) {
        if( newAccumulatorValue != accumulatorValue ) {
            NotificationChain msgs = null;
            if( accumulatorValue != null ) msgs = ( ( InternalEObject ) accumulatorValue ).eInverseRemove( this,
                    CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR_RESET, AccumulatorValue.class, msgs );
            if( newAccumulatorValue != null ) msgs = ( ( InternalEObject ) newAccumulatorValue ).eInverseAdd( this,
                    CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR_RESET, AccumulatorValue.class, msgs );
            msgs = basicSetAccumulatorValue( newAccumulatorValue, msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAccumulatorValueESet = accumulatorValueESet;
            accumulatorValueESet = true;
            if( eNotificationRequired() )
                eNotify( new ENotificationImpl( this, Notification.SET, CimPackage.ACCUMULATOR_RESET__ACCUMULATOR_VALUE,
                        newAccumulatorValue, newAccumulatorValue, !oldAccumulatorValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicUnsetAccumulatorValue( NotificationChain msgs ) {
        AccumulatorValue oldAccumulatorValue = accumulatorValue;
        accumulatorValue = null;
        boolean oldAccumulatorValueESet = accumulatorValueESet;
        accumulatorValueESet = false;
        if( eNotificationRequired() ) {
            ENotificationImpl notification = new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACCUMULATOR_RESET__ACCUMULATOR_VALUE, oldAccumulatorValue, null,
                    oldAccumulatorValueESet );
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
    public void unsetAccumulatorValue() {
        if( accumulatorValue != null ) {
            NotificationChain msgs = null;
            msgs = ( ( InternalEObject ) accumulatorValue ).eInverseRemove( this,
                    CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR_RESET, AccumulatorValue.class, msgs );
            msgs = basicUnsetAccumulatorValue( msgs );
            if( msgs != null ) msgs.dispatch();
        }
        else {
            boolean oldAccumulatorValueESet = accumulatorValueESet;
            accumulatorValueESet = false;
            if( eNotificationRequired() ) eNotify( new ENotificationImpl( this, Notification.UNSET,
                    CimPackage.ACCUMULATOR_RESET__ACCUMULATOR_VALUE, null, null, oldAccumulatorValueESet ) );
        }
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean isSetAccumulatorValue() {
        return accumulatorValueESet;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd( InternalEObject otherEnd, int featureID, NotificationChain msgs ) {
        switch( featureID ) {
        case CimPackage.ACCUMULATOR_RESET__ACCUMULATOR_VALUE:
            if( accumulatorValue != null ) msgs = ( ( InternalEObject ) accumulatorValue ).eInverseRemove( this,
                    CimPackage.ACCUMULATOR_VALUE__ACCUMULATOR_RESET, AccumulatorValue.class, msgs );
            return basicSetAccumulatorValue( ( AccumulatorValue ) otherEnd, msgs );
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
        case CimPackage.ACCUMULATOR_RESET__ACCUMULATOR_VALUE:
            return basicUnsetAccumulatorValue( msgs );
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
        case CimPackage.ACCUMULATOR_RESET__ACCUMULATOR_VALUE:
            return getAccumulatorValue();
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
        case CimPackage.ACCUMULATOR_RESET__ACCUMULATOR_VALUE:
            setAccumulatorValue( ( AccumulatorValue ) newValue );
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
        case CimPackage.ACCUMULATOR_RESET__ACCUMULATOR_VALUE:
            unsetAccumulatorValue();
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
        case CimPackage.ACCUMULATOR_RESET__ACCUMULATOR_VALUE:
            return isSetAccumulatorValue();
        }
        return super.eIsSet( featureID );
    }

} //AccumulatorResetImpl
